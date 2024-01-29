import React from 'react'
import APIService from '../service/APIService'

export default class TransporterComponent extends React.Component {

    constructor(props) {
        super(props)
    
        this.state = {
             transporters: []
        }
    }
    
    componentDidMount(){
        APIService.getTransporters().then((data) => {
            this.setState({ transporters: data.data })
            console.log(this.state.data)
          })
          .catch(function (ex) {
              console.log('Response parsing failed. Error: ', ex);
          });;
    }

    render() {
        return (
            
            <div>
                <h2 className="text-center">TFL API Response</h2>
                <table className="table table-striped table-dark table-hover">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>operation type</th>
                            <th>vehicle id</th>
                            <th>naptan id</th>
                            <th>station name</th>
                            <th>line id</th>
                            <th>line name</th>
                            <th>platform name</th>
                            <th>direction</th>
                            <th>bearing</th>
                            <th>destination naptan id</th>
                            <th>destination name</th>
                            <th>timestamp</th>
                            <th>time to station</th>
                            <th>current location</th>
                            <th>towards</th>
                            <th>expected arrival</th>
                            <th>time to live</th>
                            <th>mode name</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        {   Array.isArray(this.state.transporters) ? 
                        this.state.transporters.map(transporter => {return (
                            <tr key={transporter.identityId}>
                                <td>{transporter.identityId}</td>
                                <td>{transporter.operationType}</td>
                                <td>{transporter.vehicleId}</td>
                                <td>{transporter.naptanId}</td>
                                <td>{transporter.stationName}</td>
                                <td>{transporter.lineId}</td>
                                <td>{transporter.lineName}</td>
                                <td>{transporter.platformName}</td>
                                <td>{transporter.direction}</td>
                                <td>{transporter.bearing}</td>
                                <td>{transporter.destinationNaptanId}</td>
                                <td>{transporter.destinationName}</td>
                                <td>{transporter.timestamp}</td>
                                <td>{transporter.timeToStation}</td>
                                <td>{transporter.currentLocation}</td>
                                <td>{transporter.towards}</td>
                                <td>{transporter.expectedArrival}</td>
                                <td>{transporter.timeToLive}</td>
                                <td>{transporter.modeName}</td>
                                </tr>
                            )})
                        : null} 
                    </tbody>
                </table>
            </div>
        )
    }
}
import axios from 'axios';

const TRANSPORTER_URL = "http://localhost:8080/transporters";
const GET_ALL_URL = "http://localhost:8080/get-all";
class APIService {
    
    getTransporters(){
        return axios.get(TRANSPORTER_URL);
    }

    getAll(){
        return axios.get(GET_ALL_URL);
    }

    deleteTransporter(identityId){
        return axios.delete(GET_ALL_URL + '/delete/' + identityId);
    }

}

export default new APIService();
package no.uio.inf5750.assignment1_rambg.dao;

import no.uio.inf5750.assignment1_rambg.model.Message;

public interface MessageDao

{

    int save( Message message );

    Message get( int id );

    Message getLast();    

}
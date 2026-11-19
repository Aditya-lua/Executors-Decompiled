/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bed94
 */

SSL_SESSION * SSL_CTX_sess_get_get_cb(ssl_st *ssl,uchar *Data,int len,int *copy)

{
  return *(SSL_SESSION **)&ssl->packet_length;
}


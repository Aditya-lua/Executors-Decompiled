/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bed74
 */

int SSL_CTX_sess_get_new_cb(ssl_st *ssl,SSL_SESSION *sess)

{
  undefined4 uVar1;
  
  uVar1 = ssl->init_num;
  return uVar1;
}


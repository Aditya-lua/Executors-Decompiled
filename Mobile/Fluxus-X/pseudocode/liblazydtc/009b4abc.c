/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4abc
 */

int SSL_peek(SSL *ssl,void *buf,int num)

{
  int iVar1;
  int local_18 [2];
  
  if (num < 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x7e2,"SSL_peek");
    ERR_set_error(0x14,0x10f,0);
    local_18[0] = -1;
  }
  else {
    iVar1 = FUN_009b4b24(ssl,buf,(long)num,local_18);
    if (iVar1 < 1) {
      local_18[0] = iVar1;
    }
  }
  return local_18[0];
}


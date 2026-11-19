/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b48b0
 */

int SSL_read(SSL *ssl,void *buf,int num)

{
  int iVar1;
  int local_18 [2];
  
  if (num < 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x76c,"SSL_read");
    ERR_set_error(0x14,0x10f,0);
    local_18[0] = -1;
  }
  else {
    iVar1 = ssl_read_internal(ssl,buf,(long)num,local_18);
    if (iVar1 < 1) {
      local_18[0] = iVar1;
    }
  }
  return local_18[0];
}


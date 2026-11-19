/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54c78
 */

void ERR_error_string_n(ulong e,char *buf,size_t len)

{
  ossl_err_string_int(e,&DAT_002ab32c,buf,len);
  return;
}


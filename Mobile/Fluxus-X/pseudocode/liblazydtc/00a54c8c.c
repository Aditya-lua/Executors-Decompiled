/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54c8c
 */

char * ERR_error_string(ulong e,char *buf)

{
  char *pcVar1;
  
  pcVar1 = &DAT_00d21a38;
  if (buf != (char *)0x0) {
    pcVar1 = buf;
  }
  ossl_err_string_int(e,&DAT_002ab32c,pcVar1,0x100);
  return pcVar1;
}


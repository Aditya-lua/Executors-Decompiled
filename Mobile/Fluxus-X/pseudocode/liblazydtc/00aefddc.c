/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aefddc
 */

int UI_UTIL_read_pw_string(char *buf,int length,char *prompt,int verify)

{
  int iVar1;
  char acStack_420 [1024];
  
  if (0x3ff < length) {
    length = 0x400;
  }
  iVar1 = UI_UTIL_read_pw(buf,acStack_420,length,prompt,verify);
  OPENSSL_cleanse(acStack_420,0x400);
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a842f8
 */

char * ossl_safe_getenv(char *param_1)

{
  int iVar1;
  char *pcVar2;
  
  iVar1 = OPENSSL_issetugid();
  if (iVar1 == 0) {
    pcVar2 = getenv(param_1);
    return pcVar2;
  }
  return (char *)0x0;
}


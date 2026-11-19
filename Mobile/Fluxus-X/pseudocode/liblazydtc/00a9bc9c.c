/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9bc9c
 */

int OPENSSL_strcasecmp(char *param_1,undefined1 *param_2)

{
  char cVar1;
  int iVar2;
  int iVar3;
  
  do {
    iVar2 = ossl_tolower(*param_1);
    iVar3 = ossl_tolower(*param_2);
    if (iVar2 - iVar3 != 0) {
      return iVar2 - iVar3;
    }
    cVar1 = *param_1;
    param_2 = param_2 + 1;
    param_1 = param_1 + 1;
  } while (cVar1 != '\0');
  return 0;
}


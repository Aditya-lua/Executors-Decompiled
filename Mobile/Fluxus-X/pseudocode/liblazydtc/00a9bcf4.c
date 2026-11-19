/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9bcf4
 */

int OPENSSL_strncasecmp(long param_1,long param_2,ulong param_3)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  
  if (param_3 != 0) {
    uVar3 = 0;
    do {
      iVar1 = ossl_tolower(*(undefined1 *)(param_1 + uVar3));
      iVar2 = ossl_tolower(*(undefined1 *)(param_2 + uVar3));
      if (iVar1 - iVar2 != 0) {
        return iVar1 - iVar2;
      }
    } while ((*(char *)(param_1 + uVar3) != '\0') && (uVar3 = uVar3 + 1, uVar3 < param_3));
  }
  return 0;
}


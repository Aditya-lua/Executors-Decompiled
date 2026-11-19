/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0b48
 */

int * ssl3_comp_find(long param_1,int param_2)

{
  int iVar1;
  int *piVar2;
  int iVar3;
  
  if (((param_1 != 0) && (param_2 != 0)) && (iVar1 = OPENSSL_sk_num(param_1), 0 < iVar1)) {
    iVar3 = 0;
    do {
      piVar2 = (int *)OPENSSL_sk_value(param_1,iVar3);
      if (*piVar2 == param_2) {
        return piVar2;
      }
      iVar3 = iVar3 + 1;
    } while (iVar3 < iVar1);
  }
  return (int *)0x0;
}


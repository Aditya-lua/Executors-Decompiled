/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65a74
 */

long * evp_keymgmt_util_find_operation_cache(long param_1,long param_2,uint param_3)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  int iVar4;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x78));
  if (0 < iVar1) {
    iVar4 = 0;
    do {
      plVar2 = (long *)OPENSSL_sk_value(*(undefined8 *)(param_1 + 0x78),iVar4);
      if ((param_3 & (*(uint *)(plVar2 + 2) ^ 0xffffffff)) == 0) {
        lVar3 = *plVar2;
        if (lVar3 == param_2) {
          return plVar2;
        }
        if ((*(int *)(param_2 + 4) == *(int *)(lVar3 + 4)) &&
           (*(long *)(param_2 + 0x18) == *(long *)(lVar3 + 0x18))) {
          return plVar2;
        }
      }
      iVar4 = iVar4 + 1;
    } while (iVar4 < iVar1);
  }
  return (long *)0x0;
}


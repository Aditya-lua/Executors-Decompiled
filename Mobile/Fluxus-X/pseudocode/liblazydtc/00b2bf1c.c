/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2bf1c
 */

undefined8
FUN_00b2bf1c(int *param_1,void *param_2,size_t *param_3,ulong param_4,void *param_5,ulong param_6)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 != 0) {
    if ((*param_1 == 0) && (uVar3 = *(ulong *)(param_1 + 2), uVar3 != 0)) {
      if (param_6 < uVar3) {
        return 0;
      }
      lVar1 = param_6 - uVar3;
      param_6 = param_6 - uVar3;
      *(long *)(param_1 + 4) = (long)param_5 + lVar1;
    }
    uVar2 = 0;
    if (param_6 <= param_4) {
      if (param_5 != param_2) {
        memcpy(param_2,param_5,param_6);
      }
      uVar2 = 1;
      *param_3 = param_6;
    }
  }
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f084
 */

undefined8 OSSL_PARAM_get_BN(long param_1,long *param_2)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = 0;
  if ((((param_1 != 0) && (param_2 != (long *)0x0)) && (uVar1 = 0, *(int *)(param_1 + 8) == 2)) &&
     (lVar2 = BN_native2bn(*(undefined8 *)(param_1 + 0x10),*(undefined4 *)(param_1 + 0x18),*param_2)
     , uVar1 = 0, lVar2 != 0)) {
    *param_2 = lVar2;
    uVar1 = 1;
  }
  return uVar1;
}


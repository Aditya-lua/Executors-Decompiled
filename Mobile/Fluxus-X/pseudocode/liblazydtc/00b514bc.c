/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b514bc
 */

undefined8 FUN_00b514bc(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (param_1 != 0) {
    lVar1 = OSSL_PARAM_locate_const(param_2,&DAT_002a3e83);
    if (lVar1 != 0) {
      uVar2 = FUN_00b51d34(param_1,param_2);
      return uVar2;
    }
    uVar2 = 1;
  }
  return uVar2;
}


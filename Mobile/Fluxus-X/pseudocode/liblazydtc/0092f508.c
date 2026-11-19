/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092f508
 */

void FUN_0092f508(long param_1)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x20);
  if (lVar1 != 0) {
    FUN_00907e2c(lVar1,param_1);
    FUN_00925d80(lVar1 + 0x3d0,param_1 + 0x40,0);
  }
  *(undefined8 *)(param_1 + 0x20) = 0;
  FUN_0092ba18(param_1);
  return;
}


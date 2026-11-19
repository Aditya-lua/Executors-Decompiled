/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00956fac
 */

void FUN_00956fac(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x20);
  uVar1 = FUN_009252a8(param_3);
  FUN_009453ec(param_1,lVar2 + 0x428,&DAT_002b6c62,uVar1);
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009327ec
 */

void FUN_009327ec(long param_1,undefined8 param_2)

{
  undefined1 auVar1 [16];
  
  auVar1 = FUN_00941cb8();
  *(undefined1 (*) [16])(param_1 + 0x20) = auVar1;
  FUN_00932728(param_1,param_2);
  return;
}


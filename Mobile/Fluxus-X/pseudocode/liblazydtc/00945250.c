/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945250
 */

void FUN_00945250(undefined8 *param_1)

{
  undefined1 auVar1 [16];
  
  *param_1 = 0;
  auVar1 = FUN_00941cb8();
  *(undefined1 (*) [16])(param_1 + 5) = auVar1;
  *(undefined1 *)(param_1 + 1) = 1;
  FUN_00904528(param_1 + 8,0x10000);
  FUN_00904528(param_1 + 0xc,0x10000);
  return;
}


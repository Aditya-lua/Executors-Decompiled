/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd964
 */

undefined1  [16] FUN_008dd964(ulong param_1,ulong param_2,ulong param_3,ulong param_4)

{
  undefined1 auVar1 [16];
  
  auVar1._8_8_ = param_4 ^ param_2;
  auVar1._0_8_ = param_3 ^ param_1;
  return auVar1;
}


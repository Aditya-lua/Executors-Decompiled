/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087e5cc
 */

undefined1  [16] FUN_0087e5cc(int param_1)

{
  undefined1 auVar1 [16];
  
  auVar1._8_8_ = *(undefined8 *)(&DAT_00363ef0 + (long)param_1 * 8);
  auVar1._0_8_ = *(ulong *)(&DAT_00363a88 + (long)param_1 * 8) |
                 *(ulong *)(&DAT_00363620 + (long)param_1 * 8);
  return auVar1;
}


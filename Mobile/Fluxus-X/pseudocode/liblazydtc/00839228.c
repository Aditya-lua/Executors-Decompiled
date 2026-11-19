/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00839228
 */

undefined8 FUN_00839228(undefined8 param_1)

{
  undefined8 uVar1;
  
  uVar1 = *(undefined8 *)(DAT_00cca938 + 8);
  FUN_008aaf04(uVar1,0xffffd8ee);
  FUN_008aa66c(uVar1,param_1,1);
  return 1;
}


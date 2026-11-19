/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b8d4
 */

undefined8 FUN_00c2b8d4(void)

{
  ulong uVar1;
  
  uVar1 = fpsr;
  fpsr = uVar1 | 0x10;
  return 0;
}


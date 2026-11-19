/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b8b8
 */

undefined4 FUN_00c2b8b8(void)

{
  ulong uVar1;
  
  uVar1 = fpcr;
  return *(undefined4 *)(&DAT_0029c9f0 + (uVar1 >> 0x16 & 3) * 4);
}


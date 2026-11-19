/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b47a8
 */

undefined8 FUN_008b47a8(long param_1,int param_2)

{
  if (*(ushort *)(param_1 + 0x2a) < *(ushort *)(param_1 + 0x28)) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"attempt to yield across metamethod/C-call boundary");
  }
  *(undefined1 *)(param_1 + 3) = 1;
  *(long *)(param_1 + 0x70) = *(long *)(param_1 + 0x68) + (long)param_2 * -0x10;
  return 0xffffffff;
}


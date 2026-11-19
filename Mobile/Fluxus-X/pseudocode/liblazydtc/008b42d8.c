/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b42d8
 */

void FUN_008b42d8(long param_1)

{
  if (*(ushort *)(param_1 + 0x28) == 200) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"C stack overflow");
  }
  if (0xe0 < *(ushort *)(param_1 + 0x28)) {
                    /* WARNING: Subroutine does not return */
    FUN_008b3f9c(param_1,5);
  }
  return;
}


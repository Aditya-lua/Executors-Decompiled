/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2a5c8
 */

void FUN_00c2a5c8(ulong param_1,long param_2)

{
  __cxa_begin_catch(param_2);
  if ((param_1 & 1) != 0) {
    FUN_00c0d774(*(undefined8 *)(param_2 + -0x38));
  }
                    /* WARNING: Subroutine does not return */
  std::terminate();
}


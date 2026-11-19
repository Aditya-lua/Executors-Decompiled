/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d774
 */

void FUN_00c0d774(code *param_1)

{
                    /* try { // try from 00c0d780 to 00c0d78f has its CatchHandler @ 00c0d790 */
  (*param_1)();
                    /* WARNING: Subroutine does not return */
  FUN_00c0de94("terminate_handler unexpectedly returned");
}


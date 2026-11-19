/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc276c
 */

/* std::rethrow_exception(std::exception_ptr) */

void std::rethrow_exception(undefined8 *param_1)

{
  __cxa_rethrow_primary_exception(*param_1);
                    /* WARNING: Subroutine does not return */
  terminate();
}


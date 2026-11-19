/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4330
 */

bool SSL_waiting_for_async(long param_1)

{
  return *(long *)(param_1 + 0x1d28) != 0;
}


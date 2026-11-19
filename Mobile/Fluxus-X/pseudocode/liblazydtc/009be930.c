/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be930
 */

bool SSL_SESSION_has_ticket(long param_1)

{
  return *(long *)(param_1 + 0x340) != 0;
}


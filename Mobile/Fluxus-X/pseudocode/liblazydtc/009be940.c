/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be940
 */

undefined8 SSL_SESSION_get_ticket_lifetime_hint(long param_1)

{
  return *(undefined8 *)(param_1 + 0x348);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be8c4
 */

undefined8 SSL_SESSION_get0_hostname(long param_1)

{
  return *(undefined8 *)(param_1 + 0x330);
}


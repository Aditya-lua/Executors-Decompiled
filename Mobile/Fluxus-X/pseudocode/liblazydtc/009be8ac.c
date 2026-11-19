/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be8ac
 */

undefined8 SSL_SESSION_get0_cipher(long param_1)

{
  return *(undefined8 *)(param_1 + 0x2f8);
}


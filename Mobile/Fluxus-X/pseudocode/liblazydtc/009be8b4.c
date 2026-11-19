/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be8b4
 */

undefined8 SSL_SESSION_set_cipher(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x2f8) = param_2;
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb434
 */

void PKCS12_decrypt_skey_ex(long param_1)

{
  PKCS8_decrypt_ex(*(undefined8 *)(param_1 + 8));
  return;
}


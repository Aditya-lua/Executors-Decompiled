/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2b64
 */

undefined8 PKCS8_pkey_get0_attrs(long param_1)

{
  return *(undefined8 *)(param_1 + 0x18);
}


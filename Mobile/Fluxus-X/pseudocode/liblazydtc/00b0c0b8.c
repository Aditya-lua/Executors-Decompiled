/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0c0b8
 */

void X509_REQ_get0_pubkey(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  X509_PUBKEY_get0(*(undefined8 *)(param_1 + 0x28));
  return;
}


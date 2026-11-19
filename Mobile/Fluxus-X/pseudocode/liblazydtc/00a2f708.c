/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2f708
 */

void EC_KEY_set_enc_flags(EC_KEY *eckey,uint flags)

{
  *(uint *)(eckey + 0x30) = flags;
  return;
}


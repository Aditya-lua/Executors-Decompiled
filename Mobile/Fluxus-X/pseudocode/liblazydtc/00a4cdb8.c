/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4cdb8
 */

undefined8 OSSL_DECODER_CTX_get_num_decoders(long param_1)

{
  undefined8 uVar1;
  
  if ((param_1 == 0) || (*(long *)(param_1 + 0x18) == 0)) {
    return 0;
  }
  uVar1 = OPENSSL_sk_num();
  return uVar1;
}


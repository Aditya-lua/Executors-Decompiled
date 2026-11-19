/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ee94
 */

undefined4 ossl_decoder_get_number(long param_1)

{
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x215,"ossl_decoder_get_number");
    ERR_set_error(0x3c,0xc0102,0);
    return 0;
  }
  return *(undefined4 *)(param_1 + 8);
}


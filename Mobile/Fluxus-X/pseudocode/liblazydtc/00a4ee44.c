/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4ee44
 */

undefined8 ossl_decoder_parsed_properties(long param_1)

{
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x20b,"ossl_decoder_parsed_properties");
    ERR_set_error(0x3c,0xc0102,0);
    return 0;
  }
  return *(undefined8 *)(param_1 + 0x20);
}


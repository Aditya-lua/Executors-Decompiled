/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4d378
 */

undefined8 OSSL_DECODER_CTX_set_input_type(undefined8 *param_1,undefined8 param_2)

{
  if (param_1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0xb8,"OSSL_DECODER_CTX_set_input_type");
    ERR_set_error(0x3c,0xc0102,0);
    return 0;
  }
  *param_1 = param_2;
  return 1;
}


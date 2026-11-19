/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a621a0
 */

undefined8 OSSL_ENCODER_CTX_set_output_type(long param_1,long param_2)

{
  if ((param_1 == 0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0xa7,"OSSL_ENCODER_CTX_set_output_type");
    ERR_set_error(0x3b,0xc0102,0);
    return 0;
  }
  *(long *)(param_1 + 8) = param_2;
  return 1;
}


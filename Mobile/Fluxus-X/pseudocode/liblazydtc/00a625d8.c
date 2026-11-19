/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a625d8
 */

undefined8 OSSL_ENCODER_CTX_set_construct(long param_1,undefined8 param_2)

{
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x14f,"OSSL_ENCODER_CTX_set_construct");
    ERR_set_error(0x3b,0xc0102,0);
    return 0;
  }
  *(undefined8 *)(param_1 + 0x20) = param_2;
  return 1;
}


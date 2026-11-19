/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60db8
 */

undefined8 OSSL_ENCODER_get0_provider(undefined8 *param_1)

{
  if (param_1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x1ff,"OSSL_ENCODER_get0_provider");
    ERR_set_error(0x3b,0xc0102,0);
    return 0;
  }
  return *param_1;
}


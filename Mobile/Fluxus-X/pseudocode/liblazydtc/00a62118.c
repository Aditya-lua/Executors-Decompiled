/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a62118
 */

undefined8 OSSL_ENCODER_CTX_set_selection(int *param_1,int param_2)

{
  undefined4 uVar1;
  
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x96,"OSSL_ENCODER_CTX_set_selection");
    uVar1 = 0xc0102;
  }
  else {
    if (param_2 != 0) {
      *param_1 = param_2;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x9b,"OSSL_ENCODER_CTX_set_selection");
    uVar1 = 0x80106;
  }
  ERR_set_error(0x3b,uVar1,0);
  return 0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4d1c4
 */

undefined4 OSSL_DECODER_from_fp(undefined8 param_1,void *param_2)

{
  undefined4 uVar1;
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x7c,"bio_from_file");
    ERR_set_error(0x3c,0x80020,0);
    uVar1 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,param_2);
    uVar1 = OSSL_DECODER_from_bio(param_1,bp);
  }
  BIO_free(bp);
  return uVar1;
}


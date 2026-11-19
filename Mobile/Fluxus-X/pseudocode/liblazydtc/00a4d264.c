/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4d264
 */

bool OSSL_DECODER_from_data(undefined8 param_1,undefined8 *param_2,long *param_3)

{
  int iVar1;
  BIO *bp;
  long lVar2;
  bool bVar3;
  
  if (((param_2 == (undefined8 *)0x0) || (param_3 == (long *)0x0)) ||
     ((void *)*param_2 == (void *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_lib.c",0x97,"OSSL_DECODER_from_data");
    ERR_set_error(0x3c,0xc0102,0);
    bVar3 = false;
  }
  else {
    bp = BIO_new_mem_buf((void *)*param_2,(int)*param_3);
    iVar1 = OSSL_DECODER_from_bio(param_1,bp);
    bVar3 = iVar1 != 0;
    if (bVar3) {
      lVar2 = BIO_ctrl(bp,3,0,param_2);
      *param_3 = lVar2;
    }
    BIO_free(bp);
  }
  return bVar3;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61fd8
 */

undefined8 OSSL_ENCODER_to_data(undefined8 param_1,size_t *param_2,size_t *param_3)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  long lVar2;
  size_t sVar3;
  undefined8 uVar4;
  size_t *local_38;
  
  local_38 = (size_t *)0x0;
  if (param_3 == (size_t *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_lib.c",0x68,"OSSL_ENCODER_to_data");
    ERR_set_error(0x3b,0xc0102,0);
    return 0;
  }
  type = BIO_s_mem();
  bp = BIO_new(type);
  if (((bp == (BIO *)0x0) || (iVar1 = OSSL_ENCODER_to_bio(param_1,bp), iVar1 == 0)) ||
     (lVar2 = BIO_ctrl(bp,0x73,0,&local_38), lVar2 < 1)) {
    uVar4 = 0;
  }
  else {
    if (param_2 == (size_t *)0x0) {
      *param_3 = *local_38;
    }
    else {
      if (*param_2 == 0) {
        sVar3 = *local_38;
      }
      else {
        uVar4 = 0;
        sVar3 = *param_3 - *local_38;
        if (*param_3 < *local_38) goto LAB_00a620f8;
      }
      *param_3 = sVar3;
      if ((void *)*param_2 == (void *)0x0) {
        *param_2 = local_38[1];
        local_38[1] = 0;
      }
      else {
        memcpy((void *)*param_2,(void *)local_38[1],*local_38);
        *param_2 = *param_2 + *local_38;
      }
    }
    uVar4 = 1;
  }
LAB_00a620f8:
  BIO_free(bp);
  return uVar4;
}


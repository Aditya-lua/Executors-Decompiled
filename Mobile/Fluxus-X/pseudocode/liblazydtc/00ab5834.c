/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5834
 */

int PEM_write_PUBKEY_ex(FILE *param_1,void *param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = OSSL_ENCODER_CTX_new_for_pkey(param_2,0x86,&DAT_002b956f,"SubjectPublicKeyInfo",param_4);
  iVar1 = OSSL_ENCODER_CTX_get_num_encoders();
  if (iVar1 == 0) {
    OSSL_ENCODER_CTX_free(uVar2);
    iVar1 = PEM_ASN1_write(i2d_PUBKEY,"PUBLIC KEY",param_1,param_2,(EVP_CIPHER *)0x0,(uchar *)0x0,0,
                           (undefined1 *)0x0,(void *)0x0);
  }
  else {
    iVar1 = OSSL_ENCODER_to_fp(uVar2,param_1);
    OSSL_ENCODER_CTX_free(uVar2);
  }
  return iVar1;
}


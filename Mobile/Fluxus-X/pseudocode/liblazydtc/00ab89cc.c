/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab89cc
 */

int PEM_write_bio_Parameters(BIO *bp,EVP_PKEY *x)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  char acStack_80 [80];
  
  uVar2 = OSSL_ENCODER_CTX_new_for_pkey(x,0x84,&DAT_002b956f,"type-specific",0);
  iVar1 = OSSL_ENCODER_CTX_get_num_encoders();
  if (iVar1 == 0) {
    OSSL_ENCODER_CTX_free(uVar2);
    lVar3 = *(long *)&x->references;
    if ((lVar3 == 0) || (*(long *)(lVar3 + 0x78) == 0)) {
      iVar1 = 0;
    }
    else {
      BIO_snprintf(acStack_80,0x50,"%s PARAMETERS",*(char **)(lVar3 + 0x10));
      iVar1 = PEM_ASN1_write_bio(*(undefined1 **)(*(long *)&x->references + 0x78),acStack_80,bp,x,
                                 (EVP_CIPHER *)0x0,(uchar *)0x0,0,(undefined1 *)0x0,(void *)0x0);
    }
  }
  else {
    iVar1 = OSSL_ENCODER_to_bio(uVar2,bp);
    OSSL_ENCODER_CTX_free(uVar2);
  }
  return iVar1;
}


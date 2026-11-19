/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab883c
 */

int PEM_write_bio_PrivateKey_traditional
              (BIO *param_1,EVP_PKEY *param_2,EVP_CIPHER *param_3,uchar *param_4,int param_5,
              undefined1 *param_6,void *param_7)

{
  int iVar1;
  long lVar2;
  char acStack_a0 [80];
  EVP_PKEY *local_48;
  
  local_48 = (EVP_PKEY *)0x0;
  if (param_2 != (EVP_PKEY *)0x0) {
    if (((((param_2->pkey).ptr != (char *)0x0) ||
         (param_2[1].attributes != (stack_st_X509_ATTRIBUTE *)0x0)) &&
        (*(long *)&param_2[1].save_parameters != 0)) &&
       (iVar1 = evp_pkey_copy_downgraded(&local_48,param_2), iVar1 != 0)) {
      param_2 = local_48;
    }
    lVar2 = *(long *)&param_2->references;
    if ((lVar2 != 0) && (*(long *)(lVar2 + 0xc0) != 0)) {
      BIO_snprintf(acStack_a0,0x50,"%s PRIVATE KEY",*(char **)(lVar2 + 0x10));
      iVar1 = PEM_ASN1_write_bio(i2d_PrivateKey,acStack_a0,param_1,param_2,param_3,param_4,param_5,
                                 param_6,param_7);
      EVP_PKEY_free(local_48);
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/pem/pem_pkey.c",0x165,"PEM_write_bio_PrivateKey_traditional");
    ERR_set_error(9,0x6e,0);
    EVP_PKEY_free(local_48);
  }
  return 0;
}


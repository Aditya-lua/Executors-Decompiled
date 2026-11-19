/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acdafc
 */

undefined8 FUN_00acdafc(EVP_PKEY *param_1,X509_PUBKEY *param_2)

{
  int iVar1;
  RSA *r;
  undefined8 uVar2;
  X509_ALGOR *local_38;
  int local_2c;
  uchar *puStack_28;
  
  iVar1 = X509_PUBKEY_get0_param((ASN1_OBJECT **)0x0,&puStack_28,&local_2c,&local_38,param_2);
  if (iVar1 == 0) {
    return 0;
  }
  r = d2i_RSAPublicKey((RSA **)0x0,&puStack_28,(long)local_2c);
  if (r == (RSA *)0x0) {
    return 0;
  }
  iVar1 = ossl_rsa_param_decode(r,local_38);
  if (iVar1 == 0) goto LAB_00acdbac;
  RSA_clear_flags(r,0xf000);
  if (**(int **)&param_1->references == 0x390) {
    uVar2 = 0x1000;
LAB_00acdb88:
    RSA_set_flags(r,uVar2);
  }
  else if (**(int **)&param_1->references == 6) {
    uVar2 = 0;
    goto LAB_00acdb88;
  }
  iVar1 = EVP_PKEY_assign(param_1,**(int **)&param_1->references,r);
  if (iVar1 != 0) {
    return 1;
  }
LAB_00acdbac:
  RSA_free(r);
  return 0;
}


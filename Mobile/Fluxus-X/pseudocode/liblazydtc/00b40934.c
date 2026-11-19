/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b40934
 */

int FUN_00b40934(undefined8 *param_1,undefined8 param_2,uint param_3,undefined8 param_4,
                code *param_5)

{
  bool bVar1;
  int iVar2;
  EVP_PKEY *pk;
  BIO *out;
  
  bVar1 = false;
  if ((param_3 & 1) == 0) {
    if ((param_3 >> 1 & 1) == 0) {
      return 0;
    }
    bVar1 = true;
  }
  pk = EVP_PKEY_new();
  if (((pk == (EVP_PKEY *)0x0) || (iVar2 = (*param_5)(pk,param_2), iVar2 == 0)) ||
     (out = (BIO *)ossl_bio_new_from_core_bio(*param_1,param_4), out == (BIO *)0x0)) {
    iVar2 = 0;
  }
  else {
    if (bVar1) {
      iVar2 = i2b_PublicKey_bio(out,pk);
    }
    else {
      iVar2 = i2b_PrivateKey_bio(out,pk);
    }
    BIO_free(out);
  }
  EVP_PKEY_free(pk);
  return iVar2;
}


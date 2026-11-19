/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b34ee4
 */

EVP_PKEY * FUN_00b34ee4(rsa_st *param_1,int param_2)

{
  int iVar1;
  EVP_PKEY *pkey;
  
  if (param_1 == (rsa_st *)0x0) {
    return (EVP_PKEY *)0x0;
  }
  if ((param_2 != 6) && (param_2 != 0x74)) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x52,"evp_pkey_new0_key");
    ERR_set_error(9,0xc0103,0);
    return (EVP_PKEY *)0x0;
  }
  pkey = EVP_PKEY_new();
  if (pkey == (EVP_PKEY *)0x0) {
LAB_00b34f54:
    if (param_2 == 0x74) {
LAB_00b34fcc:
      DSA_free((DSA *)param_1);
      goto joined_r0x00b34fd4;
    }
    if (param_2 != 6) goto joined_r0x00b34fd4;
  }
  else {
    if (param_2 == 0x74) {
      iVar1 = EVP_PKEY_set1_DSA(pkey,(dsa_st *)param_1);
      if (iVar1 == 0) {
        EVP_PKEY_free(pkey);
        pkey = (EVP_PKEY *)0x0;
      }
      goto LAB_00b34fcc;
    }
    if (param_2 != 6) goto LAB_00b34f54;
    iVar1 = EVP_PKEY_set1_RSA(pkey,param_1);
    if (iVar1 == 0) {
      EVP_PKEY_free(pkey);
      pkey = (EVP_PKEY *)0x0;
    }
  }
  RSA_free(param_1);
joined_r0x00b34fd4:
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pvkfmt.c",0x75,"evp_pkey_new0_key");
    ERR_set_error(9,0xc0100,0);
  }
  return pkey;
}


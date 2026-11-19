/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a98d64
 */

bool ossl_err_load_crypto_strings(void)

{
  int iVar1;
  
  iVar1 = ossl_err_load_ERR_strings();
  if ((((((iVar1 == 0) || (iVar1 = ossl_err_load_BN_strings(), iVar1 == 0)) ||
        (iVar1 = ossl_err_load_RSA_strings(), iVar1 == 0)) ||
       (((iVar1 = ossl_err_load_DH_strings(), iVar1 == 0 ||
         (iVar1 = ossl_err_load_EVP_strings(), iVar1 == 0)) ||
        ((iVar1 = ossl_err_load_BUF_strings(), iVar1 == 0 ||
         ((iVar1 = ossl_err_load_OBJ_strings(), iVar1 == 0 ||
          (iVar1 = ossl_err_load_PEM_strings(), iVar1 == 0)))))))) ||
      (iVar1 = ossl_err_load_DSA_strings(), iVar1 == 0)) ||
     (((((((iVar1 = ossl_err_load_X509_strings(), iVar1 == 0 ||
           (iVar1 = ossl_err_load_ASN1_strings(), iVar1 == 0)) ||
          (iVar1 = ossl_err_load_CONF_strings(), iVar1 == 0)) ||
         ((iVar1 = ossl_err_load_CRYPTO_strings(), iVar1 == 0 ||
          (iVar1 = ossl_err_load_COMP_strings(), iVar1 == 0)))) ||
        (iVar1 = ossl_err_load_EC_strings(), iVar1 == 0)) ||
       ((((iVar1 = ossl_err_load_BIO_strings(), iVar1 == 0 ||
          (iVar1 = ossl_err_load_PKCS7_strings(), iVar1 == 0)) ||
         (((iVar1 = ossl_err_load_X509V3_strings(), iVar1 == 0 ||
           (((iVar1 = ossl_err_load_PKCS12_strings(), iVar1 == 0 ||
             (iVar1 = ossl_err_load_RAND_strings(), iVar1 == 0)) ||
            (iVar1 = ossl_err_load_DSO_strings(), iVar1 == 0)))) ||
          (((iVar1 = ossl_err_load_TS_strings(), iVar1 == 0 ||
            (iVar1 = ossl_err_load_ENGINE_strings(), iVar1 == 0)) ||
           (iVar1 = ossl_err_load_HTTP_strings(), iVar1 == 0)))))) ||
        ((iVar1 = ossl_err_load_OCSP_strings(), iVar1 == 0 ||
         (iVar1 = ossl_err_load_UI_strings(), iVar1 == 0)))))) ||
      (((iVar1 = ossl_err_load_CMS_strings(), iVar1 == 0 ||
        (((iVar1 = ossl_err_load_CRMF_strings(), iVar1 == 0 ||
          (iVar1 = ossl_err_load_CMP_strings(), iVar1 == 0)) ||
         (iVar1 = ossl_err_load_CT_strings(), iVar1 == 0)))) ||
       (((iVar1 = ossl_err_load_ESS_strings(), iVar1 == 0 ||
         (iVar1 = ossl_err_load_ASYNC_strings(), iVar1 == 0)) ||
        ((iVar1 = ossl_err_load_OSSL_STORE_strings(), iVar1 == 0 ||
         (iVar1 = ossl_err_load_PROP_strings(), iVar1 == 0)))))))))) {
    return false;
  }
  iVar1 = ossl_err_load_PROV_strings();
  return iVar1 != 0;
}


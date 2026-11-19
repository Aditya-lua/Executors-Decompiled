/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f84e0
 */

undefined8 ossl_x509_algor_new_from_md(undefined8 *param_1,EVP_MD *param_2)

{
  int iVar1;
  X509_ALGOR *alg;
  
  if ((param_2 != (EVP_MD *)0x0) && (iVar1 = EVP_MD_is_a(param_2,&DAT_002d142e), iVar1 == 0)) {
    alg = (X509_ALGOR *)ASN1_item_new((ASN1_ITEM *)&DAT_00c59180);
    *param_1 = alg;
    if (alg == (X509_ALGOR *)0x0) {
      return 0;
    }
    X509_ALGOR_set_md(alg,param_2);
  }
  return 1;
}


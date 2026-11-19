/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acfb6c
 */

RSA_PSS_PARAMS * ossl_rsa_pss_decode(long param_1)

{
  undefined8 uVar1;
  RSA_PSS_PARAMS *a;
  X509_ALGOR *pXVar2;
  
  uVar1 = RSA_PSS_PARAMS_it();
  a = (RSA_PSS_PARAMS *)ASN1_TYPE_unpack_sequence(uVar1,*(undefined8 *)(param_1 + 8));
  if ((a != (RSA_PSS_PARAMS *)0x0) && (a->maskGenAlgorithm != (X509_ALGOR *)0x0)) {
    pXVar2 = (X509_ALGOR *)ossl_x509_algor_mgf1_decode();
    a[1].hashAlgorithm = pXVar2;
    if (pXVar2 == (X509_ALGOR *)0x0) {
      RSA_PSS_PARAMS_free(a);
      a = (RSA_PSS_PARAMS *)0x0;
    }
  }
  return a;
}


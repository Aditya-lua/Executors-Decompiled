/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f8538
 */

EVP_MD * ossl_x509_algor_get_md(undefined8 *param_1)

{
  int n;
  char *name;
  EVP_MD *pEVar1;
  
  if (param_1 == (undefined8 *)0x0) {
    pEVar1 = EVP_sha1();
    return pEVar1;
  }
  n = OBJ_obj2nid((ASN1_OBJECT *)*param_1);
  name = OBJ_nid2sn(n);
  pEVar1 = EVP_get_digestbyname(name);
  if (pEVar1 == (EVP_MD *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/x_algor.c",0x99,"ossl_x509_algor_get_md");
    ERR_set_error(0xd,0xe5,0);
    return (EVP_MD *)0x0;
  }
  return pEVar1;
}


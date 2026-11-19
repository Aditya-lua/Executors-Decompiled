/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2ccc
 */

int PKCS7_add_certificate(PKCS7 *p7,X509 *x509)

{
  int iVar1;
  
  iVar1 = OBJ_obj2nid(p7->type);
  if ((iVar1 == 0x18) || (iVar1 == 0x16)) {
    iVar1 = ossl_x509_add_cert_new((p7->d).ptr + 0x10,x509,1);
    return iVar1;
  }
  ERR_new();
  ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x109,"PKCS7_add_certificate");
  ERR_set_error(0x21,0x71,0);
  return 0;
}


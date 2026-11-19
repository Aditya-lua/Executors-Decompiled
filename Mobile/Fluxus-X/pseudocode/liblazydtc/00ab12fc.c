/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab12fc
 */

X509_EXTENSION * OCSP_accept_responses_new(char **oids)

{
  int n;
  void *ext_struc;
  char *s;
  ASN1_OBJECT *pAVar1;
  X509_EXTENSION *pXVar2;
  
  ext_struc = (void *)OPENSSL_sk_new_null();
  if (ext_struc == (void *)0x0) {
    pXVar2 = (X509_EXTENSION *)0x0;
  }
  else {
    if (oids != (char **)0x0) {
      s = *oids;
      while (s != (char *)0x0) {
        oids = oids + 1;
        n = OBJ_txt2nid(s);
        if ((n != 0) && (pAVar1 = OBJ_nid2obj(n), pAVar1 != (ASN1_OBJECT *)0x0)) {
          OPENSSL_sk_push(ext_struc,pAVar1);
        }
        s = *oids;
      }
    }
    pXVar2 = X509V3_EXT_i2d(0x170,0,ext_struc);
  }
  OPENSSL_sk_pop_free(ext_struc,ASN1_OBJECT_free);
  return pXVar2;
}


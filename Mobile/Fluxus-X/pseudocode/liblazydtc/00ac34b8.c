/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac34b8
 */

int PKCS7_set_digest(PKCS7 *p7,EVP_MD *md)

{
  int iVar1;
  ASN1_TYPE *pAVar2;
  ASN1_OBJECT *pAVar3;
  
  iVar1 = OBJ_obj2nid(p7->type);
  if (iVar1 == 0x19) {
    pAVar2 = ASN1_TYPE_new();
    ((p7->d).digest)->md->parameter = pAVar2;
    if (pAVar2 == (ASN1_TYPE *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x20c,"PKCS7_set_digest");
      ERR_set_error(0x21,0xc0100,0);
      return 0;
    }
    ((p7->d).digest)->md->parameter->type = 5;
    iVar1 = EVP_MD_get_type(md);
    pAVar3 = OBJ_nid2obj(iVar1);
    ((p7->d).digest)->md->algorithm = pAVar3;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x214,"PKCS7_set_digest");
    ERR_set_error(0x21,0x71,0);
  }
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac382c
 */

int PKCS7_add_recipient_info(PKCS7 *p7,PKCS7_RECIP_INFO *ri)

{
  int iVar1;
  PKCS7_SIGNED *pPVar2;
  
  iVar1 = OBJ_obj2nid(p7->type);
  if (iVar1 == 0x17) {
    pPVar2 = (PKCS7_SIGNED *)&((p7->d).data)->data;
  }
  else {
    if (iVar1 != 0x18) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x254,"PKCS7_add_recipient_info");
      ERR_set_error(0x21,0x71,0);
      return 0;
    }
    pPVar2 = (p7->d).sign + 1;
  }
  iVar1 = OPENSSL_sk_push(pPVar2->version,ri);
  return (uint)(iVar1 != 0);
}


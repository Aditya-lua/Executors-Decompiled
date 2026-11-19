/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2718
 */

long PKCS7_ctrl(PKCS7 *p7,int cmd,long larg,char *parg)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  
  iVar2 = OBJ_obj2nid(p7->type);
  if (cmd == 2) {
    if (iVar2 == 0x16) {
      if ((p7->d).enveloped == (PKCS7_ENVELOPE *)0x0) {
        p7->detached = 1;
        return 1;
      }
      bVar1 = (p7->d).enveloped[1].enc_data[1].content_type == (ASN1_OBJECT *)0x0;
      p7->detached = (uint)bVar1;
      return (ulong)bVar1;
    }
    ERR_new();
    uVar4 = 0x36;
  }
  else {
    if (cmd != 1) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x3c,"PKCS7_ctrl");
      uVar4 = 0x6e;
      goto LAB_00ac282c;
    }
    if (iVar2 == 0x16) {
      iVar2 = (int)larg;
      p7->detached = iVar2;
      if ((larg & 0xffffffffU) == 0) {
        return 0;
      }
      iVar3 = OBJ_obj2nid(((p7->d).sign)->contents->type);
      if (iVar3 == 0x15) {
        ASN1_OCTET_STRING_free((ASN1_STRING *)(p7->d).enveloped[1].enc_data[1].content_type);
        (p7->d).enveloped[1].enc_data[1].content_type = (ASN1_OBJECT *)0x0;
        return (long)iVar2;
      }
      return (long)iVar2;
    }
    ERR_new();
    uVar4 = 0x28;
  }
  ERR_set_debug("crypto/pkcs7/pk7_lib.c",uVar4,"PKCS7_ctrl");
  uVar4 = 0x68;
LAB_00ac282c:
  ERR_set_error(0x21,uVar4,0);
  return 0;
}


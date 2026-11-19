/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abb058
 */

stack_st_PKCS12_SAFEBAG * PKCS12_unpack_p7data(PKCS7 *p7)

{
  int iVar1;
  ASN1_ITEM *it;
  stack_st_PKCS12_SAFEBAG *psVar2;
  undefined8 uVar3;
  ASN1_STRING *oct;
  
  iVar1 = OBJ_obj2nid(p7->type);
  if (iVar1 == 0x15) {
    oct = (p7->d).data;
    if (oct != (ASN1_STRING *)0x0) {
      it = (ASN1_ITEM *)PKCS12_SAFEBAGS_it();
      psVar2 = ASN1_item_unpack(oct,it);
      return psVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x53,"PKCS12_unpack_p7data");
    uVar3 = 0x65;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_add.c",0x4e,"PKCS12_unpack_p7data");
    uVar3 = 0x79;
  }
  ERR_set_error(0x23,uVar3,0);
  return (stack_st_PKCS12_SAFEBAG *)0x0;
}


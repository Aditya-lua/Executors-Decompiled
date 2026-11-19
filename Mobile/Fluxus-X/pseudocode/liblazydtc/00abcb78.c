/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcb78
 */

PKCS12_SAFEBAG * PKCS12_SAFEBAG_create0_pkcs8(pkcs12_bag_st *param_1)

{
  PKCS12_SAFEBAG *pPVar1;
  ASN1_OBJECT *pAVar2;
  
  pPVar1 = PKCS12_SAFEBAG_new();
  if (pPVar1 == (PKCS12_SAFEBAG *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pkcs12/p12_sbag.c",0xc1,"PKCS12_SAFEBAG_create0_pkcs8");
    ERR_set_error(0x23,0xc0100,0);
  }
  else {
    pAVar2 = OBJ_nid2obj(0x97);
    pPVar1->type = pAVar2;
    (pPVar1->value).bag = param_1;
  }
  return pPVar1;
}


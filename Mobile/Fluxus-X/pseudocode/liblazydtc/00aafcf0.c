/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafcf0
 */

OCSP_BASICRESP * OCSP_response_get1_basic(OCSP_RESPONSE *resp)

{
  int iVar1;
  ASN1_ITEM *it;
  OCSP_BASICRESP *pOVar2;
  undefined8 uVar3;
  OCSP_RESPBYTES *pOVar4;
  ASN1_STRING *oct;
  
  pOVar4 = resp->responseBytes;
  if (pOVar4 == (OCSP_RESPBYTES *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x82,"OCSP_response_get1_basic");
    uVar3 = 0x6c;
  }
  else {
    iVar1 = OBJ_obj2nid(pOVar4->responseType);
    if (iVar1 == 0x16d) {
      oct = pOVar4->response;
      it = (ASN1_ITEM *)OCSP_BASICRESP_it();
      pOVar2 = ASN1_item_unpack(oct,it);
      return pOVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x86,"OCSP_response_get1_basic");
    uVar3 = 0x68;
  }
  ERR_set_error(0x27,uVar3,0);
  return (OCSP_BASICRESP *)0x0;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab2f3c
 */

int OCSP_request_verify(OCSP_REQUEST *req,stack_st_X509 *certs,X509_STORE *store,ulong flags)

{
  bool bVar1;
  int iVar2;
  X509 *pXVar3;
  undefined8 uVar4;
  stack_st_X509_EXTENSION *psVar5;
  OCSP_SIGNATURE *pOVar6;
  X509_NAME *name;
  
  if (req[2].tbsRequest == (OCSP_REQINFO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x18a,"OCSP_request_verify");
    uVar4 = 0x80;
  }
  else {
    pOVar6 = req->optionalSignature;
    if ((pOVar6 != (OCSP_SIGNATURE *)0x0) && (*(int *)&pOVar6->signatureAlgorithm == 4)) {
      name = (X509_NAME *)pOVar6->signature;
      if ((((uint)flags >> 1 & 1) == 0) &&
         (pXVar3 = X509_find_by_subject
                             ((stack_st_X509 *)(req[2].tbsRequest)->requestExtensions,name),
         pXVar3 != (X509 *)0x0)) {
        bVar1 = true;
      }
      else {
        pXVar3 = X509_find_by_subject(certs,name);
        if (pXVar3 == (X509 *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/ocsp/ocsp_vfy.c",0x195,"OCSP_request_verify");
          uVar4 = 0x76;
          goto LAB_00ab2fec;
        }
        bVar1 = false;
      }
      if ((flags & 0x200) != 0 && !bVar1) {
        flags = flags | 0x10;
      }
      iVar2 = FUN_00ab2c40(req,0,pXVar3,flags);
      if (iVar2 < 1) {
        return 0;
      }
      if (((uint)flags >> 4 & 1) != 0) {
        return 1;
      }
      psVar5 = (stack_st_X509_EXTENSION *)0x0;
      if (((uint)flags >> 3 & 1) == 0) {
        psVar5 = (req[2].tbsRequest)->requestExtensions;
      }
      iVar2 = FUN_00ab2d34(pXVar3,0,store,flags,psVar5,0);
      return (uint)(0 < iVar2);
    }
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_vfy.c",399,"OCSP_request_verify");
    uVar4 = 0x81;
  }
LAB_00ab2fec:
  ERR_set_error(0x27,uVar4,0);
  return 0;
}


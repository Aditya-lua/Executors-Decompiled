/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab00d8
 */

int OCSP_check_validity(ASN1_GENERALIZEDTIME *thisupd,ASN1_GENERALIZEDTIME *nextupd,long sec,
                       long maxsec)

{
  int iVar1;
  undefined8 uVar2;
  uint uVar3;
  long local_48;
  long local_38;
  
  time(&local_38);
  iVar1 = ASN1_GENERALIZEDTIME_check(thisupd);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x13f,"OCSP_check_validity");
    uVar2 = 0x7b;
LAB_00ab01dc:
    ERR_set_error(0x27,uVar2,0);
    uVar3 = 0;
  }
  else {
    local_48 = local_38 + sec;
    iVar1 = X509_cmp_time(thisupd,&local_48);
    if (iVar1 >= 1) {
      ERR_new();
      ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x144,"OCSP_check_validity");
      ERR_set_error(0x27,0x7e,0);
    }
    uVar3 = (uint)(iVar1 < 1);
    if (-1 < maxsec) {
      local_48 = local_38 - maxsec;
      iVar1 = X509_cmp_time(thisupd,&local_48);
      if (iVar1 < 0) {
        ERR_new();
        ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x14f,"OCSP_check_validity");
        uVar2 = 0x7f;
        goto LAB_00ab01dc;
      }
    }
  }
  if (nextupd == (ASN1_GENERALIZEDTIME *)0x0) {
    return uVar3;
  }
  iVar1 = ASN1_GENERALIZEDTIME_check(nextupd);
  if (iVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x15a,"OCSP_check_validity");
    uVar2 = 0x7a;
  }
  else {
    local_48 = local_38 - sec;
    iVar1 = X509_cmp_time(nextupd,&local_48);
    if (-1 < iVar1) goto LAB_00ab026c;
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x15f,"OCSP_check_validity");
    uVar2 = 0x7d;
  }
  ERR_set_error(0x27,uVar2,0);
  uVar3 = 0;
LAB_00ab026c:
  iVar1 = ASN1_STRING_cmp(nextupd,thisupd);
  if (iVar1 < 0) {
    ERR_new();
    ERR_set_debug("crypto/ocsp/ocsp_cl.c",0x166,"OCSP_check_validity");
    ERR_set_error(0x27,0x7c,0);
    uVar3 = 0;
  }
  return uVar3;
}


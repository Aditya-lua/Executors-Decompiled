/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afcad4
 */

int DIST_POINT_set_dpname(DIST_POINT_NAME *dpn,X509_NAME *iname)

{
  GENERAL_NAMES *pGVar1;
  int iVar2;
  int iVar3;
  X509_NAME *pXVar4;
  X509_NAME_ENTRY *ne;
  
  if ((dpn != (DIST_POINT_NAME *)0x0) && (dpn->type == 1)) {
    pGVar1 = (dpn->name).fullname;
    X509_NAME_free(dpn->dpname);
    pXVar4 = X509_NAME_dup(iname);
    dpn->dpname = pXVar4;
    if (pXVar4 == (X509_NAME *)0x0) {
      return 0;
    }
    iVar2 = OPENSSL_sk_num(pGVar1);
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        ne = (X509_NAME_ENTRY *)OPENSSL_sk_value(pGVar1,iVar2);
        iVar3 = X509_NAME_add_entry(dpn->dpname,ne,-1,(uint)(iVar2 == 0));
        if (iVar3 == 0) goto LAB_00afcb88;
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(pGVar1);
      } while (iVar2 < iVar3);
    }
    iVar2 = i2d_X509_NAME(dpn->dpname,(uchar **)0x0);
    if (iVar2 < 0) {
LAB_00afcb88:
      X509_NAME_free(dpn->dpname);
      dpn->dpname = (X509_NAME *)0x0;
      return 0;
    }
  }
  return 1;
}


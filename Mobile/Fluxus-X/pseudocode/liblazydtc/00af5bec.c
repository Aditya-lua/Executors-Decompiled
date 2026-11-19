/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5bec
 */

int X509V3_add1_i2d(stack_st_X509_EXTENSION **x,int nid,void *value,int crit,ulong flags)

{
  int iVar1;
  X509_EXTENSION *pXVar2;
  X509_EXTENSION *a;
  long lVar3;
  undefined8 uVar4;
  bool bVar5;
  stack_st_X509_EXTENSION *psVar6;
  uint uVar7;
  
  if ((flags & 0xf) == 1) {
    bVar5 = false;
    iVar1 = -1;
  }
  else {
    iVar1 = X509v3_get_ext_by_NID(*x,nid,-1);
    uVar7 = (uint)flags;
    if (iVar1 < 0) {
      uVar4 = 0x66;
      if (((uVar7 & 0xf) == 3) || (bVar5 = false, (uVar7 & 0xf) == 5)) goto joined_r0x00af5d40;
    }
    else {
      if ((flags & 0xf) == 0) {
        uVar4 = 0x91;
joined_r0x00af5d40:
        if ((uVar7 >> 4 & 1) != 0) {
          return 0;
        }
        ERR_new();
        ERR_set_debug("crypto/x509/v3_lib.c",0x12e,"X509V3_add1_i2d");
        goto LAB_00af5d9c;
      }
      bVar5 = true;
      if ((uVar7 & 0xf) == 4) {
        return 1;
      }
      if ((uVar7 & 0xf) == 5) {
        pXVar2 = (X509_EXTENSION *)OPENSSL_sk_delete(*x,iVar1);
        if (pXVar2 == (X509_EXTENSION *)0x0) {
          return -1;
        }
        X509_EXTENSION_free(pXVar2);
        return 1;
      }
    }
  }
  pXVar2 = X509V3_EXT_i2d(nid,crit,value);
  if (pXVar2 != (X509_EXTENSION *)0x0) {
    psVar6 = *x;
    if (bVar5) {
      a = (X509_EXTENSION *)OPENSSL_sk_value(psVar6,iVar1);
      X509_EXTENSION_free(a);
      lVar3 = OPENSSL_sk_set(*x,iVar1,pXVar2);
      iVar1 = 1;
      if (lVar3 == 0) {
        iVar1 = -1;
      }
      return iVar1;
    }
    if (((psVar6 != (stack_st_X509_EXTENSION *)0x0) ||
        (psVar6 = (stack_st_X509_EXTENSION *)OPENSSL_sk_new_null(),
        psVar6 != (stack_st_X509_EXTENSION *)0x0)) &&
       (iVar1 = OPENSSL_sk_push(psVar6,pXVar2), iVar1 != 0)) {
      *x = psVar6;
      return 1;
    }
    if (psVar6 != *x) {
      OPENSSL_sk_free(psVar6);
    }
    X509_EXTENSION_free(pXVar2);
    return -1;
  }
  ERR_new();
  ERR_set_debug("crypto/x509/v3_lib.c",0x10e,"X509V3_add1_i2d");
  uVar4 = 0x90;
LAB_00af5d9c:
  ERR_set_error(0x22,uVar4,0);
  return 0;
}


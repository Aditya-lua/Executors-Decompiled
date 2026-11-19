/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5ad4
 */

void * X509V3_get_d2i(stack_st_X509_EXTENSION *x,int nid,int *crit,int *idx)

{
  bool bVar1;
  int iVar2;
  X509_EXTENSION *ex;
  ASN1_OBJECT *o;
  void *pvVar3;
  uint uVar4;
  X509_EXTENSION *ex_00;
  
  if (x != (stack_st_X509_EXTENSION *)0x0) {
    if (idx == (int *)0x0) {
      uVar4 = 0;
    }
    else {
      uVar4 = *idx + 1U & ((int)(*idx + 1U) >> 0x1f ^ 0xffffffffU);
    }
    iVar2 = OPENSSL_sk_num(x);
    if ((int)uVar4 < iVar2) {
      ex_00 = (X509_EXTENSION *)0x0;
      do {
        ex = (X509_EXTENSION *)OPENSSL_sk_value(x,uVar4);
        o = X509_EXTENSION_get_object(ex);
        iVar2 = OBJ_obj2nid(o);
        if (iVar2 == nid) {
          if (idx != (int *)0x0) {
            *idx = uVar4;
            ex_00 = ex;
            break;
          }
          bVar1 = ex_00 != (X509_EXTENSION *)0x0;
          ex_00 = ex;
          if (bVar1) {
            if (crit == (int *)0x0) {
              return (void *)0x0;
            }
            iVar2 = -2;
            goto LAB_00af5bc0;
          }
        }
        uVar4 = uVar4 + 1;
        iVar2 = OPENSSL_sk_num(x);
      } while ((int)uVar4 < iVar2);
      if (ex_00 != (X509_EXTENSION *)0x0) {
        if (crit != (int *)0x0) {
          iVar2 = X509_EXTENSION_get_critical(ex_00);
          *crit = iVar2;
        }
        pvVar3 = X509V3_EXT_d2i(ex_00);
        return pvVar3;
      }
    }
  }
  if (idx != (int *)0x0) {
    *idx = -1;
  }
  if (crit != (int *)0x0) {
    iVar2 = -1;
LAB_00af5bc0:
    *crit = iVar2;
  }
  return (void *)0x0;
}


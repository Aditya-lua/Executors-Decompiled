/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac13c0
 */

undefined8 FUN_00ac13c0(long *param_1,int param_2,int param_3,void *param_4)

{
  int iVar1;
  int iVar2;
  X509_ATTRIBUTE *pXVar3;
  ASN1_OBJECT *o;
  undefined8 uVar4;
  long lVar5;
  
  if (*param_1 == 0) {
    lVar5 = OPENSSL_sk_new_null();
    *param_1 = lVar5;
    if (lVar5 == 0) {
      return 0;
    }
  }
  else {
    iVar1 = OPENSSL_sk_num();
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        pXVar3 = (X509_ATTRIBUTE *)OPENSSL_sk_value(*param_1,iVar1);
        o = X509_ATTRIBUTE_get0_object(pXVar3);
        iVar2 = OBJ_obj2nid(o);
        if (iVar2 == param_2) {
          X509_ATTRIBUTE_free(pXVar3);
          pXVar3 = X509_ATTRIBUTE_create(param_2,param_3,param_4);
          if (pXVar3 == (X509_ATTRIBUTE *)0x0) {
            return 0;
          }
          lVar5 = OPENSSL_sk_set(*param_1,iVar1,pXVar3);
          if (lVar5 == 0) goto LAB_00ac14a4;
          goto LAB_00ac1468;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(*param_1);
      } while (iVar1 < iVar2);
    }
  }
  pXVar3 = X509_ATTRIBUTE_create(param_2,param_3,param_4);
  uVar4 = 0;
  if (pXVar3 != (X509_ATTRIBUTE *)0x0) {
    iVar1 = OPENSSL_sk_push(*param_1,pXVar3);
    if (iVar1 == 0) {
LAB_00ac14a4:
      X509_ATTRIBUTE_free(pXVar3);
      uVar4 = 0;
    }
    else {
LAB_00ac1468:
      uVar4 = 1;
    }
  }
  return uVar4;
}


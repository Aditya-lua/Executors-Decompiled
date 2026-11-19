/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06b10
 */

int FUN_00b06b10(X509 *param_1,char *param_2,size_t param_3,uint param_4,int param_5,
                undefined8 param_6)

{
  uint uVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  GENERAL_NAMES *a;
  int *piVar5;
  X509_NAME *name;
  X509_NAME_ENTRY *ne;
  ASN1_STRING *pAVar6;
  int *piVar7;
  uint uVar8;
  code *pcVar9;
  int nid;
  undefined4 local_6c;
  
  uVar1 = param_4 & 0xffff7fff;
  if (param_5 == 1) {
    pcVar9 = (code *)&LAB_00b073d0;
    local_6c = 0x16;
    nid = 0x30;
  }
  else if (param_5 == 2) {
    uVar8 = uVar1;
    if ((1 < param_3) && (uVar8 = param_4 | 0x8000, *param_2 != '.')) {
      uVar8 = uVar1;
    }
    pcVar9 = FUN_00b07594;
    if ((uVar8 & 2) != 0) {
      pcVar9 = (code *)&UNK_00b074d0;
    }
    nid = 0xd;
    local_6c = 0x16;
    uVar1 = uVar8;
  }
  else {
    nid = 0;
    pcVar9 = (code *)&UNK_00b079e0;
    local_6c = 4;
  }
  if (param_3 == 0) {
    param_3 = strlen(param_2);
  }
  a = X509_get_ext_d2i(param_1,0x55,(int *)0x0,(int *)0x0);
  if (a != (GENERAL_NAMES *)0x0) {
    iVar3 = OPENSSL_sk_num();
    bVar2 = false;
    if (0 < iVar3) {
      iVar3 = 0;
      do {
        piVar5 = (int *)OPENSSL_sk_value(a,iVar3);
        iVar4 = *piVar5;
        if ((param_5 == 1) && (iVar4 == 0)) {
          iVar4 = OBJ_obj2nid((ASN1_OBJECT *)**(undefined8 **)(piVar5 + 2));
          if (iVar4 == 0x4b8) {
            piVar7 = *(int **)(*(long *)(piVar5 + 2) + 8);
            if ((*piVar7 == 0xc) &&
               (iVar4 = FUN_00b07a70(*(undefined8 *)(piVar7 + 2),0,pcVar9,uVar1,param_2,param_3,
                                     param_6), iVar4 != 0)) goto LAB_00b06d74;
            goto LAB_00b06c34;
          }
        }
        else if ((iVar4 == param_5) || (iVar4 == 0)) {
LAB_00b06c34:
          iVar4 = FUN_00b07a70(*(undefined8 *)(piVar5 + 2),local_6c,pcVar9,uVar1,param_2,param_3,
                               param_6);
          if (iVar4 != 0) {
LAB_00b06d74:
            GENERAL_NAMES_free(a);
            return iVar4;
          }
          bVar2 = true;
        }
        iVar3 = iVar3 + 1;
        iVar4 = OPENSSL_sk_num(a);
      } while (iVar3 < iVar4);
    }
    GENERAL_NAMES_free(a);
    if (((uVar1 & 1) == 0) && (bVar2)) {
      return 0;
    }
  }
  if (nid == 0) {
LAB_00b06d4c:
    iVar3 = 0;
  }
  else {
    iVar3 = 0;
    if ((uVar1 >> 5 & 1) == 0) {
      name = X509_get_subject_name(param_1);
      iVar4 = -1;
      do {
        iVar4 = X509_NAME_get_index_by_NID(name,nid,iVar4);
        if (iVar4 < 0) goto LAB_00b06d4c;
        ne = X509_NAME_get_entry(name,iVar4);
        pAVar6 = X509_NAME_ENTRY_get_data(ne);
        iVar3 = FUN_00b07a70(pAVar6,0xffffffff,pcVar9,uVar1,param_2,param_3,param_6);
      } while (iVar3 == 0);
    }
  }
  return iVar3;
}


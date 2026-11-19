/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f611c
 */

int ASN1_item_ex_i2d(ASN1_VALUE **pval,uchar **out,ASN1_ITEM *it,int tag,int aclass)

{
  uint xclass;
  int iVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  void *pvVar6;
  long lVar7;
  ASN1_TEMPLATE *pAVar8;
  code *pcVar9;
  int local_64;
  
  pvVar6 = it->funcs;
  if ((it->itype != '\0') && (*pval == (ASN1_VALUE *)0x0)) {
    return 0;
  }
  if (pvVar6 == (void *)0x0) {
    pcVar9 = (code *)0x0;
  }
  else {
    lVar7 = 0x18;
    if ((*(byte *)((long)pvVar6 + 8) & 8) != 0) {
      lVar7 = 0x28;
    }
    pcVar9 = *(code **)((long)pvVar6 + lVar7);
  }
  iVar1 = 0;
  iVar3 = 1;
  switch(it->itype) {
  case '\0':
    pAVar8 = it->templates;
    if (pAVar8 != (ASN1_TEMPLATE *)0x0) goto LAB_009f61c0;
    break;
  case '\x02':
    if (tag != -1) {
      ERR_new();
      uVar5 = 0x7d;
LAB_009f6238:
      ERR_set_debug("crypto/asn1/tasn_enc.c",uVar5,"ASN1_item_ex_i2d");
      ERR_set_error(0xd,0xe6,0);
      return -1;
    }
    if ((pcVar9 != (code *)0x0) && (iVar3 = (*pcVar9)(6,pval,it,0), iVar3 == 0)) {
      return 0;
    }
    iVar3 = ossl_asn1_get_choice_selector_const(pval,it);
    if ((iVar3 < 0) || (it->tcount <= (long)iVar3)) {
      if (pcVar9 == (code *)0x0) {
        return 0;
      }
      (*pcVar9)(7,pval,it,0);
      return 0;
    }
    pAVar8 = it->templates + iVar3;
    pval = (ASN1_VALUE **)ossl_asn1_get_const_field_ptr(pval,pAVar8);
    tag = -1;
LAB_009f61c0:
    iVar3 = FUN_009f64f0(pval,out,pAVar8,tag,aclass);
    return iVar3;
  default:
    goto switchD_009f61a8_caseD_3;
  case '\x04':
    iVar3 = (**(code **)((long)pvVar6 + 0x28))(pval,out,it,tag,aclass);
    return iVar3;
  case '\x05':
    if (tag != -1) {
      ERR_new();
      uVar5 = 0x72;
      goto LAB_009f6238;
    }
    tag = -1;
    break;
  case '\x06':
    iVar3 = ((uint)aclass >> 0xb & 1) + 1;
  case '\x01':
    iVar1 = ossl_asn1_enc_restore(&local_64,out,pval,it);
    if (-1 < iVar1) {
      if (iVar1 != 0) {
        return local_64;
      }
      xclass = aclass & 0xffffff3f;
      if (tag != -1) {
        xclass = aclass;
      }
      iVar1 = 0x10;
      if (tag != -1) {
        iVar1 = tag;
      }
      local_64 = 0;
      if ((pcVar9 == (code *)0x0) || (iVar2 = (*pcVar9)(6,pval,it,0), iVar2 != 0)) {
        if (0 < it->tcount) {
          pAVar8 = it->templates;
          lVar7 = 0;
          do {
            lVar4 = ossl_asn1_do_adb(*pval,pAVar8,1);
            if (lVar4 == 0) {
              return 0;
            }
            uVar5 = ossl_asn1_get_const_field_ptr(pval,lVar4);
            iVar2 = FUN_009f64f0(uVar5,0,lVar4,0xffffffff,xclass);
            if (iVar2 == -1) {
              return -1;
            }
            if (0x7fffffff - local_64 < iVar2) {
              return -1;
            }
            local_64 = local_64 + iVar2;
            lVar7 = lVar7 + 1;
            pAVar8 = pAVar8 + 1;
          } while (lVar7 < it->tcount);
        }
        iVar2 = ASN1_object_size(iVar3,local_64,iVar1);
        if (out == (uchar **)0x0) {
          return iVar2;
        }
        if (iVar2 == -1) {
          return -1;
        }
        ASN1_put_object(out,iVar3,local_64,iVar1,xclass);
        if (0 < it->tcount) {
          pAVar8 = it->templates;
          lVar7 = 0;
          do {
            lVar4 = ossl_asn1_do_adb(*pval,pAVar8,1);
            if (lVar4 == 0) {
              return 0;
            }
            uVar5 = ossl_asn1_get_const_field_ptr(pval,lVar4);
            FUN_009f64f0(uVar5,out,lVar4,0xffffffff,xclass);
            lVar7 = lVar7 + 1;
            pAVar8 = pAVar8 + 1;
          } while (lVar7 < it->tcount);
        }
        if (iVar3 == 2) {
          ASN1_put_eoc(out);
        }
        if (pcVar9 == (code *)0x0) {
          return iVar2;
        }
        iVar3 = (*pcVar9)(7,pval,it,0);
        if (iVar3 != 0) {
          return iVar2;
        }
      }
    }
    return 0;
  }
  iVar1 = FUN_009f6ae4(pval,out,it,tag,aclass);
switchD_009f61a8_caseD_3:
  return iVar1;
}


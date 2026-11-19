/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f64f0
 */

int FUN_009f64f0(ASN1_VALUE *param_1,uchar **param_2,uint *param_3,uint param_4,uint param_5)

{
  uint aclass;
  uint xclass;
  uint uVar1;
  uint tag;
  int iVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  ASN1_ITEM *pAVar7;
  undefined8 *__base;
  uchar *ptr;
  undefined8 uVar8;
  uint uVar9;
  undefined8 *puVar10;
  uint xclass_00;
  ASN1_VALUE *local_80;
  ASN1_VALUE *local_78;
  uchar *local_70;
  ASN1_VALUE *local_68;
  
  uVar1 = *param_3;
  if ((uVar1 >> 0xc & 1) != 0) {
    local_78 = param_1;
    param_1 = (ASN1_VALUE *)&local_78;
  }
  if ((uVar1 & 0x18) == 0) {
    xclass_00 = param_5 & 0xc0;
    if (param_4 == 0xffffffff) {
      xclass_00 = 0;
    }
  }
  else {
    if (param_4 != 0xffffffff) {
      return -1;
    }
    param_4 = param_3[2];
    xclass_00 = uVar1 & 0xc0;
  }
  aclass = param_5 & 0xffffff3f;
  iVar6 = ((uVar1 & param_5) >> 0xb & 1) + 1;
  if ((uVar1 & 6) == 0) {
    pAVar7 = (ASN1_ITEM *)(**(code **)(param_3 + 8))();
    if ((uVar1 >> 4 & 1) == 0) {
      iVar6 = ASN1_item_ex_i2d((ASN1_VALUE **)param_1,param_2,pAVar7,param_4,xclass_00 | aclass);
      if (iVar6 != 0) {
        return iVar6;
      }
      if ((*param_3 & 1) != 0) {
        return 0;
      }
      ERR_new();
      uVar8 = 0x176;
    }
    else {
      iVar4 = ASN1_item_ex_i2d((ASN1_VALUE **)param_1,(uchar **)0x0,pAVar7,-1,aclass);
      if (iVar4 != 0) {
        iVar3 = ASN1_object_size(iVar6,iVar4,param_4);
        if (param_2 == (uchar **)0x0) {
          return iVar3;
        }
        if (iVar3 == -1) {
          return -1;
        }
        ASN1_put_object(param_2,iVar6,iVar4,param_4,xclass_00);
        pAVar7 = (ASN1_ITEM *)(**(code **)(param_3 + 8))();
        ASN1_item_ex_i2d((ASN1_VALUE **)param_1,param_2,pAVar7,-1,aclass);
        if (iVar6 != 2) {
          return iVar3;
        }
        goto LAB_009f6ad8;
      }
      if ((*param_3 & 1) != 0) {
        return 0;
      }
      ERR_new();
      uVar8 = 0x161;
    }
LAB_009f687c:
    ERR_set_debug("crypto/asn1/tasn_enc.c",uVar8,"asn1_template_ex_i2d");
    ERR_set_error(0xd,0xde,0);
  }
  else {
    param_1 = *(ASN1_VALUE **)param_1;
    if (param_1 == (ASN1_VALUE *)0x0) {
      return 0;
    }
    iVar4 = 0;
    if ((uVar1 >> 1 & 1) != 0) {
      iVar4 = (uVar1 >> 2 & 1) + 1;
    }
    uVar9 = 0x10;
    if (iVar4 != 0) {
      uVar9 = 0x11;
    }
    xclass = xclass_00;
    tag = param_4;
    if ((uVar1 & 0x10) != 0 || param_4 == 0xffffffff) {
      xclass = 0;
      tag = uVar9;
    }
    iVar2 = OPENSSL_sk_num(param_1);
    iVar5 = 0;
    if (0 < iVar2) {
      iVar2 = 0;
      do {
        local_80 = (ASN1_VALUE *)OPENSSL_sk_value(param_1,iVar2);
        pAVar7 = (ASN1_ITEM *)(**(code **)(param_3 + 8))();
        iVar3 = ASN1_item_ex_i2d(&local_80,(uchar **)0x0,pAVar7,-1,aclass);
        if (iVar3 == -1) {
          return -1;
        }
        if (0x7fffffff - iVar3 < iVar5) {
          return -1;
        }
        if ((iVar3 == 0) && ((*param_3 & 1) == 0)) {
          ERR_new();
          uVar8 = 0x138;
          goto LAB_009f687c;
        }
        iVar5 = iVar3 + iVar5;
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(param_1);
      } while (iVar2 < iVar3);
    }
    iVar2 = ASN1_object_size(iVar6,iVar5,tag);
    if (iVar2 != -1) {
      iVar3 = iVar2;
      if ((uVar1 >> 4 & 1) != 0) {
        iVar3 = ASN1_object_size(iVar6,iVar2,param_4);
      }
      if (param_2 == (uchar **)0x0) {
        return iVar3;
      }
      if (iVar3 == -1) {
        return -1;
      }
      if ((uVar1 >> 4 & 1) != 0) {
        ASN1_put_object(param_2,iVar6,iVar2,param_4,xclass_00);
      }
      ASN1_put_object(param_2,iVar6,iVar5,tag,xclass);
      pAVar7 = (ASN1_ITEM *)(**(code **)(param_3 + 8))();
      local_70 = (uchar *)0x0;
      if ((iVar4 == 0) || (iVar2 = OPENSSL_sk_num(param_1), iVar2 < 2)) {
        iVar4 = OPENSSL_sk_num(param_1);
        if (0 < iVar4) {
          iVar4 = 0;
          do {
            local_68 = (ASN1_VALUE *)OPENSSL_sk_value(param_1,iVar4);
            ASN1_item_ex_i2d(&local_68,param_2,pAVar7,-1,aclass);
            iVar4 = iVar4 + 1;
            iVar5 = OPENSSL_sk_num(param_1);
          } while (iVar4 < iVar5);
        }
      }
      else {
        iVar2 = OPENSSL_sk_num(param_1);
        __base = CRYPTO_malloc(iVar2 * 0x18,"crypto/asn1/tasn_enc.c",0x1a1);
        if (__base == (undefined8 *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/tasn_enc.c",0x1a3,"asn1_set_seq_out");
          ERR_set_error(0xd,0xc0100,0);
        }
        else {
          ptr = CRYPTO_malloc(iVar5,"crypto/asn1/tasn_enc.c",0x1a6);
          if (ptr == (uchar *)0x0) {
            ERR_new();
            ERR_set_debug("crypto/asn1/tasn_enc.c",0x1a8,"asn1_set_seq_out");
            ERR_set_error(0xd,0xc0100,0);
          }
          else {
            local_70 = ptr;
            iVar5 = OPENSSL_sk_num(param_1);
            if (0 < iVar5) {
              iVar5 = 0;
              puVar10 = __base;
              do {
                local_68 = (ASN1_VALUE *)OPENSSL_sk_value(param_1,iVar5);
                *puVar10 = local_70;
                iVar2 = ASN1_item_ex_i2d(&local_68,&local_70,pAVar7,-1,aclass);
                *(int *)(puVar10 + 1) = iVar2;
                iVar5 = iVar5 + 1;
                puVar10[2] = local_68;
                iVar2 = OPENSSL_sk_num(param_1);
                puVar10 = puVar10 + 3;
              } while (iVar5 < iVar2);
            }
            iVar5 = OPENSSL_sk_num(param_1);
            qsort(__base,(long)iVar5,0x18,(__compar_fn_t)&LAB_009f6c20);
            local_70 = *param_2;
            iVar5 = OPENSSL_sk_num(param_1);
            if (0 < iVar5) {
              iVar5 = 0;
              puVar10 = __base;
              do {
                memcpy(local_70,(void *)*puVar10,(long)*(int *)(puVar10 + 1));
                iVar5 = iVar5 + 1;
                local_70 = local_70 + *(int *)(puVar10 + 1);
                iVar2 = OPENSSL_sk_num(param_1);
                puVar10 = puVar10 + 3;
              } while (iVar5 < iVar2);
            }
            *param_2 = local_70;
            if ((iVar4 == 2) && (iVar4 = OPENSSL_sk_num(param_1), 0 < iVar4)) {
              iVar4 = 0;
              puVar10 = __base + 2;
              do {
                OPENSSL_sk_set(param_1,iVar4,*puVar10);
                iVar4 = iVar4 + 1;
                iVar5 = OPENSSL_sk_num(param_1);
                puVar10 = puVar10 + 3;
              } while (iVar4 < iVar5);
            }
          }
          CRYPTO_free(__base);
          CRYPTO_free(ptr);
        }
      }
      if (iVar6 != 2) {
        return iVar3;
      }
      ASN1_put_eoc(param_2);
      if ((uVar1 >> 4 & 1) == 0) {
        return iVar3;
      }
LAB_009f6ad8:
      ASN1_put_eoc(param_2);
      return iVar3;
    }
  }
  return -1;
}


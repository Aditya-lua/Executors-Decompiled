/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3da0
 */

undefined8
FUN_009f3da0(ASN1_VALUE **param_1,long *param_2,char *param_3,ASN1_ITEM *param_4,long param_5,
            undefined8 param_6,uint param_7,undefined8 param_8,int param_9,undefined8 param_10,
            undefined8 param_11)

{
  char *pcVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  long lVar6;
  ASN1_TEMPLATE *pAVar7;
  undefined8 uVar8;
  byte bVar9;
  undefined4 uVar10;
  uint uVar11;
  void *pvVar12;
  long lVar13;
  code *pcVar14;
  ASN1_TEMPLATE *pAVar15;
  ulong uVar16;
  undefined8 in_stack_ffffffffffffff50;
  uint local_78;
  char local_74 [4];
  char *local_70;
  char *local_68;
  
  local_70 = (char *)0x0;
  local_68 = param_3;
  if ((param_1 == (ASN1_VALUE **)0x0) || (param_4 == (ASN1_ITEM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0xb6,"asn1_item_embed_d2i");
    uVar8 = 0xc0102;
LAB_009f3f54:
    ERR_set_error(0xd,uVar8,0);
    return 0;
  }
  if ((long)param_3 < 1) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0xba,"asn1_item_embed_d2i");
    uVar8 = 0xe0;
    goto LAB_009f3f54;
  }
  pvVar12 = param_4->funcs;
  if ((pvVar12 == (void *)0x0) ||
     (pcVar14 = *(code **)((long)pvVar12 + 0x18), pcVar14 == (code *)0x0)) {
    pcVar14 = (code *)0x0;
    if (param_9 < 0x1e) goto LAB_009f3e84;
LAB_009f3e08:
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0xc4,"asn1_item_embed_d2i");
    uVar8 = 0xc9;
    goto LAB_009f3e2c;
  }
  if (0x1d < param_9) goto LAB_009f3e08;
LAB_009f3e84:
  if (6 < (byte)param_4->itype) {
    return 0;
  }
  param_9 = param_9 + 1;
  iVar5 = (int)param_5;
  uVar11 = (uint)((ulong)in_stack_ffffffffffffff50 >> 0x20);
  switch(param_4->itype) {
  case '\0':
    if (param_4->templates == (ASN1_TEMPLATE *)0x0) {
LAB_009f41cc:
      uVar8 = FUN_009f4a20(param_1,param_2,local_68,param_4,param_5,param_6,param_7,param_8);
      return uVar8;
    }
    if ((iVar5 == -1) && ((param_7 & 0xff) == 0)) {
      uVar8 = FUN_009f480c(param_1,param_2,param_3,param_4->templates,0,param_8,param_9,param_10,
                           param_11);
      return uVar8;
    }
    ERR_new(0);
    ERR_set_debug("crypto/asn1/tasn_dec.c",0xd3,"asn1_item_embed_d2i");
    uVar8 = 0xaa;
    break;
  default:
    local_70 = (char *)*param_2;
    uVar10 = 0;
    if (iVar5 != -1) {
      uVar10 = (undefined4)param_6;
    }
    iVar2 = 0x10;
    if (iVar5 != -1) {
      iVar2 = iVar5;
    }
    uVar8 = FUN_009f5200(&local_68,0,0,&local_78,local_74,&local_70,param_3,iVar2,
                         CONCAT44(uVar11,uVar10),(char)param_7,param_8);
    if ((int)uVar8 == -1) {
      return uVar8;
    }
    if ((int)uVar8 == 0) {
      ERR_new();
      uVar8 = 0x15d;
LAB_009f3f1c:
      ERR_set_debug("crypto/asn1/tasn_dec.c",uVar8,"asn1_item_embed_d2i");
      uVar8 = 0x8010a;
    }
    else {
      if ((pvVar12 == (void *)0x0) || ((*(byte *)((long)pvVar12 + 8) >> 2 & 1) == 0)) {
        uVar11 = local_78 & 0xff;
      }
      else {
        uVar11 = 1;
        local_68 = param_3 + (*param_2 - (long)local_70);
      }
      if (local_74[0] == '\0') {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x169,"asn1_item_embed_d2i");
        uVar8 = 0x95;
      }
      else {
        if ((*param_1 == (ASN1_VALUE *)0x0) &&
           (iVar5 = ossl_asn1_item_ex_new_intern(param_1,param_4,param_10,param_11), iVar5 == 0)) {
          ERR_new();
          uVar8 = 0x16f;
          goto LAB_009f3f1c;
        }
        if ((pcVar14 != (code *)0x0) && (iVar5 = (*pcVar14)(4,param_1,param_4,0), iVar5 == 0))
        goto LAB_009f476c;
        pAVar15 = param_4->templates;
        if (param_4->tcount < 1) {
LAB_009f4348:
          uVar16 = 0;
        }
        else {
          lVar13 = 0;
          do {
            if (((pAVar15->flags & 0x300) != 0) &&
               (lVar6 = ossl_asn1_do_adb(*param_1,pAVar15,0), lVar6 != 0)) {
              uVar8 = ossl_asn1_get_field_ptr(param_1,lVar6);
              ossl_asn1_template_free(uVar8,lVar6);
            }
            lVar13 = lVar13 + 1;
            pAVar15 = pAVar15 + 1;
          } while (lVar13 < param_4->tcount);
          pAVar15 = param_4->templates;
          if (param_4->tcount < 1) goto LAB_009f4348;
          uVar16 = 0;
          do {
            pAVar7 = (ASN1_TEMPLATE *)ossl_asn1_do_adb(*param_1,pAVar15,1);
            if (pAVar7 == (ASN1_TEMPLATE *)0x0) goto LAB_009f3e34;
            uVar8 = ossl_asn1_get_field_ptr(param_1,pAVar7);
            pcVar1 = local_70;
            if (local_68 == (char *)0x0) break;
            if (((1 < (long)local_68) && (*local_70 == '\0')) && (local_70[1] == '\0')) {
              pcVar1 = local_70 + 2;
              if ((char)local_78 != '\0') {
                local_68 = local_70 + ((long)local_68 - (long)pcVar1);
                local_78 = local_78 & 0xffffff00;
                local_70 = pcVar1;
                goto joined_r0x009f46a0;
              }
              local_70 = pcVar1;
              ERR_new();
              ERR_set_debug("crypto/asn1/tasn_dec.c",0x191,"asn1_item_embed_d2i");
              uVar8 = 0x9f;
              goto LAB_009f3e2c;
            }
            bVar9 = 0;
            if (uVar16 != param_4->tcount - 1U) {
              bVar9 = (byte)pAVar7->flags & 1;
            }
            iVar5 = FUN_009f480c(uVar8,&local_70,local_68,pAVar7,bVar9,param_8,param_9,param_10,
                                 param_11);
            if (iVar5 == -1) {
              ossl_asn1_template_free(uVar8,pAVar7);
            }
            else {
              if (iVar5 == 0) goto LAB_009f47c0;
              local_68 = pcVar1 + ((long)local_68 - (long)local_70);
            }
            uVar16 = uVar16 + 1;
            pAVar15 = pAVar15 + 1;
          } while ((long)uVar16 < param_4->tcount);
        }
        if ((char)local_78 != '\0') {
          if ((((long)local_68 < 2) || (*local_70 != '\0')) || (local_70[1] != '\0')) {
            ERR_new();
            ERR_set_debug("crypto/asn1/tasn_dec.c",0x1b8,"asn1_item_embed_d2i");
            uVar8 = 0x89;
            break;
          }
          local_70 = local_70 + 2;
        }
joined_r0x009f46a0:
        if ((uVar11 != 0) || (local_68 == (char *)0x0)) {
          uVar16 = uVar16 & 0xffffffff;
          if ((long)uVar16 < param_4->tcount) {
            do {
              pAVar7 = (ASN1_TEMPLATE *)ossl_asn1_do_adb(*param_1,pAVar15,1);
              if (pAVar7 == (ASN1_TEMPLATE *)0x0) goto LAB_009f3e34;
              if ((pAVar7->flags & 1) == 0) {
                ERR_new();
                ERR_set_debug("crypto/asn1/tasn_dec.c",0x1d1,"asn1_item_embed_d2i");
                ERR_set_error(0xd,0x79,0);
                goto LAB_009f47c0;
              }
              uVar8 = ossl_asn1_get_field_ptr(param_1,pAVar7);
              ossl_asn1_template_free(uVar8,pAVar7);
              uVar16 = uVar16 + 1;
              pAVar15 = pAVar15 + 1;
            } while ((long)uVar16 < param_4->tcount);
          }
          pcVar1 = local_70;
          iVar5 = ossl_asn1_enc_save(param_1,*param_2,(int)local_70 - (int)*param_2,param_4);
          if ((iVar5 != 0) &&
             ((pcVar14 == (code *)0x0 || (iVar5 = (*pcVar14)(5,param_1,param_4,0), iVar5 != 0)))) {
            *param_2 = (long)pcVar1;
            return 1;
          }
          goto LAB_009f476c;
        }
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x1bd,"asn1_item_embed_d2i");
        uVar8 = 0x94;
      }
    }
    break;
  case '\x02':
    if (iVar5 != -1) {
      ERR_new(0);
      uVar8 = 0x110;
LAB_009f4010:
      ERR_set_debug("crypto/asn1/tasn_dec.c",uVar8,"asn1_item_embed_d2i");
      uVar8 = 0xe6;
      break;
    }
    if ((pcVar14 != (code *)0x0) && (iVar5 = (*pcVar14)(4,param_1,param_4,0), iVar5 == 0)) {
LAB_009f476c:
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x1e1,"asn1_item_embed_d2i");
      uVar8 = 100;
      break;
    }
    if (*param_1 == (ASN1_VALUE *)0x0) {
      iVar5 = ossl_asn1_item_ex_new_intern(param_1,param_4,param_10,param_11);
      if (iVar5 == 0) {
        ERR_new();
        uVar8 = 0x120;
        goto LAB_009f3f1c;
      }
    }
    else {
      iVar5 = ossl_asn1_get_choice_selector(param_1,param_4);
      if ((-1 < iVar5) && ((long)iVar5 < param_4->tcount)) {
        pAVar7 = param_4->templates;
        uVar8 = ossl_asn1_get_field_ptr(param_1,pAVar7 + iVar5);
        ossl_asn1_template_free(uVar8,pAVar7 + iVar5);
        ossl_asn1_set_choice_selector(param_1,0xffffffff,param_4);
      }
    }
    local_70 = (char *)*param_2;
    if (param_4->tcount < 1) {
      uVar16 = 0;
      if (param_4->tcount == 0) {
LAB_009f4494:
        if ((param_7 & 0xff) != 0) {
          ASN1_item_ex_free(param_1,param_4);
          return 0xffffffff;
        }
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x144,"asn1_item_embed_d2i");
        uVar8 = 0x8f;
        break;
      }
LAB_009f4448:
      ossl_asn1_set_choice_selector(param_1,uVar16 & 0xffffffff,param_4);
      if ((pcVar14 == (code *)0x0) || (iVar5 = (*pcVar14)(5,param_1,param_4,0), iVar5 != 0)) {
        *param_2 = (long)local_70;
        return 1;
      }
      goto LAB_009f476c;
    }
    pAVar7 = param_4->templates;
    uVar8 = ossl_asn1_get_field_ptr(param_1,pAVar7);
    iVar5 = FUN_009f480c(uVar8,&local_70,param_3,pAVar7,1,param_8,param_9,param_10,param_11);
    if (iVar5 == -1) {
      uVar4 = 1;
      do {
        uVar16 = uVar4;
        pcVar1 = local_68;
        if (param_4->tcount <= (long)uVar16) {
          if (param_4->tcount != (uVar16 & 0xffffffff)) goto LAB_009f4448;
          goto LAB_009f4494;
        }
        pAVar7 = pAVar7 + 1;
        uVar8 = ossl_asn1_get_field_ptr(param_1,pAVar7);
        iVar5 = FUN_009f480c(uVar8,&local_70,pcVar1,pAVar7,1,param_8,param_9,param_10,param_11);
        uVar4 = uVar16 + 1;
        uVar3 = uVar16;
      } while (iVar5 == -1);
    }
    else {
      uVar3 = 0;
    }
    if (0 < iVar5) {
      uVar16 = uVar3 & 0xffffffff;
      if (param_4->tcount == uVar3) goto LAB_009f4494;
      goto LAB_009f4448;
    }
    ossl_asn1_template_free(uVar8,pAVar7);
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x138,"asn1_item_embed_d2i");
    ERR_set_error(0xd,0x8010a,0);
    if (pAVar7 != (ASN1_TEMPLATE *)0x0) {
LAB_009f47c0:
      ERR_add_error_data(4,"Field=",pAVar7->field_name,", Type=",param_4->sname);
      return 0;
    }
    goto LAB_009f3e34;
  case '\x03':
    goto switchD_009f3eac_caseD_3;
  case '\x04':
    pcVar14 = *(code **)((long)pvVar12 + 0x40);
    if (pcVar14 == (code *)0x0) {
      pcVar14 = *(code **)((long)pvVar12 + 0x20);
    }
    uVar8 = (*pcVar14)(param_1,param_2,param_3,param_4,param_5,param_6,param_7,param_8);
    return uVar8;
  case '\x05':
    if (iVar5 != -1) {
      ERR_new(0);
      uVar8 = 0xe2;
      goto LAB_009f4010;
    }
    local_70 = (char *)*param_2;
    iVar5 = FUN_009f5200(0,&local_78,local_74,0,0,&local_70,param_3,0xffffffff,(ulong)uVar11 << 0x20
                         ,1,param_8);
    if (iVar5 == 0) {
      ERR_new();
      uVar8 = 0xeb;
      goto LAB_009f3f1c;
    }
    if (local_74[0] == '\0') {
      param_5 = (long)(int)local_78;
      uVar16 = 0;
      if (local_78 < 0x1f) {
        uVar16 = *(ulong *)(&DAT_0074e0c0 + param_5 * 8);
      }
      if ((param_4->utype & uVar16) != 0) {
        param_6 = 0;
        param_7 = 0;
        goto LAB_009f41cc;
      }
      if ((param_7 & 0xff) != 0) {
        return 0xffffffff;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0xfd,"asn1_item_embed_d2i");
      uVar8 = 0x8c;
    }
    else {
      if ((param_7 & 0xff) != 0) {
        return 0xffffffff;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0xf4,"asn1_item_embed_d2i");
      uVar8 = 0x8b;
    }
  }
LAB_009f3e2c:
  ERR_set_error(0xd,uVar8,0);
LAB_009f3e34:
  ERR_add_error_data(2,"Type=",param_4->sname);
switchD_009f3eac_caseD_3:
  return 0;
}


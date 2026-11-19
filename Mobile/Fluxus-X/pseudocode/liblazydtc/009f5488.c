/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f5488
 */

undefined8
FUN_009f5488(long *******param_1,long *param_2,char *param_3,ulong *param_4,undefined4 param_5,
            undefined8 param_6,undefined4 param_7,undefined8 param_8,undefined8 param_9)

{
  undefined4 uVar1;
  char *pcVar2;
  char *pcVar3;
  ASN1_VALUE *val;
  int iVar4;
  undefined8 uVar5;
  ASN1_ITEM *pAVar6;
  uint uVar7;
  long *******ppppppplVar8;
  long ******pppppplVar9;
  uint uVar10;
  ASN1_VALUE *local_88;
  char local_7c [4];
  char *local_78;
  long *******local_70;
  char *local_68;
  
  if (param_1 == (long *******)0x0) {
    return 0;
  }
  local_78 = (char *)*param_2;
  uVar7 = (uint)*param_4;
  uVar10 = uVar7 & 0xc0;
  ppppppplVar8 = param_1;
  if ((uVar7 >> 0xc & 1) != 0) {
    ppppppplVar8 = (long *******)&local_70;
    local_70 = param_1;
  }
  local_68 = param_3;
  if ((*param_4 & 6) == 0) {
    uVar5 = (*(code *)param_4[4])();
    if ((uVar7 >> 3 & 1) == 0) {
      uVar5 = FUN_009f3da0(ppppppplVar8,&local_78,param_3,uVar5,0xffffffff,0,param_5,param_6,param_7
                           ,param_8,param_9);
      if ((int)uVar5 == -1) {
        return uVar5;
      }
      if ((int)uVar5 == 0) {
        ERR_new();
        uVar5 = 0x2ad;
        goto LAB_009f5728;
      }
    }
    else {
      uVar5 = FUN_009f3da0(ppppppplVar8,&local_78,param_3,uVar5,(int)param_4[1],uVar10,param_5,
                           param_6,param_7,param_8,param_9);
      if ((int)uVar5 == -1) {
        return uVar5;
      }
      if ((int)uVar5 == 0) {
        ERR_new();
        uVar5 = 0x2a4;
LAB_009f5728:
        ERR_set_debug("crypto/asn1/tasn_dec.c",uVar5,"asn1_template_noexp_d2i");
        uVar5 = 0x8010a;
        goto LAB_009f5738;
      }
    }
LAB_009f581c:
    uVar5 = 1;
    *param_2 = (long)local_78;
  }
  else {
    if ((uVar7 >> 3 & 1) == 0) {
      uVar10 = 0;
      uVar7 = uVar7 >> 1 & 1 | 0x10;
    }
    else {
      uVar7 = (uint)param_4[1];
    }
    uVar5 = FUN_009f5200(&local_68,0,0,local_7c,0,&local_78,param_3,uVar7,uVar10,(char)param_5,
                         param_6);
    if ((int)uVar5 == -1) {
      return uVar5;
    }
    if ((int)uVar5 == 0) {
      ERR_new();
      uVar5 = 0x265;
      goto LAB_009f5728;
    }
    pppppplVar9 = *ppppppplVar8;
    if (pppppplVar9 == (long ******)0x0) {
      pppppplVar9 = (long ******)OPENSSL_sk_new_null();
      *ppppppplVar8 = pppppplVar9;
    }
    else {
      iVar4 = OPENSSL_sk_num(pppppplVar9);
      while (0 < iVar4) {
        local_88 = (ASN1_VALUE *)OPENSSL_sk_pop(pppppplVar9);
        pAVar6 = (ASN1_ITEM *)(*(code *)param_4[4])();
        ASN1_item_ex_free(&local_88,pAVar6);
        iVar4 = OPENSSL_sk_num(pppppplVar9);
      }
      pppppplVar9 = *ppppppplVar8;
    }
    if (pppppplVar9 == (long ******)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x278,"asn1_template_noexp_d2i");
      uVar5 = 0xc0100;
    }
    else {
      pcVar2 = local_78;
      pcVar3 = local_68;
      while( true ) {
        local_78 = pcVar2;
        local_68 = pcVar3;
        if ((long)pcVar3 < 1) {
          if (local_7c[0] == '\0') goto LAB_009f581c;
          ERR_new();
          ERR_set_debug("crypto/asn1/tasn_dec.c",0x29b,"asn1_template_noexp_d2i");
          uVar5 = 0x89;
          goto LAB_009f5738;
        }
        if (((pcVar3 != (char *)0x1) && (*pcVar2 == '\0')) && (pcVar2[1] == '\0')) break;
        local_88 = (ASN1_VALUE *)0x0;
        uVar5 = (*(code *)param_4[4])();
        iVar4 = FUN_009f3da0(&local_88,&local_78,pcVar3,uVar5,0xffffffff,0,0,param_6,param_7,param_8
                             ,param_9);
        if (iVar4 < 1) {
          ERR_new();
          ERR_set_debug("crypto/asn1/tasn_dec.c",0x28e,"asn1_template_noexp_d2i");
          uVar1 = 0x8010a;
          goto LAB_009f57d4;
        }
        local_68 = pcVar2 + ((long)local_68 - (long)local_78);
        iVar4 = OPENSSL_sk_push(*ppppppplVar8,local_88);
        pcVar2 = local_78;
        pcVar3 = local_68;
        if (iVar4 == 0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/tasn_dec.c",0x295,"asn1_template_noexp_d2i");
          uVar1 = 0xc0100;
LAB_009f57d4:
          ERR_set_error(0xd,uVar1,0);
          val = local_88;
          pAVar6 = (ASN1_ITEM *)(*(code *)param_4[4])();
          ASN1_item_free(val,pAVar6);
          return 0;
        }
      }
      local_78 = pcVar2 + 2;
      if (local_7c[0] != '\0') goto LAB_009f581c;
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x283,"asn1_template_noexp_d2i");
      uVar5 = 0x9f;
    }
LAB_009f5738:
    ERR_set_error(0xd,uVar5,0);
    uVar5 = 0;
  }
  return uVar5;
}


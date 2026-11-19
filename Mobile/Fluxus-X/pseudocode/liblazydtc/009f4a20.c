/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f4a20
 */

/* WARNING: Type propagation algorithm not settling */

undefined4
FUN_009f4a20(_union_257 *param_1,undefined8 *param_2,undefined8 param_3,char *param_4,uint param_5,
            undefined4 param_6,char param_7,undefined1 *param_8)

{
  uint uVar1;
  byte *pbVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined8 uVar6;
  code *pcVar7;
  _union_257 *p_Var8;
  ASN1_STRING *a;
  byte *data;
  undefined4 uVar9;
  byte *pbVar10;
  ASN1_STRING *str;
  uint uVar11;
  _union_257 *p_Var12;
  BUF_MEM local_b0;
  undefined8 uStack_98;
  byte *local_90;
  char local_84 [4];
  char local_80 [4];
  char local_7c [4];
  byte *local_78;
  uint local_6c;
  byte *local_68;
  char local_5c [4];
  byte *local_58;
  
  local_84[0] = '\0';
  local_b0.data = (char *)0x0;
  local_b0.length = 0;
  uStack_98 = 0;
  local_b0.max = 0;
  if (param_1 == (_union_257 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x2c8,"asn1_d2i_ex_primitive");
    uVar6 = 0x7d;
    goto LAB_009f4ce4;
  }
  if (*param_4 == '\x05') {
    uVar11 = 0xffffffff;
    local_6c = param_5;
  }
  else {
    local_6c = *(uint *)(param_4 + 8);
    uVar11 = param_5;
  }
  if (local_6c == 0xfffffffc) {
    if (-1 < (int)uVar11) {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x2d6,"asn1_d2i_ex_primitive");
      uVar6 = 0x7f;
      goto LAB_009f4ce4;
    }
    if (param_7 != '\0') {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x2da,"asn1_d2i_ex_primitive");
      uVar6 = 0x7e;
      goto LAB_009f4ce4;
    }
    local_90 = (byte *)*param_2;
    iVar3 = FUN_009f5200(0,&local_6c,&local_58,0,0,&local_90,param_3,0xffffffff,0,0,param_8);
    if (iVar3 == 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x2e1,"asn1_d2i_ex_primitive");
      uVar6 = 0x8010a;
      goto LAB_009f4ce4;
    }
    if ((char)local_58 != '\0') {
      local_6c = 0xfffffffd;
    }
  }
  local_90 = (byte *)*param_2;
  uVar1 = local_6c;
  uVar9 = 0;
  if (uVar11 != 0xffffffff) {
    uVar1 = uVar11;
    uVar9 = param_6;
  }
  iVar3 = FUN_009f5200(&local_78,0,0,local_80,local_7c,&local_90,param_3,uVar1,uVar9,param_7,param_8
                      );
  if (iVar3 == -1) {
    return 0xffffffff;
  }
  if (iVar3 == 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x2f0,"asn1_d2i_ex_primitive");
    ERR_set_error(0xd,0x8010a,0);
    return 0;
  }
  if (1 < local_6c - 0x10) {
    if (local_6c == 0xfffffffd) {
      if (param_8 != (undefined1 *)0x0) {
        *param_8 = 0;
      }
      goto LAB_009f4c6c;
    }
    if (local_7c[0] == '\0') {
      data = local_90;
      pbVar10 = local_78;
      goto LAB_009f4e04;
    }
    if ((local_6c < 0xb) && ((1 << (ulong)(local_6c & 0x1f) & 0x466U) != 0)) {
      ERR_new();
      ERR_set_debug("crypto/asn1/tasn_dec.c",0x313,"asn1_d2i_ex_primitive");
      uVar6 = 0xc3;
      goto LAB_009f4ce4;
    }
    local_84[0] = '\x01';
    iVar3 = FUN_009f5874(&local_b0,&local_90,local_78,local_80[0],0);
    pbVar10 = (byte *)local_b0.length;
    if (iVar3 == 0) goto LAB_009f4f3c;
    iVar3 = BUF_MEM_grow_clean(&local_b0,(size_t)(local_b0.length + 1));
    if (iVar3 != 0) {
      local_b0.data[(long)pbVar10] = 0;
      data = (byte *)local_b0.data;
      goto LAB_009f4e08;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x325,"asn1_d2i_ex_primitive");
    uVar6 = 0xc0100;
LAB_009f4f34:
    ERR_set_error(0xd,uVar6,0);
    goto LAB_009f4f3c;
  }
  if (local_7c[0] == '\0') {
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x301,"asn1_d2i_ex_primitive");
    uVar6 = 0x9c;
LAB_009f4ce4:
    ERR_set_error(0xd,uVar6,0);
    return 0;
  }
LAB_009f4c6c:
  data = (byte *)*param_2;
  if (local_80[0] != '\0') {
    local_5c[0] = local_80[0];
    local_68 = local_90;
    if (0 < (long)local_78) {
      iVar3 = 1;
      pbVar10 = local_78;
      do {
        pbVar2 = local_68;
        if (((pbVar10 == (byte *)0x1) || (*local_68 != 0)) || (local_68[1] != 0)) {
          iVar4 = FUN_009f5200(&local_58,0,0,local_5c,0,&local_68,pbVar10,0xffffffff,0,0,0);
          if (iVar4 == 0) {
            ERR_new();
            uVar6 = 0x3ea;
LAB_009f4f24:
            ERR_set_debug("crypto/asn1/tasn_dec.c",uVar6,"asn1_find_end");
            uVar6 = 0x8010a;
            goto LAB_009f4f34;
          }
          if (local_5c[0] == '\0') {
            local_68 = local_68 + (long)local_58;
          }
          else {
            if (iVar3 == -1) {
              ERR_new();
              uVar6 = 0x3ef;
              goto LAB_009f4f24;
            }
            iVar3 = iVar3 + 1;
          }
          pbVar10 = pbVar2 + ((long)pbVar10 - (long)local_68);
        }
        else {
          local_68 = local_68 + 2;
          iVar3 = iVar3 + -1;
          if (iVar3 == 0) goto LAB_009f5184;
          pbVar10 = pbVar10 + -2;
        }
      } while (0 < (long)pbVar10);
      if (iVar3 == 0) {
LAB_009f5184:
        pbVar10 = local_68 + -(long)data;
        local_90 = local_68;
        goto LAB_009f4e08;
      }
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x3f9,"asn1_find_end");
    uVar6 = 0x89;
    goto LAB_009f4f34;
  }
  pbVar10 = local_90 + ((long)local_78 - (long)data);
LAB_009f4e04:
  local_90 = local_90 + (long)local_78;
LAB_009f4e08:
  uVar11 = local_6c;
  local_58 = data;
  if ((*(long *)(param_4 + 0x20) != 0) &&
     (pcVar7 = *(code **)(*(long *)(param_4 + 0x20) + 0x28), pcVar7 != (code *)0x0)) {
    iVar3 = (*pcVar7)(param_1,data,(ulong)pbVar10 & 0xffffffff,local_6c,local_84,param_4);
    if (iVar3 != 0) goto LAB_009f5154;
    goto LAB_009f4f3c;
  }
  if (*(long *)(param_4 + 8) == -4) {
    a = param_1->asn1_string;
    if (a == (ASN1_STRING *)0x0) {
      a = (ASN1_STRING *)ASN1_TYPE_new();
      if (a == (ASN1_STRING *)0x0) {
        ASN1_TYPE_free((ASN1_TYPE *)0x0);
        goto LAB_009f4f3c;
      }
      param_1->asn1_string = a;
    }
    if (a->length != uVar11) {
      ASN1_TYPE_set((ASN1_TYPE *)a,uVar11,(void *)0x0);
    }
    p_Var8 = (_union_257 *)&a->data;
    p_Var12 = (_union_257 *)&param_1->ptr;
  }
  else {
    a = (ASN1_STRING *)0x0;
    p_Var12 = (_union_257 *)&((_union_257 *)0x0)->ptr;
    p_Var8 = (_union_257 *)&param_1->asn1_string;
  }
  iVar3 = (int)pbVar10;
  switch(uVar11) {
  case 1:
    if (iVar3 == 1) {
      p_Var8->boolean = (uint)*data;
      goto LAB_009f5154;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x36b,"asn1_ex_c2i");
    uVar6 = 0x6a;
    break;
  case 2:
  case 10:
    lVar5 = ossl_c2i_ASN1_INTEGER(p_Var8,&local_58,(long)iVar3);
    if (lVar5 != 0) {
      p_Var8->asn1_string->type = p_Var8->asn1_string->type & 0x100U | uVar11;
joined_r0x009f5148:
      if ((uVar11 == 5) && (a != (ASN1_STRING *)0x0)) {
        (((ASN1_TYPE *)a)->value).ptr = (char *)0x0;
      }
      goto LAB_009f5154;
    }
    goto LAB_009f51ec;
  case 3:
    lVar5 = ossl_c2i_ASN1_BIT_STRING(p_Var8,&local_58,(long)iVar3);
    goto joined_r0x009f4ffc;
  default:
switchD_009f4eb8_caseD_4:
    str = p_Var8->asn1_string;
    if (str == (ASN1_STRING *)0x0) {
      str = ASN1_STRING_type_new(uVar11);
      if (str == (ASN1_STRING *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x3a0,"asn1_ex_c2i");
        uVar6 = 0xc0100;
        break;
      }
      p_Var8->asn1_string = str;
    }
    else {
      str->type = uVar11;
    }
    if (local_84[0] == '\0') {
      iVar3 = ASN1_STRING_set(str,data,iVar3);
      if (iVar3 == 0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/tasn_dec.c",0x3b0,"asn1_ex_c2i");
        ERR_set_error(0xd,0xc0100,0);
        ASN1_STRING_free(str);
        p_Var8->ptr = (char *)0x0;
        goto LAB_009f51ec;
      }
    }
    else {
      CRYPTO_free(str->data);
      str->data = data;
      str->length = iVar3;
      local_84[0] = '\0';
    }
    goto LAB_009f5154;
  case 5:
    if (iVar3 == 0) {
      p_Var8->ptr = (char *)0x1;
      goto joined_r0x009f5148;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x363,"asn1_ex_c2i");
    uVar6 = 0x90;
    break;
  case 6:
    lVar5 = ossl_c2i_ASN1_OBJECT(p_Var8,&local_58,(long)iVar3);
joined_r0x009f4ffc:
    if (lVar5 == 0) goto LAB_009f51ec;
LAB_009f5154:
    uVar9 = 1;
    *param_2 = local_90;
    if (local_84[0] == '\0') {
      return 1;
    }
    goto LAB_009f5168;
  case 0x1c:
    if (((ulong)pbVar10 & 3) == 0) goto switchD_009f4eb8_caseD_4;
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x399,"asn1_ex_c2i");
    uVar6 = 0xd7;
    break;
  case 0x1e:
    if (((ulong)pbVar10 & 1) == 0) goto switchD_009f4eb8_caseD_4;
    ERR_new();
    ERR_set_debug("crypto/asn1/tasn_dec.c",0x395,"asn1_ex_c2i");
    uVar6 = 0xd6;
  }
  ERR_set_error(0xd,uVar6,0);
LAB_009f51ec:
  ASN1_TYPE_free((ASN1_TYPE *)a);
  if (p_Var12 != (_union_257 *)0x0) {
    p_Var12->ptr = (char *)0x0;
  }
LAB_009f4f3c:
  uVar9 = 0;
  if (local_84[0] != '\0') {
LAB_009f5168:
    CRYPTO_free(local_b0.data);
  }
  return uVar9;
}


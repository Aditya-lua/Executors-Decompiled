/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a10a24
 */

ASN1_TYPE * FUN_00a10a24(char *param_1,X509V3_CTX *param_2,int param_3,undefined4 *param_4)

{
  uint constructed;
  int iVar1;
  int iVar2;
  uint uVar3;
  ASN1_SEQUENCE_ANY *a;
  stack_st_CONF_VALUE *section;
  long lVar4;
  ulong mask;
  ASN1_INTEGER *pAVar5;
  uchar *puVar6;
  ASN1_STRING *pAVar7;
  ASN1_OBJECT *pAVar8;
  uchar *puVar9;
  undefined8 uVar10;
  undefined4 uVar11;
  int iVar12;
  ASN1_TYPE *pAVar13;
  uchar **ppuVar14;
  int *piVar15;
  int iStack_290;
  int iStack_28c;
  long local_288;
  uchar *local_280;
  uchar *local_278;
  uchar *local_270;
  undefined8 local_268;
  uint local_260;
  int local_25c;
  uchar *local_258 [3];
  int local_240 [116];
  int local_70;
  CONF_VALUE local_68;
  
  local_270 = (uchar *)0x0;
  local_288 = 0;
  local_268 = 0xffffffffffffffff;
  local_25c = 1;
  local_70 = 0;
  iVar1 = CONF_parse_list(param_1,0x2c,1,FUN_00a11474,&local_268);
  iVar2 = local_25c;
  if (iVar1 != 0) {
    uVar11 = 0xc2;
    goto LAB_00a10a88;
  }
  if ((local_260 & 0xfffffffe) == 0x10) {
    if (param_2 == (X509V3_CTX *)0x0) {
      uVar11 = 0xc0;
LAB_00a10a88:
      *param_4 = uVar11;
      return (ASN1_TYPE *)0x0;
    }
    if (0x31 < param_3) {
      uVar11 = 0xb5;
      goto LAB_00a10a88;
    }
    local_68.section = (char *)0x0;
    a = (ASN1_SEQUENCE_ANY *)OPENSSL_sk_new_null();
    if (a == (ASN1_SEQUENCE_ANY *)0x0) {
      pAVar13 = (ASN1_TYPE *)0x0;
      section = (stack_st_CONF_VALUE *)0x0;
    }
    else {
      section = (stack_st_CONF_VALUE *)0x0;
      if (local_258[0] == (uchar *)0x0) {
LAB_00a10bfc:
        if (local_260 == 0x11) {
          iVar2 = i2d_ASN1_SET_ANY(a,(uchar **)&local_68);
        }
        else {
          iVar2 = i2d_ASN1_SEQUENCE_ANY(a,(uchar **)&local_68);
        }
        if (-1 < iVar2) {
          pAVar13 = ASN1_TYPE_new();
          if (pAVar13 != (ASN1_TYPE *)0x0) {
            pAVar7 = ASN1_STRING_type_new(local_260);
            (pAVar13->value).asn1_string = pAVar7;
            if (pAVar7 != (ASN1_STRING *)0x0) {
              pAVar13->type = local_260;
              pAVar7->data = (uchar *)local_68.section;
              ((pAVar13->value).asn1_string)->length = iVar2;
              local_68.section = (char *)0x0;
            }
          }
          goto LAB_00a10c28;
        }
      }
      else {
        section = X509V3_get_section(param_2,(char *)local_258[0]);
        if (section != (stack_st_CONF_VALUE *)0x0) {
          iVar2 = OPENSSL_sk_num(section);
          if (0 < iVar2) {
            iVar2 = 0;
            do {
              lVar4 = OPENSSL_sk_value(section,iVar2);
              lVar4 = FUN_00a10a24(*(undefined8 *)(lVar4 + 0x10),param_2,param_3 + 1,param_4);
              if ((lVar4 == 0) || (iVar1 = OPENSSL_sk_push(a,lVar4), iVar1 == 0)) goto LAB_00a10c18;
              iVar2 = iVar2 + 1;
              iVar1 = OPENSSL_sk_num(section);
            } while (iVar2 < iVar1);
          }
          goto LAB_00a10bfc;
        }
      }
LAB_00a10c18:
      pAVar13 = (ASN1_TYPE *)0x0;
    }
LAB_00a10c28:
    CRYPTO_free(local_68.section);
    OPENSSL_sk_pop_free(a,ASN1_TYPE_free);
    X509V3_section_free(param_2,section);
joined_r0x00a1103c:
    if (pAVar13 == (ASN1_TYPE *)0x0) {
      return (ASN1_TYPE *)0x0;
    }
    if (((uint)local_268 == -1) && (local_70 == 0)) {
      return pAVar13;
    }
    iVar2 = i2d_ASN1_TYPE(pAVar13,&local_270);
    ASN1_TYPE_free(pAVar13);
    local_68.section = (char *)local_270;
    if ((uint)local_268 == -1) {
      uVar3 = 0;
      iVar1 = iVar2;
    }
    else {
      uVar3 = ASN1_get_object((uchar **)&local_68,&local_288,&iStack_28c,&iStack_290,(long)iVar2);
      if ((uVar3 >> 7 & 1) != 0) {
        pAVar13 = (ASN1_TYPE *)0x0;
        puVar9 = (uchar *)0x0;
        goto LAB_00a112e4;
      }
      iVar1 = iVar2 + ((int)local_270 - (int)local_68.section);
      if ((uVar3 & 1) == 0) {
        uVar3 = uVar3 & 0x20;
      }
      else {
        local_288._0_4_ = 0;
        local_288 = 0;
        uVar3 = 2;
      }
      iVar2 = ASN1_object_size(0,(int)local_288,(uint)local_268);
    }
    if (0 < local_70) {
      iVar12 = 0;
      ppuVar14 = local_258 + (long)local_70 * 3;
      do {
        puVar9 = (uchar *)((long)*(int *)((long)ppuVar14 + -4) + (long)iVar2);
        *ppuVar14 = puVar9;
        iVar2 = ASN1_object_size(0,(int)puVar9,*(int *)(ppuVar14 + -2));
        iVar12 = iVar12 + 1;
        ppuVar14 = ppuVar14 + -3;
      } while (iVar12 < local_70);
    }
    puVar9 = CRYPTO_malloc(iVar2,"crypto/asn1/asn1_gen.c",0xc3);
    if (puVar9 == (uchar *)0x0) {
      pAVar13 = (ASN1_TYPE *)0x0;
    }
    else {
      local_278 = puVar9;
      if (0 < local_70) {
        iVar12 = 0;
        piVar15 = local_240;
        do {
          ASN1_put_object(&local_278,piVar15[-2],*piVar15,piVar15[-4],piVar15[-3]);
          if (piVar15[-1] != 0) {
            *local_278 = '\0';
            local_278 = local_278 + 1;
          }
          iVar12 = iVar12 + 1;
          piVar15 = piVar15 + 6;
        } while (iVar12 < local_70);
      }
      if ((uint)local_268 != 0xffffffff) {
        constructed = 0x20;
        if (local_268._4_4_ != 0 || ((uint)local_268 & 0xfffffffe) != 0x10) {
          constructed = uVar3;
        }
        ASN1_put_object(&local_278,constructed,(int)local_288,(uint)local_268,local_268._4_4_);
      }
      memcpy(local_278,local_68.section,(long)iVar1);
      local_280 = puVar9;
      pAVar13 = d2i_ASN1_TYPE((ASN1_TYPE **)0x0,&local_280,(long)iVar2);
    }
LAB_00a112e4:
    CRYPTO_free(local_270);
    CRYPTO_free(puVar9);
    return pAVar13;
  }
  pAVar13 = ASN1_TYPE_new();
  if (pAVar13 == (ASN1_TYPE *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x248,"asn1_str2type");
    ERR_set_error(0xd,0xc0100,0);
    return (ASN1_TYPE *)0x0;
  }
  puVar9 = "";
  if (local_258[0] != (uchar *)0x0) {
    puVar9 = local_258[0];
  }
  switch(local_260) {
  case 1:
    if (iVar2 == 1) {
      local_68.section = (char *)0x0;
      local_68.name = (char *)0x0;
      local_68.value = (char *)puVar9;
      iVar2 = X509V3_get_value_bool(&local_68,&(pAVar13->value).boolean);
      if (iVar2 != 0) goto LAB_00a10c90;
      ERR_new();
      ERR_set_debug("crypto/asn1/asn1_gen.c",0x261,"asn1_str2type");
      uVar10 = 0xb0;
      goto LAB_00a10f10;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x25a,"asn1_str2type");
    uVar10 = 0xbe;
    break;
  case 2:
  case 10:
    if (iVar2 == 1) {
      pAVar5 = s2i_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,(char *)puVar9);
      (pAVar13->value).integer = pAVar5;
      if (pAVar5 != (ASN1_INTEGER *)0x0) goto LAB_00a10c90;
      ERR_new();
      ERR_set_debug("crypto/asn1/asn1_gen.c",0x26e,"asn1_str2type");
      uVar10 = 0xb4;
      goto LAB_00a10f10;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x269,"asn1_str2type");
    uVar10 = 0xb9;
    break;
  case 3:
  case 4:
    pAVar7 = ASN1_STRING_new();
    (pAVar13->value).asn1_string = pAVar7;
    if (pAVar7 != (ASN1_STRING *)0x0) {
      if (iVar2 != 1) {
        if (iVar2 == 3) {
          puVar6 = (uchar *)OPENSSL_hexstr2buf(puVar9,&local_68);
          if (puVar6 != (uchar *)0x0) {
            ((pAVar13->value).asn1_string)->data = puVar6;
            ((pAVar13->value).asn1_string)->length = (int)local_68.section;
            ((pAVar13->value).asn1_string)->type = local_260;
            if (local_260 == 3) goto LAB_00a11018;
            goto LAB_00a10c90;
          }
          ERR_new();
          ERR_set_debug("crypto/asn1/asn1_gen.c",0x2b7,"asn1_str2type");
          uVar10 = 0xb2;
        }
        else {
          if ((local_260 != 3) || (iVar2 != 4)) {
            ERR_new();
            ERR_set_debug("crypto/asn1/asn1_gen.c",0x2cc,"asn1_str2type");
            uVar10 = 0xaf;
            break;
          }
          iVar2 = CONF_parse_list((char *)puVar9,0x2c,1,(list_cb *)&LAB_00a11a80,pAVar7);
          if (iVar2 != 0) goto LAB_00a10c90;
          ERR_new();
          ERR_set_debug("crypto/asn1/asn1_gen.c",0x2c6,"asn1_str2type");
          uVar10 = 0xbc;
        }
        goto LAB_00a10f10;
      }
      iVar2 = ASN1_STRING_set(pAVar7,puVar9,-1);
      if (iVar2 == 0) {
        ERR_new();
        uVar10 = 0x2bf;
        goto LAB_00a10cdc;
      }
      if (local_260 != 3) goto LAB_00a10c90;
LAB_00a11018:
      ((pAVar13->value).asn1_string)->flags =
           ((pAVar13->value).asn1_string)->flags & 0xfffffffffffffff0;
      ((pAVar13->value).asn1_string)->flags = ((pAVar13->value).asn1_string)->flags | 8;
      pAVar13->type = local_260;
      goto joined_r0x00a1103c;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x2b1,"asn1_str2type");
    uVar10 = 0xc0100;
    break;
  case 5:
    if (*puVar9 == '\0') {
LAB_00a10c90:
      pAVar13->type = local_260;
      goto joined_r0x00a1103c;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x253,"asn1_str2type");
    uVar10 = 0xb6;
    break;
  case 6:
    if (iVar2 == 1) {
      pAVar8 = OBJ_txt2obj((char *)puVar9,0);
      (pAVar13->value).object = pAVar8;
      if (pAVar8 != (ASN1_OBJECT *)0x0) goto LAB_00a10c90;
      ERR_new();
      ERR_set_debug("crypto/asn1/asn1_gen.c",0x279,"asn1_str2type");
      uVar10 = 0xb7;
      goto LAB_00a10f10;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x275,"asn1_str2type");
    uVar10 = 0xbf;
    break;
  default:
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x2d9,"asn1_str2type");
    uVar10 = 0xc4;
    goto LAB_00a10f10;
  case 0xc:
  case 0x12:
  case 0x13:
  case 0x14:
  case 0x16:
  case 0x1a:
  case 0x1b:
  case 0x1c:
  case 0x1e:
    if (iVar2 == 1) {
      iVar2 = 0x1001;
    }
    else {
      if (iVar2 != 2) {
        ERR_new();
        ERR_set_debug("crypto/asn1/asn1_gen.c",0x2a2,"asn1_str2type");
        uVar10 = 0xb1;
        break;
      }
      iVar2 = 0x1000;
    }
    mask = ASN1_tag2bit(local_260);
    iVar2 = ASN1_mbstring_copy(&(pAVar13->value).asn1_string,puVar9,-1,iVar2,mask);
    if (0 < iVar2) goto LAB_00a10c90;
    ERR_new();
    uVar10 = 0x2a8;
LAB_00a10cdc:
    ERR_set_debug("crypto/asn1/asn1_gen.c",uVar10,"asn1_str2type");
    uVar10 = 0xc0100;
LAB_00a10f10:
    ERR_set_error(0xd,uVar10,0);
    ERR_add_error_data(2,"string=",puVar9);
    goto LAB_00a110fc;
  case 0x17:
  case 0x18:
    if (iVar2 == 1) {
      pAVar7 = ASN1_STRING_new();
      (pAVar13->value).asn1_string = pAVar7;
      if (pAVar7 == (ASN1_STRING *)0x0) {
        ERR_new();
        uVar10 = 0x285;
      }
      else {
        iVar2 = ASN1_STRING_set(pAVar7,puVar9,-1);
        if (iVar2 != 0) {
          ((pAVar13->value).asn1_string)->type = local_260;
          iVar2 = ASN1_TIME_check((pAVar13->value).asn1_string);
          if (iVar2 != 0) goto LAB_00a10c90;
          ERR_new();
          ERR_set_debug("crypto/asn1/asn1_gen.c",0x28e,"asn1_str2type");
          uVar10 = 0xb8;
          goto LAB_00a10f10;
        }
        ERR_new();
        uVar10 = 0x289;
      }
      goto LAB_00a10cdc;
    }
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_gen.c",0x281,"asn1_str2type");
    uVar10 = 0xc1;
  }
  ERR_set_error(0xd,uVar10,0);
LAB_00a110fc:
  ASN1_TYPE_free(pAVar13);
  return (ASN1_TYPE *)0x0;
}


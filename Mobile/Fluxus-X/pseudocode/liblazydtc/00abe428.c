/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abe428
 */

/* WARNING: Type propagation algorithm not settling */

ulong FUN_00abe428(BIO *param_1,uchar **param_2,int param_3,byte *param_4,long param_5,char *param_6
                  ,int param_7,byte *param_8)

{
  byte bVar1;
  int *piVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  undefined8 uVar6;
  char *pcVar7;
  char *pcVar8;
  uint param2;
  long lVar9;
  ASN1_OBJECT *o;
  ASN1_INTEGER *a;
  long lVar10;
  code *pcVar11;
  BIO *local_c8;
  int local_c0;
  byte *local_b8;
  char acStack_b0 [80];
  
  lVar10 = *(long *)(param_4 + 0x20);
  if (lVar10 == 0) {
    pcVar11 = (code *)0x0;
    param2 = (uint)*param_4;
    if (*param_4 == 0) goto LAB_00abe4a8;
LAB_00abe4b4:
    if (*param_2 != (uchar *)0x0) {
      switch(param2) {
      case 0:
        goto switchD_00abe4d4_caseD_0;
      case 1:
      case 6:
        if ((param_7 == 0) &&
           (uVar4 = FUN_00abead4(param_1,param_3,param_5,param_6,param_8), (int)uVar4 == 0)) {
          return uVar4;
        }
        if (param_5 != 0 || param_6 != (char *)0x0) {
          if ((*param_8 >> 1 & 1) == 0) {
            pcVar8 = "\n";
          }
          else {
            pcVar8 = " {\n";
          }
          iVar3 = BIO_puts(param_1,pcVar8);
          if (iVar3 < 1) {
            return 0;
          }
        }
        if (pcVar11 != (code *)0x0) {
          uVar4 = (*pcVar11)(8,param_2,param_4,&local_c8);
          if ((int)uVar4 == 0) {
            return uVar4;
          }
          if ((int)uVar4 == 2) {
            return 1;
          }
        }
        if (0 < *(long *)(param_4 + 0x18)) {
          lVar9 = *(long *)(param_4 + 0x10);
          lVar10 = 0;
          do {
            lVar5 = ossl_asn1_do_adb(*param_2,lVar9,1);
            if (lVar5 == 0) {
              return 0;
            }
            uVar6 = ossl_asn1_get_const_field_ptr(param_2,lVar5);
            uVar4 = FUN_00abec10(param_1,uVar6,param_3 + 2,lVar5,param_8);
            if ((int)uVar4 == 0) {
              return uVar4;
            }
            lVar10 = lVar10 + 1;
            lVar9 = lVar9 + 0x28;
          } while (lVar10 < *(long *)(param_4 + 0x18));
        }
        if (((*param_8 >> 1 & 1) != 0) &&
           (iVar3 = BIO_printf(param_1,"%*s}\n",param_3,""), iVar3 < 0)) {
          return 0;
        }
        if (pcVar11 == (code *)0x0) {
          return 1;
        }
        uVar4 = (*pcVar11)(9,param_2,param_4,&local_c8);
        iVar3 = (int)uVar4;
        goto joined_r0x00abe8d0;
      case 2:
        iVar3 = ossl_asn1_get_choice_selector_const(param_2,param_4);
        if ((iVar3 < 0) || (*(long *)(param_4 + 0x18) <= (long)iVar3)) {
          iVar3 = BIO_printf(param_1,"ERROR: selector [%d] invalid\n",iVar3);
          return (ulong)(0 < iVar3);
        }
        lVar9 = *(long *)(param_4 + 0x10) + (long)iVar3 * 0x28;
        param_2 = (uchar **)ossl_asn1_get_const_field_ptr(param_2,lVar9);
        goto LAB_00abe56c;
      default:
        BIO_printf(param_1,"Unprocessed type %d\n",param2);
        return 0;
      case 4:
        goto switchD_00abe4d4_caseD_4;
      case 5:
        goto switchD_00abe4d4_caseD_5;
      }
    }
    if ((*param_8 & 1) == 0) {
      return 1;
    }
    if ((param_7 == 0) &&
       (uVar4 = FUN_00abead4(param_1,param_3,param_5,param_6,param_8), (int)uVar4 == 0)) {
      return uVar4;
    }
    pcVar8 = "<ABSENT>\n";
    goto LAB_00abe544;
  }
  lVar9 = 0x18;
  if ((*(byte *)(lVar10 + 8) & 8) != 0) {
    lVar9 = 0x28;
  }
  pcVar11 = *(code **)(lVar10 + lVar9);
  param2 = (uint)*param_4;
  local_c8 = param_1;
  local_c0 = param_3;
  local_b8 = param_8;
  if (*param_4 != 0) goto LAB_00abe4b4;
LAB_00abe4a8:
  if (*(long *)(param_4 + 8) != 1) goto LAB_00abe4b4;
switchD_00abe4d4_caseD_0:
  lVar9 = *(long *)(param_4 + 0x10);
  if (lVar9 != 0) {
LAB_00abe56c:
    uVar4 = FUN_00abec10(param_1,param_2,param_3,lVar9,param_8);
    iVar3 = (int)uVar4;
    goto joined_r0x00abe8d0;
  }
switchD_00abe4d4_caseD_5:
  uVar4 = FUN_00abead4(param_1,param_3,param_5,param_6,param_8);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  if ((lVar10 != 0) && (*(code **)(lVar10 + 0x38) != (code *)0x0)) {
    uVar4 = (**(code **)(lVar10 + 0x38))(param_1,param_2,param_4,param_3,param_8);
    iVar3 = (int)uVar4;
joined_r0x00abe8d0:
    if (iVar3 == 0) {
      return uVar4;
    }
    return 1;
  }
  if (*param_4 == 5) {
    a = (ASN1_INTEGER *)*param_2;
    uVar4 = (long)a->type & 0xfffffffffffffeff;
    bVar1 = *param_8;
joined_r0x00abe7b0:
    if ((bVar1 >> 3 & 1) == 0) {
      pcVar8 = (char *)0x0;
    }
    else {
      pcVar8 = ASN1_tag2str((int)uVar4);
    }
  }
  else {
    uVar4 = *(ulong *)(param_4 + 8);
    if (uVar4 == 1) {
      a = (ASN1_INTEGER *)0x0;
      bVar1 = *param_8;
      goto joined_r0x00abe7b0;
    }
    a = (ASN1_INTEGER *)*param_2;
    if (uVar4 != 0xfffffffffffffffc) {
      bVar1 = *param_8;
      goto joined_r0x00abe7b0;
    }
    piVar2 = &a->length;
    uVar4 = (ulong)*piVar2;
    param_2 = &a->data;
    a = (ASN1_INTEGER *)*param_2;
    if ((*param_8 >> 4 & 1) == 0) {
      pcVar8 = ASN1_tag2str(*piVar2);
    }
    else {
      pcVar8 = (char *)0x0;
    }
  }
  if (uVar4 == 5) {
    iVar3 = BIO_puts(param_1,"NULL\n");
    if (iVar3 < 1) {
      return 0;
    }
    return 1;
  }
  if (pcVar8 != (char *)0x0) {
    iVar3 = BIO_puts(param_1,pcVar8);
    if (iVar3 < 1) {
      return 0;
    }
    iVar3 = BIO_puts(param_1,":");
    if (iVar3 < 1) {
      return 0;
    }
  }
  switch(uVar4) {
  case 1:
    iVar3 = *(int *)param_2;
    if (iVar3 == -1) {
      iVar3 = *(int *)(param_4 + 0x28);
    }
    pcVar8 = "FALSE";
    if (iVar3 != 0) {
      pcVar8 = "TRUE";
    }
    pcVar7 = "BOOL ABSENT";
    if (iVar3 != -1) {
      pcVar7 = pcVar8;
    }
    iVar3 = BIO_puts(param_1,pcVar7);
    goto joined_r0x00abe964;
  case 2:
  case 10:
    pcVar8 = i2s_ASN1_INTEGER((X509V3_EXT_METHOD *)0x0,a);
    if (pcVar8 == (char *)0x0) {
      return 0;
    }
    iVar3 = BIO_puts(param_1,pcVar8);
    CRYPTO_free(pcVar8);
    goto joined_r0x00abe964;
  case 3:
  case 4:
    if (a->type == 3) {
      iVar3 = BIO_printf(param_1," (%ld unused bits)\n",a->flags & 7);
    }
    else {
      iVar3 = BIO_puts(param_1,"\n");
    }
    if (iVar3 < 1) {
      return 0;
    }
    if (a->length < 1) {
      return 1;
    }
    iVar3 = BIO_dump_indent(param_1,(char *)a->data,a->length,param_3 + 2);
    goto joined_r0x00abe794;
  case 6:
    o = (ASN1_OBJECT *)*param_2;
    iVar3 = OBJ_obj2nid(o);
    pcVar7 = OBJ_nid2ln(iVar3);
    pcVar8 = "";
    if (pcVar7 != (char *)0x0) {
      pcVar8 = pcVar7;
    }
    OBJ_obj2txt(acStack_b0,0x50,o,1);
    iVar3 = BIO_printf(param_1,"%s (%s)",pcVar8,acStack_b0);
joined_r0x00abe964:
    if (iVar3 < 1) {
      return 0;
    }
    goto LAB_00abea84;
  case 0x17:
    iVar3 = ASN1_UTCTIME_print(param_1,a);
    break;
  case 0x18:
    iVar3 = ASN1_GENERALIZEDTIME_print(param_1,a);
    break;
  case 0xfffffffffffffffd:
  case 0x10:
  case 0x11:
    iVar3 = BIO_puts(param_1,"\n");
    if (iVar3 < 1) {
      return 0;
    }
    iVar3 = ASN1_parse_dump(param_1,a->data,(long)a->length,param_3,0);
    goto joined_r0x00abe794;
  default:
    iVar3 = ASN1_STRING_print_ex(param_1,a,*(ulong *)(param_8 + 0x20));
  }
  if (iVar3 != 0) {
LAB_00abea84:
    pcVar8 = "\n";
LAB_00abe544:
    iVar3 = BIO_puts(param_1,pcVar8);
joined_r0x00abe794:
    if (0 < iVar3) {
      return 1;
    }
  }
  return 0;
switchD_00abe4d4_caseD_4:
  if (param_7 == 0) {
    uVar4 = FUN_00abead4(param_1,param_3,param_5,param_6,param_8);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    lVar10 = *(long *)(param_4 + 0x20);
  }
  if ((lVar10 == 0) || (*(code **)(lVar10 + 0x30) == (code *)0x0)) {
    if (param_6 == (char *)0x0) {
      return 1;
    }
    iVar3 = BIO_printf(param_1,":EXTERNAL TYPE %s\n",param_6);
    goto joined_r0x00abe794;
  }
  uVar4 = (**(code **)(lVar10 + 0x30))(param_1,param_2,param_3,&DAT_002ab32c,param_8);
  if ((int)uVar4 == 0) {
    return uVar4;
  }
  if ((int)uVar4 != 2) {
    return 1;
  }
  goto LAB_00abea84;
}


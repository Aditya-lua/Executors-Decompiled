/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f15d0
 */

undefined4
FUN_009f15d0(BIO *param_1,long *param_2,long param_3,int param_4,int param_5,int param_6,int param_7
            )

{
  bool bVar1;
  byte *pbVar2;
  uint uVar3;
  long larg;
  byte bVar4;
  bool bVar5;
  byte *pbVar6;
  uint uVar7;
  byte *pbVar8;
  byte *pbVar9;
  uint uVar10;
  int iVar11;
  long lVar12;
  long lVar13;
  BIO_METHOD *type;
  BIO *bp;
  ASN1_OBJECT *pAVar14;
  char *pcVar15;
  long lVar16;
  byte *pbVar17;
  BIO *b;
  ASN1_ENUMERATED *a;
  char *buf;
  ASN1_OCTET_STRING *a_00;
  ASN1_INTEGER *a_01;
  undefined4 uVar18;
  ASN1_OBJECT *local_110;
  uint local_108;
  uint local_104;
  byte *local_100;
  byte *local_f8;
  byte *local_f0;
  char acStack_e8 [136];
  
  local_110 = (ASN1_OBJECT *)0x0;
  if (0x80 < param_5) {
    BIO_puts(param_1,"BAD RECURSION DEPTH\n");
    return 0;
  }
  pbVar17 = (byte *)*param_2;
  local_f0 = pbVar17;
  if (param_3 < 1) {
LAB_009f2040:
    a_00 = (ASN1_STRING *)0x0;
    a_01 = (ASN1_STRING *)0x0;
    a = (ASN1_STRING *)0x0;
    uVar18 = 1;
LAB_009f2074:
    ASN1_OBJECT_free(local_110);
    ASN1_OCTET_STRING_free(a_00);
    ASN1_INTEGER_free(a_01);
    ASN1_ENUMERATED_free(a);
    *param_2 = (long)local_f0;
    return uVar18;
  }
  larg = 0;
  if (param_6 != 0) {
    larg = (long)param_5;
  }
  uVar10 = ASN1_get_object(&local_f0,(long *)&local_100,(int *)&local_104,(int *)&local_108,param_3)
  ;
  if ((uVar10 >> 7 & 1) != 0) {
LAB_009f2054:
    BIO_puts(param_1,"Error in encoding\n");
LAB_009f2068:
    a_00 = (ASN1_OCTET_STRING *)0x0;
LAB_009f206c:
    a_01 = (ASN1_INTEGER *)0x0;
LAB_009f2070:
    uVar18 = 0;
    a = (ASN1_STRING *)0x0;
    goto LAB_009f2074;
  }
  pbVar2 = pbVar17 + param_3;
LAB_009f1698:
  uVar7 = local_104;
  uVar3 = local_108;
  lVar16 = (long)((int)local_f0 - (int)pbVar17);
  pcVar15 = "prim: ";
  if ((uVar10 & 0x20) != 0) {
    pcVar15 = "cons: ";
  }
  if (uVar10 == 0x21) {
    iVar11 = BIO_snprintf(acStack_e8,0x80,"%5ld:d=%-2d hl=%ld l=inf  %s",
                          (long)(pbVar17 + ((long)param_4 - *param_2)),param_5,lVar16,pcVar15);
    if (0 < iVar11) goto LAB_009f1700;
LAB_009f17b8:
    bVar1 = false;
    b = (BIO *)0x0;
  }
  else {
    iVar11 = BIO_snprintf(acStack_e8,0x80,"%5ld:d=%-2d hl=%ld l=%4ld %s",
                          (long)(pbVar17 + ((long)param_4 - *param_2)),param_5,lVar16,
                          (long)local_100,pcVar15);
    if (iVar11 < 1) goto LAB_009f17b8;
LAB_009f1700:
    if (param_1 == (BIO *)0x0) {
      bp = (BIO *)0x0;
      bVar5 = false;
      b = (BIO *)0x0;
      lVar12 = -1;
LAB_009f17d8:
      if ((~uVar3 & 0xc0) == 0) {
        pcVar15 = "priv [ %d ] ";
LAB_009f188c:
        buf = acStack_e8;
        BIO_snprintf(buf,0x80,pcVar15,(ulong)uVar7);
      }
      else {
        if ((uVar3 >> 7 & 1) != 0) {
          pcVar15 = "cont [ %d ]";
          goto LAB_009f188c;
        }
        if ((uVar3 >> 6 & 1) != 0) {
          pcVar15 = "appl [ %d ]";
          goto LAB_009f188c;
        }
        if (0x1e < (int)uVar7) {
          pcVar15 = "<ASN1 %d>";
          goto LAB_009f188c;
        }
        uVar3 = uVar7 & 0xfffffeff;
        if ((uVar7 | 8) != 0x10a) {
          uVar3 = uVar7;
        }
        buf = "(unknown)";
        if (uVar3 < 0x1f) {
          buf = (&PTR_DAT_00c58948)[(int)uVar3];
        }
      }
      iVar11 = BIO_printf(bp,"%-18s",buf);
      bVar1 = 0 < iVar11;
    }
    else {
      lVar12 = BIO_ctrl(param_1,0x4f,0,acStack_e8);
      if (lVar12 < 1) {
        type = (BIO_METHOD *)BIO_f_prefix();
        b = BIO_new(type);
        if ((b == (BIO *)0x0) || (bp = BIO_push(b,param_1), bp == (BIO *)0x0)) {
          bVar1 = false;
          goto LAB_009f18dc;
        }
        bVar5 = true;
      }
      else {
        bVar5 = false;
        b = (BIO *)0x0;
        bp = param_1;
      }
      lVar12 = BIO_ctrl(bp,0x51,0,(void *)0x0);
      lVar13 = BIO_ctrl(bp,0x4f,0,acStack_e8);
      if ((0 < lVar13) && (lVar13 = BIO_ctrl(bp,0x50,larg,(void *)0x0), 0 < lVar13))
      goto LAB_009f17d8;
      bVar1 = false;
    }
    if (-1 < lVar12) {
      BIO_ctrl(bp,0x50,lVar12,(void *)0x0);
    }
    if (bVar5) {
      BIO_pop(bp);
    }
  }
LAB_009f18dc:
  BIO_free(b);
  pbVar9 = local_f0;
  pbVar8 = local_100;
  if (!bVar1) goto LAB_009f2068;
  param_3 = param_3 - lVar16;
  if ((uVar10 >> 5 & 1) != 0) {
    iVar11 = BIO_write(param_1,&DAT_002c4dae,1);
    if (0 < iVar11) {
      if ((long)local_100 <= param_3) {
        if ((uVar10 == 0x21) && (local_100 == (byte *)0x0)) {
          do {
            iVar11 = FUN_009f15d0(param_1,&local_f0,(long)pbVar2 - (long)local_f0,
                                  ((int)local_f0 - (int)*param_2) + param_4,param_5 + 1,param_6,
                                  param_7);
            if (iVar11 == 0) goto LAB_009f2068;
          } while ((iVar11 != 2) && (local_f0 < pbVar2));
          local_100 = local_f0 + -(long)pbVar9;
        }
        else {
          pbVar17 = local_100;
          pbVar6 = local_f0;
          while (local_f0 = pbVar6, pbVar6 < pbVar9 + (long)pbVar8) {
            iVar11 = FUN_009f15d0(param_1,&local_f0,pbVar17,((int)pbVar6 - (int)*param_2) + param_4,
                                  param_5 + 1,param_6,param_7);
            if (iVar11 == 0) goto LAB_009f2068;
            pbVar17 = pbVar6 + ((long)pbVar17 - (long)local_f0);
            pbVar6 = local_f0;
          }
        }
        goto LAB_009f1f4c;
      }
      BIO_printf(param_1,"length is greater than %ld\n",param_3);
    }
    goto LAB_009f2068;
  }
  if (local_108 != 0) {
    local_f0 = local_f0 + (long)local_100;
    iVar11 = BIO_write(param_1,&DAT_002c4dae,1);
    if (0 < iVar11) goto LAB_009f1f4c;
    goto LAB_009f2068;
  }
  switch(local_104) {
  case 1:
    bVar1 = false;
    if (local_100 != (byte *)0x1) {
      iVar11 = BIO_puts(param_1,":BAD BOOLEAN");
      if (iVar11 < 1) goto LAB_009f2068;
      if ((long)local_100 < 1) goto LAB_009f1ea8;
      bVar1 = true;
    }
    BIO_printf(param_1,":%u",(ulong)*local_f0);
    if (!bVar1) break;
LAB_009f1ea8:
    iVar11 = BIO_puts(param_1,":[");
    if (iVar11 < 1) goto LAB_009f2068;
    if (0 < (long)local_100) {
      lVar12 = 0;
      do {
        iVar11 = BIO_printf(param_1,"%02X",(ulong)pbVar17[lVar12 + lVar16]);
        if (iVar11 < 1) goto LAB_009f2068;
        lVar12 = lVar12 + 1;
      } while (lVar12 < (long)local_100);
    }
    iVar11 = BIO_puts(param_1,"]");
    if (iVar11 < 1) goto LAB_009f2068;
    break;
  case 2:
    local_f8 = pbVar17;
    a_01 = d2i_ASN1_INTEGER((ASN1_INTEGER **)0x0,&local_f8,(long)(local_100 + lVar16));
    if (a_01 == (ASN1_INTEGER *)0x0) {
      iVar11 = BIO_puts(param_1,":BAD INTEGER");
      if (iVar11 < 1) goto LAB_009f2068;
      bVar1 = true;
    }
    else {
      iVar11 = BIO_write(param_1,&DAT_002bcda4,1);
      if ((iVar11 < 1) ||
         ((a_01->type == 0x102 && (iVar11 = BIO_write(param_1,&DAT_002ccc8b,1), iVar11 < 1)))) {
LAB_009f20f4:
        a_00 = (ASN1_OCTET_STRING *)0x0;
        goto LAB_009f2070;
      }
      iVar11 = a_01->length;
      if (0 < iVar11) {
        lVar12 = 0;
        do {
          iVar11 = BIO_printf(param_1,"%02X",(ulong)a_01->data[lVar12]);
          if (iVar11 < 1) goto LAB_009f20f4;
          iVar11 = a_01->length;
          lVar12 = lVar12 + 1;
        } while (lVar12 < iVar11);
      }
      bVar1 = false;
      if (iVar11 == 0) {
        iVar11 = BIO_write(param_1,&DAT_002bb974,2);
        if (iVar11 < 1) goto LAB_009f20f4;
        bVar1 = false;
      }
    }
    ASN1_INTEGER_free(a_01);
    if (bVar1) goto LAB_009f1ea8;
    break;
  default:
    if ((param_7 == 0) || ((long)local_100 < 1)) break;
    iVar11 = BIO_write(param_1,&DAT_002c4dae,1);
    if (0 < iVar11) {
      iVar11 = (int)local_100;
      if ((long)param_7 <= (long)local_100 && param_7 != -1) {
        iVar11 = param_7;
      }
      iVar11 = BIO_dump_indent(param_1,(char *)local_f0,iVar11,6);
      if (0 < iVar11) goto LAB_009f1f30;
    }
    goto LAB_009f2068;
  case 4:
    local_f8 = pbVar17;
    a_00 = d2i_ASN1_OCTET_STRING((ASN1_OCTET_STRING **)0x0,&local_f8,(long)(local_100 + lVar16));
    if ((a_00 != (ASN1_OCTET_STRING *)0x0) && (0 < a_00->length)) {
      local_f8 = a_00->data;
      lVar16 = 0;
      do {
        bVar4 = local_f8[lVar16];
        if (bVar4 < 0x20) {
          if ((0xd < bVar4) || ((1 << (ulong)(bVar4 & 0x1f) & 0x2600U) == 0)) goto LAB_009f1f88;
        }
        else if (0x7e < bVar4) {
LAB_009f1f88:
          if (param_7 == 0) {
            iVar11 = BIO_write(param_1,"[HEX DUMP]:",0xb);
            if (iVar11 < 1) goto LAB_009f206c;
            if (a_00->length < 1) goto LAB_009f1d18;
            lVar16 = 0;
            goto LAB_009f200c;
          }
          iVar11 = BIO_write(param_1,&DAT_002c4dae,1);
          if (iVar11 < 1) goto LAB_009f206c;
          iVar11 = a_00->length;
          if (param_7 <= a_00->length && param_7 != -1) {
            iVar11 = param_7;
          }
          iVar11 = BIO_dump_indent(param_1,(char *)local_f8,iVar11,6);
          if (iVar11 < 1) goto LAB_009f206c;
          ASN1_OCTET_STRING_free(a_00);
          goto LAB_009f1f30;
        }
        lVar16 = lVar16 + 1;
      } while (lVar16 < a_00->length);
      iVar11 = BIO_write(param_1,&DAT_002bcda4,1);
      if ((0 < iVar11) && (iVar11 = BIO_write(param_1,local_f8,a_00->length), 0 < iVar11))
      goto LAB_009f1d18;
      goto LAB_009f206c;
    }
    goto LAB_009f1d18;
  case 6:
    local_f8 = pbVar17;
    pAVar14 = d2i_ASN1_OBJECT(&local_110,&local_f8,(long)(local_100 + lVar16));
    if (pAVar14 == (ASN1_OBJECT *)0x0) {
      iVar11 = BIO_puts(param_1,":BAD OBJECT");
      if (0 < iVar11) goto LAB_009f1ea8;
      goto LAB_009f2068;
    }
    iVar11 = BIO_write(param_1,&DAT_002bcda4,1);
    if (iVar11 < 1) goto LAB_009f2068;
    i2a_ASN1_OBJECT(param_1,local_110);
    break;
  case 10:
    local_f8 = pbVar17;
    a = d2i_ASN1_ENUMERATED((ASN1_ENUMERATED **)0x0,&local_f8,(long)(local_100 + lVar16));
    if (a == (ASN1_ENUMERATED *)0x0) {
      iVar11 = BIO_puts(param_1,":BAD ENUMERATED");
      if (iVar11 < 1) goto LAB_009f2068;
      bVar1 = true;
    }
    else {
      iVar11 = BIO_write(param_1,&DAT_002bcda4,1);
      if ((iVar11 < 1) ||
         ((a->type == 0x10a && (iVar11 = BIO_write(param_1,&DAT_002ccc8b,1), iVar11 < 1)))) {
LAB_009f2100:
        uVar18 = 0;
        a_00 = (ASN1_STRING *)0x0;
        a_01 = (ASN1_STRING *)0x0;
        goto LAB_009f2074;
      }
      iVar11 = a->length;
      if (0 < iVar11) {
        lVar12 = 0;
        do {
          iVar11 = BIO_printf(param_1,"%02X",(ulong)a->data[lVar12]);
          if (iVar11 < 1) goto LAB_009f2100;
          iVar11 = a->length;
          lVar12 = lVar12 + 1;
        } while (lVar12 < iVar11);
      }
      bVar1 = false;
      if (iVar11 == 0) {
        iVar11 = BIO_write(param_1,&DAT_002bb974,2);
        if (iVar11 < 1) goto LAB_009f2100;
        bVar1 = false;
      }
    }
    ASN1_ENUMERATED_free(a);
    if (bVar1) goto LAB_009f1ea8;
    break;
  case 0xc:
  case 0x12:
  case 0x13:
  case 0x14:
  case 0x16:
  case 0x17:
  case 0x18:
  case 0x1a:
    iVar11 = BIO_write(param_1,&DAT_002bcda4,1);
    if (iVar11 < 1) goto LAB_009f2068;
    if (0 < (long)local_100) {
      iVar11 = BIO_write(param_1,local_f0,(int)local_100);
      if (iVar11 != (int)local_100) goto LAB_009f2068;
    }
    break;
  case 0x1e:
    break;
  }
  goto switchD_009f1a5c_caseD_1e;
  while (lVar16 = lVar16 + 1, lVar16 < a_00->length) {
LAB_009f200c:
    iVar11 = BIO_printf(param_1,"%02X",(ulong)local_f8[lVar16]);
    if (iVar11 < 1) goto LAB_009f206c;
  }
LAB_009f1d18:
  ASN1_OCTET_STRING_free(a_00);
switchD_009f1a5c_caseD_1e:
  iVar11 = BIO_write(param_1,&DAT_002c4dae,1);
  if (iVar11 < 1) goto LAB_009f2068;
LAB_009f1f30:
  local_f0 = local_f0 + (long)local_100;
  if (local_108 == 0 && local_104 == 0) {
    a_00 = (ASN1_STRING *)0x0;
    a_01 = (ASN1_STRING *)0x0;
    a = (ASN1_STRING *)0x0;
    uVar18 = 2;
    goto LAB_009f2074;
  }
LAB_009f1f4c:
  pbVar17 = local_f0;
  param_3 = param_3 - (long)local_100;
  if (param_3 < 1) goto LAB_009f2040;
  uVar10 = ASN1_get_object(&local_f0,(long *)&local_100,(int *)&local_104,(int *)&local_108,param_3)
  ;
  if ((uVar10 >> 7 & 1) != 0) goto LAB_009f2054;
  goto LAB_009f1698;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009edd6c
 */

int ASN1_mbstring_ncopy(ASN1_STRING **out,uchar *in,int len,int inform,ulong mask,long minsize,
                       long maxsize)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  char *pcVar5;
  uint uVar6;
  ulong uVar7;
  ASN1_STRING *a;
  undefined *puVar8;
  uint uVar9;
  uchar *str;
  byte *str_00;
  byte *pbVar10;
  ulong uVar11;
  uint len_00;
  uint uVar12;
  uint uVar13;
  ulong local_70;
  uchar *local_68;
  
  uVar7 = (ulong)(uint)len;
  local_70 = mask;
  if (len == -1) {
    uVar7 = strlen((char *)in);
    if (mask == 0) goto LAB_009eddd0;
LAB_009eddb8:
    iVar2 = (int)uVar7;
  }
  else {
    if (mask != 0) goto LAB_009eddb8;
LAB_009eddd0:
    local_70 = 0x2806;
    iVar2 = (int)uVar7;
  }
  if (iVar2 < 0) {
    return -1;
  }
  len_00 = (uint)uVar7;
  uVar12 = len_00;
  switch(inform) {
  case 0x1000:
    if (len_00 == 0) {
      uVar12 = 0;
    }
    else {
      uVar12 = 0;
      uVar11 = uVar7 & 0xffffffff;
      str = in;
      do {
        iVar2 = UTF8_getc(str,(int)uVar11,(ulong *)&local_68);
        if (((iVar2 < 0) || (0x10 < (ulong)local_68 >> 0x10)) ||
           (((ulong)local_68 & 0xfffffffffffff800) == 0xd800)) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_mbstr.c",0x55,"ASN1_mbstring_ncopy");
          uVar4 = 0x86;
          goto LAB_009ee2d4;
        }
        uVar6 = (int)uVar11 - iVar2;
        uVar11 = (ulong)uVar6;
        str = str + iVar2;
        uVar12 = uVar12 + 1;
      } while (uVar6 != 0);
    }
    break;
  case 0x1001:
    break;
  case 0x1002:
    if ((uVar7 & 1) != 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_mbstr.c",0x42,"ASN1_mbstring_ncopy");
      uVar4 = 0x81;
      goto LAB_009ee2d4;
    }
    uVar12 = len_00 >> 1;
    break;
  default:
    ERR_new();
    ERR_set_debug("crypto/asn1/a_mbstr.c",0x5f,"ASN1_mbstring_ncopy");
    uVar4 = 0xa0;
    goto LAB_009ee2d4;
  case 0x1004:
    if ((uVar7 & 3) != 0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_mbstr.c",0x4a,"ASN1_mbstring_ncopy");
      uVar4 = 0x85;
      goto LAB_009ee2d4;
    }
    uVar12 = len_00 >> 2;
  }
  if ((0 < minsize) && ((int)uVar12 < minsize)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_mbstr.c",100,"ASN1_mbstring_ncopy");
    pcVar5 = "minsize=%ld";
    uVar4 = 0x98;
LAB_009edfa0:
    ERR_set_error(0xd,uVar4,pcVar5,minsize);
    return -1;
  }
  if ((0 < maxsize) && (maxsize < (int)uVar12)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_mbstr.c",0x6a,"ASN1_mbstring_ncopy");
    pcVar5 = "maxsize=%ld";
    uVar4 = 0x97;
    minsize = maxsize;
    goto LAB_009edfa0;
  }
  iVar2 = FUN_009ee304(in,uVar7 & 0xffffffff,inform,FUN_009ee438,&local_70);
  if (iVar2 < 0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/a_mbstr.c",0x71,"ASN1_mbstring_ncopy");
    uVar4 = 0x7c;
    goto LAB_009ee2d4;
  }
  uVar6 = (uint)local_70;
  if ((local_70 & 1) == 0) {
    if ((uVar6 >> 1 & 1) == 0) {
      if ((uVar6 >> 4 & 1) == 0) {
        if ((uVar6 >> 2 & 1) == 0) {
          if ((uVar6 >> 0xb & 1) == 0) {
            uVar6 = (uint)((local_70 & 0x100) >> 4) | 0xc;
            uVar9 = (uint)((local_70 & 0x100) >> 6) | 0x1000;
          }
          else {
            uVar9 = 0x1002;
            uVar6 = 0x1e;
          }
          goto joined_r0x009ee03c;
        }
        uVar6 = 0x14;
      }
      else {
        uVar6 = 0x16;
      }
      uVar9 = 0x1001;
    }
    else {
      uVar9 = 0x1001;
      uVar6 = 0x13;
    }
  }
  else {
    uVar9 = 0x1001;
    uVar6 = 0x12;
  }
joined_r0x009ee03c:
  if (out == (ASN1_STRING **)0x0) {
    return uVar6;
  }
  a = *out;
  if (a == (ASN1_STRING *)0x0) {
    a = ASN1_STRING_type_new(uVar6);
    if (a != (ASN1_STRING *)0x0) {
      bVar1 = true;
      *out = a;
      goto joined_r0x009ee0ec;
    }
    ERR_new();
    uVar4 = 0x96;
  }
  else {
    CRYPTO_free(a->data);
    bVar1 = false;
    a->data = (uchar *)0x0;
    a->length = 0;
    a->type = uVar6;
joined_r0x009ee0ec:
    if (uVar9 == inform) {
      iVar2 = ASN1_STRING_set(a,in,len_00);
      if (iVar2 != 0) {
        return uVar6;
      }
      ERR_new();
      uVar4 = 0x9e;
    }
    else {
      puVar8 = (undefined *)0x0;
      uVar13 = 0;
      switch(uVar9 & 7) {
      case 0:
        if (len_00 != 0) {
          uVar13 = 0;
          uVar11 = uVar7 & 0xffffffff;
          str_00 = in;
          do {
            iVar2 = (int)uVar11;
            if (inform == 0x1004) {
              uVar11 = (ulong)(iVar2 - 4);
              pbVar10 = str_00 + 4;
              local_68 = (uchar *)((ulong)*str_00 << 0x18 | (ulong)str_00[1] << 0x10 |
                                   (ulong)str_00[2] << 8 | (ulong)str_00[3]);
            }
            else if (inform == 0x1002) {
              uVar11 = (ulong)(iVar2 - 2);
              pbVar10 = str_00 + 2;
              local_68 = (uchar *)(ulong)CONCAT11(*str_00,str_00[1]);
            }
            else if (inform == 0x1001) {
              pbVar10 = str_00 + 1;
              local_68 = (uchar *)(ulong)*str_00;
              uVar11 = (ulong)(iVar2 - 1);
            }
            else {
              iVar3 = UTF8_getc(str_00,iVar2,(ulong *)&local_68);
              if (iVar3 < 0) goto LAB_009ee250;
              uVar11 = (ulong)(uint)(iVar2 - iVar3);
              pbVar10 = str_00 + iVar3;
            }
            iVar2 = UTF8_putc((uchar *)0x0,-1,(ulong)local_68);
            if ((iVar2 < 1) || (uVar13 = iVar2 + uVar13, str_00 = pbVar10, (int)uVar11 == 0))
            goto LAB_009ee250;
          } while( true );
        }
        uVar13 = 0;
LAB_009ee250:
        puVar8 = &UNK_009ee594;
        break;
      case 1:
        puVar8 = &UNK_009ee520;
        uVar13 = uVar12;
        break;
      case 2:
        puVar8 = &UNK_009ee53c;
        uVar13 = uVar12 << 1;
        break;
      case 4:
        puVar8 = &LAB_009ee560;
        uVar13 = uVar12 << 2;
      }
      local_68 = CRYPTO_malloc(uVar13 + 1,"crypto/asn1/a_mbstr.c",0xbb);
      if (local_68 != (uchar *)0x0) {
        a->length = uVar13;
        a->data = local_68;
        local_68[(int)uVar13] = '\0';
        FUN_009ee304(in,uVar7 & 0xffffffff,inform,puVar8,&local_68);
        return uVar6;
      }
      if (bVar1) {
        ASN1_STRING_free(a);
      }
      ERR_new();
      uVar4 = 0xbe;
    }
  }
  ERR_set_debug("crypto/asn1/a_mbstr.c",uVar4,"ASN1_mbstring_ncopy");
  uVar4 = 0xc0100;
LAB_009ee2d4:
  ERR_set_error(0xd,uVar4,0);
  return -1;
}


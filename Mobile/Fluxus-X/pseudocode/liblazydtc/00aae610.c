/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aae610
 */

int OBJ_obj2txt(char *buf,int buf_len,ASN1_OBJECT *a,int no_name)

{
  uchar uVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  char *pcVar5;
  size_t sVar6;
  uint *puVar7;
  byte bVar8;
  ulong uVar9;
  byte *pbVar10;
  BIGNUM *a_00;
  int iVar11;
  uchar *puVar12;
  uchar *puVar13;
  uint uVar14;
  int iVar15;
  ulong w;
  long lVar16;
  int iVar17;
  undefined4 local_90 [2];
  ASN1_OBJECT *local_88;
  ASN1_OBJECT *local_68;
  
  if ((buf != (char *)0x0) && (0 < buf_len)) {
    *buf = '\0';
  }
  if ((a == (ASN1_OBJECT *)0x0) || (a->data == (uchar *)0x0)) {
    return 0;
  }
  if (no_name != 0) goto LAB_00aae65c;
  iVar17 = a->nid;
  local_68 = a;
  if (iVar17 == 0) {
    if (a->length == 0) goto LAB_00aae65c;
    OPENSSL_init_crypto(0x40,0);
    if (DAT_00d22188 == 0) {
LAB_00aae98c:
      puVar7 = (uint *)ossl_bsearch(&local_68,&DAT_0076ea44,0x456,4,&LAB_00aaf034,0);
      if (puVar7 == (uint *)0x0) goto LAB_00aae65c;
      iVar17 = *(int *)(&DAT_00c6da68 + (ulong)*puVar7 * 0x28);
    }
    else {
      local_90[0] = 0;
      local_88 = a;
      lVar16 = OPENSSL_LH_retrieve(DAT_00d22188,local_90);
      if (lVar16 == 0) goto LAB_00aae98c;
      iVar17 = *(int *)(*(long *)(lVar16 + 8) + 0x10);
    }
    if (iVar17 == 0) goto LAB_00aae65c;
  }
  pcVar5 = OBJ_nid2ln(iVar17);
  if ((pcVar5 != (char *)0x0) || (pcVar5 = OBJ_nid2sn(iVar17), pcVar5 != (char *)0x0)) {
    if (buf != (char *)0x0) {
      OPENSSL_strlcpy(buf,pcVar5,(long)buf_len);
    }
    sVar6 = strlen(pcVar5);
    return (int)sVar6;
  }
LAB_00aae65c:
  iVar17 = a->length;
  a_00 = (BIGNUM *)0x0;
  if (iVar17 < 0x24b) {
    if (iVar17 < 1) {
      iVar11 = 0;
      a_00 = (BIGNUM *)0x0;
    }
    else {
      puVar12 = a->data;
      a_00 = (BIGNUM *)0x0;
      iVar11 = 0;
      bVar3 = true;
      do {
        uVar1 = *puVar12;
        uVar9 = (ulong)(char)uVar1;
        iVar17 = iVar17 + -1;
        if ((iVar17 == 0) && ((char)uVar1 < 0)) goto LAB_00aae66c;
        w = 0;
        bVar2 = false;
        uVar14 = (uint)(int)(char)uVar1 >> 0x1f;
        puVar12 = puVar12 + 1;
        while( true ) {
          if (bVar2) {
            iVar4 = BN_add_word(a_00,uVar9 & 0x7f);
            if (iVar4 == 0) goto LAB_00aae66c;
          }
          else {
            w = w | uVar9 & 0x7f;
          }
          if (uVar14 == 0) break;
          if ((bVar2) || (w >> 0x39 == 0)) {
            if (bVar2) goto LAB_00aae72c;
            w = w << 7;
          }
          else {
            if (((a_00 == (BIGNUM *)0x0) && (a_00 = BN_new(), a_00 == (BIGNUM *)0x0)) ||
               (iVar4 = BN_set_word(a_00,w), iVar4 == 0)) goto LAB_00aae66c;
            bVar2 = true;
LAB_00aae72c:
            iVar4 = BN_lshift(a_00,a_00,7);
            if (iVar4 == 0) goto LAB_00aae66c;
          }
          puVar13 = puVar12 + 1;
          uVar1 = *puVar12;
          uVar9 = (ulong)(char)uVar1;
          iVar17 = iVar17 + -1;
          uVar14 = (uint)(int)(char)uVar1 >> 0x1f;
          puVar12 = puVar13;
          if ((iVar17 == 0) && ((char)uVar1 < 0)) goto LAB_00aae66c;
        }
        if (bVar3) {
          if (w < 0x50) {
            uVar14 = (uint)w & 0xff;
            bVar8 = (byte)(uVar14 / 0x28);
            w = w + (ulong)((uVar14 / 0x28) * 5) * -8;
          }
          else if (bVar2) {
            iVar4 = BN_sub_word(a_00,0x50);
            if (iVar4 == 0) goto LAB_00aae66c;
            bVar8 = 2;
          }
          else {
            bVar8 = 2;
            w = w - 0x50;
          }
          if ((1 < buf_len) && ((byte *)buf != (byte *)0x0)) {
            *buf = bVar8 | 0x30;
            buf_len = buf_len + -1;
            buf[1] = 0;
            buf = buf + 1;
          }
          iVar11 = iVar11 + 1;
        }
        if (bVar2) {
          pcVar5 = BN_bn2dec(a_00);
          if (pcVar5 == (char *)0x0) goto LAB_00aae66c;
          sVar6 = strlen(pcVar5);
          iVar4 = (int)sVar6;
          if ((byte *)buf != (byte *)0x0) {
            pbVar10 = (byte *)buf;
            if (1 < buf_len) {
              pbVar10 = (byte *)(buf + 1);
              buf[0] = 0x2e;
              buf[1] = 0;
              buf_len = buf_len + -1;
            }
            lVar16 = (long)buf_len;
            OPENSSL_strlcpy(pbVar10,pcVar5,lVar16);
            if (buf_len < iVar4) {
              buf_len = 0;
              buf = (char *)(pbVar10 + lVar16);
            }
            else {
              buf = (char *)(pbVar10 + iVar4);
              buf_len = buf_len - iVar4;
            }
          }
          iVar11 = iVar11 + iVar4 + 1;
          CRYPTO_free(pcVar5);
        }
        else {
          BIO_snprintf((char *)local_90,0x25,".%lu",w);
          sVar6 = strlen((char *)local_90);
          iVar15 = (int)sVar6;
          iVar4 = buf_len;
          if ((0 < buf_len) && ((byte *)buf != (byte *)0x0)) {
            OPENSSL_strlcpy(buf,local_90,(long)buf_len);
            iVar4 = buf_len - iVar15;
            if (buf_len < iVar15) {
              iVar4 = 0;
              buf = buf + buf_len;
            }
            else {
              buf = buf + iVar15;
            }
          }
          iVar11 = iVar11 + iVar15;
          buf_len = iVar4;
        }
        bVar3 = false;
      } while (0 < iVar17);
    }
    BN_free(a_00);
  }
  else {
LAB_00aae66c:
    BN_free(a_00);
    iVar11 = -1;
  }
  return iVar11;
}


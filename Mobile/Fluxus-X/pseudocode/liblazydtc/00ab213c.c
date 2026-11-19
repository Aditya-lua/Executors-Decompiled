/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab213c
 */

int a2i_ASN1_INTEGER(BIO *bp,ASN1_INTEGER *bs,char *buf,int size)

{
  uint uVar1;
  char cVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  ulong uVar7;
  uchar *puVar8;
  char *pcVar9;
  ulong uVar10;
  uchar *ptr;
  long lVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  ulong uVar15;
  
  bs->type = 2;
  uVar4 = BIO_gets(bp,buf,size);
  if ((int)uVar4 < 1) {
    puVar8 = (uchar *)0x0;
  }
  else {
    iVar12 = 0;
    bVar3 = true;
    ptr = (uchar *)0x0;
    iVar13 = 0;
    do {
      uVar7 = (ulong)uVar4;
      uVar10 = (long)(int)uVar4 - 1;
      pcVar9 = buf + uVar10;
      puVar8 = ptr;
      if (*pcVar9 == '\n') {
        *pcVar9 = '\0';
        if ((int)uVar10 == 0) break;
        uVar15 = (long)(int)uVar4 - 2;
        pcVar9 = buf + uVar15;
        uVar7 = uVar10;
        if (*pcVar9 == '\r') goto LAB_00ab21f0;
LAB_00ab21d8:
        iVar14 = (int)uVar7;
      }
      else {
        uVar15 = uVar10 & 0xffffffff;
        if (*pcVar9 != '\r') goto LAB_00ab21d8;
LAB_00ab21f0:
        *pcVar9 = '\0';
        iVar14 = (int)uVar15;
        if (iVar14 == 0) break;
        pcVar9 = buf + (iVar14 + -1);
      }
      cVar2 = *pcVar9;
      lVar11 = 0;
      do {
        iVar5 = ossl_ctype_check(buf[lVar11],0x10);
        if (iVar5 == 0) {
          iVar14 = (int)lVar11;
          break;
        }
        lVar11 = lVar11 + 1;
      } while (lVar11 < iVar14);
      buf[iVar14] = '\0';
      if (iVar14 < 2) break;
      uVar4 = (uint)(cVar2 == '\\');
      if ((!bVar3) || (*buf != '0')) {
        uVar4 = iVar14 - uVar4;
        pcVar9 = buf;
      }
      else {
        pcVar9 = buf + 2;
        iVar5 = iVar14 + -2;
        if (buf[1] != '0') {
          pcVar9 = buf;
          iVar5 = iVar14;
        }
        uVar4 = iVar5 - uVar4;
      }
      if ((uVar4 & 1) != 0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/f_int.c",0x67,"a2i_ASN1_INTEGER");
        ERR_set_error(0xd,0x91,0);
        goto LAB_00ab23ac;
      }
      uVar1 = uVar4;
      if ((int)uVar4 < 0) {
        uVar1 = uVar4 + 1;
      }
      iVar5 = (int)uVar1 >> 1;
      iVar14 = iVar5 + iVar13;
      if (iVar12 < iVar14) {
        lVar11 = (long)iVar12;
        iVar12 = iVar13 + iVar5 * 2;
        puVar8 = (uchar *)CRYPTO_clear_realloc(ptr,lVar11,(long)iVar12,"crypto/asn1/f_int.c",0x6d);
        if (puVar8 == (uchar *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/f_int.c",0x6f,"a2i_ASN1_INTEGER");
          ERR_set_error(0xd,0xc0100,0);
          goto LAB_00ab23ac;
        }
      }
      if (1 < (int)uVar4) {
        lVar11 = 0;
        pcVar9 = pcVar9 + 1;
        do {
          iVar6 = OPENSSL_hexchar2int(pcVar9[-1]);
          if (iVar6 < 0) {
LAB_00ab2344:
            ERR_new();
            ERR_set_debug("crypto/asn1/f_int.c",0x7a,"a2i_ASN1_INTEGER");
            ERR_set_error(0xd,0x8d,0);
            goto LAB_00ab2378;
          }
          puVar8[lVar11 + iVar13] = (byte)iVar6 | puVar8[lVar11 + iVar13] << 4;
          iVar6 = OPENSSL_hexchar2int(*pcVar9);
          if (iVar6 < 0) goto LAB_00ab2344;
          pcVar9 = pcVar9 + 2;
          puVar8[lVar11 + iVar13] = (byte)iVar6 | puVar8[lVar11 + iVar13] << 4;
          lVar11 = lVar11 + 1;
        } while (lVar11 < iVar5);
      }
      if (cVar2 != '\\') {
        bs->length = iVar14;
        bs->data = puVar8;
        return 1;
      }
      uVar4 = BIO_gets(bp,buf,size);
      bVar3 = false;
      ptr = puVar8;
      iVar13 = iVar14;
    } while (0 < (int)uVar4);
  }
LAB_00ab2378:
  ERR_new();
  ERR_set_debug("crypto/asn1/f_int.c",0x8b,"a2i_ASN1_INTEGER");
  ERR_set_error(0xd,0x96,0);
  ptr = puVar8;
LAB_00ab23ac:
  CRYPTO_free(ptr);
  return 0;
}


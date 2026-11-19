/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab25e0
 */

int a2i_ASN1_STRING(BIO *bp,ASN1_STRING *bs,char *buf,int size)

{
  bool bVar1;
  uint uVar2;
  char cVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  ulong uVar8;
  uchar *puVar9;
  char *pcVar10;
  ulong uVar11;
  uchar *puVar12;
  int num;
  int iVar13;
  long lVar14;
  int iVar15;
  ulong uVar16;
  
  uVar5 = BIO_gets(bp,buf,size);
  if ((int)uVar5 < 1) {
    puVar9 = (uchar *)0x0;
    iVar15 = 0;
LAB_00ab27e0:
    bs->length = iVar15;
    bs->data = puVar9;
    iVar15 = 1;
  }
  else {
    num = 0;
    puVar12 = (uchar *)0x0;
    iVar13 = 0;
    do {
      uVar8 = (ulong)uVar5;
      uVar11 = (long)(int)uVar5 - 1;
      pcVar10 = buf + uVar11;
      puVar9 = puVar12;
      if (*pcVar10 == '\n') {
        *pcVar10 = '\0';
        if ((int)uVar11 == 0) break;
        uVar16 = (long)(int)uVar5 - 2;
        pcVar10 = buf + uVar16;
        uVar8 = uVar11;
        if (*pcVar10 != '\r') goto LAB_00ab266c;
LAB_00ab2684:
        *pcVar10 = '\0';
        iVar15 = (int)uVar16;
        if (iVar15 == 0) break;
        pcVar10 = buf + (iVar15 + -1);
      }
      else {
        uVar16 = uVar11 & 0xffffffff;
        if (*pcVar10 == '\r') goto LAB_00ab2684;
LAB_00ab266c:
        iVar15 = (int)uVar8;
      }
      cVar3 = *pcVar10;
      if (iVar15 < 2) {
        buf[iVar15] = '\0';
        break;
      }
      lVar14 = (long)iVar15 + -1;
      do {
        iVar6 = ossl_ctype_check(buf[lVar14],0x10);
        if (iVar6 == 0) {
          iVar15 = (int)lVar14;
          break;
        }
        lVar4 = lVar14 + -1;
        bVar1 = 0 < lVar14;
        lVar14 = lVar4;
      } while (lVar4 != 0 && bVar1);
      buf[iVar15] = '\0';
      if (iVar15 < 2) break;
      uVar5 = iVar15 - (uint)(cVar3 == '\\');
      if ((uVar5 & 1) != 0) {
        ERR_new();
        ERR_set_debug("crypto/asn1/f_string.c",0x5e,"a2i_ASN1_STRING");
        ERR_set_error(0xd,0x91,0);
        goto LAB_00ab28a4;
      }
      uVar2 = uVar5;
      if ((int)uVar5 < 0) {
        uVar2 = uVar5 + 1;
      }
      iVar6 = (int)uVar2 >> 1;
      iVar15 = iVar6 + iVar13;
      if (num < iVar15) {
        num = iVar13 + iVar6 * 2;
        puVar9 = CRYPTO_realloc(puVar12,num,"crypto/asn1/f_string.c",100);
        if (puVar9 == (uchar *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/f_string.c",0x66,"a2i_ASN1_STRING");
          ERR_set_error(0xd,0xc0100,0);
          goto LAB_00ab28a4;
        }
      }
      puVar12 = puVar9;
      if (1 < (int)uVar5) {
        lVar14 = 0;
        pcVar10 = buf + 1;
        do {
          iVar7 = OPENSSL_hexchar2int(pcVar10[-1]);
          if (iVar7 < 0) {
LAB_00ab27a0:
            ERR_new();
            ERR_set_debug("crypto/asn1/f_string.c",0x71,"a2i_ASN1_STRING");
            ERR_set_error(0xd,0x8d,0);
            goto LAB_00ab28a4;
          }
          puVar9[lVar14 + iVar13] = (byte)iVar7 | puVar9[lVar14 + iVar13] << 4;
          iVar7 = OPENSSL_hexchar2int(*pcVar10);
          if (iVar7 < 0) goto LAB_00ab27a0;
          pcVar10 = pcVar10 + 2;
          puVar9[lVar14 + iVar13] = (byte)iVar7 | puVar9[lVar14 + iVar13] << 4;
          lVar14 = lVar14 + 1;
        } while (lVar14 < iVar6);
      }
      if (cVar3 != '\\') goto LAB_00ab27e0;
      uVar5 = BIO_gets(bp,buf,size);
      iVar13 = iVar15;
    } while (0 < (int)uVar5);
    ERR_new();
    ERR_set_debug("crypto/asn1/f_string.c",0x84,"a2i_ASN1_STRING");
    ERR_set_error(0xd,0x96,0);
    puVar12 = puVar9;
LAB_00ab28a4:
    CRYPTO_free(puVar12);
    iVar15 = 0;
  }
  return iVar15;
}


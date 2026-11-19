/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ec184
 */

int a2d_ASN1_OBJECT(uchar *out,int olen,char *buf,int num)

{
  bool bVar1;
  int num_00;
  ulong uVar2;
  uchar *puVar3;
  byte bVar4;
  byte bVar5;
  byte *pbVar6;
  int iVar7;
  int iVar8;
  size_t sVar9;
  uchar *ptr;
  undefined8 uVar10;
  ulong w;
  byte *pbVar11;
  long lVar12;
  uint uVar13;
  undefined1 (*pauVar14) [16];
  ulong uVar15;
  ulong uVar16;
  uchar *puVar17;
  BIGNUM *a;
  int iVar18;
  ulong uVar19;
  int iVar20;
  int iVar21;
  ulong uVar22;
  ulong uVar23;
  long lVar24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  uchar local_78 [24];
  
  if (num != 0) {
    if (num == -1) {
      sVar9 = strlen(buf);
      num = (int)sVar9;
    }
    bVar4 = *buf;
    if ((byte)(bVar4 - 0x30) < 3) {
      iVar20 = num + -2;
      if (1 < num) {
        if (iVar20 == 0) {
          a = (BIGNUM *)0x0;
          uVar13 = 0;
        }
        else {
          num_00 = 0x18;
          uVar22 = (ulong)(byte)buf[1];
          a = (BIGNUM *)0x0;
          uVar19 = 0;
          pbVar11 = (byte *)(buf + 2);
          w = (ulong)bVar4 * 0x28 - 0x780;
          ptr = local_78;
          do {
            if (((int)uVar22 != 0x2e) && ((int)uVar22 != 0x20)) {
              ERR_new();
              ERR_set_debug("crypto/asn1/a_object.c",0x57,"a2d_ASN1_OBJECT");
              uVar10 = 0x83;
LAB_009ec648:
              ERR_set_error(0xd,uVar10,0);
LAB_009ec650:
              if (ptr != local_78) {
LAB_009ec65c:
                CRYPTO_free(ptr);
              }
              goto LAB_009ec240;
            }
            uVar23 = 0;
            bVar1 = false;
            pbVar6 = pbVar11;
            do {
              iVar21 = iVar20;
              pbVar11 = pbVar6 + 1;
              bVar5 = *pbVar6;
              uVar22 = (ulong)bVar5;
              iVar20 = iVar21 + -1;
              iVar18 = (int)uVar19;
              if (bVar5 == 0x20) {
                uVar22 = 0x20;
                break;
              }
              if (bVar5 == 0x2e) {
                uVar22 = 0x2e;
                break;
              }
              iVar7 = ossl_isdigit(uVar22);
              if (iVar7 == 0) {
                ERR_new();
                ERR_set_debug("crypto/asn1/a_object.c",100,"a2d_ASN1_OBJECT");
                uVar10 = 0x82;
                goto LAB_009ec648;
              }
              if ((bVar1) || (uVar23 < 0x1999999999999991)) {
                if (bVar1) goto LAB_009ec36c;
                uVar23 = (uVar22 + uVar23 * 10) - 0x30;
              }
              else {
                if (((a == (BIGNUM *)0x0) && (a = BN_new(), a == (BIGNUM *)0x0)) ||
                   (iVar7 = BN_set_word(a,uVar23), iVar7 == 0)) goto LAB_009ec650;
                bVar1 = true;
LAB_009ec36c:
                iVar7 = BN_mul_word(a,10);
                if ((iVar7 == 0) || (iVar7 = BN_add_word(a,uVar22 - 0x30), iVar7 == 0))
                goto LAB_009ec650;
              }
              pbVar6 = pbVar11;
            } while (1 < iVar21);
            if (iVar18 == 0) {
              if ((bVar4 < 0x32) && (0x27 < uVar23)) {
                ERR_new();
                ERR_set_debug("crypto/asn1/a_object.c",0x77,"a2d_ASN1_OBJECT");
                uVar10 = 0x93;
                goto LAB_009ec648;
              }
              if (!bVar1) {
                uVar23 = uVar23 + w;
                goto LAB_009ec4dc;
              }
              iVar7 = BN_add_word(a,w);
              if (iVar7 != 0) goto LAB_009ec3fc;
              goto LAB_009ec650;
            }
            if (bVar1) {
LAB_009ec3fc:
              iVar8 = BN_num_bits(a);
              iVar7 = (iVar8 + 6) / 7;
              if (iVar7 <= num_00) {
LAB_009ec478:
                if (iVar8 + 0xcU < 0xd) {
                  lVar12 = 0;
                }
                else {
                  lVar24 = 0;
                  do {
                    uVar23 = BN_div_word(a,0x80);
                    if (uVar23 == 0xffffffffffffffff) goto LAB_009ec650;
                    lVar12 = lVar24 + 1;
                    ptr[lVar24] = (uchar)uVar23;
                    lVar24 = lVar12;
                  } while (iVar7 != (int)lVar12);
                }
                iVar7 = (int)lVar12;
                goto joined_r0x009ec4cc;
              }
              if (ptr != local_78) {
                CRYPTO_free(ptr);
              }
              num_00 = iVar7 + 0x20;
              ptr = CRYPTO_malloc(num_00,"crypto/asn1/a_object.c",0x89);
              if (ptr != (uchar *)0x0) goto LAB_009ec478;
              ERR_new();
              ERR_set_debug("crypto/asn1/a_object.c",0x8b,"a2d_ASN1_OBJECT");
              ERR_set_error(0xd,0xc0100,0);
              goto LAB_009ec65c;
            }
LAB_009ec4dc:
            lVar12 = 0;
            do {
              bVar5 = (byte)uVar23;
              uVar23 = uVar23 >> 7;
              ptr[lVar12] = bVar5 & 0x7f;
              lVar12 = lVar12 + 1;
            } while (uVar23 != 0);
            iVar7 = (int)lVar12;
joined_r0x009ec4cc:
            uVar13 = iVar7 + iVar18;
            if (out != (uchar *)0x0) {
              if (olen < (int)uVar13) {
                ERR_new();
                ERR_set_debug("crypto/asn1/a_object.c",0xa1,"a2d_ASN1_OBJECT");
                uVar10 = 0x6b;
                goto LAB_009ec648;
              }
              if (1 < (int)lVar12) {
                uVar23 = (ulong)(int)lVar12;
                uVar19 = 0xfffffffffffffffd;
                if (-3 < (long)~uVar23) {
                  uVar19 = ~uVar23;
                }
                uVar2 = uVar19 + uVar23 + 2;
                uVar19 = (ulong)iVar18;
                uVar15 = uVar19;
                if (0x1f < uVar2) {
                  puVar3 = ptr + uVar23;
                  uVar16 = 0xfffffffffffffffd;
                  if (-3 < (long)~uVar23) {
                    uVar16 = ~uVar23;
                  }
                  if ((puVar3 <= out + uVar19) ||
                     (out + uVar16 + uVar23 + uVar19 + 2 <= ptr + (-2 - uVar16))) {
                    uVar16 = uVar2 & 0xffffffffffffffe0;
                    uVar15 = uVar16 + uVar19;
                    uVar23 = uVar23 - uVar16;
                    puVar17 = out + uVar19 + 0x10;
                    pauVar14 = (undefined1 (*) [16])(puVar3 + -0x10);
                    uVar19 = uVar16;
                    do {
                      auVar28 = pauVar14[-1];
                      auVar26 = *pauVar14;
                      uVar19 = uVar19 - 0x20;
                      pauVar14 = pauVar14 + -2;
                      auVar25._0_8_ = auVar26._0_8_ | 0x8080808080808080;
                      auVar25[8] = auVar26[8] | 0x80;
                      auVar25[9] = auVar26[9] | 0x80;
                      auVar25[10] = auVar26[10] | 0x80;
                      auVar25[0xb] = auVar26[0xb] | 0x80;
                      auVar25[0xc] = auVar26[0xc] | 0x80;
                      auVar25[0xd] = auVar26[0xd] | 0x80;
                      auVar25[0xe] = auVar26[0xe] | 0x80;
                      auVar25[0xf] = auVar26[0xf] | 0x80;
                      auVar27._0_8_ = auVar28._0_8_ | 0x8080808080808080;
                      auVar27[8] = auVar28[8] | 0x80;
                      auVar27[9] = auVar28[9] | 0x80;
                      auVar27[10] = auVar28[10] | 0x80;
                      auVar27[0xb] = auVar28[0xb] | 0x80;
                      auVar27[0xc] = auVar28[0xc] | 0x80;
                      auVar27[0xd] = auVar28[0xd] | 0x80;
                      auVar27[0xe] = auVar28[0xe] | 0x80;
                      auVar27[0xf] = auVar28[0xf] | 0x80;
                      auVar26._8_8_ = 0x1020304050607;
                      auVar26._0_8_ = 0x8090a0b0c0d0e0f;
                      auVar26 = a64_TBL(ZEXT816(0),auVar25,auVar26);
                      auVar28._8_8_ = 0x1020304050607;
                      auVar28._0_8_ = 0x8090a0b0c0d0e0f;
                      auVar28 = a64_TBL(ZEXT816(0),auVar27,auVar28);
                      *(long *)(puVar17 + -8) = auVar26._8_8_;
                      *(long *)(puVar17 + -0x10) = auVar26._0_8_;
                      *(long *)(puVar17 + 8) = auVar28._8_8_;
                      *(long *)puVar17 = auVar28._0_8_;
                      puVar17 = puVar17 + 0x20;
                    } while (uVar19 != 0);
                    uVar19 = uVar15;
                    if (uVar2 == uVar16) goto LAB_009ec5e8;
                  }
                }
                do {
                  uVar19 = uVar15 + 1;
                  out[uVar15] = ptr[uVar23 - 1] | 0x80;
                  bVar1 = 2 < (long)uVar23;
                  uVar15 = uVar19;
                  uVar23 = uVar23 - 1;
                } while (bVar1);
              }
LAB_009ec5e8:
              uVar13 = (int)uVar19 + 1;
              out[(int)uVar19] = *ptr;
            }
            uVar19 = (ulong)uVar13;
          } while (1 < iVar21);
          if (ptr != local_78) {
            CRYPTO_free(ptr);
          }
        }
        BN_free(a);
        return uVar13;
      }
      ERR_new();
      ERR_set_debug("crypto/asn1/a_object.c",0x4e,"a2d_ASN1_OBJECT");
      uVar10 = 0x8a;
    }
    else {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_object.c",0x49,"a2d_ASN1_OBJECT");
      uVar10 = 0x7a;
    }
    ERR_set_error(0xd,uVar10,0);
    a = (BIGNUM *)0x0;
LAB_009ec240:
    BN_free(a);
  }
  return 0;
}


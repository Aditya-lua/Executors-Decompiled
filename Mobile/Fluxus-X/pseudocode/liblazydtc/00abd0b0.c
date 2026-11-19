/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abd0b0
 */

char * OPENSSL_uni2asc(uchar *uni,int unilen)

{
  ulong uVar1;
  uchar *puVar2;
  ulong uVar3;
  long lVar4;
  uchar *puVar12;
  uchar *puVar11;
  uchar *puVar10;
  uchar *puVar9;
  uchar *puVar8;
  uchar *puVar7;
  uchar *puVar6;
  uchar *puVar5;
  uchar *puVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  uchar *puVar17;
  ulong uVar18;
  uint num;
  uchar uVar19;
  uchar uVar20;
  uchar uVar21;
  uchar uVar22;
  uchar uVar23;
  uchar uVar24;
  uchar uVar25;
  uchar uVar26;
  uchar uVar27;
  uchar uVar28;
  uchar uVar29;
  uchar uVar30;
  uchar uVar31;
  uchar uVar32;
  uchar uVar33;
  uchar uVar34;
  uchar uVar35;
  uchar uVar36;
  uchar uVar37;
  uchar uVar38;
  uchar uVar39;
  uchar uVar40;
  uchar uVar41;
  uchar uVar42;
  
  puVar13 = (uchar *)0x0;
  if ((unilen & 0x80000001U) == 0) {
    num = (uint)unilen >> 1;
    if ((unilen == 0) || (uni[(long)unilen + -1] != '\0')) {
      num = num + 1;
    }
    puVar13 = CRYPTO_malloc(num,"crypto/pkcs12/p12_utl.c",0x3c);
    if (puVar13 == (uchar *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs12/p12_utl.c",0x3d,"OPENSSL_uni2asc");
      ERR_set_error(0x23,0xc0100,0);
      puVar13 = (uchar *)0x0;
    }
    else {
      if (0 < unilen) {
        lVar14 = (long)unilen;
        uVar1 = (lVar14 - 1U >> 1) + 1;
        uVar15 = 0;
        if ((0x20 < uVar1) &&
           ((uni + (lVar14 + 1U & 0xfffffffffffffffe) <= puVar13 ||
            (uVar15 = 0, puVar13 + (lVar14 - 1U >> 1) + 1 <= uni + 1)))) {
          uVar3 = 0x20;
          if ((uVar1 & 0x1f) != 0) {
            uVar3 = uVar1 & 0x1f;
          }
          uVar16 = 0;
          uVar15 = (uVar1 - uVar3) * 2;
          puVar17 = uni + 0x21;
          do {
            uVar19 = *puVar17;
            uVar20 = puVar17[2];
            uVar21 = puVar17[4];
            uVar22 = puVar17[6];
            uVar23 = puVar17[8];
            uVar24 = puVar17[10];
            uVar25 = puVar17[0xc];
            uVar26 = puVar17[0xe];
            uVar27 = puVar17[0x10];
            uVar28 = puVar17[0x12];
            uVar29 = puVar17[0x14];
            uVar30 = puVar17[0x16];
            uVar31 = puVar17[0x18];
            uVar32 = puVar17[0x1a];
            uVar33 = puVar17[0x1c];
            uVar34 = puVar17[0x1e];
            uVar35 = puVar17[-0x20];
            uVar36 = puVar17[-0x1e];
            uVar37 = puVar17[-0x1c];
            uVar38 = puVar17[-0x1a];
            uVar39 = puVar17[-0x18];
            uVar40 = puVar17[-0x16];
            uVar41 = puVar17[-0x14];
            uVar42 = puVar17[-0x12];
            puVar5 = puVar17 + -0x10;
            puVar6 = puVar17 + -0xe;
            puVar7 = puVar17 + -0xc;
            puVar8 = puVar17 + -10;
            puVar9 = puVar17 + -8;
            puVar10 = puVar17 + -6;
            puVar11 = puVar17 + -4;
            puVar12 = puVar17 + -2;
            uVar18 = uVar16 & 0x7fffffffffffffe0;
            uVar16 = uVar16 + 0x20;
            puVar2 = puVar13 + uVar18;
            puVar17 = puVar17 + 0x40;
            *(ulong *)(puVar2 + 8) =
                 CONCAT17(*puVar12,CONCAT16(*puVar11,CONCAT15(*puVar10,CONCAT14(*puVar9,CONCAT13(*
                                                  puVar8,CONCAT12(*puVar7,CONCAT11(*puVar6,*puVar5))
                                                  )))));
            *(ulong *)puVar2 =
                 CONCAT17(uVar42,CONCAT16(uVar41,CONCAT15(uVar40,CONCAT14(uVar39,CONCAT13(uVar38,
                                                  CONCAT12(uVar37,CONCAT11(uVar36,uVar35)))))));
            *(ulong *)(puVar2 + 0x18) =
                 CONCAT17(uVar34,CONCAT16(uVar33,CONCAT15(uVar32,CONCAT14(uVar31,CONCAT13(uVar30,
                                                  CONCAT12(uVar29,CONCAT11(uVar28,uVar27)))))));
            *(ulong *)(puVar2 + 0x10) =
                 CONCAT17(uVar26,CONCAT16(uVar25,CONCAT15(uVar24,CONCAT14(uVar23,CONCAT13(uVar22,
                                                  CONCAT12(uVar21,CONCAT11(uVar20,uVar19)))))));
          } while (uVar1 - uVar3 != uVar16);
        }
        puVar17 = puVar13 + (uVar15 >> 1);
        do {
          lVar4 = uVar15 + 1;
          uVar15 = uVar15 + 2;
          *puVar17 = uni[lVar4];
          puVar17 = puVar17 + 1;
        } while ((long)uVar15 < lVar14);
      }
      puVar13[(long)(int)num + -1] = '\0';
    }
  }
  return (char *)puVar13;
}


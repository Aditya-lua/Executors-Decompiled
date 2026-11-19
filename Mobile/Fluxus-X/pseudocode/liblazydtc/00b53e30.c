/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53e30
 */

int CMAC_Final(CMAC_CTX *ctx,uchar *out,size_t *poutlen)

{
  CMAC_CTX *pCVar1;
  CMAC_CTX CVar2;
  uint uVar3;
  uint inl;
  int iVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  CMAC_CTX *pCVar8;
  byte *pbVar9;
  uchar *puVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  if (*(int *)(ctx + 0x88) == -1) {
    return 0;
  }
  uVar5 = EVP_CIPHER_CTX_get_block_size(*(undefined8 *)ctx);
  uVar11 = uVar5 & 0xffffffff;
  inl = (uint)uVar5;
  if ((int)inl < 0) {
    return 0;
  }
  if (poutlen != (size_t *)0x0) {
    *poutlen = (long)(int)inl;
  }
  if (out == (uchar *)0x0) {
    return 1;
  }
  uVar3 = *(uint *)(ctx + 0x88);
  if (inl == uVar3) {
    if (0 < (int)inl) {
      uVar7 = 0;
      if ((0x1f < inl) &&
         ((ctx + uVar11 + 0x68 <= out || (uVar7 = 0, (CMAC_CTX *)(out + uVar11) <= ctx + 8)))) {
        uVar7 = uVar5 & 0xffffffe0;
        pCVar8 = ctx + 0x78;
        puVar10 = out + 0x10;
        uVar5 = uVar7;
        do {
          uVar13 = *(undefined8 *)(pCVar8 + -8);
          uVar12 = *(undefined8 *)(pCVar8 + -0x10);
          uVar15 = *(undefined8 *)(pCVar8 + 8);
          uVar14 = *(undefined8 *)pCVar8;
          uVar17 = *(undefined8 *)(pCVar8 + -0x68);
          uVar16 = *(undefined8 *)(pCVar8 + -0x70);
          uVar19 = *(undefined8 *)(pCVar8 + -0x58);
          uVar18 = *(undefined8 *)(pCVar8 + -0x60);
          uVar5 = uVar5 - 0x20;
          pCVar8 = pCVar8 + 0x20;
          *(ulong *)(puVar10 + -8) =
               CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                        CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                          (byte)((ulong)uVar13 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                   (byte)((ulong)uVar13 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                            (byte)((ulong)uVar13 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar17 >> 0x10) ^
                                                                     (byte)((ulong)uVar13 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar17
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar13
                                                                                    >> 8),
                                                                              (byte)uVar17 ^
                                                                              (byte)uVar13)))))));
          *(ulong *)(puVar10 + -0x10) =
               CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                        CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                          (byte)((ulong)uVar12 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                   (byte)((ulong)uVar12 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                            (byte)((ulong)uVar12 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                     (byte)((ulong)uVar12 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar16
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar12
                                                                                    >> 8),
                                                                              (byte)uVar16 ^
                                                                              (byte)uVar12)))))));
          *(ulong *)(puVar10 + 8) =
               CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                        CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                          (byte)((ulong)uVar15 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                   (byte)((ulong)uVar15 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                            (byte)((ulong)uVar15 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                     (byte)((ulong)uVar15 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar19
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar15
                                                                                    >> 8),
                                                                              (byte)uVar19 ^
                                                                              (byte)uVar15)))))));
          *(ulong *)puVar10 =
               CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                        CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                          (byte)((ulong)uVar14 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                   (byte)((ulong)uVar14 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                            (byte)((ulong)uVar14 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                     (byte)((ulong)uVar14 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar18
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar14
                                                                                    >> 8),
                                                                              (byte)uVar18 ^
                                                                              (byte)uVar14)))))));
          puVar10 = puVar10 + 0x20;
        } while (uVar5 != 0);
        if (uVar7 == uVar11) goto LAB_00b53ff8;
      }
      pCVar8 = ctx + uVar7 + 0x68;
      lVar6 = uVar11 - uVar7;
      pbVar9 = out + uVar7;
      do {
        CVar2 = *pCVar8;
        pCVar1 = pCVar8 + -0x60;
        lVar6 = lVar6 + -1;
        pCVar8 = pCVar8 + 1;
        *pbVar9 = (byte)*pCVar1 ^ (byte)CVar2;
        pbVar9 = pbVar9 + 1;
      } while (lVar6 != 0);
    }
  }
  else {
    iVar4 = (inl - uVar3) + -1;
    ctx[(long)(int)uVar3 + 0x68] = (CMAC_CTX)0x80;
    if (iVar4 != 0 && 0 < (int)(inl - uVar3)) {
      memset(ctx + (long)(int)uVar3 + 0x69,0,(long)iVar4);
    }
    if (0 < (int)inl) {
      uVar7 = 0;
      if ((0x1f < inl) &&
         ((ctx + uVar11 + 0x68 <= out || (uVar7 = 0, (CMAC_CTX *)(out + uVar11) <= ctx + 0x28)))) {
        uVar7 = uVar5 & 0xffffffe0;
        pCVar8 = ctx + 0x78;
        puVar10 = out + 0x10;
        uVar5 = uVar7;
        do {
          uVar13 = *(undefined8 *)(pCVar8 + -8);
          uVar12 = *(undefined8 *)(pCVar8 + -0x10);
          uVar15 = *(undefined8 *)(pCVar8 + 8);
          uVar14 = *(undefined8 *)pCVar8;
          uVar17 = *(undefined8 *)(pCVar8 + -0x48);
          uVar16 = *(undefined8 *)(pCVar8 + -0x50);
          uVar19 = *(undefined8 *)(pCVar8 + -0x38);
          uVar18 = *(undefined8 *)(pCVar8 + -0x40);
          uVar5 = uVar5 - 0x20;
          pCVar8 = pCVar8 + 0x20;
          *(ulong *)(puVar10 + -8) =
               CONCAT17((byte)((ulong)uVar17 >> 0x38) ^ (byte)((ulong)uVar13 >> 0x38),
                        CONCAT16((byte)((ulong)uVar17 >> 0x30) ^ (byte)((ulong)uVar13 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar17 >> 0x28) ^
                                          (byte)((ulong)uVar13 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar17 >> 0x20) ^
                                                   (byte)((ulong)uVar13 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar17 >> 0x18) ^
                                                            (byte)((ulong)uVar13 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar17 >> 0x10) ^
                                                                     (byte)((ulong)uVar13 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar17
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar13
                                                                                    >> 8),
                                                                              (byte)uVar17 ^
                                                                              (byte)uVar13)))))));
          *(ulong *)(puVar10 + -0x10) =
               CONCAT17((byte)((ulong)uVar16 >> 0x38) ^ (byte)((ulong)uVar12 >> 0x38),
                        CONCAT16((byte)((ulong)uVar16 >> 0x30) ^ (byte)((ulong)uVar12 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar16 >> 0x28) ^
                                          (byte)((ulong)uVar12 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar16 >> 0x20) ^
                                                   (byte)((ulong)uVar12 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar16 >> 0x18) ^
                                                            (byte)((ulong)uVar12 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar16 >> 0x10) ^
                                                                     (byte)((ulong)uVar12 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar16
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar12
                                                                                    >> 8),
                                                                              (byte)uVar16 ^
                                                                              (byte)uVar12)))))));
          *(ulong *)(puVar10 + 8) =
               CONCAT17((byte)((ulong)uVar19 >> 0x38) ^ (byte)((ulong)uVar15 >> 0x38),
                        CONCAT16((byte)((ulong)uVar19 >> 0x30) ^ (byte)((ulong)uVar15 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar19 >> 0x28) ^
                                          (byte)((ulong)uVar15 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar19 >> 0x20) ^
                                                   (byte)((ulong)uVar15 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar19 >> 0x18) ^
                                                            (byte)((ulong)uVar15 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar19 >> 0x10) ^
                                                                     (byte)((ulong)uVar15 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar19
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar15
                                                                                    >> 8),
                                                                              (byte)uVar19 ^
                                                                              (byte)uVar15)))))));
          *(ulong *)puVar10 =
               CONCAT17((byte)((ulong)uVar18 >> 0x38) ^ (byte)((ulong)uVar14 >> 0x38),
                        CONCAT16((byte)((ulong)uVar18 >> 0x30) ^ (byte)((ulong)uVar14 >> 0x30),
                                 CONCAT15((byte)((ulong)uVar18 >> 0x28) ^
                                          (byte)((ulong)uVar14 >> 0x28),
                                          CONCAT14((byte)((ulong)uVar18 >> 0x20) ^
                                                   (byte)((ulong)uVar14 >> 0x20),
                                                   CONCAT13((byte)((ulong)uVar18 >> 0x18) ^
                                                            (byte)((ulong)uVar14 >> 0x18),
                                                            CONCAT12((byte)((ulong)uVar18 >> 0x10) ^
                                                                     (byte)((ulong)uVar14 >> 0x10),
                                                                     CONCAT11((byte)((ulong)uVar18
                                                                                    >> 8) ^
                                                                              (byte)((ulong)uVar14
                                                                                    >> 8),
                                                                              (byte)uVar18 ^
                                                                              (byte)uVar14)))))));
          puVar10 = puVar10 + 0x20;
        } while (uVar5 != 0);
        if (uVar7 == uVar11) goto LAB_00b53ff8;
      }
      pCVar8 = ctx + uVar7 + 0x68;
      lVar6 = uVar11 - uVar7;
      pbVar9 = out + uVar7;
      do {
        CVar2 = *pCVar8;
        pCVar1 = pCVar8 + -0x40;
        lVar6 = lVar6 + -1;
        pCVar8 = pCVar8 + 1;
        *pbVar9 = (byte)*pCVar1 ^ (byte)CVar2;
        pbVar9 = pbVar9 + 1;
      } while (lVar6 != 0);
    }
  }
LAB_00b53ff8:
  iVar4 = EVP_Cipher(*(EVP_CIPHER_CTX **)ctx,out,out,inl);
  if (iVar4 < 1) {
    OPENSSL_cleanse(out,(long)(int)inl);
    return 0;
  }
  return 1;
}


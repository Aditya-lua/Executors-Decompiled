/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1140
 */

int BN_BLINDING_invert_ex(BIGNUM *n,BIGNUM *r,BN_BLINDING *b,BN_CTX *param_4)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  uint uVar7;
  ulong *puVar8;
  ulong uVar9;
  ulong *puVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  
  if ((r == (BIGNUM *)0x0) && (r = *(BIGNUM **)(b + 8), r == (BIGNUM *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_blind.c",0xaf,"BN_BLINDING_invert_ex");
    ERR_set_error(3,0x6b,0);
    return 0;
  }
  if (*(long *)(b + 0x38) == 0) {
    iVar4 = BN_mod_mul(n,n,r,*(BIGNUM **)(b + 0x18),param_4);
    return iVar4;
  }
  uVar2 = r->top;
  uVar5 = (ulong)(int)uVar2;
  if (n->dmax < (int)uVar2) goto LAB_00ad123c;
  uVar3 = n->top;
  lVar6 = (long)(int)uVar3;
  if (uVar2 != 0) {
    puVar8 = n->d;
    uVar1 = uVar5;
    if (uVar5 < 2) {
      uVar1 = 1;
    }
    uVar9 = 0;
    if (3 < uVar1) {
      lVar13 = 1;
      lVar12 = 0;
      uVar9 = uVar1 & 0xfffffffffffffffc;
      puVar10 = puVar8 + 2;
      uVar11 = uVar9;
      do {
        uVar19 = puVar10[-1];
        uVar18 = puVar10[-2];
        uVar21 = puVar10[1];
        uVar20 = *puVar10;
        bVar16 = (byte)(lVar12 - lVar6 >> 0x3f);
        bVar17 = (byte)(lVar13 - lVar6 >> 0x3f);
        bVar14 = (byte)((lVar12 + 2) - lVar6 >> 0x3f);
        bVar15 = (byte)((lVar13 + 2) - lVar6 >> 0x3f);
        lVar12 = lVar12 + 4;
        lVar13 = lVar13 + 4;
        uVar11 = uVar11 - 4;
        puVar10[-1] = CONCAT17((byte)(uVar19 >> 0x38) & bVar17,
                               CONCAT16((byte)(uVar19 >> 0x30) & bVar17,
                                        CONCAT15((byte)(uVar19 >> 0x28) & bVar17,
                                                 CONCAT14((byte)(uVar19 >> 0x20) & bVar17,
                                                          CONCAT13((byte)(uVar19 >> 0x18) & bVar17,
                                                                   CONCAT12((byte)(uVar19 >> 0x10) &
                                                                            bVar17,CONCAT11((byte)(
                                                  uVar19 >> 8) & bVar17,(byte)uVar19 & bVar17)))))))
        ;
        puVar10[-2] = CONCAT17((byte)(uVar18 >> 0x38) & bVar16,
                               CONCAT16((byte)(uVar18 >> 0x30) & bVar16,
                                        CONCAT15((byte)(uVar18 >> 0x28) & bVar16,
                                                 CONCAT14((byte)(uVar18 >> 0x20) & bVar16,
                                                          CONCAT13((byte)(uVar18 >> 0x18) & bVar16,
                                                                   CONCAT12((byte)(uVar18 >> 0x10) &
                                                                            bVar16,CONCAT11((byte)(
                                                  uVar18 >> 8) & bVar16,(byte)uVar18 & bVar16)))))))
        ;
        puVar10[1] = CONCAT17((byte)(uVar21 >> 0x38) & bVar15,
                              CONCAT16((byte)(uVar21 >> 0x30) & bVar15,
                                       CONCAT15((byte)(uVar21 >> 0x28) & bVar15,
                                                CONCAT14((byte)(uVar21 >> 0x20) & bVar15,
                                                         CONCAT13((byte)(uVar21 >> 0x18) & bVar15,
                                                                  CONCAT12((byte)(uVar21 >> 0x10) &
                                                                           bVar15,CONCAT11((byte)(
                                                  uVar21 >> 8) & bVar15,(byte)uVar21 & bVar15)))))))
        ;
        *puVar10 = CONCAT17((byte)(uVar20 >> 0x38) & bVar14,
                            CONCAT16((byte)(uVar20 >> 0x30) & bVar14,
                                     CONCAT15((byte)(uVar20 >> 0x28) & bVar14,
                                              CONCAT14((byte)(uVar20 >> 0x20) & bVar14,
                                                       CONCAT13((byte)(uVar20 >> 0x18) & bVar14,
                                                                CONCAT12((byte)(uVar20 >> 0x10) &
                                                                         bVar14,CONCAT11((byte)(
                                                  uVar20 >> 8) & bVar14,(byte)uVar20 & bVar14)))))))
        ;
        puVar10 = puVar10 + 4;
      } while (uVar11 != 0);
      if (uVar1 == uVar9) goto LAB_00ad1224;
    }
    do {
      uVar1 = uVar9 + 1;
      puVar8[uVar9] = puVar8[uVar9] & (long)(uVar9 - lVar6) >> 0x3f;
      uVar9 = uVar1;
    } while (uVar1 < uVar5);
  }
LAB_00ad1224:
  uVar7 = (uint)((long)(uVar5 - lVar6) >> 0x3f);
  n->top = uVar2 & (uVar7 ^ 0xffffffff) | uVar3 & uVar7;
LAB_00ad123c:
  iVar4 = bn_mul_mont_fixed_top(n,n,r);
  bn_correct_top_consttime(n);
  return iVar4;
}


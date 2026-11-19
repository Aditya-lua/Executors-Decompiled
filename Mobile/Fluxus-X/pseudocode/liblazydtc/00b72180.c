/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b72180
 */

int mbedtls_camellia_setkey_dec(int *param_1,undefined8 param_2,undefined4 param_3)

{
  uint uVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  int *piVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  int *piVar13;
  ulong uVar14;
  undefined4 *puVar15;
  undefined8 uVar16;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  int local_160 [41];
  undefined4 auStack_bc [4];
  undefined8 uStack_ac;
  undefined4 uStack_a0;
  undefined8 auStack_9c [10];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  memset(local_160,0,0x114);
  iVar4 = mbedtls_camellia_setkey_enc(local_160,param_2,param_3);
  if (iVar4 == 0) {
    piVar5 = param_1 + 5;
    bVar3 = local_160[0] == 4;
    uVar10 = (ulong)bVar3;
    *param_1 = local_160[0];
    uVar1 = (uint)bVar3 << 3 | 0x16;
    uVar6 = (ulong)uVar1;
    uVar14 = (ulong)bVar3 * 0x40;
    uVar16 = auStack_9c[uVar10 * 8];
    puVar8 = auStack_9c + uVar10 * 8 + -1;
    uVar9 = (ulong)(uVar1 << 3);
    uVar12 = (ulong)((int)uVar14 + 0xc4);
    lVar7 = (uVar14 + 0xc4) - uVar9;
    *(undefined8 *)(param_1 + 3) = auStack_9c[uVar10 * 8 + 1];
    *(undefined8 *)(param_1 + 1) = uVar16;
    if (((int *)((long)local_160 + uVar12) <= piVar5) ||
       ((long)param_1 + uVar9 + 0x14 <= (long)local_160 + (uVar12 - uVar9))) {
      lVar11 = uVar6 - 6;
      piVar13 = param_1 + 0xd;
      puVar8 = (undefined8 *)((long)puVar8 + (0xc - (ulong)(uVar1 << 1)) * 4);
      piVar5 = piVar5 + ((ulong)(uVar1 << 1) - 0xc);
      puVar15 = auStack_bc + uVar10 * 0x10;
      uVar6 = 6;
      do {
        auVar17._0_4_ = *puVar15;
        auVar18._0_4_ = puVar15[1];
        auVar17._4_4_ = puVar15[2];
        auVar18._4_4_ = puVar15[3];
        auVar17._8_4_ = puVar15[4];
        auVar18._8_4_ = puVar15[5];
        auVar17._12_4_ = puVar15[6];
        auVar18._12_4_ = puVar15[7];
        auVar19._0_4_ = puVar15[-8];
        auVar19._4_4_ = puVar15[-6];
        auVar19._8_4_ = puVar15[-4];
        auVar19._12_4_ = puVar15[-2];
        lVar11 = lVar11 + -8;
        auVar20 = NEON_rev64(auVar17,4);
        auVar17 = NEON_rev64(auVar18,4);
        auVar21 = NEON_ext(auVar20,auVar20,8,1);
        auVar18 = NEON_rev64(auVar19,4);
        auVar20._4_4_ = puVar15[-5];
        auVar20._0_4_ = puVar15[-7];
        auVar20._8_4_ = puVar15[-3];
        auVar20._12_4_ = puVar15[-1];
        auVar19 = NEON_rev64(auVar20,4);
        auVar22 = NEON_ext(auVar17,auVar17,8,1);
        auVar20 = NEON_ext(auVar18,auVar18,8,1);
        auVar17 = NEON_ext(auVar19,auVar19,8,1);
        piVar13[-8] = auVar21._0_4_;
        piVar13[-7] = auVar22._0_4_;
        piVar13[-6] = auVar21._4_4_;
        piVar13[-5] = auVar22._4_4_;
        piVar13[-4] = auVar21._8_4_;
        piVar13[-3] = auVar22._8_4_;
        piVar13[-2] = auVar21._12_4_;
        piVar13[-1] = auVar22._12_4_;
        *piVar13 = auVar20._0_4_;
        piVar13[1] = auVar17._0_4_;
        piVar13[2] = auVar20._4_4_;
        piVar13[3] = auVar17._4_4_;
        piVar13[4] = auVar20._8_4_;
        piVar13[5] = auVar17._8_4_;
        piVar13[6] = auVar20._12_4_;
        piVar13[7] = auVar17._12_4_;
        piVar13 = piVar13 + 0x10;
        puVar15 = puVar15 + -0x10;
      } while (lVar11 != 0);
    }
    do {
      uVar6 = uVar6 - 1;
      *(undefined8 *)piVar5 = *puVar8;
      piVar5 = piVar5 + 2;
      puVar8 = puVar8 + -1;
    } while (uVar6 != 0);
    *(undefined8 *)((long)param_1 + uVar9 + 0x14) =
         *(undefined8 *)((long)auStack_bc + lVar7 + -0xb4);
    *(undefined4 *)((long)param_1 + (uVar9 | 0xc) + 0x10) =
         *(undefined4 *)((long)local_160 + ((uVar14 | 0xbc) - uVar9));
    *(undefined4 *)((long)param_1 + (uVar9 | 0xc) + 0x14) =
         *(undefined4 *)((long)auStack_9c + lVar7 + -200);
  }
  mbedtls_platform_zeroize(local_160,0x114);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}


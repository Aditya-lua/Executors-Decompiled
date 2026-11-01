
void FUN_00269934(long param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  undefined8 *puVar4;
  ulong uVar5;
  ulong uVar6;
  uint uVar7;
  code *pcVar8;
  bool bVar9;
  int iVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  long unaff_x19;
  long unaff_x21;
  undefined8 *puVar13;
  long lVar14;
  undefined8 *puVar15;
  long lVar16;
  undefined8 *unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 *in_stack_00000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  undefined8 *in_stack_00000028;
  ulong in_stack_00000030;
  long in_stack_00000038;
  long lStack0000000000000040;
  undefined8 *in_stack_00000048;
  
  do {
    unaff_x27 = unaff_x27 + 0x50;
    lStack0000000000000040 = param_1;
    if (in_stack_00000030 <= unaff_x28) {
      lVar16 = in_stack_00000010 * 0x50;
      puVar15 = in_stack_00000008 + in_stack_00000010 * 10 + -10;
      puVar11 = unaff_x26 + -10;
      puVar1 = in_stack_00000048;
      do {
        puVar13 = puVar1;
        lVar16 = lVar16 + -0x50;
        puVar1 = (undefined8 *)((long)in_stack_00000048 + lVar16);
        uVar5 = unaff_x26[2];
        uVar6 = in_stack_00000008[2];
        uVar2 = uVar5;
        if (uVar6 <= uVar5) {
          uVar2 = uVar6;
        }
        iVar10 = _memcmp(unaff_x26[1],in_stack_00000008[1],uVar2);
        lVar14 = uVar5 - uVar6;
        if (iVar10 != 0) {
          lVar14 = (long)iVar10;
        }
        puVar4 = in_stack_00000008;
        if (lVar14 < 0) {
          puVar4 = unaff_x26;
        }
        uVar17 = puVar4[4];
        uVar18 = puVar4[7];
        uVar12 = puVar4[6];
        puVar13[5] = puVar4[5];
        puVar13[4] = uVar17;
        puVar13[7] = uVar18;
        puVar13[6] = uVar12;
        uVar17 = puVar4[8];
        puVar13[9] = puVar4[9];
        puVar13[8] = uVar17;
        uVar18 = *puVar4;
        uVar12 = puVar4[3];
        uVar17 = puVar4[2];
        puVar13[1] = puVar4[1];
        *puVar13 = uVar18;
        puVar13[3] = uVar12;
        puVar13[2] = uVar17;
        unaff_x26 = unaff_x26 + (lVar14 >> 0x3f) * -10;
        in_stack_00000008 = in_stack_00000008 + (ulong)((uint)((ulong)lVar14 >> 0x3f) ^ 1) * 10;
        uVar5 = puVar15[2];
        uVar6 = puVar11[2];
        uVar2 = uVar5;
        if (uVar6 <= uVar5) {
          uVar2 = uVar6;
        }
        iVar10 = _memcmp(puVar15[1],puVar11[1],uVar2);
        lVar14 = uVar5 - uVar6;
        if (iVar10 != 0) {
          lVar14 = (long)iVar10;
        }
        puVar4 = puVar15;
        if (lVar14 < 0) {
          puVar4 = puVar11;
        }
        uVar17 = puVar4[4];
        uVar18 = puVar4[7];
        uVar12 = puVar4[6];
        puVar1[5] = puVar4[5];
        puVar1[4] = uVar17;
        puVar1[7] = uVar18;
        puVar1[6] = uVar12;
        uVar17 = puVar4[8];
        puVar1[9] = puVar4[9];
        puVar1[8] = uVar17;
        uVar18 = *puVar4;
        uVar12 = puVar4[3];
        uVar17 = puVar4[2];
        puVar1[1] = puVar4[1];
        *puVar1 = uVar18;
        puVar1[3] = uVar12;
        puVar1[2] = uVar17;
        uVar7 = (uint)(lVar14 >> 0x3f);
        puVar15 = puVar15 + (long)(int)~uVar7 * 10;
        puVar11 = puVar11 + (long)(int)uVar7 * 10;
        in_stack_00000038 = in_stack_00000038 + -1;
        puVar1 = puVar13 + 10;
      } while (in_stack_00000038 != 0);
      if ((in_stack_00000010 & 1) != 0) {
        bVar9 = puVar11 + 10 <= in_stack_00000008;
        puVar1 = in_stack_00000008;
        if (bVar9) {
          puVar1 = unaff_x26;
        }
        uVar17 = puVar1[4];
        uVar18 = puVar1[7];
        uVar12 = puVar1[6];
        puVar13[0xf] = puVar1[5];
        puVar13[0xe] = uVar17;
        puVar13[0x11] = uVar18;
        puVar13[0x10] = uVar12;
        uVar17 = puVar1[8];
        puVar13[0x13] = puVar1[9];
        puVar13[0x12] = uVar17;
        uVar18 = *puVar1;
        uVar12 = puVar1[3];
        uVar17 = puVar1[2];
        puVar13[0xb] = puVar1[1];
        puVar13[10] = uVar18;
        puVar13[0xd] = uVar12;
        puVar13[0xc] = uVar17;
        in_stack_00000008 = in_stack_00000008 + (ulong)!bVar9 * 10;
        unaff_x26 = unaff_x26 + (ulong)bVar9 * 10;
      }
      if (in_stack_00000008 != puVar11 + 10 || unaff_x26 != puVar15 + 10) {
        func_0x007a286c();
                    /* WARNING: Does not return */
        pcVar8 = (code *)SoftwareBreakpoint(1,0x269b54);
        (*pcVar8)();
      }
      return;
    }
    puVar15 = (undefined8 *)(unaff_x19 + unaff_x28 * 0x50);
    puVar1 = unaff_x26 + unaff_x28 * 10;
    uVar17 = *puVar15;
    uVar18 = puVar15[3];
    uVar12 = puVar15[2];
    puVar1[1] = puVar15[1];
    *puVar1 = uVar17;
    puVar1[3] = uVar18;
    puVar1[2] = uVar12;
    uVar17 = puVar15[4];
    uVar18 = puVar15[7];
    uVar12 = puVar15[6];
    puVar1[5] = puVar15[5];
    puVar1[4] = uVar17;
    puVar1[7] = uVar18;
    puVar1[6] = uVar12;
    uVar17 = puVar15[8];
    puVar1[9] = puVar15[9];
    puVar1[8] = uVar17;
    uVar17 = puVar1[1];
    uVar5 = puVar1[2];
    uVar6 = puVar1[-8];
    uVar2 = uVar5;
    if (uVar6 <= uVar5) {
      uVar2 = uVar6;
    }
    iVar10 = _memcmp(uVar17,puVar1[-9],uVar2);
    lVar16 = uVar5 - uVar6;
    if (iVar10 != 0) {
      lVar16 = (long)iVar10;
    }
    if (lVar16 < 0) {
      uVar12 = *puVar1;
      lVar14 = unaff_x27;
      lVar16 = lStack0000000000000040;
      do {
        puVar1 = (undefined8 *)(lVar14 + unaff_x21);
        puVar1[5] = puVar1[-5];
        puVar1[4] = puVar1[-6];
        puVar1[7] = puVar1[-3];
        puVar1[6] = puVar1[-4];
        puVar1[9] = puVar1[-1];
        puVar1[8] = puVar1[-2];
        puVar1[1] = puVar1[-9];
        *puVar1 = puVar1[-10];
        puVar1[3] = puVar1[-7];
        puVar1[2] = puVar1[-8];
        if (unaff_x21 == lVar16) {
          puVar11 = in_stack_00000028;
          goto LAB_002698fc;
        }
        uVar6 = puVar1[-0x12];
        uVar2 = uVar5;
        if (uVar6 <= uVar5) {
          uVar2 = uVar6;
        }
        iVar10 = _memcmp(uVar17,puVar1[-0x13],uVar2);
        lVar3 = uVar5 - uVar6;
        if (iVar10 != 0) {
          lVar3 = (long)iVar10;
        }
        lVar16 = lVar16 + 0x50;
        lVar14 = lVar14 + -0x50;
      } while (lVar3 < 0);
      puVar11 = (undefined8 *)(lVar14 + unaff_x21);
LAB_002698fc:
      *puVar11 = uVar12;
      puVar1[-9] = uVar17;
      puVar1[-8] = uVar5;
      uVar17 = puVar15[3];
      puVar1[-6] = puVar15[4];
      puVar1[-7] = uVar17;
      uVar17 = puVar15[5];
      puVar1[-4] = puVar15[6];
      puVar1[-5] = uVar17;
      uVar17 = puVar15[7];
      puVar1[-2] = puVar15[8];
      puVar1[-3] = uVar17;
      puVar1[-1] = puVar15[9];
      unaff_x19 = in_stack_00000018;
      unaff_x26 = in_stack_00000028;
    }
    param_1 = lStack0000000000000040 + -0x50;
    unaff_x28 = unaff_x28 + 1;
  } while( true );
}


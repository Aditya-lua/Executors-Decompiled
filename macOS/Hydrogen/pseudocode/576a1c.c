
void FUN_00576a1c(long param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  code *pcVar3;
  bool bVar4;
  ulong *in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong *puVar5;
  ulong in_x12;
  long in_x13;
  ulong *puVar6;
  long in_x14;
  long lVar7;
  ulong *in_x15;
  ulong *puVar8;
  ulong *in_x16;
  ulong *in_x17;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  
  do {
    if (in_x12 < in_x17[-9]) {
      uVar11 = in_x16[2];
      uVar9 = in_x16[1];
      uVar15 = in_x16[4];
      uVar13 = in_x16[3];
      uVar12 = in_x16[6];
      uVar10 = in_x16[5];
      uVar16 = in_x16[8];
      uVar14 = in_x16[7];
      puVar6 = in_x15;
      lVar7 = in_x13;
      do {
        puVar6[5] = puVar6[-4];
        puVar6[4] = puVar6[-5];
        puVar6[7] = puVar6[-2];
        puVar6[6] = puVar6[-3];
        puVar6[8] = puVar6[-1];
        puVar6[1] = puVar6[-8];
        *puVar6 = puVar6[-9];
        puVar6[3] = puVar6[-6];
        puVar6[2] = puVar6[-7];
        if (lVar7 == 0) {
          puVar6 = in_x9;
          break;
        }
        puVar1 = puVar6 + -0x12;
        lVar7 = lVar7 + 0x48;
        puVar6 = puVar6 + -9;
      } while (in_x12 < *puVar1);
      *puVar6 = in_x12;
      puVar6[2] = uVar11;
      puVar6[1] = uVar9;
      puVar6[8] = uVar16;
      puVar6[7] = uVar14;
      puVar6[6] = uVar12;
      puVar6[5] = uVar10;
      puVar6[4] = uVar15;
      puVar6[3] = uVar13;
    }
    in_x13 = in_x13 + -0x48;
    in_x15 = in_x15 + 9;
    if (in_x11 <= in_x10) {
      lVar7 = unaff_x21 * 0x48;
      puVar6 = unaff_x19 + unaff_x21 * 9 + -9;
      puVar8 = in_x9 + -9;
      puVar1 = unaff_x20;
      do {
        puVar5 = puVar1;
        lVar7 = lVar7 + -0x48;
        puVar1 = (ulong *)((long)unaff_x20 + lVar7);
        bVar4 = *unaff_x19 <= *in_x9;
        puVar2 = in_x9;
        if (bVar4) {
          puVar2 = unaff_x19;
        }
        uVar9 = puVar2[4];
        uVar11 = puVar2[7];
        uVar10 = puVar2[6];
        puVar5[5] = puVar2[5];
        puVar5[4] = uVar9;
        puVar5[7] = uVar11;
        puVar5[6] = uVar10;
        puVar5[8] = puVar2[8];
        uVar11 = *puVar2;
        uVar10 = puVar2[3];
        uVar9 = puVar2[2];
        puVar5[1] = puVar2[1];
        *puVar5 = uVar11;
        puVar5[3] = uVar10;
        puVar5[2] = uVar9;
        in_x9 = in_x9 + (ulong)!bVar4 * 9;
        unaff_x19 = unaff_x19 + (ulong)bVar4 * 9;
        bVar4 = *puVar8 <= *puVar6;
        puVar2 = puVar8;
        if (bVar4) {
          puVar2 = puVar6;
        }
        puVar1[8] = puVar2[8];
        uVar11 = puVar2[4];
        uVar10 = puVar2[7];
        uVar9 = puVar2[6];
        puVar1[5] = puVar2[5];
        puVar1[4] = uVar11;
        puVar1[7] = uVar10;
        puVar1[6] = uVar9;
        uVar9 = *puVar2;
        uVar11 = puVar2[3];
        uVar10 = puVar2[2];
        puVar6 = puVar6 + (ulong)bVar4 * -9;
        puVar8 = puVar8 + (ulong)!bVar4 * -9;
        puVar1[1] = puVar2[1];
        *puVar1 = uVar9;
        puVar1[3] = uVar11;
        puVar1[2] = uVar10;
        param_1 = param_1 + -1;
        puVar1 = puVar5 + 9;
      } while (param_1 != 0);
      if ((unaff_x21 & 1) != 0) {
        bVar4 = puVar8 + 9 <= unaff_x19;
        puVar1 = unaff_x19;
        if (bVar4) {
          puVar1 = in_x9;
        }
        uVar9 = puVar1[4];
        uVar11 = puVar1[7];
        uVar10 = puVar1[6];
        puVar5[0xe] = puVar1[5];
        puVar5[0xd] = uVar9;
        puVar5[0x10] = uVar11;
        puVar5[0xf] = uVar10;
        puVar5[0x11] = puVar1[8];
        uVar11 = *puVar1;
        uVar10 = puVar1[3];
        uVar9 = puVar1[2];
        puVar5[10] = puVar1[1];
        puVar5[9] = uVar11;
        puVar5[0xc] = uVar10;
        puVar5[0xb] = uVar9;
        unaff_x19 = unaff_x19 + (ulong)!bVar4 * 9;
        in_x9 = in_x9 + (ulong)bVar4 * 9;
      }
      if (unaff_x19 != puVar8 + 9 || in_x9 != puVar6 + 9) {
        func_0x007a286c();
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x576b8c);
        (*pcVar3)();
      }
      return;
    }
    in_x16 = (ulong *)(in_x14 + in_x10 * 0x48);
    in_x17 = in_x9 + in_x10 * 9;
    uVar9 = *in_x16;
    uVar11 = in_x16[3];
    uVar10 = in_x16[2];
    in_x17[1] = in_x16[1];
    *in_x17 = uVar9;
    in_x17[3] = uVar11;
    in_x17[2] = uVar10;
    uVar9 = in_x16[4];
    uVar11 = in_x16[7];
    uVar10 = in_x16[6];
    in_x17[5] = in_x16[5];
    in_x17[4] = uVar9;
    in_x17[7] = uVar11;
    in_x17[6] = uVar10;
    in_x17[8] = in_x16[8];
    in_x12 = *in_x17;
    in_x10 = in_x10 + 1;
  } while( true );
}



/* WARNING: Removing unreachable block (ram,0x007662cc) */
/* WARNING: Removing unreachable block (ram,0x007662e0) */
/* WARNING: Removing unreachable block (ram,0x0076634c) */
/* WARNING: Removing unreachable block (ram,0x007662e4) */
/* WARNING: Removing unreachable block (ram,0x00766350) */
/* WARNING: Removing unreachable block (ram,0x00766894) */
/* WARNING: Removing unreachable block (ram,0x00766364) */

ulong FUN_00765f10(void)

{
  uint uVar1;
  uint uVar2;
  bool in_ZR;
  bool bVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  undefined8 uVar8;
  long lVar9;
  ulong uVar10;
  ulong in_x9;
  ulong uVar11;
  undefined1 *in_x13;
  ulong unaff_x19;
  uint unaff_w22;
  long lVar12;
  byte *pbVar13;
  byte *pbVar14;
  uint unaff_w24;
  char *pcVar15;
  long unaff_x25;
  int unaff_w26;
  ulong unaff_x27;
  int unaff_w28;
  long unaff_x29;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  byte *in_stack_00000038;
  undefined8 in_stack_00000048;
  byte bStack0000000000000078;
  undefined1 uStack00000000000001c0;
  uint uStack_7ffffffc;
  long alStack_7ffffff8 [268435451];
  
  if (!in_ZR) {
    in_x9 = unaff_x27;
  }
  if (unaff_w28 == -1) {
    unaff_w28 = 1;
  }
  pbVar14 = in_stack_00000038;
  if (in_x9 != 0) {
    pbVar13 = in_stack_00000038;
    do {
      pbVar14 = pbVar13 + -1;
      *pbVar13 = (char)in_x9 + (char)(in_x9 / 10) * -10 | 0x30;
      bVar3 = 9 < in_x9;
      in_x9 = in_x9 / 10;
      pbVar13 = pbVar14;
    } while (bVar3);
  }
  iVar6 = (int)in_stack_00000038 - (int)pbVar14;
  iVar5 = unaff_w26 - iVar6;
  iVar6 = unaff_w28 - iVar6;
  if ((0 < iVar6) && (iVar5 = iVar5 - iVar6, &bStack0000000000000078 <= pbVar14)) {
    uVar10 = (ulong)(((unaff_w28 - (int)&bStack0000000000000078) + (int)pbVar14) - 0x145);
    uVar11 = (long)pbVar14 - (long)&bStack0000000000000078;
    if (uVar10 <= uVar11) {
      uVar11 = uVar10;
    }
    _memset((long)pbVar14 - uVar11,0x30,uVar11 + 1);
    in_x13 = &uStack00000000000001c0;
    pbVar14 = (byte *)(((long)pbVar14 - uVar11) + -1);
  }
  uVar1 = unaff_w22;
  if ((unaff_w24 & 3) != 0) {
    uVar1 = 1;
  }
  iVar6 = iVar5 - uVar1;
  iVar4 = iVar6;
  if (((unaff_w24 & 0x104) == 0) && (iVar4 = iVar6 + -1, 0 < iVar6)) {
    iVar7 = (int)unaff_x19;
    do {
      iVar4 = _fputc(0x20);
      if (iVar4 == -1) goto LAB_00766898;
      unaff_x19 = (ulong)((int)unaff_x19 + 1);
      iVar4 = iVar6 + -1;
      bVar3 = 0 < iVar6;
      iVar6 = iVar4;
    } while (iVar4 != 0 && bVar3);
    iVar4 = -1;
    in_x13 = &uStack00000000000001c0;
    unaff_x19 = (ulong)((iVar5 + iVar7) - (uVar1 & 1));
  }
  if (unaff_w22 == 0) {
    if ((unaff_w24 >> 1 & 1) == 0) {
      if ((unaff_w24 & 1) == 0) goto LAB_007662c8;
      uVar8 = 0x20;
    }
    else {
      uVar8 = 0x2b;
    }
  }
  else {
    uVar8 = 0x2d;
  }
  iVar5 = _fputc(uVar8);
  if (iVar5 == -1) {
LAB_00766898:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x70)) {
      return unaff_x19;
    }
    lVar9 = ___stack_chk_fail();
    lVar12 = (*pcRam0000000000a2b608)(1,0x50);
    if (lVar12 == 0) {
      return 0x1b;
    }
    func_0x0074066c(lVar12 + 0x28,0x10000);
    *(long *)(lVar9 + 0x1b0) = lVar12;
    return 0;
  }
  unaff_x19 = (ulong)((int)unaff_x19 + 1);
  in_x13 = &uStack00000000000001c0;
LAB_007662c8:
  iVar5 = iVar4;
  if (((unaff_w24 & 0x104) == 0x100) && (iVar5 = iVar4 + -1, 0 < iVar4)) {
    iVar6 = (int)unaff_x19;
    iVar5 = iVar4;
    do {
      iVar7 = _fputc(0x30);
      if (iVar7 == -1) goto LAB_00766898;
      unaff_x19 = (ulong)((int)unaff_x19 + 1);
      iVar7 = iVar5 + -1;
      bVar3 = 0 < iVar5;
      iVar5 = iVar7;
    } while (iVar7 != 0 && bVar3);
    in_x13 = &uStack00000000000001c0;
    unaff_x19 = (ulong)(uint)(iVar6 + iVar4);
    iVar5 = -1;
  }
  uVar11 = unaff_x19;
  if (pbVar14 + 1 <= in_stack_00000038) {
    uVar11 = (ulong)(uint)((in_stack_00000030._4_4_ + (int)unaff_x19) - (int)pbVar14);
    in_stack_00000028 = in_stack_00000028 - (long)pbVar14;
    do {
      pbVar14 = pbVar14 + 1;
      iVar6 = _fputc(*pbVar14);
      if (iVar6 == -1) goto LAB_00766898;
      unaff_x19 = (ulong)((int)unaff_x19 + 1);
      in_stack_00000028 = in_stack_00000028 + -1;
    } while (in_stack_00000028 != 0);
    in_x13 = &uStack00000000000001c0;
  }
  uVar10 = uVar11;
  if (((unaff_w24 >> 2 & 1) != 0) && (0 < iVar5)) {
    uVar10 = (ulong)(uint)(iVar5 + (int)uVar11);
    iVar5 = iVar5 + 1;
    do {
      iVar6 = _fputc(0x20);
      unaff_x19 = uVar11;
      if (iVar6 == -1) goto LAB_00766898;
      uVar11 = (ulong)((int)uVar11 + 1);
      iVar5 = iVar5 + -1;
    } while (1 < iVar5);
    in_x13 = &uStack00000000000001c0;
  }
LAB_00765dc4:
  do {
    unaff_x25 = unaff_x25 + 1;
    unaff_x19 = uVar10;
    if (in_stack_00000048._4_4_ <= unaff_x25) goto LAB_00766898;
    lVar9 = unaff_x25 * 0x20;
    lVar12 = *(long *)((long)register0x00000008 + lVar9 + 0x9d8);
    uVar1 = *(uint *)((long)register0x00000008 + lVar9 + 0x9c8);
    if (lVar12 != 0) {
      pcVar15 = *(char **)((long)register0x00000008 + lVar9 + 0x9d0);
      iVar6 = (int)lVar12;
      iVar5 = (int)uVar10;
      do {
        if (*pcVar15 == '\0') goto code_r0x00765e18;
        iVar4 = _fputc();
        unaff_x19 = uVar10;
        if (iVar4 == -1) goto LAB_00766898;
        pcVar15 = pcVar15 + 1;
        uVar10 = (ulong)((int)uVar10 + 1);
        lVar12 = lVar12 + -1;
      } while (lVar12 != 0);
      uVar10 = (ulong)(uint)(iVar5 + iVar6);
code_r0x00765e18:
      in_x13 = &uStack00000000000001c0;
      if ((uVar1 >> 0x14 & 1) != 0) goto LAB_00765dc4;
    }
    uVar2 = uVar1;
    if (((uVar1 >> 0xe & 1) != 0) &&
       (*(int *)(in_x13 + (long)*(int *)((long)register0x00000008 + lVar9 + 0x9c0) * 0x10 + 8) < 0))
    {
      uVar2 = uVar1 & 0xfffffeff;
    }
    if ((uVar1 >> 0x10 & 1) == 0) {
      if ((uVar2 >> 0xf & 1) == 0) {
        uVar1 = *(uint *)(in_x13 + (ulong)*(uint *)((long)register0x00000008 +
                                                   unaff_x25 * 0x20 + 0x9cc) * 0x10);
      }
      else {
        uVar1 = *(uint *)(in_x13 + (ulong)*(uint *)((long)register0x00000008 +
                                                   unaff_x25 * 0x20 + 0x9cc) * 0x10);
      }
    }
    else {
      uVar1 = *(uint *)(in_x13 + (ulong)*(uint *)((long)register0x00000008 +
                                                 unaff_x25 * 0x20 + 0x9cc) * 0x10);
    }
    if (uVar1 < 10) {
                    /* WARNING: Could not recover jumptable at 0x00765edc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar11 = (*(code *)(&UNK_00765ee0 + (ulong)(byte)(&UNK_008cd859)[uVar1] * 4))();
      return uVar11;
    }
  } while( true );
}


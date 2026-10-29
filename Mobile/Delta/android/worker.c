
ulong FUN_00742c80(ulong param_1)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined1 uVar5;
  long lVar6;
  ulong *puVar7;
  undefined8 *puVar8;
  undefined4 *puVar9;
  undefined1 *puVar10;
  long *plVar11;
  undefined8 uVar12;
  ulong *puVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  ulong uVar17;
  undefined8 uVar18;
  long lVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  long lVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  undefined8 ***local_4c0;
  undefined8 ***local_4b8;
  ulong local_4b0;
  ulong local_4a8;
  ulong local_237;
  long local_70;
  
  lVar6 = tpidr_el0;
  local_4b8 = &local_4c0;
  local_4c0 = &local_4b8;
  local_70 = *(long *)(lVar6 + 0x28);
  puVar7 = (ulong *)FUN_010223f8(&DAT_012ad560);
  uVar17 = *puVar7;
  puVar8 = (undefined8 *)FUN_010223f8(&DAT_012ad580);
  uVar18 = *puVar8;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad540);
  uVar1 = *puVar9;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad5e0);
  uVar2 = *puVar9;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad600);
  uVar3 = *puVar9;
  puVar10 = (undefined1 *)FUN_010223f8(&DAT_012ad6a0);
  uVar5 = *puVar10;
  plVar11 = (long *)FUN_010223f8(&DAT_012ad6c0);
  lVar19 = *plVar11;
  puVar8 = (undefined8 *)FUN_010223f8(&DAT_012ad620);
  uVar20 = *puVar8;
  puVar8 = (undefined8 *)FUN_010223f8(&DAT_012ad640);
  uVar21 = *puVar8;
  puVar8 = (undefined8 *)FUN_010223f8(&DAT_012ad660);
  uVar22 = *puVar8;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad680);
  uVar4 = *puVar9;
  puVar7 = (ulong *)FUN_010223f8(&DAT_012ad5a0);
  lVar23 = 0;
  uVar25 = *puVar7;
  do {
    *(undefined1 *)((long)&local_4b0 + lVar23) = 0;
    lVar23 = lVar23 + 1;
  } while (lVar23 != 0x440);
  uVar12 = FUN_010223f8(&DAT_012ad5c0);
  lVar23 = FUN_01021fa0(0x17151fcca910e663,uVar12);
  uVar24 = lVar23 + 0x17151fcca910e663U ^ (ulong)&local_4b0 ^ 0xcd23db3c70f76fd;
  uVar24 = (uVar24 ^ uVar24 >> 0x1e) * -0x40a7b892e31b1a47;
  uVar24 = (uVar24 ^ uVar24 >> 0x1b) * -0x6b2fb644ecceee15;
  puVar7 = (ulong *)FUN_010223f8(&DAT_012ad5a0);
  *puVar7 = uVar24 ^ uVar24 >> 0x1f;
  uVar24 = (*puVar7 ^ 0xd0e97e427d08fe48 ^ (*puVar7 ^ 0xd0e97e427d08fe48) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uVar24 = (uVar24 ^ uVar24 >> 0x1b) * -0x6b2fb644ecceee15;
  local_237 = uVar24 ^ (ulong)&DAT_012b9680 ^ uVar24 >> 0x1f;
  uVar24 = (*puVar7 ^ 0x167948223877d10d ^ (*puVar7 ^ 0x167948223877d10d) >> 0x1e) *
           -0x40a7b892e31b1a47;
  local_4a8 = (uVar24 ^ uVar24 >> 0x1b) * -0x6b2fb644ecceee15;
  local_4a8 = param_1 ^ local_4a8 >> 0x1f ^ local_4a8;
  puVar13 = (ulong *)FUN_010223f8(&DAT_012ad560);
  *puVar13 = (ulong)&local_4b0;
  puVar8 = (undefined8 *)FUN_010223f8(&DAT_012ad580);
  *puVar8 = &DAT_0023e970;
  puVar14 = (undefined8 *)FUN_010223f8(&DAT_012ad640);
  *puVar14 = &DAT_0023f4d2;
  puVar15 = (undefined8 *)FUN_010223f8(&DAT_012ad620);
  *puVar15 = &DAT_0023f492;
  puVar16 = (undefined8 *)FUN_010223f8(&DAT_012ad660);
  *puVar16 = &DAT_001d22e0;
  uVar26 = (DAT_012ad848 ^ DAT_012ad848 >> 0x21) * -0xae502812aa7333;
  uVar26 = uVar26 ^ uVar26 >> 0x1d;
  uVar24 = uVar26 ^ 0x4d065c;
  uVar24 = ((ulong)((uint)uVar26 ^ (int)(uVar24 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar24 & 0xffff ^ (uint)uVar26) & 0xffff |
           (uVar26 ^ (uVar26 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar26 & 0xffff000000000000 ^ uVar24 & 0xffff000000000000) - uVar26;
  plVar11 = (long *)FUN_010223f8(&DAT_012ad6c0);
  *plVar11 = (uVar24 ^ (long)&DAT_0023be68 + uVar26) + (uVar24 & (long)&DAT_0023be68 + uVar26) * 2;
  uVar26 = (DAT_012ad848 ^ DAT_012ad848 >> 0x21) * -0xae502812aa7333;
  uVar26 = uVar26 ^ uVar26 >> 0x1d;
  uVar24 = uVar26 ^ 0x4a26a8;
  uVar24 = ((ulong)((uint)uVar26 ^ (int)(uVar24 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar24 & 0xffff ^ (uint)uVar26) & 0xffff |
           (uVar26 ^ (uVar26 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar26 & 0xffff000000000000 ^ uVar24 & 0xffff000000000000) - uVar26;
  (*(code *)((uVar24 ^ (long)&DAT_0023be70 + uVar26) + (uVar24 & (long)&DAT_0023be70 + uVar26) * 2))
            ();
  uVar24 = *puVar7;
  *puVar7 = uVar25;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad680);
  *puVar9 = uVar4;
  *puVar16 = uVar22;
  *puVar14 = uVar21;
  *puVar15 = uVar20;
  *plVar11 = lVar19;
  puVar10 = (undefined1 *)FUN_010223f8(&DAT_012ad6a0);
  *puVar10 = uVar5;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad600);
  *puVar9 = uVar3;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad5e0);
  *puVar9 = uVar2;
  puVar9 = (undefined4 *)FUN_010223f8(&DAT_012ad540);
  *puVar9 = uVar1;
  *puVar8 = uVar18;
  *puVar13 = uVar17;
  if (*(long *)(lVar6 + 0x28) == local_70) {
    uVar17 = (uVar24 ^ 0xe7c285e9c22431a5 ^ (uVar24 ^ 0xe7c285e9c22431a5) >> 0x1e) *
             -0x40a7b892e31b1a47;
    uVar17 = (uVar17 ^ uVar17 >> 0x1b) * -0x6b2fb644ecceee15;
    return local_4b0 ^ uVar17 >> 0x1f ^ uVar17;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


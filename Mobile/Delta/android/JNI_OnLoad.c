
/* WARNING: Type propagation algorithm not settling */

uint JNI_OnLoad(ulong param_1,ulong param_2)

{
  undefined8 *puVar1;
  undefined4 *puVar2;
  byte *pbVar3;
  long *plVar4;
  ulong *puVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  uint local_900;
  ulong local_8fc;
  ulong local_8f4;
  ulong local_26d;
  ulong local_13c;
  undefined8 *******local_e0 [2];
  undefined8 *******local_d0 [2];
  ulong local_c0;
  undefined4 local_b4;
  undefined8 local_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  long local_98;
  uint local_90;
  undefined4 local_8c;
  undefined4 local_88;
  undefined4 local_84;
  undefined8 local_80;
  undefined8 local_78;
  long local_70;
  long local_68;
  
  local_70 = tpidr_el0;
  local_68 = *(long *)(local_70 + 0x28);
  local_e0[0] = local_d0;
  local_d0[0] = local_e0;
  puVar1 = (undefined8 *)FUN_010223f8(&DAT_012ada10);
  local_78 = *puVar1;
  puVar1 = (undefined8 *)FUN_010223f8(&DAT_012ada30);
  local_80 = *puVar1;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012ad9f0);
  local_84 = *puVar2;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012ada90);
  local_88 = *puVar2;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012adab0);
  local_8c = *puVar2;
  pbVar3 = (byte *)FUN_010223f8(&DAT_012adb50);
  local_90 = (uint)*pbVar3;
  plVar4 = (long *)FUN_010223f8(&DAT_012adb70);
  local_98 = *plVar4;
  puVar1 = (undefined8 *)FUN_010223f8(&DAT_012adad0);
  local_a0 = *puVar1;
  puVar1 = (undefined8 *)FUN_010223f8(&DAT_012adaf0);
  local_a8 = *puVar1;
  puVar1 = (undefined8 *)FUN_010223f8(&DAT_012adb10);
  local_b0 = *puVar1;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012adb30);
  local_b4 = *puVar2;
  puVar5 = (ulong *)FUN_010223f8(&DAT_012ada50);
  local_c0 = *puVar5;
  lVar12 = 0;
  do {
    *(undefined1 *)((long)&local_900 + lVar12) = 0;
    lVar12 = lVar12 + 1;
  } while (lVar12 != 0x819);
  uVar6 = FUN_010223f8(&DAT_012ada70);
  lVar12 = FUN_01021fa0(0x23e664716bf8523f,uVar6);
  uVar13 = lVar12 + 0x23e664716bf8523fU ^ (ulong)&local_900 ^ 0x6c3712259c297a43;
  uVar13 = (uVar13 ^ uVar13 >> 0x1e) * -0x40a7b892e31b1a47;
  uVar13 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  puVar5 = (ulong *)FUN_010223f8(&DAT_012ada50);
  *puVar5 = uVar13 ^ uVar13 >> 0x1f;
  uVar15 = (DAT_012ad848 ^ DAT_012ad848 >> 0x21) * -0xae502812aa7333;
  uVar15 = uVar15 ^ uVar15 >> 0x1d;
  uVar13 = uVar15 ^ 0x5070d8;
  uVar13 = ((ulong)((uint)uVar15 ^ (int)(uVar13 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar13 & 0xffff ^ (uint)uVar15) & 0xffff |
           (uVar15 ^ (uVar15 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar15 & 0xffff000000000000 ^ uVar13 & 0xffff000000000000) - uVar15;
  uVar14 = (*puVar5 ^ 0x2930a13dfc067cd7 ^ (*puVar5 ^ 0x2930a13dfc067cd7) >> 0x1e) *
           -0x40a7b892e31b1a47;
  local_13c = (uVar14 ^ uVar14 >> 0x1b) * -0x6b2fb644ecceee15;
  local_13c = (uVar13 ^ (long)&DAT_0023bba8 + uVar15) + (uVar13 & (long)&DAT_0023bba8 + uVar15) * 2
              ^ local_13c >> 0x1f ^ local_13c;
  uVar13 = (*puVar5 ^ 0xa948dbc254c051cc ^ (*puVar5 ^ 0xa948dbc254c051cc) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uVar13 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  local_26d = uVar13 ^ (ulong)&DAT_012b9680 ^ uVar13 >> 0x1f;
  uVar13 = (*puVar5 ^ 0xf72003587f441f97 ^ (*puVar5 ^ 0xf72003587f441f97) >> 0x1e) *
           -0x40a7b892e31b1a47;
  local_8fc = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  local_8fc = param_1 ^ local_8fc >> 0x1f ^ local_8fc;
  uVar13 = (*puVar5 ^ 0xe564510c75103f3f ^ (*puVar5 ^ 0xe564510c75103f3f) >> 0x1e) *
           -0x40a7b892e31b1a47;
  local_8f4 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  local_8f4 = param_2 ^ local_8f4 >> 0x1f ^ local_8f4;
  puVar1 = (undefined8 *)FUN_010223f8(&DAT_012ada10);
  *puVar1 = &local_900;
  puVar7 = (undefined8 *)FUN_010223f8(&DAT_012ada30);
  *puVar7 = &DAT_0023f520;
  puVar8 = (undefined8 *)FUN_010223f8(&DAT_012adb10);
  *puVar8 = &DAT_001d0ef0;
  puVar9 = (undefined8 *)FUN_010223f8(&DAT_012adad0);
  *puVar9 = &DAT_0024116a;
  puVar10 = (undefined8 *)FUN_010223f8(&DAT_012adaf0);
  *puVar10 = &DAT_002411aa;
  uVar14 = (DAT_012ad848 ^ DAT_012ad848 >> 0x21) * -0xae502812aa7333;
  uVar14 = uVar14 ^ uVar14 >> 0x1d;
  uVar13 = uVar14 ^ 0x4d5c38;
  uVar13 = ((ulong)((uint)uVar14 ^ (int)(uVar13 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar13 & 0xffff ^ (uint)uVar14) & 0xffff |
           (uVar14 ^ (uVar14 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar14 & 0xffff000000000000 ^ uVar13 & 0xffff000000000000) - uVar14;
  plVar4 = (long *)FUN_010223f8(&DAT_012adb70);
  *plVar4 = (uVar13 ^ (long)&DAT_0023bbb0 + uVar14) + (uVar13 & (long)&DAT_0023bbb0 + uVar14) * 2;
  uVar14 = (DAT_012ad848 ^ DAT_012ad848 >> 0x21) * -0xae502812aa7333;
  uVar14 = uVar14 ^ uVar14 >> 0x1d;
  uVar13 = uVar14 ^ 0x4e1170;
  uVar13 = ((ulong)((uint)uVar14 ^ (int)(uVar13 >> 0x10) << 0x10) & 0xffff0000 |
            (ulong)((uint)uVar13 & 0xffff ^ (uint)uVar14) & 0xffff |
           (uVar14 ^ (uVar14 >> 0x20 & 0xffff) << 0x20) & 0xffff00000000 |
           uVar14 & 0xffff000000000000 ^ uVar13 & 0xffff000000000000) - uVar14;
  (*(code *)((uVar13 ^ (long)&DAT_0023bbb8 + uVar14) + (uVar13 & (long)&DAT_0023bbb8 + uVar14) * 2))
            ();
  uVar13 = *puVar5;
  *puVar5 = local_c0;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012adb30);
  *puVar2 = local_b4;
  *puVar8 = local_b0;
  *puVar10 = local_a8;
  *puVar9 = local_a0;
  *plVar4 = local_98;
  puVar11 = (undefined1 *)FUN_010223f8(&DAT_012adb50);
  *puVar11 = (char)local_90;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012adab0);
  *puVar2 = local_8c;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012ada90);
  *puVar2 = local_88;
  puVar2 = (undefined4 *)FUN_010223f8(&DAT_012ad9f0);
  *puVar2 = local_84;
  *puVar7 = local_80;
  *puVar1 = local_78;
  if (*(long *)(local_70 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  uVar13 = (uVar13 ^ 0x83fde5bd826defc3 ^ (uVar13 ^ 0x83fde5bd826defc3) >> 0x1e) *
           -0x40a7b892e31b1a47;
  uVar13 = (uVar13 ^ uVar13 >> 0x1b) * -0x6b2fb644ecceee15;
  return (uint)(uVar13 >> 0x1f) ^ local_900 ^ (uint)uVar13;
}


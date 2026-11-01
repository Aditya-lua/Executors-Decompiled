
undefined1 * FUN_0057fe34(long param_1)

{
  long *plVar1;
  uint uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined1 *puVar5;
  undefined1 *puVar6;
  long lVar7;
  long *plVar8;
  long in_x3;
  ulong uVar9;
  undefined8 in_x9;
  undefined8 uVar10;
  long *unaff_x21;
  ulong *puVar11;
  undefined1 auVar12 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  long lStack_120;
  undefined8 uStack_118;
  long lStack_110;
  long lStack_108;
  long lStack_100;
  long *plStack_f8;
  long lStack_f0;
  long lStack_e8;
  long lStack_e0;
  long lStack_d8;
  undefined1 auStack_d0 [64];
  long lStack_90;
  long lStack_88;
  long lStack_80;
  undefined1 auStack_78 [24];
  
  uStack0000000000000020 = *(undefined8 *)(param_1 + 0x20);
  uStack0000000000000018 = *(undefined8 *)(param_1 + 0x18);
  uStack0000000000000030 = *(undefined8 *)(param_1 + 0x30);
  uStack0000000000000028 = *(undefined8 *)(param_1 + 0x28);
  uStack0000000000000038 = *(undefined8 *)(param_1 + 0x38);
  uStack0000000000000010 = *(undefined8 *)(param_1 + 0x10);
  uStack0000000000000008 = *(undefined8 *)(param_1 + 8);
  uStack0000000000000000 = in_x9;
  puVar4 = (undefined8 *)func_0x004afc0c();
  puVar4[1] = uStack0000000000000008;
  *puVar4 = uStack0000000000000000;
  puVar4[3] = uStack0000000000000018;
  puVar4[2] = uStack0000000000000010;
  puVar4[5] = uStack0000000000000028;
  puVar4[4] = uStack0000000000000020;
  puVar4[7] = uStack0000000000000038;
  puVar4[6] = uStack0000000000000030;
  uVar10 = *(undefined8 *)(in_x3 + 8);
  *(undefined8 **)(in_x3 + 8) = puVar4;
  func_0x0057d8f8(in_x3 + 0x10);
  *(undefined8 *)(in_x3 + 0x10) = uVar10;
  uVar2 = *(byte *)(in_x3 + 0x18) - 7;
  if (uVar2 < 6) {
    *(char *)(in_x3 + 0x18) = (char)(0xb0c090a0807 >> (((ulong)uVar2 & 7) << 3));
    return (undefined1 *)((long)&MACH_HEADER.magic + 1);
  }
  func_0x007a247c(&UNK_008acde4,0x28,&UNK_009f0630);
  *(undefined8 *)(in_x3 + 0x10) = uVar10;
  puVar4 = (undefined8 *)__Unwind_Resume();
  func_0x0057c5c4();
  __Unwind_Resume(puVar4);
  func_0x007a2668();
  *unaff_x21 = in_x3;
  puVar4[1] = uStack0000000000000008;
  *puVar4 = uStack0000000000000000;
  puVar4[3] = uStack0000000000000018;
  puVar4[2] = uStack0000000000000010;
  puVar4[5] = uStack0000000000000028;
  puVar4[4] = uStack0000000000000020;
  puVar4[6] = uStack0000000000000030;
  auVar12 = __Unwind_Resume();
  plVar8 = auVar12._8_8_;
  puVar5 = auVar12._0_8_;
  if (*plVar8 == 0xb) {
    puVar11 = (ulong *)(plVar8 + 1);
    if (*puVar11 != 0x8000000000000001) {
      return puVar5;
    }
    plVar1 = plVar8 + 2;
    puVar6 = (undefined1 *)func_0x0056ba90(&lStack_120,plVar1);
    if (lStack_120 == 0) {
      return puVar6;
    }
    func_0x0057dc40(auStack_d0);
    if (-1 < lStack_110) {
      if (lStack_110 == 0) {
        lVar7 = 1;
      }
      else {
        uVar10 = 1;
        lVar7 = func_0x00187bd0(lStack_110,1);
        if (lVar7 == 0) goto LAB_005801cc;
      }
      _memcpy(lVar7,uStack_118,lStack_110);
      lStack_90 = lStack_110;
      lStack_80 = lStack_110;
      lStack_f0 = plVar8[4];
      lStack_88 = lVar7;
      if (lStack_f0 == 0) {
        func_0x007a28bc(1,0,&UNK_009edf90);
        goto LAB_005801e0;
      }
      plVar8[4] = 1;
      lStack_108 = plVar8[3] + 0x40;
      lStack_100 = plVar8[3] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f02e0);
      puVar6 = (undefined1 *)func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      uVar9 = *puVar11 ^ 0x8000000000000000;
      if (1 < uVar9) {
        uVar9 = 2;
      }
      if (uVar9 != 0) {
        if (uVar9 == 1) {
          puVar6 = (undefined1 *)func_0x0057d2dc(plVar1);
        }
        else {
          puVar6 = (undefined1 *)func_0x0057d54c(puVar11);
        }
      }
      goto LAB_00580094;
    }
    uVar10 = 0;
LAB_005801cc:
    func_0x007a1f00(uVar10,lStack_110,&UNK_009f0528);
    goto LAB_005801e0;
  }
  if (*plVar8 != 2) {
    return puVar5;
  }
  puVar6 = (undefined1 *)func_0x0056ba90(&lStack_120,plVar8 + 1);
  if (lStack_120 == 0) {
    return puVar6;
  }
  func_0x0057dc40(auStack_d0);
  if (lStack_110 < 0) {
    uVar10 = 0;
LAB_005801b0:
    func_0x007a1f00(uVar10,lStack_110,&UNK_009f0528);
  }
  else {
    if (lStack_110 == 0) {
      lVar7 = 1;
    }
    else {
      uVar10 = 1;
      lVar7 = func_0x00187bd0(lStack_110,1);
      if (lVar7 == 0) goto LAB_005801b0;
    }
    _memcpy(lVar7,uStack_118,lStack_110);
    lStack_90 = lStack_110;
    lStack_80 = lStack_110;
    lStack_f0 = plVar8[3];
    lStack_88 = lVar7;
    if (lStack_f0 != 0) {
      plVar8[3] = 1;
      lStack_108 = plVar8[2] + 0x40;
      lStack_100 = plVar8[2] + lStack_f0 * 0x40;
      lStack_e8 = 0;
      plStack_f8 = plVar8 + 1;
      func_0x0055af64(auStack_78,&lStack_108,&UNK_009f02e0);
      func_0x005ce9d0(&lStack_108,auStack_d0,&lStack_90,auStack_78);
      puVar6 = (undefined1 *)func_0x0057c5c4(plVar8);
      *plVar8 = 3;
LAB_00580094:
      plVar8[2] = lStack_100;
      plVar8[1] = lStack_108;
      plVar8[4] = lStack_f0;
      plVar8[3] = (long)plStack_f8;
      plVar8[6] = lStack_e0;
      plVar8[5] = lStack_e8;
      plVar8[7] = lStack_d8;
      *puVar5 = 1;
      return puVar6;
    }
    func_0x007a28bc(1,0,&UNK_009edf90);
  }
LAB_005801e0:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5801e4);
  (*pcVar3)();
}


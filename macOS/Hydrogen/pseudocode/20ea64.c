
void FUN_0020ea64(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long lVar3;
  short sVar4;
  short sVar5;
  int iVar6;
  uint extraout_w1;
  uint extraout_w1_00;
  long *plVar7;
  undefined8 extraout_x8;
  undefined1 (*extraout_x8_00) [16];
  undefined8 uVar8;
  undefined8 *puVar9;
  code *pcVar10;
  long lVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined8 uStack0000000000000080;
  long lStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined1 auStack_168 [72];
  undefined1 auStack_120 [16];
  long lStack_110;
  undefined1 auStack_108 [64];
  ulong uStack_c8;
  
  lVar3 = *uStack0000000000000080;
  *uStack0000000000000080 = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack0000000000000080);
  }
  __Unwind_Resume();
  lVar3 = func_0x007a2668();
  sVar4 = (**(code **)(*(long *)(lVar3 + 0xe0) + 0x28))
                    (*(long *)(lVar3 + 0xd8) +
                     (*(long *)(*(long *)(lVar3 + 0xe0) + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  if (sVar4 == 0x10) {
    lVar3 = *(long *)(lVar3 + 0x120);
  }
  else {
    lVar3 = *(long *)(lVar3 + 0x120);
    if (*(long *)(lVar3 + 0x38) != 0) {
      puVar9 = *(undefined8 **)(lVar3 + 0x30);
      puVar1 = puVar9 + *(long *)(lVar3 + 0x38) * 2;
      do {
        uVar8 = *puVar9;
        lVar11 = puVar9[1];
        iVar6 = (**(code **)(lVar11 + 0x48))(uVar8,5);
        if (iVar6 != 0) {
          sVar5 = (**(code **)(lVar11 + 0x38))(uVar8);
          if ((sVar4 == sVar5) &&
             (sVar4 != 0xf || (extraout_w1_00 & 0xffff) == (extraout_w1 & 0xffff)))
          goto LAB_0020eb6c;
        }
        puVar9 = puVar9 + 2;
      } while (puVar9 != puVar1);
    }
  }
  if (*(long *)(lVar3 + 0x38) == 0) {
    plVar7 = (long *)&UNK_009c6670;
    auVar12 = func_0x007a23d8(&UNK_00827821,0x17);
    lVar11 = *(long *)(auVar12._0_8_ + 0x70);
    uVar8 = *(undefined8 *)(lVar11 + 0x30);
    lVar3 = *(long *)(lVar11 + 0x38);
    func_0x001bae90(&lStack_180,plVar7);
    uVar2 = uStack_178;
    auVar13 = (**(code **)(lVar3 + 0x18))(uVar8);
    uVar8 = auVar13._0_8_;
    pcVar10 = *(code **)(auVar13._8_8_ + 0x30);
    (*pcVar10)(uVar8,*(undefined8 *)(auVar12._8_8_ + 8),*(undefined8 *)(auVar12._8_8_ + 0x10));
    (*pcVar10)(uVar8,uVar2,uStack_170);
    (**(code **)(auVar13._8_8_ + 0x28))(auStack_168,uVar8);
    auStack_120 = (**(code **)(*(long *)(lVar11 + 0x18) + 0x20))(*(undefined8 *)(lVar11 + 0x10),0);
    lStack_110 = lVar11;
    func_0x002349ec(auStack_108,auStack_120,auStack_168);
    if (-0x7fffffffffffffeb < *plVar7) {
      if (0x40 < uStack_c8) {
        func_0x007a28b0(uStack_c8,0x40,&UNK_009c9cd0);
                    /* WARNING: Does not return */
        pcVar10 = (code *)SoftwareBreakpoint(1,0x20ed08);
        (*pcVar10)();
      }
      func_0x001b2f70(plVar7,auStack_108);
    }
    *extraout_x8_00 = auStack_120;
    *(long *)extraout_x8_00[1] = lStack_110;
    func_0x00240a1c(auStack_108);
    if (lStack_180 != 0) {
      func_0x00187bd4(uStack_178,lStack_180,1);
    }
    return;
  }
  uVar8 = **(undefined8 **)(lVar3 + 0x30);
  lVar11 = (*(undefined8 **)(lVar3 + 0x30))[1];
LAB_0020eb6c:
  *param_3 = 1;
  param_3[1] = uVar8;
  param_3[2] = lVar11;
                    /* WARNING: Could not recover jumptable at 0x0020eb9c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(lVar11 + 0x20))(extraout_x8,uVar8);
  return;
}


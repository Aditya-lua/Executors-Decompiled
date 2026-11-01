
/* WARNING: Removing unreachable block (ram,0x005a339c) */
/* WARNING: Removing unreachable block (ram,0x005a3418) */

void FUN_005a32f8(void)

{
  uint uVar1;
  code *pcVar2;
  uint *puVar3;
  ulong *extraout_x8;
  ulong uVar4;
  long lVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  undefined1 auVar10 [16];
  ulong uStack_e8;
  ulong uStack_e0;
  ulong uStack_d8;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  ulong *puStack_68;
  ulong uStack_60;
  ulong uStack_58;
  
  __Unwind_Resume();
  func_0x007a2668();
  auVar10 = func_0x007a2668();
  puVar3 = auVar10._0_8_;
  uVar1 = *puVar3;
  lVar9 = *(long *)(puVar3 + 0x12);
  if (uVar1 == 1) {
    lVar5 = *(long *)(puVar3 + 10);
    if (lVar9 == 0) {
      if (*(long *)(puVar3 + 2) == 0) {
        if (lVar5 == 0) goto code_r0x005a3404;
        lVar5 = *(long *)(puVar3 + 0xc);
        lVar6 = *(long *)(puVar3 + 0x10);
        goto code_r0x005a3384;
      }
      uVar4 = (ulong)(*(long *)(puVar3 + 8) - *(long *)(puVar3 + 4)) >> 3;
      if (lVar5 == 0) goto code_r0x005a3430;
      uVar4 = uVar4 + ((ulong)(*(long *)(puVar3 + 0x10) - *(long *)(puVar3 + 0xc)) >> 3);
      uVar7 = uVar4 * 8;
    }
    else {
      if (*(long *)(puVar3 + 2) == 0) {
        if (lVar5 == 0) {
          uVar4 = 0;
        }
        else {
          uVar4 = (ulong)(*(long *)(puVar3 + 0x10) - *(long *)(puVar3 + 0xc)) >> 3;
        }
      }
      else {
        uVar4 = (ulong)(*(long *)(puVar3 + 8) - *(long *)(puVar3 + 4)) >> 3;
        if (lVar5 != 0) {
          uVar4 = uVar4 + ((ulong)(*(long *)(puVar3 + 0x10) - *(long *)(puVar3 + 0xc)) >> 3);
        }
      }
      uVar4 = uVar4 + ((ulong)(*(long *)(puVar3 + 0x18) - *(long *)(puVar3 + 0x14)) >> 3);
code_r0x005a3430:
      uVar7 = uVar4 << 3;
    }
    uVar8 = 0;
    if (uVar4 >> 0x3d != 0) goto LAB_005a35d8;
  }
  else if (lVar9 == 0) {
code_r0x005a3404:
    uVar4 = 0;
    uVar7 = 0;
  }
  else {
    lVar5 = *(long *)(puVar3 + 0x14);
    lVar6 = *(long *)(puVar3 + 0x18);
code_r0x005a3384:
    uVar4 = (ulong)(lVar6 - lVar5) >> 3;
    uVar7 = uVar4 << 3;
  }
  uVar8 = 0;
  if (0x7ffffffffffffff8 < uVar7) {
LAB_005a35d8:
    func_0x007a1f00(uVar8,uVar7,auVar10._8_8_);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5a35ec);
    (*pcVar2)();
  }
  if (uVar7 == 0) {
    uStack_e8 = 0;
    uStack_e0 = 8;
    if ((uVar1 & 1) != 0) goto LAB_005a347c;
LAB_005a34c8:
    if (lVar9 == 0) goto LAB_005a3550;
    lVar9 = *(long *)(puVar3 + 0x14);
    lVar5 = *(long *)(puVar3 + 0x18);
LAB_005a34d4:
    uVar4 = (ulong)(lVar5 - lVar9) >> 3;
LAB_005a3548:
    uStack_d8 = 0;
    if (uStack_e8 < uVar4) {
      func_0x007af5a0(&uStack_e8,0,uVar4,8,8);
      goto LAB_005a3554;
    }
  }
  else {
    uVar8 = 8;
    uStack_e0 = func_0x00187bd0(uVar7,8);
    if (uStack_e0 == 0) goto LAB_005a35d8;
    uStack_e8 = uVar4;
    if ((uVar1 & 1) == 0) goto LAB_005a34c8;
LAB_005a347c:
    lVar5 = *(long *)(puVar3 + 10);
    if (lVar9 != 0) {
      if (*(long *)(puVar3 + 2) == 0) {
        if (lVar5 == 0) {
          uVar4 = 0;
        }
        else {
          uVar4 = (ulong)(*(long *)(puVar3 + 0x10) - *(long *)(puVar3 + 0xc)) >> 3;
        }
      }
      else {
        uVar4 = (ulong)(*(long *)(puVar3 + 8) - *(long *)(puVar3 + 4)) >> 3;
        if (lVar5 != 0) {
          uVar4 = uVar4 + ((ulong)(*(long *)(puVar3 + 0x10) - *(long *)(puVar3 + 0xc)) >> 3);
        }
      }
      uVar4 = uVar4 + ((ulong)(*(long *)(puVar3 + 0x18) - *(long *)(puVar3 + 0x14)) >> 3);
      goto LAB_005a3548;
    }
    if (*(long *)(puVar3 + 2) != 0) {
      uVar4 = (ulong)(*(long *)(puVar3 + 8) - *(long *)(puVar3 + 4)) >> 3;
      if (lVar5 != 0) {
        uVar4 = uVar4 + ((ulong)(*(long *)(puVar3 + 0x10) - *(long *)(puVar3 + 0xc)) >> 3);
      }
      goto LAB_005a3548;
    }
    if (lVar5 != 0) {
      lVar9 = *(long *)(puVar3 + 0xc);
      lVar5 = *(long *)(puVar3 + 0x10);
      goto LAB_005a34d4;
    }
  }
LAB_005a3550:
  uStack_d8 = 0;
LAB_005a3554:
  puStack_68 = &uStack_d8;
  uStack_88 = *(undefined8 *)(puVar3 + 0x12);
  uStack_90 = *(undefined8 *)(puVar3 + 0x10);
  uStack_78 = *(undefined8 *)(puVar3 + 0x16);
  uStack_80 = *(undefined8 *)(puVar3 + 0x14);
  uStack_70 = *(undefined8 *)(puVar3 + 0x18);
  uStack_c8 = *(undefined8 *)(puVar3 + 2);
  uStack_d0 = *(undefined8 *)puVar3;
  uStack_b8 = *(undefined8 *)(puVar3 + 6);
  uStack_c0 = *(undefined8 *)(puVar3 + 4);
  uStack_a8 = *(undefined8 *)(puVar3 + 10);
  uStack_b0 = *(undefined8 *)(puVar3 + 8);
  uStack_98 = *(undefined8 *)(puVar3 + 0xe);
  uStack_a0 = *(undefined8 *)(puVar3 + 0xc);
  uStack_60 = uStack_d8;
  uStack_58 = uStack_e0;
  func_0x005bbe90(&uStack_d0,&puStack_68);
  extraout_x8[1] = uStack_e0;
  *extraout_x8 = uStack_e8;
  extraout_x8[2] = uStack_d8;
  return;
}


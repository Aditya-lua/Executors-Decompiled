
void FUN_0059eed8(long param_1)

{
  bool in_ZR;
  bool in_CY;
  undefined8 uVar1;
  ulong uVar2;
  ulong *extraout_x8;
  long *plVar3;
  long *unaff_x19;
  ulong uVar4;
  long unaff_x20;
  undefined8 *puVar5;
  long lVar6;
  undefined8 uVar7;
  dword *pdVar8;
  undefined8 unaff_x23;
  long lVar9;
  ulong uVar10;
  long unaff_x24;
  ulong uVar11;
  undefined8 uStack0000000000000008;
  dword *pdStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  if (!in_CY || in_ZR) {
    if (unaff_x20 == 0) {
      uStack0000000000000008 = 0;
      pdStack0000000000000010 = &MACH_HEADER.cpusubtype;
LAB_0059ef58:
      unaff_x19[1] = (long)pdStack0000000000000010;
      *unaff_x19 = uStack0000000000000008;
      unaff_x19[2] = unaff_x24;
      return;
    }
    lVar6 = *(long *)(param_1 + 8);
    unaff_x23 = 8;
    pdStack0000000000000010 = (dword *)func_0x00187bd0();
    if (pdStack0000000000000010 != (dword *)0x0) {
      uStack0000000000000008 = unaff_x24;
      if (unaff_x24 != 0) {
        lVar9 = 0;
        pdVar8 = pdStack0000000000000010;
        do {
          if (unaff_x20 == 0) break;
          func_0x005a51dc(&uStack0000000000000020,lVar6);
          lVar9 = lVar9 + 1;
          lVar6 = lVar6 + 0x30;
          *(undefined8 *)(pdVar8 + 2) = in_stack_00000028;
          *(undefined8 *)pdVar8 = uStack0000000000000020;
          *(undefined8 *)(pdVar8 + 6) = in_stack_00000038;
          *(undefined8 *)(pdVar8 + 4) = in_stack_00000030;
          *(undefined8 *)(pdVar8 + 10) = in_stack_00000048;
          *(undefined8 *)(pdVar8 + 8) = in_stack_00000040;
          unaff_x20 = unaff_x20 + -0x30;
          pdVar8 = pdVar8 + 0xc;
        } while (unaff_x24 != lVar9);
      }
      goto LAB_0059ef58;
    }
  }
  uVar1 = func_0x007a1f00(unaff_x23);
  func_0x0059e598(&uStack0000000000000008);
  __Unwind_Resume(uVar1);
  lVar6 = func_0x007a2668();
  uVar11 = *(ulong *)(lVar6 + 0x10);
  uVar4 = uVar11 * 4;
  if (uVar11 >> 0x3e == 0 && uVar4 < 0x7ffffffffffffffd) {
    uVar7 = *(undefined8 *)(lVar6 + 8);
    if (uVar4 == 0) {
      uVar10 = 0;
      uVar2 = 4;
    }
    else {
      uVar1 = 4;
      uVar2 = func_0x00187bd0(uVar4,4);
      if (uVar2 == 0) goto LAB_0059f04c;
      uVar10 = uVar11;
    }
    _memcpy(uVar2,uVar7,uVar4);
    *extraout_x8 = uVar10;
    extraout_x8[1] = uVar2;
    extraout_x8[2] = uVar11;
    return;
  }
  uVar1 = 0;
LAB_0059f04c:
  lVar6 = func_0x007a1f00(uVar1,uVar4,&UNK_009f1b38);
  if (*(long *)(lVar6 + 0x10) != 0) {
    puVar5 = *(undefined8 **)(lVar6 + 8);
    lVar6 = 1 - *(long *)(lVar6 + 0x10);
    do {
      plVar3 = (long *)*puVar5;
      if (plVar3 != (long *)0x0) {
        lVar9 = *plVar3;
        *plVar3 = lVar9 + -1;
        LORelease();
        if (lVar9 == 1) {
          func_0x005d2c74(puVar5);
        }
      }
      puVar5 = puVar5 + 3;
      lVar6 = lVar6 + 1;
    } while (lVar6 != 1);
  }
  return;
}


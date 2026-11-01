
ulong FUN_0076e404(void)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  ulong uVar5;
  undefined4 *puVar6;
  undefined4 *puVar7;
  long lVar8;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar9 [16];
  undefined4 *in_stack_00000008;
  undefined4 uStack0000000000000014;
  
  while( true ) {
    if (unaff_x19[0x10] == 0) {
      puVar7 = &uStack0000000000000014;
      uVar3 = func_0x007321b4();
      if (uVar3 != 0) {
        uVar2 = 0;
        if (uVar3 != 0x51) {
          uVar2 = uVar3;
        }
        uVar5 = (ulong)uVar2;
        goto LAB_0076e550;
      }
      if ((long)in_stack_00000008 < 1) {
        ___error();
        func_0x0073c9e4();
        uVar5 = 0x38;
        puVar7 = in_stack_00000008;
        goto LAB_0076e550;
      }
      puVar7 = in_stack_00000008;
      uVar5 = func_0x0074075c();
      if ((int)uVar5 != 0) goto LAB_0076e550;
      *(int *)(unaff_x21 + 0x118) = *(int *)(unaff_x21 + 0x118) + (int)in_stack_00000008;
      *unaff_x19 = *unaff_x19 + (long)in_stack_00000008;
    }
    while( true ) {
      puVar6 = (undefined4 *)func_0x00740a58();
      puVar7 = (undefined4 *)func_0x00156654();
      lVar8 = _memchr(puVar6,10);
      if (lVar8 == 0) break;
      uVar1 = (lVar8 - (long)puVar6) + 1;
      func_0x0073c8fc();
      puVar7 = puVar6;
      uVar5 = func_0x007738a0();
      if ((int)uVar5 != 0) goto LAB_0076e550;
      iVar4 = (*(code *)unaff_x19[0x13])();
      if (iVar4 != 0) {
        unaff_x19[0x11] = uVar1;
        uVar5 = func_0x00156654();
        if (uVar1 < uVar5) {
          lVar8 = func_0x00156654();
          lVar8 = lVar8 - uVar1;
        }
        else {
          lVar8 = 0;
        }
        unaff_x19[0x10] = lVar8;
        *unaff_x20 = *unaff_x19;
        *unaff_x19 = 0;
        puVar7 = puVar6;
        goto code_r0x0076e548;
      }
      uVar5 = func_0x00156654();
      if (uVar1 < uVar5) {
        func_0x00156654();
        func_0x007406c8();
      }
      else {
        func_0x007406b0();
      }
    }
    unaff_x19[0x10] = 0;
    if (in_stack_00000008 != &section_00000338.reserved3) break;
    in_stack_00000008 = (undefined4 *)0x0;
    if (unaff_x19[0x11] != 0) {
      func_0x00156654();
      func_0x007406c8();
      unaff_x19[0x11] = 0;
    }
  }
code_r0x0076e548:
  uVar5 = 0;
  *(undefined1 *)(unaff_x19 + 1) = 0;
LAB_0076e550:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar5;
  }
  auVar9 = ___stack_chk_fail(uVar5);
  *puVar7 = *(undefined4 *)(*(long *)(auVar9._0_8_ + 0x18) + 0x238);
  uVar3 = 0x10000;
  if (*(long *)(auVar9._8_8_ + 0x18) == 0) {
    uVar3 = 1;
  }
  return (ulong)uVar3;
}


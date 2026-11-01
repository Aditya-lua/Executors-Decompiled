
/* WARNING: Removing unreachable block (ram,0x00750fb0) */

ulong FUN_00750f0c(void)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  uint uVar6;
  long unaff_x19;
  long unaff_x23;
  undefined8 unaff_x26;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined4 uStack0000000000000060;
  undefined4 in_stack_00000068;
  undefined4 in_stack_00000070;
  
  while (func_0x0076482c(unaff_x26,"%s%s \"%s\"\n"), unaff_x23 != 0) {
    while( true ) {
      lVar2 = func_0x00156654(unaff_x23);
      unaff_x23 = func_0x006f4058(unaff_x23);
      unaff_x26 = in_stack_00000058;
      if (*(long *)(lVar2 + 0x30) == unaff_x28) break;
      uVar3 = func_0x0076defc(*(long *)(lVar2 + 0x30),&uStack0000000000000060);
      if ((int)uVar3 != 0) {
        _fclose(in_stack_00000058);
        if ((int)uVar3 != 0) goto LAB_00750ff4;
        goto LAB_00750fd8;
      }
      func_0x0076482c(in_stack_00000058,"%s%s \"%d%02d%02d %02d:%02d:%02d\"\n");
      if (unaff_x23 == 0) goto LAB_00750f9c;
    }
  }
LAB_00750f9c:
  uVar3 = 0;
  _fclose(in_stack_00000058);
LAB_00750fd8:
  if (in_stack_00000050 != 0) {
    iVar1 = func_0x00771078();
    uVar6 = 0;
    if (iVar1 != 0) {
      uVar6 = 0x17;
    }
    uVar3 = (ulong)uVar6;
  }
LAB_00750ff4:
  if (((int)uVar3 != 0) && (in_stack_00000050 != 0)) {
    _unlink();
  }
  (*pcRam0000000000a2b5f0)(in_stack_00000050);
  if (*(long *)(unaff_x19 + 0x2c0) == 0) goto LAB_00751138;
  func_0x006f4058();
  lVar2 = func_0x00740a58();
  if (lVar2 == 0) goto LAB_00751138;
  do {
    lVar4 = func_0x00156654(lVar2);
    lVar2 = func_0x006f4058(lVar2);
    *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(lVar4 + 0x20);
    uVar5 = _strlen();
    *(undefined8 *)(unaff_x29 + -0x80) = uVar5;
    *(undefined1 *)(unaff_x29 + -0x78) = *(undefined1 *)(lVar4 + 0x28);
    if (*(long *)(lVar4 + 0x30) == 0x7fffffffffffffff) {
      *(undefined2 *)(unaff_x29 + -0x6f) = 100;
      *(undefined8 *)(unaff_x29 + -0x77) = s_unlimited_008f04d2._0_8_;
    }
    else {
      uVar3 = func_0x0076defc(*(long *)(lVar4 + 0x30),&uStack0000000000000060);
      if ((int)uVar3 != 0) {
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return uVar3;
        }
        goto LAB_00751128;
      }
      func_0x00764560((char *)(unaff_x29 + -0x77),0x12,"%d%02d%02d %02d:%02d:%02d");
    }
    iVar1 = (**(code **)(unaff_x19 + 0x2c0))();
    if (iVar1 != 0) goto LAB_0075112c;
  } while (lVar2 != 0);
  uVar3 = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60)) {
LAB_00751128:
    do {
      iVar1 = ___stack_chk_fail();
LAB_0075112c:
      uVar6 = 0x2b;
      if (iVar1 != 2) {
        uVar6 = 0;
      }
      uVar3 = (ulong)uVar6;
LAB_00751138:
    } while (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x60));
  }
  return uVar3;
}


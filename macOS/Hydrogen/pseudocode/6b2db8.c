
void FUN_006b2db8(long param_1)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong in_x9;
  long *unaff_x19;
  ulong unaff_x20;
  undefined1 auVar4 [12];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  
  if ((in_x9 & 1) == 0 && param_1 == 0) {
    return;
  }
  if (0x7ffffffffffffff7 < unaff_x20) {
    auVar4 = func_0x0001748c(&uStack0000000000000008);
    *(int *)(*auVar4._0_8_ + (ulong)*(uint *)(auVar4._0_8_ + 3) * 0x88 + 0x20) = auVar4._8_4_;
    return;
  }
  if (unaff_x20 < 0x17) {
    _uStack0000000000000018 = CONCAT17((char)unaff_x20,uStack0000000000000018);
    puVar2 = &uStack0000000000000008;
    if (unaff_x20 == 0) goto LAB_006b2e28;
  }
  else {
    uVar1 = (unaff_x20 & 0xfffffffffffffff8) + 8;
    if ((unaff_x20 | 7) != 0x17) {
      uVar1 = unaff_x20 | 7;
    }
    puVar2 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000018 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000008 = puVar2;
    in_stack_00000010 = unaff_x20;
  }
  _memmove(puVar2);
LAB_006b2e28:
  *(undefined1 *)((long)puVar2 + unaff_x20) = 0;
  lVar3 = *unaff_x19 + (ulong)*(uint *)(unaff_x19 + 3) * 0x88;
  if (*(char *)(lVar3 + 0x57) < '\0') {
    __ZdlPv(*(long *)(lVar3 + 0x40));
  }
  *(ulong *)(lVar3 + 0x50) = _uStack0000000000000018;
  *(ulong *)(lVar3 + 0x48) = in_stack_00000010;
  *(long *)(lVar3 + 0x40) = (long)uStack0000000000000008;
  return;
}


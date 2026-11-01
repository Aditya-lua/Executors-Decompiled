
undefined8 FUN_000506d4(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  ulong uVar4;
  int *piVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  
  uVar4 = _strlen();
  if (0x7ffffffffffffff7 < uVar4) {
    func_0x0001748c(&uStack0000000000000008);
    goto LAB_0005081c;
  }
  if (uVar4 < 0x17) {
    _uStack0000000000000018 = CONCAT17((char)uVar4,uStack0000000000000018);
    piVar5 = (int *)&uStack0000000000000008;
    if (uVar4 != 0) goto LAB_00050734;
  }
  else {
    uVar1 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar1 = uVar4 | 7;
    }
    piVar5 = (int *)__Znwm(uVar1 + 1);
    _uStack0000000000000018 = uVar1 + 1 | 0x8000000000000000;
    uStack0000000000000008 = piVar5;
    in_stack_00000010 = uVar4;
LAB_00050734:
    _memmove(piVar5);
  }
  *(undefined1 *)((long)piVar5 + uVar4) = 0;
  uVar4 = in_stack_00000010;
  if (-1 < (long)_uStack0000000000000018) {
    uVar4 = _uStack0000000000000018 >> 0x38;
  }
  if (uVar4 == 4) {
    piVar5 = uStack0000000000000008;
    if (-1 < (long)_uStack0000000000000018) {
      piVar5 = (int *)&uStack0000000000000008;
    }
    iVar3 = _memcmp(piVar5,"Send");
    if (iVar3 == 0) {
      uVar6 = func_0x00051028();
LAB_000507d4:
      if ((long)_uStack0000000000000018 < 0) {
        __ZdlPv(uStack0000000000000008);
      }
      return uVar6;
    }
  }
  else if (uVar4 == 5) {
    piVar5 = uStack0000000000000008;
    if (-1 < (long)_uStack0000000000000018) {
      piVar5 = (int *)&uStack0000000000000008;
    }
    if (*piVar5 == 0x736f6c43 && (char)piVar5[1] == 'e') {
      uVar6 = func_0x00050f00();
      goto LAB_000507d4;
    }
  }
LAB_0005081c:
  func_0x006e644c();
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x50834);
  (*pcVar2)();
}


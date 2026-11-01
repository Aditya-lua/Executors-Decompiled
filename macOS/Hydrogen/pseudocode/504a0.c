
undefined8 FUN_000504a0(long param_1)

{
  bool in_ZR;
  int iVar1;
  long *plVar2;
  ulong uVar3;
  long in_x9;
  undefined8 uVar4;
  ulong unaff_x22;
  long lStack0000000000000008;
  
  if (!in_ZR) {
    param_1 = in_x9;
  }
  plVar2 = (long *)__Znwm(param_1 + 1U);
  uVar3 = param_1 + 1U | 0x8000000000000000;
  lStack0000000000000008 = (long)plVar2;
  _memmove(plVar2);
  *(undefined1 *)((long)plVar2 + unaff_x22) = 0;
  if (-1 < (long)uVar3) {
    unaff_x22 = uVar3 >> 0x38;
  }
  switch(unaff_x22) {
  case 4:
    plVar2 = (long *)lStack0000000000000008;
    if (-1 < (long)uVar3) {
      plVar2 = &lStack0000000000000008;
    }
    iVar1 = _memcmp(plVar2,"Send");
    if (iVar1 != 0) break;
    func_0x006e3af8();
code_r0x00050668:
    uVar4 = 1;
    if (-1 < (long)uVar3) {
      return 1;
    }
    goto code_r0x0005061c;
  case 5:
    plVar2 = (long *)lStack0000000000000008;
    if (-1 < (long)uVar3) {
      plVar2 = &lStack0000000000000008;
    }
    iVar1 = _memcmp(plVar2,"Close");
    if (iVar1 == 0) {
      func_0x006e3af8();
      goto code_r0x00050668;
    }
    break;
  case 7:
    plVar2 = (long *)lStack0000000000000008;
    if (-1 < (long)uVar3) {
      plVar2 = &lStack0000000000000008;
    }
    iVar1 = _memcmp(plVar2,"OnClose");
    if (iVar1 == 0) {
      (*pcRam0000000000a27968)();
      func_0x006e3d18();
      goto code_r0x00050668;
    }
    break;
  case 9:
    plVar2 = (long *)lStack0000000000000008;
    if (-1 < (long)uVar3) {
      plVar2 = &lStack0000000000000008;
    }
    if (*plVar2 == 0x67617373654d6e4f && (char)plVar2[1] == 'e') {
      (*pcRam0000000000a27968)();
      func_0x006e3d18();
      goto code_r0x00050668;
    }
  }
  uVar4 = 0;
  if ((long)uVar3 < 0) {
code_r0x0005061c:
    __ZdlPv(lStack0000000000000008);
  }
  return uVar4;
}


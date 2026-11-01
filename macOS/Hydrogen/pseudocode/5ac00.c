
ulong FUN_0005ac00(void)

{
  undefined4 uVar1;
  ulong uVar2;
  long lVar3;
  uint *puVar4;
  uint *unaff_x20;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000010;
  uint uStack0000000000000097;
  undefined4 uStack_4c4;
  undefined1 uStack_4c0;
  char cStack_4bf;
  ushort uStack_4be;
  undefined1 auStack_439 [1025];
  long lStack_38;
  
  *unaff_x20 = (uint)(uStack0000000000000010._2_2_ >> 8) |
               (uStack0000000000000010._2_2_ & 0xff00ff) << 8;
  _bzero(&uStack0000000000000097,0x401);
  puVar4 = &uStack0000000000000097;
  uVar2 = _getnameinfo(&uStack0000000000000010);
  if ((int)uVar2 == 0) {
    uVar2 = func_0x0002a730();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar2;
  }
  ___stack_chk_fail();
  auVar5 = __Unwind_Resume();
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_4c4 = 0x80;
  uVar2 = _getsockname(*(undefined4 *)(auVar5._0_8_ + 8),&uStack_4c0,&uStack_4c4);
  uVar1 = uStack_4c4;
  if ((int)uVar2 == 0) {
    if ((cStack_4bf == '\x1e') || (cStack_4bf == '\x02')) {
      *puVar4 = (uint)(uStack_4be >> 8) | (uStack_4be & 0xff00ff) << 8;
      _bzero(auStack_439,0x401);
      uVar2 = _getnameinfo(&uStack_4c0,uVar1,auStack_439,0x401,0,0,2);
      if ((int)uVar2 == 0) {
        uVar2 = func_0x0002a730(auVar5._8_8_,auStack_439);
      }
    }
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return uVar2;
  }
  ___stack_chk_fail();
  lVar3 = __Unwind_Resume();
  return (ulong)*(uint *)(lVar3 + 8);
}


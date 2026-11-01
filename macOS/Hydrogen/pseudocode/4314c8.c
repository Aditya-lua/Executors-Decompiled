
void FUN_004314c8(long param_1)

{
  code *pcVar1;
  long lVar2;
  uint uVar3;
  undefined8 uVar4;
  undefined8 *unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined8 in_stack_00000020;
  
  lVar2 = *unaff_x21;
  *unaff_x21 = lVar2 + param_1;
  if (lVar2 < 0) {
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4315c4);
    (*pcVar1)();
  }
  uStack0000000000000008 = unaff_x21;
  _bzero(&uStack0000000000000010,0x418);
  *(undefined8 *)(unaff_x29 + -0x38) = 0;
  uVar3 = _readdir_r(unaff_x21[5],&uStack0000000000000010,unaff_x29 + -0x38);
  while (uVar3 == 0) {
    uVar4 = 0;
    if (*(long *)(unaff_x29 + -0x38) == 0) goto code_r0x0043151c;
    if (in_stack_00000020._2_2_ == 1) {
      if (in_stack_00000020._5_1_ != '.') goto code_r0x00431590;
    }
    else if (in_stack_00000020._2_2_ != 2 || in_stack_00000020._5_2_ != 0x2e2e) {
code_r0x00431590:
      _memcpy(unaff_x19 + 1,&uStack0000000000000008,0x420);
      *unaff_x19 = 1;
      return;
    }
    uVar3 = _readdir_r(unaff_x21[5],&uStack0000000000000010,unaff_x29 + -0x38);
  }
  if (*(long *)(unaff_x29 + -0x38) == 0) {
    *(undefined1 *)(unaff_x20 + 8) = 1;
  }
  unaff_x19[1] = 0;
  unaff_x19[2] = (ulong)uVar3 << 0x20 | 2;
  uVar4 = 1;
code_r0x0043151c:
  *unaff_x19 = uVar4;
  lVar2 = *uStack0000000000000008;
  *uStack0000000000000008 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x004037b4(&uStack0000000000000008);
  }
  return;
}


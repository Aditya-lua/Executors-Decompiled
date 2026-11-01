
undefined1  [16] FUN_00194cd4(long param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  undefined1 auVar4 [16];
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  
  if ((**(long **)(param_1 + 0x358) == 0) || (lVar2 = _CFRetain(), lVar2 == 0)) {
LAB_00194df8:
    func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c14c8);
code_r0x00194e44:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x194e48);
    (*pcVar1)();
  }
  in_stack_00000018 = 0;
  uStack0000000000000010 = lVar2;
  _SecTransformSetAttribute();
  lVar2 = in_stack_00000018;
  if (in_stack_00000018 == 0) {
    func_0x0019fb28(&uStack0000000000000010);
    if ((*(long *)PTR__kSecTransformInputAttributeName_009b0420 == 0) ||
       (lVar2 = _CFRetain(), lVar2 == 0)) goto LAB_00194df8;
    in_stack_00000018 = 0;
    uStack0000000000000008 = lVar2;
    _SecTransformSetAttribute();
    if (in_stack_00000018 == 0) {
      in_stack_00000018 = 0;
      lVar2 = _SecTransformExecute();
      if (lVar2 != 0) {
        uStack0000000000000010 = lVar2;
        lVar2 = _CFRetain();
        if (lVar2 == 0) {
          func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c1518);
          goto code_r0x00194e44;
        }
        func_0x0019e6a4(&uStack0000000000000010);
        func_0x0019fb28(&uStack0000000000000008);
        uVar3 = 0;
        goto code_r0x00194d74;
      }
      if (in_stack_00000018 == 0) {
        func_0x007a11c0(&UNK_0081b7f0,0x22,&UNK_009c15f0);
        goto code_r0x00194e44;
      }
    }
    lVar2 = in_stack_00000018;
    func_0x0019fb28(&uStack0000000000000008);
  }
  else {
    func_0x0019fb28(&uStack0000000000000010);
  }
  uVar3 = 1;
code_r0x00194d74:
  _CFRelease();
  auVar4._8_8_ = lVar2;
  auVar4._0_8_ = uVar3;
  return auVar4;
}



undefined1  [16] FUN_0049d498(void)

{
  code *pcVar1;
  long lVar2;
  undefined2 *puVar3;
  undefined1 *puVar4;
  long unaff_x20;
  long unaff_x22;
  undefined8 uVar5;
  undefined1 unaff_w26;
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000018;
  undefined2 *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  
  puVar3 = (undefined2 *)func_0x00187bd0(3,1);
  if (puVar3 == (undefined2 *)0x0) {
    uVar5 = func_0x007a1f00(1,3,&UNK_009e2c18);
    if (unaff_x22 != 0) {
      func_0x00187bd4();
    }
    auVar6 = __Unwind_Resume(uVar5);
    return auVar6;
  }
  *(undefined1 *)(puVar3 + 1) = 0x2e;
  *puVar3 = 0x2e2e;
  uStack0000000000000018 = 3;
  in_stack_00000028 = 3;
  in_stack_00000020 = puVar3;
  if (unaff_x20 < 0) {
    uVar5 = 0;
code_r0x0049d4d4:
    func_0x007a1f00(uVar5);
  }
  else {
    if (unaff_x20 == 0) {
      lVar2 = 1;
    }
    else {
      uVar5 = 1;
      lVar2 = func_0x00187bd0();
      if (lVar2 == 0) goto code_r0x0049d4d4;
    }
    _memcpy(lVar2);
    uStack0000000000000030 = unaff_x20;
    puVar4 = (undefined1 *)func_0x00187bd0(1,1);
    if (puVar4 != (undefined1 *)0x0) {
      *puVar4 = unaff_w26;
      func_0x0049aabc(&uStack0000000000000018,&uStack0000000000000030,puVar4,&UNK_009e44b8);
      uVar5 = func_0x0049af4c();
      auVar6._8_8_ = uVar5;
      auVar6._0_8_ = 1;
      return auVar6;
    }
    func_0x007a1f18(1,1);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x49d5a0);
  (*pcVar1)();
}


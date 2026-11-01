
long FUN_0019c45c(void)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  undefined8 *puVar6;
  long unaff_x23;
  undefined8 *unaff_x24;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  long in_stack_00000018;
  undefined8 *in_stack_00000020;
  long in_stack_00000030;
  undefined1 uStack0000000000000038;
  
  puVar2 = in_stack_00000020;
  lVar4 = _CFDictionaryCreateMutable(*unaff_x24);
  if (lVar4 == 0) {
    func_0x007a11c0(&UNK_0081a021,0x22,&UNK_009c07c0);
  }
  else {
    if (unaff_x23 != 0) {
      puVar6 = puVar2;
      do {
        puVar1 = puVar6 + 2;
        _CFDictionaryAddValue(lVar4,*puVar6,puVar6[1]);
        puVar6 = puVar1;
      } while (puVar1 != puVar2 + unaff_x23 * 2);
    }
    lVar5 = _CFRetain(lVar4);
    if (lVar5 != 0) {
      if (in_stack_00000030 != 0) {
        func_0x0019fb28(&uStack0000000000000038);
      }
      if (in_stack_00000018 != 0) {
        func_0x00187bd4(in_stack_00000020,in_stack_00000018 << 4,8);
      }
      func_0x0019fb28(&uStack0000000000000010);
      func_0x0019fb28(&uStack0000000000000008);
      _CFRelease();
      _CFRelease();
      func_0x0019fb28();
      _CFRelease(lVar4);
      return lVar5;
    }
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x19c62c);
  (*pcVar3)();
}


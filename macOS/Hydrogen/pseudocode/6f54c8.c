
undefined8 FUN_006f54c8(void)

{
  long lVar1;
  undefined8 uVar2;
  char cVar3;
  char *pcVar4;
  char *pcVar5;
  char unaff_w23;
  ulong *unaff_x24;
  char *unaff_x25;
  long unaff_x29;
  double dVar6;
  double dVar7;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000118;
  
  do {
    lVar1 = _memchr();
    if (lVar1 == 0) {
      func_0x006e63b0();
code_r0x006f56e4:
      uVar2 = ___stack_chk_fail();
      dVar6 = (double)func_0x006e6a4c(uVar2,1);
      dVar7 = (double)func_0x006e6a94(0,uVar2,2);
      _difftime((long)dVar6,(long)dVar7);
      func_0x006e3850(uVar2);
      return 1;
    }
    uStack0000000000000008._6_1_ = unaff_w23;
    uVar2 = _strftime(&uStack0000000000000050,200,(long)&uStack0000000000000008 + 5);
    func_0x006e7378(&uStack0000000000000118,&uStack0000000000000050,uVar2);
    pcVar5 = unaff_x25 + 1;
    cVar3 = *pcVar5;
    if (cVar3 != '%') goto code_r0x006f54ac;
    while( true ) {
      unaff_x25 = pcVar5 + 1;
      unaff_w23 = *unaff_x25;
      if (unaff_w23 != '\0') break;
      while( true ) {
        pcVar4 = (char *)*unaff_x24;
        if ((char *)unaff_x24[1] <= pcVar4) {
          func_0x006e7288(&uStack0000000000000118,1);
          cVar3 = *pcVar5;
          pcVar4 = (char *)*unaff_x24;
        }
        *unaff_x24 = (ulong)(pcVar4 + 1);
        *pcVar4 = cVar3;
        pcVar5 = pcVar5 + 1;
        cVar3 = *pcVar5;
        if (cVar3 == '%') break;
code_r0x006f54ac:
        if (cVar3 == '\0') {
          func_0x006e79b0(&uStack0000000000000118);
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
            return 1;
          }
          goto code_r0x006f56e4;
        }
      }
    }
  } while( true );
}


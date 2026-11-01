
undefined8 FUN_006f5508(void)

{
  char cVar1;
  long lVar2;
  undefined8 uVar3;
  char cVar4;
  char *pcVar5;
  char *unaff_x21;
  ulong *unaff_x24;
  long unaff_x29;
  double dVar6;
  double dVar7;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000118;
  
  do {
    cVar4 = *unaff_x21;
    if (cVar4 != '%') goto LAB_006f54ac;
    while (cVar1 = unaff_x21[1], cVar1 == '\0') {
      while( true ) {
        pcVar5 = (char *)*unaff_x24;
        if ((char *)unaff_x24[1] <= pcVar5) {
          func_0x006e7288(&uStack0000000000000118,1);
          cVar4 = *unaff_x21;
          pcVar5 = (char *)*unaff_x24;
        }
        *unaff_x24 = (ulong)(pcVar5 + 1);
        *pcVar5 = cVar4;
        unaff_x21 = unaff_x21 + 1;
        cVar4 = *unaff_x21;
        if (cVar4 == '%') break;
LAB_006f54ac:
        if (cVar4 == '\0') {
          func_0x006e79b0(&uStack0000000000000118);
          if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
            return 1;
          }
          goto code_r0x006f56e4;
        }
      }
    }
    lVar2 = _memchr();
    if (lVar2 == 0) {
      func_0x006e63b0();
code_r0x006f56e4:
      uVar3 = ___stack_chk_fail();
      dVar6 = (double)func_0x006e6a4c(uVar3,1);
      dVar7 = (double)func_0x006e6a94(0,uVar3,2);
      _difftime((long)dVar6,(long)dVar7);
      func_0x006e3850(uVar3);
      return 1;
    }
    uStack0000000000000008._6_1_ = cVar1;
    uVar3 = _strftime(&uStack0000000000000050,200,(long)&uStack0000000000000008 + 5);
    func_0x006e7378(&uStack0000000000000118,&uStack0000000000000050,uVar3);
    unaff_x21 = unaff_x21 + 2;
  } while( true );
}


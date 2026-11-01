
undefined8 FUN_006f54d8(void)

{
  char cVar1;
  long lVar2;
  undefined8 uVar3;
  char cVar4;
  char in_w8;
  char *pcVar5;
  char *pcVar6;
  ulong *unaff_x24;
  char *unaff_x25;
  long unaff_x29;
  double dVar7;
  double dVar8;
  undefined1 uStack000000000000000d;
  char cStack000000000000000e;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000118;
  
  cStack000000000000000e = in_w8;
  do {
    uVar3 = _strftime(&uStack0000000000000050,200,&uStack000000000000000d);
    func_0x006e7378(&uStack0000000000000118,&uStack0000000000000050,uVar3);
    pcVar6 = unaff_x25 + 1;
    cVar4 = *pcVar6;
    if (cVar4 != '%') goto code_r0x006f54ac;
    while( true ) {
      unaff_x25 = pcVar6 + 1;
      cVar1 = *unaff_x25;
      if (cVar1 != '\0') break;
      while( true ) {
        pcVar5 = (char *)*unaff_x24;
        if ((char *)unaff_x24[1] <= pcVar5) {
          func_0x006e7288(&uStack0000000000000118,1);
          cVar4 = *pcVar6;
          pcVar5 = (char *)*unaff_x24;
        }
        *unaff_x24 = (ulong)(pcVar5 + 1);
        *pcVar5 = cVar4;
        pcVar6 = pcVar6 + 1;
        cVar4 = *pcVar6;
        if (cVar4 == '%') break;
code_r0x006f54ac:
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
      dVar7 = (double)func_0x006e6a4c(uVar3,1);
      dVar8 = (double)func_0x006e6a94(0,uVar3,2);
      _difftime((long)dVar7,(long)dVar8);
      func_0x006e3850(uVar3);
      return 1;
    }
    cStack000000000000000e = cVar1;
  } while( true );
}



undefined8 FUN_006f5404(undefined8 param_1)

{
  char *pcVar1;
  char cVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  char cVar7;
  long unaff_x21;
  char *pcVar8;
  long unaff_x29;
  double dVar9;
  double dVar10;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000050;
  undefined8 uStack0000000000000118;
  char *in_stack_00000120;
  
  lVar4 = _gmtime_r(param_1,&uStack0000000000000010);
  pcVar8 = (char *)(unaff_x21 + 1);
  if (lVar4 == 0) {
    func_0x006e383c();
  }
  else {
    iVar3 = _strcmp(pcVar8,"*t");
    if (iVar3 != 0) {
      uStack0000000000000008._5_1_ = 0x25;
      uStack0000000000000008._7_1_ = 0;
      func_0x006e7258();
      cVar7 = *pcVar8;
      while( true ) {
        if (cVar7 != '%') goto code_r0x006f54ac;
        while( true ) {
          cVar2 = pcVar8[1];
          if (cVar2 != '\0') break;
          while( true ) {
            if (in_stack_00000120 <= uStack0000000000000118) {
              func_0x006e7288(&uStack0000000000000118,1);
              cVar7 = *pcVar8;
            }
            pcVar1 = uStack0000000000000118 + 1;
            *uStack0000000000000118 = cVar7;
            pcVar8 = pcVar8 + 1;
            cVar7 = *pcVar8;
            uStack0000000000000118 = pcVar1;
            if (cVar7 == '%') break;
code_r0x006f54ac:
            if (cVar7 == '\0') {
              func_0x006e79b0(&uStack0000000000000118);
              goto code_r0x006f5698;
            }
          }
        }
        lVar5 = _memchr("aAbBcdHIjmMpSUwWxXyYzZ%",(long)cVar2,0x18);
        if (lVar5 == 0) break;
        uStack0000000000000008._6_1_ = cVar2;
        uVar6 = _strftime(&uStack0000000000000050,200,(long)&uStack0000000000000008 + 5,lVar4);
        func_0x006e7378(&uStack0000000000000118,&uStack0000000000000050,uVar6);
        pcVar8 = pcVar8 + 2;
        cVar7 = *pcVar8;
      }
      func_0x006e63b0();
      goto code_r0x006f56e4;
    }
    func_0x006e4118();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    func_0x006e3870();
    func_0x006e45a4();
    if (-1 < *(int *)(lVar4 + 0x20)) {
      func_0x006e3c24();
      func_0x006e45a4();
    }
  }
code_r0x006f5698:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return 1;
  }
code_r0x006f56e4:
  uVar6 = ___stack_chk_fail();
  dVar9 = (double)func_0x006e6a4c(uVar6,1);
  dVar10 = (double)func_0x006e6a94(0,uVar6,2);
  _difftime((long)dVar9,(long)dVar10);
  func_0x006e3850(uVar6);
  return 1;
}


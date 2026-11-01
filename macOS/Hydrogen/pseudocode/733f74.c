
void FUN_00733f74(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined1 auVar4 [16];
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  
  do {
    func_0x0073391c();
    lVar3 = unaff_x21;
    lVar1 = unaff_x23;
    while( true ) {
      unaff_x21 = lVar3;
      if (lVar1 == 0) {
        if (unaff_x21 != 0) {
          func_0x00768170();
        }
        return;
      }
      unaff_x23 = func_0x006f4058(lVar1);
      uVar2 = func_0x00156654(lVar1);
      func_0x00768a04();
      func_0x007341b8();
      func_0x0076891c();
      if (in_stack_00000008._7_1_ != '\0') break;
      auVar4 = _uStack0000000000000010;
      if (unaff_x22 == (undefined8 *)0x0) {
        auVar4 = func_0x00782d28();
        unaff_x22 = &uStack0000000000000010;
      }
      _uStack0000000000000010 = auVar4;
      lVar3 = func_0x00734ca8(uVar2,unaff_x22);
      lVar1 = unaff_x23;
      if (unaff_x21 <= lVar3 || lVar3 == 0) {
        lVar3 = unaff_x21;
      }
    }
    func_0x0075e5fc(lVar1);
  } while( true );
}


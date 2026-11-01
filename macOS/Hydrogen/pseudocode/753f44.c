
undefined8 FUN_00753f44(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  long in_x9;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000078;
  
  do {
    if (in_x9 == param_1) {
      return unaff_x20;
    }
    while (___stack_chk_fail(), *(byte *)(unaff_x21 + 0xa16) - 1 < 3) {
      lVar1 = func_0x00782efc();
      if (lVar1 == 0) {
        func_0x00764560(&uStack0000000000000078,0x50,"%s: %s, %02d %s %4d %02d:%02d:%02d GMT\r\n");
        uVar2 = func_0x007408a0();
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
          return uVar2;
        }
      }
      else if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
        return 0;
      }
    }
    unaff_x20 = 0x2b;
    param_1 = *(long *)(unaff_x29 + -0x28);
    in_x9 = *(long *)PTR____stack_chk_guard_009b01e8;
  } while( true );
}


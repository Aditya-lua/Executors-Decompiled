
undefined8 FUN_006fcf9c(void)

{
  int iVar1;
  undefined8 uVar2;
  int unaff_w21;
  int unaff_w22;
  long unaff_x29;
  long in_stack_00000000;
  undefined1 uStack0000000000000008;
  
  do {
    func_0x006e7378(&uStack0000000000000008);
    do {
      unaff_w21 = unaff_w21 + 1;
      if (unaff_w22 == unaff_w21) {
        func_0x006fd9f4();
        func_0x006e79b0(&uStack0000000000000008);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
          return 1;
        }
        uVar2 = ___stack_chk_fail();
        func_0x006e69bc(uVar2,1,6);
        func_0x006e69bc(uVar2,2,7);
        func_0x006e383c(uVar2);
        iVar1 = func_0x006e52e0(uVar2,1);
        while( true ) {
          if (iVar1 == 0) {
            return 0;
          }
          func_0x006e2154(uVar2,2);
          func_0x006e2154(uVar2,0xfffffffd);
          func_0x006e2154(uVar2,0xfffffffd);
          func_0x006e4c80(uVar2,2,1);
          iVar1 = func_0x006e21f8(uVar2,0xffffffff);
          if (iVar1 != 0) break;
          func_0x006e1d54(uVar2,0xfffffffd);
          iVar1 = func_0x006e52e0(uVar2,1);
        }
        return 1;
      }
      func_0x006fd9f4();
    } while (in_stack_00000000 == 0);
  } while( true );
}


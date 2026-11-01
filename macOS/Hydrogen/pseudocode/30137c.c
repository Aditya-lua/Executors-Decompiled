
undefined8 thunk_FUN_00301384(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x25;
  long unaff_x26;
  long unaff_x27;
  undefined1 uStack0000000000000018;
  long in_stack_00000058;
  
  func_0x0036e3d8(unaff_x19[1]);
  puVar2 = (undefined8 *)unaff_x19[4];
  if (unaff_x19[3] == 0) goto LAB_003013b0;
  do {
    if (puVar2 != (undefined8 *)0x0) goto LAB_003013b4;
    func_0x0079e5f4();
    while( true ) {
      unaff_x25 = 1;
      func_0x0036e3d8(unaff_x19[1]);
      puVar2 = (undefined8 *)unaff_x19[4];
      if (unaff_x19[3] != 0) break;
LAB_003013b0:
      if (puVar2 != (undefined8 *)0x0) {
LAB_003013b4:
        if ((*(byte *)((long)unaff_x19 + 0x29) >> 2 & 1) == 0) {
          (*(code *)*puVar2)();
        }
      }
      unaff_x19[3] = 0;
      unaff_x19[2] = 0;
      unaff_x19[5] = 0;
      unaff_x19[4] = 0;
      unaff_x19[1] = 0;
      *unaff_x19 = 0;
      func_0x0036e3d8();
      func_0x0036e464(&uStack0000000000000018,0x40);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000058) {
        return unaff_x25;
      }
      uVar1 = ___stack_chk_fail();
      _memcpy(uVar1,&uStack0000000000000018,unaff_x27 - unaff_x26);
    }
  } while( true );
}


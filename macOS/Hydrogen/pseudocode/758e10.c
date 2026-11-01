
undefined8 FUN_00758e10(void)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 uVar4;
  long unaff_x25;
  long unaff_x26;
  undefined8 *puVar5;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000058;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000b0;
  undefined1 uStack00000000000000d0;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined1 uStack0000000000000170;
  undefined1 uStack0000000000000190;
  undefined1 auStack_7ffffffe [2147483646];
  
code_r0x00758e10:
  puVar5 = (undefined8 *)(unaff_x28 + 0x5f0);
  (*(code *)*puVar5)(*(undefined8 *)
                      ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
  uVar4 = 0;
  *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = unaff_x26;
  *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
  unaff_x19 = in_stack_00000058;
LAB_00758a9c:
  do {
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*(code *)*puVar5)(unaff_x22);
      (*(code *)*puVar5)(unaff_x21);
      (*(code *)*puVar5)(unaff_x25);
      (*(code *)*puVar5)(unaff_x23);
      (*(code *)*puVar5)(unaff_x19);
      (*(code *)*puVar5)();
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar4;
      }
      ___stack_chk_fail();
      func_0x00740a58(&uStack0000000000000070);
      lVar2 = func_0x00740a58(&uStack0000000000000090);
      if (lVar2 != 0) {
        func_0x00740a58(&uStack0000000000000090);
      }
      func_0x00740a58(&uStack00000000000000d0);
      func_0x00740a58(&uStack00000000000000b0);
      unaff_x22 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
      if (unaff_x22 != 0) break;
      unaff_x25 = 0;
      unaff_x21 = 0;
code_r0x00758a98:
      unaff_x23 = 0;
      unaff_x19 = 0;
      uVar4 = 0x1b;
    }
    unaff_x21 = func_0x00764704("%.*s4_request");
    if (unaff_x21 == 0) {
      unaff_x25 = 0;
      goto code_r0x00758a98;
    }
    func_0x0077e82c(unaff_x21,unaff_x21,in_stack_00000160);
    unaff_x25 = func_0x00764704("%s/%.*s/%.*s/%s");
    if (unaff_x25 == 0) goto code_r0x00758a98;
    uVar4 = _strlen(unaff_x22);
    iVar1 = func_0x00779834(auStack_7ffffffe + 0x8000028e,unaff_x22,uVar4);
    if (iVar1 != 0) {
      unaff_x23 = 0;
code_r0x00758c0c:
      uVar4 = 0x1b;
      puVar5 = (undefined8 *)0xa2b5f0;
      unaff_x19 = 0;
      goto LAB_00758a9c;
    }
    func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
    unaff_x23 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
    if (unaff_x23 == 0) goto code_r0x00758c0c;
    func_0x0077e7f8(unaff_x23,in_stack_00000158,in_stack_00000160);
    in_stack_00000058 = func_0x00764704("%.*s4%s");
    if (in_stack_00000058 == 0) goto code_r0x00758c0c;
    func_0x0077e7f8(in_stack_00000058,in_stack_00000158,in_stack_00000160);
    uVar4 = _strlen(in_stack_00000058);
    uVar3 = _strlen(auStack_7ffffffe + 0x800002c6);
    uVar4 = func_0x0074edd8(&UNK_00a1f5c0,in_stack_00000058,uVar4,auStack_7ffffffe + 0x800002c6,
                            uVar3,&uStack0000000000000190);
    if ((((int)uVar4 == 0) &&
        (uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                 in_stack_00000140,&uStack0000000000000170), (int)uVar4 == 0)) &&
       (uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128,
                                in_stack_00000130,&uStack0000000000000190), (int)uVar4 == 0)) {
      uVar4 = _strlen(unaff_x21);
      uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,unaff_x21,uVar4,
                              &uStack0000000000000170);
      if ((int)uVar4 == 0) {
        uVar4 = _strlen(unaff_x23);
        uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,unaff_x23,uVar4,
                                &uStack0000000000000190);
        if ((int)uVar4 == 0) {
          func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
          func_0x00740a58(&uStack00000000000000b0);
          unaff_x26 = func_0x00764704(
                                     "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                     );
          if (unaff_x26 != 0) break;
          uVar4 = 0;
        }
      }
    }
    puVar5 = (undefined8 *)0xa2b5f0;
    unaff_x19 = in_stack_00000058;
  } while( true );
  func_0x0077e7f8(unaff_x26 + 0xf,in_stack_00000158,in_stack_00000160);
  unaff_x28 = 0xa2b000;
  goto code_r0x00758e10;
}


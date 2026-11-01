
undefined8 FUN_00758ad8(code *param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  long unaff_x19;
  long lVar7;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 *unaff_x28;
  long unaff_x29;
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
  
  do {
    (*param_1)(unaff_x25);
    (*(code *)*unaff_x28)(unaff_x23);
    (*(code *)*unaff_x28)(unaff_x19);
    (*(code *)*unaff_x28)();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return unaff_x24;
    }
    ___stack_chk_fail();
    func_0x00740a58(&uStack0000000000000070);
    lVar2 = func_0x00740a58(&uStack0000000000000090);
    if (lVar2 != 0) {
      func_0x00740a58(&uStack0000000000000090);
    }
    func_0x00740a58(&uStack00000000000000d0);
    func_0x00740a58(&uStack00000000000000b0);
    lVar2 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
    if (lVar2 == 0) {
      unaff_x25 = 0;
      lVar3 = 0;
LAB_00758a98:
      unaff_x23 = 0;
      lVar7 = 0;
      unaff_x24 = 0x1b;
    }
    else {
      lVar3 = func_0x00764704("%.*s4_request");
      if (lVar3 == 0) {
        unaff_x25 = 0;
        goto LAB_00758a98;
      }
      func_0x0077e82c(lVar3,lVar3,in_stack_00000160);
      unaff_x25 = func_0x00764704("%s/%.*s/%.*s/%s");
      if (unaff_x25 == 0) goto LAB_00758a98;
      uVar4 = _strlen(lVar2);
      iVar1 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar2,uVar4);
      if (iVar1 == 0) {
        func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
        unaff_x23 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
        if (unaff_x23 == 0) goto LAB_00758c0c;
        func_0x0077e7f8(unaff_x23,in_stack_00000158,in_stack_00000160);
        lVar7 = func_0x00764704("%.*s4%s");
        if (lVar7 == 0) goto LAB_00758c0c;
        func_0x0077e7f8(lVar7,in_stack_00000158,in_stack_00000160);
        uVar4 = _strlen(lVar7);
        uVar5 = _strlen(auStack_7ffffffe + 0x800002c6);
        unaff_x24 = func_0x0074edd8(&UNK_00a1f5c0,lVar7,uVar4,auStack_7ffffffe + 0x800002c6,uVar5,
                                    &uStack0000000000000190);
        if ((((int)unaff_x24 == 0) &&
            (unaff_x24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,
                                         in_stack_00000138,in_stack_00000140,&uStack0000000000000170
                                        ), (int)unaff_x24 == 0)) &&
           (unaff_x24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128
                                        ,in_stack_00000130,&uStack0000000000000190),
           (int)unaff_x24 == 0)) {
          uVar4 = _strlen(lVar3);
          unaff_x24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar3,uVar4,
                                      &uStack0000000000000170);
          if ((int)unaff_x24 != 0) goto code_r0x00758d9c;
          uVar4 = _strlen(unaff_x23);
          unaff_x24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,unaff_x23,uVar4,
                                      &uStack0000000000000190);
          if ((int)unaff_x24 != 0) goto code_r0x00758d9c;
          func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
          func_0x00740a58(&uStack00000000000000b0);
          lVar6 = func_0x00764704(
                                 "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                 );
          if (lVar6 == 0) {
            unaff_x24 = 0;
            goto code_r0x00758d9c;
          }
          func_0x0077e7f8(lVar6 + 0xf,in_stack_00000158,in_stack_00000160);
          unaff_x28 = (undefined8 *)0xa2b5f0;
          (*pcRam0000000000a2b5f0)
                    (*(undefined8 *)
                      ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
          unaff_x24 = 0;
          *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar6;
          *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
        }
        else {
code_r0x00758d9c:
          unaff_x28 = (undefined8 *)0xa2b5f0;
        }
      }
      else {
        unaff_x23 = 0;
LAB_00758c0c:
        lVar7 = 0;
        unaff_x24 = 0x1b;
        unaff_x28 = (undefined8 *)0xa2b5f0;
      }
    }
    func_0x00740678(&uStack0000000000000090);
    func_0x00740678(&uStack0000000000000070);
    func_0x00740678(&uStack00000000000000d0);
    func_0x00740678(&uStack00000000000000b0);
    (*(code *)*unaff_x28)(lVar2);
    (*(code *)*unaff_x28)(lVar3);
    param_1 = (code *)*unaff_x28;
    unaff_x19 = lVar7;
  } while( true );
}


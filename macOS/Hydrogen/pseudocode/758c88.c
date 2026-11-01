
undefined8 FUN_00758c88(long param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x25;
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
  
code_r0x00758c88:
  func_0x0077e7f8(param_1,param_2,param_3);
  lVar3 = func_0x00764704("%.*s4%s");
  param_1 = unaff_x23;
  if (lVar3 == 0) goto LAB_00758c0c;
  func_0x0077e7f8(lVar3,in_stack_00000158,in_stack_00000160);
  uVar4 = _strlen(lVar3);
  uVar5 = _strlen(auStack_7ffffffe + 0x800002c6);
  uVar4 = func_0x0074edd8(&UNK_00a1f5c0,lVar3,uVar4,auStack_7ffffffe + 0x800002c6,uVar5,
                          &uStack0000000000000190);
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
        lVar2 = func_0x00764704(
                               "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                               );
        if (lVar2 != 0) {
          func_0x0077e7f8(lVar2 + 0xf,in_stack_00000158,in_stack_00000160);
          (*pcRam0000000000a2b5f0)
                    (*(undefined8 *)
                      ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
          uVar4 = 0;
          *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar2;
          *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
          goto code_r0x00758a9c;
        }
        uVar4 = 0;
      }
    }
  }
code_r0x00758a9c:
  do {
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*pcRam0000000000a2b5f0)(unaff_x22);
      (*pcRam0000000000a2b5f0)(unaff_x21);
      (*pcRam0000000000a2b5f0)(unaff_x25);
      (*pcRam0000000000a2b5f0)(unaff_x23);
      (*pcRam0000000000a2b5f0)(lVar3);
      (*pcRam0000000000a2b5f0)();
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
      lVar3 = 0;
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
    if (iVar1 == 0) {
      func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
      param_1 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
      if (param_1 != 0) break;
    }
    else {
      param_1 = 0;
    }
LAB_00758c0c:
    lVar3 = 0;
    uVar4 = 0x1b;
    unaff_x23 = param_1;
  } while( true );
  param_2 = in_stack_00000158;
  param_3 = in_stack_00000160;
  unaff_x19 = lVar3;
  unaff_x23 = param_1;
  goto code_r0x00758c88;
}


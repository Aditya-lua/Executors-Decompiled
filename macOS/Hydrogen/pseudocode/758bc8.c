
undefined8 FUN_00758bc8(undefined8 param_1)

{
  undefined1 *puVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  long in_x10;
  undefined1 *in_x11;
  long unaff_x19;
  long lVar7;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  long lVar8;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined1 *puStack0000000000000000;
  undefined8 uStack0000000000000008;
  long lStack0000000000000018;
  undefined1 *puStack0000000000000020;
  undefined1 *puStack0000000000000028;
  undefined1 *in_stack_00000060;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000b0;
  undefined1 uStack00000000000000d0;
  undefined1 *in_stack_00000128;
  long in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000158;
  undefined1 *in_stack_00000160;
  undefined1 uStack0000000000000170;
  undefined1 uStack0000000000000190;
  undefined1 auStack_7ffffffe [2147483646];
  
  uStack0000000000000008 = param_1;
  lStack0000000000000018 = in_x10;
  puStack0000000000000020 = in_x11;
code_r0x00758bc8:
  puStack0000000000000000 = auStack_7ffffffe + 0x800002c6;
  puStack0000000000000028 = unaff_x21;
  lVar3 = func_0x00764704("%s/%.*s/%.*s/%s");
  if (lVar3 == 0) goto LAB_00758a98;
  uVar4 = _strlen(unaff_x22);
  iVar2 = func_0x00779834(auStack_7ffffffe + 0x8000028e,unaff_x22,uVar4);
  if (iVar2 == 0) {
    func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
    uStack0000000000000008 = in_stack_00000158;
    puStack0000000000000000 = in_stack_00000160;
    lStack0000000000000018 = lVar3;
    puStack0000000000000020 = auStack_7ffffffe + 0x8000024d;
    lVar8 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
    if (lVar8 != 0) {
      func_0x0077e7f8(lVar8,in_stack_00000158,in_stack_00000160);
      uStack0000000000000008 = in_stack_00000158;
      puStack0000000000000000 = in_stack_00000160;
      lVar7 = func_0x00764704("%.*s4%s");
      if (lVar7 != 0) {
        func_0x0077e7f8(lVar7,in_stack_00000158,in_stack_00000160);
        uVar4 = _strlen(lVar7);
        uVar5 = _strlen(auStack_7ffffffe + 0x800002c6);
        uVar4 = func_0x0074edd8(&UNK_00a1f5c0,lVar7,uVar4,auStack_7ffffffe + 0x800002c6,uVar5,
                                &uStack0000000000000190);
        if ((((int)uVar4 == 0) &&
            (uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                     in_stack_00000140,&uStack0000000000000170), (int)uVar4 == 0))
           && (uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128,
                                       in_stack_00000130,&uStack0000000000000190), (int)uVar4 == 0))
        {
          uVar4 = _strlen(unaff_x21);
          uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,unaff_x21,uVar4,
                                  &uStack0000000000000170);
          if ((int)uVar4 == 0) {
            uVar4 = _strlen(lVar8);
            uVar4 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar8,uVar4,
                                    &uStack0000000000000190);
            if ((int)uVar4 == 0) {
              func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
              puVar1 = in_stack_00000160;
              uVar4 = in_stack_00000158;
              puStack0000000000000020 = (undefined1 *)func_0x00740a58(&uStack00000000000000b0);
              puStack0000000000000028 = auStack_7ffffffe + 0x8000024d;
              puStack0000000000000000 = puVar1;
              uStack0000000000000008 = uVar4;
              lStack0000000000000018 = lVar3;
              lVar6 = func_0x00764704(
                                     "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                     );
              if (lVar6 != 0) {
                func_0x0077e7f8(lVar6 + 0xf,in_stack_00000158,in_stack_00000160);
                unaff_x28 = (undefined8 *)0xa2b5f0;
                (*pcRam0000000000a2b5f0)
                          (*(undefined8 *)
                            ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
                uVar4 = 0;
                *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar6;
                *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
                goto LAB_00758a9c;
              }
              uVar4 = 0;
            }
          }
        }
        unaff_x28 = (undefined8 *)0xa2b5f0;
        goto LAB_00758a9c;
      }
    }
  }
  else {
    lVar8 = 0;
  }
  lVar7 = 0;
  uVar4 = 0x1b;
  unaff_x28 = (undefined8 *)0xa2b5f0;
LAB_00758a9c:
  do {
    func_0x00740678(&uStack0000000000000090);
    func_0x00740678(&uStack0000000000000070);
    func_0x00740678(&uStack00000000000000d0);
    func_0x00740678(&uStack00000000000000b0);
    (*(code *)*unaff_x28)(unaff_x22);
    (*(code *)*unaff_x28)(unaff_x21);
    (*(code *)*unaff_x28)(lVar3);
    (*(code *)*unaff_x28)(lVar8);
    (*(code *)*unaff_x28)(lVar7);
    (*(code *)*unaff_x28)();
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return uVar4;
    }
    ___stack_chk_fail();
    uVar4 = func_0x00740a58(&uStack0000000000000070);
    lVar3 = func_0x00740a58(&uStack0000000000000090);
    if (lVar3 != 0) {
      func_0x00740a58(&uStack0000000000000090);
    }
    lVar3 = func_0x00740a58(&uStack00000000000000d0);
    puStack0000000000000020 = (undefined1 *)func_0x00740a58(&uStack00000000000000b0);
    puStack0000000000000000 = in_stack_00000060;
    uStack0000000000000008 = uVar4;
    lStack0000000000000018 = lVar3;
    puStack0000000000000028 = unaff_x22;
    unaff_x22 = (undefined1 *)func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
    if (unaff_x22 == (undefined1 *)0x0) {
      lVar3 = 0;
      unaff_x21 = (undefined1 *)0x0;
    }
    else {
      puStack0000000000000000 = in_stack_00000160;
      uStack0000000000000008 = in_stack_00000158;
      unaff_x21 = (undefined1 *)func_0x00764704("%.*s4_request");
      if (unaff_x21 != (undefined1 *)0x0) break;
      lVar3 = 0;
    }
LAB_00758a98:
    lVar8 = 0;
    lVar7 = 0;
    uVar4 = 0x1b;
  } while( true );
  func_0x0077e82c(unaff_x21,unaff_x21,in_stack_00000160);
  uStack0000000000000008 = in_stack_00000140;
  lStack0000000000000018 = in_stack_00000130;
  puStack0000000000000020 = in_stack_00000128;
  unaff_x19 = lVar7;
  goto code_r0x00758bc8;
}


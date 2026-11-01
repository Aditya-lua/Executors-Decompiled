
undefined8 FUN_00758a30(ulong param_1)

{
  ulong uVar1;
  int iVar2;
  int iVar3;
  undefined1 *puVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long unaff_x19;
  long *unaff_x20;
  long *plVar10;
  ulong unaff_x21;
  long lVar11;
  undefined8 uVar12;
  long *unaff_x23;
  long unaff_x24;
  long lVar13;
  long unaff_x25;
  ulong unaff_x26;
  long *unaff_x28;
  long unaff_x29;
  undefined8 in_stack_00000040;
  long *in_stack_00000058;
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
  undefined1 uStack00000000000001b0;
  undefined1 auStack_7ffffffe [2147483646];
  
  do {
    plVar10 = unaff_x28;
    while( true ) {
      uVar1 = unaff_x26;
      if (param_1 <= unaff_x26) {
        uVar1 = param_1;
      }
      iVar3 = _strncmp(unaff_x24,unaff_x25,uVar1);
      iVar2 = (int)unaff_x26 - (int)param_1;
      if (iVar3 != 0) {
        iVar2 = iVar3;
      }
      if (iVar2 < 1) {
        unaff_x28 = (long *)plVar10[1];
        unaff_x24 = unaff_x25;
      }
      else {
        *unaff_x23 = unaff_x25;
        *plVar10 = unaff_x24;
        unaff_x21 = 1;
        unaff_x28 = (long *)plVar10[1];
      }
      unaff_x23 = plVar10;
      if (unaff_x28 == (long *)0x0) {
        if ((unaff_x21 & 1) == 0) {
          plVar10 = unaff_x20;
          goto code_r0x007588d4;
        }
        unaff_x21 = 0;
        unaff_x24 = *unaff_x20;
        unaff_x28 = in_stack_00000058;
        unaff_x23 = unaff_x20;
      }
      unaff_x25 = *unaff_x28;
      lVar6 = _strchr(unaff_x24,0x3a);
      lVar7 = _strchr(unaff_x25,0x3a);
      if (lVar6 == 0) {
        unaff_x26 = _strlen(unaff_x24);
      }
      else {
        unaff_x26 = lVar6 - unaff_x24;
      }
      if (lVar7 == 0) break;
      param_1 = lVar7 - unaff_x25;
      plVar10 = unaff_x28;
    }
    param_1 = _strlen(unaff_x25);
  } while( true );
  while( true ) {
    puVar4 = (undefined1 *)_strchr(*plVar10,0x3a);
    if (puVar4 != (undefined1 *)0x0) {
      *puVar4 = 0;
    }
    if (((plVar10 != unaff_x20) &&
        (iVar2 = func_0x007408a0(&uStack00000000000000b0,";"), iVar2 != 0)) ||
       (iVar2 = func_0x007408a0(&uStack00000000000000b0,*plVar10), iVar2 != 0))
    goto code_r0x00758a7c;
    plVar10 = (long *)plVar10[1];
    if (plVar10 == (long *)0x0) break;
code_r0x007588d4:
    iVar2 = func_0x007408a0(&uStack00000000000000d0,*plVar10);
    if ((iVar2 != 0) || (iVar2 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar2 != 0)) {
code_r0x00758a7c:
      func_0x00779fa4(unaff_x20);
      lVar13 = 0;
      lVar7 = 0;
      lVar6 = 0;
      goto code_r0x00758a98;
    }
  }
  func_0x00779fa4(unaff_x20);
  if (uStack00000000000001b0 != '\0') {
    lVar6 = _strlen(&uStack00000000000001b0);
    *(undefined2 *)(auStack_7ffffffe + lVar6 + 0x800001ae) = 0xa0d;
    auStack_7ffffffe[lVar6 + 0x800001b0] = 0;
  }
  uVar5 = func_0x00758f8c();
  if ((int)uVar5 == 0) {
    uVar12 = *(undefined8 *)
              ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
              unaff_x19 + 0x18);
    uVar5 = _strlen(uVar12);
    uVar5 = func_0x00759114(uVar12,uVar5,&uStack0000000000000070,0);
    if ((int)uVar5 == 0) goto code_r0x00758b20;
  }
  lVar13 = 0;
  lVar11 = 0;
  lVar7 = 0;
  lVar9 = 0;
  lVar6 = 0;
  do {
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*pcRam0000000000a2b5f0)(lVar6);
      (*pcRam0000000000a2b5f0)(lVar7);
      (*pcRam0000000000a2b5f0)(lVar13);
      (*pcRam0000000000a2b5f0)(lVar11);
      (*pcRam0000000000a2b5f0)(lVar9);
      (*pcRam0000000000a2b5f0)(in_stack_00000040);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar5;
      }
      ___stack_chk_fail();
      unaff_x19 = lVar9;
code_r0x00758b20:
      func_0x00740a58(&uStack0000000000000070);
      lVar6 = func_0x00740a58(&uStack0000000000000090);
      if (lVar6 != 0) {
        func_0x00740a58(&uStack0000000000000090);
      }
      func_0x00740a58(&uStack00000000000000d0);
      func_0x00740a58(&uStack00000000000000b0);
      lVar6 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
      if (lVar6 != 0) break;
      lVar13 = 0;
      lVar7 = 0;
code_r0x00758a98:
      lVar11 = 0;
      lVar9 = 0;
      uVar5 = 0x1b;
    }
    lVar7 = func_0x00764704("%.*s4_request");
    if (lVar7 == 0) {
      lVar13 = 0;
      goto code_r0x00758a98;
    }
    func_0x0077e82c(lVar7,lVar7,in_stack_00000160);
    lVar13 = func_0x00764704("%s/%.*s/%.*s/%s");
    if (lVar13 == 0) goto code_r0x00758a98;
    uVar5 = _strlen(lVar6);
    iVar2 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar6,uVar5);
    if (iVar2 == 0) {
      func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
      lVar11 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
      if (lVar11 == 0) goto LAB_00758c0c;
      func_0x0077e7f8(lVar11,in_stack_00000158,in_stack_00000160);
      lVar9 = func_0x00764704("%.*s4%s");
      if (lVar9 == 0) goto LAB_00758c0c;
      func_0x0077e7f8(lVar9,in_stack_00000158,in_stack_00000160);
      uVar5 = _strlen(lVar9);
      uVar12 = _strlen(auStack_7ffffffe + 0x800002c6);
      uVar5 = func_0x0074edd8(&UNK_00a1f5c0,lVar9,uVar5,auStack_7ffffffe + 0x800002c6,uVar12,
                              &uStack0000000000000190);
      if ((((int)uVar5 == 0) &&
          (uVar5 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                   in_stack_00000140,&uStack0000000000000170), (int)uVar5 == 0)) &&
         (uVar5 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128,
                                  in_stack_00000130,&uStack0000000000000190), (int)uVar5 == 0)) {
        uVar5 = _strlen(lVar7);
        uVar5 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar7,uVar5,
                                &uStack0000000000000170);
        if ((int)uVar5 == 0) {
          uVar5 = _strlen(lVar11);
          uVar5 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar11,uVar5,
                                  &uStack0000000000000190);
          if ((int)uVar5 == 0) {
            func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
            func_0x00740a58(&uStack00000000000000b0);
            lVar8 = func_0x00764704(
                                   "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                   );
            if (lVar8 == 0) {
              uVar5 = 0;
            }
            else {
              func_0x0077e7f8(lVar8 + 0xf,in_stack_00000158,in_stack_00000160);
              (*pcRam0000000000a2b5f0)
                        (*(undefined8 *)
                          ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
              uVar5 = 0;
              *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar8;
              *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
            }
          }
        }
      }
    }
    else {
      lVar11 = 0;
LAB_00758c0c:
      lVar9 = 0;
      uVar5 = 0x1b;
    }
  } while( true );
}


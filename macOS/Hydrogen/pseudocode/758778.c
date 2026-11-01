
/* WARNING: Removing unreachable block (ram,0x00758dd0) */

undefined8 FUN_00758778(byte *param_1)

{
  ulong uVar1;
  byte bVar2;
  long *plVar3;
  undefined1 in_ZR;
  int iVar4;
  int iVar5;
  long *plVar6;
  undefined1 *puVar7;
  long lVar8;
  undefined8 uVar9;
  long lVar10;
  long *plVar11;
  byte *in_x9;
  uint in_w10;
  long lVar12;
  long unaff_x19;
  bool bVar13;
  long lVar14;
  long lVar15;
  long *unaff_x23;
  undefined8 uVar16;
  long *plVar17;
  long lVar18;
  ulong uVar19;
  ulong uVar20;
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
  undefined1 uStack00000000000001b0;
  undefined1 auStack_7ffffffe [2147483646];
  
  while ((bool)in_ZR) {
    do {
      param_1 = param_1 + 1;
      in_x9 = in_x9 + 1;
      bVar2 = *param_1;
      in_w10 = (uint)bVar2;
    } while (bVar2 == 9);
    in_ZR = bVar2 == 0x20;
  }
  if (in_w10 != 0) {
    do {
      if ((9 < in_w10 - 0x30) && (0x19 < (in_w10 & 0xdf) - 0x41)) break;
      param_1 = param_1 + 1;
      in_w10 = (uint)*param_1;
    } while (in_w10 != 0);
  }
  puVar7 = auStack_7ffffffe + 0x800002ae;
  if (param_1 == in_x9) {
    puVar7 = auStack_7ffffffe + 0x800002be;
  }
  plVar6 = (long *)0x0;
  *puVar7 = 0;
  if (unaff_x23 != (long *)0x0) {
    plVar6 = (long *)unaff_x23[1];
    if (plVar6 != (long *)0x0) {
      do {
        bVar13 = false;
        plVar3 = plVar6;
        plVar17 = unaff_x23;
        lVar8 = *unaff_x23;
code_r0x007589dc:
        do {
          plVar11 = plVar3;
          lVar15 = *plVar11;
          lVar14 = _strchr(lVar8,0x3a);
          lVar18 = _strchr(lVar15,0x3a);
          if (lVar14 == 0) {
            uVar19 = _strlen(lVar8);
            if (lVar18 == 0) goto code_r0x00758a28;
code_r0x00758a10:
            uVar20 = lVar18 - lVar15;
          }
          else {
            uVar19 = lVar14 - lVar8;
            if (lVar18 != 0) goto code_r0x00758a10;
code_r0x00758a28:
            uVar20 = _strlen(lVar15);
          }
          uVar1 = uVar19;
          if (uVar20 <= uVar19) {
            uVar1 = uVar20;
          }
          iVar4 = _strncmp(lVar8,lVar15,uVar1);
          iVar5 = (int)uVar19 - (int)uVar20;
          if (iVar4 != 0) {
            iVar5 = iVar4;
          }
          if (0 < iVar5) {
            *plVar17 = lVar15;
            *plVar11 = lVar8;
            bVar13 = true;
            plVar3 = (long *)plVar11[1];
            plVar17 = plVar11;
            if ((long *)plVar11[1] == (long *)0x0) break;
            goto code_r0x007589dc;
          }
          plVar3 = (long *)plVar11[1];
          plVar17 = plVar11;
          lVar8 = lVar15;
        } while ((long *)plVar11[1] != (long *)0x0);
      } while (bVar13);
    }
    unaff_x28 = (undefined8 *)0xa2b5f0;
    plVar6 = unaff_x23;
    do {
      iVar5 = func_0x007408a0(&uStack00000000000000d0,*plVar6);
      if ((iVar5 != 0) || (iVar5 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar5 != 0)) {
code_r0x00758a7c:
        func_0x00779fa4(unaff_x23);
        lVar18 = 0;
        lVar14 = 0;
        lVar8 = 0;
        goto code_r0x00758a98;
      }
      puVar7 = (undefined1 *)_strchr(*plVar6,0x3a);
      if (puVar7 != (undefined1 *)0x0) {
        *puVar7 = 0;
      }
      if (((plVar6 != unaff_x23) &&
          (iVar5 = func_0x007408a0(&uStack00000000000000b0,";"), iVar5 != 0)) ||
         (iVar5 = func_0x007408a0(&uStack00000000000000b0,*plVar6), iVar5 != 0))
      goto code_r0x00758a7c;
      plVar6 = (long *)plVar6[1];
    } while (plVar6 != (long *)0x0);
    plVar6 = unaff_x23;
  }
  func_0x00779fa4(plVar6);
  if (uStack00000000000001b0 != '\0') {
    lVar8 = _strlen(&uStack00000000000001b0);
    *(undefined2 *)(auStack_7ffffffe + lVar8 + 0x800001ae) = 0xa0d;
    auStack_7ffffffe[lVar8 + 0x800001b0] = 0;
  }
  uVar9 = func_0x00758f8c();
  if ((int)uVar9 == 0) {
    uVar16 = *(undefined8 *)
              ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
              unaff_x19 + 0x18);
    uVar9 = _strlen(uVar16);
    uVar9 = func_0x00759114(uVar16,uVar9,&uStack0000000000000070,0);
    if ((int)uVar9 == 0) goto code_r0x00758b20;
  }
  lVar18 = 0;
  lVar15 = 0;
  lVar14 = 0;
  lVar12 = 0;
  lVar8 = 0;
  do {
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*(code *)*unaff_x28)(lVar8);
      (*(code *)*unaff_x28)(lVar14);
      (*(code *)*unaff_x28)(lVar18);
      (*(code *)*unaff_x28)(lVar15);
      (*(code *)*unaff_x28)(lVar12);
      (*(code *)*unaff_x28)(0);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar9;
      }
      ___stack_chk_fail();
      unaff_x19 = lVar12;
code_r0x00758b20:
      func_0x00740a58(&uStack0000000000000070);
      lVar8 = func_0x00740a58(&uStack0000000000000090);
      if (lVar8 != 0) {
        func_0x00740a58(&uStack0000000000000090);
      }
      func_0x00740a58(&uStack00000000000000d0);
      func_0x00740a58(&uStack00000000000000b0);
      lVar8 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
      if (lVar8 != 0) break;
      lVar18 = 0;
      lVar14 = 0;
code_r0x00758a98:
      lVar15 = 0;
      lVar12 = 0;
      uVar9 = 0x1b;
    }
    lVar14 = func_0x00764704("%.*s4_request");
    if (lVar14 == 0) {
      lVar18 = 0;
      goto code_r0x00758a98;
    }
    func_0x0077e82c(lVar14,lVar14,in_stack_00000160);
    lVar18 = func_0x00764704("%s/%.*s/%.*s/%s");
    if (lVar18 == 0) goto code_r0x00758a98;
    uVar9 = _strlen(lVar8);
    iVar5 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar8,uVar9);
    if (iVar5 == 0) {
      func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
      lVar15 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
      if (lVar15 == 0) goto code_r0x00758c0c;
      func_0x0077e7f8(lVar15,in_stack_00000158,in_stack_00000160);
      lVar12 = func_0x00764704("%.*s4%s");
      if (lVar12 == 0) goto code_r0x00758c0c;
      func_0x0077e7f8(lVar12,in_stack_00000158,in_stack_00000160);
      uVar9 = _strlen(lVar12);
      uVar16 = _strlen(auStack_7ffffffe + 0x800002c6);
      uVar9 = func_0x0074edd8(&UNK_00a1f5c0,lVar12,uVar9,auStack_7ffffffe + 0x800002c6,uVar16,
                              &uStack0000000000000190);
      if ((((int)uVar9 == 0) &&
          (uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                   in_stack_00000140,&uStack0000000000000170), (int)uVar9 == 0)) &&
         (uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128,
                                  in_stack_00000130,&uStack0000000000000190), (int)uVar9 == 0)) {
        uVar9 = _strlen(lVar14);
        uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar14,uVar9,
                                &uStack0000000000000170);
        if ((int)uVar9 != 0) goto code_r0x00758d9c;
        uVar9 = _strlen(lVar15);
        uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar15,uVar9,
                                &uStack0000000000000190);
        if ((int)uVar9 != 0) goto code_r0x00758d9c;
        func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
        func_0x00740a58(&uStack00000000000000b0);
        lVar10 = func_0x00764704(
                                "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                );
        if (lVar10 == 0) {
          uVar9 = 0;
          goto code_r0x00758d9c;
        }
        func_0x0077e7f8(lVar10 + 0xf,in_stack_00000158,in_stack_00000160);
        unaff_x28 = (undefined8 *)0xa2b5f0;
        (*pcRam0000000000a2b5f0)
                  (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19))
        ;
        uVar9 = 0;
        *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar10;
        *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
      }
      else {
code_r0x00758d9c:
        unaff_x28 = (undefined8 *)0xa2b5f0;
      }
    }
    else {
      lVar15 = 0;
code_r0x00758c0c:
      lVar12 = 0;
      uVar9 = 0x1b;
      unaff_x28 = (undefined8 *)0xa2b5f0;
    }
  } while( true );
}



undefined8 FUN_007588a0(void)

{
  ulong uVar1;
  int iVar2;
  int iVar3;
  undefined1 *puVar4;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  long lVar8;
  long *plVar9;
  long *unaff_x19;
  undefined8 unaff_x20;
  bool bVar10;
  long lVar11;
  long *plVar12;
  long lVar13;
  long *plVar14;
  long *unaff_x24;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  long unaff_x29;
  long *plStack0000000000000058;
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
  
  plStack0000000000000058 = (long *)unaff_x24[1];
  if (plStack0000000000000058 != (long *)0x0) {
    do {
      bVar10 = false;
      plVar12 = plStack0000000000000058;
      plVar14 = unaff_x24;
      lVar5 = *unaff_x24;
LAB_007589dc:
      do {
        plVar9 = plVar12;
        lVar13 = *plVar9;
        lVar11 = _strchr(lVar5,0x3a);
        lVar15 = _strchr(lVar13,0x3a);
        if (lVar11 == 0) {
          uVar16 = _strlen(lVar5);
          if (lVar15 != 0) goto LAB_00758a10;
LAB_00758a28:
          uVar17 = _strlen(lVar13);
        }
        else {
          uVar16 = lVar11 - lVar5;
          if (lVar15 == 0) goto LAB_00758a28;
LAB_00758a10:
          uVar17 = lVar15 - lVar13;
        }
        uVar1 = uVar16;
        if (uVar17 <= uVar16) {
          uVar1 = uVar17;
        }
        iVar3 = _strncmp(lVar5,lVar13,uVar1);
        iVar2 = (int)uVar16 - (int)uVar17;
        if (iVar3 != 0) {
          iVar2 = iVar3;
        }
        if (iVar2 < 1) {
          plVar12 = (long *)plVar9[1];
          plVar14 = plVar9;
          lVar5 = lVar13;
          if ((long *)plVar9[1] == (long *)0x0) break;
          goto LAB_007589dc;
        }
        *plVar14 = lVar13;
        *plVar9 = lVar5;
        bVar10 = true;
        plVar12 = (long *)plVar9[1];
        plVar14 = plVar9;
      } while ((long *)plVar9[1] != (long *)0x0);
    } while (bVar10);
  }
  plVar12 = unaff_x24;
  do {
    iVar2 = func_0x007408a0(&uStack00000000000000d0,*plVar12);
    if ((iVar2 != 0) || (iVar2 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar2 != 0)) {
LAB_00758a7c:
      func_0x00779fa4(unaff_x24);
      lVar15 = 0;
      lVar11 = 0;
      lVar5 = 0;
      goto LAB_00758a98;
    }
    puVar4 = (undefined1 *)_strchr(*plVar12,0x3a);
    if (puVar4 != (undefined1 *)0x0) {
      *puVar4 = 0;
    }
    if (((plVar12 != unaff_x24) &&
        (iVar2 = func_0x007408a0(&uStack00000000000000b0,";"), iVar2 != 0)) ||
       (iVar2 = func_0x007408a0(&uStack00000000000000b0,*plVar12), iVar2 != 0)) goto LAB_00758a7c;
    plVar12 = (long *)plVar12[1];
  } while (plVar12 != (long *)0x0);
  func_0x00779fa4(unaff_x24);
  if (uStack00000000000001b0 != '\0') {
    lVar5 = _strlen(&uStack00000000000001b0);
    *(undefined2 *)(auStack_7ffffffe + lVar5 + 0x800001ae) = 0xa0d;
    auStack_7ffffffe[lVar5 + 0x800001b0] = 0;
  }
  uVar6 = func_0x00758f8c();
  if ((int)uVar6 == 0) {
    lVar5 = unaff_x19[0x234];
    uVar6 = _strlen(lVar5);
    uVar6 = func_0x00759114(lVar5,uVar6,&uStack0000000000000070,0);
    if ((int)uVar6 == 0) goto LAB_00758b20;
  }
  lVar15 = 0;
  lVar13 = 0;
  lVar11 = 0;
  lVar5 = 0;
  unaff_x19 = (long *)0x0;
LAB_00758a9c:
  do {
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*pcRam0000000000a2b5f0)(lVar5);
      (*pcRam0000000000a2b5f0)(lVar11);
      (*pcRam0000000000a2b5f0)(lVar15);
      (*pcRam0000000000a2b5f0)(lVar13);
      (*pcRam0000000000a2b5f0)(unaff_x19);
      (*pcRam0000000000a2b5f0)(unaff_x20);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar6;
      }
      ___stack_chk_fail();
LAB_00758b20:
      func_0x00740a58(&uStack0000000000000070);
      lVar5 = func_0x00740a58(&uStack0000000000000090);
      if (lVar5 != 0) {
        func_0x00740a58(&uStack0000000000000090);
      }
      func_0x00740a58(&uStack00000000000000d0);
      func_0x00740a58(&uStack00000000000000b0);
      lVar5 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
      if (lVar5 != 0) break;
      lVar15 = 0;
      lVar11 = 0;
LAB_00758a98:
      lVar13 = 0;
      unaff_x19 = (long *)0x0;
      uVar6 = 0x1b;
    }
    lVar11 = func_0x00764704("%.*s4_request");
    if (lVar11 == 0) {
      lVar15 = 0;
      goto LAB_00758a98;
    }
    func_0x0077e82c(lVar11,lVar11,in_stack_00000160);
    lVar15 = func_0x00764704("%s/%.*s/%.*s/%s");
    if (lVar15 == 0) goto LAB_00758a98;
    uVar6 = _strlen(lVar5);
    iVar2 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar5,uVar6);
    if (iVar2 == 0) {
      func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
      lVar13 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
      if (lVar13 != 0) {
        func_0x0077e7f8(lVar13,in_stack_00000158,in_stack_00000160);
        plVar12 = (long *)func_0x00764704("%.*s4%s");
        plStack0000000000000058 = plVar12;
        if (plVar12 != (long *)0x0) {
          func_0x0077e7f8(plVar12,in_stack_00000158,in_stack_00000160);
          uVar6 = _strlen(plVar12);
          uVar7 = _strlen(auStack_7ffffffe + 0x800002c6);
          uVar6 = func_0x0074edd8(&UNK_00a1f5c0,plVar12,uVar6,auStack_7ffffffe + 0x800002c6,uVar7,
                                  &uStack0000000000000190);
          if ((((int)uVar6 == 0) &&
              (uVar6 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                       in_stack_00000140,&uStack0000000000000170), (int)uVar6 == 0))
             && (uVar6 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,
                                         in_stack_00000128,in_stack_00000130,&uStack0000000000000190
                                        ), (int)uVar6 == 0)) {
            uVar6 = _strlen(lVar11);
            uVar6 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar11,uVar6,
                                    &uStack0000000000000170);
            if ((int)uVar6 == 0) {
              uVar6 = _strlen(lVar13);
              uVar6 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar13,uVar6,
                                      &uStack0000000000000190);
              if ((int)uVar6 == 0) {
                func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
                func_0x00740a58(&uStack00000000000000b0);
                lVar8 = func_0x00764704(
                                       "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                       );
                if (lVar8 != 0) {
                  func_0x0077e7f8(lVar8 + 0xf,in_stack_00000158,in_stack_00000160);
                  (*pcRam0000000000a2b5f0)(unaff_x19[0x25c]);
                  uVar6 = 0;
                  unaff_x19[0x25c] = lVar8;
                  *(byte *)(unaff_x19 + 0x19f) = *(byte *)(unaff_x19 + 0x19f) | 1;
                  unaff_x19 = plStack0000000000000058;
                  goto LAB_00758a9c;
                }
                uVar6 = 0;
              }
            }
          }
          unaff_x19 = plStack0000000000000058;
          goto LAB_00758a9c;
        }
      }
    }
    else {
      lVar13 = 0;
    }
    uVar6 = 0x1b;
    unaff_x19 = (long *)0x0;
  } while( true );
}


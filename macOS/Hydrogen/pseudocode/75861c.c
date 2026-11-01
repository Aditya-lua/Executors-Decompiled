
undefined8 FUN_0075861c(long *param_1,long param_2)

{
  ulong uVar1;
  byte bVar2;
  long *plVar3;
  int iVar4;
  int iVar5;
  char *pcVar6;
  byte *pbVar7;
  long *plVar8;
  undefined1 *puVar9;
  undefined8 uVar10;
  long lVar11;
  char *pcVar12;
  long *plVar13;
  char *pcVar14;
  byte *pbVar15;
  char cVar16;
  long unaff_x19;
  long lVar17;
  long unaff_x20;
  undefined8 uVar18;
  bool bVar19;
  undefined8 *unaff_x21;
  long lVar20;
  long lVar21;
  long *plVar22;
  long lVar23;
  long *unaff_x24;
  undefined8 uVar24;
  long *unaff_x25;
  long lVar25;
  char unaff_w26;
  long *plVar26;
  ulong uVar27;
  ulong uVar28;
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
  
code_r0x0075861c:
  param_1 = (long *)func_0x00779d84(param_1,param_2);
  if (param_1 == (long *)0x0) goto code_r0x00758628;
LAB_00758570:
  while (unaff_x25 = (long *)unaff_x25[1], unaff_x25 != (long *)0x0) {
    lVar21 = *unaff_x25;
    pcVar6 = (char *)_strchr(lVar21,0x3a);
    if (((pcVar6 != (char *)0x0) || (pcVar6 = (char *)_strchr(lVar21,0x3b), pcVar6 != (char *)0x0))
       && ((*pcVar6 != ':' || (pcVar6[1] != '\0')))) goto code_r0x007585bc;
  }
  if (param_1 != (long *)0x0) {
    plVar26 = param_1;
    do {
      lVar20 = *plVar26;
      lVar21 = _strcspn(lVar20,":");
      func_0x0077e82c(lVar20,lVar20,lVar21);
      if (*(char *)(*plVar26 + lVar21) != '\0') {
        pcVar6 = (char *)(*plVar26 + lVar21) + 1;
        for (pcVar14 = pcVar6; (cVar16 = *pcVar14, cVar16 == '\t' || (cVar16 == ' '));
            pcVar14 = pcVar14 + 1) {
        }
        while (pcVar12 = pcVar6, cVar16 != '\0') {
          while( true ) {
            lVar21 = 0;
            while ((cVar16 == ' ' || (cVar16 == '\t'))) {
              lVar20 = lVar21 + 1;
              lVar21 = lVar21 + 1;
              cVar16 = pcVar14[lVar20];
            }
            pcVar14 = pcVar14 + lVar21;
            if ((int)lVar21 == 0) break;
            pcVar6 = pcVar12;
            if (cVar16 == '\0') goto code_r0x00758658;
            pcVar6 = pcVar12 + 1;
            *pcVar12 = ' ';
            cVar16 = *pcVar14;
            pcVar12 = pcVar6;
            if (cVar16 == '\0') goto code_r0x00758658;
          }
          pcVar6 = pcVar12 + 1;
          *pcVar12 = cVar16;
          pcVar14 = pcVar14 + 1;
          cVar16 = *pcVar14;
        }
code_r0x00758658:
        *pcVar6 = '\0';
      }
      plVar26 = (long *)plVar26[1];
    } while (plVar26 != (long *)0x0);
  }
  _strlen(unaff_x29 + -0xa8);
  lVar21 = func_0x00782efc();
  if ((lVar21 == 0) && (lVar21 = func_0x00782efc(), lVar21 == 0)) {
    plVar26 = (long *)func_0x00779dfc(param_1,auStack_7ffffffe + 0x800002c6);
    if (plVar26 != (long *)0x0) {
      uVar18 = func_0x00764704("%s: %s\r\n");
      goto code_r0x007588a4;
    }
code_r0x00758a78:
    uVar18 = 0;
    goto LAB_00758a7c;
  }
  pbVar7 = (byte *)_strchr(lVar21,0x3a);
  if (pbVar7 == (byte *)0x0) goto code_r0x00758a78;
  pbVar15 = pbVar7 + 0x11;
  while( true ) {
    pbVar7 = pbVar7 + 1;
    bVar2 = *pbVar7;
    if ((bVar2 != 9) && (bVar2 != 0x20)) break;
    pbVar15 = pbVar15 + 1;
  }
  if (bVar2 != 0) {
    do {
      if ((9 < bVar2 - 0x30) && (0x19 < (bVar2 & 0xdf) - 0x41)) break;
      pbVar7 = pbVar7 + 1;
      bVar2 = *pbVar7;
    } while (bVar2 != 0);
  }
  puVar9 = auStack_7ffffffe + 0x800002ae;
  if (pbVar7 == pbVar15) {
    puVar9 = auStack_7ffffffe + 0x800002be;
  }
  uVar18 = 0;
  plVar8 = (long *)0x0;
  *puVar9 = 0;
  plVar26 = param_1;
  if (param_1 == (long *)0x0) goto code_r0x0075893c;
code_r0x007588a4:
  plVar8 = plVar26;
  plVar26 = (long *)plVar8[1];
  if (plVar26 != (long *)0x0) {
    do {
      bVar19 = false;
      plVar3 = plVar26;
      plVar22 = plVar8;
      lVar21 = *plVar8;
code_r0x007589dc:
      do {
        plVar13 = plVar3;
        lVar23 = *plVar13;
        lVar20 = _strchr(lVar21,0x3a);
        lVar25 = _strchr(lVar23,0x3a);
        if (lVar20 == 0) {
          uVar27 = _strlen(lVar21);
          if (lVar25 == 0) goto code_r0x00758a28;
code_r0x00758a10:
          uVar28 = lVar25 - lVar23;
        }
        else {
          uVar27 = lVar20 - lVar21;
          if (lVar25 != 0) goto code_r0x00758a10;
code_r0x00758a28:
          uVar28 = _strlen(lVar23);
        }
        uVar1 = uVar27;
        if (uVar28 <= uVar27) {
          uVar1 = uVar28;
        }
        iVar4 = _strncmp(lVar21,lVar23,uVar1);
        iVar5 = (int)uVar27 - (int)uVar28;
        if (iVar4 != 0) {
          iVar5 = iVar4;
        }
        if (0 < iVar5) {
          *plVar22 = lVar23;
          *plVar13 = lVar21;
          bVar19 = true;
          plVar3 = (long *)plVar13[1];
          plVar22 = plVar13;
          if ((long *)plVar13[1] == (long *)0x0) break;
          goto code_r0x007589dc;
        }
        plVar3 = (long *)plVar13[1];
        plVar22 = plVar13;
        lVar21 = lVar23;
      } while ((long *)plVar13[1] != (long *)0x0);
    } while (bVar19);
  }
  unaff_x28 = (undefined8 *)0xa2b5f0;
  plVar26 = plVar8;
  while( true ) {
    iVar5 = func_0x007408a0(&uStack00000000000000d0,*plVar26);
    param_1 = plVar8;
    if ((iVar5 != 0) || (iVar5 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar5 != 0)) break;
    puVar9 = (undefined1 *)_strchr(*plVar26,0x3a);
    if (puVar9 != (undefined1 *)0x0) {
      *puVar9 = 0;
    }
    if (((plVar26 != plVar8) && (iVar5 = func_0x007408a0(&uStack00000000000000b0,";"), iVar5 != 0))
       || (iVar5 = func_0x007408a0(&uStack00000000000000b0,*plVar26), iVar5 != 0)) break;
    plVar26 = (long *)plVar26[1];
    if (plVar26 == (long *)0x0) {
code_r0x0075893c:
      func_0x00779fa4(plVar8);
      if (uStack00000000000001b0 != '\0') {
        lVar21 = _strlen(&uStack00000000000001b0);
        *(undefined2 *)(auStack_7ffffffe + lVar21 + 0x800001ae) = 0xa0d;
        auStack_7ffffffe[lVar21 + 0x800001b0] = 0;
      }
      uVar24 = func_0x00758f8c();
      if ((int)uVar24 == 0) {
        uVar10 = *(undefined8 *)
                  ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                  unaff_x19 + 0x18);
        uVar24 = _strlen(uVar10);
        uVar24 = func_0x00759114(uVar10,uVar24,&uStack0000000000000070,0);
        if ((int)uVar24 == 0) goto code_r0x00758b20;
      }
      lVar25 = 0;
      lVar23 = 0;
      lVar20 = 0;
      lVar17 = 0;
      lVar21 = 0;
      goto code_r0x00758a9c;
    }
  }
LAB_00758a7c:
  func_0x00779fa4(param_1);
  lVar25 = 0;
  lVar20 = 0;
  lVar21 = 0;
code_r0x00758a98:
  do {
    lVar23 = 0;
    lVar17 = 0;
    uVar24 = 0x1b;
code_r0x00758a9c:
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*(code *)*unaff_x28)(lVar21);
      (*(code *)*unaff_x28)(lVar20);
      (*(code *)*unaff_x28)(lVar25);
      (*(code *)*unaff_x28)(lVar23);
      (*(code *)*unaff_x28)(lVar17);
      (*(code *)*unaff_x28)(uVar18);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar24;
      }
      ___stack_chk_fail();
      unaff_x19 = lVar17;
code_r0x00758b20:
      func_0x00740a58(&uStack0000000000000070);
      lVar21 = func_0x00740a58(&uStack0000000000000090);
      if (lVar21 != 0) {
        func_0x00740a58(&uStack0000000000000090);
      }
      func_0x00740a58(&uStack00000000000000d0);
      func_0x00740a58(&uStack00000000000000b0);
      lVar21 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
      if (lVar21 == 0) break;
      lVar20 = func_0x00764704("%.*s4_request");
      if (lVar20 == 0) {
        lVar25 = 0;
        goto code_r0x00758a98;
      }
      func_0x0077e82c(lVar20,lVar20,in_stack_00000160);
      lVar25 = func_0x00764704("%s/%.*s/%.*s/%s");
      if (lVar25 == 0) goto code_r0x00758a98;
      uVar24 = _strlen(lVar21);
      iVar5 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar21,uVar24);
      if (iVar5 == 0) {
        func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
        lVar23 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
        if (lVar23 == 0) goto LAB_00758c0c;
        func_0x0077e7f8(lVar23,in_stack_00000158,in_stack_00000160);
        lVar17 = func_0x00764704("%.*s4%s");
        if (lVar17 == 0) goto LAB_00758c0c;
        func_0x0077e7f8(lVar17,in_stack_00000158,in_stack_00000160);
        uVar24 = _strlen(lVar17);
        uVar10 = _strlen(auStack_7ffffffe + 0x800002c6);
        uVar24 = func_0x0074edd8(&UNK_00a1f5c0,lVar17,uVar24,auStack_7ffffffe + 0x800002c6,uVar10,
                                 &uStack0000000000000190);
        if ((((int)uVar24 == 0) &&
            (uVar24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                      in_stack_00000140,&uStack0000000000000170), (int)uVar24 == 0))
           && (uVar24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128
                                        ,in_stack_00000130,&uStack0000000000000190),
              (int)uVar24 == 0)) {
          uVar24 = _strlen(lVar20);
          uVar24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar20,uVar24,
                                   &uStack0000000000000170);
          if ((int)uVar24 != 0) goto code_r0x00758d9c;
          uVar24 = _strlen(lVar23);
          uVar24 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar23,uVar24,
                                   &uStack0000000000000190);
          if ((int)uVar24 != 0) goto code_r0x00758d9c;
          func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
          func_0x00740a58(&uStack00000000000000b0);
          lVar11 = func_0x00764704(
                                  "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                  );
          if (lVar11 == 0) {
            uVar24 = 0;
            goto code_r0x00758d9c;
          }
          func_0x0077e7f8(lVar11 + 0xf,in_stack_00000158,in_stack_00000160);
          unaff_x28 = (undefined8 *)0xa2b5f0;
          (*pcRam0000000000a2b5f0)
                    (*(undefined8 *)
                      ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19));
          uVar24 = 0;
          *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar11;
          *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
        }
        else {
code_r0x00758d9c:
          unaff_x28 = (undefined8 *)0xa2b5f0;
        }
      }
      else {
        lVar23 = 0;
LAB_00758c0c:
        lVar17 = 0;
        uVar24 = 0x1b;
        unaff_x28 = (undefined8 *)0xa2b5f0;
      }
    }
    lVar25 = 0;
    lVar20 = 0;
  } while( true );
code_r0x00758628:
  (*(code *)*unaff_x28)(unaff_x20);
  param_1 = unaff_x24;
code_r0x00758638:
  uVar18 = 0;
  goto LAB_00758a7c;
code_r0x007585bc:
  lVar20 = 0;
  while (((bVar2 = pcVar6[lVar20 + 1], bVar2 == 9 || (bVar2 == 0x20)) || (bVar2 - 10 < 4))) {
    lVar20 = lVar20 + 1;
  }
  if ((lVar20 == 0) || (bVar2 != 0)) goto code_r0x007585f4;
  goto LAB_00758570;
code_r0x007585f4:
  param_2 = (*(code *)*unaff_x21)(lVar21);
  if (param_2 == 0) goto code_r0x00758638;
  pcVar6[param_2 - *unaff_x25] = unaff_w26;
  unaff_x20 = param_2;
  unaff_x24 = param_1;
  goto code_r0x0075861c;
}


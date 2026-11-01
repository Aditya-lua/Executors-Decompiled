
undefined8 FUN_0075830c(void)

{
  ulong uVar1;
  byte bVar2;
  undefined1 uVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  char *pcVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  long *plVar10;
  byte *pbVar11;
  undefined1 *puVar12;
  undefined8 uVar13;
  long lVar14;
  char *pcVar15;
  long *plVar16;
  char *pcVar17;
  byte *pbVar18;
  char cVar19;
  long unaff_x19;
  long lVar20;
  long unaff_x20;
  bool bVar21;
  long lVar22;
  long lVar23;
  long *plVar24;
  long *plVar25;
  long lVar26;
  long *plVar27;
  ulong uVar28;
  ulong uVar29;
  undefined8 *unaff_x28;
  long unaff_x29;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000090;
  undefined1 uStack00000000000000b0;
  undefined1 uStack00000000000000d0;
  undefined1 uStack00000000000000f0;
  undefined8 uStack0000000000000128;
  ulong in_stack_00000130;
  undefined8 uStack0000000000000138;
  ulong in_stack_00000140;
  char *in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  long in_stack_00000160;
  undefined1 uStack0000000000000168;
  undefined1 uStack0000000000000170;
  undefined1 uStack0000000000000190;
  undefined1 uStack00000000000001b0;
  undefined1 auStack_7ffffffe [2147483646];
  
  iVar4 = func_0x0077ec94();
  if (((iVar4 == 0) &&
      (iVar4 = func_0x0077eb78(&uStack0000000000000168,&uStack0000000000000138,0x40,0x3a),
      iVar4 == 0)) && (iVar4 = func_0x0077ec94(&uStack0000000000000168,0x3a), iVar4 == 0)) {
    func_0x0077eb78(&uStack0000000000000168,&uStack0000000000000128,0x40,0x3a);
  }
  if (in_stack_00000130 != 0) goto code_r0x00758190;
  lVar6 = _strchr();
  if (lVar6 == 0) {
    func_0x0073c9e4();
    uVar8 = 0;
    lVar26 = 0;
    lVar23 = 0;
    lVar22 = 0;
    lVar20 = 0;
    uVar9 = 3;
    lVar6 = 0;
    goto code_r0x00758a9c;
  }
  uVar28 = lVar6 - unaff_x20;
  if (0x40 < uVar28) {
code_r0x007582bc:
    func_0x0073c9e4();
    uVar8 = 0;
    lVar26 = 0;
    lVar23 = 0;
    lVar22 = 0;
    lVar20 = 0;
    lVar6 = 0;
    uVar9 = 3;
    goto code_r0x00758a9c;
  }
  uStack0000000000000128 = unaff_x20;
  if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  in_stack_00000130 = uVar28;
  if (in_stack_00000140 == 0) {
    lVar6 = lVar6 + 1;
    lVar22 = _strchr(lVar6,0x2e);
    if ((lVar22 == 0) || (uVar28 = lVar22 - lVar6, 0x40 < uVar28)) goto code_r0x007582bc;
    uStack0000000000000138 = lVar6;
    in_stack_00000140 = uVar28;
    if ((*(char *)(unaff_x19 + 0xa1d) < '\0') &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
  }
code_r0x00758190:
  func_0x00753fdc();
  func_0x00764560(auStack_7ffffffe + 0x800002c6,0x52,"x-%.*s-content-sha256");
  lVar6 = func_0x00782efc();
  if (lVar6 == 0) {
code_r0x00758228:
    if ((((in_stack_00000160 == 3) &&
         (iVar4 = func_0x0077e76c(in_stack_00000158,"aws",3), iVar4 != 0)) &&
        (in_stack_00000130 == 2)) &&
       (iVar4 = func_0x0077e76c(uStack0000000000000128,"s3",2), iVar4 != 0)) {
      uVar9 = func_0x00758e44();
      if ((int)uVar9 == 0) goto code_r0x007583a8;
    }
    else {
      lVar6 = *(long *)(unaff_x19 + 0x210);
      if (lVar6 == 0) {
        lVar22 = 0;
      }
      else {
        lVar22 = *(long *)(unaff_x19 + 0x220);
        if (lVar22 < 0) {
          lVar22 = _strlen(lVar6);
        }
      }
      uVar9 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar6,lVar22);
      if ((int)uVar9 == 0) {
        func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
code_r0x007583a8:
        _strlen(auStack_7ffffffe + 0x8000024d);
        goto code_r0x007583b8;
      }
    }
code_r0x007583cc:
    uVar8 = 0;
  }
  else {
    pcVar7 = (char *)_strchr(lVar6,0x3a);
    if (pcVar7 == (char *)0x0) goto code_r0x00758228;
    do {
      do {
        pcVar17 = pcVar7;
        pcVar7 = pcVar17 + 1;
      } while (*pcVar7 == '\t');
    } while (*pcVar7 == ' ');
    for (lVar6 = _strlen(pcVar17 + 1);
        (lVar6 != 0 && (pcVar17[lVar6] == ' ' || pcVar17[lVar6] == '\t')); lVar6 = lVar6 + -1) {
    }
code_r0x007583b8:
    uVar8 = _time(0);
    uVar9 = func_0x0076defc(uVar8,&uStack00000000000000f0);
    if ((int)uVar9 != 0) goto code_r0x007583cc;
    lVar6 = _strftime(auStack_7ffffffe + 0x800002ae,0x11,"%Y%m%dT%H%M%SZ",&uStack00000000000000f0);
    uVar8 = in_stack_00000150;
    pcVar7 = in_stack_00000148;
    if (lVar6 == 0) {
      uVar8 = 0;
      goto code_r0x00758a84;
    }
    func_0x00764560(unaff_x29 + -0xa8,0x48,"X-%.*s-Date");
    func_0x0077e82c(unaff_x29 + -0xa6,pcVar7,uVar8);
    uVar3 = func_0x0077e6d0((long)*pcVar7);
    *(undefined1 *)(unaff_x29 + -0xa6) = uVar3;
    func_0x00764560(auStack_7ffffffe + 0x800002c6,0x5a,"x-%.*s-date:%s");
    func_0x0077e82c(auStack_7ffffffe + 0x800002c8,pcVar7,uVar8);
    lVar6 = func_0x00782efc();
    if (lVar6 == 0) {
      lVar6 = *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x10);
      if (lVar6 == 0) {
        lVar6 = func_0x00764704("host:%s");
      }
      else {
        uVar8 = _strcspn(lVar6,"\n\r");
        lVar6 = func_0x0077e93c(lVar6,uVar8);
      }
      if ((lVar6 != 0) && (plVar24 = (long *)func_0x00779d84(0,lVar6), plVar24 != (long *)0x0))
      goto code_r0x00758494;
      (*(code *)*unaff_x28)(lVar6);
      uVar8 = 0;
      plVar24 = (long *)0x0;
code_r0x00758a7c:
      func_0x00779fa4(plVar24);
code_r0x00758a84:
      lVar26 = 0;
      lVar22 = 0;
      lVar6 = 0;
      goto code_r0x00758a98;
    }
    plVar24 = (long *)0x0;
code_r0x00758494:
    if (uStack00000000000001b0 != '\0') {
      plVar10 = (long *)func_0x00779dfc(plVar24,&uStack00000000000001b0);
      if (plVar10 != (long *)0x0) goto code_r0x00758550;
code_r0x00758a78:
      uVar8 = 0;
      goto code_r0x00758a7c;
    }
    plVar10 = plVar24;
code_r0x00758550:
    plVar27 = *(long **)(unaff_x19 + 0x328);
    plVar24 = plVar10;
    if (plVar27 != (long *)0x0) {
      do {
        lVar6 = *plVar27;
        pcVar7 = (char *)_strchr(lVar6,0x3a);
        if (((pcVar7 == (char *)0x0) &&
            (pcVar7 = (char *)_strchr(lVar6,0x3b), pcVar7 == (char *)0x0)) ||
           ((*pcVar7 == ':' && (pcVar7[1] == '\0')))) {
code_r0x0075856c:
          plVar10 = plVar24;
        }
        else {
          lVar22 = 0;
          while (((bVar2 = pcVar7[lVar22 + 1], bVar2 == 9 || (bVar2 == 0x20)) || (bVar2 - 10 < 4)))
          {
            lVar22 = lVar22 + 1;
          }
          if ((lVar22 != 0) && (bVar2 == 0)) goto code_r0x0075856c;
          lVar6 = (*pcRam0000000000a2b600)(lVar6);
          if (lVar6 == 0) {
code_r0x00758638:
            uVar8 = 0;
            goto code_r0x00758a7c;
          }
          pcVar7[lVar6 - *plVar27] = ':';
          plVar10 = (long *)func_0x00779d84(plVar24,lVar6);
          if (plVar10 == (long *)0x0) {
            (*(code *)*unaff_x28)(lVar6);
            goto code_r0x00758638;
          }
        }
        plVar27 = (long *)plVar27[1];
        plVar24 = plVar10;
      } while (plVar27 != (long *)0x0);
    }
    if (plVar10 != (long *)0x0) {
      plVar24 = plVar10;
      do {
        lVar22 = *plVar24;
        lVar6 = _strcspn(lVar22,":");
        func_0x0077e82c(lVar22,lVar22,lVar6);
        if (*(char *)(*plVar24 + lVar6) != '\0') {
          pcVar7 = (char *)(*plVar24 + lVar6) + 1;
          for (pcVar17 = pcVar7; (cVar19 = *pcVar17, cVar19 == '\t' || (cVar19 == ' '));
              pcVar17 = pcVar17 + 1) {
          }
          while (pcVar15 = pcVar7, cVar19 != '\0') {
            while( true ) {
              lVar6 = 0;
              while ((cVar19 == ' ' || (cVar19 == '\t'))) {
                lVar22 = lVar6 + 1;
                lVar6 = lVar6 + 1;
                cVar19 = pcVar17[lVar22];
              }
              pcVar17 = pcVar17 + lVar6;
              if ((int)lVar6 == 0) break;
              pcVar7 = pcVar15;
              if (cVar19 == '\0') goto code_r0x00758658;
              pcVar7 = pcVar15 + 1;
              *pcVar15 = ' ';
              cVar19 = *pcVar17;
              pcVar15 = pcVar7;
              if (cVar19 == '\0') goto code_r0x00758658;
            }
            pcVar7 = pcVar15 + 1;
            *pcVar15 = cVar19;
            pcVar17 = pcVar17 + 1;
            cVar19 = *pcVar17;
          }
code_r0x00758658:
          *pcVar7 = '\0';
        }
        plVar24 = (long *)plVar24[1];
      } while (plVar24 != (long *)0x0);
    }
    _strlen(unaff_x29 + -0xa8);
    lVar6 = func_0x00782efc();
    plVar24 = plVar10;
    if ((lVar6 == 0) && (lVar6 = func_0x00782efc(), lVar6 == 0)) {
      plVar10 = (long *)func_0x00779dfc(plVar10,auStack_7ffffffe + 0x800002c6);
      if (plVar10 == (long *)0x0) goto code_r0x00758a78;
      uVar8 = func_0x00764704("%s: %s\r\n");
code_r0x007588a4:
      plVar24 = plVar10;
      plVar10 = (long *)plVar24[1];
      if (plVar10 != (long *)0x0) {
        do {
          bVar21 = false;
          plVar27 = plVar10;
          plVar25 = plVar24;
          lVar6 = *plVar24;
code_r0x007589dc:
          do {
            plVar16 = plVar27;
            lVar23 = *plVar16;
            lVar22 = _strchr(lVar6,0x3a);
            lVar26 = _strchr(lVar23,0x3a);
            if (lVar22 == 0) {
              uVar28 = _strlen(lVar6);
              if (lVar26 == 0) goto code_r0x00758a28;
code_r0x00758a10:
              uVar29 = lVar26 - lVar23;
            }
            else {
              uVar28 = lVar22 - lVar6;
              if (lVar26 != 0) goto code_r0x00758a10;
code_r0x00758a28:
              uVar29 = _strlen(lVar23);
            }
            uVar1 = uVar28;
            if (uVar29 <= uVar28) {
              uVar1 = uVar29;
            }
            iVar5 = _strncmp(lVar6,lVar23,uVar1);
            iVar4 = (int)uVar28 - (int)uVar29;
            if (iVar5 != 0) {
              iVar4 = iVar5;
            }
            if (0 < iVar4) {
              *plVar25 = lVar23;
              *plVar16 = lVar6;
              bVar21 = true;
              plVar27 = (long *)plVar16[1];
              plVar25 = plVar16;
              if ((long *)plVar16[1] == (long *)0x0) break;
              goto code_r0x007589dc;
            }
            plVar27 = (long *)plVar16[1];
            plVar25 = plVar16;
            lVar6 = lVar23;
          } while ((long *)plVar16[1] != (long *)0x0);
        } while (bVar21);
      }
      unaff_x28 = (undefined8 *)0xa2b5f0;
      plVar10 = plVar24;
      do {
        iVar4 = func_0x007408a0(&uStack00000000000000d0,*plVar10);
        if ((iVar4 != 0) || (iVar4 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar4 != 0))
        goto code_r0x00758a7c;
        puVar12 = (undefined1 *)_strchr(*plVar10,0x3a);
        if (puVar12 != (undefined1 *)0x0) {
          *puVar12 = 0;
        }
        if (((plVar10 != plVar24) &&
            (iVar4 = func_0x007408a0(&uStack00000000000000b0,";"), iVar4 != 0)) ||
           (iVar4 = func_0x007408a0(&uStack00000000000000b0,*plVar10), iVar4 != 0))
        goto code_r0x00758a7c;
        plVar10 = (long *)plVar10[1];
      } while (plVar10 != (long *)0x0);
    }
    else {
      pbVar11 = (byte *)_strchr(lVar6,0x3a);
      if (pbVar11 == (byte *)0x0) goto code_r0x00758a78;
      pbVar18 = pbVar11 + 0x11;
      while( true ) {
        pbVar11 = pbVar11 + 1;
        bVar2 = *pbVar11;
        if ((bVar2 != 9) && (bVar2 != 0x20)) break;
        pbVar18 = pbVar18 + 1;
      }
      if (bVar2 != 0) {
        do {
          if ((9 < bVar2 - 0x30) && (0x19 < (bVar2 & 0xdf) - 0x41)) break;
          pbVar11 = pbVar11 + 1;
          bVar2 = *pbVar11;
        } while (bVar2 != 0);
      }
      puVar12 = auStack_7ffffffe + 0x800002ae;
      if (pbVar11 == pbVar18) {
        puVar12 = auStack_7ffffffe + 0x800002be;
      }
      uVar8 = 0;
      plVar24 = (long *)0x0;
      *puVar12 = 0;
      if (plVar10 != (long *)0x0) goto code_r0x007588a4;
    }
    func_0x00779fa4(plVar24);
    if (uStack00000000000001b0 != '\0') {
      lVar6 = _strlen(&uStack00000000000001b0);
      *(undefined2 *)(auStack_7ffffffe + lVar6 + 0x800001ae) = 0xa0d;
      auStack_7ffffffe[lVar6 + 0x800001b0] = 0;
    }
    uVar9 = func_0x00758f8c();
    if ((int)uVar9 == 0) {
      uVar13 = *(undefined8 *)
                ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                unaff_x19 + 0x18);
      uVar9 = _strlen(uVar13);
      uVar9 = func_0x00759114(uVar13,uVar9,&uStack0000000000000070,0);
      if ((int)uVar9 == 0) goto code_r0x00758b20;
    }
  }
  lVar26 = 0;
  lVar23 = 0;
  lVar22 = 0;
  lVar20 = 0;
  lVar6 = 0;
code_r0x00758a9c:
  do {
    while( true ) {
      func_0x00740678(&uStack0000000000000090);
      func_0x00740678(&uStack0000000000000070);
      func_0x00740678(&uStack00000000000000d0);
      func_0x00740678(&uStack00000000000000b0);
      (*(code *)*unaff_x28)(lVar6);
      (*(code *)*unaff_x28)(lVar22);
      (*(code *)*unaff_x28)(lVar26);
      (*(code *)*unaff_x28)(lVar23);
      (*(code *)*unaff_x28)(lVar20);
      (*(code *)*unaff_x28)(uVar8);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar9;
      }
      ___stack_chk_fail();
      unaff_x19 = lVar20;
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
      lVar26 = 0;
      lVar22 = 0;
code_r0x00758a98:
      lVar23 = 0;
      lVar20 = 0;
      uVar9 = 0x1b;
    }
    lVar22 = func_0x00764704("%.*s4_request");
    if (lVar22 == 0) {
      lVar26 = 0;
      goto code_r0x00758a98;
    }
    func_0x0077e82c(lVar22,lVar22,in_stack_00000160);
    lVar26 = func_0x00764704("%s/%.*s/%.*s/%s");
    if (lVar26 == 0) goto code_r0x00758a98;
    uVar9 = _strlen(lVar6);
    iVar4 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar6,uVar9);
    if (iVar4 == 0) {
      func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
      lVar23 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
      if (lVar23 == 0) goto code_r0x00758c0c;
      func_0x0077e7f8(lVar23,in_stack_00000158,in_stack_00000160);
      lVar20 = func_0x00764704("%.*s4%s");
      if (lVar20 == 0) goto code_r0x00758c0c;
      func_0x0077e7f8(lVar20,in_stack_00000158,in_stack_00000160);
      uVar9 = _strlen(lVar20);
      uVar13 = _strlen(auStack_7ffffffe + 0x800002c6);
      uVar9 = func_0x0074edd8(&UNK_00a1f5c0,lVar20,uVar9,auStack_7ffffffe + 0x800002c6,uVar13,
                              &uStack0000000000000190);
      if ((((int)uVar9 == 0) &&
          (uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,uStack0000000000000138
                                   ,in_stack_00000140,&uStack0000000000000170), (int)uVar9 == 0)) &&
         (uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,uStack0000000000000128,
                                  in_stack_00000130,&uStack0000000000000190), (int)uVar9 == 0)) {
        uVar9 = _strlen(lVar22);
        uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar22,uVar9,
                                &uStack0000000000000170);
        if ((int)uVar9 != 0) goto code_r0x00758d9c;
        uVar9 = _strlen(lVar23);
        uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar23,uVar9,
                                &uStack0000000000000190);
        if ((int)uVar9 != 0) goto code_r0x00758d9c;
        func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
        func_0x00740a58(&uStack00000000000000b0);
        lVar14 = func_0x00764704(
                                "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                );
        if (lVar14 == 0) {
          uVar9 = 0;
          goto code_r0x00758d9c;
        }
        func_0x0077e7f8(lVar14 + 0xf,in_stack_00000158,in_stack_00000160);
        unaff_x28 = (undefined8 *)0xa2b5f0;
        (*pcRam0000000000a2b5f0)
                  (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19))
        ;
        uVar9 = 0;
        *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar14;
        *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
      }
      else {
code_r0x00758d9c:
        unaff_x28 = (undefined8 *)0xa2b5f0;
      }
    }
    else {
      lVar23 = 0;
code_r0x00758c0c:
      lVar20 = 0;
      uVar9 = 0x1b;
      unaff_x28 = (undefined8 *)0xa2b5f0;
    }
  } while( true );
}


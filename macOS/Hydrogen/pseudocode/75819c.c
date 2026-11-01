
undefined8 FUN_0075819c(void)

{
  ulong uVar1;
  byte bVar2;
  undefined1 uVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  char *pcVar7;
  undefined8 uVar8;
  long *plVar9;
  byte *pbVar10;
  undefined1 *puVar11;
  undefined8 uVar12;
  long lVar13;
  char *pcVar14;
  long *plVar15;
  char *pcVar16;
  byte *pbVar17;
  char cVar18;
  long unaff_x19;
  long lVar19;
  undefined8 uVar20;
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
  undefined8 in_stack_00000128;
  long in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  char *in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  long in_stack_00000160;
  undefined1 uStack0000000000000170;
  undefined1 uStack0000000000000190;
  undefined1 uStack00000000000001b0;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x00753fdc();
  func_0x00764560(auStack_7ffffffe + 0x800002c6,0x52,"x-%.*s-content-sha256");
  lVar6 = func_0x00782efc();
  if (lVar6 == 0) {
LAB_00758228:
    if ((((in_stack_00000160 == 3) &&
         (iVar5 = func_0x0077e76c(in_stack_00000158,"aws",3), iVar5 != 0)) &&
        (in_stack_00000130 == 2)) && (iVar5 = func_0x0077e76c(in_stack_00000128,"s3",2), iVar5 != 0)
       ) {
      uVar8 = func_0x00758e44();
      if ((int)uVar8 == 0) goto LAB_007583a8;
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
      uVar8 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar6,lVar22);
      if ((int)uVar8 == 0) {
        func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
LAB_007583a8:
        _strlen(auStack_7ffffffe + 0x8000024d);
        goto LAB_007583b8;
      }
    }
  }
  else {
    pcVar7 = (char *)_strchr(lVar6,0x3a);
    if (pcVar7 == (char *)0x0) goto LAB_00758228;
    do {
      do {
        pcVar16 = pcVar7;
        pcVar7 = pcVar16 + 1;
      } while (*pcVar7 == '\t');
    } while (*pcVar7 == ' ');
    for (lVar6 = _strlen(pcVar16 + 1);
        (lVar6 != 0 && (pcVar16[lVar6] == ' ' || pcVar16[lVar6] == '\t')); lVar6 = lVar6 + -1) {
    }
LAB_007583b8:
    uVar8 = _time(0);
    uVar8 = func_0x0076defc(uVar8,&uStack00000000000000f0);
    if ((int)uVar8 == 0) {
      lVar6 = _strftime(auStack_7ffffffe + 0x800002ae,0x11,"%Y%m%dT%H%M%SZ",&uStack00000000000000f0)
      ;
      uVar8 = in_stack_00000150;
      pcVar7 = in_stack_00000148;
      if (lVar6 == 0) {
        uVar20 = 0;
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
        uVar20 = 0;
        plVar24 = (long *)0x0;
      }
      else {
        plVar24 = (long *)0x0;
code_r0x00758494:
        if (uStack00000000000001b0 == '\0') {
          plVar9 = plVar24;
code_r0x00758550:
          plVar27 = *(long **)(unaff_x19 + 0x328);
          plVar24 = plVar9;
          if (plVar27 != (long *)0x0) {
            do {
              lVar6 = *plVar27;
              pcVar7 = (char *)_strchr(lVar6,0x3a);
              if (((pcVar7 == (char *)0x0) &&
                  (pcVar7 = (char *)_strchr(lVar6,0x3b), pcVar7 == (char *)0x0)) ||
                 ((*pcVar7 == ':' && (pcVar7[1] == '\0')))) {
code_r0x0075856c:
                plVar9 = plVar24;
              }
              else {
                lVar22 = 0;
                while (((bVar2 = pcVar7[lVar22 + 1], bVar2 == 9 || (bVar2 == 0x20)) ||
                       (bVar2 - 10 < 4))) {
                  lVar22 = lVar22 + 1;
                }
                if ((lVar22 != 0) && (bVar2 == 0)) goto code_r0x0075856c;
                lVar6 = (*pcRam0000000000a2b600)(lVar6);
                if (lVar6 == 0) {
code_r0x00758638:
                  uVar20 = 0;
                  goto code_r0x00758a7c;
                }
                pcVar7[lVar6 - *plVar27] = ':';
                plVar9 = (long *)func_0x00779d84(plVar24,lVar6);
                if (plVar9 == (long *)0x0) {
                  (*(code *)*unaff_x28)(lVar6);
                  goto code_r0x00758638;
                }
              }
              plVar27 = (long *)plVar27[1];
              plVar24 = plVar9;
            } while (plVar27 != (long *)0x0);
          }
          if (plVar9 != (long *)0x0) {
            plVar24 = plVar9;
            do {
              lVar22 = *plVar24;
              lVar6 = _strcspn(lVar22,":");
              func_0x0077e82c(lVar22,lVar22,lVar6);
              if (*(char *)(*plVar24 + lVar6) != '\0') {
                pcVar7 = (char *)(*plVar24 + lVar6) + 1;
                for (pcVar16 = pcVar7; (cVar18 = *pcVar16, cVar18 == '\t' || (cVar18 == ' '));
                    pcVar16 = pcVar16 + 1) {
                }
                while (pcVar14 = pcVar7, cVar18 != '\0') {
                  while( true ) {
                    lVar6 = 0;
                    while ((cVar18 == ' ' || (cVar18 == '\t'))) {
                      lVar22 = lVar6 + 1;
                      lVar6 = lVar6 + 1;
                      cVar18 = pcVar16[lVar22];
                    }
                    pcVar16 = pcVar16 + lVar6;
                    if ((int)lVar6 == 0) break;
                    pcVar7 = pcVar14;
                    if (cVar18 == '\0') goto code_r0x00758658;
                    pcVar7 = pcVar14 + 1;
                    *pcVar14 = ' ';
                    cVar18 = *pcVar16;
                    pcVar14 = pcVar7;
                    if (cVar18 == '\0') goto code_r0x00758658;
                  }
                  pcVar7 = pcVar14 + 1;
                  *pcVar14 = cVar18;
                  pcVar16 = pcVar16 + 1;
                  cVar18 = *pcVar16;
                }
code_r0x00758658:
                *pcVar7 = '\0';
              }
              plVar24 = (long *)plVar24[1];
            } while (plVar24 != (long *)0x0);
          }
          _strlen(unaff_x29 + -0xa8);
          lVar6 = func_0x00782efc();
          plVar24 = plVar9;
          if ((lVar6 == 0) && (lVar6 = func_0x00782efc(), lVar6 == 0)) {
            plVar9 = (long *)func_0x00779dfc(plVar9,auStack_7ffffffe + 0x800002c6);
            if (plVar9 != (long *)0x0) {
              uVar20 = func_0x00764704("%s: %s\r\n");
code_r0x007588a4:
              plVar24 = plVar9;
              plVar9 = (long *)plVar24[1];
              if (plVar9 != (long *)0x0) {
                do {
                  bVar21 = false;
                  plVar27 = plVar9;
                  plVar25 = plVar24;
                  lVar6 = *plVar24;
code_r0x007589dc:
                  do {
                    plVar15 = plVar27;
                    lVar23 = *plVar15;
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
                    iVar4 = _strncmp(lVar6,lVar23,uVar1);
                    iVar5 = (int)uVar28 - (int)uVar29;
                    if (iVar4 != 0) {
                      iVar5 = iVar4;
                    }
                    if (0 < iVar5) {
                      *plVar25 = lVar23;
                      *plVar15 = lVar6;
                      bVar21 = true;
                      plVar27 = (long *)plVar15[1];
                      plVar25 = plVar15;
                      if ((long *)plVar15[1] == (long *)0x0) break;
                      goto code_r0x007589dc;
                    }
                    plVar27 = (long *)plVar15[1];
                    plVar25 = plVar15;
                    lVar6 = lVar23;
                  } while ((long *)plVar15[1] != (long *)0x0);
                } while (bVar21);
              }
              unaff_x28 = (undefined8 *)0xa2b5f0;
              plVar9 = plVar24;
              do {
                iVar5 = func_0x007408a0(&uStack00000000000000d0,*plVar9);
                if ((iVar5 != 0) ||
                   (iVar5 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar5 != 0))
                goto code_r0x00758a7c;
                puVar11 = (undefined1 *)_strchr(*plVar9,0x3a);
                if (puVar11 != (undefined1 *)0x0) {
                  *puVar11 = 0;
                }
                if (((plVar9 != plVar24) &&
                    (iVar5 = func_0x007408a0(&uStack00000000000000b0,";"), iVar5 != 0)) ||
                   (iVar5 = func_0x007408a0(&uStack00000000000000b0,*plVar9), iVar5 != 0))
                goto code_r0x00758a7c;
                plVar9 = (long *)plVar9[1];
              } while (plVar9 != (long *)0x0);
              goto code_r0x0075893c;
            }
          }
          else {
            pbVar10 = (byte *)_strchr(lVar6,0x3a);
            if (pbVar10 != (byte *)0x0) {
              pbVar17 = pbVar10 + 0x11;
              while( true ) {
                pbVar10 = pbVar10 + 1;
                bVar2 = *pbVar10;
                if ((bVar2 != 9) && (bVar2 != 0x20)) break;
                pbVar17 = pbVar17 + 1;
              }
              if (bVar2 != 0) {
                do {
                  if ((9 < bVar2 - 0x30) && (0x19 < (bVar2 & 0xdf) - 0x41)) break;
                  pbVar10 = pbVar10 + 1;
                  bVar2 = *pbVar10;
                } while (bVar2 != 0);
              }
              puVar11 = auStack_7ffffffe + 0x800002ae;
              if (pbVar10 == pbVar17) {
                puVar11 = auStack_7ffffffe + 0x800002be;
              }
              uVar20 = 0;
              plVar24 = (long *)0x0;
              *puVar11 = 0;
              if (plVar9 != (long *)0x0) goto code_r0x007588a4;
code_r0x0075893c:
              func_0x00779fa4(plVar24);
              if (uStack00000000000001b0 != '\0') {
                lVar6 = _strlen(&uStack00000000000001b0);
                *(undefined2 *)(auStack_7ffffffe + lVar6 + 0x800001ae) = 0xa0d;
                auStack_7ffffffe[lVar6 + 0x800001b0] = 0;
              }
              uVar8 = func_0x00758f8c();
              if ((int)uVar8 == 0) {
                uVar12 = *(undefined8 *)
                          ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                          unaff_x19 + 0x18);
                uVar8 = _strlen(uVar12);
                uVar8 = func_0x00759114(uVar12,uVar8,&uStack0000000000000070,0);
                if ((int)uVar8 == 0) goto code_r0x00758b20;
              }
              goto code_r0x007583d4;
            }
          }
        }
        else {
          plVar9 = (long *)func_0x00779dfc(plVar24,&uStack00000000000001b0);
          if (plVar9 != (long *)0x0) goto code_r0x00758550;
        }
        uVar20 = 0;
      }
code_r0x00758a7c:
      func_0x00779fa4(plVar24);
code_r0x00758a84:
      lVar26 = 0;
      lVar22 = 0;
      lVar6 = 0;
      goto code_r0x00758a98;
    }
  }
  uVar20 = 0;
code_r0x007583d4:
  lVar26 = 0;
  lVar23 = 0;
  lVar22 = 0;
  lVar19 = 0;
  lVar6 = 0;
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
      (*(code *)*unaff_x28)(lVar19);
      (*(code *)*unaff_x28)(uVar20);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
        return uVar8;
      }
      ___stack_chk_fail();
      unaff_x19 = lVar19;
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
      lVar19 = 0;
      uVar8 = 0x1b;
    }
    lVar22 = func_0x00764704("%.*s4_request");
    if (lVar22 == 0) {
      lVar26 = 0;
      goto code_r0x00758a98;
    }
    func_0x0077e82c(lVar22,lVar22,in_stack_00000160);
    lVar26 = func_0x00764704("%s/%.*s/%.*s/%s");
    if (lVar26 == 0) goto code_r0x00758a98;
    uVar8 = _strlen(lVar6);
    iVar5 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar6,uVar8);
    if (iVar5 == 0) {
      func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
      lVar23 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
      if (lVar23 == 0) goto code_r0x00758c0c;
      func_0x0077e7f8(lVar23,in_stack_00000158,in_stack_00000160);
      lVar19 = func_0x00764704("%.*s4%s");
      if (lVar19 == 0) goto code_r0x00758c0c;
      func_0x0077e7f8(lVar19,in_stack_00000158,in_stack_00000160);
      uVar8 = _strlen(lVar19);
      uVar12 = _strlen(auStack_7ffffffe + 0x800002c6);
      uVar8 = func_0x0074edd8(&UNK_00a1f5c0,lVar19,uVar8,auStack_7ffffffe + 0x800002c6,uVar12,
                              &uStack0000000000000190);
      if ((((int)uVar8 == 0) &&
          (uVar8 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,in_stack_00000138,
                                   in_stack_00000140,&uStack0000000000000170), (int)uVar8 == 0)) &&
         (uVar8 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,in_stack_00000128,
                                  in_stack_00000130,&uStack0000000000000190), (int)uVar8 == 0)) {
        uVar8 = _strlen(lVar22);
        uVar8 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar22,uVar8,
                                &uStack0000000000000170);
        if ((int)uVar8 != 0) goto code_r0x00758d9c;
        uVar8 = _strlen(lVar23);
        uVar8 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar23,uVar8,
                                &uStack0000000000000190);
        if ((int)uVar8 != 0) goto code_r0x00758d9c;
        func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41);
        func_0x00740a58(&uStack00000000000000b0);
        lVar13 = func_0x00764704(
                                "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                );
        if (lVar13 == 0) {
          uVar8 = 0;
          goto code_r0x00758d9c;
        }
        func_0x0077e7f8(lVar13 + 0xf,in_stack_00000158,in_stack_00000160);
        unaff_x28 = (undefined8 *)0xa2b5f0;
        (*pcRam0000000000a2b5f0)
                  (*(undefined8 *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19))
        ;
        uVar8 = 0;
        *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) = lVar13;
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
      lVar19 = 0;
      uVar8 = 0x1b;
      unaff_x28 = (undefined8 *)0xa2b5f0;
    }
  } while( true );
}


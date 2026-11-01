
undefined8 FUN_007586f0(byte *param_1)

{
  ulong uVar1;
  byte bVar2;
  long *plVar3;
  undefined1 in_ZR;
  int iVar4;
  int iVar5;
  long lVar6;
  long *plVar7;
  undefined1 *puVar8;
  undefined8 uVar9;
  long lVar10;
  byte *pbVar11;
  long *plVar12;
  long *plVar13;
  byte *in_x9;
  byte *pbVar14;
  uint in_w10;
  long in_x11;
  long lVar15;
  long unaff_x19;
  undefined8 uVar16;
  bool bVar17;
  long lVar18;
  long *unaff_x23;
  undefined8 uVar19;
  long *plVar20;
  long lVar21;
  long lVar22;
  long *unaff_x26;
  ulong uVar23;
  ulong uVar24;
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
  
  while( true ) {
    pbVar11 = param_1;
    if ((bool)in_ZR) goto LAB_007586d8;
    in_x9 = in_x9 + in_x11;
    if ((int)in_x11 != 0) break;
    pbVar11 = param_1 + 1;
    *param_1 = (byte)in_w10;
    in_x9 = in_x9 + 1;
    in_w10 = (uint)*in_x9;
    if (*in_x9 == 0) goto LAB_00758658;
LAB_007586d0:
    in_x11 = 0;
    while (in_w10 == 0x20) {
LAB_007586d8:
      lVar6 = in_x11 + 1;
      in_x11 = in_x11 + 1;
      in_w10 = (uint)in_x9[lVar6];
    }
    in_ZR = in_w10 == 9;
    param_1 = pbVar11;
  }
  if (in_w10 != 0) {
    pbVar11 = param_1 + 1;
    *param_1 = 0x20;
    in_w10 = (uint)*in_x9;
    if (in_w10 != 0) goto LAB_007586d0;
  }
LAB_00758658:
  *pbVar11 = 0;
  while (unaff_x26 = (long *)unaff_x26[1], unaff_x26 != (long *)0x0) {
    lVar21 = *unaff_x26;
    lVar6 = _strcspn(lVar21);
    func_0x0077e82c(lVar21,lVar21,lVar6);
    if (*(char *)(*unaff_x26 + lVar6) != '\0') goto code_r0x00758698;
  }
  _strlen(unaff_x29 + -0xa8);
  lVar6 = func_0x00782efc();
  if ((lVar6 == 0) && (lVar6 = func_0x00782efc(), lVar6 == 0)) {
    plVar7 = (long *)func_0x00779dfc();
    if (plVar7 != (long *)0x0) {
      uVar16 = func_0x00764704("%s: %s\r\n");
      unaff_x23 = plVar7;
      goto LAB_007588a4;
    }
  }
  else {
    pbVar11 = (byte *)_strchr(lVar6,0x3a);
    if (pbVar11 != (byte *)0x0) {
      pbVar14 = pbVar11 + 0x11;
      while( true ) {
        pbVar11 = pbVar11 + 1;
        bVar2 = *pbVar11;
        if ((bVar2 != 9) && (bVar2 != 0x20)) break;
        pbVar14 = pbVar14 + 1;
      }
      if (bVar2 != 0) {
        do {
          if ((9 < bVar2 - 0x30) && (0x19 < (bVar2 & 0xdf) - 0x41)) break;
          pbVar11 = pbVar11 + 1;
          bVar2 = *pbVar11;
        } while (bVar2 != 0);
      }
      puVar8 = auStack_7ffffffe + 0x800002ae;
      if (pbVar11 == pbVar14) {
        puVar8 = auStack_7ffffffe + 0x800002be;
      }
      uVar16 = 0;
      plVar7 = (long *)0x0;
      *puVar8 = 0;
      if (unaff_x23 == (long *)0x0) goto LAB_0075893c;
LAB_007588a4:
      plVar7 = unaff_x23;
      plVar12 = (long *)plVar7[1];
      if (plVar12 != (long *)0x0) {
        do {
          bVar17 = false;
          plVar3 = plVar12;
          plVar20 = plVar7;
          lVar6 = *plVar7;
code_r0x007589dc:
          do {
            plVar13 = plVar3;
            lVar18 = *plVar13;
            lVar21 = _strchr(lVar6,0x3a);
            lVar22 = _strchr(lVar18,0x3a);
            if (lVar21 == 0) {
              uVar23 = _strlen(lVar6);
              if (lVar22 != 0) goto code_r0x00758a10;
code_r0x00758a28:
              uVar24 = _strlen(lVar18);
            }
            else {
              uVar23 = lVar21 - lVar6;
              if (lVar22 == 0) goto code_r0x00758a28;
code_r0x00758a10:
              uVar24 = lVar22 - lVar18;
            }
            uVar1 = uVar23;
            if (uVar24 <= uVar23) {
              uVar1 = uVar24;
            }
            iVar4 = _strncmp(lVar6,lVar18,uVar1);
            iVar5 = (int)uVar23 - (int)uVar24;
            if (iVar4 != 0) {
              iVar5 = iVar4;
            }
            if (iVar5 < 1) {
              plVar3 = (long *)plVar13[1];
              plVar20 = plVar13;
              lVar6 = lVar18;
              if ((long *)plVar13[1] == (long *)0x0) break;
              goto code_r0x007589dc;
            }
            *plVar20 = lVar18;
            *plVar13 = lVar6;
            bVar17 = true;
            plVar3 = (long *)plVar13[1];
            plVar20 = plVar13;
          } while ((long *)plVar13[1] != (long *)0x0);
        } while (bVar17);
      }
      unaff_x28 = (undefined8 *)0xa2b5f0;
      plVar12 = plVar7;
      while( true ) {
        iVar5 = func_0x007408a0(&uStack00000000000000d0,*plVar12);
        unaff_x23 = plVar7;
        if ((iVar5 != 0) || (iVar5 = func_0x007408a0(&uStack00000000000000d0,"\n"), iVar5 != 0))
        break;
        puVar8 = (undefined1 *)_strchr(*plVar12,0x3a);
        if (puVar8 != (undefined1 *)0x0) {
          *puVar8 = 0;
        }
        if (((plVar12 != plVar7) &&
            (iVar5 = func_0x007408a0(&uStack00000000000000b0,";"), iVar5 != 0)) ||
           (iVar5 = func_0x007408a0(&uStack00000000000000b0,*plVar12), iVar5 != 0)) break;
        plVar12 = (long *)plVar12[1];
        if (plVar12 == (long *)0x0) {
LAB_0075893c:
          func_0x00779fa4(plVar7);
          if (uStack00000000000001b0 != '\0') {
            lVar6 = _strlen(&uStack00000000000001b0);
            *(undefined2 *)(auStack_7ffffffe + lVar6 + 0x800001ae) = 0xa0d;
            auStack_7ffffffe[lVar6 + 0x800001b0] = 0;
          }
          uVar9 = func_0x00758f8c();
          if ((int)uVar9 == 0) {
            uVar19 = *(undefined8 *)
                      ("/System/Library/Frameworks/Foundation.framework/Versions/C/Foundation" +
                      unaff_x19 + 0x18);
            uVar9 = _strlen(uVar19);
            uVar9 = func_0x00759114(uVar19,uVar9,&uStack0000000000000070,0);
            if ((int)uVar9 == 0) goto code_r0x00758b20;
          }
          lVar22 = 0;
          lVar18 = 0;
          lVar21 = 0;
          lVar15 = 0;
          lVar6 = 0;
          goto code_r0x00758a9c;
        }
      }
code_r0x00758a7c:
      func_0x00779fa4(unaff_x23);
      lVar22 = 0;
      lVar21 = 0;
      lVar6 = 0;
code_r0x00758a98:
      lVar18 = 0;
      lVar15 = 0;
      uVar9 = 0x1b;
code_r0x00758a9c:
      do {
        func_0x00740678(&uStack0000000000000090);
        func_0x00740678(&uStack0000000000000070);
        func_0x00740678(&uStack00000000000000d0);
        func_0x00740678(&uStack00000000000000b0);
        (*(code *)*unaff_x28)(lVar6);
        (*(code *)*unaff_x28)(lVar21);
        (*(code *)*unaff_x28)(lVar22);
        (*(code *)*unaff_x28)(lVar18);
        (*(code *)*unaff_x28)(lVar15);
        (*(code *)*unaff_x28)(uVar16);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
          return uVar9;
        }
        ___stack_chk_fail();
        unaff_x19 = lVar15;
code_r0x00758b20:
        func_0x00740a58(&uStack0000000000000070);
        lVar6 = func_0x00740a58(&uStack0000000000000090);
        if (lVar6 != 0) {
          func_0x00740a58(&uStack0000000000000090);
        }
        func_0x00740a58(&uStack00000000000000d0);
        func_0x00740a58(&uStack00000000000000b0);
        lVar6 = func_0x00764704("%s\n%s\n%s\n%s\n%s\n%.*s");
        if (lVar6 == 0) {
          lVar22 = 0;
          lVar21 = 0;
          goto code_r0x00758a98;
        }
        lVar21 = func_0x00764704("%.*s4_request");
        if (lVar21 == 0) {
          lVar22 = 0;
          goto code_r0x00758a98;
        }
        func_0x0077e82c(lVar21,lVar21,in_stack_00000160);
        lVar22 = func_0x00764704("%s/%.*s/%.*s/%s");
        if (lVar22 == 0) goto code_r0x00758a98;
        uVar9 = _strlen(lVar6);
        iVar5 = func_0x00779834(auStack_7ffffffe + 0x8000028e,lVar6,uVar9);
        if (iVar5 == 0) {
          func_0x00742a8c(auStack_7ffffffe + 0x8000028e,0x20,auStack_7ffffffe + 0x8000024d,0x41);
          lVar18 = func_0x00764704("%.*s4-HMAC-SHA256\n%s\n%s\n%s");
          if (lVar18 != 0) {
            func_0x0077e7f8(lVar18,in_stack_00000158,in_stack_00000160);
            lVar15 = func_0x00764704("%.*s4%s");
            if (lVar15 != 0) {
              func_0x0077e7f8(lVar15,in_stack_00000158,in_stack_00000160);
              uVar9 = _strlen(lVar15);
              uVar19 = _strlen(auStack_7ffffffe + 0x800002c6);
              uVar9 = func_0x0074edd8(&UNK_00a1f5c0,lVar15,uVar9,auStack_7ffffffe + 0x800002c6,
                                      uVar19,&uStack0000000000000190);
              if ((((int)uVar9 == 0) &&
                  (uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,
                                           in_stack_00000138,in_stack_00000140,
                                           &uStack0000000000000170), (int)uVar9 == 0)) &&
                 (uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,
                                          in_stack_00000128,in_stack_00000130,
                                          &uStack0000000000000190), (int)uVar9 == 0)) {
                uVar9 = _strlen(lVar21);
                uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000190,0x20,lVar21,uVar9,
                                        &uStack0000000000000170);
                if ((int)uVar9 == 0) {
                  uVar9 = _strlen(lVar18);
                  uVar9 = func_0x0074edd8(&UNK_00a1f5c0,&uStack0000000000000170,0x20,lVar18,uVar9,
                                          &uStack0000000000000190);
                  if ((int)uVar9 == 0) {
                    func_0x00742a8c(&uStack0000000000000190,0x20,auStack_7ffffffe + 0x8000024d,0x41)
                    ;
                    func_0x00740a58(&uStack00000000000000b0);
                    lVar10 = func_0x00764704(
                                            "Authorization: %.*s4-HMAC-SHA256 Credential=%s/%s, SignedHeaders=%s, Signature=%s\r\n%s%s"
                                            );
                    if (lVar10 != 0) {
                      func_0x0077e7f8(lVar10 + 0xf,in_stack_00000158,in_stack_00000160);
                      unaff_x28 = (undefined8 *)0xa2b5f0;
                      (*pcRam0000000000a2b5f0)
                                (*(undefined8 *)
                                  ((long)&dylib_command_000012d0.dylib.current_version + unaff_x19))
                      ;
                      uVar9 = 0;
                      *(long *)((long)&dylib_command_000012d0.dylib.current_version + unaff_x19) =
                           lVar10;
                      *(byte *)(unaff_x19 + 0xcf8) = *(byte *)(unaff_x19 + 0xcf8) | 1;
                      goto code_r0x00758a9c;
                    }
                    uVar9 = 0;
                  }
                }
              }
              unaff_x28 = (undefined8 *)0xa2b5f0;
              goto code_r0x00758a9c;
            }
          }
        }
        else {
          lVar18 = 0;
        }
        lVar15 = 0;
        uVar9 = 0x1b;
        unaff_x28 = (undefined8 *)0xa2b5f0;
      } while( true );
    }
  }
  uVar16 = 0;
  goto code_r0x00758a7c;
code_r0x00758698:
  pbVar11 = (byte *)((char *)(*unaff_x26 + lVar6) + 1);
  in_x9 = pbVar11;
  while( true ) {
    bVar2 = *in_x9;
    in_w10 = (uint)bVar2;
    if ((bVar2 != 9) && (bVar2 != 0x20)) break;
    in_x9 = in_x9 + 1;
  }
  if (bVar2 != 0) goto LAB_007586d0;
  goto LAB_00758658;
}


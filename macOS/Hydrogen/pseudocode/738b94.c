
/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_00738b94(void)

{
  char cVar1;
  bool bVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  char *pcVar13;
  byte bVar14;
  char cVar15;
  byte in_w8;
  long lVar16;
  long unaff_x19;
  ulong uVar17;
  char *unaff_x23;
  long lVar18;
  char *unaff_x25;
  ulong uVar19;
  char *pcVar20;
  long unaff_x29;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  ulong in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  ulong in_stack_00000080;
  undefined1 uStack0000000000000088;
  
code_r0x00738b94:
  *(byte *)(unaff_x19 + 0x74) = in_w8 | 1;
  pcVar13 = unaff_x23 + 1;
  cVar15 = *unaff_x23;
  pcVar20 = pcVar13;
  if (cVar15 == ' ' || cVar15 == '\t') goto LAB_00738918;
LAB_0073892c:
  while (pcVar20 = pcVar13, cVar15 == ';') {
    for (; cVar15 = *pcVar20, cVar15 == ' ' || cVar15 == '\t'; pcVar20 = pcVar20 + 1) {
    }
    uVar6 = _strcspn(pcVar20,";\t\r\n=");
    if (uVar6 != 0) {
      unaff_x23 = pcVar20 + uVar6;
      uVar17 = uVar6;
      do {
        if (pcVar20[uVar17 - 1] != ' ' && pcVar20[uVar17 - 1] != '\t') break;
        uVar17 = uVar17 - 1;
      } while (uVar17 != 0);
      cVar1 = *unaff_x23;
      if (cVar1 == '=') {
        pcVar13 = pcVar20 + uVar6 + 1;
        uVar7 = _strcspn(pcVar13,";\r\n");
        if (uVar7 == 0) {
          uVar19 = 0;
        }
        else {
          uVar19 = uVar7;
          do {
            if ((pcVar20[uVar19 + uVar6] != '\t') && (pcVar20[uVar19 + uVar6] != ' '))
            goto code_r0x00738708;
            uVar19 = uVar19 - 1;
          } while (uVar19 != 0);
        }
        goto code_r0x00738754;
      }
      pcVar13 = (char *)0x0;
      uVar19 = 0;
      goto code_r0x00738770;
    }
    pcVar13 = pcVar20 + 1;
    cVar15 = *pcVar20;
    pcVar20 = pcVar13;
    if (cVar15 == ' ' || cVar15 == '\t') goto LAB_00738918;
  }
  if (*(long *)(unaff_x19 + 0x60) == 0 && unaff_x25 != (char *)0x0) {
    lVar9 = (*pcRam0000000000a2b600)(unaff_x25);
    *(long *)(unaff_x19 + 0x60) = lVar9;
    if (lVar9 == 0) goto LAB_00739500;
  }
  if ((in_stack_00000060 != 0) && (*(long *)(unaff_x19 + 0x50) == 0)) {
    lVar9 = _strchr(in_stack_00000060,0x3f);
    if (lVar9 == 0) {
      lVar9 = _strrchr(in_stack_00000060,0x2f);
    }
    else {
      lVar9 = func_0x0073abd0(in_stack_00000060,0x2f,lVar9 - in_stack_00000060);
    }
    if (lVar9 != 0) {
      lVar9 = func_0x0077e93c(in_stack_00000060,(lVar9 - in_stack_00000060) + 1);
      *(long *)(unaff_x19 + 0x50) = lVar9;
      if (lVar9 == 0) goto LAB_00739500;
      lVar9 = func_0x0073a3d0();
      *(long *)(unaff_x19 + 0x58) = lVar9;
      if (lVar9 == 0) goto LAB_00739500;
    }
  }
  if (*(long *)(unaff_x19 + 0x40) == 0) goto LAB_00739500;
  *(char *)(in_stack_00000070 + 0x1c0) = *(char *)(in_stack_00000070 + 0x1c0) + '\x01';
  bVar14 = *(byte *)(unaff_x19 + 0x74);
  if ((((bVar14 & 0x12) == 0x10) ||
      (((bVar14 >> 5 & 1) != 0 &&
       (((((bVar14 >> 1 & 1) == 0 || (*(long *)(unaff_x19 + 0x50) == 0)) ||
         (iVar5 = _strcmp(*(long *)(unaff_x19 + 0x50),"/"), (bVar14 & 1) != 0)) || (iVar5 != 0))))))
     || (((*(byte *)(in_stack_00000078 + 0x7f0) & 3) == 2 && (*(long *)(unaff_x19 + 0x68) == 0))))
  goto LAB_00739500;
  *(byte *)(unaff_x19 + 0x74) = (*(byte *)(in_stack_00000078 + 0x7f0) & 1) << 2 | bVar14 & 0xfb;
  iVar5 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
  *(int *)(in_stack_00000078 + 0x7ec) = iVar5;
  *(int *)(unaff_x19 + 0x70) = iVar5;
  if ((in_stack_00000068 & 0x100000000) == 0) goto SUB_007395bc;
  lVar9 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
  lVar9 = func_0x00740a58(in_stack_00000078 + lVar9 * 0x20);
  if (lVar9 == 0) {
    bVar2 = false;
    goto LAB_0073943c;
  }
  bVar2 = false;
  lVar18 = 0;
  goto LAB_00739200;
  while( true ) {
    pcVar13 = pcVar13 + 1;
    uVar19 = uVar19 - 1;
    if (uVar19 == 0) break;
code_r0x00738708:
    if (*pcVar13 != ' ' && *pcVar13 != '\t') break;
  }
code_r0x00738754:
  lVar9 = _memchr(pcVar13,9,uVar19);
  if (lVar9 != 0) {
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
    pcVar13 = "cookie contains TAB, dropping";
    goto LAB_00739104;
  }
  unaff_x23 = pcVar20 + uVar7 + uVar6 + 1;
code_r0x00738770:
  if (((0xffe < uVar17) || (0xffe < uVar19)) || (0x1000 < uVar19 + uVar17)) {
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
    pcVar13 = "oversized cookie dropped, name/val %zu + %zu bytes";
    goto LAB_00739104;
  }
  if (((cVar15 == '_') && (6 < uVar17)) && (pcVar20[1] == '_')) {
    iVar5 = func_0x0077e76c("__Secure-",pcVar20,9);
    if (iVar5 == 0) {
      iVar5 = func_0x0077e76c("__Host-",pcVar20,7);
      if (iVar5 == 0) goto code_r0x007387f0;
      bVar14 = 0x20;
    }
    else {
      bVar14 = 0x10;
    }
    *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | bVar14;
  }
code_r0x007387f0:
  if (*(long *)(unaff_x19 + 0x40) == 0) {
    if (cVar1 != '=') goto LAB_00739500;
    (*pcRam0000000000a2b5f0)(0);
    uVar8 = func_0x0077e93c(pcVar20,uVar17);
    *(undefined8 *)(unaff_x19 + 0x40) = uVar8;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
    lVar9 = func_0x0077e93c(pcVar13,uVar19);
    *(long *)(unaff_x19 + 0x48) = lVar9;
    lVar18 = *(long *)(unaff_x19 + 0x40);
    if ((lVar18 == 0) || (lVar9 == 0)) goto LAB_00739500;
    lVar10 = _strcspn(lVar9,&UNK_008ccd96);
    if ((*(char *)(lVar9 + lVar10) != '\0') ||
       (lVar9 = _strcspn(lVar18,&UNK_008ccd96), *(char *)(lVar18 + lVar9) != '\0')) {
      if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    in_stack_00000070 + 0x18) != 0 &&
          (*(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
      pcVar13 = "invalid octets in name/value, cookie dropped";
      goto LAB_00739104;
    }
  }
  else {
    if (uVar19 == 0) {
      if (uVar17 == 8) {
        iVar5 = func_0x0077e76c("httponly",pcVar20,8);
        if (iVar5 != 0) {
          *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 8;
          pcVar13 = unaff_x23 + 1;
          cVar15 = *unaff_x23;
          pcVar20 = pcVar13;
          if (cVar15 != ' ' && cVar15 != '\t') goto LAB_0073892c;
          goto LAB_00738918;
        }
      }
      else if ((uVar17 == 6) && (iVar5 = func_0x0077e76c("secure",pcVar20,6), iVar5 != 0)) {
        if (((in_stack_00000080 & 0x100000000) == 0) &&
           ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) goto LAB_00739500;
        *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 2;
        pcVar13 = unaff_x23 + 1;
        cVar15 = *unaff_x23;
        pcVar20 = pcVar13;
        if (cVar15 != ' ' && cVar15 != '\t') goto LAB_0073892c;
        goto LAB_00738918;
      }
      if (cVar1 != '=') goto code_r0x00738904;
    }
    if (uVar17 == 7) {
      iVar5 = func_0x0077e76c("version",pcVar20,7);
      if (iVar5 == 0) {
        iVar5 = func_0x0077e76c("max-age",pcVar20,7);
        if (iVar5 == 0) {
          iVar5 = func_0x0077e76c("expires",pcVar20,7);
          if (((iVar5 == 0) || (0x4f < uVar19)) || (*in_stack_00000050 != 0)) goto code_r0x00738904;
          ___memcpy_chk(&uStack0000000000000088,pcVar13,uVar19,0x51);
          (&uStack0000000000000088)[uVar19] = 0;
          lVar9 = func_0x0076de98(&uStack0000000000000088);
          *in_stack_00000050 = lVar9;
          if (lVar9 == 0) {
            lVar9 = 1;
code_r0x00738c84:
            *in_stack_00000050 = lVar9;
          }
          else if (lVar9 < 0) {
            lVar9 = 0;
            goto code_r0x00738c84;
          }
          if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto code_r0x00738904;
        }
        else {
          if (*pcVar13 == '\"') {
            pcVar13 = pcVar13 + 1;
          }
          iVar5 = func_0x0077ed9c(pcVar13,0,10,in_stack_00000050);
          if (iVar5 == 0) {
            lVar9 = *in_stack_00000050;
            if (lVar9 == 0) {
code_r0x00738c44:
              lVar18 = 1;
            }
            else {
              lVar18 = 0x7fffffffffffffff;
              if (lVar9 <= in_stack_00000038) {
                lVar18 = lVar9 + in_stack_00000058;
              }
            }
code_r0x00738c50:
            *in_stack_00000050 = lVar18;
          }
          else {
            if (iVar5 == 1) {
              lVar18 = 0x7fffffffffffffff;
              goto code_r0x00738c50;
            }
            if (iVar5 == 2) goto code_r0x00738c44;
          }
          if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto code_r0x00738904;
          lVar9 = *in_stack_00000050;
        }
        if (in_stack_00000048 < lVar9) {
          *in_stack_00000050 = in_stack_00000040;
          pcVar13 = unaff_x23 + 1;
          cVar15 = *unaff_x23;
          pcVar20 = pcVar13;
          if (cVar15 != ' ' && cVar15 != '\t') goto LAB_0073892c;
          goto LAB_00738918;
        }
      }
    }
    else if (uVar17 == 6) {
      iVar5 = func_0x0077e76c("domain",pcVar20,6);
      if ((uVar19 != 0) && (iVar5 != 0)) {
        pcVar20 = pcVar13;
        if (*pcVar13 == '.') {
          pcVar20 = pcVar13 + 1;
        }
        uVar19 = uVar19 - (*pcVar13 == '.');
        if (((uVar19 == 9) && (iVar5 = func_0x0077e76c(pcVar20,"localhost",9), iVar5 != 0)) ||
           ((lVar9 = _memchr(pcVar20,0x2e,uVar19), lVar9 != 0 &&
            ((char *)0x1 < pcVar20 + (uVar19 - lVar9))))) {
          pcVar13 = pcVar20;
          if (unaff_x25 != (char *)0x0) {
            pcVar13 = unaff_x25;
          }
          uVar4 = func_0x0074f6ec(pcVar13);
          if (unaff_x25 != (char *)0x0) {
            if (uVar4 == 0) goto code_r0x00738b1c;
            goto code_r0x00738a90;
          }
        }
        else {
          unaff_x25 = ":";
          uVar6 = func_0x0074f6ec(":");
          if ((uVar6 & 1) == 0) {
code_r0x00738b1c:
            uVar6 = _strlen(unaff_x25);
            if (uVar6 < uVar19) {
code_r0x007394ec:
              if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
                 ((*(long *)(
                            "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                            + in_stack_00000070 + 0x18) != 0 &&
                  (*(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
              pcVar13 = "skipped cookie with bad tailmatch domain: %s";
              goto LAB_00739104;
            }
            iVar5 = func_0x0077e76c(pcVar20,unaff_x25 + (uVar6 - uVar19),uVar19);
            if ((iVar5 == 0) || ((uVar6 != uVar19 && ((unaff_x25 + (uVar6 - uVar19))[-1] != '.'))))
            goto code_r0x007394ec;
            uVar4 = 0;
          }
          else {
code_r0x00738a90:
            iVar5 = _strncmp(pcVar20,unaff_x25,uVar19);
            if ((iVar5 != 0) || (uVar6 = _strlen(unaff_x25), uVar19 != uVar6))
            goto code_r0x007394ec;
            uVar4 = 1;
          }
        }
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
        lVar9 = func_0x0077e93c(pcVar20,uVar19);
        *(long *)(unaff_x19 + 0x60) = lVar9;
        if ((lVar9 != 0) && ((uVar4 & 1) == 0)) goto code_r0x00738b90;
        goto joined_r0x00738bb4;
      }
    }
    else if ((uVar17 == 4) && (iVar5 = func_0x0077e76c("path",pcVar20,4), iVar5 != 0)) {
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
      lVar9 = func_0x0077e93c(pcVar13,uVar19);
      *(long *)(unaff_x19 + 0x50) = lVar9;
      if (lVar9 == 0) goto LAB_00739500;
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
      lVar9 = func_0x0073a3d0(*(undefined8 *)(unaff_x19 + 0x50));
      *(long *)(unaff_x19 + 0x58) = lVar9;
joined_r0x00738bb4:
      if (lVar9 == 0) goto LAB_00739500;
    }
  }
code_r0x00738904:
  pcVar13 = unaff_x23 + 1;
  cVar15 = *unaff_x23;
  pcVar20 = pcVar13;
  if (cVar15 != ' ' && cVar15 != '\t') goto LAB_0073892c;
LAB_00738918:
  do {
    pcVar13 = pcVar20 + 1;
    cVar15 = *pcVar20;
    pcVar20 = pcVar13;
  } while (cVar15 == ' ' || cVar15 == '\t');
  goto LAB_0073892c;
code_r0x00738b90:
  in_w8 = *(byte *)(unaff_x19 + 0x74);
  goto code_r0x00738b94;
LAB_00739200:
  lVar10 = func_0x00156654(lVar9);
  iVar5 = _strcmp(*(undefined8 *)(lVar10 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
  if (iVar5 == 0) {
    if (*(long *)(lVar10 + 0x60) == 0) {
      if (*(long *)(unaff_x19 + 0x60) == 0) goto LAB_0073927c;
    }
    else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar5 = func_0x0077e6f8(), iVar5 != 0)) {
LAB_0073927c:
      lVar11 = *(long *)(lVar10 + 0x58);
      if (((lVar11 != 0) &&
          (((lVar12 = *(long *)(unaff_x19 + 0x58), lVar12 != 0 &&
            ((*(byte *)(lVar10 + 0x74) >> 1 & 1) != 0)) &&
           ((*(byte *)(unaff_x19 + 0x74) >> 1 & 1) == 0)))) &&
         ((in_stack_00000080 & 0x100000000) == 0)) {
        lVar16 = _strchr(lVar11 + 1,0x2f);
        if (lVar16 == 0) {
          lVar16 = _strlen(lVar11);
        }
        else {
          lVar16 = lVar16 - lVar11;
        }
        iVar5 = func_0x0077e76c(lVar11,lVar12,lVar16);
        if (iVar5 != 0) {
          if (((in_stack_00000070 != 0) && (*(char *)(in_stack_00000070 + 0xa1d) < '\0')) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + in_stack_00000070 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + in_stack_00000070 + 0x18) + 8))))) {
            pcVar13 = "cookie \'%s\' for domain \'%s\' dropped, would overlay an existing cookie";
LAB_00739104:
            func_0x0073cab8(in_stack_00000070,pcVar13);
          }
LAB_00739500:
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x40));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
          (*pcRam0000000000a2b5f0)();
          unaff_x19 = 0;
          goto LAB_00739554;
        }
      }
    }
  }
  if (lVar18 == 0) {
    iVar5 = _strcmp(*(undefined8 *)(lVar10 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
    if (iVar5 == 0) {
      if (*(long *)(lVar10 + 0x60) == 0) {
        bVar3 = *(long *)(unaff_x19 + 0x60) == 0;
LAB_007392c8:
        if (bVar3 || bVar2) {
LAB_007392d4:
          if (*(long *)(lVar10 + 0x58) == 0) {
            if (*(long *)(unaff_x19 + 0x58) == 0) goto LAB_0073930c;
          }
          else if (((*(long *)(unaff_x19 + 0x58) != 0) && (iVar5 = func_0x0077e6f8(), iVar5 != 0))
                  && ((*(long *)(lVar10 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
LAB_0073930c:
            if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
               ((*(byte *)(lVar10 + 0x74) >> 2 & 1) == 0)) {
              bVar2 = true;
              lVar18 = lVar9;
              goto LAB_007391f0;
            }
            goto LAB_00739500;
          }
        }
      }
      else {
        if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar5 = func_0x0077e6f8(), iVar5 != 0)) {
          bVar3 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar10 + 0x74)) & 1) == 0;
          goto LAB_007392c8;
        }
        if (bVar2) goto LAB_007392d4;
      }
      lVar18 = 0;
      bVar2 = false;
    }
    else {
      lVar18 = 0;
    }
  }
LAB_007391f0:
  lVar9 = func_0x006f4058(lVar9);
  if (lVar9 == 0) goto LAB_007393bc;
  goto LAB_00739200;
LAB_007393bc:
  if (lVar18 != 0) {
    lVar9 = func_0x00156654(lVar18);
    *(undefined4 *)(unaff_x19 + 0x70) = *(undefined4 *)(lVar9 + 0x70);
    func_0x0075e5fc(lVar18);
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x60));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x50));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x58));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x40));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x48));
    (*pcRam0000000000a2b5f0)(lVar9);
  }
LAB_0073943c:
  lVar9 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
  func_0x0075e474(in_stack_00000078 + lVar9 * 0x20);
  if (((in_stack_00000070 != 0) && ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) &&
     ((*(char *)(in_stack_00000070 + 0xa1d) < '\0' &&
      ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 in_stack_00000070 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + in_stack_00000070 + 0x18) + 8))))))) {
    func_0x0073cab8(in_stack_00000070,"%s cookie %s=\"%s\" for domain %s, path %s, expire %ld");
  }
  if (!bVar2) {
    *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + 1;
  }
  lVar9 = *(long *)(unaff_x19 + 0x68);
  if ((lVar9 != 0) && (lVar9 < *(long *)(in_stack_00000078 + 0x7e0))) {
    *(long *)(in_stack_00000078 + 0x7e0) = lVar9;
  }
LAB_00739554:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x19;
  }
  in_stack_00000078 = ___stack_chk_fail();
SUB_007395bc:
  lVar18 = _time(0);
  lVar9 = lVar18;
  if (*(long *)(in_stack_00000078 + 0x7e0) <= lVar18 ||
      *(long *)(in_stack_00000078 + 0x7e0) == 0x7fffffffffffffff) {
    lVar10 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar11 = func_0x00740a58(in_stack_00000078 + lVar10 * 0x20);
      lVar9 = 0;
      if (lVar11 != 0) {
        do {
          lVar9 = func_0x00156654(lVar11);
          lVar12 = func_0x006f4058(lVar11);
          lVar16 = *(long *)(lVar9 + 0x68);
          if (lVar16 == 0 || lVar18 <= lVar16) {
            lVar9 = lVar12;
            if ((lVar16 != 0) && (lVar16 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar16;
            }
          }
          else {
            func_0x0075e5fc(lVar11);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar9 + 0x48));
            lVar9 = (*pcRam0000000000a2b5f0)(lVar9);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar11 = lVar12;
        } while (lVar12 != 0);
      }
      lVar10 = lVar10 + 1;
    } while (lVar10 != 0x3f);
  }
  return lVar9;
}



/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_00738a08(char *param_1)

{
  char cVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  char *pcVar13;
  byte bVar14;
  char cVar15;
  long lVar16;
  long unaff_x19;
  char *unaff_x23;
  long lVar17;
  char *unaff_x25;
  ulong unaff_x26;
  ulong uVar18;
  char *pcVar19;
  char *unaff_x27;
  char *unaff_x28;
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
  
code_r0x00738a08:
  iVar4 = func_0x0077e76c(param_1 + 0xcb7,unaff_x27,6);
  if (unaff_x26 == 0) goto LAB_00738904;
  if (iVar4 == 0) goto LAB_00738904;
  pcVar13 = unaff_x28;
  if (*unaff_x28 == '.') {
    pcVar13 = unaff_x28 + 1;
  }
  uVar18 = unaff_x26 - (*unaff_x28 == '.');
  if (((uVar18 == 9) && (iVar4 = func_0x0077e76c(pcVar13,"localhost",9), iVar4 != 0)) ||
     ((lVar8 = _memchr(pcVar13,0x2e,uVar18), lVar8 != 0 &&
      ((char *)0x1 < pcVar13 + (uVar18 - lVar8))))) {
    pcVar19 = pcVar13;
    if (unaff_x25 != (char *)0x0) {
      pcVar19 = unaff_x25;
    }
    uVar5 = func_0x0074f6ec(pcVar19);
    if (unaff_x25 == (char *)0x0) goto LAB_00738b64;
    if (uVar5 == 0) goto LAB_00738b1c;
LAB_00738a90:
    iVar4 = _strncmp(pcVar13,unaff_x25,uVar18);
    if ((iVar4 == 0) && (uVar9 = _strlen(unaff_x25), uVar18 == uVar9)) {
      uVar5 = 1;
LAB_00738b64:
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
      lVar8 = func_0x0077e93c(pcVar13,uVar18);
      *(long *)(unaff_x19 + 0x60) = lVar8;
      if ((lVar8 != 0) && ((uVar5 & 1) == 0)) {
        *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 1;
        pcVar13 = unaff_x23 + 1;
        cVar15 = *unaff_x23;
        pcVar19 = pcVar13;
        if (cVar15 == ' ' || cVar15 == '\t') goto code_r0x00738918;
        goto code_r0x0073892c;
      }
joined_r0x00738bb4:
      if (lVar8 != 0) {
LAB_00738904:
        pcVar13 = unaff_x23 + 1;
        cVar15 = *unaff_x23;
        pcVar19 = pcVar13;
        if (cVar15 != ' ' && cVar15 != '\t') goto code_r0x0073892c;
code_r0x00738918:
        do {
          pcVar13 = pcVar19 + 1;
          cVar15 = *pcVar19;
          pcVar19 = pcVar13;
        } while (cVar15 == ' ' || cVar15 == '\t');
code_r0x0073892c:
        do {
          unaff_x27 = pcVar13;
          if (cVar15 != ';') {
            if (*(long *)(unaff_x19 + 0x60) == 0 && unaff_x25 != (char *)0x0) {
              lVar8 = (*pcRam0000000000a2b600)(unaff_x25);
              *(long *)(unaff_x19 + 0x60) = lVar8;
              if (lVar8 == 0) goto code_r0x00739500;
            }
            if ((in_stack_00000060 != 0) && (*(long *)(unaff_x19 + 0x50) == 0)) {
              lVar8 = _strchr(in_stack_00000060,0x3f);
              if (lVar8 == 0) {
                lVar8 = _strrchr(in_stack_00000060,0x2f);
              }
              else {
                lVar8 = func_0x0073abd0(in_stack_00000060,0x2f,lVar8 - in_stack_00000060);
              }
              if (lVar8 != 0) {
                lVar8 = func_0x0077e93c(in_stack_00000060,(lVar8 - in_stack_00000060) + 1);
                *(long *)(unaff_x19 + 0x50) = lVar8;
                if (lVar8 == 0) goto code_r0x00739500;
                lVar8 = func_0x0073a3d0();
                *(long *)(unaff_x19 + 0x58) = lVar8;
                if (lVar8 == 0) goto code_r0x00739500;
              }
            }
            if (*(long *)(unaff_x19 + 0x40) == 0) goto code_r0x00739500;
            *(char *)(in_stack_00000070 + 0x1c0) = *(char *)(in_stack_00000070 + 0x1c0) + '\x01';
            bVar14 = *(byte *)(unaff_x19 + 0x74);
            if (((bVar14 & 0x12) == 0x10) ||
               ((((bVar14 >> 5 & 1) != 0 &&
                 (((((bVar14 >> 1 & 1) == 0 || (*(long *)(unaff_x19 + 0x50) == 0)) ||
                   (iVar4 = _strcmp(*(long *)(unaff_x19 + 0x50),"/"), (bVar14 & 1) != 0)) ||
                  (iVar4 != 0)))) ||
                (((*(byte *)(in_stack_00000078 + 0x7f0) & 3) == 2 &&
                 (*(long *)(unaff_x19 + 0x68) == 0)))))) goto code_r0x00739500;
            *(byte *)(unaff_x19 + 0x74) =
                 (*(byte *)(in_stack_00000078 + 0x7f0) & 1) << 2 | bVar14 & 0xfb;
            iVar4 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
            *(int *)(in_stack_00000078 + 0x7ec) = iVar4;
            *(int *)(unaff_x19 + 0x70) = iVar4;
            if ((in_stack_00000068 & 0x100000000) == 0) goto code_r0x007395bc;
            lVar8 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
            lVar8 = func_0x00740a58(in_stack_00000078 + lVar8 * 0x20);
            if (lVar8 != 0) {
              bVar2 = false;
              lVar17 = 0;
              goto code_r0x00739200;
            }
            bVar2 = false;
            goto code_r0x0073943c;
          }
          for (; cVar15 = *unaff_x27, cVar15 == ' ' || cVar15 == '\t'; unaff_x27 = unaff_x27 + 1) {
          }
          uVar18 = _strcspn(unaff_x27,";\t\r\n=");
          if (uVar18 != 0) {
            unaff_x23 = unaff_x27 + uVar18;
            uVar9 = uVar18;
            do {
              if (unaff_x27[uVar9 - 1] != ' ' && unaff_x27[uVar9 - 1] != '\t') break;
              uVar9 = uVar9 - 1;
            } while (uVar9 != 0);
            cVar1 = *unaff_x23;
            if (cVar1 == '=') {
              unaff_x28 = unaff_x27 + uVar18 + 1;
              uVar6 = _strcspn(unaff_x28,";\r\n");
              if (uVar6 == 0) {
                unaff_x26 = 0;
              }
              else {
                unaff_x26 = uVar6;
                do {
                  if ((unaff_x27[unaff_x26 + uVar18] != '\t') &&
                     (unaff_x27[unaff_x26 + uVar18] != ' ')) goto code_r0x00738708;
                  unaff_x26 = unaff_x26 - 1;
                } while (unaff_x26 != 0);
              }
              goto code_r0x00738754;
            }
            unaff_x28 = (char *)0x0;
            unaff_x26 = 0;
            goto code_r0x00738770;
          }
          pcVar13 = unaff_x27 + 1;
          cVar15 = *unaff_x27;
          pcVar19 = pcVar13;
        } while (cVar15 != ' ' && cVar15 != '\t');
        goto code_r0x00738918;
      }
      goto code_r0x00739500;
    }
  }
  else {
    unaff_x25 = ":";
    uVar9 = func_0x0074f6ec(":");
    if ((uVar9 & 1) != 0) goto LAB_00738a90;
LAB_00738b1c:
    uVar9 = _strlen(unaff_x25);
    if (uVar18 <= uVar9) {
      iVar4 = func_0x0077e76c(pcVar13,unaff_x25 + (uVar9 - uVar18),uVar18);
      if ((iVar4 != 0) && ((uVar9 == uVar18 || ((unaff_x25 + (uVar9 - uVar18))[-1] == '.')))) {
        uVar5 = 0;
        goto LAB_00738b64;
      }
    }
  }
  if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                in_stack_00000070 + 0x18) != 0 &&
      (*(int *)(*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + in_stack_00000070 + 0x18) + 8) < 1)))) goto code_r0x00739500;
  pcVar13 = "skipped cookie with bad tailmatch domain: %s";
  goto code_r0x00739104;
code_r0x00739200:
  lVar10 = func_0x00156654(lVar8);
  iVar4 = _strcmp(*(undefined8 *)(lVar10 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
  if (iVar4 == 0) {
    if (*(long *)(lVar10 + 0x60) == 0) {
      if (*(long *)(unaff_x19 + 0x60) == 0) goto code_r0x0073927c;
    }
    else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0)) {
code_r0x0073927c:
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
        iVar4 = func_0x0077e76c(lVar11,lVar12,lVar16);
        if (iVar4 != 0) {
          if (((in_stack_00000070 != 0) && (*(char *)(in_stack_00000070 + 0xa1d) < '\0')) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + in_stack_00000070 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + in_stack_00000070 + 0x18) + 8))))) {
            pcVar13 = "cookie \'%s\' for domain \'%s\' dropped, would overlay an existing cookie";
code_r0x00739104:
            func_0x0073cab8(in_stack_00000070,pcVar13);
          }
code_r0x00739500:
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x40));
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
          (*pcRam0000000000a2b5f0)();
          unaff_x19 = 0;
          goto code_r0x00739554;
        }
      }
    }
  }
  if (lVar17 == 0) {
    iVar4 = _strcmp(*(undefined8 *)(lVar10 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
    if (iVar4 == 0) {
      if (*(long *)(lVar10 + 0x60) == 0) {
        bVar3 = *(long *)(unaff_x19 + 0x60) == 0;
code_r0x007392c8:
        if (bVar3 || bVar2) {
code_r0x007392d4:
          if (*(long *)(lVar10 + 0x58) == 0) {
            if (*(long *)(unaff_x19 + 0x58) == 0) goto code_r0x0073930c;
          }
          else if (((*(long *)(unaff_x19 + 0x58) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0))
                  && ((*(long *)(lVar10 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
code_r0x0073930c:
            if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
               ((*(byte *)(lVar10 + 0x74) >> 2 & 1) == 0)) {
              bVar2 = true;
              lVar17 = lVar8;
              goto code_r0x007391f0;
            }
            goto code_r0x00739500;
          }
        }
      }
      else {
        if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0)) {
          bVar3 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar10 + 0x74)) & 1) == 0;
          goto code_r0x007392c8;
        }
        if (bVar2) goto code_r0x007392d4;
      }
      lVar17 = 0;
      bVar2 = false;
    }
    else {
      lVar17 = 0;
    }
  }
code_r0x007391f0:
  lVar8 = func_0x006f4058(lVar8);
  if (lVar8 == 0) goto code_r0x007393bc;
  goto code_r0x00739200;
  while( true ) {
    unaff_x28 = unaff_x28 + 1;
    unaff_x26 = unaff_x26 - 1;
    if (unaff_x26 == 0) break;
code_r0x00738708:
    if (*unaff_x28 != ' ' && *unaff_x28 != '\t') break;
  }
code_r0x00738754:
  lVar8 = _memchr(unaff_x28,9,unaff_x26);
  if (lVar8 != 0) {
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto code_r0x00739500;
    pcVar13 = "cookie contains TAB, dropping";
    goto code_r0x00739104;
  }
  unaff_x23 = unaff_x27 + uVar6 + uVar18 + 1;
code_r0x00738770:
  if (((0xffe < uVar9) || (0xffe < unaff_x26)) || (0x1000 < unaff_x26 + uVar9)) {
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto code_r0x00739500;
    pcVar13 = "oversized cookie dropped, name/val %zu + %zu bytes";
    goto code_r0x00739104;
  }
  if (((cVar15 == '_') && (6 < uVar9)) && (unaff_x27[1] == '_')) {
    iVar4 = func_0x0077e76c("__Secure-",unaff_x27,9);
    if (iVar4 == 0) {
      iVar4 = func_0x0077e76c("__Host-",unaff_x27,7);
      if (iVar4 == 0) goto code_r0x007387f0;
      bVar14 = 0x20;
    }
    else {
      bVar14 = 0x10;
    }
    *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | bVar14;
  }
code_r0x007387f0:
  if (*(long *)(unaff_x19 + 0x40) == 0) {
    if (cVar1 != '=') goto code_r0x00739500;
    (*pcRam0000000000a2b5f0)(0);
    uVar7 = func_0x0077e93c(unaff_x27,uVar9);
    *(undefined8 *)(unaff_x19 + 0x40) = uVar7;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
    lVar8 = func_0x0077e93c(unaff_x28,unaff_x26);
    *(long *)(unaff_x19 + 0x48) = lVar8;
    lVar17 = *(long *)(unaff_x19 + 0x40);
    if ((lVar17 == 0) || (lVar8 == 0)) goto code_r0x00739500;
    lVar10 = _strcspn(lVar8,&UNK_008ccd96);
    if ((*(char *)(lVar8 + lVar10) == '\0') &&
       (lVar8 = _strcspn(lVar17,&UNK_008ccd96), *(char *)(lVar17 + lVar8) == '\0'))
    goto LAB_00738904;
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto code_r0x00739500;
    pcVar13 = "invalid octets in name/value, cookie dropped";
    goto code_r0x00739104;
  }
  if (unaff_x26 == 0) {
    if (uVar9 == 8) {
      iVar4 = func_0x0077e76c("httponly",unaff_x27,8);
      if (iVar4 != 0) {
        *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 8;
        pcVar13 = unaff_x23 + 1;
        cVar15 = *unaff_x23;
        pcVar19 = pcVar13;
        if (cVar15 == ' ' || cVar15 == '\t') goto code_r0x00738918;
        goto code_r0x0073892c;
      }
    }
    else if ((uVar9 == 6) && (iVar4 = func_0x0077e76c("secure",unaff_x27,6), iVar4 != 0)) {
      if (((in_stack_00000080 & 0x100000000) == 0) &&
         ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) goto code_r0x00739500;
      *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 2;
      pcVar13 = unaff_x23 + 1;
      cVar15 = *unaff_x23;
      pcVar19 = pcVar13;
      if (cVar15 == ' ' || cVar15 == '\t') goto code_r0x00738918;
      goto code_r0x0073892c;
    }
    if (cVar1 != '=') goto LAB_00738904;
  }
  if (uVar9 != 7) {
    if (uVar9 == 6) {
      param_1 = "a-ets-otherSigCert";
      goto code_r0x00738a08;
    }
    if ((uVar9 != 4) || (iVar4 = func_0x0077e76c("path",unaff_x27,4), iVar4 == 0))
    goto LAB_00738904;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
    lVar8 = func_0x0077e93c(unaff_x28,unaff_x26);
    *(long *)(unaff_x19 + 0x50) = lVar8;
    if (lVar8 == 0) goto code_r0x00739500;
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
    lVar8 = func_0x0073a3d0(*(undefined8 *)(unaff_x19 + 0x50));
    *(long *)(unaff_x19 + 0x58) = lVar8;
    goto joined_r0x00738bb4;
  }
  iVar4 = func_0x0077e76c("version",unaff_x27,7);
  if (iVar4 != 0) goto LAB_00738904;
  iVar4 = func_0x0077e76c("max-age",unaff_x27,7);
  if (iVar4 == 0) {
    iVar4 = func_0x0077e76c("expires",unaff_x27,7);
    if (((iVar4 == 0) || (0x4f < unaff_x26)) || (*in_stack_00000050 != 0)) goto LAB_00738904;
    ___memcpy_chk(&uStack0000000000000088,unaff_x28,unaff_x26,0x51);
    (&uStack0000000000000088)[unaff_x26] = 0;
    lVar8 = func_0x0076de98(&uStack0000000000000088);
    *in_stack_00000050 = lVar8;
    if (lVar8 == 0) {
      lVar8 = 1;
code_r0x00738c84:
      *in_stack_00000050 = lVar8;
    }
    else if (lVar8 < 0) {
      lVar8 = 0;
      goto code_r0x00738c84;
    }
    if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto LAB_00738904;
    goto joined_r0x00738ca8;
  }
  if (*unaff_x28 == '\"') {
    unaff_x28 = unaff_x28 + 1;
  }
  iVar4 = func_0x0077ed9c(unaff_x28,0,10,in_stack_00000050);
  if (iVar4 == 0) {
    lVar8 = *in_stack_00000050;
    if (lVar8 == 0) {
code_r0x00738c44:
      lVar17 = 1;
    }
    else {
      lVar17 = 0x7fffffffffffffff;
      if (lVar8 <= in_stack_00000038) {
        lVar17 = lVar8 + in_stack_00000058;
      }
    }
code_r0x00738c50:
    *in_stack_00000050 = lVar17;
  }
  else {
    if (iVar4 == 1) {
      lVar17 = 0x7fffffffffffffff;
      goto code_r0x00738c50;
    }
    if (iVar4 == 2) goto code_r0x00738c44;
  }
  if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto LAB_00738904;
  lVar8 = *in_stack_00000050;
joined_r0x00738ca8:
  if (lVar8 <= in_stack_00000048) goto LAB_00738904;
  *in_stack_00000050 = in_stack_00000040;
  pcVar13 = unaff_x23 + 1;
  cVar15 = *unaff_x23;
  pcVar19 = pcVar13;
  if (cVar15 == ' ' || cVar15 == '\t') goto code_r0x00738918;
  goto code_r0x0073892c;
code_r0x007393bc:
  if (lVar17 != 0) {
    lVar8 = func_0x00156654(lVar17);
    *(undefined4 *)(unaff_x19 + 0x70) = *(undefined4 *)(lVar8 + 0x70);
    func_0x0075e5fc(lVar17);
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x60));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x50));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x58));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x40));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x48));
    (*pcRam0000000000a2b5f0)(lVar8);
  }
code_r0x0073943c:
  lVar8 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
  func_0x0075e474(in_stack_00000078 + lVar8 * 0x20);
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
  lVar8 = *(long *)(unaff_x19 + 0x68);
  if ((lVar8 != 0) && (lVar8 < *(long *)(in_stack_00000078 + 0x7e0))) {
    *(long *)(in_stack_00000078 + 0x7e0) = lVar8;
  }
code_r0x00739554:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x19;
  }
  in_stack_00000078 = ___stack_chk_fail();
code_r0x007395bc:
  lVar17 = _time(0);
  lVar8 = lVar17;
  if (*(long *)(in_stack_00000078 + 0x7e0) <= lVar17 ||
      *(long *)(in_stack_00000078 + 0x7e0) == 0x7fffffffffffffff) {
    lVar10 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar11 = func_0x00740a58(in_stack_00000078 + lVar10 * 0x20);
      lVar8 = 0;
      if (lVar11 != 0) {
        do {
          lVar8 = func_0x00156654(lVar11);
          lVar12 = func_0x006f4058(lVar11);
          lVar16 = *(long *)(lVar8 + 0x68);
          if (lVar16 == 0 || lVar17 <= lVar16) {
            lVar8 = lVar12;
            if ((lVar16 != 0) && (lVar16 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar16;
            }
          }
          else {
            func_0x0075e5fc(lVar11);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x48));
            lVar8 = (*pcRam0000000000a2b5f0)(lVar8);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar11 = lVar12;
        } while (lVar12 != 0);
      }
      lVar10 = lVar10 + 1;
    } while (lVar10 != 0x3f);
  }
  return lVar8;
}



/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_007388a4(undefined8 param_1)

{
  char cVar1;
  bool bVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  char *pcVar12;
  byte bVar13;
  char cVar14;
  long lVar15;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong uVar16;
  long lVar17;
  char *unaff_x23;
  char *unaff_x25;
  ulong unaff_x26;
  char *pcVar18;
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
  
code_r0x007388a4:
  *(undefined8 *)(unaff_x19 + 0x40) = param_1;
  (*(code *)*unaff_x20)(*(undefined8 *)(unaff_x19 + 0x48));
  lVar8 = func_0x0077e93c(unaff_x28,unaff_x26);
  *(long *)(unaff_x19 + 0x48) = lVar8;
  lVar17 = *(long *)(unaff_x19 + 0x40);
  if ((lVar17 != 0) && (lVar8 != 0)) {
    lVar9 = _strcspn(lVar8,&UNK_008ccd96);
    if ((*(char *)(lVar8 + lVar9) == '\0') &&
       (lVar8 = _strcspn(lVar17,&UNK_008ccd96), *(char *)(lVar17 + lVar8) == '\0')) {
code_r0x00738904:
      cVar14 = *unaff_x23;
      pcVar12 = unaff_x23 + 1;
      if (cVar14 != ' ' && cVar14 != '\t') goto LAB_0073892c;
LAB_00738918:
      do {
        pcVar18 = pcVar12 + 1;
        cVar14 = *pcVar12;
        pcVar12 = pcVar18;
      } while (cVar14 == ' ' || cVar14 == '\t');
LAB_0073892c:
      do {
        pcVar18 = pcVar12;
        if (cVar14 != ';') {
          if (*(long *)(unaff_x19 + 0x60) == 0 && unaff_x25 != (char *)0x0) {
            lVar8 = (*pcRam0000000000a2b600)(unaff_x25);
            *(long *)(unaff_x19 + 0x60) = lVar8;
            if (lVar8 == 0) goto LAB_00739500;
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
              if (lVar8 == 0) goto LAB_00739500;
              lVar8 = func_0x0073a3d0();
              *(long *)(unaff_x19 + 0x58) = lVar8;
              if (lVar8 == 0) goto LAB_00739500;
            }
          }
          if (*(long *)(unaff_x19 + 0x40) == 0) goto LAB_00739500;
          *(char *)(in_stack_00000070 + 0x1c0) = *(char *)(in_stack_00000070 + 0x1c0) + '\x01';
          bVar13 = *(byte *)(unaff_x19 + 0x74);
          if (((bVar13 & 0x12) == 0x10) ||
             ((((bVar13 >> 5 & 1) != 0 &&
               (((((bVar13 >> 1 & 1) == 0 || (*(long *)(unaff_x19 + 0x50) == 0)) ||
                 (iVar5 = _strcmp(*(long *)(unaff_x19 + 0x50),"/"), (bVar13 & 1) != 0)) ||
                (iVar5 != 0)))) ||
              (((*(byte *)(in_stack_00000078 + 0x7f0) & 3) == 2 &&
               (*(long *)(unaff_x19 + 0x68) == 0)))))) goto LAB_00739500;
          *(byte *)(unaff_x19 + 0x74) =
               (*(byte *)(in_stack_00000078 + 0x7f0) & 1) << 2 | bVar13 & 0xfb;
          iVar5 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
          *(int *)(in_stack_00000078 + 0x7ec) = iVar5;
          *(int *)(unaff_x19 + 0x70) = iVar5;
          if ((in_stack_00000068 & 0x100000000) == 0) goto code_r0x007395bc;
          lVar8 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
          lVar8 = func_0x00740a58(in_stack_00000078 + lVar8 * 0x20);
          if (lVar8 == 0) {
            bVar2 = false;
            goto code_r0x0073943c;
          }
          bVar2 = false;
          lVar17 = 0;
          goto code_r0x00739200;
        }
        for (; cVar14 = *pcVar18, cVar14 == ' ' || cVar14 == '\t'; pcVar18 = pcVar18 + 1) {
        }
        uVar6 = _strcspn(pcVar18,";\t\r\n=");
        if (uVar6 != 0) {
          unaff_x23 = pcVar18 + uVar6;
          uVar16 = uVar6;
          do {
            if (pcVar18[uVar16 - 1] != ' ' && pcVar18[uVar16 - 1] != '\t') break;
            uVar16 = uVar16 - 1;
          } while (uVar16 != 0);
          cVar1 = *unaff_x23;
          if (cVar1 == '=') {
            unaff_x28 = pcVar18 + uVar6 + 1;
            uVar7 = _strcspn(unaff_x28,";\r\n");
            if (uVar7 == 0) {
              unaff_x26 = 0;
            }
            else {
              unaff_x26 = uVar7;
              do {
                if ((pcVar18[unaff_x26 + uVar6] != '\t') && (pcVar18[unaff_x26 + uVar6] != ' '))
                goto code_r0x00738708;
                unaff_x26 = unaff_x26 - 1;
              } while (unaff_x26 != 0);
            }
            goto code_r0x00738754;
          }
          unaff_x28 = (char *)0x0;
          unaff_x26 = 0;
          goto code_r0x00738770;
        }
        pcVar12 = pcVar18 + 1;
        cVar14 = *pcVar18;
      } while (cVar14 != ' ' && cVar14 != '\t');
      goto LAB_00738918;
    }
    if (((in_stack_00000070 != 0) && (*(char *)(in_stack_00000070 + 0xa1d) < '\0')) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + in_stack_00000070 + 0x18) + 8))))) {
      pcVar12 = "invalid octets in name/value, cookie dropped";
      goto code_r0x00739104;
    }
  }
  goto LAB_00739500;
code_r0x00739200:
  lVar9 = func_0x00156654(lVar8);
  iVar5 = _strcmp(*(undefined8 *)(lVar9 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
  if (iVar5 == 0) {
    if (*(long *)(lVar9 + 0x60) == 0) {
      if (*(long *)(unaff_x19 + 0x60) == 0) goto code_r0x0073927c;
    }
    else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar5 = func_0x0077e6f8(), iVar5 != 0)) {
code_r0x0073927c:
      lVar10 = *(long *)(lVar9 + 0x58);
      if (((lVar10 != 0) &&
          (((lVar11 = *(long *)(unaff_x19 + 0x58), lVar11 != 0 &&
            ((*(byte *)(lVar9 + 0x74) >> 1 & 1) != 0)) &&
           ((*(byte *)(unaff_x19 + 0x74) >> 1 & 1) == 0)))) &&
         ((in_stack_00000080 & 0x100000000) == 0)) {
        lVar15 = _strchr(lVar10 + 1,0x2f);
        if (lVar15 == 0) {
          lVar15 = _strlen(lVar10);
        }
        else {
          lVar15 = lVar15 - lVar10;
        }
        iVar5 = func_0x0077e76c(lVar10,lVar11,lVar15);
        if (iVar5 != 0) {
          if (((in_stack_00000070 != 0) && (*(char *)(in_stack_00000070 + 0xa1d) < '\0')) &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + in_stack_00000070 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + in_stack_00000070 + 0x18) + 8))))) {
            pcVar12 = "cookie \'%s\' for domain \'%s\' dropped, would overlay an existing cookie";
code_r0x00739104:
            func_0x0073cab8(in_stack_00000070,pcVar12);
          }
LAB_00739500:
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
    iVar5 = _strcmp(*(undefined8 *)(lVar9 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
    if (iVar5 == 0) {
      if (*(long *)(lVar9 + 0x60) == 0) {
        bVar3 = *(long *)(unaff_x19 + 0x60) == 0;
code_r0x007392c8:
        if (bVar3 || bVar2) {
code_r0x007392d4:
          if (*(long *)(lVar9 + 0x58) == 0) {
            if (*(long *)(unaff_x19 + 0x58) == 0) goto code_r0x0073930c;
          }
          else if (((*(long *)(unaff_x19 + 0x58) != 0) && (iVar5 = func_0x0077e6f8(), iVar5 != 0))
                  && ((*(long *)(lVar9 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
code_r0x0073930c:
            if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
               ((*(byte *)(lVar9 + 0x74) >> 2 & 1) == 0)) {
              bVar2 = true;
              lVar17 = lVar8;
              goto code_r0x007391f0;
            }
            goto LAB_00739500;
          }
        }
      }
      else {
        if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar5 = func_0x0077e6f8(), iVar5 != 0)) {
          bVar3 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar9 + 0x74)) & 1) == 0;
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
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
    pcVar12 = "cookie contains TAB, dropping";
    goto code_r0x00739104;
  }
  unaff_x23 = pcVar18 + uVar7 + uVar6 + 1;
code_r0x00738770:
  if (((0xffe < uVar16) || (0xffe < unaff_x26)) || (0x1000 < unaff_x26 + uVar16)) {
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
    pcVar12 = "oversized cookie dropped, name/val %zu + %zu bytes";
    goto code_r0x00739104;
  }
  if (((cVar14 == '_') && (6 < uVar16)) && (pcVar18[1] == '_')) {
    iVar5 = func_0x0077e76c("__Secure-",pcVar18,9);
    if (iVar5 == 0) {
      iVar5 = func_0x0077e76c("__Host-",pcVar18,7);
      if (iVar5 == 0) goto code_r0x007387f0;
      bVar13 = 0x20;
    }
    else {
      bVar13 = 0x10;
    }
    *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | bVar13;
  }
code_r0x007387f0:
  if (*(long *)(unaff_x19 + 0x40) == 0) {
    if (cVar1 != '=') goto LAB_00739500;
    unaff_x20 = (undefined8 *)0xa2b5f0;
    (*pcRam0000000000a2b5f0)(0);
    param_1 = func_0x0077e93c(pcVar18,uVar16);
    goto code_r0x007388a4;
  }
  if (unaff_x26 == 0) {
    if (uVar16 == 8) {
      iVar5 = func_0x0077e76c("httponly",pcVar18,8);
      if (iVar5 != 0) {
        *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 8;
        pcVar12 = unaff_x23 + 1;
        cVar14 = *unaff_x23;
        if (cVar14 == ' ' || cVar14 == '\t') goto LAB_00738918;
        goto LAB_0073892c;
      }
    }
    else if ((uVar16 == 6) && (iVar5 = func_0x0077e76c("secure",pcVar18,6), iVar5 != 0)) {
      if (((in_stack_00000080 & 0x100000000) == 0) &&
         ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) != 0)) goto LAB_00739500;
      *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 2;
      pcVar12 = unaff_x23 + 1;
      cVar14 = *unaff_x23;
      if (cVar14 == ' ' || cVar14 == '\t') goto LAB_00738918;
      goto LAB_0073892c;
    }
    if (cVar1 != '=') goto code_r0x00738904;
  }
  if (uVar16 != 7) {
    if (uVar16 != 6) {
      if ((uVar16 != 4) || (iVar5 = func_0x0077e76c("path",pcVar18,4), iVar5 == 0))
      goto code_r0x00738904;
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
      lVar8 = func_0x0077e93c(unaff_x28,unaff_x26);
      *(long *)(unaff_x19 + 0x50) = lVar8;
      if (lVar8 == 0) goto LAB_00739500;
      (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
      lVar8 = func_0x0073a3d0(*(undefined8 *)(unaff_x19 + 0x50));
      *(long *)(unaff_x19 + 0x58) = lVar8;
joined_r0x00738874:
      if (lVar8 == 0) goto LAB_00739500;
      goto code_r0x00738904;
    }
    iVar5 = func_0x0077e76c("domain",pcVar18,6);
    if ((unaff_x26 == 0) || (iVar5 == 0)) goto code_r0x00738904;
    pcVar12 = unaff_x28;
    if (*unaff_x28 == '.') {
      pcVar12 = unaff_x28 + 1;
    }
    uVar6 = unaff_x26 - (*unaff_x28 == '.');
    if (((uVar6 == 9) && (iVar5 = func_0x0077e76c(pcVar12,"localhost",9), iVar5 != 0)) ||
       ((lVar8 = _memchr(pcVar12,0x2e,uVar6), lVar8 != 0 &&
        ((char *)0x1 < pcVar12 + (uVar6 - lVar8))))) {
      pcVar18 = pcVar12;
      if (unaff_x25 != (char *)0x0) {
        pcVar18 = unaff_x25;
      }
      uVar4 = func_0x0074f6ec(pcVar18);
      if (unaff_x25 == (char *)0x0) goto code_r0x00738b64;
      if (uVar4 == 0) goto code_r0x00738b1c;
    }
    else {
      unaff_x25 = ":";
      uVar16 = func_0x0074f6ec(":");
      if ((uVar16 & 1) == 0) {
code_r0x00738b1c:
        uVar16 = _strlen(unaff_x25);
        if (uVar16 < uVar6) goto code_r0x007394ec;
        iVar5 = func_0x0077e76c(pcVar12,unaff_x25 + (uVar16 - uVar6),uVar6);
        if ((iVar5 == 0) || ((uVar16 != uVar6 && ((unaff_x25 + (uVar16 - uVar6))[-1] != '.'))))
        goto code_r0x007394ec;
        uVar4 = 0;
        goto code_r0x00738b64;
      }
    }
    iVar5 = _strncmp(pcVar12,unaff_x25,uVar6);
    if ((iVar5 != 0) || (uVar16 = _strlen(unaff_x25), uVar6 != uVar16)) {
code_r0x007394ec:
      if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    in_stack_00000070 + 0x18) != 0 &&
          (*(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
      pcVar12 = "skipped cookie with bad tailmatch domain: %s";
      goto code_r0x00739104;
    }
    uVar4 = 1;
code_r0x00738b64:
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
    lVar8 = func_0x0077e93c(pcVar12,uVar6);
    *(long *)(unaff_x19 + 0x60) = lVar8;
    if ((lVar8 != 0) && ((uVar4 & 1) == 0)) {
      *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 1;
      pcVar12 = unaff_x23 + 1;
      cVar14 = *unaff_x23;
      if (cVar14 == ' ' || cVar14 == '\t') goto LAB_00738918;
      goto LAB_0073892c;
    }
    goto joined_r0x00738874;
  }
  iVar5 = func_0x0077e76c("version",pcVar18,7);
  if (iVar5 != 0) goto code_r0x00738904;
  iVar5 = func_0x0077e76c("max-age",pcVar18,7);
  if (iVar5 == 0) {
    iVar5 = func_0x0077e76c("expires",pcVar18,7);
    if (((iVar5 == 0) || (0x4f < unaff_x26)) || (*in_stack_00000050 != 0)) goto code_r0x00738904;
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
    if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto code_r0x00738904;
    goto joined_r0x00738ca8;
  }
  if (*unaff_x28 == '\"') {
    unaff_x28 = unaff_x28 + 1;
  }
  iVar5 = func_0x0077ed9c(unaff_x28,0,10,in_stack_00000050);
  if (iVar5 == 0) {
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
    if (iVar5 == 1) {
      lVar17 = 0x7fffffffffffffff;
      goto code_r0x00738c50;
    }
    if (iVar5 == 2) goto code_r0x00738c44;
  }
  if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto code_r0x00738904;
  lVar8 = *in_stack_00000050;
joined_r0x00738ca8:
  if (lVar8 <= in_stack_00000048) goto code_r0x00738904;
  *in_stack_00000050 = in_stack_00000040;
  pcVar12 = unaff_x23 + 1;
  cVar14 = *unaff_x23;
  if (cVar14 == ' ' || cVar14 == '\t') goto LAB_00738918;
  goto LAB_0073892c;
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
    lVar9 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar10 = func_0x00740a58(in_stack_00000078 + lVar9 * 0x20);
      lVar8 = 0;
      if (lVar10 != 0) {
        do {
          lVar8 = func_0x00156654(lVar10);
          lVar11 = func_0x006f4058(lVar10);
          lVar15 = *(long *)(lVar8 + 0x68);
          if (lVar15 == 0 || lVar17 <= lVar15) {
            lVar8 = lVar11;
            if ((lVar15 != 0) && (lVar15 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar15;
            }
          }
          else {
            func_0x0075e5fc(lVar10);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar8 + 0x48));
            lVar8 = (*pcRam0000000000a2b5f0)(lVar8);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar10 = lVar11;
        } while (lVar11 != 0);
      }
      lVar9 = lVar9 + 1;
    } while (lVar9 != 0x3f);
  }
  return lVar8;
}



/* WARNING: Possible PIC construction at 0x007391c4: Changing call to branch */

long FUN_007386d4(byte *param_1,char *param_2)

{
  byte *pbVar1;
  bool bVar2;
  bool bVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  char *pcVar12;
  byte bVar13;
  long lVar14;
  long unaff_x19;
  uint unaff_w20;
  ulong unaff_x21;
  byte *unaff_x23;
  byte *pbVar15;
  uint unaff_w24;
  long lVar16;
  char *unaff_x25;
  ulong uVar17;
  byte *unaff_x27;
  byte *pbVar18;
  byte *unaff_x28;
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
  
code_r0x007386d4:
  uVar6 = _strcspn(param_1,param_2 + 0xa73);
  if (uVar6 == 0) {
    uVar17 = 0;
  }
  else {
    uVar17 = uVar6;
    do {
      if ((unaff_x23[uVar17] != 9) && (unaff_x23[uVar17] != 0x20)) goto LAB_00738708;
      uVar17 = uVar17 - 1;
    } while (uVar17 != 0);
  }
  goto LAB_00738754;
  while( true ) {
    unaff_x28 = unaff_x28 + 1;
    uVar17 = uVar17 - 1;
    if (uVar17 == 0) break;
LAB_00738708:
    if (*unaff_x28 != 0x20 && *unaff_x28 != 9) break;
  }
LAB_00738754:
  lVar7 = _memchr(unaff_x28,9,uVar17);
  if (lVar7 == 0) {
    pbVar15 = unaff_x23 + uVar6 + 1;
code_r0x00738770:
    if (((unaff_x21 < 0xfff) && (uVar17 < 0xfff)) &&
       ((char *)(uVar17 + unaff_x21) <
        "rameworks/CoreFoundation.framework/Versions/A/CoreFoundation")) {
      if (((unaff_w20 == 0x5f) && (6 < unaff_x21)) && (unaff_x27[1] == 0x5f)) {
        iVar4 = func_0x0077e76c("__Secure-",unaff_x27,9);
        if (iVar4 == 0) {
          iVar4 = func_0x0077e76c("__Host-",unaff_x27,7);
          if (iVar4 == 0) goto LAB_007387f0;
          bVar13 = 0x20;
        }
        else {
          bVar13 = 0x10;
        }
        *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | bVar13;
      }
LAB_007387f0:
      if (*(long *)(unaff_x19 + 0x40) == 0) {
        if (unaff_w24 != 0x3d) goto LAB_00739500;
        (*pcRam0000000000a2b5f0)(0);
        uVar8 = func_0x0077e93c(unaff_x27,unaff_x21);
        *(undefined8 *)(unaff_x19 + 0x40) = uVar8;
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x48));
        lVar7 = func_0x0077e93c(unaff_x28,uVar17);
        *(long *)(unaff_x19 + 0x48) = lVar7;
        lVar9 = *(long *)(unaff_x19 + 0x40);
        if ((lVar9 == 0) || (lVar7 == 0)) goto LAB_00739500;
        lVar16 = _strcspn(lVar7,&UNK_008ccd96);
        if ((*(char *)(lVar7 + lVar16) != '\0') ||
           (lVar7 = _strcspn(lVar9,&UNK_008ccd96), *(char *)(lVar9 + lVar7) != '\0')) {
          if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + in_stack_00000070 + 0x18) != 0 &&
              (*(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
          pcVar12 = "invalid octets in name/value, cookie dropped";
          goto code_r0x00739104;
        }
      }
      else {
        if (uVar17 == 0) {
          if (unaff_x21 == 8) {
            iVar4 = func_0x0077e76c("httponly",unaff_x27,8);
            if (iVar4 != 0) {
              *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 8;
              pbVar18 = pbVar15 + 1;
              bVar13 = *pbVar15;
              if (bVar13 != 0x20 && bVar13 != 9) goto code_r0x0073892c;
              goto code_r0x00738918;
            }
          }
          else if ((unaff_x21 == 6) && (iVar4 = func_0x0077e76c("secure",unaff_x27,6), iVar4 != 0))
          {
            if (((in_stack_00000080 & 0x100000000) != 0) ||
               ((*(byte *)(in_stack_00000078 + 0x7f0) & 1) == 0)) {
              *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 2;
              pbVar18 = pbVar15 + 1;
              bVar13 = *pbVar15;
              if (bVar13 != 0x20 && bVar13 != 9) goto code_r0x0073892c;
              goto code_r0x00738918;
            }
            goto LAB_00739500;
          }
          if (unaff_w24 != 0x3d) goto LAB_00738904;
        }
        if (unaff_x21 == 7) {
          iVar4 = func_0x0077e76c("version",unaff_x27,7);
          if (iVar4 == 0) {
            iVar4 = func_0x0077e76c("max-age",unaff_x27,7);
            if (iVar4 == 0) {
              iVar4 = func_0x0077e76c("expires",unaff_x27,7);
              if (((iVar4 == 0) || (0x4f < uVar17)) || (*in_stack_00000050 != 0)) goto LAB_00738904;
              ___memcpy_chk(&uStack0000000000000088,unaff_x28,uVar17,0x51);
              (&uStack0000000000000088)[uVar17] = 0;
              lVar7 = func_0x0076de98(&uStack0000000000000088);
              *in_stack_00000050 = lVar7;
              if (lVar7 == 0) {
                lVar7 = 1;
code_r0x00738c84:
                *in_stack_00000050 = lVar7;
              }
              else if (lVar7 < 0) {
                lVar7 = 0;
                goto code_r0x00738c84;
              }
              if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto LAB_00738904;
            }
            else {
              if (*unaff_x28 == 0x22) {
                unaff_x28 = unaff_x28 + 1;
              }
              iVar4 = func_0x0077ed9c(unaff_x28,0,10,in_stack_00000050);
              if (iVar4 == 0) {
                lVar7 = *in_stack_00000050;
                if (lVar7 == 0) {
code_r0x00738c44:
                  lVar9 = 1;
                }
                else {
                  lVar9 = 0x7fffffffffffffff;
                  if (lVar7 <= in_stack_00000038) {
                    lVar9 = lVar7 + in_stack_00000058;
                  }
                }
code_r0x00738c50:
                *in_stack_00000050 = lVar9;
              }
              else {
                if (iVar4 == 1) {
                  lVar9 = 0x7fffffffffffffff;
                  goto code_r0x00738c50;
                }
                if (iVar4 == 2) goto code_r0x00738c44;
              }
              if (0x7ffffffffdf0a7e0 < in_stack_00000058) goto LAB_00738904;
              lVar7 = *in_stack_00000050;
            }
            if (in_stack_00000048 < lVar7) {
              *in_stack_00000050 = in_stack_00000040;
              pbVar18 = pbVar15 + 1;
              bVar13 = *pbVar15;
              if (bVar13 != 0x20 && bVar13 != 9) goto code_r0x0073892c;
              goto code_r0x00738918;
            }
          }
        }
        else if (unaff_x21 == 6) {
          iVar4 = func_0x0077e76c("domain",unaff_x27,6);
          if ((uVar17 != 0) && (iVar4 != 0)) {
            pbVar18 = unaff_x28;
            if (*unaff_x28 == 0x2e) {
              pbVar18 = unaff_x28 + 1;
            }
            uVar17 = uVar17 - (*unaff_x28 == 0x2e);
            if (((uVar17 == 9) && (iVar4 = func_0x0077e76c(pbVar18,"localhost",9), iVar4 != 0)) ||
               ((lVar7 = _memchr(pbVar18,0x2e,uVar17), lVar7 != 0 &&
                ((byte *)((long)&MACH_HEADER.magic + 1) < pbVar18 + (uVar17 - lVar7))))) {
              pbVar1 = pbVar18;
              if ((byte *)unaff_x25 != (byte *)0x0) {
                pbVar1 = (byte *)unaff_x25;
              }
              uVar5 = func_0x0074f6ec(pbVar1);
              if ((byte *)unaff_x25 != (byte *)0x0) {
                if (uVar5 == 0) goto LAB_00738b1c;
                goto LAB_00738a90;
              }
LAB_00738b64:
              (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x60));
              lVar7 = func_0x0077e93c(pbVar18,uVar17);
              *(long *)(unaff_x19 + 0x60) = lVar7;
              if ((lVar7 != 0) && ((uVar5 & 1) == 0)) {
                *(byte *)(unaff_x19 + 0x74) = *(byte *)(unaff_x19 + 0x74) | 1;
                pbVar18 = pbVar15 + 1;
                bVar13 = *pbVar15;
                if (bVar13 != 0x20 && bVar13 != 9) goto code_r0x0073892c;
                goto code_r0x00738918;
              }
              goto joined_r0x00738bb4;
            }
            unaff_x25 = ":";
            uVar6 = func_0x0074f6ec(":");
            if ((uVar6 & 1) == 0) {
LAB_00738b1c:
              uVar6 = _strlen(unaff_x25);
              if (uVar17 <= uVar6) {
                iVar4 = func_0x0077e76c(pbVar18,unaff_x25 + (uVar6 - uVar17),uVar17);
                if ((iVar4 != 0) &&
                   ((uVar6 == uVar17 || ((unaff_x25 + (uVar6 - uVar17))[-1] == 0x2e)))) {
                  uVar5 = 0;
                  goto LAB_00738b64;
                }
              }
            }
            else {
LAB_00738a90:
              iVar4 = _strncmp(pbVar18,unaff_x25,uVar17);
              if ((iVar4 == 0) && (uVar6 = _strlen(unaff_x25), uVar17 == uVar6)) {
                uVar5 = 1;
                goto LAB_00738b64;
              }
            }
            if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
               ((*(long *)(
                          "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                          + in_stack_00000070 + 0x18) != 0 &&
                (*(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
            pcVar12 = "skipped cookie with bad tailmatch domain: %s";
            goto code_r0x00739104;
          }
        }
        else if ((unaff_x21 == 4) && (iVar4 = func_0x0077e76c("path",unaff_x27,4), iVar4 != 0)) {
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x50));
          lVar7 = func_0x0077e93c(unaff_x28,uVar17);
          *(long *)(unaff_x19 + 0x50) = lVar7;
          if (lVar7 == 0) goto LAB_00739500;
          (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x19 + 0x58));
          lVar7 = func_0x0073a3d0(*(undefined8 *)(unaff_x19 + 0x50));
          *(long *)(unaff_x19 + 0x58) = lVar7;
joined_r0x00738bb4:
          if (lVar7 == 0) goto LAB_00739500;
        }
      }
LAB_00738904:
      bVar13 = *pbVar15;
      pbVar18 = pbVar15 + 1;
      if (bVar13 != 0x20 && bVar13 != 9) goto code_r0x0073892c;
code_r0x00738918:
      do {
        do {
          pbVar15 = pbVar18 + 1;
          bVar13 = *pbVar18;
          pbVar18 = pbVar15;
        } while (bVar13 == 0x20 || bVar13 == 9);
code_r0x0073892c:
        do {
          unaff_x27 = pbVar18;
          if (bVar13 != 0x3b) {
            if (*(long *)(unaff_x19 + 0x60) == 0 && (byte *)unaff_x25 != (byte *)0x0) {
              lVar7 = (*pcRam0000000000a2b600)(unaff_x25);
              *(long *)(unaff_x19 + 0x60) = lVar7;
              if (lVar7 == 0) goto LAB_00739500;
            }
            if ((in_stack_00000060 != 0) && (*(long *)(unaff_x19 + 0x50) == 0)) {
              lVar7 = _strchr(in_stack_00000060,0x3f);
              if (lVar7 == 0) {
                lVar7 = _strrchr(in_stack_00000060,0x2f);
              }
              else {
                lVar7 = func_0x0073abd0(in_stack_00000060,0x2f,lVar7 - in_stack_00000060);
              }
              if (lVar7 != 0) {
                lVar7 = func_0x0077e93c(in_stack_00000060,(lVar7 - in_stack_00000060) + 1);
                *(long *)(unaff_x19 + 0x50) = lVar7;
                if (lVar7 == 0) goto LAB_00739500;
                lVar7 = func_0x0073a3d0();
                *(long *)(unaff_x19 + 0x58) = lVar7;
                if (lVar7 == 0) goto LAB_00739500;
              }
            }
            if (*(long *)(unaff_x19 + 0x40) == 0) goto LAB_00739500;
            *(char *)(in_stack_00000070 + 0x1c0) = *(char *)(in_stack_00000070 + 0x1c0) + '\x01';
            bVar13 = *(byte *)(unaff_x19 + 0x74);
            if (((bVar13 & 0x12) == 0x10) ||
               ((((bVar13 >> 5 & 1) != 0 &&
                 (((((bVar13 >> 1 & 1) == 0 || (*(long *)(unaff_x19 + 0x50) == 0)) ||
                   (iVar4 = _strcmp(*(long *)(unaff_x19 + 0x50),"/"), (bVar13 & 1) != 0)) ||
                  (iVar4 != 0)))) ||
                (((*(byte *)(in_stack_00000078 + 0x7f0) & 3) == 2 &&
                 (*(long *)(unaff_x19 + 0x68) == 0)))))) goto LAB_00739500;
            *(byte *)(unaff_x19 + 0x74) =
                 (*(byte *)(in_stack_00000078 + 0x7f0) & 1) << 2 | bVar13 & 0xfb;
            iVar4 = *(int *)(in_stack_00000078 + 0x7ec) + 1;
            *(int *)(in_stack_00000078 + 0x7ec) = iVar4;
            *(int *)(unaff_x19 + 0x70) = iVar4;
            if ((in_stack_00000068 & 0x100000000) == 0) goto code_r0x007395bc;
            lVar7 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
            lVar7 = func_0x00740a58(in_stack_00000078 + lVar7 * 0x20);
            if (lVar7 == 0) {
              bVar2 = false;
              goto code_r0x0073943c;
            }
            bVar2 = false;
            lVar9 = 0;
            goto code_r0x00739200;
          }
          while( true ) {
            bVar13 = *unaff_x27;
            unaff_w20 = (uint)bVar13;
            if (bVar13 != 0x20 && bVar13 != 9) break;
            unaff_x27 = unaff_x27 + 1;
          }
          uVar6 = _strcspn(unaff_x27,";\t\r\n=");
          if (uVar6 != 0) {
            pbVar15 = unaff_x27 + uVar6;
            unaff_x21 = uVar6;
            goto code_r0x0073869c;
          }
          pbVar18 = unaff_x27 + 1;
          bVar13 = *unaff_x27;
        } while (bVar13 != 0x20 && bVar13 != 9);
      } while( true );
    }
    if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  in_stack_00000070 + 0x18) != 0 &&
        (*(int *)(*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
    pcVar12 = "oversized cookie dropped, name/val %zu + %zu bytes";
    goto code_r0x00739104;
  }
  if (((in_stack_00000070 == 0) || (-1 < *(char *)(in_stack_00000070 + 0xa1d))) ||
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                in_stack_00000070 + 0x18) != 0 &&
      (*(int *)(*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + in_stack_00000070 + 0x18) + 8) < 1)))) goto LAB_00739500;
  pcVar12 = "cookie contains TAB, dropping";
  goto code_r0x00739104;
code_r0x00739200:
  lVar16 = func_0x00156654(lVar7);
  iVar4 = _strcmp(*(undefined8 *)(lVar16 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
  if (iVar4 == 0) {
    if (*(long *)(lVar16 + 0x60) == 0) {
      if (*(long *)(unaff_x19 + 0x60) == 0) goto code_r0x0073927c;
    }
    else if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0)) {
code_r0x0073927c:
      lVar10 = *(long *)(lVar16 + 0x58);
      if (((lVar10 != 0) &&
          (((lVar11 = *(long *)(unaff_x19 + 0x58), lVar11 != 0 &&
            ((*(byte *)(lVar16 + 0x74) >> 1 & 1) != 0)) &&
           ((*(byte *)(unaff_x19 + 0x74) >> 1 & 1) == 0)))) &&
         ((in_stack_00000080 & 0x100000000) == 0)) {
        lVar14 = _strchr(lVar10 + 1,0x2f);
        if (lVar14 == 0) {
          lVar14 = _strlen(lVar10);
        }
        else {
          lVar14 = lVar14 - lVar10;
        }
        iVar4 = func_0x0077e76c(lVar10,lVar11,lVar14);
        if (iVar4 != 0) {
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
  if (lVar9 == 0) {
    iVar4 = _strcmp(*(undefined8 *)(lVar16 + 0x40),*(undefined8 *)(unaff_x19 + 0x40));
    if (iVar4 == 0) {
      if (*(long *)(lVar16 + 0x60) == 0) {
        bVar3 = *(long *)(unaff_x19 + 0x60) == 0;
code_r0x007392c8:
        if (bVar3 || bVar2) {
code_r0x007392d4:
          if (*(long *)(lVar16 + 0x58) == 0) {
            if (*(long *)(unaff_x19 + 0x58) == 0) goto code_r0x0073930c;
          }
          else if (((*(long *)(unaff_x19 + 0x58) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0))
                  && ((*(long *)(lVar16 + 0x58) != 0) != (*(long *)(unaff_x19 + 0x58) == 0))) {
code_r0x0073930c:
            if (((*(byte *)(unaff_x19 + 0x74) >> 2 & 1) != 0) ||
               ((*(byte *)(lVar16 + 0x74) >> 2 & 1) == 0)) {
              bVar2 = true;
              lVar9 = lVar7;
              goto code_r0x007391f0;
            }
            goto LAB_00739500;
          }
        }
      }
      else {
        if ((*(long *)(unaff_x19 + 0x60) != 0) && (iVar4 = func_0x0077e6f8(), iVar4 != 0)) {
          bVar3 = ((*(byte *)(unaff_x19 + 0x74) ^ *(byte *)(lVar16 + 0x74)) & 1) == 0;
          goto code_r0x007392c8;
        }
        if (bVar2) goto code_r0x007392d4;
      }
      lVar9 = 0;
      bVar2 = false;
    }
    else {
      lVar9 = 0;
    }
  }
code_r0x007391f0:
  lVar7 = func_0x006f4058(lVar7);
  if (lVar7 == 0) goto code_r0x007393bc;
  goto code_r0x00739200;
  while (unaff_x21 = unaff_x21 - 1, unaff_x21 != 0) {
code_r0x0073869c:
    if (unaff_x27[unaff_x21 - 1] != 0x20 && unaff_x27[unaff_x21 - 1] != 9) break;
  }
  unaff_w24 = (uint)*pbVar15;
  if (*pbVar15 == 0x3d) goto code_r0x007386c4;
  unaff_x28 = (byte *)0x0;
  uVar17 = 0;
  goto code_r0x00738770;
code_r0x007386c4:
  unaff_x23 = unaff_x27 + uVar6;
  param_1 = unaff_x23 + 1;
  param_2 = "next";
  unaff_x28 = param_1;
  goto code_r0x007386d4;
code_r0x007393bc:
  if (lVar9 != 0) {
    lVar7 = func_0x00156654(lVar9);
    *(undefined4 *)(unaff_x19 + 0x70) = *(undefined4 *)(lVar7 + 0x70);
    func_0x0075e5fc(lVar9);
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x60));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x50));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x58));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x40));
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x48));
    (*pcRam0000000000a2b5f0)(lVar7);
  }
code_r0x0073943c:
  lVar7 = func_0x007396e8(*(undefined8 *)(unaff_x19 + 0x60));
  func_0x0075e474(in_stack_00000078 + lVar7 * 0x20);
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
  lVar7 = *(long *)(unaff_x19 + 0x68);
  if ((lVar7 != 0) && (lVar7 < *(long *)(in_stack_00000078 + 0x7e0))) {
    *(long *)(in_stack_00000078 + 0x7e0) = lVar7;
  }
code_r0x00739554:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return unaff_x19;
  }
  in_stack_00000078 = ___stack_chk_fail();
code_r0x007395bc:
  lVar9 = _time(0);
  lVar7 = lVar9;
  if (*(long *)(in_stack_00000078 + 0x7e0) <= lVar9 ||
      *(long *)(in_stack_00000078 + 0x7e0) == 0x7fffffffffffffff) {
    lVar16 = 0;
    *(undefined8 *)(in_stack_00000078 + 0x7e0) = 0x7fffffffffffffff;
    do {
      lVar10 = func_0x00740a58(in_stack_00000078 + lVar16 * 0x20);
      lVar7 = 0;
      if (lVar10 != 0) {
        do {
          lVar7 = func_0x00156654(lVar10);
          lVar11 = func_0x006f4058(lVar10);
          lVar14 = *(long *)(lVar7 + 0x68);
          if (lVar14 == 0 || lVar9 <= lVar14) {
            lVar7 = lVar11;
            if ((lVar14 != 0) && (lVar14 < *(long *)(in_stack_00000078 + 0x7e0))) {
              *(long *)(in_stack_00000078 + 0x7e0) = lVar14;
            }
          }
          else {
            func_0x0075e5fc(lVar10);
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x60));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x50));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x58));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x40));
            (*pcRam0000000000a2b5f0)(*(undefined8 *)(lVar7 + 0x48));
            lVar7 = (*pcRam0000000000a2b5f0)(lVar7);
            *(int *)(in_stack_00000078 + 0x7e8) = *(int *)(in_stack_00000078 + 0x7e8) + -1;
          }
          lVar10 = lVar11;
        } while (lVar11 != 0);
      }
      lVar16 = lVar16 + 1;
    } while (lVar16 != 0x3f);
  }
  return lVar7;
}


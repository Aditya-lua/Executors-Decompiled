
/* WARNING: Removing unreachable block (ram,0x00755554) */
/* WARNING: Removing unreachable block (ram,0x007561cc) */
/* WARNING: Removing unreachable block (ram,0x007561b0) */

undefined8 FUN_007550f8(void)

{
  undefined *puVar1;
  undefined *puVar2;
  byte bVar3;
  char cVar4;
  int iVar5;
  char *pcVar6;
  byte *pbVar7;
  undefined8 uVar8;
  uint uVar9;
  undefined *puVar10;
  long unaff_x19;
  ulong unaff_x20;
  char *unaff_x21;
  long lVar11;
  undefined8 *unaff_x23;
  long lVar12;
  ulong *unaff_x27;
  uint *unaff_x28;
  undefined8 uStack0000000000000010;
  
  do {
    unaff_x23 = (undefined8 *)unaff_x23[1];
    if (unaff_x23 == (undefined8 *)0x0) goto LAB_00755490;
    uVar8 = *unaff_x23;
    _strlen(uVar8);
    iVar5 = func_0x0077e76c(uVar8);
  } while (iVar5 == 0);
  if (unaff_x20 < 5) {
LAB_00755490:
    iVar5 = func_0x0077e76c("HTTP/");
    if ((unaff_x20 < 5) || (iVar5 == 0)) {
      *unaff_x28 = *unaff_x28 & 0xfffffffe;
      return 8;
    }
  }
  *(undefined4 *)(unaff_x19 + 0x130) = 200;
  *(undefined1 *)(unaff_x19 + 0x139) = 10;
  lVar11 = *(long *)(unaff_x19 + 0x18);
  if ((*(byte *)(unaff_x19 + 0x138) != 0) && (9 < *(byte *)(unaff_x19 + 0x138) - 10))
  goto code_r0x00755068;
  *(undefined4 *)(&UNK_00001350 + unaff_x19) = 200;
  *(undefined4 *)(&UNK_00001358 + unaff_x19) = 10;
  *(undefined1 *)(lVar11 + 0x52c) = 10;
  if (9 < (byte)(*(char *)((long)unaff_x27 + 0x927) - 1U)) {
    *(undefined1 *)((long)unaff_x27 + 0x927) = 10;
  }
  if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
     ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                unaff_x19 + 0x18) == 0 ||
      (0 < *(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8))))) {
    func_0x0073cab8();
  }
  func_0x00734f74(lVar11,1);
  iVar5 = *(int *)(unaff_x19 + 0x130);
  uVar9 = *unaff_x28;
  *unaff_x28 = uVar9 & 0xfffff000 | uVar9 & 0x7ff | (uint)(iVar5 - 100U < 100) << 0xb;
  if (iVar5 == 0xcc) {
code_r0x007555e8:
    *(undefined8 *)(unaff_x19 + 0xe8) = 0;
    *(undefined8 *)(unaff_x19 + 0xf0) = 0;
    *unaff_x28 = uVar9 | 0x800;
  }
  else if (iVar5 == 0x130) {
    if (*(char *)(unaff_x19 + 0xa16) != '\0') {
      *(byte *)((long)unaff_x27 + 0xa2a) = *(byte *)((long)unaff_x27 + 0xa2a) | 1;
    }
    goto code_r0x007555e8;
  }
  lVar11 = _memchr();
  if (lVar11 != 0) {
code_r0x00755068:
    func_0x0073c9e4();
    return 8;
  }
  cVar4 = *unaff_x21;
  if (((1 < (int)*(uint *)(unaff_x19 + 0x124)) &&
      (((cVar4 != ' ' && (cVar4 != '\t')) || (*(uint *)(unaff_x19 + 0x124) < 3)))) &&
     (lVar11 = _memchr(), lVar11 == 0)) goto code_r0x00755068;
  lVar11 = *(long *)(unaff_x19 + 0x18);
  switch(cVar4) {
  case 'A':
  case 'a':
    if ((((*(long *)(unaff_x19 + 0xa38) != 0) && (iVar5 = func_0x007315f4(lVar11,0), 7 < unaff_x20))
        && (iVar5 != 0)) && (iVar5 = func_0x0077e76c("Alt-Svc:"), iVar5 != 0)) {
      func_0x0078bbc8(*(undefined4 *)(lVar11 + 0x518));
      uVar8 = func_0x00727ddc();
code_r0x00755fdc:
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      goto code_r0x00756298;
    }
    break;
  case 'C':
  case 'c':
    uVar9 = *unaff_x28;
    if ((((uVar9 >> 0xb & 1) == 0) && (0xe < unaff_x20)) && ((*unaff_x27 >> 0x24 & 1) == 0)) {
      iVar5 = func_0x0077e76c("Content-Length:");
      if (iVar5 != 0) {
        iVar5 = func_0x0077ed9c(unaff_x21 + 0xf,0,10,&uStack0000000000000010);
        if (iVar5 == 1) {
          if (*(long *)(unaff_x19 + 0x6b0) != 0) {
            func_0x0073c9e4();
            return 0x3f;
          }
          func_0x00734f74(lVar11,2);
          if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
        }
        else {
          if (iVar5 != 0) {
            func_0x0073c9e4();
            return 8;
          }
          *(undefined **)(unaff_x19 + 0xe8) = uStack0000000000000010;
          *(undefined **)(unaff_x19 + 0xf0) = uStack0000000000000010;
        }
        goto code_r0x00756298;
      }
      uVar9 = *unaff_x28;
    }
    if ((((uVar9 >> 0xb & 1) == 0) && (0x10 < unaff_x20)) && (*(long *)(unaff_x19 + 0x7e8) != 0)) {
      iVar5 = func_0x0077e76c("Content-Encoding:");
      if (iVar5 != 0) {
        uVar8 = func_0x00737310();
        goto code_r0x00755fdc;
      }
code_r0x00755ff0:
      iVar5 = func_0x0077e76c("Content-Type:");
      if (iVar5 != 0) {
        pcVar6 = (char *)func_0x007529d0();
        if (pcVar6 == (char *)0x0) {
          return 0x1b;
        }
        if (*pcVar6 == '\0') goto code_r0x00755b58;
        (*pcRam0000000000a2b5f0)(*(undefined8 *)(&UNK_00001398 + unaff_x19));
        *(char **)(&UNK_00001398 + unaff_x19) = pcVar6;
        goto code_r0x00756298;
      }
    }
    else {
      if (0xc < unaff_x20) goto code_r0x00755ff0;
      if (unaff_x20 < 0xb) break;
    }
    iVar5 = func_0x0077e76c("Connection:");
    if (((unaff_x20 < 0x11) || (iVar5 == 0)) || (iVar5 = func_0x007537a0(), iVar5 == 0)) {
      if (((*(char *)(unaff_x19 + 0x139) != '\n') ||
          (iVar5 = func_0x0077e76c("Connection:"), unaff_x20 < 0x16)) ||
         ((iVar5 == 0 || (iVar5 = func_0x007537a0(), iVar5 == 0)))) {
        if (((0xd < unaff_x20) && ((*unaff_x28 >> 0xb & 1) == 0)) &&
           (iVar5 = func_0x0077e76c("Content-Range:"), iVar5 != 0)) {
          pbVar7 = (byte *)(unaff_x21 + 0xe);
          bVar3 = *pbVar7;
          while (bVar3 != 0) {
            if (bVar3 - 0x30 < 10) {
              iVar5 = func_0x0077ed9c(pbVar7,0,10,unaff_x19 + 0x128);
              if ((iVar5 == 0) &&
                 (*(long *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19) ==
                  *(long *)(unaff_x19 + 0x128))) {
                *unaff_x28 = *unaff_x28 | 4;
              }
              goto code_r0x00756278;
            }
            if (bVar3 == 0x2a) break;
            pbVar7 = pbVar7 + 1;
            bVar3 = *pbVar7;
          }
          if (*(int *)(unaff_x19 + 0x130) < 300) {
            *(undefined8 *)((long)&dylib_command_00001108.dylib.name.offset + unaff_x19) = 0;
          }
        }
        break;
      }
      func_0x00734f74(lVar11,0);
      if ((*(char *)((long)unaff_x27 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) goto code_r0x00756120;
    }
    else {
      func_0x00734f74(lVar11,2);
    }
    goto code_r0x00756298;
  case 'L':
  case 'l':
    if ((*(byte *)((long)unaff_x28 + 1) >> 3 & 1) == 0) {
      if (*(char *)(unaff_x19 + 0xa16) == '\0') {
        if ((0xd < unaff_x20) && (((uint)*unaff_x27 >> 10 & 1) != 0)) goto code_r0x00755e04;
      }
      else if (0xd < unaff_x20) {
code_r0x00755e04:
        iVar5 = func_0x0077e76c("Last-Modified:");
        if (iVar5 != 0) {
          uVar8 = func_0x0076de98(unaff_x21 + 0xe);
          *(undefined8 *)(unaff_x19 + 0x198) = uVar8;
          if ((*(byte *)((long)unaff_x27 + 1) >> 2 & 1) != 0) {
            *(undefined8 *)(&UNK_00001360 + unaff_x19) = uVar8;
          }
          goto code_r0x00756298;
        }
      }
    }
    if (((299 < (int)*(uint *)(unaff_x19 + 0x130)) && (8 < unaff_x20)) &&
       ((*(uint *)(unaff_x19 + 0x130) < 400 &&
        ((iVar5 = func_0x0077e76c("Location:"), iVar5 != 0 && (*(long *)(unaff_x19 + 0x1a0) == 0))))
       )) {
      pcVar6 = (char *)func_0x007529d0();
      if (pcVar6 == (char *)0x0) {
        return 0x1b;
      }
      if (*pcVar6 == '\0') {
        (*pcRam0000000000a2b5f0)();
      }
      else {
        *(char **)(unaff_x19 + 0x1a0) = pcVar6;
        if ((*unaff_x27 & 0x1000000) != 0) {
          lVar12 = (*pcRam0000000000a2b600)();
          *(long *)(unaff_x19 + 0x1a8) = lVar12;
          if (lVar12 == 0) {
            return 0x1b;
          }
          func_0x00752e58();
          *(uint *)(&UNK_00001344 + unaff_x19) = *(uint *)(&UNK_00001344 + unaff_x19) | 8;
        }
      }
    }
    break;
  case 'P':
  case 'p':
    if (0x10 < unaff_x20) {
      iVar5 = func_0x0077e76c("Proxy-Connection:");
      if (iVar5 != 0) {
        cVar4 = *(char *)(unaff_x19 + 0x139);
        if (cVar4 != '\n') {
code_r0x00755f14:
          if ((((cVar4 == '\v') && ((*(byte *)(lVar11 + 0x398) & 1) != 0)) &&
              ((iVar5 = func_0x0077e76c("Proxy-Connection:"), 0x16 < unaff_x20 &&
               ((iVar5 != 0 && (iVar5 = func_0x007537a0(), iVar5 != 0)))))) &&
             (func_0x00734f74(lVar11,1), *(char *)((long)unaff_x27 + 3) < '\0')) {
            if (*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18) != 0) {
              iVar5 = *(int *)(*(long *)(
                                        "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                        + unaff_x19 + 0x18) + 8);
joined_r0x00755f8c:
              if (iVar5 < 1) goto code_r0x00756298;
            }
            goto code_r0x00756120;
          }
          goto code_r0x00756298;
        }
        if (((((*(byte *)(lVar11 + 0x398) & 1) == 0) ||
             (iVar5 = func_0x0077e76c("Proxy-Connection:"), unaff_x20 < 0x1c)) || (iVar5 == 0)) ||
           (iVar5 = func_0x007537a0(), iVar5 == 0)) {
          cVar4 = *(char *)(unaff_x19 + 0x139);
          goto code_r0x00755f14;
        }
        func_0x00734f74(lVar11,0);
        if (-1 < *(char *)((long)unaff_x27 + 3)) goto code_r0x00756298;
        if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) != 0) {
          iVar5 = *(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x19 + 0x18) + 8);
          goto joined_r0x00755f8c;
        }
code_r0x00756120:
        func_0x0073cab8();
        goto code_r0x00756298;
      }
      if (((0x12 < unaff_x20) && (*(int *)(unaff_x19 + 0x130) == 0x197)) &&
         (iVar5 = func_0x0077e76c("Proxy-authenticate:"), iVar5 != 0)) {
        pcVar6 = (char *)func_0x007529d0();
        if (pcVar6 == (char *)0x0) {
          return 0x1b;
        }
        goto code_r0x00755b44;
      }
    }
    break;
  case 'R':
  case 'r':
    if ((0xb < unaff_x20) && (iVar5 = func_0x0077e76c("Retry-After:"), iVar5 != 0)) {
      uStack0000000000000010 = (undefined *)0x0;
      func_0x0077ed9c(unaff_x21 + 0xc,0,10,&uStack0000000000000010);
      puVar10 = uStack0000000000000010;
      if (uStack0000000000000010 == (undefined *)0x0) {
        lVar11 = func_0x0076de98(unaff_x21 + 0xc);
        lVar12 = _time(0);
        if ((lVar11 == -1) ||
           (puVar10 = (undefined *)(lVar11 - lVar12),
           (undefined *)(lVar11 - lVar12) == (undefined *)0x0 || lVar11 < lVar12)) {
          puVar10 = uStack0000000000000010;
        }
      }
      puVar1 = puVar10;
      if (&UNK_0000545f < puVar10) {
        puVar1 = &UNK_00005460;
      }
      puVar2 = (undefined *)0x0;
      if (-1 < (long)puVar10) {
        puVar2 = puVar1;
      }
      *(undefined **)(&UNK_000013a8 + unaff_x19) = puVar2;
      goto code_r0x00756298;
    }
    break;
  case 'S':
  case 's':
    if ((((*(long *)(unaff_x19 + 0xa28) != 0) && (10 < unaff_x20)) &&
        ((*(uint *)(&UNK_00001344 + unaff_x19) >> 0xd & 1) != 0)) &&
       (iVar5 = func_0x0077e76c("Set-Cookie:"), iVar5 != 0)) {
      lVar12 = *(long *)("/usr/lib/libobjc.A.dylib" + unaff_x19 + 0x18);
      if (lVar12 == 0) {
        lVar12 = *(long *)(lVar11 + 0x68);
      }
      if ((((*(uint *)(*(long *)(lVar11 + 0x3a0) + 0x94) & 0x80000002) == 0) &&
          (iVar5 = func_0x0077e6f8("localhost",lVar12), iVar5 == 0)) &&
         (iVar5 = _strcmp(lVar12,"127.0.0.1"), iVar5 != 0)) {
        _strcmp(lVar12,"::1");
      }
      func_0x00779cfc();
      func_0x00738578();
      func_0x00779d40();
      goto code_r0x00756298;
    }
    if ((((*(long *)(unaff_x19 + 0xa30) != 0) &&
         (iVar5 = func_0x007315f4(lVar11,0), 0x19 < unaff_x20)) &&
        ((iVar5 != 0 &&
         (((iVar5 = func_0x0077e76c("Strict-Transport-Security:"), iVar5 != 0 &&
           (iVar5 = func_0x00750940(*(undefined8 *)(unaff_x19 + 0xa30),
                                    *(undefined8 *)(lVar11 + 0x68),unaff_x21 + 0x1a), iVar5 != 0))
          && (*(char *)((long)unaff_x27 + 3) < '\0')))))) &&
       ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                  unaff_x19 + 0x18) == 0 ||
        (0 < *(int *)(*(long *)(
                               "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                               + unaff_x19 + 0x18) + 8))))) {
      func_0x0073cab8();
    }
    break;
  case 'T':
  case 't':
    if ((((*(byte *)((long)unaff_x28 + 1) >> 3 & 1) == 0) && ((char)unaff_x27[0x125] != '\x05')) &&
       ((0x11 < unaff_x20 && (*(int *)(unaff_x19 + 0x130) != 0x130)))) {
      iVar5 = func_0x0077e76c("Transfer-Encoding:");
      if (iVar5 != 0) {
        uVar8 = func_0x00737310();
        if ((int)uVar8 != 0) {
          return uVar8;
        }
        if (((*(byte *)((long)unaff_x28 + 1) >> 4 & 1) == 0) &&
           ((*(byte *)((long)unaff_x27 + 3) >> 1 & 1) != 0)) {
          func_0x00734f74(lVar11,1);
          *unaff_x28 = *unaff_x28 | 0x4000;
        }
        goto code_r0x00756298;
      }
    }
    else if (unaff_x20 < 8) break;
    iVar5 = func_0x0077e76c("Trailer:");
    if (iVar5 != 0) {
      *unaff_x28 = *unaff_x28 | 0x2000;
      goto code_r0x00756298;
    }
    break;
  case 'W':
  case 'w':
    if (((unaff_x20 < 0x11) || (*(int *)(unaff_x19 + 0x130) != 0x191)) ||
       (iVar5 = func_0x0077e76c("WWW-Authenticate:"), iVar5 == 0)) break;
    pcVar6 = (char *)func_0x007529d0();
    if (pcVar6 == (char *)0x0) {
      return 0x1b;
    }
code_r0x00755b44:
    func_0x0075350c();
code_r0x00755b58:
    (*pcRam0000000000a2b5f0)(pcVar6);
    goto code_r0x00756298;
  }
code_r0x00756278:
  if (((*(byte *)(*(long *)(lVar11 + 0x3a0) + 0x96) >> 2 & 1) == 0) ||
     (uVar8 = func_0x00772898(), (int)uVar8 == 0)) {
code_r0x00756298:
    func_0x0073c8fc();
    uVar8 = func_0x007738a0();
    if ((int)uVar8 == 0) {
      uVar8 = func_0x00754e80();
    }
  }
  return uVar8;
}


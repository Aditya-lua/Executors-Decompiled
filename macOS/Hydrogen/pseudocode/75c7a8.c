
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0075c7a8(void)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  uint in_w8;
  undefined4 uVar7;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  ulong unaff_x23;
  ulong unaff_x25;
  byte *pbVar8;
  byte *unaff_x26;
  long unaff_x27;
  long lVar9;
  ulong uVar10;
  long unaff_x28;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000058;
  
code_r0x0075c7a8:
  if (in_w8 - 0x30 < 10) {
    if (*(byte *)(unaff_x27 + 0x25) - 0x30 < 10) {
      lVar9 = 0x14;
    }
    else {
      lVar9 = 0x13;
    }
  }
  else {
    lVar9 = 0x12;
  }
code_r0x0075cd54:
  if (unaff_x26[lVar9] == 0x5d) {
    func_0x0074066c(&uStack0000000000000038,0x14);
    iVar1 = func_0x0074075c(&uStack0000000000000038,unaff_x26,lVar9);
    if (iVar1 != 0) {
      return 0x1b;
    }
    (*pcRam0000000000a2b5f0)(*(undefined8 *)(unaff_x28 + 0x4d0));
    *(undefined8 *)(unaff_x28 + 0x4d0) = 0;
    uVar6 = func_0x00740a58(&uStack0000000000000038);
    *(undefined8 *)(unaff_x28 + 0x4d0) = uVar6;
  }
code_r0x0075cb30:
  iVar1 = *(int *)(unaff_x21 + 0x4d8);
code_r0x0075cb34:
  if ((iVar1 == 0) || (uVar3 = func_0x0076e6e0(), (uVar3 & 1) == 0)) {
    return 0;
  }
code_r0x0075c320:
  uVar6 = func_0x0076e374();
  if ((int)uVar6 != 0) {
    return uVar6;
  }
  if (in_stack_00000030._4_4_ == -1) {
    return 8;
  }
  if (in_stack_00000030._4_4_ == 0) {
    return 0;
  }
  switch(*(undefined4 *)(unaff_x21 + 0x4d8)) {
  case 1:
    lVar9 = *(long *)(unaff_x19 + 0x18);
    if (in_stack_00000030._4_4_ != 1) {
      if (in_stack_00000030._4_4_ != 3) {
        func_0x0073c9e4();
        return 8;
      }
      *(byte *)(lVar9 + 0x4e3) = *(byte *)(lVar9 + 0x4e3) | 2;
      if ((*(char *)(in_stack_00000010 + 3) < '\0') &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))) {
        func_0x0073cab8();
      }
    }
    *(undefined2 *)(lVar9 + 0x4a0) = 0;
    *(undefined2 *)(lVar9 + 0x4a4) = 0;
    *(byte *)(lVar9 + 0x4e3) = *(byte *)(lVar9 + 0x4e3) & 0xfb;
    uVar6 = func_0x0075d338();
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 2;
    goto code_r0x0075cb30;
  case 2:
    lVar2 = *(long *)(unaff_x19 + 0x18);
    lVar9 = func_0x00740a58(lVar2 + 0x448);
    if (in_stack_00000030._4_4_ == 0x2a) {
      pbVar8 = (byte *)(lVar9 + 2);
      goto code_r0x0075c460;
    }
    if ((*(char *)(unaff_x19 + 0xa14) != '\0') &&
       (uVar3 = func_0x007315f4(lVar2,0), (uVar3 & 1) == 0)) {
      if ((in_stack_00000030._4_4_ == 1) && ((*(byte *)(lVar2 + 0x4e3) & 6) == 4)) {
        uVar6 = func_0x0075d338();
        if ((int)uVar6 != 0) {
          return uVar6;
        }
        *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 3;
        goto code_r0x0075cb30;
      }
      if (1 < *(byte *)(unaff_x19 + 0xa14)) goto code_r0x0075ce44;
    }
    uVar6 = func_0x0075d434();
    break;
  case 3:
    if (*(long *)(*(long *)(unaff_x19 + 0x18) + 0x468) != 0) {
      return 8;
    }
    if (in_stack_00000030._4_4_ == 1) {
      *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 4;
    }
    else {
      if (*(char *)(unaff_x19 + 0xa14) != '\x01') {
code_r0x0075ce44:
        func_0x0073c9e4();
        return 0x40;
      }
      uVar6 = func_0x0075d434();
      if ((int)uVar6 != 0) {
        return uVar6;
      }
    }
    iVar1 = *(int *)(unaff_x21 + 0x4d8);
    if (iVar1 == 4) goto code_r0x0075c25c;
    goto code_r0x0075cb34;
  default:
    goto code_r0x0075c964;
  case 5:
    uVar6 = func_0x0073bd40(in_stack_00000018);
    if ((int)uVar6 == 0) {
      if ((int)uStack0000000000000038 == 0) {
        if (((*(byte *)(unaff_x21 + 0x4e3) >> 3 & 1) == 0) &&
           ((*(byte *)(unaff_x21 + 0x4e1) & 1) != 0)) {
          uVar7 = 0;
          if (*(long *)((long)&linkedit_data_command_00001318.cmd + unaff_x19) != 0) {
            uVar4 = func_0x0075d62c(*(undefined8 *)(unaff_x21 + 0x1e0),0);
            uVar5 = func_0x0075d62c(*(undefined8 *)(unaff_x21 + 0x1e8),0);
            uVar6 = func_0x0075d338();
            (*pcRam0000000000a2b5f0)(uVar4);
            (*pcRam0000000000a2b5f0)(uVar5);
            if ((int)uVar6 != 0) break;
            uVar7 = 6;
          }
          uVar6 = 0;
          *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = uVar7;
        }
        else {
          func_0x0073c9e4();
          uVar6 = 0x43;
        }
      }
      else {
        if ((int)uStack0000000000000038 == 2) {
code_r0x0075c638:
          uVar6 = 0;
          goto code_r0x0075ca94;
        }
        uVar6 = 0;
      }
    }
    break;
  case 6:
    if (in_stack_00000030._4_4_ != 1) {
code_r0x0075ce2c:
      func_0x0073c9e4();
      return 0x43;
    }
    goto code_r0x0075c964;
  case 7:
  case 0xd:
    func_0x00740a58(*(long *)(unaff_x19 + 0x18) + 0x448);
    if (in_stack_00000030._4_4_ == 1) goto code_r0x0075c964;
    if (in_stack_00000030._4_4_ != 0x2a) {
      return 0x15;
    }
    uVar6 = func_0x007738a0();
    break;
  case 8:
    unaff_x28 = *(long *)(unaff_x19 + 0x18);
    lVar9 = *(long *)(unaff_x19 + 0x1b0);
    unaff_x27 = func_0x00740a58(unaff_x28 + 0x448);
    if (in_stack_00000030._4_4_ != 1) {
      if (in_stack_00000030._4_4_ != 0x2a) goto code_r0x0075ce2c;
      iVar1 = func_0x0077e76c(unaff_x27 + 2,"OK [UIDVALIDITY ",0x10);
      if ((iVar1 == 0) || (unaff_x26 = (byte *)(unaff_x27 + 0x12), *unaff_x26 - 0x3a < 0xfffffff6))
      goto code_r0x0075cb30;
      if (9 < *(byte *)(unaff_x27 + 0x13) - 0x30) {
        lVar9 = 1;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x14) - 0x30) {
        lVar9 = 2;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x15) - 0x30) {
        lVar9 = 3;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x16) - 0x30) {
        lVar9 = 4;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x17) - 0x30) {
        lVar9 = 5;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x18) - 0x30) {
        lVar9 = 6;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x19) - 0x30) {
        lVar9 = 7;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x1a) - 0x30) {
        lVar9 = 8;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x1b) - 0x30) {
        lVar9 = 9;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x1c) - 0x30) {
        lVar9 = 10;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x1d) - 0x30) {
        lVar9 = 0xb;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x1e) - 0x30) {
        lVar9 = 0xc;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x1f) - 0x30) {
        lVar9 = 0xd;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x20) - 0x30) {
        lVar9 = 0xe;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x21) - 0x30) {
        lVar9 = 0xf;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x22) - 0x30) {
        lVar9 = 0x10;
        goto code_r0x0075cd54;
      }
      if (9 < *(byte *)(unaff_x27 + 0x23) - 0x30) {
        lVar9 = 0x11;
        goto code_r0x0075cd54;
      }
      in_w8 = (uint)*(byte *)(unaff_x27 + 0x24);
      goto code_r0x0075c7a8;
    }
    if (((*(long *)(lVar9 + 0x10) != 0) && (*(long *)(unaff_x28 + 0x4d0) != 0)) &&
       (iVar1 = func_0x0077e6f8(), iVar1 == 0)) {
      func_0x0073c9e4();
      return 0x4e;
    }
    lVar2 = (*pcRam0000000000a2b600)(*(undefined8 *)(lVar9 + 8));
    *(long *)(unaff_x28 + 0x4c8) = lVar2;
    if (lVar2 == 0) {
      return 0x1b;
    }
    if (*(long *)(lVar9 + 0x40) != 0) {
      if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x40) == 0) {
        lVar9 = *(long *)(*(long *)(unaff_x19 + 0x1b0) + 8);
        if (lVar9 == 0) {
          lVar9 = (*pcRam0000000000a2b600)("");
        }
        else {
          lVar9 = func_0x0075d62c(lVar9,1);
        }
        if (lVar9 == 0) {
          return 0x1b;
        }
        uVar6 = func_0x0075d338();
        (*pcRam0000000000a2b5f0)(lVar9);
        iVar1 = (int)uVar6;
      }
      else {
        uVar6 = func_0x0075d338();
        iVar1 = (int)uVar6;
      }
      if (iVar1 != 0) {
        return uVar6;
      }
      *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 7;
      goto code_r0x0075cb30;
    }
    if (*(long *)(lVar9 + 0x38) != 0) {
      if (*(long *)(*(long *)(unaff_x19 + 0x1b0) + 0x38) == 0) {
        func_0x0073c9e4();
        return 3;
      }
      uVar6 = func_0x0075d338();
      if ((int)uVar6 != 0) {
        return uVar6;
      }
      *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 0xd;
      goto code_r0x0075cb30;
    }
    uVar6 = func_0x0075d770();
    break;
  case 9:
    uVar6 = func_0x00740a58(*(long *)(unaff_x19 + 0x18) + 0x448);
    uStack0000000000000038 = 0;
    if (in_stack_00000030._4_4_ == 0x2a) {
      lVar9 = _memchr(uVar6,0x7b);
      if ((((lVar9 == 0) ||
           (iVar1 = func_0x0077ed9c(lVar9 + 1,&uStack0000000000000058,10,&uStack0000000000000038),
           iVar1 != 0)) || ((long)uStack0000000000000058 - lVar9 < 2)) ||
         (*uStack0000000000000058 != '}')) {
        func_0x0073c9e4();
        uVar6 = 8;
      }
      else {
        if ((*(char *)(in_stack_00000010 + 3) < '\0') &&
           ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                      unaff_x19 + 0x18) == 0 ||
            (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8))))) {
          func_0x0073cab8();
        }
        func_0x00770554();
        uVar3 = *(ulong *)(unaff_x21 + 0x468);
        if (uVar3 != 0) {
          func_0x007406c8(in_stack_00000020,uVar3);
          *(undefined8 *)(unaff_x21 + 0x470) = 0;
          if (uStack0000000000000038 <= uVar3) {
            uVar3 = uStack0000000000000038;
          }
          if (uVar3 == 0) goto code_r0x0075c638;
          func_0x00740a58(in_stack_00000020);
          uVar6 = func_0x007738a0();
          if ((int)uVar6 != 0) break;
          if ((*(char *)(in_stack_00000010 + 3) < '\0') &&
             ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                        + unaff_x19 + 0x18) == 0 ||
              (0 < *(int *)(*(long *)(
                                     "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                     + unaff_x19 + 0x18) + 8))))) {
            func_0x0073cab8();
          }
          lVar9 = *(ulong *)(unaff_x21 + 0x468) - uVar3;
          if (*(ulong *)(unaff_x21 + 0x468) < uVar3 || lVar9 == 0) {
            *(undefined8 *)(unaff_x21 + 0x468) = 0;
            func_0x007406b0(in_stack_00000020);
          }
          else {
            *(long *)(unaff_x21 + 0x468) = lVar9;
            func_0x007406c8(in_stack_00000020);
          }
        }
        if (*(ulong *)(unaff_x19 + 0xf8) == uStack0000000000000038) {
          func_0x00783c98();
          uVar6 = 0;
        }
        else {
          *(ulong *)(unaff_x19 + 0xf0) = uStack0000000000000038;
          *(char *)(in_stack_00000010 + 0x929) = (char)unaff_x22;
          func_0x00783e98();
          uVar6 = 0;
        }
      }
    }
    else {
      func_0x00770554();
      uVar6 = 0x4e;
    }
code_r0x0075ca94:
    *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 0;
    break;
  case 10:
    if (in_stack_00000030._4_4_ != 1) {
      return 8;
    }
    goto code_r0x0075c964;
  case 0xb:
    if (in_stack_00000030._4_4_ != 0x2b) {
      return 0x19;
    }
    func_0x00770580();
    func_0x00783e98();
    goto code_r0x0075c964;
  case 0xc:
    if (in_stack_00000030._4_4_ != 1) {
      return 0x19;
    }
code_r0x0075c964:
    *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 0;
    goto code_r0x0075cb30;
  }
  if ((int)uVar6 != 0) {
    return uVar6;
  }
  goto code_r0x0075cb30;
code_r0x0075c25c:
  uStack0000000000000038 = uStack0000000000000038 & 0xffffffffffffff00;
  uVar3 = func_0x007315f4();
  if ((uVar3 & 1) == 0) {
    uVar6 = func_0x00794ee8();
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    *(undefined **)(unaff_x21 + 0x3a0) = &UNK_00a1eb70;
    *(ulong *)(unaff_x21 + 0x398) = *(ulong *)(unaff_x21 + 0x398) | 0x8000000;
  }
  uVar6 = func_0x007311c4();
  if ((int)uVar6 != 0) {
    return uVar6;
  }
  if ((char)uStack0000000000000038 != '\0') {
    *(undefined2 *)(unaff_x21 + 0x4a0) = 0;
    *(undefined2 *)(unaff_x21 + 0x4a4) = 0;
    *(byte *)(unaff_x21 + 0x4e3) = *(byte *)(unaff_x21 + 0x4e3) & 0xfb | 1;
    uVar6 = func_0x0075d338();
    if ((int)uVar6 != 0) {
      return uVar6;
    }
    *(undefined4 *)(*(long *)(unaff_x19 + 0x18) + 0x4d8) = 2;
  }
  if (*(int *)(unaff_x21 + 0x4d8) == 4) {
    return 0;
  }
  if (*(long *)(unaff_x21 + 0x400) != 0) {
    uVar6 = func_0x0076e5ec();
    return uVar6;
  }
  unaff_x22 = 1;
  unaff_x25 = 0x100002601;
  unaff_x23 = 0x100002600;
  goto code_r0x0075c320;
code_r0x0075c460:
  uVar3 = (ulong)*pbVar8;
  if (0x20 < *pbVar8) {
code_r0x0075c484:
    uVar10 = 0;
    while ((0x20 < (uint)uVar3 || ((unaff_x22 << (uVar3 & 0x3f) & unaff_x25) == 0))) {
      uVar3 = (ulong)pbVar8[uVar10 + 1];
      uVar10 = uVar10 + 1;
    }
    if (uVar10 == 7) {
      if (!(*(int *)pbVar8 != 0x4c534153 || *(int *)(pbVar8 + 3) != 0x52492d4c)) {
        *(byte *)(lVar2 + 0x4e3) = *(byte *)(lVar2 + 0x4e3) | 0x10;
        pbVar8 = pbVar8 + 7;
        goto code_r0x0075c460;
      }
code_r0x0075c590:
      if (*(int *)pbVar8 == 0x48545541 && pbVar8[4] == 0x3d) {
        pbVar8 = pbVar8 + 5;
        iVar1 = func_0x0073ada4(pbVar8,uVar10 - 5,&uStack0000000000000038);
        if ((iVar1 != 0) && (uStack0000000000000038 + 5 == uVar10)) {
          *(ushort *)(lVar2 + 0x4a0) = *(ushort *)(lVar2 + 0x4a0) | (ushort)iVar1;
        }
        uVar10 = uVar10 - 5;
      }
    }
    else {
      if (uVar10 == 0xd) {
        if (!(*(long *)pbVar8 == 0x5349444e49474f4c && *(long *)(pbVar8 + 5) == 0x44454c4241534944))
        goto code_r0x0075c590;
        *(byte *)(lVar2 + 0x4e3) = *(byte *)(lVar2 + 0x4e3) | 8;
        pbVar8 = pbVar8 + 0xd;
        goto code_r0x0075c460;
      }
      if (uVar10 == 8) {
        if (*(long *)pbVar8 != 0x534c545452415453) goto code_r0x0075c590;
        *(byte *)(lVar2 + 0x4e3) = *(byte *)(lVar2 + 0x4e3) | 4;
        pbVar8 = pbVar8 + 8;
        goto code_r0x0075c460;
      }
      if (5 < uVar10) goto code_r0x0075c590;
    }
    pbVar8 = pbVar8 + uVar10;
    goto code_r0x0075c460;
  }
  if ((unaff_x22 << (uVar3 & 0x3f) & unaff_x23) == 0) {
    if (uVar3 != 0) goto code_r0x0075c484;
    goto code_r0x0075cb30;
  }
  pbVar8 = pbVar8 + 1;
  goto code_r0x0075c460;
}


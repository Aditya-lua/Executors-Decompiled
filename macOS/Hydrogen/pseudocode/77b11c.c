
/* WARNING: Removing unreachable block (ram,0x0077b9ac) */
/* WARNING: Removing unreachable block (ram,0x0077b4b8) */
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_0077b11c(void)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x22;
  long unaff_x23;
  long lVar6;
  undefined8 *unaff_x25;
  byte *pbVar7;
  long unaff_x27;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  
code_r0x0077b11c:
  if ((*(char *)((long)unaff_x25 + 3) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)))) {
    func_0x0073d0f4();
  }
LAB_0077b174:
  *(undefined4 *)(unaff_x23 + 0x4a8) = 2;
code_r0x0077b17c:
  if (*(int *)(unaff_x20 + 0x4a8) == 5) {
    return 0;
  }
  if (*(long *)(unaff_x20 + 0x400) != 0) {
    uVar3 = func_0x0076e5ec();
    return uVar3;
  }
code_r0x0077b198:
  uVar3 = func_0x0076e374();
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  iVar2 = *(int *)(unaff_x20 + 0x4a8);
  if (iVar2 != 0xc && in_stack_00000020._4_4_ != 1) {
    *(int *)(&UNK_00001350 + unaff_x19) = in_stack_00000020._4_4_;
  }
  if (in_stack_00000020._4_4_ == 0) {
    return 0;
  }
  switch(iVar2) {
  case 1:
    if (99 < in_stack_00000020._4_4_ - 200U) goto code_r0x0077bbd8;
    lVar6 = *(long *)(unaff_x19 + 0x18);
    *(undefined2 *)(lVar6 + 0x4a0) = 0;
    *(undefined2 *)(lVar6 + 0x4a4) = 0;
    *(byte *)(lVar6 + 0x4b8) = *(byte *)(lVar6 + 0x4b8) & 0xed;
    uVar3 = func_0x0076e34c();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    lVar6 = *(long *)(unaff_x19 + 0x18);
    if ((((*(int *)(lVar6 + 0x4a8) != 2) && (*(char *)((long)unaff_x25 + 3) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar6 + 0x4a8) = 2;
    break;
  case 2:
    lVar6 = func_0x00740a58(unaff_x22);
    uVar4 = *(ulong *)(unaff_x20 + 0x470);
    if ((in_stack_00000020._4_4_ == 1) || (0xffffff9b < in_stack_00000020._4_4_ - 300U)) {
      uVar1 = uVar4 - 4;
      if (uVar4 < 4) goto code_r0x0077bbd8;
      if (uVar1 < 8) {
        if (3 < uVar1) {
          if (*(int *)(lVar6 + 4) == 0x455a4953) goto code_r0x0077ba14;
          if (4 < uVar1) goto code_r0x0077b860;
        }
      }
      else if (*(long *)(lVar6 + 4) == 0x534c545452415453) {
        *(byte *)(unaff_x20 + 0x4b8) = *(byte *)(unaff_x20 + 0x4b8) | 2;
      }
      else if (*(int *)(lVar6 + 4) == 0x455a4953) {
code_r0x0077ba14:
        *(byte *)(unaff_x20 + 0x4b8) = *(byte *)(unaff_x20 + 0x4b8) | 4;
      }
      else if (*(long *)(lVar6 + 4) == 0x3846545550544d53) {
        *(byte *)(unaff_x20 + 0x4b8) = *(byte *)(unaff_x20 + 0x4b8) | 8;
      }
      else {
code_r0x0077b860:
        if (*(int *)(lVar6 + 4) == 0x48545541 && *(char *)(lVar6 + 8) == ' ') {
          *(byte *)(unaff_x20 + 0x4b8) = *(byte *)(unaff_x20 + 0x4b8) | 0x10;
          lVar5 = uVar4 - 9;
          if (lVar5 != 0) {
            pbVar7 = (byte *)(lVar6 + 9);
            do {
              while (!(0x20 < *pbVar7 || (1L << ((ulong)*pbVar7 & 0x3f) & 0x100002600U) == 0)) {
                pbVar7 = pbVar7 + 1;
                lVar5 = lVar5 + -1;
                if (lVar5 == 0) goto joined_r0x0077ba24;
              }
              lVar6 = 0;
              do {
                if (pbVar7[lVar6] < 0x21 &&
                    (1L << ((ulong)pbVar7[lVar6] & 0x3f) & 0x100002600U) != 0)
                goto code_r0x0077b900;
                lVar6 = lVar6 + 1;
              } while (lVar5 != lVar6);
              lVar6 = lVar5;
code_r0x0077b900:
              iVar2 = func_0x0073ada4(pbVar7,lVar6,&uStack0000000000000028);
              if ((iVar2 != 0) &&
                 (CONCAT44(uStack0000000000000028._4_4_,(uint)uStack0000000000000028) == lVar6)) {
                *(ushort *)(unaff_x20 + 0x4a0) = *(ushort *)(unaff_x20 + 0x4a0) | (ushort)iVar2;
              }
              pbVar7 = pbVar7 + lVar6;
              lVar5 = lVar5 - lVar6;
            } while (lVar5 != 0);
          }
        }
      }
joined_r0x0077ba24:
      if (in_stack_00000020._4_4_ != 1) {
        if ((*(char *)(unaff_x19 + 0xa14) != '\0') && (uVar4 = func_0x007315f4(), (uVar4 & 1) == 0))
        {
          if ((*(byte *)(unaff_x20 + 0x4b8) >> 1 & 1) != 0) {
            uVar3 = func_0x0077bd4c();
            goto code_r0x0077b714;
          }
          if (*(char *)(unaff_x19 + 0xa14) != '\x01') {
code_r0x0077bc04:
            func_0x0073c9e4();
            return 0x40;
          }
        }
        uVar3 = func_0x0077be38();
        goto code_r0x0077b714;
      }
    }
    else {
      if ((1 < *(byte *)(unaff_x19 + 0xa14)) && (iVar2 = func_0x007315f4(), iVar2 == 0))
      goto code_r0x0077bb74;
      *(undefined2 *)(unaff_x20 + 0x4a4) = 0;
      uVar3 = func_0x0076e34c();
      if ((int)uVar3 != 0) {
        return uVar3;
      }
      lVar6 = *(long *)(unaff_x19 + 0x18);
      if ((((*(int *)(lVar6 + 0x4a8) != 3) && (*(char *)((long)unaff_x25 + 3) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
        func_0x0073d0f4();
      }
      *(undefined4 *)(lVar6 + 0x4a8) = 3;
    }
    break;
  case 3:
    if (99 < in_stack_00000020._4_4_ - 200U) {
code_r0x0077bb74:
      func_0x0073c9e4();
      return 9;
    }
  default:
    lVar6 = *(long *)(unaff_x19 + 0x18);
joined_r0x0077b55c:
    if (((((unaff_x19 != 0) && (*(int *)(lVar6 + 0x4a8) != 0)) &&
         (*(char *)((long)unaff_x25 + 3) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar6 + 0x4a8) = 0;
    break;
  case 4:
    goto code_r0x0077b394;
  case 6:
    uVar3 = func_0x0073bd40(*(long *)(unaff_x19 + 0x18) + 0x488);
    if ((int)uVar3 != 0) goto code_r0x0077b714;
    if ((uint)uStack0000000000000028 == 0) {
      func_0x0073c9e4();
      return 0x43;
    }
    if ((uint)uStack0000000000000028 == 2) {
      lVar6 = *(long *)(unaff_x19 + 0x18);
      if ((((*(int *)(lVar6 + 0x4a8) != 0) && (*(char *)((long)unaff_x25 + 3) < '\0')) &&
          ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                     unaff_x19 + 0x18) == 0 ||
           (0 < *(int *)(*(long *)(
                                  "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                  + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
        func_0x0073d0f4();
      }
      *(undefined4 *)(lVar6 + 0x4a8) = 0;
    }
    break;
  case 7:
    lVar6 = *(long *)(unaff_x19 + 0x1b0);
    func_0x00740a58(*(long *)(unaff_x19 + 0x18) + 0x448);
    if ((in_stack_00000020._4_4_ - 300U < 0xffffff9c) && (*(long *)(lVar6 + 0x10) != 0)) {
      if ((in_stack_00000020._4_4_ != 1) && (in_stack_00000020._4_4_ != 0x229))
      goto code_r0x0077bbd8;
    }
    else if (((in_stack_00000020._4_4_ - 300U < 0xffffff9c) && (in_stack_00000020._4_4_ != 1)) &&
            (*(long *)(lVar6 + 0x10) == 0)) {
code_r0x0077bbd8:
      func_0x0073c9e4();
      return 8;
    }
    if ((*(byte *)(unaff_x27 + 2) >> 1 & 1) != 0) {
      uVar3 = 0;
      if (in_stack_00000020._4_4_ != 1) goto code_r0x0077b73c;
      goto code_r0x0077b714;
    }
    uVar3 = func_0x007738a0();
    if (in_stack_00000020._4_4_ == 1) goto code_r0x0077b714;
code_r0x0077b73c:
    if (*(long *)(lVar6 + 0x10) == 0) {
      lVar6 = *(long *)(unaff_x19 + 0x18);
      if ((*(int *)(lVar6 + 0x4a8) != 0) && (*(char *)((long)unaff_x25 + 3) < '\0')) {
        lVar5 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
joined_r0x0077b960:
        if (((lVar5 == 0) || (0 < *(int *)(lVar5 + 8))) && (0 < iRam0000000000a2b580)) {
          func_0x0073d0f4();
        }
      }
    }
    else {
      lVar5 = *(long *)(*(long *)(lVar6 + 0x10) + 8);
      *(long *)(lVar6 + 0x10) = lVar5;
      if (lVar5 != 0) {
        uVar3 = func_0x0077c00c();
        goto code_r0x0077b714;
      }
      lVar6 = *(long *)(unaff_x19 + 0x18);
      if ((*(int *)(lVar6 + 0x4a8) != 0) && (*(char *)((long)unaff_x25 + 3) < '\0')) {
        lVar5 = *(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + unaff_x19 + 0x18);
        goto joined_r0x0077b960;
      }
    }
    *(undefined4 *)(lVar6 + 0x4a8) = 0;
    iVar2 = (int)uVar3;
    goto joined_r0x0077ba0c;
  case 8:
    if (99 < in_stack_00000020._4_4_ - 200U) {
code_r0x0077bc24:
      func_0x0073c9e4();
      return 0x37;
    }
code_r0x0077b708:
    uVar3 = func_0x0077c2a8();
code_r0x0077b714:
    iVar2 = (int)uVar3;
joined_r0x0077ba0c:
    if (iVar2 != 0) {
      return uVar3;
    }
    break;
  case 9:
    lVar6 = *(long *)(unaff_x19 + 0x1b0);
    if (in_stack_00000020._4_4_ - 200U < 100) {
      *(byte *)(lVar6 + 0x28) = *(byte *)(lVar6 + 0x28) | 1;
    }
    else {
      uVar3 = *unaff_x25;
      *(int *)(lVar6 + 0x18) = in_stack_00000020._4_4_;
      if (((uint)uVar3 >> 2 & 1) == 0) goto code_r0x0077bc24;
    }
    lVar5 = *(long *)(*(long *)(lVar6 + 0x10) + 8);
    *(long *)(lVar6 + 0x10) = lVar5;
    if (lVar5 != 0) goto code_r0x0077b708;
    if ((*(byte *)(lVar6 + 0x28) & 1) == 0) goto code_r0x0077bc24;
    uVar3 = func_0x0076e34c();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    lVar6 = *(long *)(unaff_x19 + 0x18);
    if ((((*(int *)(lVar6 + 0x4a8) != 10) && (*(char *)((long)unaff_x25 + 3) < '\0')) &&
        ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar6 + 0x4a8) = 10;
    break;
  case 10:
    if (in_stack_00000020._4_4_ != 0x162) goto code_r0x0077bc24;
    func_0x00770580();
    func_0x00783e98();
    lVar6 = *(long *)(unaff_x19 + 0x18);
    goto joined_r0x0077b55c;
  case 0xb:
    lVar6 = *(long *)(unaff_x19 + 0x18);
    if ((((unaff_x19 != 0) && (*(int *)(lVar6 + 0x4a8) != 0)) &&
        ((*(char *)((long)unaff_x25 + 3) < '\0' &&
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) == 0 ||
          (0 < *(int *)(*(long *)(
                                 "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                 + unaff_x19 + 0x18) + 8))))))) && (0 < iRam0000000000a2b580)) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar6 + 0x4a8) = 0;
    if (in_stack_00000020._4_4_ != 0xfa) {
      return 8;
    }
  }
  iVar2 = *(int *)(unaff_x20 + 0x4a8);
code_r0x0077b71c:
  if (iVar2 == 0) {
    return 0;
  }
  uVar4 = func_0x0076e6e0();
  if ((uVar4 & 1) == 0) {
    return 0;
  }
  goto code_r0x0077b198;
code_r0x0077b394:
  lVar6 = *(long *)(unaff_x19 + 0x18);
  if (*(long *)(lVar6 + 0x468) != 0) {
    return 8;
  }
  if (in_stack_00000020._4_4_ == 0xdc) {
    if (((*(int *)(lVar6 + 0x4a8) != 5) && (*(char *)((long)unaff_x25 + 3) < '\0')) &&
       (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                   unaff_x19 + 0x18) == 0 ||
         (0 < *(int *)(*(long *)(
                                "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b580)))) {
      func_0x0073d0f4();
    }
    *(undefined4 *)(lVar6 + 0x4a8) = 5;
  }
  else {
    if (*(char *)(unaff_x19 + 0xa14) != '\x01') goto code_r0x0077bc04;
    uVar3 = func_0x0077be38();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
  }
  iVar2 = *(int *)(unaff_x20 + 0x4a8);
  if (iVar2 != 5) goto code_r0x0077b71c;
  lVar6 = *(long *)(unaff_x19 + 0x18);
  uStack0000000000000028._0_4_ = (uint)uStack0000000000000028 & 0xffffff00;
  uVar4 = func_0x007315f4(lVar6,0);
  if ((uVar4 & 1) == 0) {
    uVar3 = func_0x00794ee8();
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    *(undefined **)(lVar6 + 0x3a0) = &UNK_00a1f688;
    *(ulong *)(lVar6 + 0x398) = *(ulong *)(lVar6 + 0x398) | 0x8000000;
  }
  uVar3 = func_0x007311c4();
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  if ((char)uStack0000000000000028 != '\0') goto code_r0x0077b0c4;
  goto code_r0x0077b17c;
code_r0x0077b0c4:
  *(byte *)(lVar6 + 0x4b8) = *(byte *)(lVar6 + 0x4b8) | 1;
  lVar6 = *(long *)(unaff_x19 + 0x18);
  *(undefined2 *)(lVar6 + 0x4a0) = 0;
  *(undefined2 *)(lVar6 + 0x4a4) = 0;
  *(byte *)(lVar6 + 0x4b8) = *(byte *)(lVar6 + 0x4b8) & 0xed;
  uVar3 = func_0x0076e34c();
  if ((int)uVar3 != 0) {
    return uVar3;
  }
  unaff_x23 = *(long *)(unaff_x19 + 0x18);
  if (*(int *)(unaff_x23 + 0x4a8) != 2) goto code_r0x0077b11c;
  goto LAB_0077b174;
}


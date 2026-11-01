
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_00737654(void)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  uint uVar5;
  ulong uVar6;
  long unaff_x19;
  int unaff_w20;
  byte *unaff_x22;
  ulong unaff_x23;
  uint unaff_w24;
  ulong *unaff_x26;
  long lVar7;
  byte *pbVar8;
  ulong in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  
code_r0x00737654:
  bVar1 = unaff_w24 != 0;
  unaff_w24 = 0;
  if (bVar1) goto LAB_007376c8;
code_r0x00737660:
  if (((in_stack_00000030 & 0x100000000) == 0 && unaff_w24 == 0) &&
     (lVar3 = func_0x00774130(), lVar3 != 0)) {
code_r0x00737818:
    func_0x0073c9e4();
    return 0x3d;
  }
LAB_007376d8:
  uVar4 = func_0x00773f84(&uStack0000000000000048);
  if ((*(char *)((long)unaff_x26 + 3) < '\0') &&
     (((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0 ||
       (0 < *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8))) && (0 < iRam0000000000a2b560)))) {
    func_0x0073ce84();
  }
  if ((int)uVar4 != 0) {
    return uVar4;
  }
  uVar4 = func_0x007740b0();
  if ((int)uVar4 != 0) {
    func_0x00774044();
    return uVar4;
  }
  uVar6 = (ulong)*unaff_x22;
code_r0x00737758:
  pbVar8 = unaff_x22;
  if ((int)uVar6 == 0) {
    return 0;
  }
  for (; uVar6 = (ulong)*pbVar8, *pbVar8 < 0x2d && (1L << (uVar6 & 0x3f) & unaff_x23) != 0;
      pbVar8 = pbVar8 + 1) {
  }
  lVar3 = 0;
  lVar7 = 0;
  do {
    uVar5 = (uint)uVar6;
    if (uVar5 < 0x20) {
      if (uVar5 != 9) {
        if (uVar5 != 0) goto code_r0x007373b8;
        break;
      }
    }
    else if (uVar5 != 0x20) {
      if (uVar5 == 0x2c) break;
code_r0x007373b8:
      if (3 < uVar5 - 10) {
        lVar7 = lVar3 + 1;
      }
    }
    uVar6 = (ulong)pbVar8[lVar3 + 1];
    lVar3 = lVar3 + 1;
  } while( true );
  unaff_x22 = pbVar8 + lVar3;
  if (lVar7 != 0) goto code_r0x00737400;
  goto code_r0x00737758;
code_r0x00737400:
  if ((unaff_x19 != 0) && (*(char *)((long)unaff_x26 + 3) < '\0')) {
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
      if (0 < iRam0000000000a2b560) goto code_r0x00737430;
    }
    else if (0 < *(int *)(*(long *)(
                                   "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                   + unaff_x19 + 0x18) + 8) && 0 < iRam0000000000a2b560) {
code_r0x00737430:
      func_0x0073ce84();
    }
  }
  if ((unaff_w20 == 0) || (lVar7 != 7)) {
    uVar6 = *unaff_x26;
    if (unaff_w20 != 0) {
      unaff_w24 = 0;
      if (((uint)uVar6 >> 0x19 & 1) == 0) goto code_r0x00737490;
      goto code_r0x00737494;
    }
    if ((uVar6 >> 0x26 & 1) != 0) goto code_r0x0073777c;
    lVar3 = func_0x00774084();
    if (lVar3 - 4U < 0xfffffffffffffffa || lVar3 == -2) goto code_r0x00737818;
    unaff_w24 = 0;
code_r0x00737558:
    iVar2 = func_0x0077e76c(pbVar8,"identity",lVar7);
    if (((iVar2 == 0) || ("identity"[lVar7] != '\0')) &&
       ((iVar2 = func_0x0077e76c(pbVar8,"none",lVar7), iVar2 == 0 || ("none"[lVar7] != '\0')))) {
      iVar2 = func_0x0077e76c(pbVar8,"deflate",lVar7);
      unaff_x23 = 0x100100000200;
      if ((((iVar2 == 0) || ("deflate"[lVar7] != '\0')) &&
          ((iVar2 = func_0x0077e76c(pbVar8,"gzip",lVar7), iVar2 == 0 || ("gzip"[lVar7] != '\0'))))
         && ((iVar2 = func_0x0077e76c(pbVar8,"x-gzip",lVar7), iVar2 == 0 ||
             ("x-gzip"[lVar7] != '\0')))) goto code_r0x00737660;
    }
joined_r0x007376c4:
    bVar1 = unaff_w24 == 0;
    unaff_x23 = 0x100100000200;
    unaff_w24 = 0;
    if (bVar1) goto code_r0x00737660;
LAB_007376c8:
    lVar3 = func_0x00774174();
    if (lVar3 == 0) goto LAB_007376d8;
    if (-1 < *(char *)((long)unaff_x26 + 3)) {
      return 0;
    }
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) {
joined_r0x0073785c:
      if (iRam0000000000a2b560 < 1) {
        return 0;
      }
      goto code_r0x00737868;
    }
    iVar2 = *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8);
  }
  else {
    iVar2 = func_0x0077e76c(pbVar8,"chunked",7);
    unaff_w24 = (uint)(iVar2 != 0);
    uVar6 = *unaff_x26;
    if (((uint)uVar6 >> 0x19 & 1) != 0) {
code_r0x00737494:
      lVar3 = func_0x00774084();
      if (lVar3 - 4U < 0xfffffffffffffffb) goto code_r0x00737818;
      iVar2 = func_0x0077e76c(pbVar8,in_stack_00000040,lVar7);
      if ((iVar2 != 0) && (*(char *)(in_stack_00000040 + lVar7) == '\0')) goto code_r0x00737654;
      if ((in_stack_00000038 == 0) ||
         ((iVar2 = func_0x0077e76c(pbVar8,in_stack_00000038,lVar7), iVar2 == 0 ||
          (*(char *)(in_stack_00000038 + lVar7) != '\0')))) goto code_r0x00737558;
      goto joined_r0x007376c4;
    }
code_r0x00737490:
    if (unaff_w24 != 0) goto code_r0x00737494;
code_r0x0073777c:
    if (-1 < (int)uVar6) {
      return 0;
    }
    if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                 unaff_x19 + 0x18) == 0) goto joined_r0x0073785c;
    iVar2 = *(int *)(*(long *)(
                              "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                              + unaff_x19 + 0x18) + 8);
  }
  if (iVar2 < 1) {
    return 0;
  }
  if (iRam0000000000a2b560 < 1) {
    return 0;
  }
code_r0x00737868:
  func_0x0073ce84();
  return 0;
}


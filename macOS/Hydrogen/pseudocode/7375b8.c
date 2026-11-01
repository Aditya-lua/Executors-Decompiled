
/* WARNING: Type propagation algorithm not settling */

undefined8 FUN_007375b8(byte *param_1,char *param_2,long param_3)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  uint uVar5;
  ulong uVar6;
  long unaff_x19;
  char *unaff_x20;
  int unaff_w21;
  byte *unaff_x22;
  uint unaff_w24;
  ulong *unaff_x25;
  long unaff_x26;
  long unaff_x27;
  byte *unaff_x28;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  
code_r0x007375b8:
  iVar2 = func_0x0077e76c(param_1,param_2,param_3);
  if (((((iVar2 != 0) && (unaff_x20[unaff_x27] == '\0')) ||
       ((iVar2 = func_0x0077e76c(unaff_x28,"gzip",unaff_x27), iVar2 != 0 &&
        ("gzip"[unaff_x27] == '\0')))) ||
      ((iVar2 = func_0x0077e76c(unaff_x28,"x-gzip",unaff_x27), iVar2 != 0 &&
       ("x-gzip"[unaff_x27] == '\0')))) && (unaff_w24 != 0)) goto code_r0x007376c8;
LAB_00737660:
  if ((((in_stack_00000030._4_4_ | unaff_w24) & 1) == 0) && (lVar3 = func_0x00774130(), lVar3 != 0))
  {
code_r0x00737818:
    func_0x0073c9e4();
    return 0x3d;
  }
code_r0x007376d8:
  uVar4 = func_0x00773f84(&uStack0000000000000048);
  if ((*(char *)((long)unaff_x25 + 3) < '\0') &&
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
  param_1 = unaff_x22;
  if ((int)uVar6 == 0) {
    return 0;
  }
  for (; uVar6 = (ulong)*param_1,
      *param_1 < 0x2d && (unaff_x26 << (uVar6 & 0x3f) & 0x100100000200U) != 0; param_1 = param_1 + 1
      ) {
  }
  lVar3 = 0;
  param_3 = 0;
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
        param_3 = lVar3 + 1;
      }
    }
    uVar6 = (ulong)param_1[lVar3 + 1];
    lVar3 = lVar3 + 1;
  } while( true );
  unaff_x22 = param_1 + lVar3;
  if (param_3 != 0) goto code_r0x00737400;
  goto code_r0x00737758;
code_r0x00737400:
  if ((unaff_x19 != 0) && (*(char *)((long)unaff_x25 + 3) < '\0')) {
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
  if ((unaff_w21 == 0) || (param_3 != 7)) {
    uVar6 = *unaff_x25;
    if (unaff_w21 != 0) {
      unaff_w24 = 0;
      if (((uint)uVar6 >> 0x19 & 1) == 0) goto code_r0x00737490;
      goto code_r0x00737494;
    }
    if ((uVar6 >> 0x26 & 1) != 0) goto code_r0x0073777c;
    lVar3 = func_0x00774084();
    if (lVar3 - 4U < 0xfffffffffffffffa || lVar3 == -2) goto code_r0x00737818;
    unaff_w24 = 0;
code_r0x00737558:
    iVar2 = func_0x0077e76c(param_1,"identity",param_3);
    if (((iVar2 == 0) || ("identity"[param_3] != '\0')) &&
       ((iVar2 = func_0x0077e76c(param_1,"none",param_3), iVar2 == 0 || ("none"[param_3] != '\0'))))
    {
      unaff_x20 = "deflate";
      param_2 = "deflate";
      unaff_x27 = param_3;
      unaff_x28 = param_1;
      goto code_r0x007375b8;
    }
joined_r0x0073763c:
    bVar1 = unaff_w24 == 0;
    unaff_w24 = 0;
    if (bVar1) goto LAB_00737660;
code_r0x007376c8:
    lVar3 = func_0x00774174();
    if (lVar3 == 0) goto code_r0x007376d8;
    if (-1 < *(char *)((long)unaff_x25 + 3)) {
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
    iVar2 = func_0x0077e76c(param_1,"chunked",7);
    unaff_w24 = (uint)(iVar2 != 0);
    uVar6 = *unaff_x25;
    if (((uint)uVar6 >> 0x19 & 1) != 0) {
code_r0x00737494:
      lVar3 = func_0x00774084();
      if (lVar3 - 4U < 0xfffffffffffffffb) goto code_r0x00737818;
      iVar2 = func_0x0077e76c(param_1,in_stack_00000040,param_3);
      if (((iVar2 == 0) || (*(char *)(in_stack_00000040 + param_3) != '\0')) &&
         ((in_stack_00000038 == 0 ||
          ((iVar2 = func_0x0077e76c(param_1,in_stack_00000038,param_3), iVar2 == 0 ||
           (*(char *)(in_stack_00000038 + param_3) != '\0')))))) {
        unaff_x26 = 1;
        goto code_r0x00737558;
      }
      unaff_x26 = 1;
      goto joined_r0x0073763c;
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


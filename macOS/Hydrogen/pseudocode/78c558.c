
int FUN_0078c558(void)

{
  bool bVar1;
  byte bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined4 uVar6;
  int iVar7;
  ulong uVar8;
  long unaff_x19;
  undefined8 *unaff_x20;
  code *unaff_x22;
  undefined4 unaff_w24;
  undefined4 unaff_w25;
  long unaff_x26;
  long unaff_x27;
  uint unaff_w28;
  undefined8 in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000028;
  
code_r0x0078c558:
  func_0x0072a130();
  iVar7 = *(int *)(unaff_x20 + 5);
  iVar3 = *(int *)((long)unaff_x20 + 0x24) + 1;
  *(int *)((long)unaff_x20 + 0x24) = iVar3;
  if (iVar3 < iVar7) {
    do {
      while( true ) {
        uVar8 = func_0x00729fa8();
        if ((uVar8 & 1) == 0) {
          return 0x51;
        }
        iVar3 = *(int *)((long)unaff_x20 + 0x24);
        if (iVar3 != 1) break;
        *(undefined1 *)((long)unaff_x20 + 0x19) =
             *(undefined1 *)
              CONCAT71(uStack0000000000000028._1_7_,(undefined1)uStack0000000000000028);
        func_0x0072a130();
        *(undefined4 *)((long)unaff_x20 + 0x24) = unaff_w25;
        bVar2 = *(byte *)((long)unaff_x20 + 0x19);
        if ((char)bVar2 < '\0') {
code_r0x0078c6e0:
          func_0x0073c9e4();
          unaff_x20[5] = 0;
          *(undefined4 *)((long)unaff_x20 + 0x24) = 0;
          unaff_x20[1] = 0;
          unaff_x20[2] = 0;
          *unaff_x20 = 0;
          goto joined_r0x0078c6f8;
        }
        if (bVar2 == 0x7f) {
          uVar6 = 10;
        }
        else {
          if (bVar2 != 0x7e) {
            *(undefined4 *)(unaff_x20 + 5) = 2;
            uVar8 = (ulong)bVar2;
            goto LAB_0078c7a0;
          }
          uVar6 = 4;
        }
        *(undefined4 *)(unaff_x20 + 5) = uVar6;
      }
      if (iVar3 != 0) goto code_r0x0078c534;
      *(undefined1 *)(unaff_x20 + 3) =
           *(undefined1 *)CONCAT71(uStack0000000000000028._1_7_,(undefined1)uStack0000000000000028);
      func_0x0072a130();
      if ((*(byte *)(unaff_x20 + 3) & 0x70) != 0) goto code_r0x0078c6e0;
      uVar8 = (ulong)*(byte *)(unaff_x20 + 3) & 0xf;
      if ((10 < (uint)uVar8) || ((unaff_w28 >> uVar8 & 1) == 0)) {
        *(undefined4 *)((long)unaff_x20 + 4) = 0;
        goto code_r0x0078c6e0;
      }
      *(undefined4 *)((long)unaff_x20 + 4) =
           *(undefined4 *)(unaff_x27 + *(long *)(unaff_x26 + uVar8 * 8) * 0x10 + 4);
      *(undefined4 *)((long)unaff_x20 + 0x24) = unaff_w24;
    } while( true );
  }
code_r0x0078c574:
  if (iVar7 == 10) {
    if ((char)*(byte *)((long)unaff_x20 + 0x1a) < '\0') {
LAB_0078c818:
      func_0x0073c9e4();
joined_r0x0078c6f8:
      if (((unaff_x19 == 0) || (-1 < *(char *)(unaff_x19 + 0xa1d))) ||
         ((*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
                    unaff_x19 + 0x18) != 0 &&
          (*(int *)(*(long *)(
                             "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                             + unaff_x19 + 0x18) + 8) < 1)))) {
        return 0x38;
      }
      func_0x0073cab8();
      return 0x38;
    }
    uVar8 = (ulong)*(byte *)((long)unaff_x20 + 0x1a) << 0x38 |
            (ulong)*(byte *)((long)unaff_x20 + 0x1b) << 0x30 |
            (ulong)*(byte *)((long)unaff_x20 + 0x1c) << 0x28 |
            (ulong)*(byte *)((long)unaff_x20 + 0x1d) << 0x20 |
            (ulong)*(byte *)((long)unaff_x20 + 0x1e) << 0x18 |
            (ulong)*(byte *)((long)unaff_x20 + 0x1f) << 0x10 | (ulong)*(byte *)(unaff_x20 + 4) << 8
            | (ulong)*(byte *)((long)unaff_x20 + 0x21);
  }
  else if (iVar7 == 4) {
    uVar8 = (ulong)((uint)(*(ushort *)((long)unaff_x20 + 0x1a) >> 8) |
                   (*(ushort *)((long)unaff_x20 + 0x1a) & 0xff00ff) << 8);
  }
  else {
    if (iVar7 != 2) goto LAB_0078c818;
    uVar8 = (ulong)*(byte *)((long)unaff_x20 + 0x19);
  }
LAB_0078c7a0:
  *(undefined4 *)unaff_x20 = 0;
  unaff_x20[1] = 0;
  unaff_x20[2] = uVar8;
  func_0x0078c95c();
  *(undefined4 *)((long)unaff_x20 + 0x2c) = 2;
  if (unaff_x20[2] == 0) {
    uStack0000000000000028._0_1_ = 0;
    lVar5 = (*unaff_x22)(&uStack0000000000000028,0,*(undefined4 *)unaff_x20,
                         *(undefined4 *)((long)unaff_x20 + 4),0,0);
    if (-1 < lVar5) {
      *(undefined4 *)((long)unaff_x20 + 0x2c) = 0;
    }
    return 0;
  }
  lVar5 = unaff_x20[2] - unaff_x20[1];
  if (lVar5 != 0) {
    if (unaff_x19 == 0) {
      do {
        iVar3 = func_0x00729fa8();
        if (iVar3 == 0) goto code_r0x0078c414;
        if (lVar5 < in_stack_00000020) {
          in_stack_00000020 = lVar5;
        }
        lVar4 = (*unaff_x22)(CONCAT71(uStack0000000000000028._1_7_,
                                      (undefined1)uStack0000000000000028),in_stack_00000020,
                             *(undefined4 *)unaff_x20,*(undefined4 *)((long)unaff_x20 + 4),
                             unaff_x20[1],unaff_x20[2]);
        if (lVar4 < 0) goto code_r0x0078c694;
        func_0x0072a130();
        lVar5 = unaff_x20[2] - (unaff_x20[1] + lVar4);
        unaff_x20[1] = unaff_x20[1] + lVar4;
      } while (lVar5 != 0);
    }
    else {
      do {
        iVar3 = func_0x00729fa8();
        if (iVar3 == 0) {
code_r0x0078c414:
          func_0x0078c95c();
          return 0x51;
        }
        if (lVar5 < in_stack_00000020) {
          in_stack_00000020 = lVar5;
        }
        lVar4 = (*unaff_x22)(CONCAT71(uStack0000000000000028._1_7_,
                                      (undefined1)uStack0000000000000028),in_stack_00000020,
                             *(undefined4 *)unaff_x20,*(undefined4 *)((long)unaff_x20 + 4),
                             unaff_x20[1],unaff_x20[2]);
        if (lVar4 < 0) goto code_r0x0078c694;
        func_0x0072a130();
        lVar5 = unaff_x20[2] - (unaff_x20[1] + lVar4);
        unaff_x20[1] = unaff_x20[1] + lVar4;
        if (*(char *)(unaff_x19 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + unaff_x19 + 0x18) == 0) {
            if (0 < iRam0000000000a2b560) goto code_r0x0078c5d4;
          }
          else {
            bVar1 = *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + unaff_x19 + 0x18) + 8) < 1;
            if ((!bVar1 && iRam0000000000a2b560 != 0) && (bVar1 || -1 < iRam0000000000a2b560)) {
code_r0x0078c5d4:
              func_0x0073ce84();
            }
          }
        }
      } while (lVar5 != 0);
    }
  }
  func_0x0078c95c();
code_r0x0078c688:
  *(undefined4 *)((long)unaff_x20 + 0x2c) = 0;
  return 0;
code_r0x0078c534:
  iVar7 = *(int *)(unaff_x20 + 5);
  if (iVar7 <= iVar3) goto code_r0x0078c574;
  *(undefined1 *)((long)unaff_x20 + (long)iVar3 + 0x18) =
       *(undefined1 *)CONCAT71(uStack0000000000000028._1_7_,(undefined1)uStack0000000000000028);
  goto code_r0x0078c558;
code_r0x0078c694:
  func_0x0078c95c();
  if (in_stack_00000018._4_4_ != 0) {
    return in_stack_00000018._4_4_;
  }
  goto code_r0x0078c688;
}



ulong FUN_0073ee08(ulong param_1)

{
  char *pcVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined2 unaff_w21;
  undefined4 unaff_w22;
  char *unaff_x24;
  undefined2 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  
  while( true ) {
    if (0x3e < param_1) {
      unaff_x19[0x42] = 0;
      func_0x0073c9e4();
      return 0x1b;
    }
    *(char *)unaff_x26 = (char)unaff_x28;
    _memcpy((long)unaff_x26 + 1,unaff_x24,unaff_x28);
    unaff_x26 = (undefined2 *)((long)unaff_x26 + 1 + unaff_x28);
    unaff_x24 = unaff_x24 + unaff_x28;
    if (unaff_x27 != 0) {
      unaff_x24 = unaff_x24 + 1;
    }
    if (*unaff_x24 == '\0') break;
    unaff_x27 = _strchr(unaff_x24,0x2e);
    if (unaff_x27 == 0) {
      unaff_x28 = _strlen(unaff_x24);
      param_1 = unaff_x28 - 1;
    }
    else {
      unaff_x28 = unaff_x27 - (long)unaff_x24;
      param_1 = unaff_x28 - 1;
    }
  }
  *unaff_x26 = 0;
  *(char *)(unaff_x26 + 1) = (char)unaff_w22;
  *(undefined2 *)((long)unaff_x26 + 3) = unaff_w21;
  unaff_x19[0x42] = (long)unaff_x26 + (5 - ((long)unaff_x19 + 0xc));
  *(undefined4 *)(unaff_x19 + 1) = unaff_w22;
  func_0x0074066c(unaff_x19 + 0x43,3000);
  lVar3 = func_0x00734ac8();
  if (lVar3 < 1) {
    uVar4 = 0x1c;
  }
  else {
    uVar4 = func_0x00784984(&uStack0000000000000018);
    if ((int)uVar4 == 0) {
      *(uint *)(&UNK_00001344 + uStack0000000000000018) =
           *(uint *)(&UNK_00001344 + uStack0000000000000018) | 0x100000;
      pcVar1 = "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics" +
               uStack0000000000000018 + 0x18;
      pcVar1[0] = -0x28;
      pcVar1[1] = -0x4b;
      pcVar1[2] = -0x5e;
      pcVar1[3] = '\0';
      pcVar1[4] = '\0';
      pcVar1[5] = '\0';
      pcVar1[6] = '\0';
      pcVar1[7] = '\0';
      uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002712);
      if (((((((((((uint)uVar4 < 0x31) && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)) &&
                (uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_000027fe), (uint)uVar4 < 0x31))
               && (((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0 &&
                   (uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00004e2b),
                   (uint)uVar4 < 0x31)))) &&
              (((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0 &&
               ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002711), (uint)uVar4 < 0x31
                && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))) &&
             ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_0000271f), (uint)uVar4 < 0x31 &&
              (((((((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0 &&
                   (uVar4 = func_0x007795c4(uStack0000000000000018,0x3c), (uint)uVar4 < 0x31)) &&
                  ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)) &&
                 (((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002727),
                   (uint)uVar4 < 0x31 && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)) &&
                  ((uVar4 = func_0x007795c4(uStack0000000000000018,0xb5), (uint)uVar4 < 0x31 &&
                   (((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0 &&
                    (uVar4 = func_0x007795c4(uStack0000000000000018,0x9b), (uint)uVar4 < 0x31)))))))
                 ) && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)) &&
               ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002774), (uint)uVar4 < 0x31
                && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))))) &&
            ((((*(long *)(unaff_x20 + 0x1c8) == 0 ||
               (*(long *)(unaff_x20 + 0x1c8) == *(long *)PTR____stderrp_009b01f0)) ||
              ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002735), (uint)uVar4 < 0x31 &&
               ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))) &&
             ((-1 < *(char *)(unaff_x20 + 0xa1d) ||
              ((((*(long *)(
                           "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                           + unaff_x20 + 0x18) != 0 &&
                 (*(int *)(*(long *)(
                                    "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                    + unaff_x20 + 0x18) + 8) < 1)) || (iRam0000000000a2b5e0 < 1)) ||
               ((uVar4 = func_0x007795c4(uStack0000000000000018,0x29), (uint)uVar4 < 0x31 &&
                ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))))))) &&
           ((((*(byte *)(unaff_x20 + 0xa1e) >> 2 & 1) == 0 ||
             ((uVar4 = func_0x007795c4(uStack0000000000000018,99), (uint)uVar4 < 0x31 &&
              ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))) &&
            (((uVar4 = func_0x007795c4(uStack0000000000000018,0x51), (uint)uVar4 < 0x31 &&
              (((((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0 &&
                 (uVar4 = func_0x007795c4(uStack0000000000000018,0x40), (uint)uVar4 < 0x31)) &&
                ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)) &&
               ((uVar4 = func_0x007795c4(uStack0000000000000018,0xe8), (uint)uVar4 < 0x31 &&
                ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))) &&
             (((*(ushort *)(unaff_x20 + 0x5c0) >> 1 & 1) == 0 ||
              ((uVar4 = func_0x007795c4(uStack0000000000000018,0xe9), (uint)uVar4 < 0x31 &&
               ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))))))) &&
          ((*(long *)(unaff_x20 + 0x710) == 0 ||
           ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002751), (uint)uVar4 < 0x31 &&
            ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))) &&
         ((((((*(long *)(unaff_x20 + 0x928) == 0 ||
              ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00009d75), (uint)uVar4 < 0x31 &&
               ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))) &&
             ((*(long *)(unaff_x20 + 0x708) == 0 ||
              ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00002771), (uint)uVar4 < 0x31 &&
               ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))) &&
            (((*(long *)(unaff_x20 + 0x730) == 0 ||
              ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_000027b9), (uint)uVar4 < 0x31 &&
               ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))) &&
             ((((*(ushort *)(unaff_x20 + 0x5c0) & 1) == 0 ||
               ((uVar4 = func_0x007795c4(uStack0000000000000018,0xac), (uint)uVar4 < 0x31 &&
                ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))) &&
              ((((*(long *)(unaff_x20 + 0x588) == 0 ||
                 ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00004e8c), (uint)uVar4 < 0x31
                  && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))) &&
                ((*(long *)(unaff_x20 + 0x590) == 0 ||
                 ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_0000277d), (uint)uVar4 < 0x31
                  && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))) &&
               ((*(long *)(unaff_x20 + 600) == 0 ||
                ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_00004e7e), (uint)uVar4 < 0x31
                 && ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))))))))) &&
           ((*(long *)(unaff_x20 + 0x1d0) == 0 ||
            ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_0000276f), (uint)uVar4 < 0x31 &&
             ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))) &&
          ((*(long *)(unaff_x20 + 0x8d8) == 0 ||
           ((uVar4 = func_0x007795c4(uStack0000000000000018,&UNK_0000283a), (uint)uVar4 < 0x31 &&
            ((1L << (uVar4 & 0x3f) & 0x1000000000011U) != 0)))))))) {
        func_0x007795c4(uStack0000000000000018,0xd8);
        *(undefined **)(uStack0000000000000018 + 0x9d8) = &DAT_00740364;
        *(undefined8 *)(uStack0000000000000018 + 0x9e0) = *(undefined8 *)(unaff_x20 + 0x10);
        iVar2 = func_0x00767d80(in_stack_00000010);
        if (iVar2 == 0) {
          uVar4 = 0;
          uVar5 = *(undefined8 *)(uStack0000000000000018 + 0x10);
          goto LAB_0073f1b4;
        }
      }
    }
  }
  func_0x0078443c(&uStack0000000000000018);
  uVar5 = 0xffffffffffffffff;
LAB_0073f1b4:
  *unaff_x19 = uVar5;
  return uVar4;
}


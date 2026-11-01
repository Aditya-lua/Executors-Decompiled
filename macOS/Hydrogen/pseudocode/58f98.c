
undefined8 FUN_00058f98(void)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  long unaff_x20;
  ulong uVar4;
  long lVar5;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  uint uStack0000000000000034;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  long in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  undefined8 uStack0000000000000110;
  undefined8 *in_stack_00000118;
  undefined8 *in_stack_00000120;
  undefined8 *in_stack_00000128;
  undefined8 *in_stack_00000130;
  undefined8 *in_stack_00000138;
  
  iVar1 = _getpeername();
  if (((iVar1 == 0) && (uStack0000000000000090._1_1_ != '\x01')) &&
     ((uVar4 = uStack0000000000000038 & 0xffffffff, uStack0000000000000090._1_1_ == '\x1e' ||
      (uStack0000000000000090._1_1_ == '\x02')))) {
    in_stack_00000050._4_4_ =
         (uint)(uStack0000000000000090._2_2_ >> 8) | (uStack0000000000000090._2_2_ & 0xff00ff) << 8;
    _bzero(&uStack0000000000000110,0x401);
    iVar1 = _getnameinfo(&uStack0000000000000090,uVar4,&uStack0000000000000110,0x401,0,0,2);
    if (iVar1 == 0) {
      func_0x0002a730(&uStack0000000000000058,&uStack0000000000000110);
    }
  }
  uStack0000000000000038 = 0;
  in_stack_00000040 = 0;
  in_stack_00000048 = 0;
  uStack0000000000000034 = 0;
  uStack0000000000000080 = CONCAT44(uStack0000000000000080._4_4_,0x80);
  iVar1 = _getsockname();
  if (iVar1 == 0) {
    uVar4 = uStack0000000000000080 & 0xffffffff;
    if ((uStack0000000000000090._1_1_ == '\x1e') || (uStack0000000000000090._1_1_ == '\x02')) {
      uStack0000000000000034 =
           (uint)(uStack0000000000000090._2_2_ >> 8) |
           (uStack0000000000000090._2_2_ & 0xff00ff) << 8;
      _bzero(&uStack0000000000000110,0x401);
      iVar1 = _getnameinfo(&uStack0000000000000090,uVar4,&uStack0000000000000110,0x401,0,0,2);
      if (iVar1 == 0) {
        func_0x0002a730(&uStack0000000000000038,&uStack0000000000000110);
      }
    }
  }
  lVar5 = *(long *)(unaff_x20 + 0x30);
  uStack0000000000000090 = *(undefined8 *)(unaff_x20 + 0x40);
  uStack0000000000000080 = *(undefined8 *)(unaff_x20 + 0x48);
  uStack0000000000000078 = *(undefined8 *)(unaff_x20 + 0x50);
  uStack0000000000000070 = *(undefined8 *)(unaff_x20 + 0x58);
  uStack0000000000000110 = &uStack0000000000000088;
  in_stack_00000118 = &uStack0000000000000090;
  in_stack_00000120 = &uStack0000000000000080;
  in_stack_00000128 = &uStack0000000000000078;
  in_stack_00000130 = &uStack0000000000000070;
  in_stack_00000138 = &uStack0000000000000008;
  if (lVar5 == 0) {
LAB_00059100:
    uVar3 = 0;
  }
  else {
    iVar1 = func_0x0005a288(unaff_x20 + 0x28);
    if (iVar1 == 0) goto LAB_00059100;
    do {
      uStack0000000000000088._7_1_ = '\0';
      uVar3 = func_0x0005a3d4(&uStack0000000000000110,lVar5 == 1,(long)&uStack0000000000000088 + 7);
      uVar2 = 0;
      if (uStack0000000000000088._7_1_ == '\0') {
        uVar2 = (uint)uVar3;
      }
      if ((uVar2 & 1) == 0) goto code_r0x00059104;
      lVar5 = lVar5 + -1;
    } while ((lVar5 != 0) && (iVar1 = func_0x0005a288(unaff_x20 + 0x28), iVar1 != 0));
    uVar3 = 1;
  }
code_r0x00059104:
  _shutdown();
  _close();
  if (in_stack_00000048 < 0) {
    __ZdlPv(uStack0000000000000038);
  }
  if (in_stack_00000068._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000058);
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38))
    goto code_r0x000591f4;
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
code_r0x000591f4:
    uVar3 = ___stack_chk_fail();
    if (in_stack_00000048 < 0) {
      __ZdlPv(uStack0000000000000038);
    }
    while (-1 < in_stack_00000068._7_1_) {
      __Unwind_Resume(uVar3);
    }
    __ZdlPv(uStack0000000000000058);
    uVar3 = __Unwind_Resume(uVar3);
    return uVar3;
  }
  return uVar3;
}


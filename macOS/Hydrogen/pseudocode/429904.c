
byte FUN_00429904(undefined8 param_1)

{
  long lVar1;
  byte *pbVar2;
  byte bVar3;
  undefined8 uVar4;
  undefined8 in_x5;
  long unaff_x19;
  uint *unaff_x20;
  long unaff_x29;
  byte *pbStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined1 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  byte *pbStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  byte *pbStack0000000000000058;
  
  _uStack0000000000000028 = (long)&uStack0000000000000010 + 7;
  lVar1 = *(long *)(unaff_x19 + 0x28);
  pbVar2 = *(byte **)(unaff_x19 + 0x30);
  uStack0000000000000008 = *(undefined8 *)(unaff_x19 + 0x18);
  pbStack0000000000000000 = *(byte **)(unaff_x19 + 0x10);
  uStack0000000000000050 = *(undefined8 *)(unaff_x19 + 0x28);
  uStack0000000000000048 = *(undefined8 *)(unaff_x19 + 0x20);
  uStack0000000000000030 = param_1;
  pbStack0000000000000038 = pbStack0000000000000000;
  uStack0000000000000040 = uStack0000000000000008;
  pbStack0000000000000058 = pbVar2;
  func_0x0043af4c(1);
  if (((uStack0000000000000010._7_1_ & 1) == 0) && ((*pbStack0000000000000000 & 1) != 0)) {
    in_stack_00000020 = 0;
    uVar4 = *(undefined8 *)(unaff_x20 + 2);
    uStack0000000000000018 = lVar1;
    if ((*unaff_x20 & 1) == 0) {
      uVar4 = __Unwind_GetIP(uVar4);
    }
    _uStack0000000000000028 = 3;
    *(undefined8 *)(unaff_x29 + -0x38) = 2;
    bVar3 = func_0x0042df10(&uStack0000000000000018,uVar4,&uStack0000000000000028,unaff_x29 + -0x38,
                            0,in_x5,0);
    *pbVar2 = bVar3;
    *(long *)(uStack0000000000000018 + 0x18) = *(long *)(uStack0000000000000018 + 0x18) + 1;
  }
  **(long **)(unaff_x19 + 8) = **(long **)(unaff_x19 + 8) + 1;
  return (*pbVar2 ^ 1) & 1;
}


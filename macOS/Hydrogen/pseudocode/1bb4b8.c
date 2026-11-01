
void FUN_001bb4b8(long param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  long in_x9;
  long lVar2;
  long *unaff_x19;
  long *unaff_x20;
  ulong unaff_x21;
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  if ((ulong)(in_x9 - param_1) < 3) {
    func_0x0079b61c();
    param_1 = unaff_x20[2];
    in_x9 = *unaff_x20;
  }
  uVar1 = (uint)unaff_x21 & 0xff00ff;
  lVar2 = unaff_x20[1];
  *(char *)((ushort *)(lVar2 + param_1) + 1) = (char)uVar1;
  *(ushort *)(lVar2 + param_1) =
       (ushort)(byte)(uVar1 >> 0x10) |
       (ushort)(((((uint)unaff_x21 & 0xff00ff00) >> 8) << 0x10) >> 8);
  param_1 = param_1 + 3;
  unaff_x20[2] = param_1;
  if ((ulong)(in_x9 - param_1) < unaff_x21) {
    func_0x0079b61c();
    lVar2 = unaff_x20[1];
    param_1 = unaff_x20[2];
  }
  _memcpy(lVar2 + param_1,param_3);
  unaff_x20[2] = param_1 + unaff_x21;
  func_0x0024031c(&uStack0000000000000008);
  lVar2 = *unaff_x19;
  if ((lVar2 < -0x7ffffffffffffffe) || (lVar2 == 0)) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x19[1],lVar2 << 2,2);
  return;
}


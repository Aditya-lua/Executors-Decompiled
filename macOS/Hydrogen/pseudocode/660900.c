
/* WARNING: Removing unreachable block (ram,0x006609a0) */

void FUN_00660900(undefined8 *param_1)

{
  long *plVar1;
  ulong uVar2;
  long *plVar3;
  undefined8 *unaff_x19;
  undefined8 uStack0000000000000008;
  
  *param_1 = &UNK_009b9bc8;
  func_0x005edf2c(param_1 + 1,1);
  *unaff_x19 = &UNK_00a09dc0;
  unaff_x19[1] = &UNK_00a09e98;
  unaff_x19[2] = &UNK_00a09ef0;
  plVar1 = unaff_x19 + 3;
  unaff_x19[5] = &UNK_00a09938;
  func_0x00660bb4(plVar1,&UNK_009fd050);
  unaff_x19[4] = &UNK_009fcef8;
  unaff_x19[5] = &UNK_009fcfd8;
  *unaff_x19 = &UNK_00a0b5d8;
  unaff_x19[1] = &UNK_00a0b6b0;
  unaff_x19[2] = &UNK_00a0b708;
  unaff_x19[3] = &UNK_009fce60;
  uVar2 = func_0x0065f564();
  if ((uVar2 & 1) == 0) {
    plVar3 = (long *)(**(code **)(*plVar1 + 0x18))(plVar1);
    (**(code **)(*(long *)((long)plVar3 + *(long *)(*plVar3 + -0x70)) + 0x18))();
    uStack0000000000000008 = plVar1;
    func_0x0065f8ec();
    func_0x0065f6bc(&uStack0000000000000008,"PrivateExponent",0x28,1);
  }
  return;
}


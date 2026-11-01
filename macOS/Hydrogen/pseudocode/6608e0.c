
/* WARNING: Removing unreachable block (ram,0x006609a0) */

undefined8 * FUN_006608e0(undefined8 *param_1,undefined8 param_2)

{
  long *plVar1;
  int iVar2;
  ulong uVar3;
  long *plVar4;
  long *plStack_58;
  undefined8 uStack_50;
  undefined1 uStack_48;
  
  *param_1 = &UNK_009b9bc8;
  func_0x005edf2c(param_1 + 1,1);
  *param_1 = &UNK_00a09dc0;
  param_1[1] = &UNK_00a09e98;
  param_1[2] = &UNK_00a09ef0;
  plVar1 = param_1 + 3;
  param_1[5] = &UNK_00a09938;
  func_0x00660bb4(plVar1,&UNK_009fd050);
  param_1[4] = &UNK_009fcef8;
  param_1[5] = &UNK_009fcfd8;
  *param_1 = &UNK_00a0b5d8;
  param_1[1] = &UNK_00a0b6b0;
  param_1[2] = &UNK_00a0b708;
  param_1[3] = &UNK_009fce60;
  uVar3 = func_0x0065f564(param_2,plVar1);
  if ((uVar3 & 1) == 0) {
    plVar4 = (long *)(**(code **)(*plVar1 + 0x18))(plVar1);
    plVar4 = (long *)((long)plVar4 + *(long *)(*plVar4 + -0x70));
    (**(code **)(*plVar4 + 0x18))(plVar4,param_2);
    uStack_48 = 0;
    plStack_58 = plVar1;
    uStack_50 = param_2;
    iVar2 = func_0x0065f8ec(param_2,plVar1);
    if (iVar2 != 0) {
      uStack_48 = 1;
    }
    func_0x0065f6bc(&plStack_58,"PrivateExponent",0x28,1);
  }
  return param_1;
}


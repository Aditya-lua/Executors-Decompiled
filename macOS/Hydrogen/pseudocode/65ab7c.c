
/* WARNING: Removing unreachable block (ram,0x0065ac74) */

undefined8 * FUN_0065ab7c(void)

{
  int iVar1;
  undefined8 *puVar2;
  ulong uVar3;
  long *plVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000008;
  long *plStack_48;
  undefined8 uStack_40;
  undefined1 uStack_38;
  
  __ZdlPv(in_stack_00000008);
  auVar7 = __Unwind_Resume();
  uVar5 = auVar7._8_8_;
  puVar2 = auVar7._0_8_;
  *puVar2 = &UNK_009b9bc8;
  func_0x005edf2c(puVar2 + 1,1);
  *puVar2 = &UNK_00a084d8;
  puVar2[1] = &UNK_00a085b0;
  puVar2[2] = &UNK_00a08608;
  plVar6 = puVar2 + 3;
  *plVar6 = (long)&UNK_00a0b0a8;
  puVar2[5] = &UNK_00a09938;
  func_0x0065aec8(puVar2 + 4,&UNK_009fac20);
  *plVar6 = (long)&UNK_00a004a0;
  puVar2[4] = &UNK_00a00538;
  puVar2[5] = &UNK_00a00618;
  func_0x005fdd18(puVar2 + 0x2b);
  puVar2[4] = &UNK_009faac0;
  puVar2[5] = &UNK_009faba0;
  *puVar2 = &UNK_00a0af00;
  puVar2[1] = &UNK_00a0afd8;
  puVar2[2] = &UNK_00a0b030;
  puVar2[3] = &UNK_009faa28;
  uVar3 = func_0x00662d8c(uVar5,plVar6);
  if ((uVar3 & 1) == 0) {
    plVar4 = (long *)(**(code **)(*plVar6 + 0x18))(plVar6);
    plVar4 = (long *)((long)plVar4 + *(long *)(*plVar4 + -0x70));
    (**(code **)(*plVar4 + 0x18))(plVar4,uVar5);
    uStack_38 = 0;
    plStack_48 = plVar6;
    uStack_40 = uVar5;
    iVar1 = func_0x00663114(uVar5,plVar6);
    if (iVar1 != 0) {
      uStack_38 = 1;
    }
    func_0x00662ee4(&plStack_48,"PrivateExponent",0x28,1);
  }
  return puVar2;
}


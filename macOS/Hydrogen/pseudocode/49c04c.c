
void FUN_0049c04c(long param_1,long param_2)

{
  undefined8 uVar1;
  ulong *unaff_x19;
  long *unaff_x20;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  undefined1 auVar7 [16];
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  long lStack0000000000000018;
  long lStack0000000000000020;
  
  lStack0000000000000008 = *(long *)(param_2 + 0x18);
  lStack0000000000000000 = *(long *)(param_2 + 0x10);
  lStack0000000000000018 = *(long *)(param_2 + 0x28);
  lStack0000000000000010 = *(long *)(param_2 + 0x20);
  lStack0000000000000020 = *(long *)(param_2 + 0x30);
  uVar6 = unaff_x19[2];
  uVar3 = unaff_x19[5];
  uVar2 = unaff_x19[4];
  uVar5 = unaff_x19[1];
  uVar4 = *unaff_x19;
  *(ulong *)(param_2 + 0x20) = unaff_x19[3];
  *(ulong *)(param_2 + 0x18) = uVar6;
  *(ulong *)(param_2 + 0x30) = uVar3;
  *(ulong *)(param_2 + 0x28) = uVar2;
  *(ulong *)(param_2 + 0x10) = uVar5;
  *(ulong *)(param_2 + 8) = uVar4;
  if (param_1 != 4) {
    *unaff_x20 = param_1;
    unaff_x20[2] = lStack0000000000000008;
    unaff_x20[1] = lStack0000000000000000;
    unaff_x20[4] = lStack0000000000000018;
    unaff_x20[3] = lStack0000000000000010;
    unaff_x20[5] = lStack0000000000000020;
    return;
  }
  uVar1 = func_0x007a02f0(&UNK_009e2ac0);
  if (1 < *unaff_x19) {
    func_0x004a4fa4(unaff_x19 + 1);
  }
  __Unwind_Resume(uVar1);
  auVar7 = func_0x007a2668();
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(auVar7._8_8_[1] + 0x18))
            (*auVar7._8_8_,*(undefined8 *)(&UNK_009e2c48 + (ulong)*(byte *)*auVar7._0_8_ * 8),
             *(undefined8 *)(&UNK_0089f798 + (ulong)*(byte *)*auVar7._0_8_ * 8));
  return;
}


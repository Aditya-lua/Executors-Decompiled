
void FUN_000441b8(long param_1,long *param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  long *plVar2;
  undefined8 uStack0000000000000008;
  
  (**(code **)(**(long **)(param_1 + -0x28) + 0x38))
            (*(long **)(param_1 + -0x28),param_3,param_4,param_2);
  plVar2 = (long *)(param_1 + -0x38);
  (**(code **)(*plVar2 + 0x98))(plVar2);
  iVar1 = (**(code **)(*param_2 + 0x10))
                    (param_2,"FeedbackSize",PTR___ZTIi_009b0170,(long)&uStack0000000000000008 + 4);
  if (iVar1 == 0) {
    uStack0000000000000008._4_4_ = 0;
  }
  (**(code **)(*plVar2 + 0x90))(plVar2,uStack0000000000000008._4_4_);
  return;
}


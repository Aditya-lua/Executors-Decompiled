
void FUN_00706f5c(long param_1,long *param_2)

{
  int iVar1;
  
  iVar1 = (**(code **)(*param_2 + 0xf0))(param_2,param_1);
  if (iVar1 == 0) {
    return;
  }
  (**(code **)**(undefined8 **)(param_1 + 0x28))(*(undefined8 **)(param_1 + 0x28),param_2);
                    /* WARNING: Could not recover jumptable at 0x00706fb0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(param_1 + 0x20))(*(undefined8 **)(param_1 + 0x20),param_2);
  return;
}


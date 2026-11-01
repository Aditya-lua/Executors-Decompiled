
void FUN_004585fc(undefined8 *param_1)

{
  int *in_x9;
  int *piStack_18;
  
  if (*in_x9 == 1) {
    piStack_18 = in_x9 + 2;
    func_0x004699b0(param_1,&UNK_008151ac,4,&piStack_18,&UNK_009df618);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00469224. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(param_1[1] + 0x18))(*param_1,&UNK_008151a8,4);
  return;
}


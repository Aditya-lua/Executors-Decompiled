
void FUN_005f3da0(undefined8 *param_1,undefined8 *param_2)

{
  int in_w8;
  undefined8 *unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  
  if (in_w8 < 0) {
    func_0x00017634(param_1,*param_2,param_2[1]);
  }
  else {
    uVar2 = param_2[1];
    uVar1 = *param_2;
    param_1[2] = param_2[2];
    param_1[1] = uVar2;
    *param_1 = uVar1;
  }
  *unaff_x19 = &UNK_009f5cd8;
  return;
}


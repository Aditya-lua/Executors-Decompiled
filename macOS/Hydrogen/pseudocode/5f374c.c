
void FUN_005f374c(long param_1,undefined8 *param_2)

{
  undefined8 *unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  
  if (*(char *)((long)param_2 + 0x17) < '\0') {
    func_0x00017634((undefined8 *)(param_1 + 0x10),*param_2,param_2[1]);
  }
  else {
    uVar2 = param_2[1];
    uVar1 = *param_2;
    *(undefined8 *)(param_1 + 0x20) = param_2[2];
    *(undefined8 *)(param_1 + 0x18) = uVar2;
    *(undefined8 *)(param_1 + 0x10) = uVar1;
  }
  *unaff_x19 = &UNK_009f5ab8;
  return;
}


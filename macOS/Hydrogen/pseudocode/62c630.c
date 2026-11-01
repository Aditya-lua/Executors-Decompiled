
void FUN_0062c630(undefined8 param_1,long param_2,long param_3)

{
  long unaff_x19;
  long *plVar1;
  long unaff_x22;
  long unaff_x23;
  
  plVar1 = (long *)(param_2 + 0x18);
  *plVar1 = unaff_x23 + 0xd18;
  *(undefined8 *)(param_2 + 0x20) = param_1;
  *(long **)(param_2 + 0x28) = plVar1;
  func_0x00675bac(param_2 + 0x30,param_3 + 0x18);
  *plVar1 = (long)&UNK_009fae50;
  func_0x00675bac(unaff_x19 + 0x50,unaff_x22 + 0x38);
  func_0x00675bac(unaff_x19 + 0x70);
  return;
}


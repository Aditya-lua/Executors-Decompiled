
undefined8 FUN_0074d1dc(undefined8 param_1)

{
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  
  *unaff_x21 = param_1;
  iVar1 = func_0x00793790();
  *(int *)(&UNK_00001448 + unaff_x19) = iVar1;
  *(undefined8 *)(&UNK_00001450 + unaff_x19) = 0;
  if ((unaff_x22 == 0) || (iVar1 == 0)) {
    return 0;
  }
  uVar2 = func_0x00795268();
  *(undefined8 *)(&UNK_00001450 + unaff_x19) = uVar2;
  return 0;
}


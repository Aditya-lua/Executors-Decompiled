
void FUN_000abe34(undefined8 param_1,uint param_2)

{
  undefined2 uVar1;
  int iVar2;
  long unaff_x19;
  int unaff_w20;
  
  _bzero(param_1,param_2 & 0xffff | 0x40000);
  iVar2 = unaff_w20;
  if (0xb < unaff_w20) {
    iVar2 = 0xc;
  }
  uVar1 = 9;
  if (0 < unaff_w20) {
    uVar1 = (short)iVar2;
  }
  *(undefined2 *)(&UNK_00040024 + unaff_x19) = uVar1;
  return;
}


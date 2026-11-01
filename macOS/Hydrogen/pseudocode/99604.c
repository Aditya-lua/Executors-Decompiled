
int FUN_00099604(long param_1,undefined8 param_2)

{
  long lVar1;
  long in_x9;
  ulong uVar2;
  ulong uVar3;
  int unaff_w21;
  long unaff_x22;
  int unaff_w23;
  long unaff_x28;
  
  uVar2 = ((param_1 + in_x9) - unaff_x22) - 0x10e;
  uVar3 = uVar2 / 0xff;
  _memset(param_2,0xff,uVar3 + 1);
  lVar1 = uVar3 + unaff_x28;
  *(char *)(lVar1 + 2) = (char)(uVar2 % 0xff);
  lVar1 = lVar1 + 3;
  _memcpy(lVar1);
  return ((int)lVar1 + unaff_w21) - unaff_w23;
}


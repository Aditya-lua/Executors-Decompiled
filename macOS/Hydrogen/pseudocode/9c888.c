
int FUN_0009c888(undefined8 param_1,long param_2)

{
  undefined1 *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong unaff_x21;
  undefined1 *unaff_x22;
  long unaff_x23;
  long unaff_x29;
  int in_stack_00000078;
  
  uVar2 = unaff_x21 - 0xf;
  if (unaff_x21 < 0xf) {
    *unaff_x22 = (char)((int)unaff_x21 << 4);
  }
  else {
    puVar1 = unaff_x22 + 1;
    *unaff_x22 = 0xf0;
    if (0xfe < uVar2) {
      uVar2 = ((param_2 + *(long *)(unaff_x29 + -0x88)) - unaff_x23) - 0x10e;
      uVar3 = uVar2 / 0xff;
      _memset(puVar1,0xff,uVar3 + 1);
      uVar2 = uVar2 % 0xff;
      puVar1 = unaff_x22 + uVar3 + 2;
    }
    *puVar1 = (char)uVar2;
    unaff_x22 = puVar1;
  }
  _memcpy(unaff_x22 + 1);
  return ((int)(unaff_x22 + 1) + (int)unaff_x21) - in_stack_00000078;
}


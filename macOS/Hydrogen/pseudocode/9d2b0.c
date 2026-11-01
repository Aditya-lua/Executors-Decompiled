
int FUN_0009d2b0(ulong param_1,undefined8 param_2,long param_3,undefined8 param_4,undefined8 param_5
                ,ulong param_6)

{
  undefined1 *puVar1;
  long in_x16;
  ulong uVar2;
  ulong uVar3;
  long unaff_x21;
  ulong unaff_x24;
  undefined1 *unaff_x26;
  long lVar4;
  undefined4 uVar5;
  long unaff_x29;
  long in_stack_00000010;
  int in_stack_00000078;
  
  if (param_6 < param_1) {
    in_stack_00000078 = 0;
    uVar5 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar4 = *(long *)(unaff_x29 + -0x68);
  }
  else {
    uVar2 = unaff_x24 - 0xf;
    if (unaff_x24 < 0xf) {
      *unaff_x26 = (char)((int)unaff_x24 << 4);
      uVar5 = *(undefined4 *)(unaff_x29 + -0x70);
    }
    else {
      puVar1 = unaff_x26 + 1;
      *unaff_x26 = 0xf0;
      if (0xfe < uVar2) {
        uVar2 = ((param_3 + in_stack_00000010) - in_x16) - 0x10e;
        uVar3 = uVar2 / 0xff;
        _memset(puVar1,0xff,uVar3 + 1);
        uVar2 = uVar2 % 0xff;
        puVar1 = unaff_x26 + uVar3 + 2;
      }
      uVar5 = *(undefined4 *)(unaff_x29 + -0x70);
      *puVar1 = (char)uVar2;
      unaff_x26 = puVar1;
    }
    _memcpy(unaff_x26 + 1,in_x16);
    in_stack_00000078 = ((int)(unaff_x26 + 1) + (int)unaff_x24) - in_stack_00000078;
    lVar4 = *(long *)(unaff_x29 + -0x68);
    param_3 = *(long *)(unaff_x29 + -0x60);
  }
  *(long *)(unaff_x21 + 0x4000) = param_3;
  *(undefined4 *)(lVar4 + 8) = uVar5;
  return in_stack_00000078;
}


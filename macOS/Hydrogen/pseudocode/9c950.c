
int FUN_0009c950(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
                undefined1 *param_5)

{
  undefined1 *puVar1;
  long in_x16;
  ulong uVar2;
  long unaff_x21;
  undefined1 *unaff_x22;
  ulong uVar3;
  ulong unaff_x24;
  long lVar4;
  undefined4 uVar5;
  long unaff_x29;
  long in_stack_00000058;
  int in_stack_00000078;
  
  if (param_5 < unaff_x22 + (unaff_x24 + 0xf0) / 0xff + unaff_x24 + 1) {
    in_stack_00000078 = 0;
    uVar5 = *(undefined4 *)(unaff_x29 + -0x70);
    lVar4 = *(long *)(unaff_x29 + -0x68);
  }
  else {
    uVar2 = unaff_x24 - 0xf;
    if (unaff_x24 < 0xf) {
      *unaff_x22 = (char)((int)unaff_x24 << 4);
      uVar5 = *(undefined4 *)(unaff_x29 + -0x70);
      lVar4 = *(long *)(unaff_x29 + -0x68);
    }
    else {
      puVar1 = unaff_x22 + 1;
      *unaff_x22 = 0xf0;
      if (0xfe < uVar2) {
        uVar2 = ((param_2 + in_stack_00000058) - in_x16) - 0x10e;
        uVar3 = uVar2 / 0xff;
        _memset(puVar1,0xff,uVar3 + 1);
        uVar2 = uVar2 % 0xff;
        puVar1 = unaff_x22 + uVar3 + 2;
      }
      uVar5 = *(undefined4 *)(unaff_x29 + -0x70);
      lVar4 = *(long *)(unaff_x29 + -0x68);
      *puVar1 = (char)uVar2;
      unaff_x22 = puVar1;
    }
    _memcpy(unaff_x22 + 1,in_x16);
    in_stack_00000078 = ((int)(unaff_x22 + 1) + (int)unaff_x24) - in_stack_00000078;
    param_2 = *(long *)(unaff_x29 + -0x60);
  }
  *(long *)(unaff_x21 + 0x4000) = param_2;
  *(undefined4 *)(lVar4 + 8) = uVar5;
  return in_stack_00000078;
}


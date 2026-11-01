
void FUN_0040bf98(long param_1,undefined8 *param_2,undefined8 param_3,ulong param_4)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  undefined8 uVar3;
  ulong in_x10;
  ulong uVar4;
  long in_x11;
  
  do {
    lVar1 = (in_x10 >> 1) + in_x9;
    if (*(ulong *)(param_1 + lVar1 * in_x11 + 0x1c0) <= param_4) {
      in_x9 = lVar1;
    }
    in_x10 = in_x10 - (in_x10 >> 1);
  } while (1 < in_x10);
  uVar4 = *(ulong *)(param_1 + in_x9 * 0x230 + 0x1c0);
  if (uVar4 != param_4) {
    if (uVar4 < param_4) {
      in_x9 = in_x9 + 1;
    }
    if (in_x9 != 0) {
      param_1 = param_1 + in_x9 * 0x230;
      if (((*(uint *)(param_1 + -0x230) & 1) == 0) &&
         (uVar4 = param_4 - *(ulong *)(param_1 + -0x228), *(ulong *)(param_1 + -0x228) <= param_4))
      {
        lVar1 = 0xc;
        if (*(char *)(param_1 + -0x1e7) != '\b') {
          lVar1 = 4;
        }
        uVar2 = (*(long *)(param_1 + -0x1f8) - *(ulong *)(param_1 + -0x200)) + lVar1;
        if (uVar2 <= uVar4 && uVar4 - uVar2 < *(ulong *)(param_1 + -0x200)) {
          uVar3 = 0;
          param_2[1] = (uint *)(param_1 + -0x230);
          param_2[2] = uVar4;
          goto LAB_0040c030;
        }
      }
    }
  }
  *(undefined1 *)(param_2 + 1) = 0x3a;
  uVar3 = 1;
LAB_0040c030:
  *param_2 = uVar3;
  return;
}


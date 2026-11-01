
undefined1  [16] FUN_004294a4(undefined8 param_1,undefined8 *param_2,ulong param_3)

{
  ulong uVar1;
  ulong uVar2;
  int in_w9;
  ulong *puVar4;
  ulong *puVar3;
  undefined1 auVar5 [16];
  
  if (in_w9 == 0) {
    puVar3 = (ulong *)*param_2 + 1;
    param_3 = *(ulong *)*param_2;
  }
  else {
    if (in_w9 != 1) goto LAB_00429598;
    param_3 = 0;
    uVar2 = 0;
    puVar4 = (ulong *)*param_2;
    do {
      puVar3 = (ulong *)((long)puVar4 + 1);
      uVar1 = *puVar4;
      param_3 = ((ulong)(byte)uVar1 & 0x7f) << (uVar2 & 0x3f) | param_3;
      uVar2 = uVar2 + 7;
      puVar4 = puVar3;
    } while ((char)(byte)uVar1 < '\0');
  }
  param_1 = 0;
  *param_2 = puVar3;
LAB_00429598:
  auVar5._8_8_ = param_3;
  auVar5._0_8_ = param_1;
  return auVar5;
}


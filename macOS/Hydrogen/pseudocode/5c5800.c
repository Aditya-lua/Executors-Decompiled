
undefined8 FUN_005c5800(undefined8 param_1,long param_2)

{
  byte bVar1;
  long lVar2;
  long in_x9;
  undefined1 in_w10;
  ulong in_x11;
  undefined8 in_x12;
  ulong uVar3;
  undefined4 unaff_w19;
  
  uVar3 = (ulong)LZCOUNT(in_x12) >> 3;
  bVar1 = *(byte *)(in_x9 + uVar3);
  *(undefined1 *)(in_x9 + uVar3) = in_w10;
  *(undefined1 *)(in_x9 + (uVar3 - 8 & in_x11) + 8) = in_w10;
  *(ulong *)(param_2 + 0x10) = *(long *)(param_2 + 0x10) - ((ulong)bVar1 & 1);
  *(long *)(param_2 + 0x18) = *(long *)(param_2 + 0x18) + 1;
  lVar2 = in_x9 + uVar3 * -0x10;
  *(undefined8 *)(lVar2 + -0x10) = param_1;
  *(undefined4 *)(lVar2 + -8) = unaff_w19;
  return 0;
}


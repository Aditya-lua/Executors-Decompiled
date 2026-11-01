
undefined8 FUN_00732aec(undefined8 param_1)

{
  undefined4 in_w8;
  long lVar1;
  long in_x9;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  
  *(undefined4 *)(in_x9 + 0x998) = in_w8;
  *(undefined4 *)(in_x9 + 0x9a4) = *(undefined4 *)(unaff_x19 + 0x9a4);
  uVar2 = *(ulong *)(in_x9 + 0xa1a);
  *(ulong *)(in_x9 + 0xa1a) =
       uVar2 & 0xfffffff800000000 |
       uVar2 & 0x3ffffffff | *(ulong *)(unaff_x19 + 0xa1a) & 0x400000000;
  *(byte *)(unaff_x20 + 0x98) = *(byte *)(unaff_x20 + 0x98) & 0xfe;
  if ((*(long *)(unaff_x20 + 0x88) == 0) ||
     ((*(byte *)(*(long *)(unaff_x20 + 0x88) + 4) >> 5 & 1) == 0)) {
    return param_1;
  }
  lVar1 = *(long *)(*(long *)(unaff_x20 + 0x78) + 0xe0);
  if (lVar1 == 0) {
    return 3;
  }
  if (((*(uint *)(lVar1 + 4) >> 5 & 1) != 0) && (*(code **)(lVar1 + 0x18) != (code *)0x0)) {
    (**(code **)(lVar1 + 0x18))(*(long *)(unaff_x20 + 0x78),5,*(undefined8 *)(lVar1 + 0x20));
  }
  return 0;
}


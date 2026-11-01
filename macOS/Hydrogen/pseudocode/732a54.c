
undefined8 FUN_00732a54(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  
  if ((*(byte *)(param_1 + 4) >> 5 & 1) == 0) {
    lVar2 = *(long *)(unaff_x19 + 0xd8);
    if ((lVar2 == 0) && (lVar2 = *(long *)(unaff_x19 + 0xd0), lVar2 == 0)) {
      *(undefined8 *)(unaff_x19 + 8) = 0;
      *(undefined8 *)(unaff_x19 + 0xc00) = 0xffffffffffffffff;
      return param_2;
    }
    lVar1 = lVar2 + 0x188;
    lVar2 = *(long *)(lVar2 + 0x210);
  }
  else {
    lVar1 = param_1 + 0x28;
    lVar2 = *(long *)(param_1 + 0xb0);
  }
  if ((lVar2 != 0) && ((*(byte *)(lVar2 + 4) >> 5 & 1) != 0)) {
    param_2 = func_0x00779cfc(*(undefined8 *)(lVar1 + 0x78),5,2);
  }
  *(byte *)(lVar1 + 0x98) = *(byte *)(lVar1 + 0x98) | 1;
  lVar2 = *(long *)(lVar1 + 0x40);
  *(long *)(lVar1 + 0x40) = lVar2 + 1;
  *(long *)(unaff_x19 + 8) = lVar2;
  if (lVar2 < 0) {
    *(undefined8 *)(lVar1 + 0x40) = 0;
  }
  *(undefined8 *)(unaff_x19 + 0xc00) = 0xffffffffffffffff;
  lVar2 = *(long *)(lVar1 + 0x78);
  *(undefined4 *)(lVar2 + 0x998) = *(undefined4 *)(unaff_x19 + 0x998);
  *(undefined4 *)(lVar2 + 0x9a4) = *(undefined4 *)(unaff_x19 + 0x9a4);
  uVar3 = *(ulong *)(lVar2 + 0xa1a);
  *(ulong *)(lVar2 + 0xa1a) =
       uVar3 & 0xfffffff800000000 |
       uVar3 & 0x3ffffffff | *(ulong *)(unaff_x19 + 0xa1a) & 0x400000000;
  *(byte *)(lVar1 + 0x98) = *(byte *)(lVar1 + 0x98) & 0xfe;
  if ((*(long *)(lVar1 + 0x88) == 0) || ((*(byte *)(*(long *)(lVar1 + 0x88) + 4) >> 5 & 1) == 0)) {
    return param_2;
  }
  lVar2 = *(long *)(*(long *)(lVar1 + 0x78) + 0xe0);
  if (lVar2 == 0) {
    return 3;
  }
  if (((*(uint *)(lVar2 + 4) >> 5 & 1) != 0) && (*(code **)(lVar2 + 0x18) != (code *)0x0)) {
    (**(code **)(lVar2 + 0x18))(*(long *)(lVar1 + 0x78),5,*(undefined8 *)(lVar2 + 0x20));
  }
  return 0;
}


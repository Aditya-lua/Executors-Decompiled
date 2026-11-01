
ulong FUN_00790848(undefined8 param_1)

{
  ulong uVar1;
  long unaff_x19;
  long lVar2;
  
  lVar2 = *(long *)(unaff_x19 + 0x18);
  uVar1 = func_0x0077e6f8(param_1,*(undefined8 *)(lVar2 + 0x68));
  if ((int)uVar1 == 0) {
    return uVar1;
  }
  if (*(int *)(unaff_x19 + 0xc48) == *(int *)(lVar2 + 0x518)) {
    return (ulong)(*(int *)(unaff_x19 + 0xc4c) == *(int *)(*(long *)(lVar2 + 0x3a0) + 0x94));
  }
  return 0;
}


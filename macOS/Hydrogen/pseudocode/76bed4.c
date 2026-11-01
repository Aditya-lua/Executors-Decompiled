
undefined8 FUN_0076bed4(long param_1,long param_2)

{
  long lVar1;
  long unaff_x19;
  undefined8 *unaff_x20;
  ulong unaff_x21;
  
  if (param_2 != 0) {
    if (unaff_x21 <= *(ulong *)(param_1 + 0x120)) goto LAB_0076bf20;
    (*pcRam0000000000a2b5f0)();
    lVar1 = *(long *)(unaff_x19 + 0xd0);
    *(undefined8 *)(lVar1 + 0x118) = 0;
    *(undefined8 *)(lVar1 + 0x120) = 0;
  }
  lVar1 = (*pcRam0000000000a2b5e8)();
  param_1 = *(long *)(unaff_x19 + 0xd0);
  *(long *)(param_1 + 0x118) = lVar1;
  if (lVar1 == 0) {
    func_0x0073c9e4();
    return 0x1b;
  }
  *(ulong *)(param_1 + 0x120) = unaff_x21;
LAB_0076bf20:
  *(byte *)(param_1 + 0x271) = *(byte *)(param_1 + 0x271) | 0x40;
  *unaff_x20 = *(undefined8 *)(*(long *)(unaff_x19 + 0xd0) + 0x118);
  return 0;
}



/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006e4ee8(undefined8 param_1)

{
  byte bVar1;
  long lVar2;
  long *plVar3;
  long in_x9;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar4;
  
  *(undefined8 *)(in_x9 + 0x10) = param_1;
  uVar4 = *unaff_x20;
  if (*(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x48) <
      *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x40)) {
    bVar1 = *(byte *)(unaff_x19 + 1);
  }
  else {
    func_0x006efe90();
    bVar1 = *(byte *)(unaff_x19 + 1);
  }
  if ((bVar1 >> 2 & 1) != 0) {
    func_0x006f0ed4();
  }
  lVar2 = func_0x006ef7c8();
  *(undefined8 *)(lVar2 + 0x18) = uVar4;
  *(long *)(lVar2 + 0x20) = -0x20 - lVar2;
  *(long *)(lVar2 + 0x28) = lVar2 + 0x28;
  plVar3 = *(long **)(unaff_x19 + 8);
  *plVar3 = lVar2;
  *(undefined4 *)((long)plVar3 + 0xc) = 7;
  lVar2 = *(long *)(unaff_x19 + 8);
  *(long *)(unaff_x19 + 8) = lVar2 + 0x10;
  *(undefined8 *)(lVar2 + 0x10) = unaff_x20[1];
  *(undefined8 *)(lVar2 + 0x18) = _UNK_008300d0;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  func_0x006ee550();
  return;
}


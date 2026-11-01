
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006e4eb4(long param_1)

{
  byte bVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  
  if (*(ulong *)(param_1 + 0x48) < *(ulong *)(param_1 + 0x40)) {
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
  *(undefined8 *)(lVar2 + 0x18) = unaff_x21;
  *(long *)(lVar2 + 0x20) = -0x20 - lVar2;
  *(long *)(lVar2 + 0x28) = lVar2 + 0x28;
  plVar3 = *(long **)(unaff_x19 + 8);
  *plVar3 = lVar2;
  *(undefined4 *)((long)plVar3 + 0xc) = 7;
  lVar2 = *(long *)(unaff_x19 + 8);
  *(long *)(unaff_x19 + 8) = lVar2 + 0x10;
  *(undefined8 *)(lVar2 + 0x10) = *(undefined8 *)(unaff_x20 + 8);
  *(undefined8 *)(lVar2 + 0x18) = _UNK_008300d0;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  func_0x006ee550();
  return;
}


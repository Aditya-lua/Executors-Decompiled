
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_006e4e80(code *param_1)

{
  byte bVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long *plVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar6;
  
  iVar2 = (*param_1)();
  if (iVar2 != 0) {
    lVar3 = func_0x006eceb0();
    return (ulong)*(byte *)(lVar3 + 3);
  }
  uVar4 = *(long *)(unaff_x19 + 8) + 0x20;
  if (*(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) < uVar4) {
    *(ulong *)(*(long *)(unaff_x19 + 0x20) + 0x10) = uVar4;
    uVar6 = *unaff_x20;
    if (*(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x40) <=
        *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x48)) goto LAB_006e4f00;
  }
  else {
    uVar6 = *unaff_x20;
    if (*(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x40) <=
        *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x48)) {
LAB_006e4f00:
      func_0x006efe90();
      bVar1 = *(byte *)(unaff_x19 + 1);
      goto joined_r0x006e4ec4;
    }
  }
  bVar1 = *(byte *)(unaff_x19 + 1);
joined_r0x006e4ec4:
  if ((bVar1 >> 2 & 1) != 0) {
    func_0x006f0ed4();
  }
  lVar3 = func_0x006ef7c8();
  *(undefined8 *)(lVar3 + 0x18) = uVar6;
  *(long *)(lVar3 + 0x20) = -0x20 - lVar3;
  *(long *)(lVar3 + 0x28) = lVar3 + 0x28;
  plVar5 = *(long **)(unaff_x19 + 8);
  *plVar5 = lVar3;
  *(undefined4 *)((long)plVar5 + 0xc) = 7;
  lVar3 = *(long *)(unaff_x19 + 8);
  *(long *)(unaff_x19 + 8) = lVar3 + 0x10;
  *(undefined8 *)(lVar3 + 0x10) = unaff_x20[1];
  *(undefined8 *)(lVar3 + 0x18) = _UNK_008300d0;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  uVar4 = func_0x006ee550();
  return uVar4;
}


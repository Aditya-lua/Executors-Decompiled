
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_0064c604(void)

{
  long *plVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  ulong uVar5;
  long unaff_x19;
  
  func_0x00621dd4();
  *(undefined **)(unaff_x19 + 0x18) = &UNK_009ff600;
  *(undefined **)(unaff_x19 + 0x20) = &UNK_009ff6d0;
  uVar4 = _UNK_00a10ed8;
  uVar3 = _UNK_00a10ed0;
  lVar2 = _UNK_00a10e68;
  plVar1 = (long *)(unaff_x19 + 0x28);
  *plVar1 = _UNK_00a10e68;
  *(undefined8 *)(unaff_x19 + 0x30) = uVar3;
  *(undefined8 *)((long)plVar1 + *(long *)(lVar2 + -0x18)) = uVar4;
  func_0x00621dd4(unaff_x19 + 0x80);
  *(undefined **)(unaff_x19 + 0x70) = &UNK_00a098c0;
  if (*(long **)(unaff_x19 + 0x78) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x19 + 0x78) + 8))();
  }
  uVar4 = _UNK_00a10ec8;
  uVar3 = _UNK_00a10ec0;
  lVar2 = _UNK_00a10e70;
  *plVar1 = _UNK_00a10e70;
  *(undefined8 *)(unaff_x19 + 0x30) = uVar3;
  *(undefined8 *)((long)plVar1 + *(long *)(lVar2 + -0x18)) = uVar4;
  *(undefined **)(unaff_x19 + 0x40) = &UNK_009f5d60;
  lVar2 = *(long *)(unaff_x19 + 0x60);
  uVar5 = *(ulong *)(unaff_x19 + 0x50);
  if (*(ulong *)(unaff_x19 + 0x58) <= *(ulong *)(unaff_x19 + 0x50)) {
    uVar5 = *(ulong *)(unaff_x19 + 0x58);
  }
  if (lVar2 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  return plVar1;
}


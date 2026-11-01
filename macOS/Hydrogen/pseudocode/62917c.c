
void FUN_0062917c(long param_1,long param_2,long param_3)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 *puVar3;
  
  puVar3 = (undefined8 *)(param_2 + 8);
  *puVar3 = *(undefined8 *)(param_3 + 0x70);
  *(undefined8 *)(param_2 + 0x10) = *(undefined8 *)(param_3 + 0x78);
  *(undefined8 *)(param_2 + *(long *)(param_1 + -0x18)) = *(undefined8 *)(param_3 + 0x80);
  *(undefined **)(param_2 + 0x140) = &UNK_009f5d60;
  lVar1 = *(long *)(param_2 + 0x160);
  uVar2 = *(ulong *)(unaff_x19 + 0x150);
  if (*(ulong *)(unaff_x19 + 0x158) <= *(ulong *)(unaff_x19 + 0x150)) {
    uVar2 = *(ulong *)(unaff_x19 + 0x158);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  lVar1 = *(long *)(unaff_x20 + 8);
  *(long *)(unaff_x19 + 8) = lVar1;
  *(undefined8 *)(unaff_x19 + 0x10) = *(undefined8 *)(unaff_x20 + 0x60);
  *(undefined8 *)((long)puVar3 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(unaff_x20 + 0x68);
  func_0x0065a978(unaff_x19 + 0x60);
  lVar1 = *(long *)(unaff_x20 + 0x10);
  *(long *)(unaff_x19 + 8) = lVar1;
  *(undefined8 *)(unaff_x19 + 0x10) = *(undefined8 *)(unaff_x20 + 0x50);
  *(undefined8 *)((long)puVar3 + *(long *)(lVar1 + -0x18)) = *(undefined8 *)(unaff_x20 + 0x58);
  func_0x006989cc(unaff_x19 + 0x18);
  return;
}


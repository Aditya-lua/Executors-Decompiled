
void FUN_007122c8(long param_1)

{
  undefined1 uVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  long in_x9;
  ulong uVar5;
  long unaff_x20;
  long *unaff_x22;
  undefined8 unaff_x24;
  ulong uVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined4 uStack0000000000000004;
  undefined4 uStack000000000000000c;
  
  lVar2 = func_0x00711360();
  lVar4 = *(long *)(unaff_x20 + 400);
  uVar5 = *(long *)(unaff_x20 + 0x198) - lVar4 >> 3;
  uVar6 = (ulong)(param_1 - in_x9) >> 3 & 0xffffffff;
  if (uVar6 < uVar5) {
    do {
      uVar7 = uVar5 - 1;
      uVar8 = *(undefined8 *)(*(long *)(*unaff_x22 + uVar5 * 8 + -8) + 0x18);
      puVar3 = (undefined8 *)func_0x006db828(unaff_x20 + 0x168);
      *puVar3 = uVar8;
      uVar5 = uVar7;
    } while (uVar6 < uVar7);
    lVar4 = *(long *)(unaff_x20 + 400);
    uVar5 = *(long *)(unaff_x20 + 0x198) - lVar4 >> 3;
  }
  if (uVar5 < uVar6) {
    func_0x006cfeb0();
  }
  else if (uVar6 < uVar5) {
    *(ulong *)(unaff_x20 + 0x198) = lVar4 + uVar6 * 8;
  }
  *(int *)(*(long *)(unaff_x20 + 0x150) + -4) = *(int *)(*(long *)(unaff_x20 + 0x150) + -4) + -1;
  uVar8 = *(undefined8 *)(unaff_x20 + 0x8c);
  uVar1 = func_0x00716f30();
  *(undefined1 *)(lVar2 + 0x30) = uVar1;
  uStack0000000000000004 = (undefined4)((ulong)unaff_x24 >> 0x20);
  uStack000000000000000c = (undefined4)((ulong)uVar8 >> 0x20);
  func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x48);
  func_0x00706e70();
  return;
}


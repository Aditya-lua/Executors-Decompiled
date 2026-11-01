
void FUN_00712294(void)

{
  long lVar1;
  long lVar2;
  undefined1 uVar3;
  long lVar4;
  undefined8 *puVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x20;
  undefined8 unaff_x24;
  ulong uVar8;
  ulong uVar9;
  undefined8 uVar10;
  undefined4 uStack0000000000000004;
  undefined4 uStack000000000000000c;
  
  func_0x00710d48();
  *(int *)(*(long *)(unaff_x20 + 0x150) + -4) = *(int *)(*(long *)(unaff_x20 + 0x150) + -4) + 1;
  lVar1 = *(long *)(unaff_x20 + 400);
  lVar2 = *(long *)(unaff_x20 + 0x198);
  lVar4 = func_0x00711360();
  lVar6 = *(long *)(unaff_x20 + 400);
  uVar7 = *(long *)(unaff_x20 + 0x198) - lVar6 >> 3;
  uVar8 = (ulong)(lVar2 - lVar1) >> 3 & 0xffffffff;
  if (uVar8 < uVar7) {
    do {
      uVar9 = uVar7 - 1;
      uVar10 = *(undefined8 *)(*(long *)(*(long *)(unaff_x20 + 400) + uVar7 * 8 + -8) + 0x18);
      puVar5 = (undefined8 *)func_0x006db828(unaff_x20 + 0x168);
      *puVar5 = uVar10;
      uVar7 = uVar9;
    } while (uVar8 < uVar9);
    lVar6 = *(long *)(unaff_x20 + 400);
    uVar7 = *(long *)(unaff_x20 + 0x198) - lVar6 >> 3;
  }
  if (uVar8 < uVar7 || uVar8 - uVar7 == 0) {
    if (uVar8 < uVar7) {
      *(ulong *)(unaff_x20 + 0x198) = lVar6 + uVar8 * 8;
    }
  }
  else {
    func_0x006cfeb0((long *)(unaff_x20 + 400),uVar8 - uVar7);
  }
  *(int *)(*(long *)(unaff_x20 + 0x150) + -4) = *(int *)(*(long *)(unaff_x20 + 0x150) + -4) + -1;
  uVar10 = *(undefined8 *)(unaff_x20 + 0x8c);
  uVar3 = func_0x00716f30();
  *(undefined1 *)(lVar4 + 0x30) = uVar3;
  uStack0000000000000004 = (undefined4)((ulong)unaff_x24 >> 0x20);
  uStack000000000000000c = (undefined4)((ulong)uVar10 >> 0x20);
  func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x48);
  func_0x00706e70();
  return;
}


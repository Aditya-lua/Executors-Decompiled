
/* WARNING: Removing unreachable block (ram,0x004229f4) */
/* WARNING: Removing unreachable block (ram,0x00422a14) */
/* WARNING: Removing unreachable block (ram,0x00422a24) */
/* WARNING: Removing unreachable block (ram,0x00422a2c) */
/* WARNING: Removing unreachable block (ram,0x00422a34) */
/* WARNING: Removing unreachable block (ram,0x00422a40) */

void FUN_0042288c(void)

{
  int iVar1;
  ulong unaff_x20;
  undefined8 uVar2;
  long unaff_x22;
  undefined8 *puVar3;
  long unaff_x29;
  
  if ((unaff_x20 & 3) == 1) {
    uVar2 = *(undefined8 *)(unaff_x20 - 1);
    puVar3 = *(undefined8 **)(unaff_x20 + 7);
    if ((code *)*puVar3 != (code *)0x0) {
      (*(code *)*puVar3)(uVar2);
    }
    if (puVar3[1] != 0) {
      func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
    }
    func_0x00187bd4((undefined8 *)(unaff_x20 - 1),0x18,8);
  }
  *(undefined8 *)(unaff_x22 + 0x62) = 0;
  *(undefined8 *)(unaff_x22 + 0x5a) = 0;
  *(undefined4 *)(unaff_x29 + -0x34) = 0x6a;
  iVar1 = _getpeername();
  if (iVar1 == -1) {
    ___error();
  }
  else if (*(int *)(unaff_x29 + -0x34) == 0) {
    *(undefined8 *)(unaff_x22 + 0x44) = *(undefined8 *)(unaff_x22 + 0x40);
    *(undefined8 *)(unaff_x22 + 0x3c) = *(undefined8 *)(unaff_x22 + 0x38);
    *(undefined8 *)(unaff_x22 + 0x54) = *(undefined8 *)(unaff_x22 + 0x50);
    *(undefined8 *)(unaff_x22 + 0x4c) = *(undefined8 *)(unaff_x22 + 0x48);
    *(undefined8 *)(unaff_x22 + 100) = *(undefined8 *)(unaff_x22 + 0x60);
    *(undefined8 *)(unaff_x22 + 0x5c) = *(undefined8 *)(unaff_x22 + 0x58);
    *(undefined8 *)(unaff_x22 + 0x14) = *(undefined8 *)(unaff_x22 + 0x10);
    *(undefined8 *)(unaff_x22 + 0xc) = *(undefined8 *)(unaff_x22 + 8);
    *(undefined8 *)(unaff_x22 + 0x24) = *(undefined8 *)(unaff_x22 + 0x20);
    *(undefined8 *)(unaff_x22 + 0x1c) = *(undefined8 *)(unaff_x22 + 0x18);
    *(ulong *)(unaff_x22 + 4) = (ulong)*(uint *)(unaff_x22 + 2) << 0x10;
    *(undefined8 *)(unaff_x22 + 0x34) = *(undefined8 *)(unaff_x22 + 0x30);
    *(undefined8 *)(unaff_x22 + 0x2c) = *(undefined8 *)(unaff_x22 + 0x28);
    func_0x004653b0();
  }
  func_0x00465628();
  return;
}


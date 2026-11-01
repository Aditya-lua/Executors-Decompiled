
/* WARNING: Removing unreachable block (ram,0x00422898) */
/* WARNING: Removing unreachable block (ram,0x004228b8) */
/* WARNING: Removing unreachable block (ram,0x004228c8) */
/* WARNING: Removing unreachable block (ram,0x004228d0) */
/* WARNING: Removing unreachable block (ram,0x004228d8) */
/* WARNING: Removing unreachable block (ram,0x004228e4) */
/* WARNING: Removing unreachable block (ram,0x004229f4) */
/* WARNING: Removing unreachable block (ram,0x00422a14) */
/* WARNING: Removing unreachable block (ram,0x00422a24) */
/* WARNING: Removing unreachable block (ram,0x00422a2c) */
/* WARNING: Removing unreachable block (ram,0x00422a34) */
/* WARNING: Removing unreachable block (ram,0x00422a40) */

void FUN_00422860(void)

{
  int iVar1;
  long unaff_x22;
  long unaff_x29;
  ulong in_stack_00000080;
  
  iVar1 = _getsockname();
  if (iVar1 == -1) {
    ___error();
  }
  else if ((*(int *)(unaff_x29 + -0x34) == 0) || (in_stack_00000080._1_1_ == '\x01')) {
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
    *(ulong *)(unaff_x22 + 4) =
         in_stack_00000080 & 0xffff |
         (ulong)*(uint *)(unaff_x22 + 2) << 0x10 | in_stack_00000080 & 0xffff000000000000;
    *(undefined8 *)(unaff_x22 + 0x34) = *(undefined8 *)(unaff_x22 + 0x30);
    *(undefined8 *)(unaff_x22 + 0x2c) = *(undefined8 *)(unaff_x22 + 0x28);
    func_0x004653b0();
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


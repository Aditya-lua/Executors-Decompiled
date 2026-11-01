
/* WARNING: Removing unreachable block (ram,0x004229f4) */
/* WARNING: Removing unreachable block (ram,0x00422a14) */
/* WARNING: Removing unreachable block (ram,0x00422a24) */
/* WARNING: Removing unreachable block (ram,0x00422a2c) */
/* WARNING: Removing unreachable block (ram,0x00422a34) */
/* WARNING: Removing unreachable block (ram,0x00422a40) */

void FUN_00422940(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16])

{
  int iVar1;
  ulong in_x9;
  long in_x10;
  undefined2 in_w11;
  long unaff_x22;
  long unaff_x29;
  undefined4 in_stack_00000070;
  ulong in_stack_00000080;
  undefined2 in_stack_000000e8;
  undefined4 uStack00000000000000ec;
  
  *(long *)(unaff_x22 + 0x24) = param_3._8_8_;
  *(long *)(unaff_x22 + 0x1c) = param_3._0_8_;
  in_stack_00000070 = CONCAT22(in_stack_00000070._2_2_,in_w11);
  *(ulong *)(unaff_x22 + 4) =
       in_x9 | in_x10 << 8 |
       (ulong)*(uint *)(unaff_x22 + 2) << 0x10 | in_stack_00000080 & 0xffff000000000000;
  uStack00000000000000ec = in_stack_00000070;
  *(long *)(unaff_x22 + 0x34) = param_2._8_8_;
  *(long *)(unaff_x22 + 0x2c) = param_2._0_8_;
  func_0x004653b0();
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
    in_stack_00000070 = CONCAT22(in_stack_00000070._2_2_,in_stack_000000e8);
    *(ulong *)(unaff_x22 + 4) = (ulong)*(uint *)(unaff_x22 + 2) << 0x10;
    uStack00000000000000ec = in_stack_00000070;
    *(undefined8 *)(unaff_x22 + 0x34) = *(undefined8 *)(unaff_x22 + 0x30);
    *(undefined8 *)(unaff_x22 + 0x2c) = *(undefined8 *)(unaff_x22 + 0x28);
    func_0x004653b0();
  }
  func_0x00465628();
  return;
}


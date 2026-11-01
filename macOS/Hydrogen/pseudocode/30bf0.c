
/* WARNING: Removing unreachable block (ram,0x00030db0) */
/* WARNING: Removing unreachable block (ram,0x00030d8c) */
/* WARNING: Removing unreachable block (ram,0x00030dc4) */
/* WARNING: Removing unreachable block (ram,0x00030c4c) */

undefined8 FUN_00030bf0(void)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x29;
  undefined8 uVar3;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  
  uVar1 = func_0x000310dc();
  uVar3 = *(undefined8 *)(unaff_x29 + -0x48);
  lVar2 = *(long *)(unaff_x29 + -0x38);
  *(undefined8 *)(unaff_x29 + -0x48) = 0;
  *(undefined8 *)(unaff_x29 + -0x40) = 0;
  *(undefined8 *)(unaff_x29 + -0x38) = 0;
  func_0x00031798();
  if (lVar2 < 0) {
    __ZdlPv(uVar3);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  return uVar1;
}


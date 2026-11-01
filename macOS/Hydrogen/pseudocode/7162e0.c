
/* WARNING: Removing unreachable block (ram,0x00716260) */

undefined8 FUN_007162e0(void)

{
  long *plVar1;
  undefined8 uVar2;
  long lVar3;
  long unaff_x29;
  undefined8 uStack00000000000000d0;
  undefined8 in_stack_000000e0;
  
  *(undefined8 *)(unaff_x29 + -0xd0) = 0;
  *(undefined8 *)(unaff_x29 + -200) = 0;
  *(undefined8 *)(unaff_x29 + -0xe8) = 0;
  *(undefined8 *)(unaff_x29 + -0xe0) = 0;
  func_0x0070aa74(&uStack00000000000000d0);
  uVar2 = func_0x00716770();
  if (in_stack_000000e0._7_1_ < '\0') {
    __ZdlPv(uStack00000000000000d0);
  }
  plVar1 = *(long **)(unaff_x29 + -0xa0);
  lVar3 = *plVar1 + *(long *)(unaff_x29 + -0x98) * 0x38;
  if (lVar3 != plVar1[1]) {
    plVar1[1] = lVar3;
  }
  return uVar2;
}


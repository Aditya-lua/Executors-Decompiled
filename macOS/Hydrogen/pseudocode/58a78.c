
void FUN_00058a78(long *param_1)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  long *in_x9;
  long *plVar4;
  long *unaff_x19;
  long unaff_x24;
  long unaff_x29;
  long *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  long *in_stack_00000078;
  long *in_stack_00000080;
  undefined4 uStack_14;
  
  if (in_x9 == param_1) {
    lVar2 = 4;
LAB_00058a94:
    (**(code **)(*in_stack_00000020 + lVar2 * 8))();
  }
  else if (in_x9 != (long *)0x0) {
    lVar2 = 5;
    in_stack_00000020 = in_x9;
    goto LAB_00058a94;
  }
  plVar4 = *(long **)(unaff_x24 + 0x210);
  if (plVar4 == in_stack_00000078) {
    lVar2 = 4;
LAB_00058ac8:
    (**(code **)(*in_stack_00000078 + lVar2 * 8))();
  }
  else if (plVar4 != (long *)0x0) {
    lVar2 = 5;
    in_stack_00000078 = plVar4;
    goto LAB_00058ac8;
  }
  plVar4 = *(long **)(unaff_x24 + 0x1f0);
  if (plVar4 == in_stack_00000080) {
    lVar2 = 4;
LAB_00058afc:
    (**(code **)(*in_stack_00000080 + lVar2 * 8))();
  }
  else if (plVar4 != (long *)0x0) {
    lVar2 = 5;
    in_stack_00000080 = plVar4;
    goto LAB_00058afc;
  }
  func_0x00058e28(in_stack_00000028);
  func_0x00058e28(in_stack_00000030);
  func_0x00058e28(in_stack_00000038);
  func_0x00058e28(in_stack_00000040);
  func_0x00058e28(in_stack_00000048);
  func_0x00058e28(in_stack_00000050);
  func_0x00058e28(in_stack_00000058);
  func_0x00058e28(in_stack_00000060);
  func_0x00058e28(in_stack_00000068);
  func_0x00058e28(in_stack_00000070);
  lVar2 = *unaff_x19;
  if (lVar2 == *(long *)(unaff_x29 + -0x78)) {
    lVar3 = 4;
LAB_00058b80:
    (**(code **)(**(long **)(unaff_x29 + -0x78) + lVar3 * 8))();
  }
  else if (lVar2 != 0) {
    lVar3 = 5;
    *(long *)(unaff_x29 + -0x78) = lVar2;
    goto LAB_00058b80;
  }
  if (*(char *)(unaff_x24 + 199) < '\0') {
    __ZdlPv(*(undefined8 *)(unaff_x24 + 0xb0));
  }
  func_0x00056a34(*(undefined8 *)(unaff_x29 + -0x70),*(undefined8 *)(unaff_x24 + 0xa0));
  FUN_00058ed0(*(undefined8 *)(unaff_x29 + -0x68));
  plVar4 = *(long **)(unaff_x24 + 0x20);
  if (plVar4 == *(long **)(unaff_x29 + -0x60)) {
    lVar2 = 4;
    plVar4 = *(long **)(unaff_x29 + -0x60);
  }
  else {
    if (plVar4 == (long *)0x0) goto code_r0x00058bec;
    lVar2 = 5;
  }
  (**(code **)(*plVar4 + lVar2 * 8))();
code_r0x00058bec:
  uVar1 = __Unwind_Resume();
  uStack_14 = 1;
  _setsockopt(uVar1,0xffff,0x200,&uStack_14,4);
  return;
}


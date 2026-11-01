
/* WARNING: Removing unreachable block (ram,0x0026ce0c) */
/* WARNING: Removing unreachable block (ram,0x0026ce2c) */
/* WARNING: Removing unreachable block (ram,0x0026ce40) */

void FUN_0026cd24(long param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  long lVar4;
  long unaff_x22;
  undefined8 uVar5;
  long lVar6;
  long unaff_x24;
  long lVar7;
  long unaff_x29;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  undefined8 uStack0000000000000068;
  long in_stack_00000070;
  long in_stack_00000078;
  
  uVar5 = *(undefined8 *)(param_1 + 0x48);
  *(undefined8 *)(unaff_x29 + -0x60) = *(undefined8 *)(param_1 + 0x40);
  *(undefined8 *)(unaff_x29 + -0x58) = uVar5;
  *(undefined8 *)(unaff_x29 + -0x50) = 0;
  *(long *)(unaff_x29 + -0x48) = (long)register0x00000008 + 0x20;
  func_0x00268254(&uStack0000000000000068,unaff_x29 + -0x60,&UNK_009cbc20);
  lVar2 = in_stack_00000070;
  lVar4 = uStack0000000000000068;
  func_0x00266f58(unaff_x29 + -0x60,in_stack_00000070,in_stack_00000070 + in_stack_00000078 * 0x30);
  if (lVar4 != 0) {
    func_0x00187bd4(lVar2,lVar4 * 0x30,8);
  }
  func_0x0026e894((long)register0x00000008 + 0x20);
  lVar4 = *(long *)(unaff_x20 + 0x38);
  if (lVar4 < 0) {
    unaff_x24 = 0;
LAB_0026cefc:
    func_0x007a1f00(unaff_x24,lVar4,&UNK_009cbc38);
    goto LAB_0026cf2c;
  }
  uVar5 = *(undefined8 *)(unaff_x20 + 0x30);
  if (lVar4 == 0) {
    lVar2 = 1;
    _memcpy(1,uVar5,0);
    lVar7 = *(long *)(unaff_x20 + 0x50);
  }
  else {
    unaff_x24 = 1;
    lVar2 = func_0x00187bd0(lVar4,1);
    if (lVar2 == 0) goto LAB_0026cefc;
    _memcpy(lVar2,uVar5,lVar4);
    lVar7 = *(long *)(unaff_x20 + 0x50);
  }
  if (lVar7 == 0) {
    lVar6 = -0x8000000000000000;
    goto LAB_0026ce9c;
  }
  lVar6 = *(long *)(unaff_x20 + 0x58);
  if (lVar6 < 0) {
    uVar5 = 0;
LAB_0026cf18:
    func_0x007a1f00(uVar5,lVar6,&UNK_009cbc38);
LAB_0026cf2c:
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x26cf30);
    (*pcVar1)();
  }
  if (lVar6 == 0) {
    unaff_x24 = 1;
  }
  else {
    uVar5 = 1;
    unaff_x24 = func_0x00187bd0(lVar6,1);
    if (unaff_x24 == 0) goto LAB_0026cf18;
  }
  _memcpy(unaff_x24,lVar7,lVar6);
LAB_0026ce9c:
  lVar7 = *(long *)(unaff_x29 + -0x60);
  unaff_x19[0x10] = *(long *)(unaff_x29 + -0x58);
  unaff_x19[0xf] = lVar7;
  unaff_x19[6] = in_stack_00000038;
  unaff_x19[5] = in_stack_00000030;
  unaff_x19[8] = in_stack_00000048;
  unaff_x19[7] = in_stack_00000040;
  unaff_x19[10] = in_stack_00000058;
  unaff_x19[9] = in_stack_00000050;
  lVar7 = *(long *)(unaff_x29 + -0x50);
  lVar3 = *(long *)(unaff_x20 + 0x60);
  *unaff_x19 = lVar4;
  unaff_x19[1] = lVar2;
  unaff_x19[4] = in_stack_00000028;
  unaff_x19[3] = unaff_x22;
  unaff_x19[2] = lVar4;
  unaff_x19[0xb] = in_stack_00000060;
  unaff_x19[0xc] = lVar6;
  unaff_x19[0xd] = unaff_x24;
  unaff_x19[0xe] = lVar6;
  unaff_x19[0x11] = lVar7;
  unaff_x19[0x12] = lVar3;
  return;
}


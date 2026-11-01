
void FUN_0024be10(undefined8 param_1)

{
  ulong unaff_x19;
  long unaff_x20;
  undefined8 *puVar1;
  long lVar2;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x26;
  undefined8 uVar3;
  long unaff_x29;
  undefined8 uVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 *in_stack_00000008;
  long *in_stack_00000010;
  ulong in_stack_00000020;
  undefined1 uStack00000000000000b0;
  undefined8 uStack00000000000000e0;
  
  uStack00000000000000e0 = param_1;
  func_0x00253cc8(unaff_x29 + -0x98,&uStack00000000000000b0);
  uVar3 = *(undefined8 *)(unaff_x29 + -0x98);
  uVar6 = *(undefined8 *)(unaff_x29 + -0x80);
  uVar4 = *(undefined8 *)(unaff_x29 + -0x88);
  unaff_x21[9] = *(undefined8 *)(unaff_x29 + -0x90);
  unaff_x21[8] = uVar3;
  unaff_x21[0xb] = uVar6;
  unaff_x21[10] = uVar4;
  uVar3 = *(undefined8 *)(unaff_x29 + -0x78);
  unaff_x21[0xd] = *(undefined8 *)(unaff_x29 + -0x70);
  unaff_x21[0xc] = uVar3;
  *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x68);
  if (*in_stack_00000010 == unaff_x26) {
    uVar3 = *(undefined8 *)(unaff_x20 + 0x3f0);
    puVar1 = *(undefined8 **)(unaff_x20 + 0x3f8);
    if ((code *)*puVar1 != (code *)0x0) {
      (*(code *)*puVar1)(uVar3);
    }
    if (puVar1[1] != 0) {
      func_0x00187bd4(uVar3,puVar1[1],puVar1[2]);
    }
  }
  else {
    func_0x00245b38(in_stack_00000010);
  }
  lVar2 = unaff_x21[8];
  lVar7 = unaff_x21[0xb];
  lVar5 = unaff_x21[10];
  in_stack_00000010[1] = unaff_x21[9];
  *in_stack_00000010 = lVar2;
  in_stack_00000010[3] = lVar7;
  in_stack_00000010[2] = lVar5;
  lVar2 = unaff_x21[0xc];
  in_stack_00000010[5] = unaff_x21[0xd];
  in_stack_00000010[4] = lVar2;
  in_stack_00000010[6] = *(long *)(unaff_x29 + -0xa0);
  lVar2 = unaff_x19 - in_stack_00000020;
  if (unaff_x19 < in_stack_00000020 || lVar2 == 0) {
    lVar2 = 0;
  }
  else {
    _memmove();
  }
  *(long *)(unaff_x24 + 0x18) = lVar2;
  uVar3 = *unaff_x21;
  uVar6 = unaff_x21[3];
  uVar4 = unaff_x21[2];
  in_stack_00000008[1] = unaff_x21[1];
  *in_stack_00000008 = uVar3;
  in_stack_00000008[3] = uVar6;
  in_stack_00000008[2] = uVar4;
  uVar3 = unaff_x21[4];
  in_stack_00000008[5] = unaff_x21[5];
  in_stack_00000008[4] = uVar3;
  in_stack_00000008[6] = uStack00000000000000e0;
  if ((code *)*unaff_x23 != (code *)0x0) {
    (*(code *)*unaff_x23)();
  }
  if (unaff_x23[1] != 0) {
    func_0x00187bd4();
  }
  return;
}



void FUN_001ae1ac(void)

{
  undefined1 uVar1;
  undefined2 uVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined1 unaff_w23;
  undefined1 unaff_w24;
  undefined1 unaff_w25;
  long unaff_x28;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  
  if ((in_stack_00000028 != -0x8000000000000000) && (in_stack_00000028 != 0)) {
    func_0x00187bd4(in_stack_00000030,in_stack_00000028,1);
  }
  uVar1 = (undefined1)((ulong)unaff_x22 >> 0x30);
  uVar2 = (undefined2)((ulong)unaff_x22 >> 0x20);
  if (unaff_x28 == 3) {
    *(int *)((long)unaff_x19 + 9) = (int)unaff_x22;
    *(undefined1 *)((long)unaff_x19 + 0xf) = uVar1;
    *(undefined2 *)((long)unaff_x19 + 0xd) = uVar2;
    unaff_x19[2] = unaff_x20;
    unaff_x19[3] = unaff_x21;
    *(undefined1 *)(unaff_x19 + 1) = unaff_w23;
    *unaff_x19 = 3;
  }
  else {
    *unaff_x19 = unaff_x28;
    *(undefined1 *)(unaff_x19 + 1) = unaff_w23;
    *(int *)((long)unaff_x19 + 9) = (int)unaff_x22;
    *(undefined1 *)((long)unaff_x19 + 0xf) = uVar1;
    *(undefined2 *)((long)unaff_x19 + 0xd) = uVar2;
    unaff_x19[2] = unaff_x20;
    unaff_x19[3] = unaff_x21;
    *(undefined1 *)(unaff_x19 + 4) = unaff_w25;
    *(undefined1 *)((long)unaff_x19 + 0x21) = unaff_w24;
  }
  return;
}


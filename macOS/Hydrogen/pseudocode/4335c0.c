
void FUN_004335c0(void)

{
  undefined4 unaff_w19;
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  ulong in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  
  func_0x004338c0(&uStack0000000000000010);
  if ((short)uStack0000000000000010 == 2) {
    if ((in_stack_00000018 & 3) == 1) {
      puVar1 = (undefined8 *)(in_stack_00000018 - 1);
      uVar2 = *puVar1;
      puVar3 = *(undefined8 **)(in_stack_00000018 + 7);
      if ((code *)*puVar3 != (code *)0x0) {
        (*(code *)*puVar3)(uVar2);
      }
      if (puVar3[1] != 0) {
        func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
      }
      func_0x00187bd4(puVar1,0x18,8);
    }
    func_0x00433440(&uStack0000000000000010);
  }
  else {
    in_stack_00000030 = CONCAT62(uStack0000000000000010._2_6_,(short)uStack0000000000000010);
    in_stack_00000038 = in_stack_00000018;
    in_stack_00000048 = in_stack_00000028;
    in_stack_00000040 = in_stack_00000020;
    func_0x004653b0();
    func_0x00433440(&uStack0000000000000010);
  }
  if ((short)uStack0000000000000010 == 2) {
    if ((in_stack_00000018 & 3) == 1) {
      puVar1 = (undefined8 *)(in_stack_00000018 - 1);
      uVar2 = *puVar1;
      puVar3 = *(undefined8 **)(in_stack_00000018 + 7);
      if ((code *)*puVar3 != (code *)0x0) {
        (*(code *)*puVar3)(uVar2);
      }
      if (puVar3[1] != 0) {
        func_0x00187bd4(uVar2,puVar3[1],puVar3[2]);
      }
      func_0x00187bd4(puVar1,0x18,8);
    }
  }
  else {
    in_stack_00000030 = CONCAT62(uStack0000000000000010._2_6_,(short)uStack0000000000000010);
    in_stack_00000038 = in_stack_00000018;
    in_stack_00000040 = in_stack_00000020;
    in_stack_00000048 = in_stack_00000028;
    func_0x004653b0();
  }
  in_stack_00000030 = CONCAT44(in_stack_00000030._4_4_,unaff_w19);
  func_0x004653b0();
  func_0x00465628();
  return;
}


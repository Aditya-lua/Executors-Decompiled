
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_001f0184(long *param_1,undefined8 *param_2)

{
  char cVar1;
  uint uVar2;
  ulong uVar3;
  undefined8 uVar4;
  long unaff_x29;
  long *in_stack_00000010;
  undefined8 uStack0000000000000020;
  byte in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  if (*param_1 == 0) {
    func_0x0079cbcc(param_1);
    uVar3 = func_0x0043002c();
    if ((uVar3 & 1) != 0) goto LAB_001f019c;
LAB_001f023c:
    uVar2 = 2;
LAB_001f024c:
    uVar4 = (**(code **)(param_2[1] + 0x18))(*param_2,&UNK_0082073c,0x17);
    if (uVar2 == 2) {
      return uVar4;
    }
    if ((uVar2 & 1) != 0) goto LAB_001f028c;
  }
  else {
    uVar3 = func_0x0043002c();
    if ((uVar3 & 1) == 0) goto LAB_001f023c;
LAB_001f019c:
    if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
        0x7fffffffffffffff) == 0) {
      uVar2 = 0;
      cVar1 = (char)param_1[1];
    }
    else {
      uVar2 = func_0x007a1140();
      uVar2 = uVar2 ^ 1;
      cVar1 = (char)param_1[1];
    }
    in_stack_00000010 = param_1;
    if (cVar1 != '\0') goto LAB_001f024c;
    in_stack_00000028 = (byte)uVar2;
    *(undefined8 **)(unaff_x29 + -0x30) = &uStack0000000000000020;
    *(undefined **)(unaff_x29 + -0x28) = &DAT_00202d64;
    uStack0000000000000030 = &UNK_007fc120;
    in_stack_00000038 = 1;
    in_stack_00000048 = 1;
    in_stack_00000050 = 0;
    in_stack_00000040 = unaff_x29 + -0x30;
    uStack0000000000000020 = param_1;
    uVar4 = func_0x0046849c(*param_2,param_2[1],&uStack0000000000000030);
    in_stack_00000010 = uStack0000000000000020;
    if ((in_stack_00000028 & 1) != 0) goto LAB_001f028c;
  }
  if (((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
       0x7fffffffffffffff) != 0) && (uVar3 = func_0x007a1140(), (uVar3 & 1) == 0)) {
    *(undefined1 *)(in_stack_00000010 + 1) = 1;
  }
LAB_001f028c:
  func_0x00430048(*in_stack_00000010);
  return uVar4;
}


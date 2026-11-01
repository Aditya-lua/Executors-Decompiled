
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_00469c10(void)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined8 *unaff_x19;
  long unaff_x21;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined1 *in_stack_00000028;
  long in_stack_00000030;
  
  uVar2 = (**(code **)(in_stack_00000030 + 0x18))(in_stack_00000028,&UNK_00893e13,2);
  if ((uVar2 & 1) == 0) {
    if (*(char *)((long)unaff_x19 + 0x12) < '\0') {
      uStack0000000000000020._7_1_ = 1;
      in_stack_00000008 = unaff_x19[1];
      in_stack_00000000 = *unaff_x19;
      in_stack_00000010 = (long)&uStack0000000000000020 + 7;
      in_stack_00000028 = (undefined1 *)register0x00000008;
      iVar1 = (**(code **)(unaff_x21 + 0x18))();
      if (iVar1 != 0) {
        return 1;
      }
      uVar2 = (*_UNK_009e0528)(in_stack_00000028,&UNK_00893e13,2);
    }
    else {
      uVar2 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,&UNK_00893e0e,2);
      if ((uVar2 & 1) != 0) {
        return 1;
      }
      uVar2 = (**(code **)(unaff_x21 + 0x18))();
    }
    if ((uVar2 & 1) == 0) {
      uVar3 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,&UNK_008937f2,1);
      return uVar3;
    }
  }
  return 1;
}


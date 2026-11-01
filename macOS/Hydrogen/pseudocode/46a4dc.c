
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0046a4dc(long param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  undefined8 *unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  
  uVar3 = (**(code **)(param_1 + 0x18))(param_2,&UNK_00893e13,2);
  if ((uVar3 & 1) == 0) {
    uVar4 = *(undefined8 *)(unaff_x29 + 0x18);
    lVar1 = *(long *)(unaff_x29 + 0x20);
    if (*(char *)((long)unaff_x19 + 0x12) < '\0') {
      uStack0000000000000020._7_1_ = 1;
      in_stack_00000008 = unaff_x19[1];
      in_stack_00000000 = *unaff_x19;
      in_stack_00000010 = (long)&uStack0000000000000020 + 7;
      uStack0000000000000028 = (undefined1 *)register0x00000008;
      iVar2 = (**(code **)(lVar1 + 0x18))(uVar4,&uStack0000000000000028);
      if (iVar2 != 0) {
        return 1;
      }
      uVar3 = (*_UNK_009e0528)(uStack0000000000000028,&UNK_00893e13,2);
    }
    else {
      uVar3 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,&UNK_00893e0e,2);
      if ((uVar3 & 1) != 0) {
        return 1;
      }
      uVar3 = (**(code **)(lVar1 + 0x18))(uVar4);
    }
    if ((uVar3 & 1) == 0) {
      uVar4 = *(undefined8 *)(unaff_x29 + 0x28);
      lVar1 = *(long *)(unaff_x29 + 0x30);
      if (*(char *)((long)unaff_x19 + 0x12) < '\0') {
        uStack0000000000000020._7_1_ = 1;
        in_stack_00000008 = unaff_x19[1];
        in_stack_00000000 = *unaff_x19;
        in_stack_00000010 = (long)&uStack0000000000000020 + 7;
        uStack0000000000000028 = (undefined1 *)register0x00000008;
        iVar2 = (**(code **)(lVar1 + 0x18))(uVar4,&uStack0000000000000028);
        if (iVar2 != 0) {
          return 1;
        }
        uVar3 = (*_UNK_009e0528)(uStack0000000000000028,&UNK_00893e13,2);
      }
      else {
        uVar3 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,&UNK_00893e0e,2);
        if ((uVar3 & 1) != 0) {
          return 1;
        }
        uVar3 = (**(code **)(lVar1 + 0x18))(uVar4);
      }
      if ((uVar3 & 1) == 0) {
        uVar4 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,&UNK_008937f2,1);
        return uVar4;
      }
    }
  }
  return 1;
}


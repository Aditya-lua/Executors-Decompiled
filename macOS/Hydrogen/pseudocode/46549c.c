
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0046549c(undefined8 param_1,undefined8 param_2)

{
  undefined1 uVar1;
  ulong uVar2;
  code *in_x9;
  undefined8 *unaff_x20;
  undefined1 unaff_w23;
  long unaff_x24;
  long unaff_x25;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 *in_stack_00000010;
  undefined1 uStack0000000000000027;
  undefined1 *in_stack_00000028;
  
  uVar2 = (*in_x9)(param_1,param_2,3);
  if ((uVar2 & 1) == 0) {
    uStack0000000000000027 = 1;
    in_stack_00000008 = unaff_x20[1];
    in_stack_00000000 = *unaff_x20;
    in_stack_00000010 = &uStack0000000000000027;
    in_stack_00000028 = (undefined1 *)register0x00000008;
    uVar2 = func_0x004650d8();
    if ((((uVar2 & 1) == 0) && (uVar2 = func_0x004650d8(), (uVar2 & 1) == 0)) &&
       (uVar2 = (**(code **)(unaff_x25 + 0x18))(), (uVar2 & 1) == 0)) {
      uVar1 = (*_UNK_009e0528)(in_stack_00000028,&UNK_00893e13,2);
      goto LAB_0046551c;
    }
  }
  uVar1 = 1;
LAB_0046551c:
  *(undefined1 *)(unaff_x24 + 8) = uVar1;
  *(undefined1 *)(unaff_x24 + 9) = unaff_w23;
  return;
}


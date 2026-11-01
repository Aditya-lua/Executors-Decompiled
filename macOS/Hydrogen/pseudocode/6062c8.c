
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006062c8(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long in_x9;
  undefined8 in_x10;
  undefined8 in_x12;
  undefined8 *unaff_x19;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  
  *(undefined8 *)(in_x9 + 0x48) = in_x10;
  *(undefined8 *)(in_x9 + 0x50) = in_x12;
  *(undefined **)(in_x9 + 0x58) = &DAT_005f5984;
  *(undefined **)(in_x9 + 0xe8) = &DAT_005f63c0;
  *(undefined **)(in_x9 + 0x20) = &DAT_005f6838;
  *(undefined **)(in_x9 + 0xb0) = &DAT_005f9574;
  *(undefined **)(in_x9 + 0x68) = &DAT_005f850c;
  *(undefined **)(in_x9 + 0xf8) = &DAT_005fa300;
  *(undefined1 *)(param_1 + 0x148) = 1;
  DataMemoryBarrier(2,3);
  *unaff_x19 = &UNK_009f5d60;
  uVar1 = _UNK_008baa70;
  unaff_x19[3] = _UNK_008baa78;
  unaff_x19[2] = uVar1;
  puVar2 = (undefined8 *)func_0x006115d0(0x10);
  *(undefined4 *)(unaff_x19 + 5) = 0;
  *puVar2 = 0;
  puVar2[1] = 0;
  unaff_x19[3] = in_stack_00000010;
  unaff_x19[2] = in_stack_00000008;
  unaff_x19[4] = in_stack_00000018;
  puVar2[1] = 0;
  *puVar2 = 0;
  func_0x00611644();
  return;
}


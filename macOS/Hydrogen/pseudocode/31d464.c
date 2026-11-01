
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0031d464(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long in_x9;
  long unaff_x19;
  undefined8 uVar3;
  
  uVar2 = _UNK_00830098;
  uVar1 = _UNK_00830090;
  uVar3 = *(undefined8 *)(in_x9 + 0xd90);
  *(undefined8 *)(param_1 + 0x28) = *(undefined8 *)(in_x9 + 0xd98);
  *(undefined8 *)(param_1 + 0x20) = uVar3;
  *(undefined8 *)(param_1 + 0x38) = uVar2;
  *(undefined8 *)(param_1 + 0x30) = uVar1;
  uVar1 = _UNK_00830080;
  *(undefined8 *)(param_1 + 0x48) = _UNK_00830088;
  *(undefined8 *)(param_1 + 0x40) = uVar1;
  func_0x00373e9c(0xa29628,&DAT_0031d4a4);
  *(long *)(unaff_x19 + 0x378) = unaff_x19;
  return;
}


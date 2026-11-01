
void FUN_00477978(long param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  byte bVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  long in_x10;
  ulong in_x13;
  undefined1 uStack0000000000000080;
  
  while ((bool)in_CY && !(bool)in_ZR) {
    uVar1 = (uint)in_x13 & 0xf;
    bVar2 = (byte)in_x13 & 0xf | 0x30;
    if (9 < uVar1) {
      bVar2 = (char)uVar1 + 0x57;
    }
    *(byte *)(in_x10 + param_1 + 0x7f) = bVar2;
    param_1 = param_1 + -1;
    in_ZR = in_x13 == 0xf;
    in_CY = 0xe < in_x13;
    in_x13 = in_x13 >> 4;
  }
  func_0x00468684(param_3,1,&UNK_00893f21,2,&uStack0000000000000080 + param_1,-param_1);
  return;
}


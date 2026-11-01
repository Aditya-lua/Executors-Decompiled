
bool FUN_005246c8(byte *param_1,undefined8 param_2,ulong param_3)

{
  byte bVar1;
  byte bVar2;
  bool bVar3;
  long in_x9;
  byte *pbVar4;
  byte *unaff_x19;
  long unaff_x20;
  ulong in_stack_00000000;
  
  if (unaff_x20 == in_x9) {
    pbVar4 = param_1;
    do {
      bVar3 = unaff_x20 == 0;
      if (unaff_x20 == 0) break;
      bVar1 = *unaff_x19;
      unaff_x20 = unaff_x20 + -1;
      bVar2 = *pbVar4;
      pbVar4 = pbVar4 + 1;
      unaff_x19 = unaff_x19 + 1;
    } while (((uint)bVar1 | (uint)(bVar1 - 0x41 < 0x1a) << 5) ==
             ((uint)bVar2 | (uint)(bVar2 - 0x41 < 0x1a) << 5));
  }
  else {
    bVar3 = false;
  }
  if ((param_3 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(param_1,param_3,1);
  }
  if ((in_stack_00000000 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4();
  }
  return bVar3;
}


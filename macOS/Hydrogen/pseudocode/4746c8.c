
void FUN_004746c8(uint param_1,undefined8 param_2)

{
  byte bVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint in_w8;
  long lVar5;
  long lVar6;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  if ((in_w8 >> 0x1a & 1) != 0) {
    lVar6 = 0;
    do {
      lVar5 = lVar6;
      uVar2 = param_1 & 0xffff;
      uVar3 = param_1 & 0xf;
      bVar1 = (byte)param_1;
      param_1 = param_1 >> 4 & 0xfff;
      bVar1 = bVar1 & 0xf | 0x30;
      if (9 < uVar3) {
        bVar1 = (char)uVar3 + 0x37;
      }
      *(byte *)((long)&uStack0000000000000078 + lVar5 + 7) = bVar1;
      lVar6 = lVar5 + -1;
    } while (0xf < uVar2);
    func_0x00468684(param_2,1,&UNK_00893f21,2,(long)&uStack0000000000000078 + lVar5 + 7,
                    -(lVar5 + -1));
    return;
  }
  if ((param_1 & 0xffff) < 1000) {
    if ((param_1 & 0xffff) < 10) {
      lVar6 = 5;
      uVar2 = param_1;
    }
    else {
      uVar2 = (param_1 >> 2 & 0x3fff) / 0x19;
      lVar6 = 3;
      uStack0000000000000078._6_2_ =
           *(undefined2 *)(&UNK_00893f27 + ((ulong)(param_1 + uVar2 * -100) & 0xffff) * 2);
    }
  }
  else {
    uVar2 = (param_1 >> 4 & 0xfff) / 0x271;
    uVar4 = param_1 + uVar2 * -10000;
    uVar3 = (uVar4 >> 2 & 0x3fff) / 0x19;
    uStack0000000000000078._4_2_ = *(undefined2 *)(&UNK_00893f27 + (ulong)uVar3 * 2);
    lVar6 = 1;
    uStack0000000000000078._6_2_ =
         *(undefined2 *)(&UNK_00893f27 + ((ulong)(uVar4 + uVar3 * -100) & 0xffff) * 2);
  }
  if (((param_1 & 0xffff) == 0) || ((uVar2 & 0xffff) != 0)) {
    *(undefined *)((long)&uStack0000000000000078 + lVar6 + 2) = (&UNK_00893f28)[(uVar2 & 0xf) << 1];
    lVar6 = lVar6 + -1;
  }
  func_0x00468684(param_2,1,1,0,(long)&uStack0000000000000078 + lVar6 + 3,5 - lVar6);
  return;
}


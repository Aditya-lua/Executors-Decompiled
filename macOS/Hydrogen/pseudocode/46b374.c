
undefined1  [16] FUN_0046b374(uint *param_1,long param_2,ulong param_3)

{
  byte bVar1;
  byte bVar2;
  undefined8 uVar3;
  undefined1 in_w9;
  int iVar4;
  uint uVar5;
  long in_x10;
  long in_x11;
  undefined1 auVar6 [16];
  
  *(undefined1 *)param_1 = in_w9;
  if (in_x11 == in_x10) {
LAB_0046b3f4:
    param_1 = (uint *)(param_2 + 0x10);
    if (*(char *)param_1 != -0x80) {
      if ((uint)*(byte *)(param_2 + 0x14) < (uint)*(byte *)(param_2 + 0x15)) {
        uVar5 = *(byte *)(param_2 + 0x15) - 1;
        *(char *)(param_2 + 0x15) = (char)uVar5;
        goto LAB_0046b484;
      }
      *(undefined1 *)param_1 = 0x80;
    }
    uVar3 = 0;
  }
  else {
    bVar1 = *(byte *)(in_x10 + -1);
    *(byte **)(param_2 + 8) = (byte *)(in_x10 + -1);
    bVar2 = (&UNK_00894c47)[bVar1];
    uVar5 = bVar2 & 0x7f;
    if ((char)bVar2 < '\0') {
      if ((bVar2 & 0x7f) == 0) {
        uVar5 = (uint)(byte)(&UNK_00884900)[(ulong)bVar1 & 0xf] << 0x18 |
                (uint)(byte)(&UNK_00884900)[bVar1 >> 4] << 0x10 | 0x785c;
        iVar4 = 4;
      }
      else {
        uVar5 = uVar5 << 8 | 0x5c;
        iVar4 = 2;
      }
    }
    else {
      iVar4 = 1;
      if (uVar5 == 0x80) goto LAB_0046b3f4;
    }
    *param_1 = uVar5;
    *(short *)(param_1 + 1) = (short)(iVar4 << 8);
    uVar5 = iVar4 - 1;
    *(char *)(param_2 + 0x1b) = (char)uVar5;
LAB_0046b484:
    param_3 = (ulong)*(byte *)((long)param_1 + ((ulong)uVar5 & 0xff));
    uVar3 = 1;
  }
  auVar6._8_8_ = param_3;
  auVar6._0_8_ = uVar3;
  return auVar6;
}


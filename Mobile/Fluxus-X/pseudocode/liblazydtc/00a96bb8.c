/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a96bb8
 */

void IDEA_cfb64_encrypt(byte *param_1,byte *param_2,long param_3,undefined8 param_4,byte *param_5,
                       uint *param_6,int param_7)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  ulong local_60;
  ulong local_58;
  
  uVar3 = *param_6;
  if ((int)uVar3 < 0) {
    uVar3 = 0xffffffff;
  }
  else if (param_7 == 0) {
    for (; param_3 != 0; param_3 = param_3 + -1) {
      if (uVar3 == 0) {
        local_60 = (ulong)*param_5 << 0x18 | (ulong)param_5[1] << 0x10 | (ulong)param_5[2] << 8 |
                   (ulong)param_5[3];
        local_58 = (ulong)param_5[4] << 0x18 | (ulong)param_5[5] << 0x10 | (ulong)param_5[6] << 8 |
                   (ulong)param_5[7];
        IDEA_encrypt(&local_60,param_4);
        *param_5 = (byte)(local_60 >> 0x18);
        param_5[3] = (byte)local_60;
        param_5[1] = (byte)(local_60 >> 0x10);
        param_5[2] = (byte)(local_60 >> 8);
        param_5[4] = (byte)(local_58 >> 0x18);
        param_5[5] = (byte)(local_58 >> 0x10);
        param_5[6] = (byte)(local_58 >> 8);
        param_5[7] = (byte)local_58;
      }
      bVar1 = *param_1;
      bVar2 = param_5[(int)uVar3];
      param_5[(int)uVar3] = bVar1;
      *param_2 = bVar2 ^ bVar1;
      uVar3 = uVar3 + 1 & 7;
      param_2 = param_2 + 1;
      param_1 = param_1 + 1;
    }
  }
  else {
    for (; param_3 != 0; param_3 = param_3 + -1) {
      if (uVar3 == 0) {
        local_60 = (ulong)*param_5 << 0x18 | (ulong)param_5[1] << 0x10 | (ulong)param_5[2] << 8 |
                   (ulong)param_5[3];
        local_58 = (ulong)param_5[4] << 0x18 | (ulong)param_5[5] << 0x10 | (ulong)param_5[6] << 8 |
                   (ulong)param_5[7];
        IDEA_encrypt(&local_60,param_4);
        *param_5 = (byte)(local_60 >> 0x18);
        param_5[3] = (byte)local_60;
        param_5[1] = (byte)(local_60 >> 0x10);
        param_5[2] = (byte)(local_60 >> 8);
        param_5[4] = (byte)(local_58 >> 0x18);
        param_5[5] = (byte)(local_58 >> 0x10);
        param_5[6] = (byte)(local_58 >> 8);
        param_5[7] = (byte)local_58;
      }
      bVar1 = *param_1;
      bVar2 = param_5[(int)uVar3];
      *param_2 = bVar2 ^ bVar1;
      param_5[(int)uVar3] = bVar2 ^ bVar1;
      uVar3 = uVar3 + 1 & 7;
      param_2 = param_2 + 1;
      param_1 = param_1 + 1;
    }
  }
  *param_6 = uVar3;
  return;
}


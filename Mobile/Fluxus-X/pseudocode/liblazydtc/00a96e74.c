/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a96e74
 */

void IDEA_ofb64_encrypt(byte *param_1,byte *param_2,long param_3,undefined8 param_4,byte *param_5,
                       uint *param_6)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  ulong local_70;
  ulong uStack_68;
  byte local_58 [4];
  byte local_54;
  byte local_53;
  byte local_52;
  byte local_51;
  
  uVar2 = *param_6;
  if ((int)uVar2 < 0) {
    uVar2 = 0xffffffff;
  }
  else {
    local_58[0] = *param_5;
    local_58[1] = param_5[1];
    local_70 = (ulong)*param_5 << 0x18 | (ulong)param_5[1] << 0x10 | (ulong)param_5[2] << 8 |
               (ulong)param_5[3];
    uStack_68 = (ulong)param_5[4] << 0x18 | (ulong)param_5[5] << 0x10 | (ulong)param_5[6] << 8 |
                (ulong)param_5[7];
    local_58[2] = param_5[2];
    local_58[3] = param_5[3];
    local_54 = param_5[4];
    local_53 = param_5[5];
    local_52 = param_5[6];
    local_51 = param_5[7];
    if (param_3 != 0) {
      iVar3 = 0;
      do {
        param_3 = param_3 + -1;
        if (uVar2 == 0) {
          IDEA_encrypt(&local_70,param_4);
          iVar3 = iVar3 + 1;
          local_58[0] = (byte)(local_70 >> 0x18);
          local_58[1] = (byte)(local_70 >> 0x10);
          local_58[3] = (byte)local_70;
          local_54 = (byte)(uStack_68 >> 0x18);
          local_53 = (byte)(uStack_68 >> 0x10);
          local_58[2] = (byte)(local_70 >> 8);
          local_52 = (byte)(uStack_68 >> 8);
          local_51 = (byte)uStack_68;
        }
        lVar1 = (long)(int)uVar2;
        uVar2 = uVar2 + 1 & 7;
        *param_2 = local_58[lVar1] ^ *param_1;
        param_2 = param_2 + 1;
        param_1 = param_1 + 1;
      } while (param_3 != 0);
      if (iVar3 != 0) {
        *param_5 = (byte)(local_70 >> 0x18);
        param_5[3] = (byte)local_70;
        param_5[1] = (byte)(local_70 >> 0x10);
        param_5[2] = (byte)(local_70 >> 8);
        param_5[4] = (byte)(uStack_68 >> 0x18);
        param_5[5] = (byte)(uStack_68 >> 0x10);
        param_5[6] = (byte)(uStack_68 >> 8);
        param_5[7] = (byte)uStack_68;
      }
    }
  }
  *param_6 = uVar2;
  return;
}


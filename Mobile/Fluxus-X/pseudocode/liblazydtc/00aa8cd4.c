/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa8cd4
 */

void CRYPTO_cfb128_1_encrypt
               (long param_1,long param_2,ulong param_3,undefined8 param_4,undefined8 param_5,
               undefined8 param_6,undefined4 param_7,undefined8 param_8)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  byte local_68 [4];
  undefined1 local_64 [4];
  
  if (param_3 != 0) {
    uVar3 = 0;
    do {
      uVar4 = uVar3 >> 3;
      uVar1 = (uint)uVar3 & 7;
      uVar2 = 1 << (ulong)(uVar1 ^ 7);
      local_64[0] = 0;
      if ((uVar2 & *(byte *)(param_1 + uVar4)) != 0) {
        local_64[0] = 0x80;
      }
      FUN_00aa8db0(local_64,local_68,1,param_4,param_5,param_7,param_8);
      uVar3 = uVar3 + 1;
      *(byte *)(param_2 + uVar4) =
           (byte)((local_68[0] & 0x80) >> (ulong)uVar1) |
           *(byte *)(param_2 + uVar4) & ((byte)uVar2 ^ 0xff);
    } while (param_3 != uVar3);
  }
  return;
}


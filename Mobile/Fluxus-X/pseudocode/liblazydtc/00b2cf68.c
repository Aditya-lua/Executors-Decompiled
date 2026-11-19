/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2cf68
 */

undefined8 FUN_00b2cf68(long param_1,long param_2,long param_3,long param_4)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  byte local_68 [4];
  uchar local_64 [4];
  
  uVar3 = (uint)*(char *)(param_1 + 0x6c);
  lVar2 = param_4 << 3;
  if (*(char *)(param_1 + 0x6c) < '\0') {
    lVar2 = param_4;
  }
  if (lVar2 != 0) {
    uVar4 = 0;
    while( true ) {
      uVar5 = uVar4 >> 3;
      uVar1 = (uint)uVar4 & 7;
      local_64[0] = '\0';
      if ((1 << (ulong)(uVar1 ^ 7) & (uint)*(byte *)(param_3 + uVar5)) != 0) {
        local_64[0] = 0x80;
      }
      DES_ede3_cfb_encrypt
                (local_64,local_68,1,1,(DES_key_schedule *)(param_1 + 0xc0),
                 (DES_key_schedule *)(param_1 + 0x140),(DES_key_schedule *)(param_1 + 0x1c0),
                 (DES_cblock *)(param_1 + 0x20),uVar3 >> 1 & 1);
      *(byte *)(param_2 + uVar5) =
           (byte)((local_68[0] & 0x80) >> (ulong)uVar1) |
           (byte)(-0x81 >> uVar1) & *(byte *)(param_2 + uVar5);
      if (lVar2 - 1U == uVar4) break;
      uVar3 = (uint)*(byte *)(param_1 + 0x6c);
      uVar4 = uVar4 + 1;
    }
  }
  return 1;
}


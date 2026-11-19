/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a93170
 */

undefined8 FUN_00a93170(long param_1,long param_2,long param_3,ulong param_4)

{
  uint uVar1;
  int enc;
  DES_key_schedule *schedule;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  byte local_68 [4];
  uchar local_64 [4];
  
  if (param_4 != 0) {
    uVar4 = param_4;
    if (param_4 >> 0x1b != 0) {
      uVar4 = 0x8000000;
    }
    do {
      if (uVar4 * 8 != 0) {
        uVar2 = 0;
        do {
          uVar3 = uVar2 >> 3;
          uVar1 = (uint)uVar2 & 7;
          local_64[0] = '\0';
          if ((1 << (ulong)(uVar1 ^ 7) & (uint)*(byte *)(param_3 + uVar3)) != 0) {
            local_64[0] = 0x80;
          }
          schedule = (DES_key_schedule *)EVP_CIPHER_CTX_get_cipher_data(param_1);
          enc = EVP_CIPHER_CTX_is_encrypting(param_1);
          DES_cfb_encrypt(local_64,local_68,1,1,schedule,(DES_cblock *)(param_1 + 0x28),enc);
          uVar2 = uVar2 + 1;
          *(byte *)(param_2 + uVar3) =
               (byte)((local_68[0] & 0x80) >> (ulong)uVar1) |
               (byte)(-0x81 >> uVar1) & *(byte *)(param_2 + uVar3);
        } while (uVar4 * 8 != uVar2);
      }
      param_3 = param_3 + uVar4;
      param_2 = param_2 + uVar4;
      param_4 = param_4 - uVar4;
      uVar2 = param_4;
      if (uVar4 <= param_4) {
        uVar2 = uVar4;
      }
      uVar4 = uVar2;
    } while (param_4 != 0);
  }
  return 1;
}


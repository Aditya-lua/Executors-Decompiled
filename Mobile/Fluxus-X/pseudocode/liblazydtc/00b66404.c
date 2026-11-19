/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66404
 */

undefined8 ossl_cipher_unpadblock(long param_1,ulong *param_2,ulong param_3)

{
  byte bVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  
  if (*param_2 == param_3) {
    bVar1 = *(byte *)(param_1 + param_3 + -1);
    uVar3 = (ulong)bVar1;
    if ((uVar3 == 0) || (param_3 < uVar3)) {
      ERR_new();
      uVar2 = 0x7c;
    }
    else {
      uVar4 = 0;
      while (param_1 = param_1 + -1, *(byte *)(param_1 + param_3) == bVar1) {
        uVar4 = uVar4 + 1;
        if (uVar3 <= uVar4) {
          *param_2 = param_3 - uVar4;
          return 1;
        }
      }
      ERR_new();
      uVar2 = 0x81;
    }
    ERR_set_debug("providers/implementations/ciphers/ciphercommon_block.c",uVar2,
                  "ossl_cipher_unpadblock");
    uVar2 = 100;
  }
  else {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon_block.c",0x72,
                  "ossl_cipher_unpadblock");
    uVar2 = 0xc0103;
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}


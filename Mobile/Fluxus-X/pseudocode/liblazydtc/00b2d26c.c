/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d26c
 */

undefined8 ossl_cipher_hw_tdes_cbc(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  uchar *puVar3;
  ulong uVar4;
  uchar *output;
  
  if (*(code **)(param_1 + 0x240) == (code *)0x0) {
    if (param_4 >> 0x1e != 0) {
      uVar1 = param_4 - 0x40000000;
      uVar4 = uVar1 & 0xffffffffc0000000;
      lVar2 = uVar4 + 0x40000000;
      puVar3 = param_3 + lVar2;
      output = param_2;
      do {
        DES_ede3_cbc_encrypt
                  (param_3,output,0x40000000,(DES_key_schedule *)(param_1 + 0xc0),
                   (DES_key_schedule *)(param_1 + 0x140),(DES_key_schedule *)(param_1 + 0x1c0),
                   (DES_cblock *)(param_1 + 0x20),*(byte *)(param_1 + 0x6c) >> 1 & 1);
        param_4 = param_4 - 0x40000000;
        param_3 = param_3 + 0x40000000;
        output = output + 0x40000000;
      } while (param_4 >> 0x1e != 0);
      param_4 = uVar1 - uVar4;
      param_2 = param_2 + lVar2;
      param_3 = puVar3;
    }
    if (param_4 != 0) {
      DES_ede3_cbc_encrypt
                (param_3,param_2,param_4,(DES_key_schedule *)(param_1 + 0xc0),
                 (DES_key_schedule *)(param_1 + 0x140),(DES_key_schedule *)(param_1 + 0x1c0),
                 (DES_cblock *)(param_1 + 0x20),*(byte *)(param_1 + 0x6c) >> 1 & 1);
    }
  }
  else {
    (**(code **)(param_1 + 0x240))(param_3,param_2,param_4,param_1 + 0xc0,param_1 + 0x20);
  }
  return 1;
}


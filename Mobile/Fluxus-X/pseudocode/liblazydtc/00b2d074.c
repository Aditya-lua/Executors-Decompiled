/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2d074
 */

undefined8 FUN_00b2d074(long param_1,uchar *param_2,uchar *param_3,ulong param_4)

{
  ulong uVar1;
  long lVar2;
  uchar *puVar3;
  ulong uVar4;
  uchar *out;
  
  if (param_4 >> 0x1e != 0) {
    uVar1 = param_4 - 0x40000000;
    uVar4 = uVar1 & 0xffffffffc0000000;
    lVar2 = uVar4 + 0x40000000;
    puVar3 = param_3 + lVar2;
    out = param_2;
    do {
      DES_ede3_cfb_encrypt
                (param_3,out,8,0x40000000,(DES_key_schedule *)(param_1 + 0xc0),
                 (DES_key_schedule *)(param_1 + 0x140),(DES_key_schedule *)(param_1 + 0x1c0),
                 (DES_cblock *)(param_1 + 0x20),*(byte *)(param_1 + 0x6c) >> 1 & 1);
      param_4 = param_4 - 0x40000000;
      param_3 = param_3 + 0x40000000;
      out = out + 0x40000000;
    } while (param_4 >> 0x1e != 0);
    param_4 = uVar1 - uVar4;
    param_2 = param_2 + lVar2;
    param_3 = puVar3;
  }
  if (param_4 != 0) {
    DES_ede3_cfb_encrypt
              (param_3,param_2,8,param_4,(DES_key_schedule *)(param_1 + 0xc0),
               (DES_key_schedule *)(param_1 + 0x140),(DES_key_schedule *)(param_1 + 0x1c0),
               (DES_cblock *)(param_1 + 0x20),*(byte *)(param_1 + 0x6c) >> 1 & 1);
  }
  return 1;
}


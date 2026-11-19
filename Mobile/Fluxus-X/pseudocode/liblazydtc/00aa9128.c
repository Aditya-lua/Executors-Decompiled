/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa9128
 */

void CRYPTO_cfb128_8_encrypt
               (byte *param_1,byte *param_2,long param_3,undefined8 param_4,byte *param_5,
               undefined8 param_6,int param_7,code *param_8)

{
  byte bVar1;
  byte bVar2;
  undefined8 uVar3;
  undefined8 local_60;
  undefined8 uStack_58;
  
  if (param_3 != 0) {
    do {
      uStack_58 = *(undefined8 *)(param_5 + 8);
      local_60 = *(undefined8 *)param_5;
      (*param_8)(param_5,param_5,param_4);
      bVar1 = *param_1;
      bVar2 = *param_5 ^ bVar1;
      *param_2 = bVar2;
      if (param_7 != 0) {
        bVar1 = bVar2;
      }
      param_3 = param_3 + -1;
      *(undefined8 *)(param_5 + 7) = *(undefined8 *)((long)((ulong)&local_60 | 1) + 7);
      uVar3 = *(undefined8 *)((ulong)&local_60 | 1);
      param_5[0xf] = bVar1;
      *(undefined8 *)param_5 = uVar3;
      param_2 = param_2 + 1;
      param_1 = param_1 + 1;
    } while (param_3 != 0);
  }
  return;
}


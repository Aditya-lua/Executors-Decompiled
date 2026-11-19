/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b66248
 */

void ossl_cipher_generic_initkey
               (long param_1,ulong param_2,ulong param_3,ulong param_4,undefined4 param_5,
               uint param_6,undefined8 param_7,long param_8)

{
  undefined8 uVar1;
  byte bVar2;
  
  if ((param_6 >> 9 & 1) != 0) {
    *(byte *)(param_1 + 0x6c) = *(byte *)(param_1 + 0x6c) | 0x40;
  }
  bVar2 = *(byte *)(param_1 + 0x6c);
  if ((param_6 >> 8 & 1) != 0) {
    bVar2 = bVar2 | 0x20;
    *(byte *)(param_1 + 0x6c) = bVar2;
  }
  *(undefined8 *)(param_1 + 0xa8) = param_7;
  *(undefined4 *)(param_1 + 0x40) = param_5;
  *(byte *)(param_1 + 0x6c) = bVar2 | 1;
  *(ulong *)(param_1 + 0x48) = param_2 >> 3;
  *(ulong *)(param_1 + 0x50) = param_4 >> 3;
  *(ulong *)(param_1 + 0x58) = param_3 >> 3;
  if (param_8 != 0) {
    uVar1 = ossl_prov_ctx_get0_libctx(param_8);
    *(undefined8 *)(param_1 + 0xb8) = uVar1;
  }
  return;
}


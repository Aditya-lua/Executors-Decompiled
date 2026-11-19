/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b25550
 */

undefined8 FUN_00b25550(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((*(byte *)(param_1 + 0x6c) >> 1 & 1) == 0) {
    uVar2 = CRYPTO_ocb128_decrypt();
    iVar1 = (int)uVar2;
  }
  else {
    uVar2 = CRYPTO_ocb128_encrypt(param_1 + 0x2b0);
    iVar1 = (int)uVar2;
  }
  if (iVar1 != 0) {
    uVar2 = 1;
  }
  return uVar2;
}


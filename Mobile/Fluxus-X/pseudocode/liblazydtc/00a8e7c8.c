/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8e7c8
 */

undefined8 FUN_00a8e7c8(undefined8 param_1,long param_2,long param_3,ulong param_4)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  
  iVar1 = EVP_CIPHER_CTX_get_block_size();
  uVar3 = (ulong)iVar1;
  lVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
  if (uVar3 <= param_4) {
    uVar4 = 0;
    do {
      (**(code **)(lVar2 + 0x118))(param_3 + uVar4,param_2 + uVar4,lVar2);
      uVar4 = uVar4 + uVar3;
    } while (uVar4 <= param_4 - uVar3);
  }
  return 1;
}


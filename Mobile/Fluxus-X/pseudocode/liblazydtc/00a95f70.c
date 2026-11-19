/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a95f70
 */

undefined8 FUN_00a95f70(undefined8 param_1,long param_2,long param_3,ulong param_4)

{
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  
  lVar1 = EVP_CIPHER_CTX_get0_cipher();
  uVar3 = (ulong)*(int *)(lVar1 + 4);
  if (uVar3 <= param_4) {
    uVar4 = 0;
    do {
      uVar2 = EVP_CIPHER_CTX_get_cipher_data(param_1);
      IDEA_ecb_encrypt(param_3 + uVar4,param_2 + uVar4,uVar2);
      uVar4 = uVar4 + uVar3;
    } while (uVar4 <= param_4 - uVar3);
  }
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5f0e8
 */

undefined8 EVP_CIPHER_CTX_get1_cipher(undefined8 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar2 = 0;
  if (param_1 != (undefined8 *)0x0) {
    uVar3 = *param_1;
    iVar1 = EVP_CIPHER_up_ref(uVar3);
    uVar2 = 0;
    if (iVar1 != 0) {
      uVar2 = uVar3;
    }
  }
  return uVar2;
}


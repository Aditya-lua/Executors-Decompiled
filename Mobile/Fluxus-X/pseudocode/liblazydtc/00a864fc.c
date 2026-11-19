/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a864fc
 */

undefined8 * EVP_CIPHER_meth_dup(undefined8 *param_1)

{
  undefined4 uVar1;
  undefined8 *__dest;
  undefined8 uVar2;
  
  __dest = (undefined8 *)0x0;
  if (param_1[0xf] == 0) {
    uVar2 = *param_1;
    uVar1 = *(undefined4 *)(param_1 + 1);
    __dest = (undefined8 *)evp_cipher_new();
    if (__dest != (undefined8 *)0x0) {
      *__dest = uVar2;
      uVar2 = __dest[0x11];
      *(undefined4 *)(__dest + 1) = uVar1;
      *(undefined4 *)(__dest + 3) = 2;
      memcpy(__dest,param_1,0x100);
      __dest[0x11] = uVar2;
      *(undefined4 *)(__dest + 3) = 2;
    }
  }
  return __dest;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f9e4
 */

undefined8
psa_crypto_driver_pake_get_user(long param_1,void *param_2,ulong param_3,undefined8 *param_4)

{
  undefined8 uVar1;
  size_t __n;
  
  __n = *(size_t *)(param_1 + 0x18);
  if (__n == 0) {
    uVar1 = 0xffffff77;
  }
  else if (param_3 < __n) {
    uVar1 = 0xffffff76;
  }
  else {
    memcpy(param_2,*(void **)(param_1 + 0x10),__n);
    uVar1 = 0;
    *param_4 = *(undefined8 *)(param_1 + 0x18);
  }
  return uVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f968
 */

undefined8
psa_crypto_driver_pake_get_password
          (undefined8 *param_1,void *param_2,ulong param_3,undefined8 *param_4)

{
  undefined8 uVar1;
  size_t __n;
  
  __n = param_1[1];
  if (__n == 0) {
    uVar1 = 0xffffff77;
  }
  else if (param_3 < __n) {
    uVar1 = 0xffffff76;
  }
  else {
    memcpy(param_2,(void *)*param_1,__n);
    uVar1 = 0;
    *param_4 = param_1[1];
  }
  return uVar1;
}


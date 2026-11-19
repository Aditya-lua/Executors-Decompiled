/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8a4d4
 */

undefined4 psa_sign_hash_abort(int *param_1)

{
  undefined4 uVar1;
  
  uVar1 = 0;
  if (*param_1 != 0) {
    uVar1 = 0xffffff79;
    if (*param_1 == 1) {
      uVar1 = 0xffffff7a;
    }
    *param_1 = 0;
  }
  param_1[3] = 0;
  *(byte *)(param_1 + 2) = *(byte *)(param_1 + 2) & 0xfe;
  return uVar1;
}


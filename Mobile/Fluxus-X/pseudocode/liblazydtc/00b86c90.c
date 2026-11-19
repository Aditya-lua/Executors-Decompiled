/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86c90
 */

undefined8 psa_wipe_key_slot(undefined8 *param_1)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = param_1[5];
  if (lVar1 != 0) {
    mbedtls_zeroize_and_free(lVar1,param_1[6]);
  }
  param_1[5] = 0;
  param_1[6] = 0;
  if (*(int *)(param_1 + 3) - 2U < 2) {
    if (param_1[4] != 1) {
LAB_00b86ce8:
      param_1[6] = 0;
      param_1[3] = 0;
      param_1[2] = 0;
      param_1[5] = 0;
      param_1[4] = 0;
      param_1[1] = 0;
      *param_1 = 0;
      return 0xffffff69;
    }
  }
  else if ((*(int *)(param_1 + 3) != 1) || (param_1[4] != 0)) goto LAB_00b86ce8;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  param_1[5] = 0;
  param_1[6] = 0;
  param_1[4] = 0;
  uVar2 = psa_free_key_slot(*(undefined1 *)((long)param_1 + 0x1c),param_1);
  return uVar2;
}


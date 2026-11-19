/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13d48
 */

undefined8 SCT_set0_log_id(int *param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  
  if ((param_3 == 0x20) || (*param_1 != 0)) {
    CRYPTO_free(*(void **)(param_1 + 6));
    uVar1 = 1;
    *(undefined8 *)(param_1 + 6) = param_2;
    *(long *)(param_1 + 8) = param_3;
    param_1[0x18] = 0;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_sct.c",0x53,"SCT_set0_log_id");
    ERR_set_error(0x32,100,0);
    uVar1 = 0;
  }
  return uVar1;
}


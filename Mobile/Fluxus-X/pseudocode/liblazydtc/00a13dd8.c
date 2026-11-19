/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13dd8
 */

undefined8 SCT_set1_log_id(int *param_1,long param_2,long param_3)

{
  long lVar1;
  undefined8 uVar2;
  long *plVar3;
  
  if ((param_3 == 0x20) || (*param_1 != 0)) {
    plVar3 = (long *)(param_1 + 6);
    CRYPTO_free((void *)*plVar3);
    param_1[0x18] = 0;
    *plVar3 = 0;
    param_1[8] = 0;
    param_1[9] = 0;
    if (param_2 == 0) {
      return 1;
    }
    if (param_3 == 0) {
      return 1;
    }
    lVar1 = CRYPTO_memdup(param_2,param_3,"crypto/ct/ct_sct.c",0x6b);
    *plVar3 = lVar1;
    if (lVar1 != 0) {
      *(long *)(param_1 + 8) = param_3;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/ct/ct_sct.c",0x6d,"SCT_set1_log_id");
    uVar2 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_sct.c",0x61,"SCT_set1_log_id");
    uVar2 = 100;
  }
  ERR_set_error(0x32,uVar2,0);
  return 0;
}


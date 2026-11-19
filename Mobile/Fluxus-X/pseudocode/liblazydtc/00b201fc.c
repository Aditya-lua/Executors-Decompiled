/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b201fc
 */

void ossl_prov_cleanup_entropy(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  code *UNRECOVERED_JUMPTABLE;
  undefined8 uVar1;
  
  UNRECOVERED_JUMPTABLE = DAT_00d23810;
  if (DAT_00d23810 == (code *)0x0) {
    return;
  }
  uVar1 = ossl_prov_ctx_get0_handle();
                    /* WARNING: Could not recover jumptable at 0x00b20240. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)(uVar1,param_2,param_3);
  return;
}


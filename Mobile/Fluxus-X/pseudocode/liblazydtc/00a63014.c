/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a63014
 */

undefined8 evp_do_md_ctx_setparams(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x70) == 0) {
      return 0xffffffff;
    }
    if (*(code **)(param_1 + 200) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00a63030. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar1 = (**(code **)(param_1 + 200))(param_2,param_3);
      return uVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/evp_utils.c",0x46,"seterr");
    ERR_set_error(6,0xc6,0);
  }
  return 0;
}


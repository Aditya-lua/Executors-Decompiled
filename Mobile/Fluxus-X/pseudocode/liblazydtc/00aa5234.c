/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5234
 */

void OSSL_SELF_TEST_onbegin(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  if ((param_1 == (undefined8 *)0x0) || (param_1[3] == 0)) {
    return;
  }
  *param_1 = "Start";
  param_1[1] = param_2;
  param_1[2] = param_3;
  FUN_00aa513c(param_1);
                    /* WARNING: Could not recover jumptable at 0x00aa527c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)param_1[3])(param_1 + 4,param_1[0x18]);
  return;
}


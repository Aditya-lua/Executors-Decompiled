/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74884
 */

void FUN_00a74884(undefined4 param_1,undefined4 param_2,undefined8 param_3)

{
  long lVar1;
  undefined4 *puVar2;
  
  lVar1 = BN_GENCB_get_arg(param_3);
  puVar2 = *(undefined4 **)(lVar1 + 0x68);
  *puVar2 = param_1;
  puVar2[1] = param_2;
                    /* WARNING: Could not recover jumptable at 0x00a748b4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(lVar1 + 0x60))();
  return;
}


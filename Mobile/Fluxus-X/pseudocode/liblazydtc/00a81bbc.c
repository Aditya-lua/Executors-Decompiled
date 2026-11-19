/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81bbc
 */

undefined8
FUN_00a81bbc(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 *puVar1;
  code *UNRECOVERED_JUMPTABLE;
  undefined8 uVar2;
  
  puVar1 = (undefined8 *)ossl_lib_ctx_get_data(*param_1,0x11,&DAT_00c61408);
  if ((puVar1 == (undefined8 *)0x0) ||
     (UNRECOVERED_JUMPTABLE = (code *)*puVar1, UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    return 0;
  }
  uVar2 = BIO_get_data(param_1);
                    /* WARNING: Could not recover jumptable at 0x00a81c2c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (*UNRECOVERED_JUMPTABLE)(uVar2,param_2,param_3,param_4);
  return uVar2;
}


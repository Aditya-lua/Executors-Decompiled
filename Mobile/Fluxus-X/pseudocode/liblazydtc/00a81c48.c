/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81c48
 */

undefined8 FUN_00a81c48(undefined8 *param_1,undefined8 param_2)

{
  long lVar1;
  code *UNRECOVERED_JUMPTABLE;
  undefined8 uVar2;
  
  lVar1 = ossl_lib_ctx_get_data(*param_1,0x11,&DAT_00c61408);
  if ((lVar1 == 0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(lVar1 + 0x18), UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    return 0xffffffff;
  }
  uVar2 = BIO_get_data(param_1);
                    /* WARNING: Could not recover jumptable at 0x00a81ca0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (*UNRECOVERED_JUMPTABLE)(uVar2,param_2);
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9840
 */

undefined8 i2d_KeyParams(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  code *UNRECOVERED_JUMPTABLE;
  
  if (*(long *)(param_1 + 0x60) != 0) {
    uVar1 = FUN_00ab98b4(param_1,0x84,&PTR_DAT_00c7b008);
    return uVar1;
  }
  if ((*(long *)(param_1 + 8) == 0) ||
     (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)(param_1 + 8) + 0x78),
     UNRECOVERED_JUMPTABLE == (code *)0x0)) {
    ERR_new();
    ERR_set_debug("crypto/asn1/i2d_evp.c",0x56,"i2d_KeyParams");
    ERR_set_error(0xd,0xc4,0);
    return 0xffffffff;
  }
                    /* WARNING: Could not recover jumptable at 0x00ab9870. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)(param_1,param_2);
  return uVar1;
}


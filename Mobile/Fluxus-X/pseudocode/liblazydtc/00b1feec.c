/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1feec
 */

undefined8 FUN_00b1feec(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  undefined8 uVar1;
  
  uVar1 = BIO_get_data();
  if (DAT_00d237d8 == (code *)0x0) {
    return 0xffffffff;
  }
                    /* WARNING: Could not recover jumptable at 0x00b1ff20. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*DAT_00d237d8)(uVar1,param_2,param_3);
  return uVar1;
}


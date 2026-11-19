/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30f9c
 */

undefined8 EC_GROUP_set_curve(long *param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(*param_1 + 0x28) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x22f,"EC_GROUP_set_curve");
    ERR_set_error(0x10,0xc0101,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a30fa8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x28))();
  return uVar1;
}


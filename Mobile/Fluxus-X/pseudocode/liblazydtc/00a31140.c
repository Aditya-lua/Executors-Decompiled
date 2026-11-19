/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a31140
 */

undefined8 EC_GROUP_get_curve_GF2m(long *param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(*param_1 + 0x30) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_lib.c",0x239,"EC_GROUP_get_curve");
    ERR_set_error(0x10,0xc0101,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a3114c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x30))();
  return uVar1;
}


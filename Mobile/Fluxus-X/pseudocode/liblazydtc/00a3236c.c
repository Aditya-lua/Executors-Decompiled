/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3236c
 */

undefined8 ossl_ec_point_blind_coordinates(long *param_1)

{
  undefined8 uVar1;
  
  if (*(code **)(*param_1 + 0x198) == (code *)0x0) {
    return 1;
  }
                    /* WARNING: Could not recover jumptable at 0x00a32378. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (**(code **)(*param_1 + 0x198))();
  return uVar1;
}


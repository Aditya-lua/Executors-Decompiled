/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a239c0
 */

bool FUN_00a239c0(EC_KEY *param_1)

{
  EC_GROUP *pEVar1;
  
  pEVar1 = EC_KEY_get0_group(param_1);
  return pEVar1 == (EC_GROUP *)0x0;
}


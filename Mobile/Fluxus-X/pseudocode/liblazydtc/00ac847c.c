/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac847c
 */

undefined8 RAND_priv_bytes(undefined8 param_1,int param_2)

{
  undefined8 uVar1;
  
  if (param_2 < 0) {
    return 0;
  }
  uVar1 = RAND_priv_bytes_ex(0,param_1,(long)param_2,0);
  return uVar1;
}


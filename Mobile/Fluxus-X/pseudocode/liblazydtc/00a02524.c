/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02524
 */

undefined8 BN_bn2lebinpad(undefined8 param_1,undefined8 param_2,int param_3)

{
  undefined8 uVar1;
  
  if (param_3 < 0) {
    return 0xffffffff;
  }
  uVar1 = FUN_00a020d4();
  return uVar1;
}


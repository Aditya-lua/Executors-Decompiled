/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aefdc
 */

bool FUN_008aefdc(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  FUN_008acba4(param_1,0xffffd8f0,param_2);
  iVar1 = FUN_008ab0e0(param_1,0xffffffff);
  if (iVar1 == 0) {
    FUN_008aa994(param_1,0xfffffffe);
    FUN_008ad0b0(param_1,0,0);
    FUN_008aaf04(param_1,0xffffffff);
    FUN_008ad800(param_1,0xffffd8f0,param_2);
  }
  return iVar1 == 0;
}


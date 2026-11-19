/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00807e7c
 */

void FUN_00807e7c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  FUN_008acba4(param_1,0xffffd8ee,param_2);
  iVar1 = FUN_008ab0e0(param_1,0xffffffff);
  if (iVar1 == 6) {
    FUN_008ac024(param_1);
    while (iVar1 = FUN_008ae174(param_1,0xfffffffe), iVar1 != 0) {
      FUN_008aaf04(param_1,0xfffffffe);
      FUN_008aac40(param_1,0xfffffffe);
      FUN_008ad70c(param_1,0xfffffffb);
    }
  }
  FUN_008aa994(param_1,0xfffffffe);
  FUN_008ad800(param_1,0xffffd8ee,param_2);
  return;
}


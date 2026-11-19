/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b36fc0
 */

undefined4 FUN_00b36fc0(undefined8 param_1,int param_2,undefined8 param_3,undefined8 *param_4)

{
  int iVar1;
  undefined4 local_18 [2];
  
  if (((param_4 == (undefined8 *)0x0) || ((code *)*param_4 == (code *)0x0)) ||
     (iVar1 = (*(code *)*param_4)(param_1,(long)param_2,local_18,0,param_4[1]), iVar1 == 0)) {
    local_18[0] = 0xffffffff;
  }
  return local_18[0];
}


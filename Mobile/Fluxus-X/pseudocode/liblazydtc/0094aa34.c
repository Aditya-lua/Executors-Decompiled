/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094aa34
 */

bool FUN_0094aa34(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  bool bVar1;
  ulong uVar2;
  
  uVar2 = FUN_0094aa74(param_2,param_1);
  bVar1 = (uVar2 & 1) != 0;
  if (bVar1) {
    *param_3 = param_2;
  }
  return bVar1;
}


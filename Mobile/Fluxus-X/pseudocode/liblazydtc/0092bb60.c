/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092bb60
 */

void FUN_0092bb60(long param_1,long param_2)

{
  code *pcVar1;
  
  *(long *)(param_1 + 0x20) = param_2;
  FUN_00925d10(param_2 + 0x3d0,param_1,param_1 + 0x40);
  if ((*(long *)(param_2 + 0x3a8) != 0) &&
     (pcVar1 = *(code **)(*(long *)(param_2 + 0x3a8) + 0x80), pcVar1 != (code *)0x0)) {
    (*pcVar1)(param_1,param_2);
  }
  FUN_00907d84(param_2,param_1);
  return;
}


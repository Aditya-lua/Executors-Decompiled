/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009419a4
 */

long FUN_009419a4(undefined8 param_1,long param_2)

{
  long lVar1;
  
  lVar1 = (*(code *)PTR_realloc_00cc4680)();
  if ((param_2 != 0) && (lVar1 == 0)) {
    (*(code *)PTR_free_00cc4678)(param_1);
  }
  return lVar1;
}


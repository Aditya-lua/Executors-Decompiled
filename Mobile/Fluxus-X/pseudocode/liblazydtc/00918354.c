/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918354
 */

long FUN_00918354(void)

{
  long lVar1;
  
  lVar1 = (*(code *)PTR_calloc_00cc4690)(1,0x30);
  if (lVar1 != 0) {
    FUN_00925c98(lVar1,0);
  }
  return lVar1;
}


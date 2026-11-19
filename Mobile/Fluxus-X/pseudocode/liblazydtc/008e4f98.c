/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4f98
 */

void FUN_008e4f98(long param_1)

{
  long unaff_x20;
  undefined1 uStack00000000000000b0;
  
  fwrite(&uStack00000000000000b0,1,param_1 + 1,*(FILE **)(unaff_x20 + 0xef0));
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aed758
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

UI * UI_new(void)

{
  UI *pUVar1;
  
  pUVar1 = UI_new_method((UI_METHOD *)0x0);
  return pUVar1;
}


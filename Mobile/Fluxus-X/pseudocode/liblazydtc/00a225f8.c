/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a225f8
 */

int DSO_flags(DSO *dso)

{
  int iVar1;
  
  iVar1 = 0;
  if (dso != (DSO *)0x0) {
    iVar1 = dso->flags;
  }
  return iVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5154
 */

void * GENERAL_NAME_get0_value(GENERAL_NAME *a,int *ptype)

{
  char *pcVar1;
  
  if (ptype != (int *)0x0) {
    *ptype = a->type;
  }
  pcVar1 = (char *)0x0;
  if ((uint)a->type < 9) {
    pcVar1 = (a->d).ptr;
  }
  return pcVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984350
 */

/* ix::poll(pollfd*, unsigned int, int, void**) */

int ix::poll(pollfd *param_1,uint param_2,int param_3,void **param_4)

{
  int iVar1;
  int *piVar2;
  
  if ((param_4 != (void **)0x0) && (*param_4 != (void *)0x0)) {
    *param_4 = (void *)0x0;
  }
  do {
    iVar1 = ::poll(param_1,(ulong)param_2,param_3);
    if (iVar1 != -1) {
      return iVar1;
    }
    piVar2 = (int *)__errno();
  } while (*piVar2 == 4);
  return -1;
}


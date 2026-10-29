/* 7ff70c9551d0 FUN_7ff70c9551d0 */

uint FUN_7ff70c9551d0(longlong param_1,int param_2)

{
  longlong lVar1;
  longlong *plVar2;
  
  if ((param_1 == 0) ||
     (plVar2 = *(longlong **)(param_1 + 0x1d8 + (longlong)param_2 * 8), plVar2 == (longlong *)0x0))
  {
    return 0;
  }
  do {
    lVar1 = *plVar2;
    if ((*(uint *)(lVar1 + 8) & 7) != 0) break;
    plVar2 = (longlong *)plVar2[1];
  } while (plVar2 != (longlong *)0x0);
  return (*(uint *)(lVar1 + 8) & 4) >> 2;
}



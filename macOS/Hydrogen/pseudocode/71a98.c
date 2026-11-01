
/* WARNING: Possible PIC construction at 0x00071ad4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00071ad8) */

long * thunk_FUN_00071acc(void)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long unaff_x29;
  
  plVar2 = (long *)(unaff_x29 + -0x80);
  plVar1 = (long *)*(long *)(unaff_x29 + -0x70);
  while (plVar1 != (long *)0x0) {
    lVar3 = *plVar1;
    if (*(char *)((long)plVar1 + 0x27) < '\0') {
      __ZdlPv(plVar1[2]);
    }
    __ZdlPv(plVar1);
    plVar1 = (long *)lVar3;
  }
  lVar3 = *plVar2;
  *plVar2 = 0;
  if (lVar3 != 0) {
    __ZdlPv();
  }
  return plVar2;
}


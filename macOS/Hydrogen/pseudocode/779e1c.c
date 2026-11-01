
long * FUN_00779e1c(code *param_1)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  long *unaff_x19;
  
  lVar1 = (*param_1)();
  if (lVar1 != 0) {
    plVar2 = (long *)(*pcRam0000000000a2b5e8)(0x10);
    if (plVar2 != (long *)0x0) {
      *plVar2 = lVar1;
      plVar2[1] = 0;
      if (unaff_x19 == (long *)0x0) {
        return plVar2;
      }
      plVar4 = unaff_x19;
      do {
        plVar3 = plVar4;
        plVar4 = (long *)plVar3[1];
      } while (plVar4 != (long *)0x0);
      plVar3[1] = (long)plVar2;
      return unaff_x19;
    }
    (*pcRam0000000000a2b5f0)(lVar1);
  }
  return (long *)0x0;
}


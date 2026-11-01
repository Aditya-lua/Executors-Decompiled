
undefined8 FUN_00029c58(long *param_1,long *param_2)

{
  undefined1 in_CY;
  bool bVar1;
  long *plVar2;
  long *in_x9;
  long *plVar3;
  long *in_x10;
  long *in_x12;
  long *plVar4;
  ulong unaff_x20;
  
  while( true ) {
    if ((bool)in_CY) {
      param_1 = in_x10;
      in_x12 = in_x10;
    }
    in_x10 = (long *)*in_x12;
    if (in_x10 == (long *)0x0) break;
    in_x12 = in_x10 + 1;
    in_CY = unaff_x20 <= (ulong)in_x10[4];
  }
  if ((param_1 != in_x9) && ((ulong)param_1[4] <= unaff_x20)) {
    plVar4 = (long *)0xa33360;
    plVar3 = param_2;
    do {
      plVar2 = plVar3 + 1;
      if (unaff_x20 <= (ulong)plVar3[4]) {
        plVar4 = plVar3;
        plVar2 = plVar3;
      }
      plVar3 = (long *)*plVar2;
    } while (plVar3 != (long *)0x0);
    if ((plVar4 != (long *)0xa33360) && ((ulong)plVar4[4] <= unaff_x20)) {
      plVar3 = (long *)plVar4[1];
      if ((long *)plVar4[1] == (long *)0x0) {
        plVar3 = plVar4;
        do {
          plVar2 = (long *)plVar3[2];
          bVar1 = (long *)*plVar2 != plVar3;
          plVar3 = plVar2;
        } while (bVar1);
      }
      else {
        do {
          plVar2 = plVar3;
          plVar3 = (long *)*plVar2;
        } while ((long *)*plVar2 != (long *)0x0);
      }
      if (plRam0000000000a33358 == plVar4) {
        plRam0000000000a33358 = plVar2;
      }
      lRam0000000000a33368 = lRam0000000000a33368 + -1;
      func_0x00037ca0(param_2,plVar4);
      __ZdlPv(plVar4);
    }
  }
  return 0;
}


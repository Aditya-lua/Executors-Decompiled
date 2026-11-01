
undefined8 FUN_0005a3a4(long param_1)

{
  int iVar1;
  int *piVar2;
  int *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 uStack0000000000000008;
  
  while( true ) {
    if ((unaff_x22 < (param_1 - unaff_x21) + unaff_x25) || (*unaff_x20 == -1)) {
      return 0;
    }
    iVar1 = _poll();
    while (iVar1 < 0) {
      piVar2 = (int *)___error();
      if (*piVar2 != 4) {
        return 0;
      }
      uStack0000000000000008 = unaff_x24;
      __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                (&uStack0000000000000008);
      iVar1 = _poll();
    }
    if (iVar1 != 0) break;
    param_1 = __ZNSt3__16chrono12steady_clock3nowEv();
  }
  return 1;
}


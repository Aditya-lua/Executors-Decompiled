
bool FUN_0005ae84(long param_1)

{
  int iVar1;
  int *piVar2;
  undefined8 uStack0000000000000008;
  
  if (param_1 < 0) {
    piVar2 = (int *)___error();
    iVar1 = *piVar2;
    while (iVar1 == 4) {
      uStack0000000000000008 = 1000;
      __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
                (&uStack0000000000000008);
      param_1 = _recv();
      if (-1 < param_1) break;
      piVar2 = (int *)___error();
      iVar1 = *piVar2;
    }
  }
  return 0 < param_1;
}



long FUN_0005ab18(long param_1)

{
  int *piVar1;
  undefined8 unaff_x23;
  undefined8 uStack0000000000000008;
  
  while ((param_1 < 0 && (piVar1 = (int *)___error(), *piVar1 == 4))) {
    uStack0000000000000008 = unaff_x23;
    __ZNSt3__111this_thread9sleep_forERKNS_6chrono8durationIxNS_5ratioILl1ELl1000000000EEEEE
              (&uStack0000000000000008);
    param_1 = _send();
  }
  return param_1;
}


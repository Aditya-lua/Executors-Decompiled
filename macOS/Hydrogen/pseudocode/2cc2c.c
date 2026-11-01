
void FUN_0002cc2c(void)

{
  undefined8 *unaff_x19;
  long *unaff_x21;
  
  (**(code **)(*unaff_x21 + 0x10))();
  __ZNSt3__119__shared_weak_count14__release_weakEv();
  __ZNSt3__16localeD1Ev();
  *unaff_x19 = &UNK_009b3050;
  if ((long *)unaff_x19[1] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[1] + 8))();
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}


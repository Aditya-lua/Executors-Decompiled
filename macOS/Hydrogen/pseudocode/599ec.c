
undefined8 FUN_000599ec(undefined8 *param_1)

{
  long lVar1;
  long *unaff_x19;
  
  _pthread_setspecific(*param_1);
  func_0x00059a40(unaff_x19 + 1);
  lVar1 = *unaff_x19;
  *unaff_x19 = 0;
  if (lVar1 != 0) {
    __ZNSt3__115__thread_structD1Ev();
    __ZdlPv();
  }
  __ZdlPv();
  return 0;
}



/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0041b0d4(void)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x22;
  
  if (*unaff_x19 == 0) {
    func_0x007a0ec8();
    iVar1 = _pthread_mutex_lock();
    if (iVar1 == 0) goto LAB_0041b0e4;
LAB_0041b144:
    func_0x007a1368();
LAB_0041b148:
    iVar1 = func_0x007a1140();
    uVar2 = func_0x00417fac(unaff_x19 + 2);
    if (iVar1 == 0) goto LAB_0041b118;
    uVar3 = *(ulong *)(unaff_x22 + 0x548);
  }
  else {
    iVar1 = _pthread_mutex_lock();
    if (iVar1 != 0) goto LAB_0041b144;
LAB_0041b0e4:
    unaff_x22 = 0xa33000;
    if ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E &
        0x7fffffffffffffff) != 0) goto LAB_0041b148;
    uVar2 = func_0x00417fac(unaff_x19 + 2);
    uVar3 = ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E;
  }
  if ((uVar3 & 0x7fffffffffffffff) != 0) {
    uVar3 = func_0x007a1140();
    if ((uVar3 & 1) == 0) {
      *(undefined1 *)(unaff_x19 + 1) = 1;
    }
  }
LAB_0041b118:
  _pthread_mutex_unlock(*unaff_x19);
  return uVar2;
}


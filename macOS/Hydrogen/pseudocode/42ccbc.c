
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0042ccbc(undefined8 param_1)

{
  undefined8 uVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  uint unaff_w20;
  undefined1 uStack0000000000000010;
  
  _uStack0000000000000010 = param_1;
  func_0x003f77f4(&uStack0000000000000010);
  if (((unaff_w20 & 1) == 0) &&
     ((___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E & 0x7fffffffffffffff
      ) != 0)) {
    uVar2 = func_0x007a1140();
    if ((uVar2 & 1) == 0) {
      *(undefined1 *)(unaff_x19 + 1) = 1;
      uVar1 = *unaff_x19;
      goto _pthread_mutex_unlock;
    }
  }
  uVar1 = *unaff_x19;
_pthread_mutex_unlock:
                    /* WARNING: Could not recover jumptable at 0x007b3b50. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__pthread_mutex_unlock_00a252d0)(uVar1);
  return;
}


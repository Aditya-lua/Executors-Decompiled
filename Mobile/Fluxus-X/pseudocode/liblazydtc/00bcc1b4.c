/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcc1b4
 */

void FUN_00bcc1b4(undefined4 param_1)

{
  int iVar1;
  future_error *pfVar2;
  
  pfVar2 = (future_error *)__cxa_allocate_exception(0x20);
  if (((DAT_00d26700 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d26700), iVar1 != 0)) {
    __cxa_guard_release(&DAT_00d26700);
  }
                    /* try { // try from 00bcc1f0 to 00bcc1f7 has its CatchHandler @ 00bcc230 */
  std::__ndk1::future_error::future_error(pfVar2,param_1,&PTR_PTR_00cca5f0);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(pfVar2,&std::__ndk1::future_error::typeinfo,std::__ndk1::future_error::~future_error);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce038
 */

void FUN_00bce038(char *param_1)

{
  int iVar1;
  failure *this;
  undefined8 local_30;
  undefined **ppuStack_28;
  
  this = (failure *)__cxa_allocate_exception(0x20);
  if (((DAT_00d26720 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d26720), iVar1 != 0)) {
    __cxa_guard_release(&DAT_00d26720);
  }
  local_30 = 1;
  ppuStack_28 = &PTR_PTR_00cca5f8;
                    /* try { // try from 00bce07c to 00bce08b has its CatchHandler @ 00bce0c4 */
  std::__ndk1::ios_base::failure::failure(this,param_1,(error_code *)&local_30);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&std::__ndk1::ios_base::failure::typeinfo,
              std::__ndk1::ios_base::failure::~failure);
}


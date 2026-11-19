/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f0294
 */

/* cpr::Session::GetSharedPtrFromThis() */

void cpr::Session::GetSharedPtrFromThis(void)

{
  __shared_weak_count *this;
  undefined8 *in_x0;
  long lVar1;
  undefined8 *puVar2;
  undefined8 *in_x8;
  
  this = (__shared_weak_count *)in_x0[1];
  *in_x8 = *in_x0;
  if (this == (__shared_weak_count *)0x0) {
    in_x8[1] = 0;
  }
  else {
    lVar1 = std::__ndk1::__shared_weak_count::lock(this);
    in_x8[1] = lVar1;
    if (lVar1 != 0) {
      return;
    }
  }
  puVar2 = (undefined8 *)__cxa_allocate_exception(8);
  *puVar2 = &PTR__bad_weak_ptr_00cac890;
                    /* try { // try from 008f02e4 to 008f02f7 has its CatchHandler @ 008f02f8 */
                    /* WARNING: Subroutine does not return */
  __cxa_throw(puVar2,&std::__ndk1::bad_weak_ptr::typeinfo,std::__ndk1::bad_weak_ptr::~bad_weak_ptr);
}


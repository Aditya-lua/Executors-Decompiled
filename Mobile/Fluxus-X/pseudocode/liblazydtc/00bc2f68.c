/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2f68
 */

/* std::__ndk1::bad_weak_ptr::~bad_weak_ptr() */

void __thiscall std::__ndk1::bad_weak_ptr::~bad_weak_ptr(bad_weak_ptr *this)

{
  bad_exception::~bad_exception((bad_exception *)this);
  return;
}


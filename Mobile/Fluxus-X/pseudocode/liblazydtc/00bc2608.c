/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2608
 */

/* std::exception_ptr::TEMPNAMEPLACEHOLDERVALUE(std::exception_ptr const&) */

exception_ptr * __thiscall std::exception_ptr::operator=(exception_ptr *this,exception_ptr *param_1)

{
  if (*(long *)this != *(long *)param_1) {
    __cxa_increment_exception_refcount();
    __cxa_decrement_exception_refcount(*(undefined8 *)this);
    *(undefined8 *)this = *(undefined8 *)param_1;
  }
  return this;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e7910
 */

/* std::__ndk1::__vector_base_common<true>::__throw_length_error() const */

void std::__ndk1::__vector_base_common<true>::__throw_length_error(void)

{
  logic_error *this;
  
  this = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008e7928 to 008e7933 has its CatchHandler @ 008e795c */
  logic_error::logic_error(this,"vector");
  *(undefined ***)this = &PTR__domain_error_00cb0630;
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&length_error::typeinfo,domain_error::~domain_error);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00901280
 */

/* std::__ndk1::__vector_base_common<true>::__throw_out_of_range() const */

void std::__ndk1::__vector_base_common<true>::__throw_out_of_range(void)

{
  logic_error *this;
  
  this = (logic_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 00901298 to 009012a3 has its CatchHandler @ 009012cc */
  logic_error::logic_error(this,"vector");
  *(undefined ***)this = &PTR__domain_error_00cb0670;
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&out_of_range::typeinfo,domain_error::~domain_error);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3690
 */

/* std::__ndk1::__throw_runtime_error(char const*) */

void std::__ndk1::__throw_runtime_error(char *param_1)

{
  runtime_error *this;
  
  this = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 00bc36b0 to 00bc36b7 has its CatchHandler @ 00bc36d0 */
  runtime_error::runtime_error(this,param_1);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&runtime_error::typeinfo,underflow_error::~underflow_error);
}


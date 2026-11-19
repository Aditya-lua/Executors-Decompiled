/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8968
 */

void FUN_00bd8968(void)

{
  bad_cast *this;
  
  this = (bad_cast *)__cxa_allocate_exception(8);
  std::bad_cast::bad_cast(this);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&std::bad_cast::typeinfo,std::bad_cast::~bad_cast);
}


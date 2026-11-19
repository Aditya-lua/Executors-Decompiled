/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2fda0
 */

/* operator new(unsigned long, std::align_val_t) */

void * operator_new(size_t param_1,size_t param_2)

{
  code *pcVar1;
  bad_alloc *this;
  void *local_28;
  
  if (param_1 < 2) {
    param_1 = 1;
  }
  if (param_2 < 9) {
    param_2 = 8;
  }
  while( true ) {
    local_28 = (void *)0x0;
    posix_memalign(&local_28,param_2,param_1);
    if (local_28 != (void *)0x0) {
      return local_28;
    }
    pcVar1 = (code *)std::get_new_handler();
    if (pcVar1 == (code *)0x0) break;
    (*pcVar1)();
  }
  this = (bad_alloc *)__cxa_allocate_exception(8);
  std::bad_alloc::bad_alloc(this);
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&std::bad_alloc::typeinfo,std::bad_exception::~bad_exception);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f5ac0
 */

/* std::exception_ptr std::make_exception_ptr<std::__ndk1::future_error>(std::__ndk1::future_error)
    */

void std::make_exception_ptr<std::__ndk1::future_error>(logic_error *param_1)

{
  logic_error *this;
  undefined8 uVar1;
  
  this = (logic_error *)__cxa_allocate_exception(0x20);
  logic_error::logic_error(this,param_1);
  *(undefined ***)this = &PTR__future_error_00cacb08;
  uVar1 = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 0x18);
  *(undefined8 *)(this + 0x10) = uVar1;
                    /* try { // try from 008f5b04 to 008f5b1b has its CatchHandler @ 008f5b1c */
                    /* WARNING: Subroutine does not return */
  __cxa_throw(this,&__ndk1::future_error::typeinfo,__ndk1::future_error::~future_error);
}


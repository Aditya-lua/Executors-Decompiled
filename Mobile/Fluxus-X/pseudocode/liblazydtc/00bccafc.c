/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccafc
 */

/* std::__ndk1::shared_future<void>::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::shared_future<void>
   const&) */

shared_future<void> * __thiscall
std::__ndk1::shared_future<void>::operator=(shared_future<void> *this,shared_future *param_1)

{
  long lVar1;
  long *plVar2;
  
  if (*(long *)param_1 != 0) {
    FUN_00c2bce0(1,*(long *)param_1 + 8);
  }
  plVar2 = *(long **)this;
  if ((plVar2 != (long *)0x0) && (lVar1 = FUN_00c2bd10(0xffffffffffffffff,plVar2 + 1), lVar1 == 0))
  {
    (**(code **)(*plVar2 + 0x10))(plVar2);
  }
  *(undefined8 *)this = *(undefined8 *)param_1;
  return this;
}


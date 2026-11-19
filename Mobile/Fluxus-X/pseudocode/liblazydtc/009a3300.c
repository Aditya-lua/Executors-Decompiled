/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a3300
 */

/* std::__ndk1::__vector_base<std::__ndk1::unique_ptr<std::__ndk1::mutex,
   std::__ndk1::default_delete<std::__ndk1::mutex> >,
   std::__ndk1::allocator<std::__ndk1::unique_ptr<std::__ndk1::mutex,
   std::__ndk1::default_delete<std::__ndk1::mutex> > > >::~__vector_base() */

void __thiscall
std::__ndk1::
__vector_base<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>,std::__ndk1::allocator<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>>>
::~__vector_base(__vector_base<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>,std::__ndk1::allocator<std::__ndk1::unique_ptr<std::__ndk1::mutex,std::__ndk1::default_delete<std::__ndk1::mutex>>>>
                 *this)

{
  mutex *this_00;
  undefined8 *puVar1;
  undefined8 *puVar2;
  
  puVar1 = *(undefined8 **)this;
  if (puVar1 == (undefined8 *)0x0) {
    return;
  }
  puVar2 = *(undefined8 **)(this + 8);
  if (puVar2 == puVar1) {
    puVar2 = puVar1;
  }
  else {
    do {
      puVar2 = puVar2 + -1;
      this_00 = (mutex *)*puVar2;
      *puVar2 = 0;
      if (this_00 != (mutex *)0x0) {
        mutex::~mutex(this_00);
        operator_delete(this_00);
      }
    } while (puVar1 != puVar2);
    puVar2 = *(undefined8 **)this;
  }
  *(undefined8 **)(this + 8) = puVar1;
  operator_delete(puVar2);
  return;
}


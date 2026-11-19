/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2fec
 */

/* std::__ndk1::__shared_count::__release_shared() */

bool __thiscall std::__ndk1::__shared_count::__release_shared(__shared_count *this)

{
  long lVar1;
  
  lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 8);
  if (lVar1 == 0) {
    (**(code **)(*(long *)this + 0x10))(this);
  }
  return lVar1 == 0;
}


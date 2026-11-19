/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3158
 */

/* std::__ndk1::__shared_weak_count::lock() */

__shared_weak_count * __thiscall std::__ndk1::__shared_weak_count::lock(__shared_weak_count *this)

{
  long lVar1;
  bool bVar2;
  long lVar3;
  
  lVar1 = *(long *)(this + 8);
  do {
    if (lVar1 == -1) {
      return (__shared_weak_count *)0x0;
    }
    lVar3 = FUN_00c2bc40(lVar1,lVar1 + 1,this + 8);
    bVar2 = lVar3 != lVar1;
    lVar1 = lVar3;
  } while (bVar2);
  return this;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3084
 */

/* std::__ndk1::__shared_weak_count::__release_shared() */

void __thiscall std::__ndk1::__shared_weak_count::__release_shared(__shared_weak_count *this)

{
  long lVar1;
  
  lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 8);
  if (lVar1 == 0) {
    (**(code **)(*(long *)this + 0x10))(this);
    if ((*(long *)(this + 0x10) == 0) ||
       (lVar1 = FUN_00c2bd10(0xffffffffffffffff,this + 0x10), lVar1 == 0)) {
                    /* WARNING: Could not recover jumptable at 0x00bc30fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(*(long *)this + 0x20))(this);
      return;
    }
  }
  return;
}


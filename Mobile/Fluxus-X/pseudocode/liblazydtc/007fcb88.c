/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fcb88
 */

bool FUN_007fcb88(long param_1)

{
  bool bVar1;
  __shared_weak_count *this;
  long lVar2;
  
  if (param_1 == 0) {
    return false;
  }
  lVar2 = *(long *)(param_1 + 0x10);
  if (lVar2 == 0) {
    return false;
  }
  if (*(long *)(DAT_00cca938 + 0x10) == 0) {
    return false;
  }
  if (*(long *)(param_1 + 0x60) != *(long *)(*(long *)(DAT_00cca938 + 0x10) + 0x60)) {
    return false;
  }
  if (*(__shared_weak_count **)(lVar2 + 0x38) == (__shared_weak_count *)0x0) {
    this = (__shared_weak_count *)0x0;
  }
  else {
    this = (__shared_weak_count *)
           std::__ndk1::__shared_weak_count::lock(*(__shared_weak_count **)(lVar2 + 0x38));
    if ((this != (__shared_weak_count *)0x0) && (*(long *)(lVar2 + 0x30) != 0)) {
      bVar1 = false;
      goto LAB_007fcc48;
    }
  }
  lVar2 = *(long *)(*(long *)(param_1 + 0x10) + 0x38);
  if ((lVar2 == 0) || (*(long *)(lVar2 + 8) == -1)) {
    bVar1 = (DAT_00cc4430 & (*(ulong *)(*(long *)(param_1 + 0x10) + 0x98) ^ 0xffffffffffffffff)) ==
            0;
  }
  else {
    bVar1 = false;
  }
  if (this == (__shared_weak_count *)0x0) {
    return bVar1;
  }
LAB_007fcc48:
  lVar2 = FUN_00c2bd10(0xffffffffffffffff,this + 8);
  if (lVar2 == 0) {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
  }
  return bVar1;
}


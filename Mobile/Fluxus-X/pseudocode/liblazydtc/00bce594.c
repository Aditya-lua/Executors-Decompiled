/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce594
 */

/* std::__ndk1::ios_base::__set_badbit_and_consider_rethrow() */

ios_base * __thiscall std::__ndk1::ios_base::__set_badbit_and_consider_rethrow(ios_base *this)

{
  undefined1 uVar1;
  ios_base *piVar2;
  
  *(uint *)(this + 0x20) = *(uint *)(this + 0x20) | 1;
  if (((byte)this[0x24] & 1) == 0) {
    return this;
  }
  piVar2 = (ios_base *)__cxa_rethrow();
  *(uint *)(piVar2 + 0x20) = *(uint *)(piVar2 + 0x20) | 4;
  if (((byte)piVar2[0x24] >> 2 & 1) == 0) {
    return piVar2;
  }
  uVar1 = __cxa_rethrow();
  piVar2 = (ios_base *)(ulong)DAT_00cca600;
  DAT_00cca600 = uVar1;
  return piVar2;
}


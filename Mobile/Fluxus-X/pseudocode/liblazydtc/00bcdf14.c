/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcdf14
 */

/* std::__ndk1::ios_base::~ios_base() */

void __thiscall std::__ndk1::ios_base::~ios_base(ios_base *this)

{
  long lVar1;
  
  *(undefined ***)this = &PTR__ios_base_00cacc18;
  if (*(long *)(this + 0x30) == 0) {
    return;
  }
  lVar1 = *(long *)(this + 0x48);
  while (lVar1 != 0) {
    lVar1 = lVar1 + -1;
                    /* try { // try from 00bcdf60 to 00bcdf6b has its CatchHandler @ 00bcdfc4 */
    (**(code **)(*(long *)(this + 0x38) + lVar1 * 8))
              (0,this,*(undefined4 *)(*(long *)(this + 0x40) + lVar1 * 4));
  }
  locale::~locale((locale *)(this + 0x30));
  free(*(void **)(this + 0x38));
  free(*(void **)(this + 0x40));
  free(*(void **)(this + 0x58));
  free(*(void **)(this + 0x70));
  return;
}


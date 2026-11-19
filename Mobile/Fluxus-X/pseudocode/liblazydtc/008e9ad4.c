/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9ad4
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::sentry::~sentry() */

void __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(sentry *this)

{
  ios_base *this_00;
  int iVar1;
  ulong uVar2;
  long *plVar3;
  long lVar4;
  
  plVar3 = *(long **)(this + 8);
  lVar4 = *(long *)(*plVar3 + -0x18);
                    /* try { // try from 008e9b30 to 008e9b57 has its CatchHandler @ 008e9b64 */
  if ((((*(long *)((long)plVar3 + lVar4 + 0x28) != 0) &&
       (*(int *)((long)plVar3 + lVar4 + 0x20) == 0)) &&
      ((*(byte *)((long)plVar3 + lVar4 + 9) >> 5 & 1) != 0)) &&
     ((uVar2 = uncaught_exception(), (uVar2 & 1) == 0 &&
      (iVar1 = (**(code **)(**(long **)((long)*(long **)(this + 8) +
                                       *(long *)(**(long **)(this + 8) + -0x18) + 0x28) + 0x30))(),
      iVar1 == -1)))) {
    this_00 = (ios_base *)((long)*(long **)(this + 8) + *(long *)(**(long **)(this + 8) + -0x18));
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 1);
  }
  return;
}


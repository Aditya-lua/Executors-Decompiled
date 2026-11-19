/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5a9c
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t> >::sentry::~sentry() */

void __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry(sentry *this)

{
  ios_base *this_00;
  int iVar1;
  long *plVar2;
  long lVar3;
  
  plVar2 = *(long **)(this + 8);
  lVar3 = *(long *)(*plVar2 + -0x18);
                    /* try { // try from 00bd5afc to 00bd5b23 has its CatchHandler @ 00bd5b34 */
  if ((((*(long *)((long)plVar2 + lVar3 + 0x28) != 0) &&
       (*(int *)((long)plVar2 + lVar3 + 0x20) == 0)) &&
      ((*(byte *)((long)plVar2 + lVar3 + 9) >> 5 & 1) != 0)) &&
     ((iVar1 = uncaught_exceptions(), iVar1 == 0 &&
      (iVar1 = (**(code **)(**(long **)((long)*(long **)(this + 8) +
                                       *(long *)(**(long **)(this + 8) + -0x18) + 0x28) + 0x30))(),
      iVar1 == -1)))) {
    this_00 = (ios_base *)((long)*(long **)(this + 8) + *(long *)(**(long **)(this + 8) + -0x18));
    ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 1);
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd5458
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::sync() */

int __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sync
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  int iVar1;
  int iVar2;
  sentry local_24 [4];
  
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (*(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) == (long *)0x0) {
    iVar2 = -1;
  }
  else if (local_24[0] == (sentry)0x1) {
                    /* try { // try from 00bd54a8 to 00bd54ab has its CatchHandler @ 00bd54f8 */
    iVar1 = (**(code **)(**(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28) + 0x30))();
    iVar2 = -(uint)(iVar1 == -1);
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) |
                    (uint)(iVar1 == -1));
  }
  else {
    iVar2 = 0;
  }
  return iVar2;
}


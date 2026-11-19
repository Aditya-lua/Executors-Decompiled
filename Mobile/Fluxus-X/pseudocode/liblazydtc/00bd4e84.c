/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4e84
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::peek() */

int __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::peek
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this)

{
  int iVar1;
  long *plVar2;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] == (sentry)0x1) {
    plVar2 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
    if ((int *)plVar2[3] == (int *)plVar2[4]) {
                    /* try { // try from 00bd4ef0 to 00bd4ef3 has its CatchHandler @ 00bd4f34 */
      iVar1 = (**(code **)(*plVar2 + 0x48))();
    }
    else {
      iVar1 = *(int *)plVar2[3];
    }
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) |
                    (uint)(iVar1 == -1) << 1);
  }
  else {
    iVar1 = -1;
  }
  return iVar1;
}


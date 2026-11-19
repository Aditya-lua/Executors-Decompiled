/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd4ccc
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::ignore(long, unsigned
   int) */

basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::ignore
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,long param_1,uint param_2)

{
  long lVar1;
  uint *puVar2;
  uint uVar3;
  long *plVar4;
  sentry local_24 [4];
  
  *(undefined8 *)(this + 8) = 0;
  sentry::sentry(local_24,(basic_istream *)this,true);
  if (local_24[0] != (sentry)0x1) {
    return this;
  }
  if (param_1 == 0x7fffffffffffffff) {
    do {
      plVar4 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      puVar2 = (uint *)plVar4[3];
      if (puVar2 == (uint *)plVar4[4]) {
                    /* try { // try from 00bd4d58 to 00bd4d5f has its CatchHandler @ 00bd4e34 */
        uVar3 = (**(code **)(*plVar4 + 0x50))(plVar4);
      }
      else {
        uVar3 = *puVar2;
        plVar4[3] = (long)(puVar2 + 1);
      }
      if (uVar3 == 0xffffffff) goto LAB_00bd4df8;
      if (*(long *)(this + 8) != 0x7fffffffffffffff) {
        *(long *)(this + 8) = *(long *)(this + 8) + 1;
      }
    } while (uVar3 != param_2);
  }
  else if (*(long *)(this + 8) < param_1) {
    do {
      plVar4 = *(long **)(this + *(long *)(*(long *)this + -0x18) + 0x28);
      puVar2 = (uint *)plVar4[3];
      if (puVar2 == (uint *)plVar4[4]) {
                    /* try { // try from 00bd4dc0 to 00bd4dc7 has its CatchHandler @ 00bd4e30 */
        uVar3 = (**(code **)(*plVar4 + 0x50))(plVar4);
      }
      else {
        uVar3 = *puVar2;
        plVar4[3] = (long)(puVar2 + 1);
      }
      if (uVar3 == 0xffffffff) goto LAB_00bd4df8;
    } while ((*(long *)(this + 8) != 0x7fffffffffffffff) &&
            (lVar1 = *(long *)(this + 8) + 1, *(long *)(this + 8) = lVar1,
            uVar3 != param_2 && lVar1 < param_1));
  }
  uVar3 = 0;
LAB_00bd4dfc:
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | uVar3);
  return this;
LAB_00bd4df8:
  uVar3 = 2;
  goto LAB_00bd4dfc;
}


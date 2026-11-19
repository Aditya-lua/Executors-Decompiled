/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd1ecc
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >*)
    */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  ios_base *this_00;
  undefined1 *puVar1;
  undefined1 uVar2;
  int iVar3;
  long *plVar4;
  long lVar5;
  sentry local_40 [16];
  
                    /* try { // try from 00bd1eec to 00bd1ef7 has its CatchHandler @ 00bd2028 */
  sentry::sentry(local_40,(basic_ostream *)this);
  if (local_40[0] == (sentry)0x1) {
    this_00 = (ios_base *)(this + *(long *)(*(long *)this + -0x18));
    if (param_1 == (basic_streambuf *)0x0) {
                    /* try { // try from 00bd1fd8 to 00bd1fdf has its CatchHandler @ 00bd2088 */
      ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 1);
    }
    else {
      plVar4 = *(long **)(this_00 + 0x28);
      lVar5 = 0;
                    /* try { // try from 00bd1f40 to 00bd1fcf has its CatchHandler @ 00bd205c */
      while ((*(long *)(param_1 + 0x18) != *(long *)(param_1 + 0x20) ||
             (iVar3 = (**(code **)(*(long *)param_1 + 0x48))(param_1), iVar3 != -1))) {
        if (*(undefined1 **)(param_1 + 0x18) == *(undefined1 **)(param_1 + 0x20)) {
          uVar2 = (**(code **)(*(long *)param_1 + 0x48))(param_1);
        }
        else {
          uVar2 = **(undefined1 **)(param_1 + 0x18);
        }
        if (plVar4 == (long *)0x0) goto LAB_00bd1fe8;
        puVar1 = (undefined1 *)plVar4[6];
        if (puVar1 == (undefined1 *)plVar4[7]) {
          iVar3 = (**(code **)(*plVar4 + 0x68))(plVar4);
          if (iVar3 == -1) break;
        }
        else {
          plVar4[6] = (long)(puVar1 + 1);
          *puVar1 = uVar2;
        }
        if (*(long *)(param_1 + 0x18) == *(long *)(param_1 + 0x20)) {
          (**(code **)(*(long *)param_1 + 0x50))(param_1);
        }
        else {
          *(long *)(param_1 + 0x18) = *(long *)(param_1 + 0x18) + 1;
        }
        lVar5 = lVar5 + -1;
      }
      if (lVar5 == 0) {
LAB_00bd1fe8:
                    /* try { // try from 00bd1ff8 to 00bd1fff has its CatchHandler @ 00bd2024 */
        ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                        *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 4)
        ;
      }
    }
  }
  sentry::~sentry(local_40);
  return this;
}


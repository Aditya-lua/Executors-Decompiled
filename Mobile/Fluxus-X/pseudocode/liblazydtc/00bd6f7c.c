/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd6f7c
 */

/* std::__ndk1::basic_ostream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_streambuf<wchar_t,
   std::__ndk1::char_traits<wchar_t> >*) */

basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> * __thiscall
std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator<<
          (basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_streambuf *param_1)

{
  ios_base *this_00;
  int *piVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  sentry local_40 [16];
  
                    /* try { // try from 00bd6f9c to 00bd6fa7 has its CatchHandler @ 00bd70dc */
  sentry::sentry(local_40,(basic_ostream *)this);
  if (local_40[0] == (sentry)0x1) {
    this_00 = (ios_base *)(this + *(long *)(*(long *)this + -0x18));
    if (param_1 == (basic_streambuf *)0x0) {
                    /* try { // try from 00bd70ac to 00bd70b3 has its CatchHandler @ 00bd713c */
      ios_base::clear(this_00,*(uint *)(this_00 + 0x20) | 1);
    }
    else {
      plVar3 = *(long **)(this_00 + 0x28);
      lVar4 = 0;
      while( true ) {
        if (*(int **)(param_1 + 0x18) == *(int **)(param_1 + 0x20)) {
                    /* try { // try from 00bd6ff8 to 00bd7083 has its CatchHandler @ 00bd7110 */
          iVar2 = (**(code **)(*(long *)param_1 + 0x48))(param_1);
        }
        else {
          iVar2 = **(int **)(param_1 + 0x18);
        }
        if (iVar2 == -1) break;
        if (*(int **)(param_1 + 0x18) == *(int **)(param_1 + 0x20)) {
          iVar2 = (**(code **)(*(long *)param_1 + 0x48))(param_1);
        }
        else {
          iVar2 = **(int **)(param_1 + 0x18);
        }
        if (plVar3 == (long *)0x0) goto LAB_00bd708c;
        piVar1 = (int *)plVar3[6];
        if (piVar1 == (int *)plVar3[7]) {
          iVar2 = (**(code **)(*plVar3 + 0x68))(plVar3);
        }
        else {
          *piVar1 = iVar2;
          plVar3[6] = (long)(piVar1 + 1);
        }
        if (iVar2 == -1) break;
        if (*(long *)(param_1 + 0x18) == *(long *)(param_1 + 0x20)) {
          (**(code **)(*(long *)param_1 + 0x50))(param_1);
        }
        else {
          *(long *)(param_1 + 0x18) = *(long *)(param_1 + 0x18) + 4;
        }
        lVar4 = lVar4 + -1;
      }
      if (lVar4 == 0) {
LAB_00bd708c:
                    /* try { // try from 00bd709c to 00bd70a3 has its CatchHandler @ 00bd70d8 */
        ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                        *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 4)
        ;
      }
    }
  }
  sentry::~sentry(local_40);
  return this;
}


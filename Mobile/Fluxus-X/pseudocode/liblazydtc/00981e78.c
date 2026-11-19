/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00981e78
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::TEMPNAMEPLACEHOLDERVALUE(int&)
    */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,int *param_1)

{
  long lVar1;
  long *plVar2;
  int iVar3;
  locale alStack_58 [8];
  long local_50;
  uint local_44;
  sentry local_40 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
                    /* try { // try from 00981ea0 to 00981eaf has its CatchHandler @ 00981fa4 */
  sentry::sentry(local_40,(basic_istream *)this,false);
  if (local_40[0] == (sentry)0x0) goto LAB_00981f70;
  local_44 = 0;
                    /* try { // try from 00981ec8 to 00981ecf has its CatchHandler @ 00981fa0 */
  ios_base::getloc();
                    /* try { // try from 00981ed0 to 00981f07 has its CatchHandler @ 00981fac */
  plVar2 = (long *)locale::use_facet(alStack_58,
                                     (id *)&num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                            ::id);
  (**(code **)(*plVar2 + 0x20))
            (plVar2,*(undefined8 *)(this + *(long *)(*(long *)this + -0x18) + 0x28),0,
             this + *(long *)(*(long *)this + -0x18),&local_44,&local_50);
  locale::~locale(alStack_58);
  if (local_50 < -0x80000000) {
    iVar3 = -0x80000000;
LAB_00981f40:
    local_44 = local_44 | 4;
    *param_1 = iVar3;
  }
  else {
    if (0x7fffffff < local_50) {
      iVar3 = 0x7fffffff;
      goto LAB_00981f40;
    }
    *param_1 = (int)local_50;
  }
                    /* try { // try from 00981f6c to 00981f6f has its CatchHandler @ 00981f9c */
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                  *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | local_44
                 );
LAB_00981f70:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}


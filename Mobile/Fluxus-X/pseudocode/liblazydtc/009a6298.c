/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009a6298
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::TEMPNAMEPLACEHOLDERVALUE(bool)
    */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,bool param_1)

{
  basic_ostream<char,std::__ndk1::char_traits<char>> *pbVar1;
  long lVar2;
  uint uVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  undefined8 uVar7;
  sentry local_70 [8];
  basic_ostream<char,std::__ndk1::char_traits<char>> *local_68;
  locale alStack_60 [8];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_70[0] = (sentry)0x0;
  local_68 = this;
  if (*(int *)(this + *(long *)(*(long *)this + -0x18) + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)
         (this + *(long *)(*(long *)this + -0x18) + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 009a62ec to 009a62ef has its CatchHandler @ 009a6404 */
      flush(*(basic_ostream<char,std::__ndk1::char_traits<char>> **)
             (this + *(long *)(*(long *)this + -0x18) + 0x88));
    }
    local_70[0] = (sentry)0x1;
                    /* try { // try from 009a6308 to 009a630f has its CatchHandler @ 009a6420 */
    ios_base::getloc();
                    /* try { // try from 009a6310 to 009a631f has its CatchHandler @ 009a6410 */
    plVar4 = (long *)locale::use_facet(alStack_60,
                                       (id *)&num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                              ::id);
    locale::~locale(alStack_60);
    pbVar1 = this + *(long *)(*(long *)this + -0x18);
    uVar3 = *(uint *)(pbVar1 + 0x90);
    uVar7 = *(undefined8 *)(pbVar1 + 0x28);
    if (uVar3 == 0xffffffff) {
                    /* try { // try from 009a6348 to 009a6353 has its CatchHandler @ 009a6424 */
      ios_base::getloc();
                    /* try { // try from 009a6354 to 009a6373 has its CatchHandler @ 009a640c */
      plVar5 = (long *)locale::use_facet(alStack_60,(id *)&ctype<char>::id);
      uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,0x20);
      locale::~locale(alStack_60);
      uVar3 = uVar3 & 0xff;
      *(uint *)(pbVar1 + 0x90) = uVar3;
    }
                    /* try { // try from 009a6390 to 009a63a3 has its CatchHandler @ 009a6424 */
    lVar6 = (**(code **)(*plVar4 + 0x18))(plVar4,uVar7,pbVar1,uVar3,param_1);
    if (lVar6 == 0) {
                    /* try { // try from 009a63c0 to 009a63c3 has its CatchHandler @ 009a6400 */
      ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                      *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 5);
    }
  }
  sentry::~sentry(local_70);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}


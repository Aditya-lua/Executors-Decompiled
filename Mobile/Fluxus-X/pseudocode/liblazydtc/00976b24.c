/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00976b24
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >::TEMPNAMEPLACEHOLDERVALUE(int)
    */

basic_ostream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
          (basic_ostream<char,std::__ndk1::char_traits<char>> *this,int param_1)

{
  basic_ostream<char,std::__ndk1::char_traits<char>> *pbVar1;
  ulong uVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  long *plVar6;
  long lVar7;
  long *plVar8;
  undefined8 uVar9;
  sentry local_70 [8];
  basic_ostream<char,std::__ndk1::char_traits<char>> *local_68;
  locale alStack_60 [8];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  local_70[0] = (sentry)0x0;
  plVar8 = (long *)(*(long *)this + -0x18);
  local_68 = this;
  if (*(int *)(this + *plVar8 + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + *plVar8 + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 00976b78 to 00976b7b has its CatchHandler @ 00976cb0 */
      flush(*(basic_ostream<char,std::__ndk1::char_traits<char>> **)(this + *plVar8 + 0x88));
      plVar8 = (long *)(*(long *)this + -0x18);
    }
    local_70[0] = (sentry)0x1;
    uVar3 = *(uint *)(this + *plVar8 + 8);
                    /* try { // try from 00976b98 to 00976b9f has its CatchHandler @ 00976ccc */
    ios_base::getloc();
                    /* try { // try from 00976ba0 to 00976baf has its CatchHandler @ 00976cbc */
    plVar8 = (long *)locale::use_facet(alStack_60,
                                       (id *)&num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                              ::id);
    locale::~locale(alStack_60);
    pbVar1 = this + *(long *)(*(long *)this + -0x18);
    uVar5 = *(uint *)(pbVar1 + 0x90);
    uVar9 = *(undefined8 *)(pbVar1 + 0x28);
    if (uVar5 == 0xffffffff) {
                    /* try { // try from 00976bd8 to 00976be3 has its CatchHandler @ 00976cd0 */
      ios_base::getloc();
                    /* try { // try from 00976be4 to 00976c03 has its CatchHandler @ 00976cb8 */
      plVar6 = (long *)locale::use_facet(alStack_60,(id *)&ctype<char>::id);
      uVar5 = (**(code **)(*plVar6 + 0x38))(plVar6,0x20);
      locale::~locale(alStack_60);
      uVar5 = uVar5 & 0xff;
      *(uint *)(pbVar1 + 0x90) = uVar5;
    }
    uVar2 = (ulong)(uint)param_1;
    if ((uVar3 & 0x4a) != 8 && (uVar3 & 0x4a) != 0x40) {
      uVar2 = (long)param_1;
    }
                    /* try { // try from 00976c40 to 00976c4f has its CatchHandler @ 00976cd0 */
    lVar7 = (**(code **)(*plVar8 + 0x20))(plVar8,uVar9,pbVar1,uVar5,uVar2);
    if (lVar7 == 0) {
                    /* try { // try from 00976c6c to 00976c6f has its CatchHandler @ 00976cac */
      ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                      *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 5);
    }
  }
  sentry::~sentry(local_70);
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}


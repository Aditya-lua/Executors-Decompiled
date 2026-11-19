/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e7f2c
 */

/* std::__ndk1::basic_ostream<char, std::__ndk1::char_traits<char> >&
   std::__ndk1::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_ostream<char,
   std::__ndk1::char_traits<char> >&, std::__ndk1::__iom_t10<char> const&) */

basic_ostream * std::__ndk1::operator<<(basic_ostream *param_1,__iom_t10 *param_2)

{
  basic_ostream *pbVar1;
  undefined8 uVar2;
  char *__s;
  long lVar3;
  uint uVar4;
  time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>> *ptVar5;
  long *plVar6;
  size_t sVar7;
  long lVar8;
  undefined8 uVar9;
  sentry local_70 [8];
  basic_ostream *local_68;
  locale alStack_60 [8];
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  local_70[0] = (sentry)0x0;
  local_68 = param_1;
  if (*(int *)(param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x20) == 0) {
    if (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)
         (param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x88) !=
        (basic_ostream<char,std::__ndk1::char_traits<char>> *)0x0) {
                    /* try { // try from 008e7f80 to 008e7f83 has its CatchHandler @ 008e80a4 */
      basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                (*(basic_ostream<char,std::__ndk1::char_traits<char>> **)
                  (param_1 + *(long *)(*(long *)param_1 + -0x18) + 0x88));
    }
    local_70[0] = (sentry)0x1;
                    /* try { // try from 008e7f9c to 008e7fa3 has its CatchHandler @ 008e80c0 */
    ios_base::getloc();
                    /* try { // try from 008e7fa4 to 008e7fb3 has its CatchHandler @ 008e80b0 */
    ptVar5 = (time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>> *
             )locale::use_facet(alStack_60,
                                (id *)&time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                       ::id);
    locale::~locale(alStack_60);
    pbVar1 = param_1 + *(long *)(*(long *)param_1 + -0x18);
    uVar4 = *(uint *)(pbVar1 + 0x90);
    uVar9 = *(undefined8 *)(pbVar1 + 0x28);
    if (uVar4 == 0xffffffff) {
                    /* try { // try from 008e7fdc to 008e7fe7 has its CatchHandler @ 008e80c4 */
      ios_base::getloc();
                    /* try { // try from 008e7fe8 to 008e8007 has its CatchHandler @ 008e80ac */
      plVar6 = (long *)locale::use_facet(alStack_60,(id *)&ctype<char>::id);
      uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,0x20);
      locale::~locale(alStack_60);
      uVar4 = uVar4 & 0xff;
      *(uint *)(pbVar1 + 0x90) = uVar4;
    }
    uVar2 = *(undefined8 *)param_2;
    __s = *(char **)(param_2 + 8);
    sVar7 = strlen(__s);
                    /* try { // try from 008e802c to 008e8047 has its CatchHandler @ 008e80c4 */
    lVar8 = time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
            put(ptVar5,uVar9,pbVar1,uVar4,uVar2,__s,__s + sVar7);
    if (lVar8 == 0) {
                    /* try { // try from 008e8060 to 008e8063 has its CatchHandler @ 008e80a0 */
      ios_base::clear((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)),
                      *(uint *)((ios_base *)(param_1 + *(long *)(*(long *)param_1 + -0x18)) + 0x20)
                      | 1);
    }
  }
  basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry(local_70);
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return param_1;
}


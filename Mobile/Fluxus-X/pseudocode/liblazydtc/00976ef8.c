/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00976ef8
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(long&) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,long *param_1)

{
  long lVar1;
  long *plVar2;
  locale alStack_50 [12];
  uint local_44;
  sentry local_40 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
                    /* try { // try from 00976f20 to 00976f2f has its CatchHandler @ 00976fe0 */
  sentry::sentry(local_40,(basic_istream *)this,false);
  if (local_40[0] != (sentry)0x0) {
    local_44 = 0;
                    /* try { // try from 00976f48 to 00976f4f has its CatchHandler @ 00976fdc */
    ios_base::getloc();
                    /* try { // try from 00976f50 to 00976f87 has its CatchHandler @ 00976fe8 */
    plVar2 = (long *)locale::use_facet(alStack_50,
                                       (id *)&num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                              ::id);
    (**(code **)(*plVar2 + 0x20))
              (plVar2,*(undefined8 *)(this + *(long *)(*(long *)this + -0x18) + 0x28),0,
               this + *(long *)(*(long *)this + -0x18),&local_44,param_1);
    locale::~locale(alStack_50);
                    /* try { // try from 00976fa8 to 00976fab has its CatchHandler @ 00976fd8 */
    ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),
                    *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) |
                    local_44);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return this;
}


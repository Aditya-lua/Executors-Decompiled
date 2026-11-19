/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00977028
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::TEMPNAMEPLACEHOLDERVALUE(unsigned long&) */

basic_istream<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,ulong *param_1)

{
  long lVar1;
  long *plVar2;
  locale alStack_50 [12];
  uint local_44;
  sentry local_40 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
                    /* try { // try from 00977050 to 0097705f has its CatchHandler @ 00977110 */
  sentry::sentry(local_40,(basic_istream *)this,false);
  if (local_40[0] != (sentry)0x0) {
    local_44 = 0;
                    /* try { // try from 00977078 to 0097707f has its CatchHandler @ 0097710c */
    ios_base::getloc();
                    /* try { // try from 00977080 to 009770b7 has its CatchHandler @ 00977118 */
    plVar2 = (long *)locale::use_facet(alStack_50,
                                       (id *)&num_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>
                                              ::id);
    (**(code **)(*plVar2 + 0x40))
              (plVar2,*(undefined8 *)(this + *(long *)(*(long *)this + -0x18) + 0x28),0,
               this + *(long *)(*(long *)this + -0x18),&local_44,param_1);
    locale::~locale(alStack_50);
                    /* try { // try from 009770d8 to 009770db has its CatchHandler @ 00977108 */
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


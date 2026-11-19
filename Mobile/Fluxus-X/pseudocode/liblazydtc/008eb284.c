/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eb284
 */

/* cpr::Session::DoEasyPerform() */

undefined8 __thiscall cpr::Session::DoEasyPerform(Session *this)

{
  long lVar1;
  char cVar2;
  basic_ostream *this_00;
  long *plVar3;
  undefined8 uVar4;
  locale alStack_40 [8];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (this[0x2a8] == (Session)0x0) {
    uVar4 = curl_easy_perform(**(undefined8 **)(this + 0x18));
    if (*(long *)(lVar1 + 0x28) != local_38) goto LAB_008eb364;
  }
  else {
    this_00 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&std::__ndk1::cerr,
                         "curl_easy_perform cannot be executed if the CURL handle is used in a MultiPerform."
                         ,0x52);
    std::__ndk1::ios_base::getloc();
                    /* try { // try from 008eb2dc to 008eb2fb has its CatchHandler @ 008eb368 */
    plVar3 = (long *)std::__ndk1::locale::use_facet(alStack_40,(id *)&std::__ndk1::ctype<char>::id);
    cVar2 = (**(code **)(*plVar3 + 0x38))(plVar3,10);
    std::__ndk1::locale::~locale(alStack_40);
    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)this_00,cVar2);
    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)this_00);
    if (*(long *)(lVar1 + 0x28) != local_38) {
LAB_008eb364:
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    uVar4 = 2;
  }
  return uVar4;
}


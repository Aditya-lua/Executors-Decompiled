/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ee1d4
 */

/* cpr::Session::UpdateHeader(std::__ndk1::map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, cpr::CaseInsensitiveCompare,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&) */

void __thiscall cpr::Session::UpdateHeader(Session *this,map *param_1)

{
  ulong uVar1;
  long lVar2;
  map *pmVar3;
  map *pmVar4;
  long lVar5;
  map *pmVar6;
  tuple atStack_58 [8];
  basic_string_conflict *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (*(map **)param_1 != param_1 + 8) {
    pmVar6 = *(map **)param_1;
    do {
      local_50 = (basic_string_conflict *)(pmVar6 + 0x20);
      pmVar3 = (map *)std::__ndk1::
                      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                      ::
                      __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>>
                                ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                  *)(this + 0x98),local_50,(piecewise_construct_t *)&DAT_00745170,
                                 (tuple *)&local_50,atStack_58);
      if (pmVar3 != pmVar6) {
        uVar1 = *(ulong *)(pmVar6 + 0x40);
        pmVar4 = *(map **)(pmVar6 + 0x48);
        if (((byte)pmVar6[0x38] & 1) == 0) {
          pmVar4 = pmVar6 + 0x39;
          uVar1 = (ulong)((byte)pmVar6[0x38] >> 1);
        }
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 (pmVar3 + 0x38),(char *)pmVar4,uVar1);
      }
      pmVar3 = *(map **)(pmVar6 + 8);
      if (*(map **)(pmVar6 + 8) == (map *)0x0) {
        pmVar3 = pmVar6 + 0x10;
        pmVar4 = *(map **)pmVar3;
        if (*(map **)pmVar4 != pmVar6) {
          do {
            lVar5 = *(long *)pmVar3;
            pmVar3 = (map *)(lVar5 + 0x10);
            pmVar4 = *(map **)pmVar3;
          } while (*(long *)pmVar4 != lVar5);
        }
      }
      else {
        do {
          pmVar4 = pmVar3;
          pmVar3 = *(map **)pmVar4;
        } while (*(map **)pmVar4 != (map *)0x0);
      }
      pmVar6 = pmVar4;
    } while (pmVar4 != param_1 + 8);
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


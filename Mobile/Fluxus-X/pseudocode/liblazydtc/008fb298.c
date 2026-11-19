/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fb298
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x008fb304 */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* cpr::Proxies::Proxies(std::__ndk1::map<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   std::__ndk1::less<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > >,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&) */

void __thiscall cpr::Proxies::Proxies(Proxies *this,map *param_1)

{
  long lVar1;
  Proxies *pPVar2;
  __tree_node_base *p_Var3;
  map *pmVar4;
  long lVar5;
  Proxies *pPVar6;
  map *pmVar7;
  undefined1 auStack_80 [8];
  undefined8 local_78;
  __tree_node_base *p_Stack_70;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  pPVar6 = this + 8;
  *(undefined8 *)pPVar6 = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(Proxies **)this = pPVar6;
  pmVar7 = *(map **)param_1;
  pPVar2 = this;
  do {
    while( true ) {
      if (pmVar7 == param_1 + 8) {
        if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return;
      }
                    /* try { // try from 008fb2f0 to 008fb32f has its CatchHandler @ 008fb3e0 */
      pPVar2 = (Proxies *)
               std::__ndk1::
               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               ::
               __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                         ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)pPVar2,pPVar6,&local_78,auStack_80,pmVar7 + 0x20);
      if (*(long *)pPVar2 == 0) break;
      pmVar4 = *(map **)(pmVar7 + 8);
      if (*(map **)(pmVar7 + 8) != (map *)0x0) goto LAB_008fb370;
LAB_008fb380:
      pmVar4 = pmVar7 + 0x10;
      if (*(map **)*(map **)pmVar4 == pmVar7) {
        pmVar7 = *(map **)pmVar4;
      }
      else {
        do {
          lVar5 = *(long *)pmVar4;
          pmVar4 = (map *)(lVar5 + 0x10);
          pmVar7 = *(map **)pmVar4;
        } while (*(long *)pmVar7 != lVar5);
      }
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::
    __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
              ((pair *)this);
    *(undefined8 *)p_Stack_70 = 0;
    *(undefined8 *)(p_Stack_70 + 8) = 0;
    *(undefined8 *)(p_Stack_70 + 0x10) = local_78;
    *(__tree_node_base **)pPVar2 = p_Stack_70;
    p_Var3 = p_Stack_70;
    if (**(long **)this != 0) {
      *(long *)this = **(long **)this;
      p_Var3 = *(__tree_node_base **)pPVar2;
    }
    pPVar2 = *(Proxies **)(this + 8);
    std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
              ((__tree_node_base *)pPVar2,p_Var3);
    *(long *)(this + 0x10) = *(long *)(this + 0x10) + 1;
    pmVar4 = *(map **)(pmVar7 + 8);
    if (*(map **)(pmVar7 + 8) == (map *)0x0) goto LAB_008fb380;
LAB_008fb370:
    do {
      pmVar7 = pmVar4;
      pmVar4 = *(map **)pmVar7;
    } while (*(map **)pmVar7 != (map *)0x0);
  } while( true );
}


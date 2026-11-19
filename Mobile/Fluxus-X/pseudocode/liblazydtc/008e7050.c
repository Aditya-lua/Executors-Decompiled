/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e7050
 */

/* WARNING: Type propagation algorithm not settling */

void _INIT_178(void)

{
  long lVar1;
  long *plVar2;
  __tree_node_base *p_Var3;
  long lVar4;
  long lVar5;
  undefined1 auStack_120 [8];
  undefined8 local_118;
  __tree_node_base *p_Stack_110;
  undefined4 local_f8 [2];
  byte local_f0;
  undefined7 uStack_ef;
  undefined1 uStack_e8;
  undefined1 local_e7;
  undefined6 uStack_e6;
  void *local_e0;
  undefined4 local_d8;
  ulong local_d0;
  undefined8 local_c8;
  void *local_c0;
  undefined4 local_b8;
  ulong local_b0;
  undefined8 uStack_a8;
  void *local_a0;
  undefined4 local_98;
  ulong local_90;
  undefined8 uStack_88;
  void *local_80;
  undefined4 local_78;
  byte local_70;
  undefined7 uStack_6f;
  undefined1 uStack_68;
  undefined1 local_67;
  undefined6 uStack_66;
  void *local_60;
  
  lVar1 = tpidr_el0;
  lVar4 = *(long *)(lVar1 + 0x28);
  uStack_e6 = 0;
  uStack_ef = 0x7469746e656469;
  uStack_e8 = 0x79;
  local_d8 = 1;
  local_d0 = 0x6574616c6665640e;
  local_b8 = 2;
  uStack_a8 = 0;
  uStack_88 = 0;
  local_f8[0] = 0;
  local_e0 = (void *)0x0;
  local_f0 = 0x10;
  local_e7 = 0;
  local_c0 = (void *)0x0;
  local_c8 = 0;
  local_a0 = (void *)0x0;
  local_b0 = 0x62696c7a08;
  local_98 = 3;
  local_80 = (void *)0x0;
  local_78 = 4;
  local_90 = 0x70697a6708;
  uStack_66 = 0;
  local_70 = 0x10;
  local_60 = (void *)0x0;
  uStack_6f = 0x656c6261736964;
  uStack_68 = 100;
  lVar5 = 0;
  DAT_00d1ff00 = (__tree_node_base *)0x0;
  local_67 = 0;
  DAT_00d1ff08 = 0;
  DAT_00d1fef8 = &DAT_00d1ff00;
  do {
                    /* try { // try from 008e717c to 008e71af has its CatchHandler @ 008e72b4 */
    plVar2 = (long *)FUN_00828d84(&DAT_00d1fef8,&DAT_00d1ff00,&local_118,auStack_120,
                                  (long)local_f8 + lVar5);
    if (*plVar2 == 0) {
      std::__ndk1::
      __tree<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<cpr::AcceptEncodingMethods,std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<cpr::AcceptEncodingMethods>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::
      __construct_node<std::__ndk1::pair<cpr::AcceptEncodingMethods_const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                ((pair *)&DAT_00d1fef8);
      *(undefined8 *)p_Stack_110 = 0;
      *(undefined8 *)(p_Stack_110 + 8) = 0;
      *(undefined8 *)(p_Stack_110 + 0x10) = local_118;
      *plVar2 = (long)p_Stack_110;
      p_Var3 = p_Stack_110;
      if ((undefined8 *)*DAT_00d1fef8 != (undefined8 *)0x0) {
        p_Var3 = (__tree_node_base *)*plVar2;
        DAT_00d1fef8 = (undefined8 *)*DAT_00d1fef8;
      }
      std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                (DAT_00d1ff00,p_Var3);
      DAT_00d1ff08 = DAT_00d1ff08 + 1;
    }
    lVar5 = lVar5 + 0x20;
  } while (lVar5 != 0xa0);
  if ((local_70 & 1) != 0) {
    operator_delete(local_60);
  }
  if ((local_90 & 1) != 0) {
    operator_delete(local_80);
  }
  if ((local_b0 & 1) != 0) {
    operator_delete(local_a0);
  }
  if ((local_d0 & 1) != 0) {
    operator_delete(local_c0);
  }
  if ((local_f0 & 1) != 0) {
    operator_delete(local_e0);
  }
  __cxa_atexit(std::__ndk1::
               map<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::less<cpr::AcceptEncodingMethods>,std::__ndk1::allocator<std::__ndk1::pair<cpr::AcceptEncodingMethods_const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               ::~map,&DAT_00d1fef8,&PTR_LOOP_00c48880);
  if (*(long *)(lVar1 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


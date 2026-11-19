/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00990540
 */

/* std::__ndk1::unique_ptr<ix::WebSocketMessage, std::__ndk1::default_delete<ix::WebSocketMessage> >
   ix::make_unique<ix::WebSocketMessage, ix::WebSocketMessageType, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long&,
   ix::WebSocketErrorInfo, ix::WebSocketOpenInfo,
   ix::WebSocketCloseInfo>(ix::WebSocketMessageType&&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long&,
   ix::WebSocketErrorInfo&&, ix::WebSocketOpenInfo&&, ix::WebSocketCloseInfo&&) */

void __thiscall
ix::
make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long&,ix::WebSocketErrorInfo,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo>
          (ix *this,WebSocketMessageType *param_1,basic_string_conflict *param_2,ulong *param_3,
          WebSocketErrorInfo *param_4,WebSocketOpenInfo *param_5,WebSocketCloseInfo *param_6)

{
  undefined4 uVar1;
  long lVar2;
  WebSocketMessage *pWVar3;
  undefined8 uVar4;
  undefined8 *in_x8;
  __tree_node **pp_Var5;
  ulong local_120;
  undefined8 uStack_118;
  void *local_110;
  __tree_node **local_108;
  __tree_node *local_100;
  long lStack_f8;
  ulong local_f0;
  undefined8 uStack_e8;
  void *local_e0;
  undefined2 local_d8 [4];
  ulong local_d0;
  undefined8 uStack_c8;
  void *local_c0;
  WebSocketOpenInfo local_b8;
  ulong local_b0;
  ulong uStack_a8;
  undefined4 local_a0;
  ulong local_98;
  ulong uStack_90;
  void *local_88;
  undefined1 local_80;
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  pWVar3 = operator_new(200);
  local_a0 = (undefined4)param_3[2];
  uVar1 = *(undefined4 *)this;
  uVar4 = *(undefined8 *)param_2;
  uStack_a8 = param_3[1];
  local_b0 = *param_3;
  local_108 = &local_100;
  local_88 = (void *)param_3[5];
  uStack_90 = param_3[4];
  local_98 = param_3[3];
  local_80 = (undefined1)param_3[6];
  param_3[3] = 0;
  param_3[4] = 0;
  param_3[5] = 0;
  local_110 = *(void **)(param_4 + 0x10);
  uStack_118 = *(undefined8 *)(param_4 + 8);
  local_120 = *(ulong *)param_4;
  pp_Var5 = *(__tree_node ***)(param_4 + 0x18);
  *(undefined8 *)param_4 = 0;
  *(undefined8 *)(param_4 + 8) = 0;
  *(undefined8 *)(param_4 + 0x10) = 0;
  local_100 = *(__tree_node **)(param_4 + 0x20);
  lStack_f8 = *(long *)(param_4 + 0x28);
  if (lStack_f8 != 0) {
    *(__tree_node ***)(local_100 + 0x10) = local_108;
    *(undefined8 *)(param_4 + 0x20) = 0;
    *(WebSocketErrorInfo **)(param_4 + 0x18) = param_4 + 0x20;
    *(undefined8 *)(param_4 + 0x28) = 0;
    local_108 = pp_Var5;
  }
  local_e0 = *(void **)(param_4 + 0x40);
  uStack_e8 = *(undefined8 *)(param_4 + 0x38);
  local_f0 = *(ulong *)(param_4 + 0x30);
  *(undefined8 *)(param_4 + 0x38) = 0;
  *(undefined8 *)(param_4 + 0x40) = 0;
  *(undefined8 *)(param_4 + 0x30) = 0;
  local_d8[0] = *(undefined2 *)param_5;
  local_c0 = *(void **)(param_5 + 0x18);
  uStack_c8 = *(undefined8 *)(param_5 + 0x10);
  local_d0 = *(ulong *)(param_5 + 8);
  local_b8 = param_5[0x20];
  *(undefined8 *)(param_5 + 0x10) = 0;
  *(undefined8 *)(param_5 + 0x18) = 0;
  *(undefined8 *)(param_5 + 8) = 0;
                    /* try { // try from 0099065c to 00990677 has its CatchHandler @ 00990700 */
  WebSocketMessage::WebSocketMessage(pWVar3,uVar1,param_1,uVar4,&local_b0,&local_120,local_d8,0);
  *in_x8 = pWVar3;
  if ((local_d0 & 1) != 0) {
    operator_delete(local_c0);
  }
  if ((local_f0 & 1) != 0) {
    operator_delete(local_e0);
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_108,local_100);
  if ((local_120 & 1) != 0) {
    operator_delete(local_110);
  }
  if ((local_98 & 1) != 0) {
    operator_delete(local_88);
  }
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


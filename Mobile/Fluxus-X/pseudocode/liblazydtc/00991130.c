/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00991130
 */

/* std::__ndk1::unique_ptr<ix::WebSocketMessage, std::__ndk1::default_delete<ix::WebSocketMessage> >
   ix::make_unique<ix::WebSocketMessage, ix::WebSocketMessageType&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long&,
   ix::WebSocketErrorInfo&, ix::WebSocketOpenInfo, ix::WebSocketCloseInfo,
   bool&>(ix::WebSocketMessageType&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long&, ix::WebSocketErrorInfo&,
   ix::WebSocketOpenInfo&&, ix::WebSocketCloseInfo&&, bool&) */

void __thiscall
ix::
make_unique<ix::WebSocketMessage,ix::WebSocketMessageType&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,unsigned_long&,ix::WebSocketErrorInfo&,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo,bool&>
          (ix *this,WebSocketMessageType *param_1,basic_string_conflict *param_2,ulong *param_3,
          WebSocketErrorInfo *param_4,WebSocketOpenInfo *param_5,WebSocketCloseInfo *param_6,
          bool *param_7)

{
  undefined4 uVar1;
  long lVar2;
  WebSocketMessage *pWVar3;
  void *__dest;
  undefined8 uVar4;
  undefined8 *in_x8;
  __tree_node **pp_Var5;
  void *__src;
  ulong uVar6;
  ulong __n;
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
  undefined8 local_98;
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
  uStack_90 = 0;
  local_88 = (void *)0x0;
  local_98 = 0;
  if ((param_3[3] & 1) == 0) {
    local_88 = (void *)param_3[5];
    uStack_90 = param_3[4];
    local_98 = param_3[3];
    goto LAB_00991260;
  }
  __n = param_3[4];
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0099139c to 0099139f has its CatchHandler @ 009913a0 */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = (void *)param_3[5];
  if (__n < 0x17) {
    __dest = (void *)((long)&local_98 + 1);
    local_98 = (ulong)(byte)((int)__n << 1);
    if (__n != 0) goto LAB_00991238;
  }
  else {
    uVar6 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0099121c to 00991223 has its CatchHandler @ 009913a0 */
    __dest = operator_new(uVar6);
    local_98 = uVar6 | 1;
    uStack_90 = __n;
    local_88 = __dest;
LAB_00991238:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_00991260:
  local_80 = (undefined1)param_3[6];
  local_108 = &local_100;
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
                    /* try { // try from 009912fc to 00991313 has its CatchHandler @ 009913a8 */
  WebSocketMessage::WebSocketMessage
            (pWVar3,uVar1,param_1,uVar4,&local_b0,&local_120,local_d8,*param_6);
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


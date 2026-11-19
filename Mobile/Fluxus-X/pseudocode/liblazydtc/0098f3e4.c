/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f3e4
 */

/* std::__ndk1::unique_ptr<ix::WebSocketMessage, std::__ndk1::default_delete<ix::WebSocketMessage> >
   ix::make_unique<ix::WebSocketMessage, ix::WebSocketMessageType, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, int,
   ix::WebSocketErrorInfo&, ix::WebSocketOpenInfo,
   ix::WebSocketCloseInfo>(ix::WebSocketMessageType&&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, int&&,
   ix::WebSocketErrorInfo&, ix::WebSocketOpenInfo&&, ix::WebSocketCloseInfo&&) */

void __thiscall
ix::
make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int,ix::WebSocketErrorInfo&,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo>
          (ix *this,WebSocketMessageType *param_1,basic_string_conflict *param_2,int *param_3,
          WebSocketErrorInfo *param_4,WebSocketOpenInfo *param_5,WebSocketCloseInfo *param_6)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  WebSocketMessage *pWVar4;
  void *__dest;
  undefined8 *in_x8;
  __tree_node **pp_Var5;
  ulong uVar6;
  ulong __n;
  void *__src;
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
  undefined8 local_b0;
  undefined8 uStack_a8;
  int local_a0;
  undefined8 local_98;
  ulong uStack_90;
  void *local_88;
  undefined1 local_80;
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  pWVar4 = operator_new(200);
  local_a0 = param_3[4];
  uVar1 = *(undefined4 *)this;
  iVar2 = *(int *)param_2;
  uStack_a8 = *(undefined8 *)(param_3 + 2);
  local_b0 = *(undefined8 *)param_3;
  uStack_90 = 0;
  local_88 = (void *)0x0;
  local_98 = 0;
  if ((*(ulong *)(param_3 + 6) & 1) == 0) {
    local_88 = *(void **)(param_3 + 10);
    uStack_90 = *(ulong *)(param_3 + 8);
    local_98 = *(ulong *)(param_3 + 6);
    goto LAB_0098f508;
  }
  __n = *(ulong *)(param_3 + 8);
  if (0xffffffffffffffef < __n) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0098f648 to 0098f64b has its CatchHandler @ 0098f64c */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(param_3 + 10);
  if (__n < 0x17) {
    __dest = (void *)((long)&local_98 + 1);
    local_98 = (ulong)(byte)((int)__n << 1);
    if (__n != 0) goto LAB_0098f4e4;
  }
  else {
    uVar6 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098f4c8 to 0098f4cf has its CatchHandler @ 0098f64c */
    __dest = operator_new(uVar6);
    local_98 = uVar6 | 1;
    uStack_90 = __n;
    local_88 = __dest;
LAB_0098f4e4:
    memcpy(__dest,__src,__n);
  }
  *(undefined1 *)((long)__dest + __n) = 0;
LAB_0098f508:
  local_80 = (undefined1)param_3[0xc];
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
                    /* try { // try from 0098f5a0 to 0098f5bf has its CatchHandler @ 0098f654 */
  WebSocketMessage::WebSocketMessage
            (pWVar4,uVar1,param_1,(long)iVar2,&local_b0,&local_120,local_d8,0);
  *in_x8 = pWVar4;
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
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


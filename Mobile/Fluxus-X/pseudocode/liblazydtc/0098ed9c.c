/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ed9c
 */

/* ix::WebSocket::checkConnection(bool) */

void __thiscall ix::WebSocket::checkConnection(WebSocket *this,bool param_1)

{
  char *pcVar1;
  long lVar2;
  ulong uVar3;
  void *pvVar4;
  int iVar5;
  uint uVar6;
  long *plVar7;
  undefined8 *puVar8;
  WebSocketCloseInfo *in_x6;
  uint uVar9;
  ulong local_1e0 [2];
  void *local_1d0;
  __tree_node **pp_Stack_1c8;
  __tree_node *local_1c0;
  undefined8 uStack_1b8;
  ulong local_1b0 [2];
  void *local_1a0;
  WebSocketOpenInfo local_198 [16];
  void *local_188;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  a_Stack_180 [8];
  __tree_node *local_178;
  byte local_168;
  void *local_158;
  undefined4 local_150;
  undefined4 uStack_14c;
  void *local_148;
  double local_140;
  undefined2 local_138 [4];
  ulong local_130;
  undefined8 uStack_128;
  void *local_120;
  undefined1 local_118;
  uint local_110 [2];
  double local_108;
  undefined4 local_100;
  ulong local_f8 [2];
  void *local_e8;
  undefined1 local_e0;
  undefined8 local_d8;
  byte local_d0;
  char acStack_cf [7];
  ulong local_c8;
  char *local_c0;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  a_Stack_b8 [8];
  __tree_node *local_b0;
  byte local_a0;
  void *local_90;
  byte local_88;
  void *local_78;
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  local_140 = 0.0;
  iVar5 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
  if (iVar5 != 3) {
    uVar9 = 0;
    do {
      iVar5 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
      if (((iVar5 == 0) || (((byte)this[0x400] & 1) != 0)) ||
         ((param_1 == false && (((byte)this[0x438] & 1) == 0)))) break;
      if (0.0 < local_140) {
        local_d0 = 1;
        local_d8 = (mutex *)(this + 0x444);
        std::__ndk1::mutex::lock((mutex *)(this + 0x444));
                    /* try { // try from 0098ee98 to 0098eea7 has its CatchHandler @ 0098f2b4 */
        FUN_0098f2d0(this + 0x46c,&local_d8,&local_140);
        if (local_d0 != 0) {
          std::__ndk1::mutex::unlock(local_d8);
        }
      }
      if (((byte)this[0x400] & 1) != 0) break;
      connect((int)this);
      if ((char)local_d8 == '\0') {
        local_110[0] = 0;
        local_108 = 0.0;
        local_100 = 0;
        local_f8[0] = 0;
        local_f8[1] = 0;
        local_e0 = 0;
        local_e8 = (void *)0x0;
        if (((byte)this[0x438] & 1) != 0) {
                    /* try { // try from 0098ef0c to 0098ef13 has its CatchHandler @ 0098f130 */
          uVar6 = calculateRetryWaitMilliseconds
                            (uVar9,*(uint *)(this + 0x43c),*(uint *)(this + 0x440));
          uVar9 = uVar9 + 1;
          local_140 = (double)uVar6;
          local_110[0] = uVar9;
          local_108 = local_140;
        }
        pcVar1 = acStack_cf;
        uVar3 = (ulong)(local_d0 >> 1);
        if ((local_d0 & 1) != 0) {
          pcVar1 = local_c0;
          uVar3 = local_c8;
        }
                    /* try { // try from 0098ef44 to 0098ef4b has its CatchHandler @ 0098f284 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 local_f8,pcVar1,uVar3);
        local_150 = 0;
        uStack_14c = 3;
        local_1b0[0] = 0;
        local_1b0[1] = 0;
        local_1a0 = (void *)0x0;
        local_1c0 = (__tree_node *)0x0;
        uStack_1b8 = 0;
        local_1d0 = (void *)0x0;
        local_1e0[0] = 0;
        local_1e0[1] = 0;
        local_100 = local_d8._4_4_;
                    /* try { // try from 0098ef70 to 0098ef83 has its CatchHandler @ 0098f204 */
        pp_Stack_1c8 = &local_1c0;
        WebSocketOpenInfo::WebSocketOpenInfo
                  (local_198,(basic_string_conflict *)local_1b0,(map *)&pp_Stack_1c8,
                   (basic_string_conflict *)local_1e0);
        local_138[0] = 0;
        local_130 = 0;
        uStack_128 = 0;
        local_118 = 0;
        local_120 = (void *)0x0;
                    /* try { // try from 0098ef94 to 0098efb7 has its CatchHandler @ 0098f1e4 */
        make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int,ix::WebSocketErrorInfo&,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo>
                  ((ix *)&uStack_14c,(WebSocketMessageType *)&DAT_00d216c0,
                   (basic_string_conflict *)&local_150,(int *)local_110,
                   (WebSocketErrorInfo *)local_198,(WebSocketOpenInfo *)local_138,in_x6);
        plVar7 = *(long **)(this + 0x3f0);
        if (plVar7 == (long *)0x0) {
          puVar8 = (undefined8 *)__cxa_allocate_exception(8);
          *puVar8 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 0098f118 to 0098f12b has its CatchHandler @ 0098f12c */
                    /* WARNING: Subroutine does not return */
          __cxa_throw(puVar8,&std::__ndk1::bad_function_call::typeinfo,
                      std::bad_exception::~bad_exception);
        }
                    /* try { // try from 0098efc8 to 0098efcf has its CatchHandler @ 0098f134 */
        (**(code **)(*plVar7 + 0x30))(plVar7,&local_148);
        pvVar4 = local_148;
        local_148 = (void *)0x0;
        if (pvVar4 != (void *)0x0) {
          if ((*(byte *)((long)pvVar4 + 0xa0) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar4 + 0xb0));
          }
          if ((*(byte *)((long)pvVar4 + 0x80) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar4 + 0x90));
          }
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     *)((long)pvVar4 + 0x68),*(__tree_node **)((long)pvVar4 + 0x70));
          if ((*(byte *)((long)pvVar4 + 0x50) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar4 + 0x60));
          }
          if ((*(byte *)((long)pvVar4 + 0x30) & 1) != 0) {
            operator_delete(*(void **)((long)pvVar4 + 0x40));
          }
          operator_delete(pvVar4);
        }
        if ((local_130 & 1) != 0) {
          operator_delete(local_120);
        }
        if ((local_168 & 1) != 0) {
          operator_delete(local_158);
        }
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::destroy(a_Stack_180,local_178);
        if (((byte)local_198[0] & 1) != 0) {
          operator_delete(local_188);
        }
        if ((local_1e0[0] & 1) != 0) {
          operator_delete(local_1d0);
        }
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                   *)&pp_Stack_1c8,local_1c0);
        if ((local_1b0[0] & 1) != 0) {
          operator_delete(local_1a0);
        }
        if ((local_f8[0] & 1) != 0) {
          operator_delete(local_e8);
        }
      }
      if ((local_88 & 1) != 0) {
        operator_delete(local_78);
      }
      if ((local_a0 & 1) != 0) {
        operator_delete(local_90);
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy(a_Stack_b8,local_b0);
      if ((local_d0 & 1) != 0) {
        operator_delete(local_c0);
      }
      iVar5 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
      param_1 = false;
    } while (iVar5 != 3);
  }
  if (*(long *)(lVar2 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


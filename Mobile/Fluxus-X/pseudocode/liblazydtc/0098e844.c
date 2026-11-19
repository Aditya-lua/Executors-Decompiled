/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098e844
 */

/* ix::WebSocket::connectToSocket(std::__ndk1::unique_ptr<ix::Socket,
   std::__ndk1::default_delete<ix::Socket> >, int, bool, std::__ndk1::shared_ptr<ix::HttpRequest>)
    */

void ix::WebSocket::connectToSocket
               (char *param_1,WebSocketTransport *param_2,undefined8 *param_3,undefined4 param_4,
               uint param_5,undefined8 *param_6,undefined8 param_7,WebSocketCloseInfo *param_8)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  void *pvVar6;
  long *plVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong local_150;
  undefined8 uStack_148;
  void *local_140;
  WebSocketOpenInfo local_138 [16];
  void *local_128;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  a_Stack_120 [8];
  __tree_node *local_118;
  byte local_108;
  void *local_f8;
  undefined4 local_f0;
  undefined4 uStack_ec;
  void *local_e8;
  undefined8 local_e0;
  __shared_weak_count *local_d8;
  long *local_d0;
  undefined2 local_c8 [4];
  ulong local_c0;
  undefined8 local_b8;
  void *local_b0;
  undefined1 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  ulong uStack_88;
  undefined8 uStack_80;
  void *local_78;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(param_2 + 0x3a0));
                    /* try { // try from 0098e8a4 to 0098e8ab has its CatchHandler @ 0098ed04 */
  WebSocketTransport::configure
            (param_2,(WebSocketPerMessageDeflateOptions *)(param_2 + 0x310),
             (SocketTLSOptions *)(param_2 + 0x318),(bool)param_2[0x4a0],*(int *)(param_2 + 0x4a4));
  std::__ndk1::mutex::unlock((mutex *)(param_2 + 0x3a0));
  local_d0 = (long *)*param_3;
  *param_3 = 0;
  local_e0 = *param_6;
  local_d8 = (__shared_weak_count *)param_6[1];
  if (local_d8 != (__shared_weak_count *)0x0) {
    p_Var1 = local_d8 + 8;
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
  }
                    /* try { // try from 0098e8e8 to 0098e903 has its CatchHandler @ 0098eca0 */
  WebSocketTransport::connectToSocket(param_1,param_2,&local_d0,param_4,param_5 & 1,&local_e0);
  p_Var1 = local_d8;
  if (local_d8 != (__shared_weak_count *)0x0) {
    p_Var2 = local_d8 + 8;
    do {
      lVar9 = *(long *)p_Var2;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar4) {
        *(long *)p_Var2 = lVar9 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar9 == 0) {
      (**(code **)(*(long *)local_d8 + 0x10))(local_d8);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  plVar7 = local_d0;
  local_d0 = (long *)0x0;
  if (plVar7 != (long *)0x0) {
    (**(code **)(*plVar7 + 8))();
  }
  if (*param_1 != '\0') {
    local_f0 = 0;
    uStack_ec = 1;
    local_70 = 0;
    local_150 = 0;
    uStack_148 = 0;
    uStack_88 = 0;
    local_90 = 0;
    local_78 = (void *)0x0;
    uStack_80 = 0;
    uStack_98 = 0;
    local_a0 = 0;
    local_140 = (void *)0x0;
                    /* try { // try from 0098e984 to 0098e993 has its CatchHandler @ 0098ec60 */
    WebSocketOpenInfo::WebSocketOpenInfo
              (local_138,(basic_string_conflict *)(param_1 + 0x38),(map *)(param_1 + 0x20),
               (basic_string_conflict *)&local_150);
    local_c8[0] = 0;
    local_b8 = 0;
    local_b0 = (void *)0x0;
    local_a8 = 0;
    local_c0 = 0;
                    /* try { // try from 0098e9a4 to 0098e9c7 has its CatchHandler @ 0098ec40 */
    make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int,ix::WebSocketErrorInfo,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo>
              ((ix *)&uStack_ec,(WebSocketMessageType *)&DAT_00d216c0,
               (basic_string_conflict *)&local_f0,(int *)&local_a0,(WebSocketErrorInfo *)local_138,
               (WebSocketOpenInfo *)local_c8,param_8);
    plVar7 = *(long **)(param_2 + 0x3f0);
    if (plVar7 == (long *)0x0) {
      puVar8 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar8 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 0098eb1c to 0098eb2f has its CatchHandler @ 0098eb40 */
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar8,&std::__ndk1::bad_function_call::typeinfo,
                  std::bad_exception::~bad_exception);
    }
                    /* try { // try from 0098e9d8 to 0098e9df has its CatchHandler @ 0098eb40 */
    (**(code **)(*plVar7 + 0x30))(plVar7,&local_e8);
    pvVar6 = local_e8;
    local_e8 = (void *)0x0;
    if (pvVar6 != (void *)0x0) {
      if ((*(byte *)((long)pvVar6 + 0xa0) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar6 + 0xb0));
      }
      if ((*(byte *)((long)pvVar6 + 0x80) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar6 + 0x90));
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 *)((long)pvVar6 + 0x68),*(__tree_node **)((long)pvVar6 + 0x70));
      if ((*(byte *)((long)pvVar6 + 0x50) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar6 + 0x60));
      }
      if ((*(byte *)((long)pvVar6 + 0x30) & 1) != 0) {
        operator_delete(*(void **)((long)pvVar6 + 0x40));
      }
      operator_delete(pvVar6);
    }
    if ((local_c0 & 1) != 0) {
      operator_delete(local_b0);
    }
    if ((local_108 & 1) != 0) {
      operator_delete(local_f8);
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy(a_Stack_120,local_118);
    if (((byte)local_138[0] & 1) != 0) {
      operator_delete(local_128);
    }
    if ((local_150 & 1) != 0) {
      operator_delete(local_140);
    }
    if ((uStack_88 & 1) != 0) {
      operator_delete(local_78);
    }
    if (0 < *(int *)(param_2 + 0x4a4)) {
                    /* try { // try from 0098eaa0 to 0098eaab has its CatchHandler @ 0098eb30 */
      WebSocketTransport::sendHeartBeat(local_138,param_2,*(undefined4 *)(param_2 + 0x4c8));
    }
  }
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


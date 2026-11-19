/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ce94
 */

/* WARNING: Type propagation algorithm not settling */
/* ix::WebSocket::~WebSocket() */

void __thiscall ix::WebSocket::~WebSocket(WebSocket *this)

{
  WebSocket WVar1;
  long lVar2;
  byte *pbVar3;
  WebSocket *pWVar4;
  code *pcVar5;
  byte *pbVar6;
  byte *pbVar7;
  function afStack_80 [32];
  long *local_60;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
                    /* try { // try from 0098cec4 to 0098cf03 has its CatchHandler @ 0098d0e8 */
  WebSocketTransport::close
            ((WebSocketTransport *)this,1000,
             (basic_string_conflict *)&WebSocketCloseConstants::kNormalClosureMessage,0,false);
  if (*(long *)(this + 0x408) != 0) {
    this[0x400] = (WebSocket)0x1;
    std::__ndk1::condition_variable::notify_one((condition_variable *)(this + 0x46c));
    std::__ndk1::thread::join((thread *)(this + 0x408));
    this[0x400] = (WebSocket)0x0;
  }
  local_60 = (long *)0x0;
                    /* try { // try from 0098cf0c to 0098cf1b has its CatchHandler @ 0098d0b4 */
  WebSocketTransport::setOnCloseCallback((WebSocketTransport *)this,afStack_80);
  if (afStack_80 == (function *)local_60) {
    pcVar5 = *(code **)(*local_60 + 0x20);
LAB_0098cf40:
    (*pcVar5)();
  }
  else if (local_60 != (long *)0x0) {
    pcVar5 = *(code **)(*local_60 + 0x28);
    goto LAB_0098cf40;
  }
  pbVar6 = *(byte **)(this + 0x4d0);
  if (pbVar6 != (byte *)0x0) {
    if (*(byte **)(this + 0x4d8) == pbVar6) {
      pbVar3 = pbVar6;
    }
    else {
      pbVar3 = *(byte **)(this + 0x4d8);
      do {
        pbVar7 = pbVar3 + -0x18;
        if ((*pbVar7 & 1) != 0) {
          operator_delete(*(void **)(pbVar3 + -8));
        }
        pbVar3 = pbVar7;
      } while (pbVar6 != pbVar7);
      pbVar3 = *(byte **)(this + 0x4d0);
    }
    *(byte **)(this + 0x4d8) = pbVar6;
    operator_delete(pbVar3);
  }
  if (((byte)this[0x4b0] & 1) != 0) {
    operator_delete(*(void **)(this + 0x4c0));
  }
  std::__ndk1::condition_variable::~condition_variable((condition_variable *)(this + 0x46c));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x444));
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x410));
  std::__ndk1::thread::~thread((thread *)(this + 0x408));
  pWVar4 = *(WebSocket **)(this + 0x3f0);
  if (this + 0x3d0 == pWVar4) {
    pcVar5 = *(code **)(*(long *)pWVar4 + 0x20);
  }
  else {
    if (pWVar4 == (WebSocket *)0x0) goto LAB_0098cfe8;
    pcVar5 = *(code **)(*(long *)pWVar4 + 0x28);
  }
  (*pcVar5)();
LAB_0098cfe8:
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x3a0));
  if (((byte)this[0x380] & 1) == 0) {
    WVar1 = this[0x360];
  }
  else {
    operator_delete(*(void **)(this + 0x390));
    WVar1 = this[0x360];
  }
  if (((byte)WVar1 & 1) == 0) {
    WVar1 = this[0x348];
  }
  else {
    operator_delete(*(void **)(this + 0x370));
    WVar1 = this[0x348];
  }
  if (((byte)WVar1 & 1) == 0) {
    WVar1 = this[0x330];
  }
  else {
    operator_delete(*(void **)(this + 0x358));
    WVar1 = this[0x330];
  }
  if (((byte)WVar1 & 1) == 0) {
    WVar1 = this[0x318];
  }
  else {
    operator_delete(*(void **)(this + 0x340));
    WVar1 = this[0x318];
  }
  if (((byte)WVar1 & 1) != 0) {
    operator_delete(*(void **)(this + 0x328));
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)(this + 0x2f8),*(__tree_node **)(this + 0x300));
  if (((byte)this[0x2e0] & 1) != 0) {
    operator_delete(*(void **)(this + 0x2f0));
  }
  WebSocketTransport::~WebSocketTransport((WebSocketTransport *)this);
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


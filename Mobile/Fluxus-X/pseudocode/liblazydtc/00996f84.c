/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00996f84
 */

/* ix::WebSocketInitResult::TEMPNAMEPLACEHOLDERVALUE(ix::WebSocketInitResult&&) */

WebSocketInitResult * __thiscall
ix::WebSocketInitResult::operator=(WebSocketInitResult *this,WebSocketInitResult *param_1)

{
  long lVar1;
  long lVar2;
  WebSocketInitResult *pWVar3;
  WebSocketInitResult *pWVar4;
  undefined8 uVar5;
  
  pWVar3 = this + 8;
  *(undefined8 *)this = *(undefined8 *)param_1;
  if (((byte)*pWVar3 & 1) == 0) {
    *(undefined2 *)pWVar3 = 0;
  }
  else {
    **(undefined1 **)(this + 0x18) = 0;
    *(undefined8 *)(this + 0x10) = 0;
    if (((byte)this[8] & 1) != 0) {
      operator_delete(*(void **)(this + 0x18));
      *(undefined8 *)(this + 8) = 0;
    }
  }
  *(undefined8 *)(this + 0x18) = *(undefined8 *)(param_1 + 0x18);
  uVar5 = *(undefined8 *)(param_1 + 8);
  *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
  *(undefined8 *)pWVar3 = uVar5;
  *(undefined8 *)(param_1 + 0x10) = 0;
  *(undefined8 *)(param_1 + 0x18) = 0;
  *(undefined8 *)(param_1 + 8) = 0;
  pWVar4 = this + 0x28;
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)(this + 0x20),*(__tree_node **)pWVar4);
  *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
  pWVar3 = param_1 + 0x28;
  lVar1 = *(long *)pWVar3;
  *(long *)pWVar4 = lVar1;
  lVar2 = *(long *)(param_1 + 0x30);
  *(long *)(this + 0x30) = lVar2;
  if (lVar2 == 0) {
    *(WebSocketInitResult **)(this + 0x20) = pWVar4;
  }
  else {
    *(WebSocketInitResult **)(lVar1 + 0x10) = pWVar4;
    *(WebSocketInitResult **)(param_1 + 0x20) = pWVar3;
    *(undefined8 *)pWVar3 = 0;
    *(undefined8 *)(param_1 + 0x30) = 0;
  }
  pWVar3 = this + 0x38;
  if (((byte)*pWVar3 & 1) == 0) {
    *(undefined2 *)pWVar3 = 0;
  }
  else {
    **(undefined1 **)(this + 0x48) = 0;
    *(undefined8 *)(this + 0x40) = 0;
    if (((byte)this[0x38] & 1) != 0) {
      operator_delete(*(void **)(this + 0x48));
      *(undefined8 *)(this + 0x38) = 0;
    }
  }
  *(undefined8 *)(this + 0x48) = *(undefined8 *)(param_1 + 0x48);
  uVar5 = *(undefined8 *)(param_1 + 0x38);
  *(undefined8 *)(this + 0x40) = *(undefined8 *)(param_1 + 0x40);
  *(undefined8 *)pWVar3 = uVar5;
  *(undefined8 *)(param_1 + 0x40) = 0;
  *(undefined8 *)(param_1 + 0x48) = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  pWVar3 = this + 0x50;
  if (((byte)*pWVar3 & 1) == 0) {
    *(undefined2 *)pWVar3 = 0;
  }
  else {
    **(undefined1 **)(this + 0x60) = 0;
    *(undefined8 *)(this + 0x58) = 0;
    if (((byte)this[0x50] & 1) != 0) {
      operator_delete(*(void **)(this + 0x60));
      *(undefined8 *)(this + 0x50) = 0;
    }
  }
  *(undefined8 *)(this + 0x60) = *(undefined8 *)(param_1 + 0x60);
  uVar5 = *(undefined8 *)(param_1 + 0x50);
  *(undefined8 *)(this + 0x58) = *(undefined8 *)(param_1 + 0x58);
  *(undefined8 *)pWVar3 = uVar5;
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x58) = 0;
  *(undefined8 *)(param_1 + 0x60) = 0;
  return this;
}


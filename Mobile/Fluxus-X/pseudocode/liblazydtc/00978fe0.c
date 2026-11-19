/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978fe0
 */

/* ix::HttpRequestArgs::~HttpRequestArgs() */

void __thiscall ix::HttpRequestArgs::~HttpRequestArgs(HttpRequestArgs *this)

{
  HttpRequestArgs *pHVar1;
  code *pcVar2;
  
  pHVar1 = *(HttpRequestArgs **)(this + 0x110);
  if (this + 0xf0 == pHVar1) {
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x20);
LAB_00979018:
    (*pcVar2)();
  }
  else if (pHVar1 != (HttpRequestArgs *)0x0) {
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x28);
    goto LAB_00979018;
  }
  pHVar1 = *(HttpRequestArgs **)(this + 0xe0);
  if (this + 0xc0 == pHVar1) {
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x20);
LAB_00979044:
    (*pcVar2)();
  }
  else if (pHVar1 != (HttpRequestArgs *)0x0) {
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x28);
    goto LAB_00979044;
  }
  pHVar1 = *(HttpRequestArgs **)(this + 0xb0);
  if (this + 0x90 == pHVar1) {
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x20);
  }
  else {
    if (pHVar1 == (HttpRequestArgs *)0x0) goto LAB_00979074;
    pcVar2 = *(code **)(*(long *)pHVar1 + 0x28);
  }
  (*pcVar2)();
LAB_00979074:
  if (((byte)this[0x60] & 1) != 0) {
    operator_delete(*(void **)(this + 0x70));
  }
  if (((byte)this[0x48] & 1) != 0) {
    operator_delete(*(void **)(this + 0x58));
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)(this + 0x30),*(__tree_node **)(this + 0x38));
  if (((byte)this[0x18] & 1) != 0) {
    operator_delete(*(void **)(this + 0x28));
  }
  if (((byte)*this & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(this + 0x10));
  return;
}


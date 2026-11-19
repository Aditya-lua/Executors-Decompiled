/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00983dc0
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::__shared_ptr_emplace<ix::HttpRequest, std::__ndk1::allocator<ix::HttpRequest>
   >::~__shared_ptr_emplace() */

void __thiscall
std::__ndk1::__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>>::
~__shared_ptr_emplace
          (__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>> *this)

{
  __shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>> _Var1;
  
  *(undefined ***)this = &PTR____shared_ptr_emplace_00c51dd8;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)(this + 0x78),*(__tree_node **)(this + 0x80));
  if (((byte)this[0x60] & 1) == 0) {
    _Var1 = this[0x48];
  }
  else {
    operator_delete(*(void **)(this + 0x70));
    _Var1 = this[0x48];
  }
  if (((byte)_Var1 & 1) == 0) {
    _Var1 = this[0x30];
  }
  else {
    operator_delete(*(void **)(this + 0x58));
    _Var1 = this[0x30];
  }
  if (((byte)_Var1 & 1) == 0) {
    _Var1 = this[0x18];
  }
  else {
    operator_delete(*(void **)(this + 0x40));
    _Var1 = this[0x18];
  }
  if (((byte)_Var1 & 1) != 0) {
    operator_delete(*(void **)(this + 0x28));
  }
  __shared_weak_count::~__shared_weak_count((__shared_weak_count *)this);
  operator_delete(this);
  return;
}


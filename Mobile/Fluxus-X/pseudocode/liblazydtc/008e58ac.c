/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e58ac
 */

/* cpr::AcceptEncoding::AcceptEncoding(std::initializer_list<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > > const&) */

void __thiscall cpr::AcceptEncoding::AcceptEncoding(AcceptEncoding *this,initializer_list *param_1)

{
  std::__ndk1::
  unordered_set<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
  ::unordered_set(this,*(undefined8 *)param_1,*(undefined8 *)(param_1 + 8));
  return;
}


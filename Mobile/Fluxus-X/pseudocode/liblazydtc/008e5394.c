/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5394
 */

/* std::__ndk1::map<cpr::AcceptEncodingMethods, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >,
   std::__ndk1::less<cpr::AcceptEncodingMethods>,
   std::__ndk1::allocator<std::__ndk1::pair<cpr::AcceptEncodingMethods const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > >::~map() */

void __thiscall
std::__ndk1::
map<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::less<cpr::AcceptEncodingMethods>,std::__ndk1::allocator<std::__ndk1::pair<cpr::AcceptEncodingMethods_const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
::~map(map<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::less<cpr::AcceptEncodingMethods>,std::__ndk1::allocator<std::__ndk1::pair<cpr::AcceptEncodingMethods_const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
       *this)

{
  FUN_00828f8c(this,*(undefined8 *)(this + 8));
  return;
}


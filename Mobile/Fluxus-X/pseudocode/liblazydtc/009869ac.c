/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009869ac
 */

/* ix::DNSLookup::resolve(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&, std::__ndk1::function<bool ()> const&, bool) */

void __thiscall
ix::DNSLookup::resolve
          (DNSLookup *this,basic_string_conflict *param_1,function *param_2,bool param_3)

{
  if (param_3) {
    resolveCancellable((basic_string_conflict *)this,(function *)param_1);
    return;
  }
  resolveUnCancellable((basic_string_conflict *)this,(function *)param_1);
  return;
}


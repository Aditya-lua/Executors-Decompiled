/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00976edc
 */

/* ix::HttpClient::log(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::shared_ptr<ix::HttpRequestArgs>) */

void __thiscall ix::HttpClient::log(undefined8 param_1,undefined8 param_2,long *param_3)

{
  if (*(long **)(*param_3 + 0xb0) == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00976ef0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(*param_3 + 0xb0) + 0x30))();
  return;
}


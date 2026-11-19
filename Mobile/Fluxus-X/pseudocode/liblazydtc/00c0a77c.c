/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0a77c
 */

void FUN_00c0a77c(codecvt<wchar_t,char,mbstate_t> *param_1)

{
  std::__ndk1::codecvt<wchar_t,char,mbstate_t>::~codecvt(param_1);
  operator_delete(param_1,0x28);
  return;
}


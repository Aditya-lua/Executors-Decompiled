/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0a7ac
 */

void FUN_00c0a7ac(codecvt<char,char,mbstate_t> *param_1)

{
  std::__ndk1::codecvt<char,char,mbstate_t>::~codecvt(param_1);
  operator_delete(param_1,0x20);
  return;
}


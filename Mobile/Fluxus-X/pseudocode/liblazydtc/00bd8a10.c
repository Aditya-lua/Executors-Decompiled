/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8a10
 */

void FUN_00bd8a10(undefined8 *param_1)

{
  *param_1 = &PTR_FUN_00cad200;
  *(undefined ***)(param_1 + 0x16) = &PTR_FUN_00cad228;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 1));
  std::__ndk1::ios_base::~ios_base((ios_base *)(param_1 + 0x16));
  operator_delete(param_1,0x148);
  return;
}


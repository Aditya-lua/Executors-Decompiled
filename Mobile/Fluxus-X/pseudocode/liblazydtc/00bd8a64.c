/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8a64
 */

void FUN_00bd8a64(long *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)((long)param_1 + *(long *)(*param_1 + -0x18));
  *(undefined ***)(puVar1 + 0x16) = &PTR_FUN_00cad228;
  *puVar1 = &PTR_FUN_00cad200;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(puVar1 + 1));
  std::__ndk1::ios_base::~ios_base((ios_base *)(puVar1 + 0x16));
  return;
}


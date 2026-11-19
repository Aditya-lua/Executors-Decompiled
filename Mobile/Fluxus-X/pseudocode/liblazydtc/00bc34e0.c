/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc34e0
 */

/* std::runtime_error::runtime_error(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall
std::runtime_error::runtime_error(runtime_error *this,basic_string_conflict *param_1)

{
  size_t sVar1;
  size_t *psVar2;
  basic_string_conflict *__s;
  
  *(undefined ***)this = &PTR__underflow_error_00cb0570;
  __s = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    __s = param_1 + 1;
  }
  sVar1 = strlen((char *)__s);
                    /* try { // try from 00bc3524 to 00bc352b has its CatchHandler @ 00bc3560 */
  psVar2 = operator_new(sVar1 + 0x19);
  *psVar2 = sVar1;
  psVar2[1] = sVar1;
  *(undefined4 *)(psVar2 + 2) = 0;
  memcpy(psVar2 + 3,__s,sVar1 + 1);
  *(size_t **)(this + 8) = psVar2 + 3;
  return;
}


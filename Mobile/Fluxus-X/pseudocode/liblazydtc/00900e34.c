/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900e34
 */

/* cpr::util::secureStringClear(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >&) */

void cpr::util::secureStringClear(basic_string_conflict *param_1)

{
  long lVar1;
  size_t __n;
  long lVar2;
  ulong uVar3;
  basic_string_conflict *__s;
  
  lVar2 = tpidr_el0;
  lVar2 = *(long *)(lVar2 + 0x28);
  if (((byte)*param_1 & 1) == 0) {
    uVar3 = (ulong)((byte)*param_1 >> 1);
  }
  else {
    uVar3 = *(ulong *)(param_1 + 8);
  }
  if (uVar3 != 0) {
    if (((byte)*param_1 & 1) == 0) {
      __s = param_1 + 1;
    }
    else {
      __s = *(basic_string_conflict **)(param_1 + 0x10);
    }
    if (((byte)*param_1 & 1) == 0) {
      __n = (size_t)((byte)*param_1 >> 1);
    }
    else {
      __n = *(size_t *)(param_1 + 8);
    }
    memset(__s,0,__n);
    if (((byte)*param_1 & 1) == 0) {
      param_1[1] = (basic_string_conflict)0x0;
      *param_1 = (basic_string_conflict)0x0;
    }
    else {
      **(undefined1 **)(param_1 + 0x10) = 0;
      *(undefined8 *)(param_1 + 8) = 0;
    }
  }
  lVar1 = tpidr_el0;
  if (*(long *)(lVar1 + 0x28) != lVar2) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


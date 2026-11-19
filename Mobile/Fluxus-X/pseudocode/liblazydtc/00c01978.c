/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c01978
 */

/* std::__ndk1::__codecvt_utf8_utf16<wchar_t>::do_length(mbstate_t&, char const*, char const*,
   unsigned long) const */

void __thiscall
std::__ndk1::__codecvt_utf8_utf16<wchar_t>::do_length
          (__codecvt_utf8_utf16<wchar_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          ulong param_4)

{
  FUN_00bfefc8(param_2,param_3,param_4,*(undefined8 *)(this + 0x18),*(undefined4 *)(this + 0x20));
  return;
}


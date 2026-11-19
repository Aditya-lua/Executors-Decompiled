/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bda094
 */

/* std::__ndk1::collate<char>::do_compare(char const*, char const*, char const*, char const*) const
    */

ulong __thiscall
std::__ndk1::collate<char>::do_compare
          (collate<char> *this,char *param_1,char *param_2,char *param_3,char *param_4)

{
  char *pcVar1;
  
  pcVar1 = param_1;
  if (param_3 != param_4) {
    pcVar1 = param_1 + ((long)param_4 - (long)param_3);
    do {
      if (param_1 == param_2) {
        return 0xffffffff;
      }
      if ((byte)*param_1 < (byte)*param_3) {
        return 0xffffffff;
      }
      if ((byte)*param_3 < (byte)*param_1) {
        return 1;
      }
      param_3 = param_3 + 1;
      param_1 = param_1 + 1;
    } while (param_3 != param_4);
  }
  return (ulong)(pcVar1 != param_2);
}


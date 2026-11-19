/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfdf14
 */

/* std::__ndk1::codecvt<char, char, mbstate_t>::do_out(mbstate_t&, char const*, char const*, char
   const*&, char*, char*, char*&) const */

undefined8 __thiscall
std::__ndk1::codecvt<char,char,mbstate_t>::do_out
          (codecvt<char,char,mbstate_t> *this,mbstate_t *param_1,char *param_2,char *param_3,
          char **param_4,char *param_5,char *param_6,char **param_7)

{
  *param_4 = param_2;
  *param_7 = param_5;
  return 3;
}


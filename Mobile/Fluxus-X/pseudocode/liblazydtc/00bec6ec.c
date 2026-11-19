/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bec6ec
 */

/* std::__ndk1::__time_put::__do_put(char*, char*&, tm const*, char, char) const */

void __thiscall
std::__ndk1::__time_put::__do_put
          (__time_put *this,char *param_1,char **param_2,tm *param_3,char param_4,char param_5)

{
  size_t sVar1;
  char local_24;
  char local_23;
  char local_22;
  undefined1 local_21;
  
  local_24 = '%';
  local_21 = 0;
  local_23 = param_4;
  local_22 = param_5;
  if (param_5 != '\0') {
    local_23 = param_5;
    local_22 = param_4;
  }
  sVar1 = strftime_l(param_1,(long)*param_2 - (long)param_1,&local_24,param_3,*(__locale_t *)this);
  *param_2 = param_1 + sVar1;
  return;
}


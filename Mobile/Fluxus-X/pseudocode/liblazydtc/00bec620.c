/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bec620
 */

/* std::__ndk1::time_put<char, std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char>
   > >::do_put(std::__ndk1::ostreambuf_iterator<char, std::__ndk1::char_traits<char> >,
   std::__ndk1::ios_base&, char, tm const*, char, char) const */

long * __thiscall
std::__ndk1::time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::
do_put(time_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>> *this,
      long *param_2,undefined8 param_3,undefined8 param_4,tm *param_5,char param_6,char param_7)

{
  char *pcVar1;
  char cVar2;
  int iVar3;
  size_t sVar4;
  long *plVar5;
  char *pcVar6;
  char local_94 [100];
  char local_14;
  char local_13;
  char local_12;
  undefined1 local_11;
  
  local_14 = '%';
  local_11 = 0;
  local_13 = param_6;
  local_12 = param_7;
  if (param_7 != '\0') {
    local_13 = param_7;
    local_12 = param_6;
  }
  sVar4 = strftime_l(local_94,100,&local_14,param_5,*(__locale_t *)(this + 0x10));
  if (sVar4 != 0) {
    pcVar6 = local_94;
    plVar5 = param_2;
    do {
      param_2 = plVar5;
      if (plVar5 != (long *)0x0) {
        pcVar1 = (char *)plVar5[6];
        cVar2 = *pcVar6;
        if (pcVar1 == (char *)plVar5[7]) {
          iVar3 = (**(code **)(*plVar5 + 0x68))(plVar5);
          param_2 = (long *)0x0;
          if (iVar3 != -1) {
            param_2 = plVar5;
          }
        }
        else {
          plVar5[6] = (long)(pcVar1 + 1);
          *pcVar1 = cVar2;
        }
      }
      sVar4 = sVar4 - 1;
      pcVar6 = pcVar6 + 1;
      plVar5 = param_2;
    } while (sVar4 != 0);
  }
  return param_2;
}


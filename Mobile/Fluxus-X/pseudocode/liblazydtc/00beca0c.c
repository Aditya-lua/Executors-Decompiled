/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beca0c
 */

/* std::__ndk1::time_put<wchar_t, std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_put(std::__ndk1::ostreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, wchar_t, tm const*, char, char)
   const */

long * __thiscall
std::__ndk1::
time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_put(time_put<wchar_t,std::__ndk1::ostreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
       *this,long *param_2,undefined8 param_3,undefined8 param_4,tm *param_5,char param_6,
      char param_7)

{
  wchar_t *pwVar1;
  wchar_t *pwVar2;
  wchar_t wVar3;
  long *plVar4;
  wchar_t *pwVar5;
  wchar_t *local_1c8;
  wchar_t local_1c0 [100];
  
  local_1c8 = local_1c0 + 100;
  __time_put::__do_put((__time_put *)(this + 0x10),local_1c0,&local_1c8,param_5,param_6,param_7);
  pwVar2 = local_1c8;
  if (local_1c0 != local_1c8) {
    pwVar5 = local_1c0;
    plVar4 = param_2;
    do {
      param_2 = plVar4;
      if (plVar4 != (long *)0x0) {
        pwVar1 = (wchar_t *)plVar4[6];
        wVar3 = *pwVar5;
        if (pwVar1 == (wchar_t *)plVar4[7]) {
          wVar3 = (**(code **)(*plVar4 + 0x68))(plVar4);
        }
        else {
          *pwVar1 = wVar3;
          plVar4[6] = (long)(pwVar1 + 1);
        }
        param_2 = (long *)0x0;
        if (wVar3 != L'\xffffffff') {
          param_2 = plVar4;
        }
      }
      pwVar5 = pwVar5 + 1;
      plVar4 = param_2;
    } while (pwVar5 != pwVar2);
  }
  return param_2;
}


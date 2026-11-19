/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009843b8
 */

/* ix::inet_ntop(int, void const*, char*, unsigned int) */

void ix::inet_ntop(int param_1,void *param_2,char *param_3,uint param_4)

{
  ::inet_ntop(param_1,param_2,param_3,param_4);
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009722e4
 */

void FUN_009722e4(pthread_t *param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  __thread_struct *this;
  undefined8 *__arg;
  undefined8 uVar4;
  
  this = operator_new(8);
                    /* try { // try from 00972310 to 00972313 has its CatchHandler @ 009723a4 */
  std::__ndk1::__thread_struct::__thread_struct(this);
                    /* try { // try from 00972314 to 0097231b has its CatchHandler @ 00972394 */
  __arg = operator_new(0x20);
  uVar1 = *param_2;
  uVar2 = param_2[1];
  uVar4 = *param_3;
  *__arg = this;
  __arg[1] = uVar1;
  __arg[2] = uVar2;
  __arg[3] = uVar4;
                    /* try { // try from 00972330 to 0097236b has its CatchHandler @ 0097236c */
  iVar3 = pthread_create(param_1,(pthread_attr_t *)0x0,
                         std::__ndk1::
                         __thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::HttpClient::*)(),ix::HttpClient*>>
                         ,__arg);
  if (iVar3 != 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar3,"thread constructor failed");
  }
  return;
}


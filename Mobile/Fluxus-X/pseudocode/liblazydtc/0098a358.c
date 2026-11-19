/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a358
 */

void FUN_0098a358(pthread_t *param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  __thread_struct *this;
  undefined8 *__arg;
  undefined8 uVar4;
  
  this = operator_new(8);
                    /* try { // try from 0098a384 to 0098a387 has its CatchHandler @ 0098a418 */
  std::__ndk1::__thread_struct::__thread_struct(this);
                    /* try { // try from 0098a388 to 0098a38f has its CatchHandler @ 0098a408 */
  __arg = operator_new(0x20);
  uVar1 = *param_2;
  uVar2 = param_2[1];
  uVar4 = *param_3;
  *__arg = this;
  __arg[1] = uVar1;
  __arg[2] = uVar2;
  __arg[3] = uVar4;
                    /* try { // try from 0098a3a4 to 0098a3df has its CatchHandler @ 0098a3e0 */
  iVar3 = pthread_create(param_1,(pthread_attr_t *)0x0,
                         std::__ndk1::
                         __thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::SocketServer::*)(),ix::SocketServer*>>
                         ,__arg);
  if (iVar3 != 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar3,"thread constructor failed");
  }
  return;
}


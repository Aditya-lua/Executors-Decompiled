/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a948
 */

void FUN_0098a948(pthread_t *param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined8 *param_5)

{
  long *plVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  long lVar5;
  char cVar6;
  bool bVar7;
  int iVar8;
  __thread_struct *this;
  undefined8 *__arg;
  undefined8 uVar9;
  undefined8 uVar10;
  
  this = operator_new(8);
                    /* try { // try from 0098a980 to 0098a983 has its CatchHandler @ 0098aa94 */
  std::__ndk1::__thread_struct::__thread_struct(this);
                    /* try { // try from 0098a984 to 0098a98b has its CatchHandler @ 0098aa84 */
  __arg = operator_new(0x38);
  uVar2 = *param_2;
  uVar4 = param_2[1];
  uVar9 = *param_3;
  uVar10 = *param_4;
  *param_4 = 0;
  uVar3 = *param_5;
  lVar5 = param_5[1];
  if (lVar5 != 0) {
    plVar1 = (long *)(lVar5 + 8);
    do {
      cVar6 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(plVar1,0x10);
      if (bVar7) {
        *plVar1 = *plVar1 + 1;
        cVar6 = ExclusiveMonitorsStatus();
      }
    } while (cVar6 != '\0');
  }
  *__arg = this;
  __arg[1] = uVar2;
  __arg[2] = uVar4;
  __arg[3] = uVar9;
  __arg[4] = uVar10;
  __arg[5] = uVar3;
  __arg[6] = lVar5;
                    /* try { // try from 0098a9cc to 0098aa0b has its CatchHandler @ 0098aa0c */
  iVar8 = pthread_create(param_1,(pthread_attr_t *)0x0,
                         std::__ndk1::
                         __thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::SocketServer::*)(std::__ndk1::unique_ptr<ix::Socket,std::__ndk1::default_delete<ix::Socket>>,std::__ndk1::shared_ptr<ix::ConnectionState>),ix::SocketServer*,std::__ndk1::unique_ptr<ix::Socket,std::__ndk1::default_delete<ix::Socket>>,std::__ndk1::shared_ptr<ix::ConnectionState>>>
                         ,__arg);
  if (iVar8 != 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar8,"thread constructor failed");
  }
  return;
}


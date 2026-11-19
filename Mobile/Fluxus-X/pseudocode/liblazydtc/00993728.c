/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993728
 */

/* ix::WebSocketServer::handleConnection(std::__ndk1::unique_ptr<ix::Socket,
   std::__ndk1::default_delete<ix::Socket> >, std::__ndk1::shared_ptr<ix::ConnectionState>) */

void __thiscall
ix::WebSocketServer::handleConnection(WebSocketServer *this,undefined8 *param_2,undefined8 *param_3)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *this_00;
  char cVar2;
  bool bVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  __shared_weak_count *p_Stack_48;
  long *local_40;
  long local_38;
  
  lVar4 = tpidr_el0;
  local_38 = *(long *)(lVar4 + 0x28);
  local_40 = (long *)*param_2;
  *param_2 = 0;
  local_50 = *param_3;
  this_00 = (__shared_weak_count *)param_3[1];
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
    do {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
  }
  local_60 = 0;
  uStack_58 = 0;
                    /* try { // try from 0099377c to 0099378b has its CatchHandler @ 00993808 */
  p_Stack_48 = this_00;
  handleUpgrade(this,&local_40,&local_50,&local_60);
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var1 = this_00 + 8;
    do {
      lVar6 = *(long *)p_Var1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar3) {
        *(long *)p_Var1 = lVar6 + -1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    if (lVar6 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
    }
  }
  plVar5 = local_40;
  local_40 = (long *)0x0;
  if (plVar5 != (long *)0x0) {
    (**(code **)(*plVar5 + 8))();
  }
  ConnectionState::setTerminated((ConnectionState *)*param_3);
  if (*(long *)(lVar4 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


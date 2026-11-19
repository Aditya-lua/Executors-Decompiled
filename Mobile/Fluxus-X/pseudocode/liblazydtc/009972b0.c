/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009972b0
 */

/* ix::WebSocketTransport::connectToSocket(std::__ndk1::unique_ptr<ix::Socket,
   std::__ndk1::default_delete<ix::Socket> >, int, bool, std::__ndk1::shared_ptr<ix::HttpRequest>)
    */

void ix::WebSocketTransport::connectToSocket
               (char *param_1,long param_2,long *param_3,undefined4 param_4,uint param_5,
               undefined8 *param_6)

{
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  long *plVar6;
  WebSocketPerMessageDeflate *this;
  undefined8 uVar7;
  long lVar8;
  long *plVar9;
  WebSocketPerMessageDeflate *this_00;
  undefined8 local_a0;
  __shared_weak_count *local_98;
  WebSocketHandshake aWStack_90 [40];
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(param_2 + 0xb8));
  *(undefined1 *)(param_2 + 0x18) = 0;
  *(undefined1 *)(param_2 + 0x19) = 1;
  lVar8 = *param_3;
  *param_3 = 0;
  plVar9 = (long *)(param_2 + 0xb0);
  plVar6 = (long *)*plVar9;
  *plVar9 = lVar8;
  if (plVar6 != (long *)0x0) {
    (**(code **)(*plVar6 + 8))();
  }
                    /* try { // try from 00997338 to 0099733f has its CatchHandler @ 00997524 */
  this = operator_new(0x10);
                    /* try { // try from 00997344 to 00997347 has its CatchHandler @ 00997514 */
  WebSocketPerMessageDeflate::WebSocketPerMessageDeflate(this);
  this_00 = *(WebSocketPerMessageDeflate **)(param_2 + 0x178);
  *(WebSocketPerMessageDeflate **)(param_2 + 0x178) = this;
  if (this_00 != (WebSocketPerMessageDeflate *)0x0) {
    WebSocketPerMessageDeflate::~WebSocketPerMessageDeflate(this_00);
    operator_delete(this_00);
  }
                    /* try { // try from 00997374 to 00997383 has its CatchHandler @ 00997510 */
  WebSocketHandshake::WebSocketHandshake
            (aWStack_90,(atomic *)(param_2 + 0x240),(unique_ptr *)plVar9,
             (unique_ptr *)(param_2 + 0x178),(WebSocketPerMessageDeflateOptions *)(param_2 + 0x180),
             (atomic *)(param_2 + 0x185));
  local_a0 = *param_6;
  local_98 = (__shared_weak_count *)param_6[1];
  if (local_98 != (__shared_weak_count *)0x0) {
    p_Var1 = local_98 + 8;
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar4) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
  }
                    /* try { // try from 009973ac to 009973c3 has its CatchHandler @ 009974d0 */
  WebSocketHandshake::serverHandshake(param_1,aWStack_90,param_4,param_5 & 1,&local_a0);
  p_Var1 = local_98;
  if (local_98 != (__shared_weak_count *)0x0) {
    p_Var2 = local_98 + 8;
    do {
      lVar8 = *(long *)p_Var2;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar4) {
        *(long *)p_Var2 = lVar8 + -1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (lVar8 == 0) {
      (**(code **)(*(long *)local_98 + 0x10))(local_98);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      cVar3 = *param_1;
      goto joined_r0x0099744c;
    }
  }
  cVar3 = *param_1;
joined_r0x0099744c:
  if ((cVar3 != '\0') && (*(int *)(param_2 + 0xe0) != 3)) {
                    /* try { // try from 00997400 to 00997407 has its CatchHandler @ 0099748c */
    std::__ndk1::mutex::lock((mutex *)(param_2 + 0x2b0));
    uVar7 = std::__ndk1::chrono::steady_clock::now();
    *(undefined8 *)(param_2 + 0x2d8) = uVar7;
    std::__ndk1::mutex::unlock((mutex *)(param_2 + 0x2b0));
    *(undefined1 *)(param_2 + 0x280) = 0;
    *(undefined4 *)(param_2 + 0xe0) = 3;
  }
  std::__ndk1::mutex::unlock((mutex *)(param_2 + 0xb8));
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00995c88
 */

/* ix::WebSocketTransport::~WebSocketTransport() */

void __thiscall ix::WebSocketTransport::~WebSocketTransport(WebSocketTransport *this)

{
  long lVar1;
  WebSocketTransport WVar2;
  WebSocketTransport *pWVar3;
  long *plVar4;
  void *pvVar5;
  code *pcVar6;
  long lVar7;
  WebSocketPerMessageDeflate *this_00;
  WebSocketTransport *pWVar8;
  
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x2b0));
  if (((byte)this[0x288] & 1) != 0) {
    operator_delete(*(void **)(this + 0x298));
  }
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x244));
  if (((byte)this[0x220] & 1) == 0) {
    if (((byte)this[0x200] & 1) != 0) goto LAB_00995d60;
LAB_00995ccc:
    if (((byte)this[0x1e8] & 1) != 0) goto LAB_00995d70;
LAB_00995cd4:
    if (((byte)this[0x1d0] & 1) != 0) goto LAB_00995d80;
LAB_00995cdc:
    if (((byte)this[0x1b8] & 1) != 0) goto LAB_00995d90;
LAB_00995ce4:
    if (((byte)this[0x1a0] & 1) != 0) goto LAB_00995da0;
LAB_00995cec:
    WVar2 = this[0x188];
  }
  else {
    operator_delete(*(void **)(this + 0x230));
    if (((byte)this[0x200] & 1) == 0) goto LAB_00995ccc;
LAB_00995d60:
    operator_delete(*(void **)(this + 0x210));
    if (((byte)this[0x1e8] & 1) == 0) goto LAB_00995cd4;
LAB_00995d70:
    operator_delete(*(void **)(this + 0x1f8));
    if (((byte)this[0x1d0] & 1) == 0) goto LAB_00995cdc;
LAB_00995d80:
    operator_delete(*(void **)(this + 0x1e0));
    if (((byte)this[0x1b8] & 1) == 0) goto LAB_00995ce4;
LAB_00995d90:
    operator_delete(*(void **)(this + 0x1c8));
    if (((byte)this[0x1a0] & 1) == 0) goto LAB_00995cec;
LAB_00995da0:
    operator_delete(*(void **)(this + 0x1b0));
    WVar2 = this[0x188];
  }
  if (((byte)WVar2 & 1) != 0) {
    operator_delete(*(void **)(this + 0x198));
  }
  this_00 = *(WebSocketPerMessageDeflate **)(this + 0x178);
  *(undefined8 *)(this + 0x178) = 0;
  if (this_00 != (WebSocketPerMessageDeflate *)0x0) {
    WebSocketPerMessageDeflate::~WebSocketPerMessageDeflate(this_00);
    operator_delete(this_00);
  }
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x138));
  if (((byte)this[0x120] & 1) != 0) {
    operator_delete(*(void **)(this + 0x130));
  }
  pWVar3 = *(WebSocketTransport **)(this + 0x110);
  if (this + 0xf0 == pWVar3) {
    pcVar6 = *(code **)(*(long *)pWVar3 + 0x20);
  }
  else {
    if (pWVar3 == (WebSocketTransport *)0x0) goto LAB_00995dc0;
    pcVar6 = *(code **)(*(long *)pWVar3 + 0x28);
  }
  (*pcVar6)();
LAB_00995dc0:
  std::__ndk1::mutex::~mutex((mutex *)(this + 0xb8));
  plVar4 = *(long **)(this + 0xb0);
  *(undefined8 *)(this + 0xb0) = 0;
  if (plVar4 != (long *)0x0) {
    (**(code **)(*plVar4 + 8))();
  }
  if (*(long *)(this + 0xa0) != 0) {
    lVar1 = *(long *)(this + 0x90);
    pWVar3 = *(WebSocketTransport **)(this + 0x98);
    lVar7 = *(long *)pWVar3;
    *(undefined8 *)(lVar7 + 8) = *(undefined8 *)(lVar1 + 8);
    **(long **)(lVar1 + 8) = lVar7;
    *(undefined8 *)(this + 0xa0) = 0;
    while (pWVar3 != this + 0x90) {
      pWVar8 = *(WebSocketTransport **)(pWVar3 + 8);
      if (((byte)pWVar3[0x10] & 1) != 0) {
        operator_delete(*(void **)(pWVar3 + 0x20));
      }
      operator_delete(pWVar3);
      pWVar3 = pWVar8;
    }
  }
  std::__ndk1::mutex::~mutex((mutex *)(this + 0x68));
  pvVar5 = *(void **)(this + 0x50);
  if (pvVar5 != (void *)0x0) {
    *(void **)(this + 0x58) = pvVar5;
    operator_delete(pvVar5);
  }
  pvVar5 = *(void **)(this + 0x38);
  if (pvVar5 != (void *)0x0) {
    *(void **)(this + 0x40) = pvVar5;
    operator_delete(pvVar5);
  }
  pvVar5 = *(void **)(this + 0x20);
  if (pvVar5 != (void *)0x0) {
    *(void **)(this + 0x28) = pvVar5;
    operator_delete(pvVar5);
  }
  if (((byte)*this & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(this + 0x10));
  return;
}


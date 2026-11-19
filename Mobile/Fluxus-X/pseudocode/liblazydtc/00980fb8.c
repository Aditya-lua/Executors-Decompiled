/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00980fb8
 */

/* ix::ConnectionState::computeId() */

void ix::ConnectionState::computeId(void)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  __ndk1 *this;
  long in_x0;
  ulong in_x1;
  long lVar4;
  byte *pbVar5;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  
  lVar3 = tpidr_el0;
  lVar4 = *(long *)(lVar3 + 0x28);
  do {
    this = _globalId;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(&_globalId,0x10);
    if (bVar2) {
      cVar1 = ExclusiveMonitorsStatus();
      _globalId = _globalId + 1;
    }
  } while (cVar1 != '\0');
  std::__ndk1::to_string(this,in_x1);
  pbVar5 = (byte *)(in_x0 + 0x10);
  if ((*pbVar5 & 1) == 0) {
    pbVar5[0] = 0;
    pbVar5[1] = 0;
  }
  else {
    **(undefined1 **)(in_x0 + 0x20) = 0;
    *(undefined8 *)(in_x0 + 0x18) = 0;
    if ((*(byte *)(in_x0 + 0x10) & 1) != 0) {
      operator_delete(*(void **)(in_x0 + 0x20));
      *(undefined8 *)(in_x0 + 0x10) = 0;
    }
  }
  *(undefined8 *)(in_x0 + 0x20) = local_40;
  *(undefined8 *)(in_x0 + 0x18) = uStack_48;
  *(undefined8 *)pbVar5 = local_50;
  if (*(long *)(lVar3 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


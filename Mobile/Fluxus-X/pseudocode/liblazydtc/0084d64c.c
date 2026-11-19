/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0084d64c
 */

void FUN_0084d64c(long param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  
  pbVar2 = *(byte **)(param_1 + 0x598);
  if (pbVar2 != (byte *)0x0) {
    pbVar1 = pbVar2;
    if (pbVar2 != *(byte **)(param_1 + 0x5a0)) {
      pbVar1 = *(byte **)(param_1 + 0x5a0);
      do {
        pbVar3 = pbVar1 + -0x18;
        if ((*pbVar3 & 1) != 0) {
          operator_delete(*(void **)(pbVar1 + -8),*(ulong *)(pbVar1 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar1 = pbVar3;
      } while (pbVar3 != pbVar2);
      pbVar1 = *(byte **)(param_1 + 0x598);
    }
    *(byte **)(param_1 + 0x5a0) = pbVar2;
    operator_delete(pbVar1,*(long *)(param_1 + 0x5a8) - (long)pbVar1);
  }
  std::__ndk1::mutex::~mutex((mutex *)(param_1 + 0x570));
  pbVar2 = *(byte **)(param_1 + 0x558);
  if (pbVar2 != (byte *)0x0) {
    pbVar1 = pbVar2;
    if (pbVar2 != *(byte **)(param_1 + 0x560)) {
      pbVar1 = *(byte **)(param_1 + 0x560);
      do {
        pbVar3 = pbVar1 + -0x18;
        if ((*pbVar3 & 1) != 0) {
          operator_delete(*(void **)(pbVar1 + -8),*(ulong *)(pbVar1 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar1 = pbVar3;
      } while (pbVar3 != pbVar2);
      pbVar1 = *(byte **)(param_1 + 0x558);
    }
    *(byte **)(param_1 + 0x560) = pbVar2;
    operator_delete(pbVar1,*(long *)(param_1 + 0x568) - (long)pbVar1);
  }
  std::__ndk1::mutex::~mutex((mutex *)(param_1 + 0x52c));
  if ((*(byte *)(param_1 + 0x510) & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x520),*(ulong *)(param_1 + 0x510) & 0xfffffffffffffffe);
  }
  ix::WebSocket::~WebSocket((WebSocket *)(param_1 + 0x20));
  return;
}


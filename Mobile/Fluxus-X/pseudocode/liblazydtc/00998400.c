/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00998400
 */

/* ix::WebSocketTransport::unmaskReceiveBuffer(ix::WebSocketTransport::wsheader_type const&) */

void __thiscall
ix::WebSocketTransport::unmaskReceiveBuffer(WebSocketTransport *this,wsheader_type *param_1)

{
  ulong uVar1;
  
  if ((param_1[8] != (wsheader_type)0x0) && (*(long *)(param_1 + 0x18) != 0)) {
    uVar1 = 0;
    do {
      *(byte *)(*(long *)(this + 0x38) + (ulong)*(uint *)param_1 + uVar1) =
           *(byte *)(*(long *)(this + 0x38) + (ulong)*(uint *)param_1 + uVar1) ^
           (byte)param_1[(uVar1 & 3) + 0x20];
      uVar1 = uVar1 + 1;
    } while (uVar1 != *(ulong *)(param_1 + 0x18));
  }
  return;
}


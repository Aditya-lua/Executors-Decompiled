/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9300
 */

void DTLS_RECORD_LAYER_set_saved_w_epoch(long param_1,ushort param_2)

{
  long lVar1;
  undefined8 *puVar2;
  
  lVar1 = *(long *)(param_1 + 0x10b8);
  if (*(ushort *)(lVar1 + 2) - 1 == (uint)param_2) {
    *(undefined8 *)(lVar1 + 0x60) = *(undefined8 *)(param_1 + 0x10a8);
    lVar1 = *(long *)(param_1 + 0x10b8);
    puVar2 = (undefined8 *)(lVar1 + 0x58);
  }
  else {
    if (*(ushort *)(lVar1 + 2) + 1 != (uint)param_2) goto LAB_009c9360;
    *(undefined8 *)(lVar1 + 0x58) = *(undefined8 *)(param_1 + 0x10a8);
    lVar1 = *(long *)(param_1 + 0x10b8);
    puVar2 = (undefined8 *)(lVar1 + 0x60);
  }
  *(undefined8 *)(param_1 + 0x10a8) = *puVar2;
LAB_009c9360:
  *(ushort *)(lVar1 + 2) = param_2;
  return;
}


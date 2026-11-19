/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd264
 */

void ssl_session_calculate_timeout(long param_1)

{
  long lVar1;
  uint uVar2;
  
  lVar1 = *(long *)(param_1 + 0x2d8);
  if (lVar1 < 0) {
    lVar1 = 0;
    *(undefined8 *)(param_1 + 0x2d8) = 0;
  }
  *(long *)(param_1 + 0x2e8) = lVar1 + *(long *)(param_1 + 0x2e0);
  uVar2 = (uint)((ulong)lVar1 >> 0x3f);
  if (*(long *)(param_1 + 0x2e0) < 1) {
    uVar2 = 0;
  }
  *(uint *)(param_1 + 0x2f0) = uVar2;
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac563c
 */

undefined8 ossl_sa_get(uint *param_1,ulong param_2)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  uint uVar4;
  
  if (param_1 == (uint *)0x0) {
    return 0;
  }
  uVar1 = 0;
  if ((*(long *)(param_1 + 4) != 0) && (uVar1 = 0, param_2 <= *(ulong *)(param_1 + 2))) {
    uVar4 = *param_1;
    uVar3 = (ulong)uVar4;
    lVar2 = *(long *)(param_1 + 6);
    if ((1 < (int)uVar4) && (lVar2 != 0)) {
      uVar4 = uVar4 * 4;
      do {
        uVar4 = uVar4 - 4;
        lVar2 = *(long *)(lVar2 + (param_2 >> ((ulong)uVar4 & 0x3f) & 0xf) * 8);
        if ((long)uVar3 < 3) break;
        uVar3 = uVar3 - 1;
      } while (lVar2 != 0);
    }
    uVar1 = 0;
    if (lVar2 != 0) {
      uVar1 = *(undefined8 *)(lVar2 + (param_2 & 0xf) * 8);
    }
  }
  return uVar1;
}


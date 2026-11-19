/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2e08
 */

undefined8 psa_free_key_slot(ulong param_1,ulong param_2)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  
  uVar3 = 0;
  if (param_1 != 0x16) {
    if (0x15 < param_1) {
      return 0xffffff69;
    }
    uVar4 = (&DAT_00d26028)[param_1];
    uVar3 = 0xffffff69;
    if (uVar4 <= param_2) {
      uVar2 = 0x10 << (ulong)((uint)param_1 & 0x1f);
      if (param_2 < uVar4 + (ulong)uVar2 * 0x38) {
        uVar6 = (&DAT_00d260e0)[param_1];
        lVar5 = ((long)(param_2 - uVar4) >> 3) * 0x6db6db6db6db6db7;
        (&DAT_00d260e0)[param_1] = lVar5;
        uVar1 = (uint)uVar6;
        if (uVar2 <= uVar6) {
          uVar1 = uVar2;
        }
        uVar3 = 0;
        *(uint *)(param_2 + 0x20) = ~(uint)lVar5 + uVar1;
      }
    }
  }
  return uVar3;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a11e8
 */

uint FUN_008a11e8(undefined8 param_1,byte *param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  
  uVar2 = (uint)param_1;
  uVar1 = uVar2 & 0x7f;
  if ((uVar1 != 0x7f) && (param_3 != 0)) {
    uVar1 = uVar1 - (uVar2 >> 8 & 0x7f) * (uint)*param_2;
    if (param_3 != 1) {
      uVar1 = uVar1 - (uVar2 >> 0x10 & 0x7f) * (uint)param_2[1];
      if (param_3 != 2) {
        uVar1 = uVar1 - (uVar2 >> 0x18 & 0x7f) * (uint)param_2[2];
        if (param_3 != 3) {
          uVar2 = (uint)((ulong)param_1 >> 0x20);
          uVar1 = uVar1 - (uVar2 & 0x7f) * (uint)param_2[3];
          if (param_3 != 4) {
            uVar1 = uVar1 - (uVar2 >> 8 & 0x7f) * (uint)param_2[4];
            if (param_3 != 5) {
              uVar1 = uVar1 - ((ushort)((ulong)param_1 >> 0x30) & 0x7f) * (uint)param_2[5];
              if (param_3 != 6) {
                uVar1 = uVar1 - ((byte)((ulong)param_1 >> 0x38) & 0x7f) * (uint)param_2[6];
              }
            }
          }
        }
      }
    }
  }
  return uVar1;
}


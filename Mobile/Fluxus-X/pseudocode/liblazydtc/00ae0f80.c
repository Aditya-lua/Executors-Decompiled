/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae0f80
 */

void SHA3_squeeze(long param_1,undefined1 *param_2,ulong param_3,ulong param_4)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  
  if (param_3 != 0) {
    do {
      bVar1 = param_3 != 0;
      if ((param_3 != 0) && (param_4 >> 3 != 0)) {
        uVar2 = 0;
        do {
          uVar3 = *(ulong *)(param_1 + uVar2 * 8);
          if (param_3 < 8) {
            uVar2 = 0;
            do {
              param_2[uVar2] = (char)uVar3;
              uVar2 = uVar2 + 1;
              uVar3 = uVar3 >> 8;
            } while (param_3 != uVar2);
            return;
          }
          param_2[1] = (char)(uVar3 >> 8);
          param_2[2] = (char)(uVar3 >> 0x10);
          param_2[3] = (char)(uVar3 >> 0x18);
          param_2[4] = (char)(uVar3 >> 0x20);
          *param_2 = (char)uVar3;
          param_2[5] = (char)(uVar3 >> 0x28);
          param_3 = param_3 - 8;
          bVar1 = param_3 != 0;
          param_2[6] = (char)(uVar3 >> 0x30);
          param_2[7] = (char)(uVar3 >> 0x38);
          param_2 = param_2 + 8;
        } while ((bVar1) && (uVar2 = uVar2 + 1, uVar2 < param_4 >> 3));
      }
      if (bVar1) {
        FUN_00ae0ddc(param_1);
      }
    } while (param_3 != 0);
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00960bb4
 */

ulong FUN_00960bb4(byte *param_1,undefined1 *param_2,undefined8 param_3,byte param_4)

{
  ulong uVar1;
  byte bVar2;
  ulong uVar3;
  
  if (param_2 != (undefined1 *)0x0) {
    *param_2 = 0;
  }
  if ((byte)((*param_1 & 0xdf) + 0xbf) < 0x1a) {
    uVar3 = 1;
    while( true ) {
      bVar2 = param_1[uVar3];
      if (bVar2 == 0) break;
      if (((0x19 < (byte)((bVar2 & 0xdf) + 0xbf)) && (9 < (byte)(bVar2 - 0x30))) &&
         ((0x2e < bVar2 || ((1L << ((ulong)bVar2 & 0x3f) & 0x680000000000U) == 0))))
      goto LAB_00960c48;
      uVar3 = uVar3 + 1;
      if (0x27 < uVar3) {
        bVar2 = param_1[uVar3];
LAB_00960c48:
        if (bVar2 != 0x3a) {
          return 0;
        }
        uVar1 = 0;
        if ((param_1[uVar3 + 1] != 0x2f & param_4) == 0) {
          uVar1 = uVar3;
        }
        if ((param_1[uVar3 + 1] != 0x2f & param_4) != 0) {
          return uVar1;
        }
        if (param_2 == (undefined1 *)0x0) {
          return uVar1;
        }
        FUN_00941848(param_2,param_1,uVar3);
        param_2[uVar3] = 0;
        return uVar3;
      }
    }
  }
  return 0;
}


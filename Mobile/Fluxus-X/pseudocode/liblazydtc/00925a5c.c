/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00925a5c
 */

undefined8 FUN_00925a5c(short *param_1)

{
  uint uVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (*param_1 == 10) {
    if ((*(byte *)(param_1 + 4) & 0xfe) == 0xfc) {
      return 3;
    }
    uVar1 = *(byte *)((long)param_1 + 9) & 0xc0 | (uint)*(byte *)(param_1 + 4) << 8;
    if (uVar1 == 0) {
      uVar2 = 0;
      if (((((((((((((((char)param_1[5] == '\0' && *(byte *)((long)param_1 + 9) == 0) &&
                     *(char *)((long)param_1 + 0xb) == '\0') && (char)param_1[6] == '\0') &&
                   *(char *)((long)param_1 + 0xd) == '\0') && (char)param_1[7] == '\0') &&
                 *(char *)((long)param_1 + 0xf) == '\0') && (char)param_1[8] == '\0') &&
               *(char *)((long)param_1 + 0x11) == '\0') && (char)param_1[9] == '\0') &&
             *(char *)((long)param_1 + 0x13) == '\0') && (char)param_1[10] == '\0') &&
           *(char *)((long)param_1 + 0x15) == '\0') && (char)param_1[0xb] == '\0') &&
         (uVar2 = 0, *(char *)((long)param_1 + 0x17) == '\x01')) {
        uVar2 = 4;
      }
    }
    else {
      if (uVar1 == 0xfe80) {
        return 1;
      }
      uVar2 = 0;
      if (uVar1 == 0xfec0) {
        return 2;
      }
    }
  }
  return uVar2;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc172c
 */

ulong FUN_00bc172c(ulong *param_1,byte *param_2,ulong param_3)

{
  int iVar1;
  ulong uVar2;
  
  if (param_3 == 0) {
    param_1[4] = 0;
    param_1[1] = 0;
    *param_1 = 0;
    param_1[3] = 0;
    param_1[2] = 0;
    return 0xffffffffffffffb8;
  }
  param_1[3] = (ulong)param_2;
  param_1[4] = (ulong)(param_2 + 8);
  if (7 < param_3) {
    uVar2 = *(ulong *)(param_2 + (param_3 - 8));
    param_1[2] = (ulong)(param_2 + (param_3 - 8));
    *param_1 = uVar2;
    if (param_2[param_3 - 1] == 0) {
      *(undefined4 *)(param_1 + 1) = 0;
      return 0xffffffffffffffff;
    }
    iVar1 = 8 - ((uint)LZCOUNT((uint)param_2[param_3 - 1]) ^ 0x1f);
    goto LAB_00bc1828;
  }
  param_1[2] = (ulong)param_2;
  uVar2 = (ulong)*param_2;
  *param_1 = uVar2;
  if ((long)param_3 < 5) {
    if (param_3 == 2) goto LAB_00bc1804;
    if (param_3 == 3) goto LAB_00bc17f8;
    if (param_3 == 4) goto LAB_00bc17ec;
  }
  else {
    if (param_3 != 5) {
      if (param_3 != 6) {
        if (param_3 != 7) goto LAB_00bc1810;
        uVar2 = uVar2 | (ulong)param_2[6] << 0x30;
        *param_1 = uVar2;
      }
      uVar2 = uVar2 + ((ulong)param_2[5] << 0x28);
      *param_1 = uVar2;
    }
    uVar2 = uVar2 + ((ulong)param_2[4] << 0x20);
    *param_1 = uVar2;
LAB_00bc17ec:
    uVar2 = uVar2 + (ulong)param_2[3] * 0x1000000;
    *param_1 = uVar2;
LAB_00bc17f8:
    uVar2 = uVar2 + (ulong)param_2[2] * 0x10000;
    *param_1 = uVar2;
LAB_00bc1804:
    *param_1 = uVar2 + (ulong)param_2[1] * 0x100;
  }
LAB_00bc1810:
  if (param_2[param_3 - 1] == 0) {
    *(undefined4 *)(param_1 + 1) = 0;
    return 0xffffffffffffffec;
  }
  iVar1 = (int)LZCOUNT((uint)param_2[param_3 - 1]) + (int)param_3 * -8 + 0x29;
LAB_00bc1828:
  *(int *)(param_1 + 1) = iVar1;
  return param_3;
}


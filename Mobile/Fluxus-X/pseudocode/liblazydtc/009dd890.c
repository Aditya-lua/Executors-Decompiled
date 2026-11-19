/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dd890
 */

undefined8 ossl_statem_client_max_message_size(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  switch(param_1[0x17]) {
  case 2:
    return 0x102;
  case 3:
    return 0x10047;
  case 4:
    return *(undefined8 *)(param_1 + 0x280);
  case 5:
  case 0x27:
    return 0x4000;
  case 6:
    return 0x19000;
  case 7:
    return *(undefined8 *)(param_1 + 0x280);
  case 9:
    uVar2 = 0x10005;
    if (((*(byte *)(*(long *)(*(int **)(param_1 + 2) + 0x30) + 0x60) >> 3 & 1) == 0) &&
       (iVar1 = **(int **)(param_1 + 2), 0x303 < iVar1)) {
      if (iVar1 != 0x10000) {
        uVar2 = 0x2010a;
      }
      return uVar2;
    }
    break;
  case 10:
    uVar2 = 3;
    if (*param_1 != 0x100) {
      uVar2 = 1;
    }
    return uVar2;
  case 0xb:
    return 0x40;
  case 0x26:
    return 20000;
  case 0x2d:
    uVar2 = 1;
  }
  return uVar2;
}


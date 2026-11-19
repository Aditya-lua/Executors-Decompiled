/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b61bc
 */

void FUN_008b61bc(long param_1,byte *param_2)

{
  byte bVar1;
  byte bVar2;
  code *pcVar3;
  byte *pbVar4;
  undefined8 uVar5;
  
  while( true ) {
    bVar1 = *param_2;
    bVar2 = param_2[2] & 0xfc;
    param_2[2] = bVar2;
    if (bVar1 != 8) break;
    if (DAT_00d1f4b8 == '\x01') {
      param_2[2] = bVar2 | 4;
      if ((-1 < (long)(char)param_2[3]) &&
         (pcVar3 = *(code **)(param_1 + 0x4448 + (long)(char)param_2[3] * 8), pcVar3 != (code *)0x0)
         ) {
        (*pcVar3)(*(undefined8 *)(param_1 + 0x1e0),param_2 + 0x10);
      }
      param_2 = *(byte **)(param_2 + 8);
      if (param_2 == (byte *)0x0) {
        return;
      }
      bVar2 = param_2[2];
    }
    else {
      pbVar4 = *(byte **)(param_2 + 8);
      param_2[2] = bVar2 | 4;
      if (pbVar4 == (byte *)0x0) {
        return;
      }
      bVar2 = pbVar4[2];
      param_2 = pbVar4;
    }
    if ((bVar2 & 3) == 0) {
      return;
    }
  }
  if (bVar1 < 10) {
    if (bVar1 < 6) {
      if ((bVar1 != 4) && (bVar1 != 5)) {
        return;
      }
LAB_008b6338:
      param_2[2] = bVar2 | 4;
      return;
    }
    if (bVar1 == 6) {
      uVar5 = *(undefined8 *)(param_1 + 0x58);
      *(byte **)(param_1 + 0x58) = param_2;
      *(undefined8 *)(param_2 + 0x18) = uVar5;
      return;
    }
    if (bVar1 != 7) {
      if (bVar1 == 9) {
        uVar5 = *(undefined8 *)(param_1 + 0x58);
        *(byte **)(param_1 + 0x58) = param_2;
        *(undefined8 *)(param_2 + 0x38) = uVar5;
        return;
      }
      return;
    }
  }
  else if (bVar1 < 0xc) {
    if (bVar1 == 10) goto LAB_008b6338;
    if (bVar1 != 0xb) {
      return;
    }
  }
  else if (bVar1 != 0xc) {
    if (bVar1 == 0xe) {
      uVar5 = *(undefined8 *)(param_1 + 0x58);
      *(byte **)(param_1 + 0x58) = param_2;
      *(undefined8 *)(param_2 + 0x20) = uVar5;
      return;
    }
    if (bVar1 != 0xf) {
      return;
    }
    pbVar4 = *(byte **)(param_2 + 8);
    if ((4 < *(int *)(pbVar4 + 0xc)) && ((*(byte *)(*(long *)pbVar4 + 2) & 3) != 0)) {
      FUN_008b61bc(param_1);
      pbVar4 = *(byte **)(param_2 + 8);
    }
    if (pbVar4 == param_2 + 0x10) {
      param_2[2] = param_2[2] | 4;
      return;
    }
    return;
  }
  uVar5 = *(undefined8 *)(param_1 + 0x58);
  *(byte **)(param_1 + 0x58) = param_2;
  *(undefined8 *)(param_2 + 8) = uVar5;
  return;
}


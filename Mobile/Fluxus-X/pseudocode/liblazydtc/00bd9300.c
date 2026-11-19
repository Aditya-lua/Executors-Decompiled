/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd9300
 */

uint FUN_00bd9300(long param_1,ulong param_2)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined1 auStack_60 [8];
  undefined1 auStack_58 [12];
  byte local_4c [3];
  byte local_49 [9];
  
  if (*(char *)(param_1 + 0x60) == '\x01') {
    uVar1 = *(uint *)(param_1 + 0x5c);
    if ((param_2 & 1) != 0) {
      *(undefined1 *)(param_1 + 0x60) = 0;
      *(undefined4 *)(param_1 + 0x5c) = 0xffffffff;
    }
  }
  else if (*(char *)(param_1 + 0x61) == '\x01') {
    uVar1 = getc(*(FILE **)(param_1 + 0x40));
    if (uVar1 != 0xffffffff) {
      uVar1 = uVar1 & 0xff;
      if ((param_2 & 1) == 0) {
        iVar2 = ungetc(uVar1,*(FILE **)(param_1 + 0x40));
        if (iVar2 == -1) {
          uVar1 = 0xffffffff;
        }
      }
      else {
        *(uint *)(param_1 + 0x5c) = uVar1;
      }
    }
  }
  else {
    uVar1 = *(uint *)(param_1 + 0x58);
    uVar4 = 0;
    if ((int)uVar1 < 2) {
      uVar1 = 1;
    }
    uVar3 = (ulong)uVar1;
    do {
      iVar2 = getc(*(FILE **)(param_1 + 0x40));
      if (iVar2 == -1) {
        return 0xffffffff;
      }
      local_49[uVar4 + 1] = (byte)iVar2;
      uVar4 = uVar4 + 1;
    } while (uVar3 != uVar4);
    while( true ) {
      uVar5 = **(undefined8 **)(param_1 + 0x50);
      iVar2 = (**(code **)(**(long **)(param_1 + 0x48) + 0x20))
                        (*(long **)(param_1 + 0x48),*(undefined8 **)(param_1 + 0x50),local_49 + 1,
                         local_49 + uVar3 + 1,auStack_58,local_4c,(ulong)local_4c | 1,auStack_60);
      if (iVar2 != 1) break;
      **(undefined8 **)(param_1 + 0x50) = uVar5;
      if (uVar3 == 8) goto LAB_00bd9450;
      iVar2 = getc(*(FILE **)(param_1 + 0x40));
      if (iVar2 == -1) {
        return 0xffffffff;
      }
      local_49[uVar3 + 1] = (byte)iVar2;
      uVar3 = uVar3 + 1;
    }
    if (iVar2 == 2) {
LAB_00bd9450:
      uVar1 = 0xffffffff;
    }
    else {
      if (iVar2 == 3) {
        local_4c[0] = local_49[1];
      }
      if ((param_2 & 1) == 0) {
        uVar4 = uVar3 & 0xffffffff;
        do {
          if ((long)uVar4 < 1) {
            return (uint)local_4c[0];
          }
          iVar2 = ungetc((uint)local_49[uVar4],*(FILE **)(param_1 + 0x40));
          uVar4 = uVar4 - 1;
        } while (iVar2 != -1);
        uVar1 = 0xffffffff;
      }
      else {
        uVar1 = (uint)local_4c[0];
        *(uint *)(param_1 + 0x5c) = (uint)local_4c[0];
      }
    }
  }
  return uVar1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd9a94
 */

wint_t FUN_00bd9a94(long param_1,ulong param_2)

{
  uint uVar1;
  wint_t __wc;
  int iVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined1 auStack_60 [8];
  undefined1 auStack_58 [12];
  undefined4 local_4c;
  byte local_48 [8];
  
  if (*(char *)(param_1 + 0x60) == '\x01') {
    local_4c = *(wint_t *)(param_1 + 0x5c);
    if ((param_2 & 1) != 0) {
      *(undefined1 *)(param_1 + 0x60) = 0;
      *(undefined4 *)(param_1 + 0x5c) = 0xffffffff;
    }
  }
  else if (*(char *)(param_1 + 0x61) == '\x01') {
    __wc = getwc(*(__FILE **)(param_1 + 0x40));
    local_4c = __wc;
    if (__wc != 0xffffffff) {
      if ((param_2 & 1) == 0) {
        local_4c = ungetwc(__wc,*(__FILE **)(param_1 + 0x40));
        if (local_4c != 0xffffffff) {
          local_4c = __wc;
        }
      }
      else {
        *(wint_t *)(param_1 + 0x5c) = __wc;
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
      local_48[uVar4] = (byte)iVar2;
      uVar4 = uVar4 + 1;
    } while (uVar3 != uVar4);
    while( true ) {
      uVar5 = **(undefined8 **)(param_1 + 0x50);
      iVar2 = (**(code **)(**(long **)(param_1 + 0x48) + 0x20))
                        (*(long **)(param_1 + 0x48),*(undefined8 **)(param_1 + 0x50),local_48,
                         local_48 + uVar3,auStack_58,&local_4c,local_48,auStack_60);
      if (iVar2 != 1) break;
      **(undefined8 **)(param_1 + 0x50) = uVar5;
      if (uVar3 == 8) goto LAB_00bd9be4;
      iVar2 = getc(*(FILE **)(param_1 + 0x40));
      if (iVar2 == -1) {
        return 0xffffffff;
      }
      local_48[uVar3] = (byte)iVar2;
      uVar3 = uVar3 + 1;
    }
    if (iVar2 == 2) {
LAB_00bd9be4:
      local_4c = 0xffffffff;
    }
    else {
      if (iVar2 == 3) {
        local_4c = (wint_t)local_48[0];
      }
      if ((param_2 & 1) == 0) {
        uVar4 = uVar3 & 0xffffffff;
        do {
          if ((long)uVar4 < 1) {
            return local_4c;
          }
          iVar2 = ungetc((uint)local_48[uVar4 - 1],*(FILE **)(param_1 + 0x40));
          uVar4 = uVar4 - 1;
        } while (iVar2 != -1);
        local_4c = 0xffffffff;
      }
      else {
        *(wint_t *)(param_1 + 0x5c) = local_4c;
      }
    }
  }
  return local_4c;
}


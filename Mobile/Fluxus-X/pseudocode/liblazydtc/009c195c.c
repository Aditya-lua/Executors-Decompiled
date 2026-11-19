/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c195c
 */

undefined8 tls1_check_group_id(long param_1,uint param_2,int param_3)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined4 uVar4;
  undefined2 *puVar5;
  ushort *puVar6;
  ushort *puVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 local_24;
  undefined1 local_23;
  
  if ((param_2 & 0xffff) == 0) {
    return 0;
  }
  local_23 = (undefined1)param_2;
  uVar1 = *(uint *)(*(long *)(param_1 + 0x898) + 0x1c) & 0x30000;
  if ((uVar1 != 0) && (*(long *)(param_1 + 0x2e0) != 0)) {
    iVar2 = *(int *)(*(long *)(param_1 + 0x2e0) + 0x18);
    if (iVar2 == 0x300c02c) {
      if ((param_2 & 0xffff) != 0x18) {
        return 0;
      }
    }
    else {
      if (iVar2 != 0x300c02b) {
        return 0;
      }
      if ((param_2 & 0xffff) != 0x17) {
        return 0;
      }
    }
  }
  if (param_3 == 0) goto LAB_009c1a44;
  puVar5 = &DAT_0074cd84;
  if (uVar1 == 0x30000) {
    uVar8 = 2;
  }
  else {
    if (uVar1 == 0x20000) {
      puVar5 = &DAT_0074cd86;
    }
    else {
      if (uVar1 != 0x10000) {
        puVar5 = *(undefined2 **)(param_1 + 0xac8);
        if (puVar5 == (undefined2 *)0x0) {
          puVar5 = *(undefined2 **)(*(long *)(param_1 + 0x9a8) + 0x288);
          uVar8 = *(ulong *)(*(long *)(param_1 + 0x9a8) + 0x290);
        }
        else {
          uVar8 = *(ulong *)(param_1 + 0xac0);
        }
        if (uVar8 == 0) {
          return 0;
        }
        goto LAB_009c1a24;
      }
      puVar5 = &DAT_0074cd84;
    }
    uVar8 = 1;
  }
LAB_009c1a24:
  uVar9 = 0;
  while ((uint)(ushort)puVar5[uVar9] != (param_2 & 0xffff)) {
    uVar9 = uVar9 + 1;
    if (uVar8 <= uVar9) {
      return 0;
    }
  }
LAB_009c1a44:
  uVar8 = *(ulong *)(*(long *)(param_1 + 0x9a8) + 0x630);
  if (uVar8 == 0) {
    return 0;
  }
  uVar9 = 0;
  puVar6 = (ushort *)(*(long *)(*(long *)(param_1 + 0x9a8) + 0x628) + 0x1c);
  while ((uint)*puVar6 != (param_2 & 0xffff)) {
    uVar9 = uVar9 + 1;
    puVar6 = puVar6 + 0x1c;
    if (uVar8 <= uVar9) {
      return 0;
    }
  }
  if (puVar6 == (ushort *)0x1c) {
    return 0;
  }
  local_24 = (undefined1)(param_2 >> 8);
  uVar8 = 0;
  puVar7 = &DAT_0074cc38;
  do {
    if ((uint)*puVar7 == (param_2 & 0xffff)) {
      uVar4 = *(undefined4 *)(puVar7 + -2);
      goto LAB_009c1ae4;
    }
    uVar8 = uVar8 + 1;
    puVar7 = puVar7 + 4;
  } while (uVar8 < 0x2a);
  uVar4 = 0;
LAB_009c1ae4:
  uVar3 = ssl_security(param_1,0x20006,*(undefined4 *)(puVar6 + -2),uVar4,&local_24);
  if ((int)uVar3 == 0) {
    return uVar3;
  }
  if ((*(int *)(param_1 + 0x38) != 0) && (*(ulong *)(param_1 + 0xad0) != 0)) {
    uVar8 = 0;
    while ((uint)*(ushort *)(*(long *)(param_1 + 0xad8) + uVar8 * 2) != (param_2 & 0xffff)) {
      uVar8 = uVar8 + 1;
      if (*(ulong *)(param_1 + 0xad0) <= uVar8) {
        return 0;
      }
    }
  }
  return 1;
}


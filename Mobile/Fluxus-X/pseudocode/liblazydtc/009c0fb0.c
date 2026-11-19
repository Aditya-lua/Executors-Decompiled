/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0fb0
 */

byte tls_valid_group(long param_1,short param_2,int param_3,int param_4,int param_5,uint *param_6)

{
  int iVar1;
  int iVar2;
  int iVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  char *__s1;
  bool bVar9;
  
  uVar7 = *(ulong *)(*(long *)(param_1 + 0x9a8) + 0x630);
  if (uVar7 != 0) {
    lVar6 = *(long *)(*(long *)(param_1 + 0x9a8) + 0x628);
    uVar8 = 0;
    do {
      if (*(short *)(lVar6 + 0x1c) == param_2) goto LAB_009c0fe4;
      uVar8 = uVar8 + 1;
      lVar6 = lVar6 + 0x38;
    } while (uVar8 < uVar7);
  }
  lVar6 = 0;
LAB_009c0fe4:
  if (param_6 != (uint *)0x0) {
    *param_6 = 0;
  }
  if (lVar6 == 0) {
    return 0;
  }
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
    iVar5 = *(int *)(lVar6 + 0x20);
    if (iVar5 < 0) {
      return 0;
    }
    iVar3 = *(int *)(lVar6 + 0x24);
    if (iVar3 < 0) {
      return 0;
    }
    bVar9 = (iVar5 <= param_4 || iVar5 < 1) && (iVar3 == 0 || param_3 <= iVar3);
    if (((param_4 == 0x304) && (param_6 != (uint *)0x0)) &&
       ((iVar5 <= param_4 || iVar5 < 1) && (iVar3 == 0 || param_3 <= iVar3))) {
      *param_6 = (uint)(iVar3 == 0 || 0x303 < iVar3);
    }
  }
  else {
    iVar5 = *(int *)(lVar6 + 0x28);
    if (iVar5 < 0) {
      return 0;
    }
    iVar3 = *(int *)(lVar6 + 0x2c);
    if (iVar3 < 0) {
      return 0;
    }
    if (iVar3 == 0) {
      bVar9 = true;
    }
    else {
      iVar2 = 0xff00;
      if (param_3 != 0x100) {
        iVar2 = param_3;
      }
      iVar1 = 0xff00;
      if (iVar3 != 0x100) {
        iVar1 = iVar3;
      }
      bVar9 = iVar1 <= iVar2;
    }
    if (0 < iVar5) {
      iVar3 = 0xff00;
      if (param_4 != 0x100) {
        iVar3 = param_4;
      }
      iVar2 = 0xff00;
      if (iVar5 != 0x100) {
        iVar2 = iVar5;
      }
      bVar9 = (bool)(bVar9 & iVar3 <= iVar2);
    }
  }
  if (param_5 != 0) {
    __s1 = *(char **)(lVar6 + 0x10);
    iVar5 = strcmp(__s1,"EC");
    if ((iVar5 != 0) && (iVar5 = strcmp(__s1,"X25519"), iVar5 != 0)) {
      iVar5 = strcmp(__s1,"X448");
      bVar4 = iVar5 == 0;
      goto LAB_009c1128;
    }
  }
  bVar4 = true;
LAB_009c1128:
  return bVar4 & bVar9;
}


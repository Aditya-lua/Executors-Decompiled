/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af6c48
 */

uint FUN_00af6c48(long param_1,long param_2,int param_3)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  
  lVar8 = (long)param_3;
  if (param_3 < 1) {
    uVar7 = 0;
  }
  else {
    uVar7 = 0;
    do {
      if (*(char *)(param_1 + uVar7) != *(char *)(param_2 + uVar7)) break;
      uVar7 = uVar7 + 1;
    } while ((long)uVar7 < lVar8);
  }
  do {
    iVar5 = param_3;
    lVar9 = lVar8 + -1;
    if ((lVar8 < 1) || (*(char *)(param_1 + lVar9) != '\0')) break;
    param_3 = iVar5 + -1;
    lVar8 = lVar9;
  } while (*(char *)(param_2 + lVar9) == -1);
  iVar6 = (int)uVar7;
  if (iVar6 < iVar5 + -1) {
    return 0xffffffff;
  }
  if (iVar5 <= iVar6) {
    return iVar6 << 3;
  }
  bVar1 = *(byte *)(param_1 + (uVar7 & 0xffffffff));
  bVar2 = *(byte *)(param_2 + (uVar7 & 0xffffffff));
  uVar4 = 0xffffffff;
  bVar3 = bVar2 ^ bVar1;
  uVar10 = 7;
  switch(bVar3) {
  case 1:
    break;
  case 2:
  case 4:
  case 5:
  case 6:
  case 8:
  case 9:
  case 10:
  case 0xb:
  case 0xc:
  case 0xd:
  case 0xe:
  case 0x10:
  case 0x11:
  case 0x12:
  case 0x13:
  case 0x14:
  case 0x15:
  case 0x16:
  case 0x17:
  case 0x18:
  case 0x19:
  case 0x1a:
  case 0x1b:
  case 0x1c:
  case 0x1d:
  case 0x1e:
    goto switchD_00af6cfc_caseD_2;
  case 3:
    uVar10 = 6;
    break;
  case 7:
    uVar10 = 5;
    break;
  case 0xf:
    uVar10 = 4;
    break;
  case 0x1f:
    uVar10 = 3;
    break;
  default:
    if (bVar3 == 0x3f) {
      uVar10 = 2;
    }
    else {
      if (bVar3 != 0x7f) {
        return 0xffffffff;
      }
      uVar10 = 1;
    }
  }
  uVar4 = 0xffffffff;
  if (((bVar3 & bVar1) == 0) && ((bVar3 & bVar2) == bVar3)) {
    uVar4 = uVar10 | iVar6 << 3;
  }
switchD_00af6cfc_caseD_2:
  return uVar4;
}


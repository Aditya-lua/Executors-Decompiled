
void FUN_006b4050(long param_1)

{
  uint uVar1;
  int iVar2;
  uint *puVar3;
  uint uVar4;
  uint uVar5;
  uint *puVar6;
  long lVar7;
  uint uVar8;
  
  if (*(char *)(param_1 + 0xb8) == '\0') {
    puVar6 = *(uint **)(param_1 + 0x88);
    puVar3 = *(uint **)(param_1 + 0x90);
    if (puVar6 != puVar3) {
      lVar7 = *(long *)(param_1 + 0x28);
      do {
        uVar4 = *puVar6;
        uVar5 = *(uint *)(lVar7 + (ulong)uVar4 * 4);
        uVar1 = uVar4 + ((int)uVar5 >> 0x10) + 1;
        uVar8 = *(uint *)(lVar7 + (ulong)uVar1 * 4);
        while ((uVar8 & 0x800000ff) == 0x17) {
          uVar1 = uVar1 + (uVar8 >> 0x10) + 1;
          uVar8 = *(uint *)(lVar7 + (ulong)uVar1 * 4);
        }
        if ((uVar5 & 0xff) == 0x17 && (uVar8 & 0xff) == 0x16) {
LAB_006b4070:
          *(uint *)(lVar7 + (ulong)uVar4 * 4) = uVar8;
        }
        else {
          iVar2 = uVar1 + ~uVar4;
          if (iVar2 == (short)iVar2) {
            uVar8 = uVar5 & 0xffff | iVar2 * 0x10000;
            goto LAB_006b4070;
          }
        }
        puVar6[1] = uVar1;
        puVar6 = puVar6 + 2;
      } while (puVar6 != puVar3);
    }
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095990c
 */

int FUN_0095990c(char *param_1,long param_2)

{
  char cVar1;
  int iVar2;
  size_t sVar3;
  undefined1 *puVar4;
  char *pcVar5;
  undefined **ppuVar6;
  ulong uVar7;
  char *pcVar8;
  char *pcVar9;
  long lVar10;
  ulong uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  sVar3 = strlen(param_1);
  if (-1 < (long)sVar3) {
    if (sVar3 == 0) {
      ppuVar6 = &PTR_strdup_00cc4688;
      puVar4 = &DAT_002ab32c;
    }
    else {
      ppuVar6 = &PTR_malloc_00cc4670;
      puVar4 = (undefined1 *)(sVar3 << 1);
    }
    pcVar5 = (char *)(*(code *)*ppuVar6)(puVar4);
    if (pcVar5 != (char *)0x0) {
      if (sVar3 != 0) {
        uVar7 = 0;
        if (0x1f < sVar3) {
          uVar7 = sVar3 - 1;
          if (((CARRY8(uVar7 * 2,(ulong)pcVar5)) || (CARRY8(uVar7,uVar7))) ||
             (CARRY8(uVar7 * 2,(ulong)(pcVar5 + 1)))) {
            uVar7 = 0;
          }
          else if ((param_1 + sVar3 <= pcVar5) || (uVar7 = 0, pcVar5 + sVar3 * 2 <= param_1)) {
            uVar7 = sVar3 & 0xffffffffffffffe0;
            pcVar9 = pcVar5 + 0x20;
            pcVar8 = param_1 + 0x10;
            uVar11 = uVar7;
            do {
              uVar13 = *(undefined8 *)(pcVar8 + -8);
              uVar12 = *(undefined8 *)(pcVar8 + -0x10);
              uVar15 = *(undefined8 *)(pcVar8 + 8);
              uVar14 = *(undefined8 *)pcVar8;
              uVar11 = uVar11 - 0x20;
              pcVar8 = pcVar8 + 0x20;
              pcVar9[-0x20] = (char)uVar12;
              pcVar9[-0x1f] = '\0';
              pcVar9[-0x1e] = (char)((ulong)uVar12 >> 8);
              pcVar9[-0x1d] = '\0';
              pcVar9[-0x1c] = (char)((ulong)uVar12 >> 0x10);
              pcVar9[-0x1b] = '\0';
              pcVar9[-0x1a] = (char)((ulong)uVar12 >> 0x18);
              pcVar9[-0x19] = '\0';
              pcVar9[-0x18] = (char)((ulong)uVar12 >> 0x20);
              pcVar9[-0x17] = '\0';
              pcVar9[-0x16] = (char)((ulong)uVar12 >> 0x28);
              pcVar9[-0x15] = '\0';
              pcVar9[-0x14] = (char)((ulong)uVar12 >> 0x30);
              pcVar9[-0x13] = '\0';
              pcVar9[-0x12] = (char)((ulong)uVar12 >> 0x38);
              pcVar9[-0x11] = '\0';
              pcVar9[-0x10] = (char)uVar13;
              pcVar9[-0xf] = '\0';
              pcVar9[-0xe] = (char)((ulong)uVar13 >> 8);
              pcVar9[-0xd] = '\0';
              pcVar9[-0xc] = (char)((ulong)uVar13 >> 0x10);
              pcVar9[-0xb] = '\0';
              pcVar9[-10] = (char)((ulong)uVar13 >> 0x18);
              pcVar9[-9] = '\0';
              pcVar9[-8] = (char)((ulong)uVar13 >> 0x20);
              pcVar9[-7] = '\0';
              pcVar9[-6] = (char)((ulong)uVar13 >> 0x28);
              pcVar9[-5] = '\0';
              pcVar9[-4] = (char)((ulong)uVar13 >> 0x30);
              pcVar9[-3] = '\0';
              pcVar9[-2] = (char)((ulong)uVar13 >> 0x38);
              pcVar9[-1] = '\0';
              *pcVar9 = (char)uVar14;
              pcVar9[1] = '\0';
              pcVar9[2] = (char)((ulong)uVar14 >> 8);
              pcVar9[3] = '\0';
              pcVar9[4] = (char)((ulong)uVar14 >> 0x10);
              pcVar9[5] = '\0';
              pcVar9[6] = (char)((ulong)uVar14 >> 0x18);
              pcVar9[7] = '\0';
              pcVar9[8] = (char)((ulong)uVar14 >> 0x20);
              pcVar9[9] = '\0';
              pcVar9[10] = (char)((ulong)uVar14 >> 0x28);
              pcVar9[0xb] = '\0';
              pcVar9[0xc] = (char)((ulong)uVar14 >> 0x30);
              pcVar9[0xd] = '\0';
              pcVar9[0xe] = (char)((ulong)uVar14 >> 0x38);
              pcVar9[0xf] = '\0';
              pcVar9[0x10] = (char)uVar15;
              pcVar9[0x11] = '\0';
              pcVar9[0x12] = (char)((ulong)uVar15 >> 8);
              pcVar9[0x13] = '\0';
              pcVar9[0x14] = (char)((ulong)uVar15 >> 0x10);
              pcVar9[0x15] = '\0';
              pcVar9[0x16] = (char)((ulong)uVar15 >> 0x18);
              pcVar9[0x17] = '\0';
              pcVar9[0x18] = (char)((ulong)uVar15 >> 0x20);
              pcVar9[0x19] = '\0';
              pcVar9[0x1a] = (char)((ulong)uVar15 >> 0x28);
              pcVar9[0x1b] = '\0';
              pcVar9[0x1c] = (char)((ulong)uVar15 >> 0x30);
              pcVar9[0x1d] = '\0';
              pcVar9[0x1e] = (char)((ulong)uVar15 >> 0x38);
              pcVar9[0x1f] = '\0';
              pcVar9 = pcVar9 + 0x40;
            } while (uVar11 != 0);
            if (sVar3 == uVar7) goto LAB_00959a3c;
          }
        }
        lVar10 = sVar3 - uVar7;
        pcVar9 = pcVar5 + uVar7 * 2 + 1;
        pcVar8 = param_1 + uVar7;
        do {
          cVar1 = *pcVar8;
          *pcVar9 = '\0';
          lVar10 = lVar10 + -1;
          pcVar9[-1] = cVar1;
          pcVar9 = pcVar9 + 2;
          pcVar8 = pcVar8 + 1;
        } while (lVar10 != 0);
      }
LAB_00959a3c:
      iVar2 = FUN_00959eb8(param_2,pcVar5,sVar3 << 1);
      if (iVar2 == 0) {
        *(undefined1 *)(param_2 + 0x14) = 0;
        *(undefined4 *)(param_2 + 0x10) = 0;
      }
      (*(code *)PTR_free_00cc4678)(pcVar5);
      return iVar2;
    }
  }
  return 0x1b;
}


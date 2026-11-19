/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091e5b8
 */

void FUN_0091e5b8(byte *param_1,undefined8 *param_2,long *param_3)

{
  byte *pbVar1;
  byte bVar2;
  long lVar3;
  size_t sVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  byte abStack_170 [43];
  undefined1 auStack_145 [213];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  *param_2 = 0;
  *param_3 = 0;
  sVar4 = strlen((char *)param_1);
  uVar5 = 0x3d;
  if ((sVar4 == 0) || ((sVar4 & 3) != 0)) goto LAB_0091e854;
  uVar10 = 0;
  if (param_1[sVar4 - 1] == 0x3d) {
    if (param_1[sVar4 - 2] != 0x3d) {
      uVar10 = 1;
      goto LAB_0091e64c;
    }
    if (param_1[sVar4 - 3] != 0x3d) {
      uVar10 = 2;
      goto LAB_0091e64c;
    }
  }
  else {
LAB_0091e64c:
    uVar12 = sVar4 >> 2;
    lVar11 = uVar12 * 3 - uVar10;
    puVar6 = (undefined1 *)(*(code *)PTR_malloc_00cc4670)(lVar11 + 1);
    if (puVar6 == (undefined1 *)0x0) {
      uVar5 = 0x1b;
      goto LAB_0091e854;
    }
    memset(abStack_170,0xff,0x100);
    memcpy(auStack_145,&DAT_00746ab8,0x50);
    puVar7 = puVar6;
    if (uVar12 != (uVar10 != 0)) {
      uVar8 = 0;
      do {
        if ((((abStack_170[*param_1] == 0xff) || (abStack_170[param_1[1]] == 0xff)) ||
            (bVar2 = abStack_170[param_1[2]], bVar2 == 0xff)) ||
           (pbVar1 = param_1 + 3, abStack_170[*pbVar1] == 0xff)) goto LAB_0091e83c;
        uVar9 = (uint)abStack_170[param_1[1]] | (uint)abStack_170[*param_1] << 6;
        uVar8 = uVar8 + 1;
        param_1 = param_1 + 4;
        puVar7[2] = abStack_170[*pbVar1] | bVar2 << 6;
        *puVar7 = (char)(uVar9 >> 4);
        puVar7[1] = (char)(((uint)bVar2 | uVar9 << 6) >> 2);
        puVar7 = puVar7 + 3;
      } while (uVar8 < uVar12 - (uVar10 != 0));
    }
    if (uVar10 == 0) {
LAB_0091e828:
      uVar5 = 0;
      *puVar7 = 0;
      *param_2 = puVar6;
      *param_3 = lVar11;
      goto LAB_0091e854;
    }
    if ((ulong)*param_1 == 0x3d) {
      uVar9 = 0;
      uVar12 = 1;
LAB_0091e770:
      if ((ulong)param_1[1] == 0x3d) {
        if (uVar12 < uVar10) {
          uVar12 = uVar12 + 1;
LAB_0091e7a0:
          if ((ulong)param_1[2] == 0x3d) {
            uVar12 = uVar12 + 1;
            if (uVar12 <= uVar10) {
              uVar9 = uVar9 << 6;
LAB_0091e7d4:
              if ((ulong)param_1[3] == 0x3d) {
                if (uVar12 + 1 <= uVar10) {
LAB_0091e808:
                  if (uVar10 == 1) {
                    puVar7[1] = (char)(uVar9 >> 2);
                  }
                  *puVar7 = (char)(uVar9 >> 10);
                  puVar7 = puVar7 + (uVar10 ^ 3);
                  goto LAB_0091e828;
                }
              }
              else if (abStack_170[param_1[3]] != 0xff) goto LAB_0091e808;
            }
          }
          else if (abStack_170[param_1[2]] != 0xff) {
            uVar9 = (uint)abStack_170[param_1[2]] | uVar9 << 6;
            goto LAB_0091e7d4;
          }
        }
      }
      else if (abStack_170[param_1[1]] != 0xff) {
        uVar9 = uVar9 | abStack_170[param_1[1]];
        goto LAB_0091e7a0;
      }
    }
    else if (abStack_170[*param_1] != 0xff) {
      uVar12 = 0;
      uVar9 = (uint)abStack_170[*param_1] << 6;
      goto LAB_0091e770;
    }
LAB_0091e83c:
    (*(code *)PTR_free_00cc4678)(puVar6);
  }
  uVar5 = 0x3d;
LAB_0091e854:
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}


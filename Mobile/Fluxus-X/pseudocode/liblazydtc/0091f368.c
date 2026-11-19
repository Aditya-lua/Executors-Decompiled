/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091f368
 */

int FUN_0091f368(undefined8 param_1,long param_2,undefined4 param_3,uint param_4)

{
  int iVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  uint *puVar9;
  undefined8 *puVar10;
  undefined8 uVar11;
  
  puVar9 = (uint *)(param_2 + 0x20);
  uVar5 = *puVar9;
  puVar10 = (undefined8 *)(param_2 + 0x28);
  uVar11 = *puVar10;
  if (uVar5 < 7) {
    if ((1 << (ulong)(uVar5 & 0x1f) & 0x66U) != 0) {
      iVar1 = *(int *)(param_2 + 0x30);
      lVar8 = (*(code *)PTR_malloc_00cc4670)(0x4000);
      if (lVar8 == 0) {
        uVar5 = *puVar9;
        if (uVar5 == 4) {
          (*(code *)PTR_free_00cc4678)(*puVar10);
          *puVar10 = 0;
          uVar5 = *puVar9;
        }
        if (uVar5 == 0) {
          return 0x1b;
        }
        inflateEnd(puVar10);
        *puVar9 = 0;
        return 0x1b;
      }
switchD_0091f47c_caseD_0:
      *(long *)(param_2 + 0x40) = lVar8;
      *(undefined4 *)(param_2 + 0x48) = 0x4000;
      uVar5 = inflate(puVar10,5);
      if ((1 < uVar5) || (*(int *)(param_2 + 0x48) == 0x4000)) goto LAB_0091f468;
      *(uint *)(param_2 + 0x20) = param_4;
      iVar6 = FUN_009350cc(param_1,*(undefined8 *)(param_2 + 8),param_3,lVar8,
                           0x4000 - *(int *)(param_2 + 0x48));
      if (iVar6 == 0) goto LAB_0091f468;
      uVar5 = *puVar9;
      if (uVar5 == 4) {
        (*(code *)PTR_free_00cc4678)(*puVar10);
        *puVar10 = 0;
        uVar5 = *puVar9;
      }
      if (uVar5 != 0) {
        inflateEnd(puVar10);
        goto LAB_0091f588;
      }
      goto LAB_0091f5e4;
    }
    if (uVar5 == 4) {
      (*(code *)PTR_free_00cc4678)(uVar11);
      *puVar10 = 0;
      uVar5 = *puVar9;
    }
  }
  if (uVar5 == 0) {
    return 0x17;
  }
  inflateEnd(puVar10);
  *puVar9 = 0;
  return 0x17;
LAB_0091f468:
  switch(uVar5) {
  case 0:
    goto switchD_0091f47c_caseD_0;
  case 1:
    uVar2 = *(uint *)(param_2 + 0x30);
    uVar3 = *(uint *)(param_2 + 0x24);
    uVar5 = uVar2;
    if (uVar3 <= uVar2) {
      uVar5 = uVar3;
    }
    iVar4 = uVar2 - uVar5;
    *(uint *)(param_2 + 0x24) = uVar3 - uVar5;
    *(int *)(param_2 + 0x30) = iVar4;
    *(ulong *)(param_2 + 0x28) = *(long *)(param_2 + 0x28) + (ulong)uVar5;
    if ((uVar3 - uVar5 == 0) || (iVar4 != 0)) {
      uVar5 = *puVar9;
      iVar6 = 0;
      if (iVar4 != 0) {
        iVar6 = 0x17;
      }
      if (uVar5 == 4) {
        (*(code *)PTR_free_00cc4678)();
        *puVar10 = 0;
        uVar5 = *puVar9;
      }
      if (uVar5 != 0) {
        iVar7 = inflateEnd(puVar10);
        if ((iVar4 == 0) && (iVar7 != 0)) {
          if (*(long *)(param_2 + 0x58) == 0) {
            FUN_00904b80(param_1,
                         "Error while processing content unencoding: Unknown failure within decompression software."
                        );
          }
          else {
            FUN_00904b80(param_1,"Error while processing content unencoding: %s");
          }
          iVar6 = 0x3d;
        }
LAB_0091f588:
        *puVar9 = 0;
      }
    }
    else {
      iVar6 = 0;
      *puVar9 = 3;
    }
    goto LAB_0091f5e4;
  case 0xfffffffb:
    iVar6 = 0;
LAB_0091f5e4:
    (*(code *)PTR_free_00cc4678)(lVar8);
    if ((iVar1 != 0) && (*puVar9 == 1)) {
      *puVar9 = param_4;
    }
    return iVar6;
  case 0xfffffffd:
    if (*puVar9 == 1) {
      inflateEnd(puVar10);
      iVar6 = inflateInit2_(puVar10,0xfffffff1,"1.3.1",0x70);
      if (iVar6 == 0) {
        *puVar10 = uVar11;
        *(int *)(param_2 + 0x30) = iVar1;
        puVar9[0] = 2;
        puVar9[1] = 4;
        goto switchD_0091f47c_caseD_0;
      }
      *puVar9 = 0;
    }
  default:
    if (*(long *)(param_2 + 0x58) == 0) {
      FUN_00904b80(param_1,
                   "Error while processing content unencoding: Unknown failure within decompression software."
                  );
    }
    else {
      FUN_00904b80(param_1,"Error while processing content unencoding: %s");
    }
    uVar5 = *puVar9;
    if (uVar5 == 4) {
      (*(code *)PTR_free_00cc4678)(*puVar10);
      *puVar10 = 0;
      uVar5 = *puVar9;
    }
    if (uVar5 != 0) {
      inflateEnd(puVar10);
      *puVar9 = 0;
    }
    iVar6 = 0x3d;
    goto LAB_0091f5e4;
  }
}


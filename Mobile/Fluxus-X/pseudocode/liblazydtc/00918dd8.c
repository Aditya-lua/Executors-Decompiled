/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00918dd8
 */

undefined4 FUN_00918dd8(long param_1,long param_2)

{
  long lVar1;
  bool bVar2;
  byte bVar3;
  int iVar4;
  undefined8 uVar5;
  size_t sVar6;
  long lVar7;
  long lVar8;
  code *pcVar9;
  size_t sVar10;
  char *pcVar11;
  undefined4 unaff_w22;
  char *local_1a0;
  undefined8 uStack_198;
  byte local_190;
  char local_18f [27];
  char local_174 [260];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  if ((param_2 != 0) && (pcVar9 = *(code **)(param_1 + 0x2b0), pcVar9 != (code *)0x0)) {
    pcVar11 = local_18f;
LAB_00918e38:
    local_1a0 = local_174;
    local_190 = (byte)pcVar11 & 0xfe;
    uStack_198 = 0x100;
    local_18f[0] = '\0';
    local_174[0] = '\0';
    iVar4 = (*pcVar9)(param_1,&local_1a0,*(undefined8 *)(param_1 + 0x2b8));
    if (iVar4 != 0) {
      if (iVar4 == 2) {
        bVar2 = true;
        unaff_w22 = 0x2a;
        goto LAB_00918f7c;
      }
LAB_00918f44:
      bVar2 = false;
      if (iVar4 != 0) goto LAB_00918f7c;
      pcVar11 = (char *)(ulong)local_190;
      pcVar9 = *(code **)(param_1 + 0x2b0);
      goto LAB_00918e38;
    }
    if (*local_1a0 == '\0') {
      bVar2 = true;
      unaff_w22 = 0x2b;
      goto LAB_00918f7c;
    }
    if (local_18f[0] == '\0') {
      uVar5 = 0x7fffffffffffffff;
    }
    else {
      uVar5 = FUN_009313b8(local_18f);
    }
    bVar3 = local_190;
    pcVar11 = local_1a0;
    sVar6 = strlen(local_1a0);
    if ((sVar6 == 0) ||
       ((sVar10 = sVar6 - 1, pcVar11[sVar10] == '.' && (sVar6 = sVar10, sVar10 == 0))))
    goto LAB_00918f44;
    lVar7 = (*(code *)PTR_calloc_00cc4690)(1,0x30);
    if (lVar7 != 0) {
      lVar8 = FUN_00941948(pcVar11,sVar6);
      if (lVar8 != 0) {
        *(long *)(lVar7 + 0x18) = lVar8;
        *(undefined8 *)(lVar7 + 0x28) = uVar5;
        *(byte *)(lVar7 + 0x20) = bVar3 & 1;
        FUN_00925d10(param_2,lVar7,lVar7);
        goto LAB_00918f44;
      }
      (*(code *)PTR_free_00cc4678)(lVar7);
    }
    bVar2 = true;
    unaff_w22 = 0x1b;
LAB_00918f7c:
    if (bVar2) goto LAB_00918f88;
  }
  unaff_w22 = 0;
LAB_00918f88:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return unaff_w22;
}


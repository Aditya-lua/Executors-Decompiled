/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008845d4
 */

void FUN_008845d4(undefined8 *param_1)

{
  char cVar1;
  long lVar2;
  undefined1 uVar3;
  int iVar4;
  undefined4 uVar5;
  size_t sVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 uVar9;
  char *__s;
  ulong *puVar10;
  ulong *puVar11;
  ulong uVar12;
  ulong *puVar13;
  int local_178 [32];
  int local_f8 [32];
  uint local_78;
  undefined1 local_74;
  long local_70;
  
  lVar2 = tpidr_el0;
  local_70 = *(long *)(lVar2 + 0x28);
  puVar10 = (ulong *)param_1[0x19d];
  puVar11 = (ulong *)param_1[0x19c];
  local_78 = 0;
  if (((ulong)((long)puVar10 - (long)puVar11) < 0xf9) && (puVar11 != puVar10)) {
    uVar12 = 0;
    uVar3 = 0;
    do {
      puVar7 = (undefined8 *)*puVar11;
      if (param_1[0x27] == 0) {
LAB_008847b8:
        if (*(long *)(lVar2 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(puVar7 + 1,"Local does not have corresponding variable");
        }
        goto LAB_008847dc;
      }
      uVar8 = ((ulong)(uint)((int)puVar7 << 3) + 8 ^ (ulong)puVar7 >> 0x20) * -0x622015f714c7d297;
      uVar8 = ((ulong)puVar7 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
      uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
      if ((*(ulong *)(param_1[0x25] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) == 0)
      goto LAB_008847b8;
      while (puVar13 = (ulong *)(param_1[0x22] + uVar8 * 0x28), (undefined8 *)*puVar13 != puVar7) {
        uVar8 = uVar8 + 1 & param_1[0x26] - 1;
        if ((*(ulong *)(param_1[0x25] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) == 0)
        goto LAB_008847b8;
      }
      __s = (char *)*puVar7;
      uVar9 = *param_1;
      sVar6 = strlen(__s);
      iVar4 = FUN_00875070(uVar9,__s,sVar6);
      if (iVar4 < 0) goto LAB_00884784;
      cVar1 = *(char *)((long)puVar13 + 0x21);
      local_178[uVar12] = iVar4;
      local_f8[uVar12] = -1;
      if ((cVar1 == '\x01') && ((puVar13[4] & 1) == 0)) {
        iVar4 = FUN_008868ec(param_1,puVar13[1]);
        if (iVar4 < 0) goto LAB_00884784;
        local_f8[uVar12] = iVar4;
        uVar3 = 1;
      }
      puVar11 = puVar11 + 1;
      local_78 = local_78 + 1;
      uVar12 = (ulong)local_78;
    } while (puVar11 != puVar10);
    local_74 = uVar3;
    if (local_78 != 0) {
      uVar5 = FUN_008751d0(*param_1,local_178);
      *(undefined4 *)(param_1 + 0x19f) = uVar5;
    }
  }
LAB_00884784:
  if (*(long *)(lVar2 + 0x28) == local_70) {
    return;
  }
LAB_008847dc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


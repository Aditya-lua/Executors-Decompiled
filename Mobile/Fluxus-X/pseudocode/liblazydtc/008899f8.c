/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008899f8
 */

void FUN_008899f8(undefined8 *param_1,long param_2)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  bool bVar4;
  uint uVar5;
  undefined4 uVar6;
  int iVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  ulong uVar10;
  size_t sVar11;
  long lVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong *puVar16;
  long lVar17;
  undefined8 *puVar18;
  undefined8 uVar19;
  char *pcVar20;
  undefined1 local_6c [4];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (*(int *)(param_1 + 1) < 1) goto LAB_00889d20;
  if ((1 < *(int *)((long)param_1 + 0xc)) && (DAT_00d1f048 != '\x01')) {
LAB_00889a78:
    if ((*(long *)(param_2 + 0x28) == 1) && (*(long *)(param_2 + 0x38) == 1)) {
      lVar17 = **(long **)(param_2 + 0x30);
      iVar2 = *(int *)(lVar17 + 8);
      while ((lVar17 == 0 || (iVar2 != DAT_00d1b010))) {
        if ((iVar2 != DAT_00d1afc0) && (iVar2 != DAT_00d1b0b0)) goto LAB_00889c84;
        lVar17 = *(long *)(lVar17 + 0x20);
        iVar2 = *(int *)(lVar17 + 8);
      }
      if (param_1[0x27] != 0) {
        uVar14 = **(ulong **)(param_2 + 0x20);
        uVar10 = ((ulong)(uint)((int)uVar14 << 3) + 8 ^ uVar14 >> 0x20) * -0x622015f714c7d297;
        uVar10 = (uVar14 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
        uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
        lVar12 = param_1[0x25];
        if ((*(ulong *)(lVar12 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) goto LAB_00889b68;
        puVar13 = (ulong *)0x0;
        bVar4 = true;
        goto LAB_00889bc8;
      }
      uVar5 = FUN_0088df20(param_1,lVar17);
      if (-1 < (int)uVar5) goto LAB_00889c68;
      goto LAB_00889c84;
    }
    goto LAB_00889d20;
  }
  uVar10 = FUN_00898c60(param_1,param_2);
  if ((uVar10 & 1) == 0) {
    if (*(int *)(param_1 + 1) < 1) goto LAB_00889d20;
    goto LAB_00889a78;
  }
  goto LAB_00889f60;
  while (uVar10 = uVar10 + 1 & param_1[0x26] - 1,
        (*(ulong *)(lVar12 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
LAB_00889b68:
    puVar16 = (ulong *)(param_1[0x22] + uVar10 * 0x28);
    if (*puVar16 == uVar14) goto LAB_00889b94;
  }
  puVar16 = (ulong *)0x0;
LAB_00889b94:
  bVar4 = puVar16 == (ulong *)0x0;
  puVar13 = (ulong *)0x0;
  if (!bVar4) {
    puVar13 = puVar16 + 1;
  }
LAB_00889bc8:
  uVar15 = *(ulong *)(lVar17 + 0x20);
  uVar10 = ((ulong)(uint)((int)uVar15 << 3) + 8 ^ uVar15 >> 0x20) * -0x622015f714c7d297;
  uVar10 = (uVar15 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
  uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
           ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
  uVar14 = *(ulong *)(lVar12 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f);
  while ((uVar14 & 1) != 0) {
    puVar16 = (ulong *)(param_1[0x22] + uVar10 * 0x28);
    if (*puVar16 == uVar15) goto LAB_00889c3c;
    uVar10 = uVar10 + 1 & param_1[0x26] - 1;
    uVar14 = *(ulong *)(lVar12 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f);
  }
  puVar16 = (ulong *)0x0;
LAB_00889c3c:
  uVar5 = FUN_0088df20(param_1,lVar17);
  if (((-1 < (int)uVar5) && ((bVar4 || ((puVar13[3] & 1) == 0)))) &&
     ((puVar16 == (ulong *)0x0 || ((puVar16[4] & 1) == 0)))) {
LAB_00889c68:
    lVar12 = **(long **)(param_2 + 0x20);
    if (((*(byte *)(lVar12 + 0x31) & 1) == 0) &&
       ((*(byte *)(*(long *)(lVar17 + 0x20) + 0x31) & 1) == 0)) {
      if (*(long *)(lVar3 + 0x28) == local_68) goto LAB_0088a030;
      goto LAB_0088a0a0;
    }
  }
LAB_00889c84:
  lVar17 = param_1[0xfe];
  if ((param_1[0xfd] != lVar17) && (*(long *)(lVar17 + -0x20) == **(long **)(param_2 + 0x20))) {
    FUN_0088d1d0(param_1,**(undefined8 **)(param_2 + 0x30),*(undefined1 *)(lVar17 + -0x28),1);
    if (((DAT_00d1f008 & 1) == 0) &&
       (uVar10 = *(ulong *)(param_2 + 0x28), uVar10 < *(ulong *)(param_2 + 0x38))) {
      do {
        FUN_00889800(param_1,*(undefined8 *)(*(long *)(param_2 + 0x30) + uVar10 * 8));
        uVar10 = uVar10 + 1;
      } while (uVar10 < *(ulong *)(param_2 + 0x38));
    }
    lVar12 = **(long **)(param_2 + 0x20);
    uVar5 = (uint)*(byte *)(param_1[0xfe] + -0x28);
    if (*(long *)(lVar3 + 0x28) == local_68) {
LAB_0088a030:
      FUN_00884b7c(param_1,lVar12,uVar5,0xffffffff);
      return;
    }
    goto LAB_0088a0a0;
  }
  if (DAT_00d1f0e8 == '\x01') {
    local_6c[0] = 0xff;
    uVar10 = FUN_0088c464(param_1,**(undefined8 **)(param_2 + 0x20),local_6c);
    if ((uVar10 & 1) != 0) {
      uVar6 = FUN_008769d0(*param_1);
      FUN_0088d1d0(param_1,**(undefined8 **)(param_2 + 0x30),local_6c[0],1);
      FUN_00884b7c(param_1,**(undefined8 **)(param_2 + 0x20),local_6c[0],uVar6);
      goto LAB_00889f60;
    }
  }
LAB_00889d20:
  iVar2 = *(int *)((long)param_1 + 0x64c);
  uVar5 = iVar2 + *(int *)(param_2 + 0x28);
  if (0xff < uVar5) {
    if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",
                   *(int *)(param_2 + 0x28),0xff);
    }
    goto LAB_0088a0a0;
  }
  *(uint *)((long)param_1 + 0x64c) = uVar5;
  uVar1 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar5) {
    uVar1 = uVar5;
  }
  *(uint *)(param_1 + 0xca) = uVar1;
  uVar6 = FUN_008769d0(*param_1);
  FUN_00895520(param_1,param_2 + 0x30,iVar2,*(undefined1 *)(param_2 + 0x28),1);
  if (*(long *)(param_2 + 0x28) != 0) {
    uVar10 = 0;
    do {
      puVar18 = *(undefined8 **)(*(long *)(param_2 + 0x20) + uVar10 * 8);
      if (param_1[0x27] != 0) {
        uVar14 = ((ulong)(uint)((int)puVar18 << 3) + 8 ^ (ulong)puVar18 >> 0x20) *
                 -0x622015f714c7d297;
        uVar14 = ((ulong)puVar18 >> 0x20 ^ uVar14 >> 0x2f ^ uVar14) * -0x622015f714c7d297;
        uVar14 = (uVar14 ^ uVar14 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
        if ((*(ulong *)(param_1[0x25] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0) {
          do {
            puVar13 = (ulong *)(param_1[0x22] + uVar14 * 0x28);
            if ((undefined8 *)*puVar13 == puVar18) goto LAB_00889e58;
            uVar14 = uVar14 + 1 & param_1[0x26] - 1;
          } while ((*(ulong *)(param_1[0x25] + (uVar14 >> 6) * 8) >> (uVar14 & 0x3f) & 1) != 0);
        }
      }
      puVar13 = (ulong *)0x0;
LAB_00889e58:
      puVar16 = (ulong *)0x0;
      if (puVar13 != (ulong *)0x0) {
        puVar16 = puVar13 + 1;
      }
      if (((DAT_00d1ec40 == '\x01') && (*(char *)((long)puVar18 + 0x31) == '\x01')) &&
         ((DAT_00d1f0a8 != '\x01' ||
          ((*(char *)((long)puVar16 + 0x19) != '\x01' || (*(int *)(param_1 + 0x19f) == -1)))))) {
        FUN_0088b80c(param_1,param_2);
        pcVar20 = (char *)*puVar18;
        uVar19 = *param_1;
        sVar11 = strlen(pcVar20);
        iVar7 = FUN_00875070(uVar19,pcVar20,sVar11);
        if (iVar7 < 0) {
          if (*(long *)(lVar3 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(puVar18 + 1,"Exceeded constant limit; simplify the code to compile");
          }
          goto LAB_0088a0a0;
        }
        uVar8 = FUN_0088c318(param_1,param_2);
        pcVar20 = (char *)*puVar18;
        uVar19 = *param_1;
        sVar11 = strlen(pcVar20);
        uVar9 = FUN_00877e08(pcVar20,sVar11);
        FUN_00875b54(uVar19,0x10,(int)uVar10 + iVar2,uVar8,uVar9);
        FUN_00875d18(*param_1,iVar7);
      }
      else {
        FUN_00884b7c(param_1,puVar18,(int)uVar10 + iVar2,uVar6);
      }
      uVar10 = uVar10 + 1;
    } while (uVar10 < *(ulong *)(param_2 + 0x28));
  }
LAB_00889f60:
  if (*(long *)(lVar3 + 0x28) == local_68) {
    return;
  }
LAB_0088a0a0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


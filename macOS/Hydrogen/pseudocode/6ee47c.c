
/* WARNING: Removing unreachable block (ram,0x006effa8) */
/* WARNING: Removing unreachable block (ram,0x006eff70) */
/* WARNING: Removing unreachable block (ram,0x006efff0) */

ulong FUN_006ee47c(long param_1,ulong param_2)

{
  ulong uVar1;
  long lVar2;
  undefined8 uVar3;
  uint uVar4;
  int iVar5;
  char cVar6;
  undefined1 uVar7;
  ulong uVar8;
  long lVar9;
  undefined *puVar10;
  ulong uVar11;
  long in_x9;
  ulong uVar12;
  ulong uVar13;
  long in_x10;
  ulong uVar14;
  int iVar15;
  long lVar16;
  long unaff_x19;
  int unaff_w20;
  long lVar17;
  undefined8 uVar18;
  double dVar19;
  double dVar20;
  double dVar21;
  
  iVar5 = 0;
  if (unaff_w20 != -1) {
    iVar5 = unaff_w20;
  }
  *(long *)(in_x9 + 0x10) = in_x10 + param_1 + (long)iVar5 * 0x10;
  *(short *)(unaff_x19 + 0x52) = *(short *)(unaff_x19 + 0x52) + -1;
  if (*(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x48) <
      *(ulong *)(*(long *)(unaff_x19 + 0x18) + 0x40)) {
    return param_2;
  }
  lVar17 = *(long *)(unaff_x19 + 0x18);
  lVar2 = *(long *)(lVar17 + 0x40);
  lVar16 = *(long *)(lVar17 + 0x48);
  if (*(code **)(lVar17 + 0x4e0) == (code *)0x0) {
    cVar6 = *(char *)(lVar17 + 0x21);
  }
  else {
    (**(code **)(lVar17 + 0x4e0))();
    cVar6 = *(char *)(lVar17 + 0x21);
  }
  if (cVar6 == '\0') {
    uVar18 = func_0x006f5d58();
    *(undefined8 *)(&UNK_00001a00 + lVar17) = uVar18;
    if (*(char *)(lVar17 + 0x21) == '\0') {
      dVar19 = (double)func_0x006f5d58();
      *(double *)(&UNK_00001b20 + lVar17) = dVar19;
      *(double *)(&UNK_00001b18 + lVar17) = dVar19 - *(double *)(&UNK_00001a50 + lVar17);
    }
  }
  dVar19 = (double)func_0x006f5d58();
  uVar7 = *(undefined1 *)(lVar17 + 0x21);
  lVar9 = func_0x006f0258();
  dVar20 = (double)func_0x006f5d58();
  dVar20 = dVar20 - dVar19;
  switch(uVar7) {
  case 0:
    if (*(char *)(lVar17 + 0x21) != '\x01') goto code_r0x006effdc;
    *(double *)(&UNK_00001b30 + lVar17) = dVar20 + *(double *)(&UNK_00001b30 + lVar17);
    break;
  case 1:
  case 2:
    *(double *)(&UNK_00001b30 + lVar17) = dVar20 + *(double *)(&UNK_00001b30 + lVar17);
    *(long *)(&UNK_00001b50 + lVar17) = *(long *)(&UNK_00001b50 + lVar17) + lVar9;
    break;
  case 3:
    *(double *)(&UNK_00001b68 + lVar17) = dVar20 + *(double *)(&UNK_00001b68 + lVar17);
    goto code_r0x006effdc;
  case 4:
    *(double *)(&UNK_00001b90 + lVar17) = dVar20 + *(double *)(&UNK_00001b90 + lVar17);
    *(long *)(&UNK_00001bb0 + lVar17) = *(long *)(&UNK_00001bb0 + lVar17) + lVar9;
    puVar10 = &UNK_00001b98;
    goto code_r0x006effcc;
  default:
    goto code_r0x006effdc;
  }
  puVar10 = &UNK_00001b38;
code_r0x006effcc:
  *(double *)(puVar10 + lVar17) = dVar20 + *(double *)(puVar10 + lVar17);
code_r0x006effdc:
  *(double *)(&UNK_00001a20 + lVar17) = dVar20 + *(double *)(&UNK_00001a20 + lVar17);
  *(long *)(&UNK_00001bb8 + lVar17) = *(long *)(&UNK_00001bb8 + lVar17) + lVar9;
  uVar11 = *(ulong *)(lVar17 + 0x48);
  uVar8 = 0;
  if ((long)*(int *)(lVar17 + 0x54) != 0) {
    uVar8 = (ulong)(lVar9 * 100) / (ulong)(long)*(int *)(lVar17 + 0x54);
  }
  if (*(char *)(lVar17 + 0x21) == '\0') {
    uVar13 = (uVar11 / 100) * (long)*(int *)(lVar17 + 0x50);
    dVar19 = *(double *)(&UNK_00001a08 + lVar17);
    dVar20 = dVar19 - *(double *)(&UNK_00001a10 + lVar17);
    uVar12 = uVar13;
    if (0.001 <= dVar20) {
      uVar4 = *(uint *)(&UNK_000019e0 + lVar17);
      lVar2 = lVar17 + ((ulong)uVar4 & 0x1f) * 4;
      lVar16 = *(long *)(&UNK_000019e8 + lVar17);
      lVar9 = *(long *)(&UNK_000019f0 + lVar17);
      dVar21 = *(double *)(&UNK_00001a00 + lVar17);
      iVar5 = *(int *)(&UNK_00001960 + lVar2);
      iVar15 = (int)((ulong)(lVar16 - *(long *)(&UNK_000019f8 + lVar17)) >> 10);
      *(int *)(&UNK_00001960 + lVar2) = iVar15;
      iVar5 = *(int *)(&UNK_000019e4 + lVar17) + (iVar15 - iVar5);
      *(int *)(&UNK_000019e4 + lVar17) = iVar5;
      *(uint *)(&UNK_000019e0 + lVar17) = uVar4 + 1;
      uVar14 = (uVar13 - (long)(((double)iVar15 * 0.405 + (double)iVar5 * 0.24300000000000002) *
                               1024.0)) -
               (long)((dVar19 - dVar21) * ((double)(ulong)(lVar16 - lVar9) / dVar20));
      uVar1 = uVar14;
      if ((long)uVar13 <= (long)uVar14) {
        uVar1 = uVar13;
      }
      uVar12 = uVar11;
      if ((long)uVar11 <= (long)uVar14) {
        uVar12 = uVar1;
      }
    }
    *(ulong *)(lVar17 + 0x40) = uVar12;
    *(ulong *)(&UNK_000019f8 + lVar17) = uVar13;
    uVar18 = func_0x006f5d58();
    *(undefined8 *)(&UNK_00001a10 + lVar17) = uVar18;
    *(undefined8 *)(&UNK_000019f0 + lVar17) = *(undefined8 *)(lVar17 + 0x48);
    uVar18 = func_0x006f5d58();
    *(undefined8 *)(&UNK_00001b28 + lVar17) = uVar18;
    *(undefined8 *)(&UNK_00001ad8 + lVar17) = *(undefined8 *)(&UNK_00001bb0 + lVar17);
    *(undefined8 *)(&UNK_00001ad0 + lVar17) = *(undefined8 *)(&UNK_00001ba8 + lVar17);
    *(undefined8 *)(&UNK_00001ae8 + lVar17) = *(undefined8 *)(&UNK_00001bc0 + lVar17);
    *(undefined8 *)(&UNK_00001ae0 + lVar17) = *(undefined8 *)(&UNK_00001bb8 + lVar17);
    *(undefined8 *)(&UNK_00001af8 + lVar17) = *(undefined8 *)(&UNK_00001bd0 + lVar17);
    *(undefined8 *)(&UNK_00001af0 + lVar17) = *(undefined8 *)(&UNK_00001bc8 + lVar17);
    *(undefined8 *)(&UNK_00001a98 + lVar17) = *(undefined8 *)(&UNK_00001b70 + lVar17);
    *(undefined8 *)(&UNK_00001a90 + lVar17) = *(undefined8 *)(&UNK_00001b68 + lVar17);
    *(undefined8 *)(&UNK_00001aa8 + lVar17) = *(undefined8 *)(&UNK_00001b80 + lVar17);
    *(undefined8 *)(&UNK_00001aa0 + lVar17) = *(undefined8 *)(&UNK_00001b78 + lVar17);
    *(undefined8 *)(&UNK_00001ab8 + lVar17) = *(undefined8 *)(&UNK_00001b90 + lVar17);
    *(undefined8 *)(&UNK_00001ab0 + lVar17) = *(undefined8 *)(&UNK_00001b88 + lVar17);
    *(undefined8 *)(&UNK_00001ac8 + lVar17) = *(undefined8 *)(&UNK_00001ba0 + lVar17);
    *(undefined8 *)(&UNK_00001ac0 + lVar17) = *(undefined8 *)(&UNK_00001b98 + lVar17);
    *(undefined8 *)(&UNK_00001a68 + lVar17) = *(undefined8 *)(&UNK_00001b40 + lVar17);
    *(undefined8 *)(&UNK_00001a60 + lVar17) = *(undefined8 *)(&UNK_00001b38 + lVar17);
    *(undefined8 *)(&UNK_00001a78 + lVar17) = *(undefined8 *)(&UNK_00001b50 + lVar17);
    *(undefined8 *)(&UNK_00001a70 + lVar17) = *(undefined8 *)(&UNK_00001b48 + lVar17);
    *(undefined8 *)(&UNK_00001a88 + lVar17) = *(undefined8 *)(&UNK_00001b60 + lVar17);
    *(undefined8 *)(&UNK_00001a80 + lVar17) = *(undefined8 *)(&UNK_00001b58 + lVar17);
    *(undefined8 *)(&UNK_00001a38 + lVar17) = *(undefined8 *)(&UNK_00001b10 + lVar17);
    *(undefined8 *)(&UNK_00001a30 + lVar17) = *(undefined8 *)(&UNK_00001b08 + lVar17);
    *(undefined8 *)(&UNK_00001a48 + lVar17) = *(undefined8 *)(&UNK_00001b20 + lVar17);
    *(undefined8 *)(&UNK_00001a40 + lVar17) = *(undefined8 *)(&UNK_00001b18 + lVar17);
    *(long *)(&UNK_00001a28 + lVar17) = *(long *)(&UNK_00001a28 + lVar17) + 1;
    uVar18 = *(undefined8 *)(lVar17 + 0x40);
    uVar3 = *(undefined8 *)(lVar17 + 0x48);
    *(undefined8 *)(&UNK_00001bd8 + lVar17) = uVar3;
    *(undefined8 *)(&UNK_00001b00 + lVar17) = uVar3;
    *(undefined8 *)(&UNK_00001a58 + lVar17) = *(undefined8 *)(&UNK_00001b30 + lVar17);
    *(undefined8 *)(&UNK_00001a50 + lVar17) = *(undefined8 *)(&UNK_00001b28 + lVar17);
    *(undefined8 *)(&UNK_00001bd8 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001bc0 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001bb8 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001bd0 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001bc8 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001ba0 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b98 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001bb0 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001ba8 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b80 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b78 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b90 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b88 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b60 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b58 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b70 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b68 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b40 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b38 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b50 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b48 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b20 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b18 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b30 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b28 + lVar17) = 0;
    *(undefined8 *)(&UNK_00001b08 + lVar17) = uVar3;
    *(undefined8 *)(&UNK_00001b10 + lVar17) = uVar18;
  }
  else {
    uVar12 = lVar16 - lVar2;
    uVar11 = uVar11 + uVar8;
    *(ulong *)(lVar17 + 0x40) = uVar11;
    if (uVar12 <= uVar11) {
      *(ulong *)(lVar17 + 0x40) = uVar11 - uVar12;
    }
  }
  if (*(code **)(lVar17 + 0x4e0) != (code *)0x0) {
    (**(code **)(lVar17 + 0x4e0))();
  }
  return uVar8;
}


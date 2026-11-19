/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b52c4
 */

ulong FUN_008b52c4(long param_1,ulong param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  char cVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  int iVar10;
  ulong uVar11;
  ulong uVar12;
  char *pcVar13;
  double dVar14;
  undefined8 uVar15;
  double dVar16;
  double dVar17;
  
  pcVar13 = *(char **)(param_1 + 0x60);
  if (*pcVar13 == '\0') {
    iVar1 = *(int *)(pcVar13 + 0x1c);
    iVar2 = *(int *)(pcVar13 + 0x20);
    lVar6 = *(long *)(pcVar13 + 8);
    lVar3 = *(long *)(pcVar13 + 0x10);
    if (*(code **)(pcVar13 + 0x688) != (code *)0x0) {
      (**(code **)(pcVar13 + 0x688))(param_1,0);
      param_2 = param_2 & 0xffffffff;
    }
    uVar5 = (ulong)((iVar2 * iVar1) / 100);
    if (pcVar13[1] == '\0') {
      uVar15 = FUN_008b97ec();
      *(undefined8 *)(pcVar13 + 0x5570) = uVar15;
    }
    uVar9 = lVar3 - lVar6;
    uVar7 = uVar5;
    if (((param_2 & 1) != 0) &&
       (uVar7 = (uVar9 * (long)*(int *)(pcVar13 + 0x20)) / 100, uVar7 <= uVar5)) {
      uVar7 = uVar5;
    }
    cVar4 = pcVar13[1];
    lVar6 = FUN_008b552c(param_1,uVar7);
    uVar5 = 0;
    if ((long)*(int *)(pcVar13 + 0x20) != 0) {
      uVar5 = (ulong)(lVar6 * 100) / (ulong)(long)*(int *)(pcVar13 + 0x20);
    }
    uVar7 = *(ulong *)(pcVar13 + 0x10);
    if (pcVar13[1] == '\0') {
      dVar14 = *(double *)(pcVar13 + 0x5578);
      dVar16 = dVar14 - *(double *)(pcVar13 + 0x5580);
      uVar8 = (uVar7 / 100) * (long)*(int *)(pcVar13 + 0x18);
      uVar9 = uVar8;
      if (0.001 <= dVar16) {
        uVar11 = *(ulong *)(pcVar13 + 0x5558);
        uVar12 = uVar11 - *(ulong *)(pcVar13 + 0x5560);
        dVar17 = *(double *)(pcVar13 + 0x5570);
        uVar9 = 0;
        if (*(ulong *)(pcVar13 + 0x5560) <= uVar11) {
          uVar9 = uVar12;
        }
        if (DAT_00d1f4d8 == '\0') {
          uVar9 = uVar12;
        }
        iVar1 = *(int *)(pcVar13 + 0x5554);
        uVar12 = (ulong)*(uint *)(pcVar13 + 0x5550) & 0x1f;
        iVar10 = (int)(uVar11 - *(long *)(pcVar13 + 0x5568) >> 10);
        *(uint *)(pcVar13 + 0x5550) = *(uint *)(pcVar13 + 0x5550) + 1;
        iVar2 = *(int *)(pcVar13 + uVar12 * 4 + 0x54d0);
        *(int *)(pcVar13 + uVar12 * 4 + 0x54d0) = iVar10;
        iVar1 = iVar1 + (iVar10 - iVar2);
        *(int *)(pcVar13 + 0x5554) = iVar1;
        uVar11 = (uVar8 - (long)(((double)iVar10 * 0.405 + (double)iVar1 * 0.24300000000000002) *
                                1024.0)) - (long)((dVar14 - dVar17) * ((double)uVar9 / dVar16));
        uVar12 = uVar11;
        if ((long)uVar8 <= (long)uVar11) {
          uVar12 = uVar8;
        }
        uVar9 = uVar7;
        if ((long)uVar7 <= (long)uVar11) {
          uVar9 = uVar12;
        }
      }
      *(ulong *)(pcVar13 + 8) = uVar9;
      *(ulong *)(pcVar13 + 0x5568) = uVar8;
      uVar15 = FUN_008b97ec();
      *(undefined8 *)(pcVar13 + 0x5580) = uVar15;
      *(undefined8 *)(pcVar13 + 0x5560) = *(undefined8 *)(pcVar13 + 0x10);
    }
    else {
      uVar7 = uVar7 + uVar5;
      *(ulong *)(pcVar13 + 8) = uVar7;
      if (uVar9 <= uVar7) {
        *(ulong *)(pcVar13 + 8) = uVar7 - uVar9;
      }
    }
    if (*(code **)(pcVar13 + 0x688) != (code *)0x0) {
      (**(code **)(pcVar13 + 0x688))(param_1,cVar4);
    }
  }
  else {
    uVar5 = 0;
  }
  return uVar5;
}


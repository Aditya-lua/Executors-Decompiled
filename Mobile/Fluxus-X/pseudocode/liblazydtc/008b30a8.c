/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b30a8
 */

void FUN_008b30a8(long param_1,undefined8 *param_2,long *param_3,ulong param_4)

{
  uint uVar1;
  undefined1 uVar2;
  byte bVar3;
  bool bVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  double *pdVar8;
  undefined4 uVar9;
  uint uVar10;
  int iVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  int iVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  double dVar20;
  
  lVar12 = *(long *)(**(long **)(param_1 + 0x50) + 0xc0) + (param_4 & 0xffffffff) * 0x10;
  lVar15 = *(long *)(*(long *)(**(long **)(param_1 + 0x50) + 0x28) +
                    (ulong)*(uint *)(lVar12 + 4) * 0x10);
  if (*(int *)((long)param_3 + 0xc) == 0xb) {
    lVar17 = *param_3;
    if (*(int *)(lVar12 + 8) == *(int *)(lVar17 + 0x18)) {
      iVar11 = *(int *)(lVar12 + 0xc);
    }
    else {
      if (*(int *)(lVar17 + 0x18) == 0) {
        *(undefined4 *)(lVar12 + 8) = 0;
        *(undefined4 *)(lVar12 + 0xc) = 0;
        goto LAB_008b3230;
      }
      if (((*(byte *)(lVar17 + 0x6a) & 1) == 0) && (*(int *)(lVar17 + 0x60) == 0)) {
        uVar10 = (uint)*(byte *)(lVar15 + 5);
        if (*(byte *)(lVar15 + 5) != 0x1f) {
          lVar13 = 0;
          iVar16 = 0;
          bVar4 = true;
LAB_008b329c:
          lVar19 = lVar13 << 5;
          do {
            lVar18 = *(long *)(lVar15 + 0x28);
            uVar1 = *(uint *)(lVar18 + lVar19 + 0x1c) & 0xf;
            if (uVar1 != 0) {
              if (uVar1 != 5) goto LAB_008b312c;
              pdVar8 = (double *)
                       FUN_008bb440(*(undefined8 *)(lVar17 + 0x38),
                                    *(undefined8 *)(lVar18 + lVar19 + 0x10));
              if (*(int *)((long)pdVar8 + 0xc) != 3) {
                iVar11 = 0;
                goto LAB_008b3130;
              }
              if (*(uint *)(lVar17 + 0x58) <= (uint)(int)*pdVar8) goto LAB_008b312c;
              iVar16 = iVar16 + 1;
              if (((*(int *)(lVar18 + lVar19 + 0xc) != 3) ||
                  (dVar20 = *(double *)(lVar18 + lVar19), dVar20 != 0.0)) || ((long)dVar20 < 0))
              goto LAB_008b3340;
              uVar10 = (uint)*(byte *)(lVar15 + 5);
            }
            lVar13 = lVar13 + 1;
            lVar19 = lVar19 + 0x20;
            if (1 << (ulong)(uVar10 & 0x1f) <= lVar13) {
              if (bVar4) goto LAB_008b3278;
              iVar11 = 1;
              goto LAB_008b3130;
            }
          } while( true );
        }
        iVar16 = 0;
LAB_008b3278:
        iVar11 = 1;
        if (iVar16 == *(int *)(lVar17 + 0x58)) {
          iVar11 = 2;
        }
      }
      else {
LAB_008b312c:
        iVar11 = 0;
      }
LAB_008b3130:
      *(int *)(lVar12 + 0xc) = iVar11;
      *(undefined4 *)(lVar12 + 8) = *(undefined4 *)(lVar17 + 0x18);
    }
    if (iVar11 != 0) {
      puVar7 = (undefined8 *)FUN_008b78d0(param_1,0x28,*(undefined1 *)(param_1 + 4),0xc,0);
      puVar7[4] = 0;
      puVar7[1] = 0;
      *puVar7 = 0;
      puVar7[3] = 0;
      puVar7[2] = 0;
      lVar12 = *(long *)(param_1 + 0x60);
      uVar10 = *(uint *)(lVar17 + 0x58);
      uVar2 = *(undefined1 *)(param_1 + 4);
      *(undefined1 *)puVar7 = 0xc;
      bVar3 = *(byte *)(lVar12 + 2);
      *(undefined1 *)((long)puVar7 + 1) = uVar2;
      puVar7[2] = lVar17;
      *(byte *)((long)puVar7 + 2) = bVar3 & 3;
      uVar5 = FUN_008b7610(param_1,(ulong)uVar10 << 4);
      iVar16 = *(int *)(lVar17 + 0x58);
      puVar7[4] = uVar5;
      *(int *)(puVar7 + 3) = iVar16;
      if (iVar11 == 2) {
        if (iVar16 != 0) {
          lVar12 = 0;
          uVar14 = 0;
          do {
            uVar14 = uVar14 + 1;
            puVar6 = (undefined8 *)(puVar7[4] + lVar12);
            lVar12 = lVar12 + 0x10;
            *puVar6 = 0;
            uVar10 = *(uint *)(lVar17 + 0x58);
            *(undefined4 *)((long)puVar6 + 0xc) = 3;
          } while (uVar14 < uVar10);
        }
      }
      else if (iVar16 != 0) {
        lVar12 = 0;
        uVar14 = 0;
        do {
          puVar6 = (undefined8 *)
                   FUN_008bb440(lVar15,*(undefined8 *)(*(long *)(lVar17 + 0x40) + uVar14 * 8));
          lVar13 = puVar7[4];
          uVar5 = *puVar6;
          uVar14 = uVar14 + 1;
          ((undefined8 *)(lVar13 + lVar12))[1] = puVar6[1];
          *(undefined8 *)(lVar13 + lVar12) = uVar5;
          lVar12 = lVar12 + 0x10;
        } while (uVar14 < *(uint *)(lVar17 + 0x58));
      }
      uVar9 = 0xc;
      goto LAB_008b3240;
    }
  }
LAB_008b3230:
  puVar7 = (undefined8 *)FUN_008bd16c(param_1,lVar15);
  uVar9 = 6;
LAB_008b3240:
  *param_2 = puVar7;
  *(undefined4 *)((long)param_2 + 0xc) = uVar9;
  return;
LAB_008b3340:
  uVar10 = (uint)*(byte *)(lVar15 + 5);
  iVar11 = 1;
  lVar13 = lVar13 + 1;
  bVar4 = false;
  if (1 << (ulong)(uVar10 & 0x1f) <= lVar13) goto LAB_008b3130;
  goto LAB_008b329c;
}


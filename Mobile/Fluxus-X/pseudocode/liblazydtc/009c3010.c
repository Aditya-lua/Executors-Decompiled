/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3010
 */

undefined8 tls1_process_sigalgs(long param_1)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  short *psVar4;
  int iVar5;
  long lVar6;
  long *plVar7;
  short *psVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  long *plVar13;
  short *psVar14;
  
  lVar11 = *(long *)(param_1 + 0x898);
  uVar1 = *(uint *)(lVar11 + 0x1c) & 0x30000;
  CRYPTO_free(*(void **)(param_1 + 0x1da8));
  *(undefined8 *)(param_1 + 0x1db0) = 0;
  *(undefined8 *)(param_1 + 0x1da8) = 0;
  if (((*(int *)(param_1 + 0x38) == 0) && (uVar1 == 0)) &&
     (psVar8 = *(short **)(lVar11 + 0x1a8), psVar8 != (short *)0x0)) {
    uVar9 = *(ulong *)(lVar11 + 0x1b0);
  }
  else if ((uVar1 == 0) && (psVar8 = *(short **)(lVar11 + 0x198), psVar8 != (short *)0x0)) {
    uVar9 = *(ulong *)(lVar11 + 0x1a0);
  }
  else {
    lVar11 = *(long *)(param_1 + 0x898);
    uVar2 = *(uint *)(lVar11 + 0x1c) & 0x30000;
    psVar8 = &DAT_0074cd8c;
    if (uVar2 == 0x30000) {
      uVar9 = 2;
    }
    else if (uVar2 == 0x20000) {
      psVar8 = &DAT_0074cd8e;
      uVar9 = 1;
    }
    else if (uVar2 == 0x10000) {
      psVar8 = &DAT_0074cd8c;
      uVar9 = 1;
    }
    else if ((*(int *)(param_1 + 0x38) == 0) &&
            (psVar8 = *(short **)(lVar11 + 0x1a8), psVar8 != (short *)0x0)) {
      uVar9 = *(ulong *)(lVar11 + 0x1b0);
    }
    else {
      psVar8 = *(short **)(lVar11 + 0x198);
      if (psVar8 == (short *)0x0) {
        psVar8 = &DAT_0074cd90;
        uVar9 = 0x1c;
      }
      else {
        uVar9 = *(ulong *)(lVar11 + 0x1a0);
      }
    }
  }
  psVar14 = psVar8;
  uVar3 = *(ulong *)(param_1 + 0x3a0);
  psVar4 = *(short **)(param_1 + 0x390);
  if (uVar1 == 0 && (*(byte *)(param_1 + 0x9ea) & 0x40) == 0) {
    psVar14 = *(short **)(param_1 + 0x390);
    uVar3 = uVar9;
    uVar9 = *(ulong *)(param_1 + 0x3a0);
    psVar4 = psVar8;
  }
  if (uVar9 != 0) {
    lVar11 = 0;
    uVar12 = 0;
    psVar8 = psVar14;
    do {
      lVar6 = FUN_009c21e4(param_1,*psVar8);
      if (((lVar6 != 0) && (iVar5 = FUN_009c3c60(param_1,0x5000c,lVar6), uVar3 != 0)) &&
         (iVar5 != 0)) {
        uVar10 = 0;
        do {
          if (*psVar8 == psVar4[uVar10]) {
            lVar11 = lVar11 + 1;
            break;
          }
          uVar10 = uVar10 + 1;
        } while (uVar10 < uVar3);
      }
      uVar12 = uVar12 + 1;
      psVar8 = psVar8 + 1;
    } while (uVar12 != uVar9);
    if (lVar11 != 0) {
      plVar7 = CRYPTO_malloc((int)(lVar11 << 3),"ssl/t1_lib.c",0x8da);
      if (plVar7 == (long *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/t1_lib.c",0x8db,"tls1_set_shared_sigalgs");
        ERR_set_error(0x14,0xc0100,0);
        return 0;
      }
      lVar11 = 0;
      uVar12 = 0;
      plVar13 = plVar7;
      do {
        lVar6 = FUN_009c21e4(param_1,*psVar14);
        if (((lVar6 != 0) && (iVar5 = FUN_009c3c60(param_1,0x5000c,lVar6), uVar3 != 0)) &&
           (iVar5 != 0)) {
          uVar10 = 0;
          do {
            if (*psVar14 == psVar4[uVar10]) {
              lVar11 = lVar11 + 1;
              if (plVar13 != (long *)0x0) {
                *plVar13 = lVar6;
                plVar13 = plVar13 + 1;
              }
              break;
            }
            uVar10 = uVar10 + 1;
          } while (uVar10 < uVar3);
        }
        uVar12 = uVar12 + 1;
        psVar14 = psVar14 + 1;
        if (uVar12 == uVar9) {
          *(long **)(param_1 + 0x1da8) = plVar7;
          *(long *)(param_1 + 0x1db0) = lVar11;
          *(undefined8 *)(param_1 + 0x3d0) = 0;
          *(undefined8 *)(param_1 + 0x3c8) = 0;
          *(undefined8 *)(param_1 + 0x3c0) = 0;
          *(undefined8 *)(param_1 + 0x3b8) = 0;
          *(undefined4 *)(param_1 + 0x3d8) = 0;
          if (lVar11 == 0) {
            return 1;
          }
          uVar9 = 0;
          while( true ) {
            if (((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
                 (iVar5 = **(int **)(param_1 + 8), iVar5 < 0x304)) ||
                ((iVar5 == 0x10000 || (*(int *)(plVar7[uVar9] + 0x14) != 6)))) &&
               ((lVar11 = param_1 + (long)*(int *)(plVar7[uVar9] + 0x18) * 4,
                *(int *)(lVar11 + 0x3b8) == 0 &&
                (iVar5 = ssl_cert_is_disabled(*(undefined8 *)(param_1 + 0x9a8)), iVar5 == 0)))) {
              *(undefined4 *)(lVar11 + 0x3b8) = 0x102;
            }
            uVar9 = uVar9 + 1;
            if (*(ulong *)(param_1 + 0x1db0) <= uVar9) break;
            plVar7 = *(long **)(param_1 + 0x1da8);
          }
          return 1;
        }
      } while( true );
    }
  }
  *(undefined8 *)(param_1 + 0x1db0) = 0;
  *(undefined8 *)(param_1 + 0x1da8) = 0;
  *(undefined4 *)(param_1 + 0x3d8) = 0;
  *(undefined8 *)(param_1 + 0x3d0) = 0;
  *(undefined8 *)(param_1 + 0x3c8) = 0;
  *(undefined8 *)(param_1 + 0x3c0) = 0;
  *(undefined8 *)(param_1 + 0x3b8) = 0;
  return 1;
}


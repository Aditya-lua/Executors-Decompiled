/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b87ec
 */

void FUN_008b87ec(long param_1,undefined8 param_2,code *param_3)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  int iVar9;
  long lVar10;
  
  lVar4 = *(long *)(param_1 + 0x60);
  lVar6 = *(long *)(lVar4 + 0x330);
  do {
    lVar8 = lVar6;
    if (lVar8 == 0) {
      lVar6 = *(long *)(lVar4 + 0x4b8);
      do {
        do {
          lVar8 = lVar6;
          if (lVar8 == 0) {
            if (DAT_00d1f5f8 == '\x01') {
              lVar6 = 0;
              do {
                lVar8 = *(long *)(lVar4 + 0x2f00 + lVar6 * 0x150);
joined_r0x008b89c8:
                lVar5 = lVar8;
                if (lVar5 != 0) {
                  if ((DAT_00d1f618 == '\x01') && (*(int *)(lVar5 + 0x38) == 1)) {
                    lVar7 = *(long *)(lVar5 + 0x40);
                  }
                  else {
                    lVar7 = lVar5 + 0x40;
                  }
                  uVar2 = (ulong)*(int *)(lVar5 + 0x24);
                  lVar10 = (long)*(int *)(lVar5 + 0x30);
                  lVar8 = *(long *)(lVar5 + 8);
                  iVar9 = 0;
                  if (uVar2 != 0) {
                    iVar9 = (int)(((long)*(int *)(lVar5 + 0x20) - 0x40U) / uVar2);
                  }
                  lVar1 = lVar7 + *(int *)(lVar5 + 0x24) * iVar9;
                  if (lVar7 + lVar10 + uVar2 != lVar1) {
                    iVar9 = *(int *)(lVar5 + 0x34);
                    lVar7 = lVar7 + uVar2;
                    do {
                      if (((*(char *)(lVar7 + lVar10) != '\0') &&
                          (uVar3 = (*param_3)(param_2,lVar5,lVar7 + lVar10), (uVar3 & 1) != 0)) &&
                         (iVar9 = iVar9 + -1, iVar9 == 0)) break;
                      lVar7 = lVar7 + uVar2;
                    } while (lVar7 + lVar10 != lVar1);
                  }
                  goto joined_r0x008b89c8;
                }
                lVar6 = lVar6 + 1;
              } while (lVar6 != 8);
            }
            return;
          }
          if ((DAT_00d1f618 == '\x01') && (*(int *)(lVar8 + 0x38) == 1)) {
            lVar5 = *(long *)(lVar8 + 0x40);
          }
          else {
            lVar5 = lVar8 + 0x40;
          }
          uVar2 = (ulong)*(int *)(lVar8 + 0x24);
          lVar7 = (long)*(int *)(lVar8 + 0x30);
          lVar6 = *(long *)(lVar8 + 8);
          iVar9 = 0;
          if (uVar2 != 0) {
            iVar9 = (int)(((long)*(int *)(lVar8 + 0x20) - 0x40U) / uVar2);
          }
          lVar10 = lVar5 + *(int *)(lVar8 + 0x24) * iVar9;
        } while (lVar5 + lVar7 + uVar2 == lVar10);
        iVar9 = *(int *)(lVar8 + 0x34);
        lVar5 = lVar5 + uVar2;
        do {
          if (((*(char *)(lVar5 + lVar7) != '\0') &&
              (uVar3 = (*param_3)(param_2,lVar8,lVar5 + lVar7), (uVar3 & 1) != 0)) &&
             (iVar9 = iVar9 + -1, iVar9 == 0)) break;
          lVar5 = lVar5 + uVar2;
        } while (lVar5 + lVar7 != lVar10);
      } while( true );
    }
    if ((DAT_00d1f618 == '\x01') && (*(int *)(lVar8 + 0x38) == 1)) {
      lVar5 = *(long *)(lVar8 + 0x40);
    }
    else {
      lVar5 = lVar8 + 0x40;
    }
    uVar2 = (ulong)*(int *)(lVar8 + 0x24);
    lVar7 = (long)*(int *)(lVar8 + 0x30);
    lVar6 = *(long *)(lVar8 + 8);
    iVar9 = 0;
    if (uVar2 != 0) {
      iVar9 = (int)(((long)*(int *)(lVar8 + 0x20) - 0x40U) / uVar2);
    }
    lVar10 = lVar5 + *(int *)(lVar8 + 0x24) * iVar9;
    if (lVar5 + lVar7 + uVar2 != lVar10) {
      iVar9 = *(int *)(lVar8 + 0x34);
      lVar5 = lVar5 + uVar2;
      do {
        if (((*(char *)(lVar5 + lVar7) != '\0') &&
            (uVar3 = (*param_3)(param_2,lVar8,lVar5 + lVar7), (uVar3 & 1) != 0)) &&
           (iVar9 = iVar9 + -1, iVar9 == 0)) break;
        lVar5 = lVar5 + uVar2;
      } while (lVar5 + lVar7 != lVar10);
    }
  } while( true );
}


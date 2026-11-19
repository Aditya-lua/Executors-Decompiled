/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009683d4
 */

undefined8 FUN_009683d4(long *param_1,long param_2,undefined8 *param_3,long *param_4,long *param_5)

{
  long *plVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  uint uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  
  lVar9 = param_1[3];
  uVar8 = *(uint *)(*param_1 + 8);
  *param_4 = 0;
  bVar2 = (uVar8 & 10) != 10;
  lVar10 = param_2 + 0x5f8;
  if (bVar2) {
    lVar10 = param_2 + 0x530;
  }
  lVar7 = lVar9 + 800;
  if (bVar2) {
    lVar7 = lVar9 + 0x2a0;
  }
  if (((*(byte *)(lVar10 + 0x79) >> 3 & 1) != 0) &&
     (lVar10 = *(long *)(param_2 + 0xca8), lVar10 != 0)) {
    lVar9 = *(long *)(param_2 + 0xd0);
    if ((lVar9 == 0) || ((*(byte *)(lVar9 + 4) >> 4 & 1) == 0)) {
      plVar1 = (long *)(param_2 + 0xcb0);
      lVar9 = *(long *)(param_2 + 0x6d0);
    }
    else {
      plVar1 = (long *)(lVar9 + 0x108);
      lVar9 = *(long *)(param_2 + 0x6d0);
    }
    if (lVar9 != 0) {
      lVar9 = 0x30;
      uVar11 = 1;
      do {
        if ((*(long *)(lVar10 + lVar9 + -0x18) != 0) &&
           (iVar3 = curl_strequal(*param_3,*(undefined8 *)(lVar10 + lVar9 + -0x30)), iVar3 != 0)) {
          lVar6 = param_1[3];
          lVar5 = *(long *)(lVar10 + lVar9 + -0x28);
          uVar8 = (uint)*(undefined8 *)(lVar6 + 0x3a0);
          if ((uVar8 >> 9 & 1) == 0) {
            if (lVar5 == 0) {
LAB_009684e4:
              iVar3 = *(int *)(lVar10 + lVar9 + 0xc);
              if ((uVar8 >> 10 & 1) == 0) {
                if (iVar3 == -1) {
LAB_00968510:
                  if ((*(int *)((long)param_3 + 0x1c) == *(int *)(lVar10 + lVar9 + 8)) &&
                     (*(int *)(param_3 + 4) == *(int *)(lVar10 + lVar9 + 0x10))) {
                    iVar3 = curl_strequal(**(undefined8 **)(lVar6 + 0x3a8),
                                          *(undefined8 *)(lVar10 + lVar9 + -0x20));
                    if ((iVar3 != 0) &&
                       (uVar4 = FUN_00967a14(lVar7,lVar10 + lVar9 + 0x18), (uVar4 & 1) != 0)) {
                      lVar7 = *plVar1;
                      *plVar1 = lVar7 + 1;
                      plVar1 = (long *)(lVar10 + lVar9);
                      *plVar1 = lVar7 + 1;
                      *param_4 = plVar1[-3];
                      if (param_5 == (long *)0x0) {
                        return 0;
                      }
                      *param_5 = plVar1[-2];
                      return 0;
                    }
                  }
                }
              }
              else if ((iVar3 != -1) && (*(int *)(lVar6 + 0x564) == iVar3)) goto LAB_00968510;
            }
          }
          else if ((lVar5 != 0) &&
                  (iVar3 = curl_strequal(*(undefined8 *)(lVar6 + 0x80)), iVar3 != 0)) {
            lVar6 = param_1[3];
            uVar8 = (uint)*(undefined8 *)(lVar6 + 0x3a0);
            goto LAB_009684e4;
          }
        }
        if (*(ulong *)(param_2 + 0x6d0) <= uVar11) {
          return 1;
        }
        lVar10 = *(long *)(param_2 + 0xca8);
        lVar9 = lVar9 + 200;
        uVar11 = uVar11 + 1;
      } while( true );
    }
  }
  return 1;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b3568
 */

undefined8 FUN_008b3568(long param_1,uint param_2,byte *param_3,long param_4)

{
  undefined4 uVar1;
  byte bVar2;
  ulong uVar3;
  undefined8 uVar4;
  char *pcVar5;
  long lVar6;
  long lVar7;
  int iVar8;
  long *plVar9;
  long lVar10;
  long *plVar11;
  long lVar12;
  long *plVar13;
  long *local_68;
  
  if ((int)param_2 < 0) {
    if ((((long)(ulong)-param_2 <= *(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x70) >> 4) &&
        (plVar9 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10),
        *(int *)((long)plVar9 + 0xc) == 7)) && (lVar10 = *plVar9, lVar10 != 0)) {
      if (((*(char *)(lVar10 + 6) == '\0') &&
          (lVar12 = *(long *)(lVar10 + 0x18), *(long *)(lVar12 + 0xe8) != 0)) &&
         (pcVar5 = strpbrk((char *)param_3,"sln"), pcVar5 != (char *)0x0)) {
        FUN_008c9034(param_1,lVar12);
      }
      plVar9 = (long *)(lVar10 + 0x18);
      plVar11 = (long *)0x8;
      local_68 = (long *)0x0;
      plVar13 = plVar9;
LAB_008b3634:
      lVar12 = 0;
LAB_008b364c:
      do {
        bVar2 = *param_3;
        if (bVar2 < 0x6e) {
          if (bVar2 < 0x66) {
            if (bVar2 == 0x61) {
              if (*(char *)(lVar10 + 6) == '\0') {
                param_3 = param_3 + 1;
                *(undefined1 *)(param_4 + 10) = *(undefined1 *)(*plVar13 + 3);
                *(undefined1 *)(param_4 + 9) = *(undefined1 *)(*plVar13 + 7);
              }
              else {
                param_3 = param_3 + 1;
                *(undefined2 *)(param_4 + 9) = 0x100;
              }
              goto LAB_008b364c;
            }
            if (bVar2 == 0) {
              if (lVar12 != 0) {
                if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
                  FUN_008b63a4(param_1,param_1,param_1 + 0x38);
                }
                plVar9 = *(long **)(param_1 + 0x68);
                *plVar9 = lVar12;
                lVar12 = *(long *)(param_1 + 0x48);
                lVar10 = *(long *)(param_1 + 0x68);
                *(undefined4 *)((long)plVar9 + 0xc) = 7;
                if (lVar12 - lVar10 < 0x11) {
                  FUN_008b41e4(param_1,1);
                  lVar10 = *(long *)(param_1 + 0x68);
                }
                *(long *)(param_1 + 0x68) = lVar10 + 0x10;
              }
              return 1;
            }
          }
          else if (bVar2 == 0x66) {
            lVar12 = lVar10;
          }
          else if (bVar2 == 0x6c) {
            if ((int)param_2 < 0) {
              if (*(char *)(lVar10 + 6) == '\0') {
                param_3 = param_3 + 1;
                *(undefined4 *)(param_4 + 0x10) = *(undefined4 *)(*plVar9 + 0xa0);
              }
              else {
                param_3 = param_3 + 1;
                *(undefined4 *)(param_4 + 0x10) = 0xffffffff;
              }
            }
            else if (*(int *)(*plVar11 + 0xc) == 7) {
              if (*(char *)(*(long *)*plVar11 + 6) == '\0') {
                lVar6 = *local_68;
                iVar8 = 0;
                if (local_68[4] != 0) {
                  uVar3 = local_68[4] - *(long *)(lVar6 + 0x30);
                  iVar8 = 0;
                  if (uVar3 != 0) {
                    iVar8 = (int)(uVar3 >> 2) + -1;
                  }
                }
                if (*(long *)(lVar6 + 0x90) == 0) {
                  *(undefined4 *)(param_4 + 0x10) = 0;
                  param_3 = param_3 + 1;
                }
                else {
                  param_3 = param_3 + 1;
                  *(uint *)(param_4 + 0x10) =
                       *(int *)(*(long *)(lVar6 + 8) +
                               (long)(iVar8 >> (*(uint *)(lVar6 + 0xa8) & 0x1f)) * 4) +
                       (uint)*(byte *)(*(long *)(lVar6 + 0x90) + (long)iVar8);
                }
              }
              else {
                param_3 = param_3 + 1;
                *(undefined4 *)(param_4 + 0x10) = 0xffffffff;
              }
            }
            else {
              param_3 = param_3 + 1;
              *(undefined4 *)(param_4 + 0x10) = 0xffffffff;
            }
            goto LAB_008b364c;
          }
LAB_008b3738:
          param_3 = param_3 + 1;
          goto LAB_008b364c;
        }
        if (bVar2 < 0x73) {
          if (bVar2 != 0x6e) {
            if (bVar2 != 0x70) goto LAB_008b3738;
            if (*(char *)(lVar10 + 6) == '\0') {
              param_3 = param_3 + 1;
              uVar1 = *(undefined4 *)(*plVar13 + 0x98);
              *(undefined4 *)(param_4 + 0x18) = *(undefined4 *)(*plVar13 + 0xcc);
              *(undefined4 *)(param_4 + 0xc) = uVar1;
            }
            else {
              *(undefined4 *)(param_4 + 0x18) = 0;
              param_3 = param_3 + 1;
              *(undefined4 *)(param_4 + 0xc) = 0xffffffff;
            }
            goto LAB_008b364c;
          }
          if ((int)param_2 < 0) {
            lVar6 = *plVar9;
            if (*(char *)(lVar10 + 6) == '\0') {
              if (*(long *)(lVar6 + 0x88) != 0) {
                param_3 = param_3 + 1;
                *(long *)(param_4 + 0x38) = *(long *)(lVar6 + 0x88) + 0x18;
                goto LAB_008b364c;
              }
            }
            else if (lVar6 != 0) {
              param_3 = param_3 + 1;
              *(long *)(param_4 + 0x38) = lVar6 + 0x18;
              goto LAB_008b364c;
            }
          }
          else {
            lVar6 = *(long *)(*(long *)*plVar11 + 0x18);
            if (*(char *)(*(long *)*plVar11 + 6) == '\0') {
              if (*(long *)(lVar6 + 0x88) != 0) {
                param_3 = param_3 + 1;
                *(long *)(param_4 + 0x38) = *(long *)(lVar6 + 0x88) + 0x18;
                goto LAB_008b364c;
              }
            }
            else if (lVar6 != 0) {
              param_3 = param_3 + 1;
              *(long *)(param_4 + 0x38) = lVar6 + 0x18;
              goto LAB_008b364c;
            }
          }
          *(undefined8 *)(param_4 + 0x38) = 0;
          param_3 = param_3 + 1;
          goto LAB_008b364c;
        }
        if (bVar2 == 0x75) {
          param_3 = param_3 + 1;
          *(undefined1 *)(param_4 + 8) = *(undefined1 *)(lVar10 + 5);
        }
        else {
          if (bVar2 != 0x73) goto LAB_008b3738;
          if (*(char *)(lVar10 + 6) == '\0') {
            lVar7 = *plVar13;
            *(undefined **)(param_4 + 0x28) = &DAT_002d0cdf;
            lVar6 = *(long *)(lVar7 + 0x70) + 0x18;
            uVar1 = *(undefined4 *)(*(long *)(lVar7 + 0x70) + 0x14);
            *(long *)(param_4 + 0x20) = lVar6;
            *(undefined4 *)(param_4 + 0x14) = *(undefined4 *)(*plVar13 + 0xa0);
            uVar4 = FUN_008b9674(param_4 + 0x40,0x100,lVar6,uVar1);
            *(undefined8 *)(param_4 + 0x30) = uVar4;
            param_3 = param_3 + 1;
          }
          else {
            *(undefined4 *)(param_4 + 0x14) = 0xffffffff;
            param_3 = param_3 + 1;
            *(undefined **)(param_4 + 0x20) = &DAT_002d8f9f;
            *(undefined **)(param_4 + 0x28) = &DAT_002c6bfc;
            *(undefined **)(param_4 + 0x30) = &DAT_002befc1;
          }
        }
      } while( true );
    }
  }
  else if (param_2 < (uint)((int)((ulong)(*(long *)(param_1 + 0x50) - *(long *)(param_1 + 0x20)) >>
                                 4) * -0x55555555)) {
    local_68 = (long *)(*(long *)(param_1 + 0x50) + (ulong)param_2 * -0x30);
    plVar11 = local_68 + 1;
    lVar10 = *(long *)*plVar11;
    if (lVar10 != 0) {
      plVar9 = (long *)(lVar10 + 0x18);
      plVar13 = local_68;
      goto LAB_008b3634;
    }
  }
  return 0;
}


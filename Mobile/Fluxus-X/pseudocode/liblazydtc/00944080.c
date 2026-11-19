/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00944080
 */

/* WARNING: Removing unreachable block (ram,0x00944438) */
/* WARNING: Removing unreachable block (ram,0x0094464c) */

void FUN_00944080(long param_1,long param_2)

{
  byte *pbVar1;
  long lVar2;
  size_t __n;
  undefined1 *puVar3;
  long lVar4;
  byte bVar5;
  ushort uVar6;
  int iVar7;
  undefined8 uVar8;
  void *pvVar9;
  void *__s;
  long lVar10;
  undefined8 uVar11;
  ulong uVar12;
  char *pcVar13;
  ulong uVar14;
  int *piVar15;
  undefined4 uVar16;
  undefined1 *puVar17;
  ulong uVar18;
  byte *pbVar19;
  long lVar20;
  undefined8 local_80;
  int local_74;
  int local_70;
  undefined4 uStack_6c;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  local_80 = 0;
  if (*(int *)(param_2 + 0x4c8) == 4) {
    uVar8 = FUN_009447bc(param_1,param_2);
  }
  else {
    lVar2 = param_2 + 0x428;
    if (*(long *)(param_2 + 0x440) == 0) {
      do {
        uVar8 = FUN_00945480(param_1,0,lVar2,&local_74,&local_80);
        iVar7 = local_74;
        if ((int)uVar8 != 0) goto LAB_00944654;
        if (local_74 == 0) break;
        switch(*(undefined4 *)(param_2 + 0x4c8)) {
        case 1:
          lVar20 = *(long *)(param_1 + 0x20);
          pvVar9 = (void *)FUN_00904974(lVar20 + 0x488);
          if (iVar7 != 0x2b) {
            FUN_00904b80(param_1,"Got unexpected pop3-server response");
            uVar8 = 8;
            goto LAB_00944654;
          }
          uVar12 = *(ulong *)(*(long *)(param_1 + 0x20) + 0x4b0);
          if (uVar12 < 4) goto LAB_00944550;
          __s = memchr(pvVar9,0x3c,uVar12);
          if ((__s != (void *)0x0) &&
             (pvVar9 = memchr(__s,0x3e,(long)pvVar9 + (uVar12 - (long)__s)), pvVar9 != (void *)0x0))
          {
            __n = (long)pvVar9 + (1 - (long)__s);
            pvVar9 = memchr(__s,0x40,__n);
            if (pvVar9 != (void *)0x0) {
              lVar10 = FUN_00941948(__s,__n);
              *(long *)(lVar20 + 0x500) = lVar10;
              if (lVar10 == 0) {
                uVar8 = 0x1b;
                goto LAB_00944654;
              }
              *(byte *)(lVar20 + 0x508) = *(byte *)(lVar20 + 0x508) | 2;
            }
          }
          *(undefined2 *)(lVar20 + 0x4f8) = 0;
          *(undefined2 *)(lVar20 + 0x4fc) = 0;
          *(byte *)(lVar20 + 0x50a) = *(byte *)(lVar20 + 0x50a) & 0xfd;
          uVar8 = FUN_009453ec(param_1,lVar20 + 0x428,&DAT_002b6c62,&DAT_002b37de);
          if ((int)uVar8 == 0) {
            *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 2;
            iVar7 = *(int *)(param_2 + 0x4c8);
            goto joined_r0x009445a8;
          }
          goto LAB_00944654;
        case 2:
          lVar20 = *(long *)(param_1 + 0x20);
          piVar15 = (int *)FUN_00904974(lVar20 + 0x488);
          if (iVar7 != 0x2b) {
            if (iVar7 != 0x2a) {
              *(byte *)(lVar20 + 0x508) = *(byte *)(lVar20 + 0x508) | 1;
              goto LAB_0094450c;
            }
            uVar12 = *(ulong *)(*(long *)(param_1 + 0x20) + 0x4b0);
            if (uVar12 < 4) goto LAB_00944550;
            if (*piVar15 == 0x534c5453) {
              *(byte *)(lVar20 + 0x50a) = *(byte *)(lVar20 + 0x50a) | 2;
              iVar7 = *(int *)(param_2 + 0x4c8);
              goto joined_r0x009445a8;
            }
            if (*piVar15 != 0x52455355) {
              if ((4 < uVar12) && (iVar7 = memcmp(piVar15,"SASL ",5), iVar7 == 0)) {
                uVar12 = uVar12 - 5;
                *(byte *)(lVar20 + 0x508) = *(byte *)(lVar20 + 0x508) | 4;
                if (uVar12 != 0) {
                  pbVar19 = (byte *)((long)piVar15 + 5);
                  do {
                    while ((uVar14 = (ulong)*pbVar19, *pbVar19 < 0x21 &&
                           ((1L << (uVar14 & 0x3f) & 0x100002600U) != 0))) {
                      uVar12 = uVar12 - 1;
                      pbVar19 = pbVar19 + 1;
                      if (uVar12 == 0) goto LAB_00944550;
                    }
                    uVar18 = 1;
                    while ((0x20 < (uint)uVar14 || ((1L << (uVar14 & 0x3f) & 0x100002600U) == 0))) {
                      if (uVar12 <= uVar18) goto LAB_0094431c;
                      pbVar1 = pbVar19 + uVar18;
                      uVar18 = uVar18 + 1;
                      uVar14 = (ulong)*pbVar1;
                    }
                    uVar18 = uVar18 - 1;
LAB_0094431c:
                    uVar6 = FUN_0094581c(pbVar19,uVar18,&local_70);
                    if ((uVar6 != 0) && (CONCAT44(uStack_6c,local_70) == uVar18)) {
                      *(ushort *)(lVar20 + 0x4f8) = *(ushort *)(lVar20 + 0x4f8) | uVar6;
                    }
                    uVar12 = uVar12 - uVar18;
                    pbVar19 = pbVar19 + uVar18;
                  } while (uVar12 != 0);
                }
              }
              goto LAB_00944550;
            }
            *(byte *)(lVar20 + 0x508) = *(byte *)(lVar20 + 0x508) | 1;
            iVar7 = *(int *)(param_2 + 0x4c8);
            goto joined_r0x009444f8;
          }
LAB_0094450c:
          if ((*(char *)(param_1 + 0xa80) != '\0') &&
             (uVar12 = FUN_00907858(lVar20,0), (uVar12 & 1) == 0)) {
            if ((iVar7 == 0x2b) && ((*(byte *)(lVar20 + 0x50a) >> 1 & 1) != 0)) {
              uVar8 = FUN_009453ec(param_1,lVar20 + 0x428,&DAT_002b6c62,&DAT_002ccfae);
              if ((int)uVar8 == 0) {
                lVar20 = *(long *)(param_1 + 0x20);
                uVar16 = 3;
                goto LAB_009443b4;
              }
              goto LAB_00944654;
            }
            if (1 < *(byte *)(param_1 + 0xa80)) {
              pcVar13 = "STLS not supported.";
              goto LAB_009446ec;
            }
          }
LAB_00944548:
          uVar8 = FUN_009448d8(param_1,lVar20);
LAB_0094454c:
          iVar7 = (int)uVar8;
          goto joined_r0x009443f0;
        case 3:
          if (*(long *)(*(long *)(param_1 + 0x20) + 0x4a8) == 0) {
            if (local_74 == 0x2b) {
              uVar8 = FUN_009447bc(param_1,param_2);
              iVar7 = (int)uVar8;
joined_r0x009443f0:
              if (iVar7 == 0) goto LAB_00944550;
            }
            else {
              if (*(char *)(param_1 + 0xa80) == '\x01') {
                lVar20 = param_2;
                goto LAB_00944548;
              }
              pcVar13 = "STARTTLS denied";
LAB_009446ec:
              FUN_00904b80(param_1,pcVar13);
              uVar8 = 0x40;
            }
          }
          else {
            uVar8 = 8;
          }
          goto LAB_00944654;
        case 5:
          lVar20 = *(long *)(param_1 + 0x20);
          uVar8 = FUN_00945f80(lVar20 + 0x4e0,param_1,local_74,&local_70);
          if ((int)uVar8 != 0) goto LAB_0094454c;
          if (local_70 == 0) {
            bVar5 = *(byte *)(lVar20 + 0x509) & *(byte *)(lVar20 + 0x508);
            if ((bVar5 >> 1 & 1) == 0) {
              if ((bVar5 & 1) == 0) {
                FUN_00904b80(param_1,"Authentication cancelled");
                uVar8 = 0x43;
                goto LAB_00944654;
              }
              if (*(long *)(param_1 + 0x12f0) == 0) goto LAB_00944428;
              puVar3 = &DAT_002ab32c;
              if (*(undefined1 **)(lVar20 + 0x1c8) != (undefined1 *)0x0) {
                puVar3 = *(undefined1 **)(lVar20 + 0x1c8);
              }
              uVar8 = FUN_009453ec(param_1,lVar20 + 0x428,"USER %s",puVar3);
              if ((int)uVar8 != 0) goto LAB_0094454c;
              *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 7;
            }
            else {
              uVar8 = FUN_00944a50(param_1,lVar20);
              if ((int)uVar8 != 0) goto LAB_00944654;
            }
          }
          else {
            uVar8 = 0;
            if (local_70 != 2) goto LAB_0094454c;
LAB_00944428:
            *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 0;
          }
LAB_00944550:
          iVar7 = *(int *)(param_2 + 0x4c8);
          goto joined_r0x009445a8;
        case 6:
          if (local_74 != 0x2b) {
            pcVar13 = "Authentication failed: %d";
LAB_009446b0:
            FUN_00904b80(param_1,pcVar13,local_74);
            uVar8 = 0x43;
            goto LAB_00944654;
          }
          break;
        case 7:
          if (local_74 != 0x2b) {
LAB_00944684:
            pcVar13 = "Access denied. %c";
            goto LAB_009446b0;
          }
          puVar17 = *(undefined1 **)(*(long *)(param_1 + 0x20) + 0x1d0);
          puVar3 = &DAT_002ab32c;
          if (puVar17 != (undefined1 *)0x0) {
            puVar3 = puVar17;
          }
          uVar8 = FUN_009453ec(param_1,*(long *)(param_1 + 0x20) + 0x428,"PASS %s",puVar3);
          if ((int)uVar8 != 0) goto LAB_00944654;
          lVar20 = *(long *)(param_1 + 0x20);
          uVar16 = 8;
LAB_009443b4:
          *(undefined4 *)(lVar20 + 0x4c8) = uVar16;
          iVar7 = *(int *)(param_2 + 0x4c8);
joined_r0x009445a8:
          if (iVar7 != 0) goto LAB_00944558;
          goto LAB_00944650;
        case 8:
          if (local_74 != 0x2b) goto LAB_00944684;
          break;
        case 9:
          lVar20 = *(long *)(param_1 + 0x20);
          if (local_74 != 0x2b) {
            *(undefined4 *)(lVar20 + 0x4c8) = 0;
            uVar8 = 8;
            goto LAB_00944654;
          }
          piVar15 = *(int **)(param_1 + 0x1a0);
          *(undefined8 *)(lVar20 + 0x4d8) = 2;
          *(undefined8 *)(lVar20 + 0x4d0) = 2;
          if (*piVar15 == 0) {
            FUN_00943380(param_1,1,0xffffffffffffffff,0);
            if (*(long *)(lVar20 + 0x4a8) == 0) break;
            lVar10 = lVar20 + 0x488;
            FUN_00904584(lVar10);
            *(undefined8 *)(lVar20 + 0x4b0) = 0;
            if (-1 < *(char *)(param_1 + 0x1b2)) {
              uVar8 = FUN_00904974(lVar10);
              uVar11 = FUN_00904984(lVar10);
              uVar8 = FUN_00943e74(param_1,uVar8,uVar11);
              if ((int)uVar8 != 0) goto LAB_00944654;
            }
            FUN_0090456c(lVar10);
          }
          *(undefined8 *)(lVar20 + 0x4a8) = 0;
        }
        *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x4c8) = 0;
        iVar7 = *(int *)(param_2 + 0x4c8);
joined_r0x009444f8:
        if (iVar7 == 0) break;
LAB_00944558:
        uVar12 = FUN_009457c8(lVar2);
      } while ((uVar12 & 1) != 0);
LAB_00944650:
      uVar8 = 0;
    }
    else {
      uVar8 = FUN_009456e0(param_1,lVar2);
    }
  }
LAB_00944654:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar8);
  }
  return;
}


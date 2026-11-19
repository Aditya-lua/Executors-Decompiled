/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094d350
 */

void FUN_0094d350(long param_1,uint *param_2)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  ulong uVar5;
  undefined *puVar6;
  undefined1 uVar7;
  long lVar8;
  undefined1 uVar9;
  long lVar10;
  long lVar11;
  char local_50 [4];
  undefined1 local_4c [4];
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  lVar8 = *(long *)(param_1 + 0x20);
  local_4c[0] = 0;
  if (*(long *)(lVar8 + 0x250) != 0) {
    uVar4 = FUN_00907508(param_1,1,0,local_4c);
    if ((int)uVar4 != 0) {
      if (*(int *)(lVar8 + 0x528) == 0) {
        *param_2 = 0xffffffff;
        uVar4 = FUN_00953448(param_1,lVar8);
      }
      goto LAB_0094d884;
    }
    uVar5 = FUN_009077ec(param_1,1);
    uVar4 = 0;
    if ((uVar5 & 1) == 0) goto LAB_0094d884;
  }
  lVar10 = *(long *)(param_1 + 0x1a0);
  if (*(char *)(lVar8 + 0x536) != '\0') {
    lVar11 = *(long *)(param_1 + 0x20);
    uVar4 = FUN_009450b4(param_1,lVar11 + 0x428,0,0);
    *param_2 = (uint)(*(char *)(lVar11 + 0x536) == '\0');
    if (((int)uVar4 != 0) || ((*(byte *)(lVar8 + 0x53a) >> 5 & 1) == 0)) goto LAB_0094d884;
    *param_2 = 0;
  }
  if (*(uint *)(lVar10 + 0x10) < 2) {
    if ((*(byte *)(lVar8 + 0x53a) >> 5 & 1) != 0) {
      uVar4 = FUN_00953954(param_1,local_50);
      if ((int)uVar4 != 0) goto LAB_0094d884;
      if (local_50[0] != '\0') {
        uVar4 = FUN_00953c88(param_1);
        *(byte *)(lVar8 + 0x53a) = *(byte *)(lVar8 + 0x53a) & 0xdf;
        if (((int)uVar4 != 0) || (uVar4 = FUN_00953780(param_1), (int)uVar4 != 0))
        goto LAB_0094d884;
        *param_2 = 1;
      }
      goto LAB_0094d6d8;
    }
    if ((*(uint *)(param_1 + 0x131c) >> 0x11 & 1) == 0) {
      *(undefined8 *)(lVar10 + 0x18) = 0xffffffffffffffff;
      iVar3 = FUN_0094befc(param_1);
      if (iVar3 == 0) {
        if (-1 < *(long *)(param_1 + 0xe0)) {
          *(byte *)(lVar8 + 0x53a) = *(byte *)(lVar8 + 0x53a) | 2;
        }
        if (((*(uint *)(param_1 + 0x131c) >> 0xd & 1) == 0) && (*(long *)(lVar8 + 0x4e0) != 0)) {
          uVar1 = *(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x49;
          uVar9 = (undefined1)uVar1;
          if (*(byte *)(lVar8 + 0x500) != uVar1) {
            uVar4 = FUN_009453ec(param_1,lVar8 + 0x428,"TYPE %c",uVar1);
            if ((int)uVar4 != 0) goto LAB_0094d884;
            lVar10 = *(long *)(param_1 + 0x20);
            if (((((ulong)*(byte *)(lVar10 + 0x536) != 0x15) &&
                 ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                ((*(long *)(param_1 + 0x12a0) == 0 ||
                 (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
              if (lVar10 == 0) {
                puVar6 = &DAT_002c11b5;
              }
              else {
                puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar10 + 0x536)];
              }
              FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"RETR_TYPE");
            }
            uVar7 = 0x15;
            goto LAB_0094d854;
          }
          lVar8 = *(long *)(param_1 + 0x20);
          if (((((ulong)*(byte *)(lVar8 + 0x536) != 0x15) &&
               ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
              ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
              )) && (0 < DAT_00cc46c0)) {
            if (lVar8 == 0) {
              puVar6 = &DAT_002c11b5;
            }
            else {
              puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar8 + 0x536)];
            }
            FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"RETR_TYPE");
          }
          *(undefined1 *)(lVar8 + 0x536) = 0x15;
          uVar4 = 0xd;
          goto LAB_0094d7f8;
        }
        if (*(int *)(lVar10 + 0x10) == 0) {
          if (*(char *)(lVar8 + 0x500) == 'A') {
            lVar8 = *(long *)(param_1 + 0x20);
            if (((((ulong)*(byte *)(lVar8 + 0x536) != 0x14) &&
                 ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                ((*(long *)(param_1 + 0x12a0) == 0 ||
                 (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
              if (lVar8 == 0) {
                puVar6 = &DAT_002c11b5;
              }
              else {
                puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar8 + 0x536)];
              }
              FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"LIST_TYPE");
            }
            *(undefined1 *)(lVar8 + 0x536) = 0x14;
            uVar4 = FUN_00951994(param_1,200,0x14);
            iVar3 = (int)uVar4;
            goto joined_r0x0094d800;
          }
          uVar4 = FUN_009453ec(param_1,lVar8 + 0x428,"TYPE %c",0x41);
          if ((int)uVar4 != 0) goto LAB_0094d884;
          lVar10 = *(long *)(param_1 + 0x20);
          if ((((ulong)*(byte *)(lVar10 + 0x536) != 0x14) &&
              ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
             (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
              && (0 < DAT_00cc46c0)))) {
            if (lVar10 == 0) {
              puVar6 = &DAT_002c11b5;
            }
            else {
              puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar10 + 0x536)];
            }
            FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"LIST_TYPE");
          }
          *(undefined1 *)(lVar10 + 0x536) = 0x14;
          *(undefined1 *)(lVar8 + 0x500) = 0x41;
        }
      }
    }
    else {
      uVar1 = *(uint *)(param_1 + 0x131c) >> 9 & 8 ^ 0x49;
      uVar9 = (undefined1)uVar1;
      if (*(byte *)(lVar8 + 0x500) == uVar1) {
        lVar8 = *(long *)(param_1 + 0x20);
        if ((((ulong)*(byte *)(lVar8 + 0x536) != 0x16) &&
            ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
           (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
            && (0 < DAT_00cc46c0)))) {
          if (lVar8 == 0) {
            puVar6 = &DAT_002c11b5;
          }
          else {
            puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar8 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"STOR_TYPE");
        }
        uVar4 = 0xe;
        *(undefined1 *)(lVar8 + 0x536) = 0x16;
LAB_0094d7f8:
        uVar4 = FUN_0095102c(param_1,1,uVar4);
        iVar3 = (int)uVar4;
joined_r0x0094d800:
        if (iVar3 != 0) goto LAB_0094d884;
      }
      else {
        uVar4 = FUN_009453ec(param_1,lVar8 + 0x428,"TYPE %c",uVar1);
        if ((int)uVar4 != 0) goto LAB_0094d884;
        lVar10 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar10 + 0x536) != 0x16) &&
             ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
           && (0 < DAT_00cc46c0)) {
          if (lVar10 == 0) {
            puVar6 = &DAT_002c11b5;
          }
          else {
            puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar10 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"STOR_TYPE");
        }
        uVar7 = 0x16;
LAB_0094d854:
        *(undefined1 *)(lVar10 + 0x536) = uVar7;
        *(undefined1 *)(lVar8 + 0x500) = uVar9;
      }
    }
    lVar8 = *(long *)(param_1 + 0x20);
    uVar4 = FUN_009450b4(param_1,lVar8 + 0x428,0,0);
    *param_2 = (uint)(*(char *)(lVar8 + 0x536) == '\0');
    goto LAB_0094d884;
  }
  FUN_00943194(param_1);
  uVar4 = 0;
  if ((*(byte *)(lVar8 + 0x53a) >> 5 & 1) != 0) goto LAB_0094d884;
  *param_2 = 1;
  uVar4 = 0;
  if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0094d884;
  if (*(long *)(param_1 + 0x12a0) == 0) {
    if (0 < DAT_00cc46c0) goto LAB_0094d648;
  }
  else if (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)) {
    uVar4 = 0;
    if (DAT_00cc46c0 < 1) goto LAB_0094d884;
LAB_0094d648:
    if (*(long *)(param_1 + 0x20) == 0) {
      puVar6 = &DAT_002c11b5;
    }
    else {
      puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(*(long *)(param_1 + 0x20) + 0x536)];
    }
    FUN_00905258(param_1,"[%s] DO-MORE phase ends with %d",puVar6,0);
  }
LAB_0094d6d8:
  uVar4 = 0;
LAB_0094d884:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}


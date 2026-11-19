/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00952350
 */

void FUN_00952350(long param_1,ulong param_2)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  char *pcVar5;
  undefined *puVar6;
  undefined1 uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  undefined1 auStack_1068 [4096];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  lVar11 = *(long *)(param_1 + 0x20);
  lVar12 = *(long *)(param_1 + 0x1a0);
  lVar9 = *(long *)(param_1 + 0x1118);
  if ((lVar9 == 0) || ((param_2 & 1) != 0)) {
    if ((0 < lVar9) && ((param_2 & 1) != 0)) goto LAB_00952414;
    if (((uint)*(undefined8 *)(param_1 + 0xa82) >> 10 & 1) != 0) goto LAB_0095255c;
    pcVar5 = "STOR %s";
LAB_00952564:
    uVar3 = FUN_009453ec(param_1,lVar11 + 0x428,pcVar5,*(undefined8 *)(lVar11 + 0x4e0));
    if ((int)uVar3 != 0) goto LAB_009526dc;
    lVar9 = *(long *)(param_1 + 0x20);
    if ((((ulong)*(byte *)(lVar9 + 0x536) != 0x21) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
       && (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
           (0 < DAT_00cc46c0)))) {
      if (lVar9 == 0) {
        puVar6 = &DAT_002c11b5;
      }
      else {
        puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar9 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar6,&DAT_002b550c);
    }
    uVar7 = 0x21;
  }
  else {
    if (-1 < lVar9) {
LAB_00952414:
      if (*(long *)(param_1 + 0x210) != 0) {
        FUN_0092f198(param_1,1);
        iVar2 = (**(code **)(param_1 + 0x210))
                          (*(undefined8 *)(param_1 + 0x2a8),*(undefined8 *)(param_1 + 0x1118),0);
        FUN_0092f198(param_1,0);
        if (iVar2 != 0) {
          if (iVar2 != 2) {
            pcVar5 = "Could not seek stream";
LAB_009525d0:
            FUN_00904b80(param_1,pcVar5);
            uVar3 = 0x1f;
            goto LAB_009526dc;
          }
          lVar8 = *(long *)(param_1 + 0x1118);
          lVar9 = 0;
          do {
            if (lVar8 - lVar9 < 0x1001) {
              uVar10 = FUN_00963a7c();
            }
            else {
              uVar10 = 0x1000;
            }
            lVar4 = (**(code **)(param_1 + 0x1160))
                              (auStack_1068,1,uVar10,*(undefined8 *)(param_1 + 0x1168));
            if (uVar10 <= lVar4 - 1U) {
              pcVar5 = "Failed to read data";
              goto LAB_009525d0;
            }
            lVar8 = *(long *)(param_1 + 0x1118);
            lVar9 = lVar4 + lVar9;
          } while (lVar9 < lVar8);
        }
      }
      if ((0 < *(long *)(param_1 + 0x1158)) &&
         (lVar9 = *(long *)(param_1 + 0x1158) - *(long *)(param_1 + 0x1118),
         *(long *)(param_1 + 0x1158) = lVar9, lVar9 < 1)) {
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"File already completely uploaded");
        }
        FUN_00943194(param_1);
        *(undefined4 *)(lVar12 + 0x10) = 2;
        lVar9 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar9 + 0x536) != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)
             ) && ((*(long *)(param_1 + 0x12a0) == 0 ||
                   (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
          if (lVar9 == 0) {
            puVar6 = &DAT_002c11b5;
          }
          else {
            puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar9 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar6,&DAT_002c11b9);
        }
        uVar3 = 0;
        *(undefined1 *)(lVar9 + 0x536) = 0;
        goto LAB_009526dc;
      }
LAB_0095255c:
      pcVar5 = "APPE %s";
      goto LAB_00952564;
    }
    uVar3 = FUN_009453ec(param_1,lVar11 + 0x428,"SIZE %s",*(undefined8 *)(lVar11 + 0x4e0));
    if ((int)uVar3 != 0) goto LAB_009526dc;
    lVar9 = *(long *)(param_1 + 0x20);
    if (((((ulong)*(byte *)(lVar9 + 0x536) != 0x19) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
        && ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
       && (0 < DAT_00cc46c0)) {
      if (lVar9 == 0) {
        puVar6 = &DAT_002c11b5;
      }
      else {
        puVar6 = (&PTR_DAT_00c508c0)[*(byte *)(lVar9 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar6,"STOR_SIZE");
    }
    uVar7 = 0x19;
  }
  uVar3 = 0;
  *(undefined1 *)(lVar9 + 0x536) = uVar7;
LAB_009526dc:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}


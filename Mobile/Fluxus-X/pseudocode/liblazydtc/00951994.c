/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00951994
 */

ulong FUN_00951994(long param_1,int param_2,undefined1 param_3)

{
  undefined *puVar1;
  int iVar2;
  long lVar3;
  uint uVar4;
  char *pcVar5;
  long lVar6;
  undefined *puVar7;
  undefined8 uVar8;
  undefined1 uVar9;
  ulong uVar10;
  char *pcVar11;
  long lVar12;
  char *local_50;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if (99 < param_2 - 200U) {
    FUN_00904b80(param_1,"Couldn\'t set desired mode");
    uVar10 = 0x11;
    goto LAB_009519e4;
  }
  lVar12 = *(long *)(param_1 + 0x20);
  if (((param_2 != 200) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    FUN_00904c98(param_1,"Got a %03d response code instead of the assumed 200");
  }
  switch(param_3) {
  case 0x13:
    iVar2 = *(int *)(*(long *)(param_1 + 0x1a0) + 0x10);
    if (iVar2 != 0) {
      if (iVar2 == 1) {
        if (*(long *)(lVar12 + 0x4e0) != 0) {
          uVar4 = FUN_009453ec(param_1,lVar12 + 0x428,"SIZE %s");
          uVar10 = (ulong)uVar4;
          if (uVar4 == 0) {
            lVar12 = *(long *)(param_1 + 0x20);
            if (((((ulong)*(byte *)(lVar12 + 0x536) != 0x17) &&
                 ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
                ((*(long *)(param_1 + 0x12a0) == 0 ||
                 (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) && (0 < DAT_00cc46c0)) {
              if (lVar12 == 0) {
                puVar7 = &DAT_002c11b5;
              }
              else {
                puVar7 = (&PTR_DAT_00c508c0)[*(byte *)(lVar12 + 0x536)];
              }
              FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_0029d8c0);
            }
            uVar9 = 0x17;
            goto LAB_00951dfc;
          }
          break;
        }
      }
      else if (*(long *)(lVar12 + 0x4e0) != 0) {
        uVar4 = FUN_009453ec(param_1,lVar12 + 0x428,"REST %d",0);
        uVar10 = (ulong)uVar4;
        if (uVar4 != 0) break;
        lVar12 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar12 + 0x536) != 0x1a) &&
             ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
           && (0 < DAT_00cc46c0)) {
          if (lVar12 == 0) {
            puVar7 = &DAT_002c11b5;
          }
          else {
            puVar7 = (&PTR_DAT_00c508c0)[*(byte *)(lVar12 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_002b17cb);
        }
        uVar9 = 0x1a;
        goto LAB_00951dfc;
      }
    }
    uVar10 = FUN_009528c8(param_1);
    goto LAB_00951be0;
  case 0x14:
    lVar12 = *(long *)(param_1 + 0x20);
    if ((*(char *)(param_1 + 0x710) == '\x02') && (**(long **)(param_1 + 0x1a0) != 0)) {
      local_50 = (char *)0x0;
      uVar4 = FUN_0091583c(**(long **)(param_1 + 0x1a0),0,&local_50,0,3);
      pcVar11 = local_50;
      uVar10 = (ulong)uVar4;
      if (uVar4 != 0) break;
      pcVar5 = strrchr(local_50,0x2f);
      if (pcVar5 == (char *)0x0) {
        (*(code *)PTR_free_00cc4678)(pcVar11);
        goto LAB_00951c20;
      }
      if (pcVar5 == pcVar11) {
        pcVar5 = pcVar5 + 1;
      }
      *pcVar5 = '\0';
      puVar7 = *(undefined **)(param_1 + 0x818);
    }
    else {
LAB_00951c20:
      pcVar11 = (char *)0x0;
      puVar7 = *(undefined **)(param_1 + 0x818);
    }
    if ((puVar7 == (undefined *)0x0) &&
       (puVar7 = &DAT_002ab6c8, (*(byte *)(param_1 + 0x131d) & 0x20) != 0)) {
      puVar7 = &DAT_002cd0f2;
    }
    puVar1 = &DAT_002a19a2;
    pcVar5 = pcVar11;
    if (pcVar11 == (char *)0x0) {
      puVar1 = &DAT_002ab32c;
      pcVar5 = "";
    }
    lVar6 = curl_maprintf("%s%s%s",puVar7,puVar1,pcVar5);
    (*(code *)PTR_free_00cc4678)(pcVar11);
    if (lVar6 == 0) {
      uVar10 = 0x1b;
    }
    else {
      uVar4 = FUN_009453ec(param_1,lVar12 + 0x428,&DAT_002b6c62,lVar6);
      uVar10 = (ulong)uVar4;
      (*(code *)PTR_free_00cc4678)(lVar6);
      if (uVar4 == 0) {
        lVar12 = *(long *)(param_1 + 0x20);
        if (((((ulong)*(byte *)(lVar12 + 0x536) != 0x1f) &&
             ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
            ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
           && (0 < DAT_00cc46c0)) {
          if (lVar12 == 0) {
            puVar7 = &DAT_002c11b5;
          }
          else {
            puVar7 = (&PTR_DAT_00c508c0)[*(byte *)(lVar12 + 0x536)];
          }
          FUN_00905258(param_1,"[%s] -> [%s]",puVar7,&DAT_002ab6c8);
        }
        uVar9 = 0x1f;
LAB_00951dfc:
        uVar10 = 0;
        *(undefined1 *)(lVar12 + 0x536) = uVar9;
      }
    }
    break;
  case 0x15:
    uVar8 = 0xd;
    goto LAB_00951ae8;
  case 0x16:
    uVar8 = 0xe;
LAB_00951ae8:
    uVar10 = FUN_0095102c(param_1,1,uVar8);
LAB_00951be0:
    if (*(long *)(lVar3 + 0x28) == local_48) {
      return uVar10;
    }
    goto LAB_00951e04;
  default:
    uVar10 = 0;
  }
LAB_009519e4:
  if (*(long *)(lVar3 + 0x28) == local_48) {
    return uVar10;
  }
LAB_00951e04:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


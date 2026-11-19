/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009178a8
 */

void FUN_009178a8(long param_1,long *param_2)

{
  undefined1 *puVar1;
  char *pcVar2;
  uint uVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  void *__cp;
  char *pcVar7;
  long lVar8;
  char local_c8 [48];
  undefined1 auStack_98 [32];
  undefined1 auStack_78 [32];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  if (((((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) ||
       (pcVar7 = (char *)((long)param_2 + 0x1c), *pcVar7 == '\0')) ||
      (iVar5 = inet_pton(2,pcVar7,local_c8), 0 < iVar5)) ||
     (iVar5 = inet_pton(10,pcVar7,auStack_98), 0 < iVar5)) goto LAB_00917b04;
  lVar8 = *param_2;
  if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    pcVar2 = "(none)";
    if (*(char *)((long)param_2 + 0x1c) != '\0') {
      pcVar2 = pcVar7;
    }
    FUN_00904c98(param_1,"Host %s:%d was resolved.",pcVar2,(int)param_2[3]);
  }
  FUN_00904528(auStack_98,0x400);
  FUN_00904528(auStack_78,0x400);
  for (; lVar8 != 0; lVar8 = *(long *)(lVar8 + 0x28)) {
    uVar3 = *(uint *)(lVar8 + 4);
    if ((uVar3 | 8) == 10) {
      puVar1 = auStack_98 + (ulong)(uVar3 != 2) * 0x20;
      local_c8[0] = '\0';
      if (uVar3 == 10) {
        iVar5 = 10;
        __cp = (void *)(*(long *)(lVar8 + 0x20) + 8);
LAB_009179e0:
        inet_ntop(iVar5,__cp,local_c8,0x2e);
      }
      else if (uVar3 == 2) {
        iVar5 = 2;
        __cp = (void *)(*(long *)(lVar8 + 0x20) + 4);
        goto LAB_009179e0;
      }
      lVar6 = FUN_00904984(puVar1);
      if (((lVar6 != 0) && (iVar5 = FUN_009045fc(puVar1,&DAT_002a715d,2), iVar5 != 0)) ||
         (iVar5 = FUN_00904728(puVar1,local_c8), iVar5 != 0)) {
        if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
        {
          FUN_00904c98(param_1,"too many IP, cannot show");
        }
        goto LAB_00917af4;
      }
    }
  }
  if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
    if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
      lVar8 = FUN_00904984(auStack_78);
      if (lVar8 == 0) {
        pcVar7 = "(none)";
      }
      else {
        pcVar7 = (char *)FUN_00904974(auStack_78);
      }
      FUN_00904c98(param_1,"IPv6: %s",pcVar7);
      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_00917af4;
    }
    if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
      lVar8 = FUN_00904984(auStack_98);
      if (lVar8 == 0) {
        pcVar7 = "(none)";
      }
      else {
        pcVar7 = (char *)FUN_00904974(auStack_98);
      }
      FUN_00904c98(param_1,"IPv4: %s",pcVar7);
    }
  }
LAB_00917af4:
  FUN_00904534(auStack_98);
  FUN_00904534(auStack_78);
LAB_00917b04:
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


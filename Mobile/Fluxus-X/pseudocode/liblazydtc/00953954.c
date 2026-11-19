/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00953954
 */

void FUN_00953954(long param_1,undefined1 *param_2)

{
  ulong uVar1;
  undefined4 uVar2;
  byte bVar3;
  long lVar4;
  int iVar5;
  uint uVar6;
  long lVar7;
  long lVar8;
  byte *pbVar9;
  char *pcVar10;
  undefined4 uVar11;
  long lVar12;
  int local_6c;
  undefined1 local_68 [16];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  lVar12 = *(long *)(param_1 + 0x20);
  uVar11 = *(undefined4 *)(lVar12 + 0x220);
  uVar2 = *(undefined4 *)(lVar12 + 0x224);
  *param_2 = 0;
  uVar1 = 60000;
  if (*(uint *)(param_1 + 0x714) != 0) {
    uVar1 = (ulong)*(uint *)(param_1 + 0x714);
  }
  local_68 = FUN_00941cb8();
  lVar7 = FUN_009086d4(param_1,local_68,0);
  if ((lVar7 == 0) || ((long)uVar1 <= lVar7)) {
    lVar7 = FUN_00941d54(local_68._0_8_,local_68._8_8_,*(undefined8 *)(param_1 + 0xb60),
                         *(undefined8 *)(param_1 + 0xb68));
    lVar7 = uVar1 - lVar7;
    if (lVar7 != 0) goto LAB_009539e4;
    lVar7 = -1;
    bVar3 = *(byte *)(param_1 + 0xa85);
  }
  else {
LAB_009539e4:
    bVar3 = *(byte *)(param_1 + 0xa85);
  }
  if (((bVar3 >> 4 & 1) != 0) &&
     ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
    FUN_00904c98(param_1,"Checking for server connect");
  }
  if (lVar7 < 0) {
    FUN_00904b80(param_1,"Accept timeout occurred while waiting server connect");
    uVar11 = 0xc;
    goto LAB_00953bb8;
  }
  lVar7 = lVar12 + 0x488;
  lVar8 = FUN_00904984(lVar7);
  if (lVar8 != 0) {
    pbVar9 = (byte *)FUN_00904974(lVar7);
    if (0x33 < *pbVar9) {
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"There is negative response in cache while serv connect");
      }
      FUN_0094e12c(param_1,local_68,&local_6c);
      uVar11 = 10;
      goto LAB_00953bb8;
    }
  }
  if (*(long *)(lVar12 + 0x4a8) == 0) {
    uVar6 = FUN_0093456c(uVar11,uVar2,0xffffffff,0);
    if (uVar6 == 0) {
      uVar11 = 0;
      goto LAB_00953bb8;
    }
    if (uVar6 == 0xffffffff) {
      FUN_00904b80(param_1,"Error while waiting for server connect");
      uVar11 = 10;
      goto LAB_00953bb8;
    }
    if ((uVar6 >> 3 & 1) == 0) {
      uVar11 = 0;
      if ((uVar6 & 1) == 0) goto LAB_00953bb8;
      goto LAB_00953a88;
    }
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      pcVar10 = "Ready to accept data connection from server";
      goto LAB_00953c6c;
    }
LAB_00953c74:
    uVar11 = 0;
    *param_2 = 1;
  }
  else {
LAB_00953a88:
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Ctrl conn has data while waiting for data conn");
    }
    if (3 < *(ulong *)(lVar12 + 0x4a8)) {
      lVar7 = FUN_00904974(lVar7);
      pbVar9 = (byte *)(lVar7 + *(long *)(lVar12 + 0x4b0));
      if ((((*pbVar9 - 0x30 < 10) && (pbVar9[1] - 0x30 < 10)) && (pbVar9[2] - 0x30 < 10)) &&
         (pbVar9[3] == 0x20)) {
        strtol((char *)pbVar9,(char **)0x0,10);
        iVar5 = FUN_00963a68();
        if (iVar5 == 0xe2) {
          if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
             ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))
             ) {
            pcVar10 = "Got 226 before data activity";
LAB_00953c6c:
            FUN_00904c98(param_1,pcVar10);
          }
          goto LAB_00953c74;
        }
      }
    }
    FUN_0094e12c(param_1,local_68,&local_6c);
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"FTP code: %03d",local_6c);
    }
    uVar11 = 10;
    if (local_6c < 400) {
      uVar11 = 8;
    }
  }
LAB_00953bb8:
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar11);
  }
  return;
}


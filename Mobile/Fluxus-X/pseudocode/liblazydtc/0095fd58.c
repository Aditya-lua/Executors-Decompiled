/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095fd58
 */

void FUN_0095fd58(undefined4 *param_1,undefined4 param_2)

{
  ushort uVar1;
  undefined2 uVar2;
  ushort uVar3;
  long lVar4;
  time_t tVar5;
  ssize_t sVar6;
  ssize_t sVar7;
  undefined4 *puVar8;
  undefined8 uVar9;
  int iVar10;
  undefined4 uVar11;
  long lVar12;
  undefined1 auStack_148 [256];
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  lVar12 = *(long *)(param_1 + 4);
  switch(param_2) {
  case 3:
    uVar1 = *(ushort *)(param_1 + 0x51);
    uVar3 = *(ushort *)(*(long *)(param_1 + 0x52) + 2) >> 8 |
            *(ushort *)(*(long *)(param_1 + 0x52) + 2) << 8;
    if ((ushort)(uVar1 + 1) == uVar3) {
      param_1[7] = 0;
    }
    else {
      if (uVar1 != uVar3) {
        if (lVar12 != 0) {
          sVar6 = 0;
          if ((*(byte *)(lVar12 + 0xa85) >> 4 & 1) == 0) goto LAB_00960028;
          if ((*(long *)(lVar12 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(lVar12 + 0x12a0) + 8))) {
            FUN_00904c98(lVar12,"Received unexpected DATA packet block %d, expecting block %d",uVar3
                         ,uVar1 + 1);
          }
        }
        sVar6 = 0;
        goto LAB_00960028;
      }
      if (((lVar12 != 0) && ((*(byte *)(lVar12 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(lVar12 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar12 + 0x12a0) + 8))))) {
        FUN_00904c98(lVar12,"Received last DATA packet block %d again.",uVar3);
      }
    }
    *(ushort *)(param_1 + 0x51) = uVar3;
    **(undefined1 **)(param_1 + 0x54) = 0;
    *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 4;
    uVar2 = *(undefined2 *)(param_1 + 0x51);
    *(char *)(*(long *)(param_1 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(param_1 + 0x54) + 3) = (char)uVar2;
    sVar6 = sendto(param_1[6],*(void **)(param_1 + 0x54),4,0x4000,(sockaddr *)(param_1 + 0x2c),
                   param_1[0x4c]);
    if (-1 < sVar6) {
      uVar11 = 3;
      if ((long)(int)param_1[0x4f] + 4 <= (long)(int)param_1[0x4d]) {
        uVar11 = 1;
      }
LAB_0095fe90:
      *param_1 = uVar11;
      tVar5 = time((time_t *)0x0);
      sVar6 = 0;
      *(time_t *)(param_1 + 10) = tVar5;
      goto LAB_00960028;
    }
    break;
  default:
    FUN_00904b80(lVar12,&DAT_002b6c62,"tftp_rx: internal error");
    sVar6 = 0x47;
    goto LAB_00960028;
  case 5:
    **(undefined1 **)(param_1 + 0x54) = 0;
    *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 5;
    uVar2 = *(undefined2 *)(param_1 + 0x51);
    *(char *)(*(long *)(param_1 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(param_1 + 0x54) + 3) = (char)uVar2;
    sendto(param_1[6],*(void **)(param_1 + 0x54),4,0x4000,(sockaddr *)(param_1 + 0x2c),param_1[0x4c]
          );
    sVar6 = 0;
    *param_1 = 3;
    goto LAB_00960028;
  case 6:
    *(undefined2 *)(param_1 + 0x51) = 0;
    param_1[7] = 0;
    **(undefined1 **)(param_1 + 0x54) = 0;
    *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 4;
    uVar2 = *(undefined2 *)(param_1 + 0x51);
    *(char *)(*(long *)(param_1 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(param_1 + 0x54) + 3) = (char)uVar2;
    sVar6 = sendto(param_1[6],*(void **)(param_1 + 0x54),4,0x4000,(sockaddr *)(param_1 + 0x2c),
                   param_1[0x4c]);
    if (-1 < sVar6) {
      uVar11 = 1;
      goto LAB_0095fe90;
    }
    break;
  case 7:
    iVar10 = param_1[7] + 1;
    param_1[7] = iVar10;
    if (((lVar12 != 0) && ((*(byte *)(lVar12 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(lVar12 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar12 + 0x12a0) + 8))))) {
      FUN_00904c98(lVar12,"Timeout waiting for block %d ACK. Retries = %d",
                   *(short *)(param_1 + 0x51) + 1);
      iVar10 = param_1[7];
    }
    if ((int)param_1[9] < iVar10) {
      sVar6 = 0;
      param_1[2] = 0xffffff9d;
      *param_1 = 3;
      goto LAB_00960028;
    }
    sVar7 = sendto(param_1[6],*(void **)(param_1 + 0x54),4,0x4000,(sockaddr *)(param_1 + 0x2c),
                   param_1[0x4c]);
    sVar6 = 0;
    if (-1 < sVar7) goto LAB_00960028;
  }
  puVar8 = (undefined4 *)__errno(sVar6);
  uVar9 = FUN_00941a94(*puVar8,auStack_148,0x100);
  FUN_00904b80(lVar12,&DAT_002b6c62,uVar9);
  sVar6 = 0x37;
LAB_00960028:
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(sVar6);
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00960098
 */

void FUN_00960098(undefined4 *param_1,undefined4 param_2)

{
  int *piVar1;
  undefined2 uVar2;
  ushort uVar3;
  long lVar4;
  time_t tVar5;
  ssize_t sVar6;
  ssize_t sVar7;
  undefined4 *puVar8;
  undefined8 uVar9;
  long lVar10;
  short sVar11;
  int iVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined1 auStack_164 [4];
  long local_160;
  undefined1 auStack_158 [264];
  
  lVar4 = tpidr_el0;
  lVar13 = *(long *)(lVar4 + 0x28);
  lVar14 = *(long *)(param_1 + 4);
  switch(param_2) {
  case 4:
    uVar3 = *(ushort *)(*(long *)(param_1 + 0x52) + 2) >> 8 |
            *(ushort *)(*(long *)(param_1 + 0x52) + 2) << 8;
    if ((uVar3 == *(ushort *)(param_1 + 0x51)) ||
       ((*(ushort *)(param_1 + 0x51) == 0 && (uVar3 == 0xffff)))) {
      tVar5 = time((time_t *)0x0);
      *(time_t *)(param_1 + 10) = tVar5;
      sVar11 = *(short *)(param_1 + 0x51) + 1;
      goto LAB_00960138;
    }
    if (((lVar14 != 0) && ((*(byte *)(lVar14 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(lVar14 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar14 + 0x12a0) + 8))))) {
      FUN_00904c98(lVar14,"Received ACK for block %d, expecting %d");
    }
    iVar12 = param_1[7];
    param_1[7] = iVar12 + 1;
    if (iVar12 < (int)param_1[9]) {
      sVar7 = sendto(param_1[6],*(void **)(param_1 + 0x54),(long)(int)param_1[0x4e] + 4,0x4000,
                     (sockaddr *)(param_1 + 0x2c),param_1[0x4c]);
      sVar6 = 0;
      if (-1 < sVar7) goto LAB_00960408;
      goto LAB_009603c4;
    }
    FUN_00904b80(lVar14,"tftp_tx: giving up waiting for block %d ack",
                 *(undefined2 *)(param_1 + 0x51));
    break;
  case 5:
    *param_1 = 3;
    **(undefined1 **)(param_1 + 0x54) = 0;
    *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 5;
    uVar2 = *(undefined2 *)(param_1 + 0x51);
    *(char *)(*(long *)(param_1 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(param_1 + 0x54) + 3) = (char)uVar2;
    sendto(param_1[6],*(void **)(param_1 + 0x54),4,0x4000,(sockaddr *)(param_1 + 0x2c),param_1[0x4c]
          );
    sVar6 = 0;
    *param_1 = 3;
    goto LAB_00960408;
  case 6:
    sVar11 = 1;
LAB_00960138:
    *(short *)(param_1 + 0x51) = sVar11;
    param_1[7] = 0;
    **(undefined1 **)(param_1 + 0x54) = 0;
    *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 3;
    uVar2 = *(undefined2 *)(param_1 + 0x51);
    *(char *)(*(long *)(param_1 + 0x54) + 2) = (char)((ushort)uVar2 >> 8);
    *(char *)(*(long *)(param_1 + 0x54) + 3) = (char)uVar2;
    if (*(ushort *)(param_1 + 0x51) < 2) {
      iVar12 = param_1[0x4f];
    }
    else {
      iVar12 = param_1[0x4f];
      if ((int)param_1[0x4e] < iVar12) {
        sVar6 = 0;
        *param_1 = 3;
        goto LAB_00960408;
      }
    }
    lVar10 = 0;
    piVar1 = param_1 + 0x4e;
    *piVar1 = 0;
    lVar15 = *(long *)(param_1 + 0x54) + 4;
    do {
      sVar6 = FUN_00935b84(lVar14,lVar15,(long)(iVar12 - (int)lVar10),&local_160,auStack_164);
      if ((int)sVar6 != 0) goto LAB_00960408;
      lVar10 = (long)*piVar1 + (long)(int)local_160;
      *piVar1 = (int)lVar10;
      if (local_160 == 0) break;
      iVar12 = param_1[0x4f];
      lVar15 = lVar15 + local_160;
    } while ((int)lVar10 < iVar12);
    sVar6 = sendto(param_1[6],*(void **)(param_1 + 0x54),lVar10 + 4,0x4000,
                   (sockaddr *)(param_1 + 0x2c),param_1[0x4c]);
    if (-1 < sVar6) {
      lVar10 = *(long *)(lVar14 + 0xf0) + (long)*piVar1;
      *(long *)(lVar14 + 0xf0) = lVar10;
      goto LAB_00960340;
    }
LAB_009603c4:
    puVar8 = (undefined4 *)__errno(sVar6);
    uVar9 = FUN_00941a94(*puVar8,auStack_158,0x100);
    FUN_00904b80(lVar14,&DAT_002b6c62,uVar9);
    break;
  case 7:
    iVar12 = param_1[7] + 1;
    param_1[7] = iVar12;
    if (((lVar14 != 0) && ((*(byte *)(lVar14 + 0xa85) >> 4 & 1) != 0)) &&
       ((*(long *)(lVar14 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar14 + 0x12a0) + 8))))) {
      FUN_00904c98(lVar14,"Timeout waiting for block %d ACK.  Retries = %d",
                   *(short *)(param_1 + 0x51) + 1);
      iVar12 = param_1[7];
    }
    if ((int)param_1[9] < iVar12) {
      sVar6 = 0;
      param_1[2] = 0xffffff9d;
      *param_1 = 3;
      goto LAB_00960408;
    }
    sVar6 = sendto(param_1[6],*(void **)(param_1 + 0x54),(long)(int)param_1[0x4e] + 4,0x4000,
                   (sockaddr *)(param_1 + 0x2c),param_1[0x4c]);
    if (sVar6 < 0) goto LAB_009603c4;
    lVar10 = *(long *)(lVar14 + 0xf0);
LAB_00960340:
    FUN_00931fec(lVar14,lVar10);
    goto LAB_00960348;
  default:
    FUN_00904b80(lVar14,"tftp_tx: internal error, event: %i",param_2);
LAB_00960348:
    sVar6 = 0;
    goto LAB_00960408;
  }
  sVar6 = 0x37;
LAB_00960408:
  if (*(long *)(lVar4 + 0x28) != lVar13) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(sVar6);
  }
  return;
}


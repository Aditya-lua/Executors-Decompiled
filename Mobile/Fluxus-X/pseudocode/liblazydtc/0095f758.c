/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095f758
 */

void FUN_0095f758(undefined4 *param_1,ulong param_2)

{
  uint uVar1;
  long lVar2;
  char *pcVar3;
  undefined8 uVar4;
  size_t sVar5;
  undefined4 *puVar6;
  char *pcVar7;
  uint uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  int iVar13;
  char *local_160;
  char local_158 [256];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  lVar10 = *(long *)(param_1 + 4);
  switch(*param_1) {
  case 0:
    uVar1 = *(uint *)(lVar10 + 0x131c);
    pcVar7 = "octet";
    if ((uVar1 & 0x1000) != 0) {
      pcVar7 = "netascii";
    }
    switch(param_2 & 0xffffffff) {
    case 0:
    case 7:
      iVar13 = param_1[7];
      param_1[7] = iVar13 + 1;
      if ((int)param_1[9] <= iVar13) {
        uVar4 = 0;
        param_1[2] = 0xffffff9e;
        *param_1 = 3;
        goto LAB_0095fa0c;
      }
      uVar8 = *(uint *)(lVar10 + 0x131c);
      **(undefined1 **)(param_1 + 0x54) = 0;
      if ((uVar8 >> 0x11 & 1) == 0) {
        *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 1;
      }
      else {
        *(undefined1 *)(*(long *)(param_1 + 0x54) + 1) = 2;
        if (*(long *)(lVar10 + 0x1158) != -1) {
          FUN_00931c50(lVar10);
        }
      }
      uVar4 = FUN_0091583c(*(long *)(*(long *)(param_1 + 4) + 0x11a8) + 1,0,&local_160,0,4);
      pcVar3 = local_160;
      if ((int)uVar4 != 0) goto LAB_0095fa0c;
      sVar5 = strlen(local_160);
      lVar9 = -9;
      if ((uVar1 & 0x1000) != 0) {
        lVar9 = -0xc;
      }
      if ((ulong)(lVar9 + (int)param_1[0x4f]) < sVar5) {
        pcVar7 = "TFTP filename too long";
      }
      else {
        curl_msnprintf(*(long *)(param_1 + 0x54) + 2,(long)(int)param_1[0x4f],"%s%c%s%c",pcVar3,0,
                       pcVar7,0);
        sVar5 = strlen(local_160);
        lVar9 = 9;
        if ((uVar1 & 0x1000) != 0) {
          lVar9 = 0xc;
        }
        uVar12 = sVar5 + lVar9;
        if ((*(byte *)(lVar10 + 0xa82) >> 2 & 1) != 0) {
LAB_0095fce8:
          lVar9 = *(long *)(*(long *)(lVar10 + 0x20) + 0x38);
          sVar5 = sendto(param_1[6],*(void **)(param_1 + 0x54),uVar12,0,(sockaddr *)(lVar9 + 0x10),
                         *(socklen_t *)(lVar9 + 0xc));
          if (sVar5 != uVar12) {
            puVar6 = (undefined4 *)__errno();
            uVar4 = FUN_00941a94(*puVar6,local_158,0x100);
            FUN_00904b80(lVar10,&DAT_002b6c62,uVar4);
          }
          (*(code *)PTR_free_00cc4678)(local_160);
          goto LAB_0095f93c;
        }
        if (((*(byte *)(lVar10 + 0x131e) >> 1 & 1) == 0) || (*(long *)(lVar10 + 0x1158) == -1)) {
          local_158[0] = '0';
          local_158[1] = '\0';
        }
        else {
          curl_msnprintf(local_158,0x40,&DAT_002d11bf);
        }
        uVar11 = uVar12 + 6;
        if ((ulong)(long)(int)param_1[0x4f] < uVar11) {
          iVar13 = 0x47;
          uVar11 = uVar12;
        }
        else {
          lVar9 = *(long *)(param_1 + 0x54);
          *(undefined2 *)((undefined4 *)(lVar9 + uVar12) + 1) = 0x65;
          *(undefined4 *)(lVar9 + uVar12) = 0x7a697374;
          sVar5 = strlen(local_158);
          if ((ulong)(long)(int)param_1[0x4f] < sVar5 + uVar12 + 7) {
            iVar13 = 0x47;
          }
          else {
            strcpy((char *)(*(long *)(param_1 + 0x54) + uVar11),local_158);
            sVar5 = strlen(local_158);
            iVar13 = 0;
            uVar11 = sVar5 + uVar12 + 7;
          }
        }
        curl_msnprintf(local_158,0x40,&DAT_002c6d41,param_1[0x50]);
        uVar12 = uVar11;
        if (iVar13 == 0) {
          uVar12 = uVar11 + 8;
          if ((ulong)(long)(int)param_1[0x4f] < uVar12) {
            iVar13 = 0x47;
            uVar12 = uVar11;
          }
          else {
            *(undefined8 *)(*(long *)(param_1 + 0x54) + uVar11) = 0x657a69736b6c62;
            sVar5 = strlen(local_158);
            if ((ulong)(long)(int)param_1[0x4f] < sVar5 + uVar11 + 9) {
              iVar13 = 0x47;
            }
            else {
              strcpy((char *)(*(long *)(param_1 + 0x54) + uVar12),local_158);
              sVar5 = strlen(local_158);
              iVar13 = 0;
              uVar12 = sVar5 + uVar11 + 9;
            }
          }
        }
        curl_msnprintf(local_158,0x40,&DAT_002c6d41,param_1[8]);
        if ((iVar13 == 0) && (uVar12 + 8 <= (ulong)(long)(int)param_1[0x4f])) {
          *(undefined8 *)(*(long *)(param_1 + 0x54) + uVar12) = 0x74756f656d6974;
          sVar5 = strlen(local_158);
          if (sVar5 + uVar12 + 9 <= (ulong)(long)(int)param_1[0x4f]) {
            strcpy((char *)(*(long *)(param_1 + 0x54) + uVar12 + 8),local_158);
            sVar5 = strlen(local_158);
            uVar12 = sVar5 + uVar12 + 9;
            goto LAB_0095fce8;
          }
        }
        pcVar7 = "TFTP buffer too small for options";
      }
      FUN_00904b80(lVar10,pcVar7);
      (*(code *)PTR_free_00cc4678)(local_160);
      uVar4 = 0x47;
      goto LAB_0095fa0c;
    default:
      FUN_00904b80(lVar10,"tftp_send_first: internal error");
      goto LAB_0095f93c;
    case 3:
      if (((*(byte *)(lVar10 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(lVar10 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar10 + 0x12a0) + 8))))) {
        FUN_00904c98(lVar10,&DAT_002b6c62,"Connected for receive");
      }
      *param_1 = 1;
      uVar4 = FUN_0095f5d8(param_1);
      if ((int)uVar4 != 0) goto LAB_0095fa0c;
      param_2 = 3;
      break;
    case 4:
      if (((*(byte *)(lVar10 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(lVar10 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar10 + 0x12a0) + 8))))) {
        FUN_00904c98(lVar10,&DAT_002b6c62,"Connected for transmit");
      }
      *param_1 = 2;
      uVar4 = FUN_0095f5d8(param_1);
      if ((int)uVar4 != 0) goto LAB_0095fa0c;
      param_2 = 4;
      goto switchD_0095f7a4_caseD_2;
    case 5:
      uVar4 = 0;
      *param_1 = 3;
      goto LAB_0095fa0c;
    case 6:
      uVar8 = (uint)*(undefined8 *)(lVar10 + 0xa82);
      if ((uVar1 >> 0x11 & 1) != 0) {
        if (((uVar8 >> 0x1c & 1) != 0) &&
           ((*(long *)(lVar10 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar10 + 0x12a0) + 8))))) {
          FUN_00904c98(lVar10,&DAT_002b6c62,"Connected for transmit");
        }
        *param_1 = 2;
        uVar4 = FUN_0095f5d8(param_1);
        if ((int)uVar4 != 0) goto LAB_0095fa0c;
        param_2 = 6;
        goto switchD_0095f7a4_caseD_2;
      }
      if (((uVar8 >> 0x1c & 1) != 0) &&
         ((*(long *)(lVar10 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(lVar10 + 0x12a0) + 8))))) {
        FUN_00904c98(lVar10,&DAT_002b6c62,"Connected for receive");
      }
      *param_1 = 1;
      uVar4 = FUN_0095f5d8(param_1);
      if ((int)uVar4 != 0) goto LAB_0095fa0c;
      param_2 = 6;
    }
  case 1:
    uVar4 = FUN_0095fd58(param_1,param_2);
    break;
  case 2:
switchD_0095f7a4_caseD_2:
    uVar4 = FUN_00960098(param_1,param_2);
    break;
  case 3:
    if (lVar10 != 0) {
      uVar4 = 0;
      if ((*(byte *)(lVar10 + 0xa85) >> 4 & 1) == 0) break;
      if ((*(long *)(lVar10 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(lVar10 + 0x12a0) + 8))) {
        FUN_00904c98(lVar10,&DAT_002b6c62,"TFTP finished");
      }
    }
LAB_0095f93c:
    uVar4 = 0;
    break;
  default:
    FUN_00904b80(lVar10,&DAT_002b6c62,"Internal state machine error");
    uVar4 = 0x47;
  }
LAB_0095fa0c:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}


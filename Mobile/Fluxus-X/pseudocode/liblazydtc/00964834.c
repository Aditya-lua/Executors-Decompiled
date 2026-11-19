/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00964834
 */

void FUN_00964834(byte *param_1,long *param_2)

{
  byte bVar1;
  byte bVar2;
  long lVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  char *pcVar7;
  char *pcVar8;
  undefined8 uVar9;
  byte *pbVar10;
  long lVar11;
  long lVar12;
  bool bVar13;
  char *local_578;
  byte local_570 [1024];
  byte local_170 [256];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  lVar12 = *param_2;
  (*(code *)PTR_free_00cc4678)(lVar12);
  *param_2 = 0;
  (*(code *)PTR_free_00cc4678)(param_2[1]);
  param_2[1] = 0;
  (*(code *)PTR_free_00cc4678)(param_2[2]);
  param_2[2] = 0;
  (*(code *)PTR_free_00cc4678)(param_2[3]);
  param_2[3] = 0;
  (*(code *)PTR_free_00cc4678)(param_2[4]);
  param_2[4] = 0;
  (*(code *)PTR_free_00cc4678)(param_2[5]);
  bVar13 = false;
  bVar4 = false;
  param_2[5] = 0;
  *(undefined4 *)(param_2 + 6) = 0;
  *(undefined1 *)((long)param_2 + 0x34) = 0;
  *(byte *)((long)param_2 + 0x35) = *(byte *)((long)param_2 + 0x35) & 0xfc;
  do {
    for (; (bVar1 = *param_1, bVar1 == 9 || (bVar1 == 0x20)); param_1 = param_1 + 1) {
    }
    for (lVar11 = 0; ((bVar1 != 0 && (bVar1 != 0x3d)) && ((int)lVar11 != 0xff)); lVar11 = lVar11 + 1
        ) {
      local_170[lVar11] = bVar1;
      bVar1 = param_1[lVar11 + 1];
    }
    pbVar10 = param_1 + lVar11;
    local_170[lVar11] = 0;
    if (*pbVar10 != 0x3d) {
LAB_00964dbc:
      if ((((lVar12 == 0) || ((*(byte *)((long)param_2 + 0x35) & 1) != 0)) && (*param_2 != 0)) &&
         ((param_2[4] != 0 || ((*(byte *)((long)param_2 + 0x34) & 1) == 0)))) {
        uVar9 = 0;
      }
      else {
LAB_00964de8:
        uVar9 = 0x3d;
      }
      goto LAB_00964dec;
    }
    bVar1 = pbVar10[1];
    param_1 = pbVar10 + 2;
    if (bVar1 != 0x22) {
      param_1 = pbVar10 + 1;
    }
    bVar2 = *param_1;
    if (bVar2 == 0) {
      pbVar10 = local_570;
    }
    else {
      bVar5 = false;
      iVar6 = 0x3fe;
      pbVar10 = local_570;
      do {
        if (bVar5) {
switchD_009649b8_caseD_b:
          bVar5 = false;
          *pbVar10 = bVar2;
          pbVar10 = pbVar10 + 1;
        }
        else {
          switch(bVar2) {
          case 10:
          case 0xd:
            if (bVar1 == 0x22) goto LAB_00964dbc;
            break;
          case 0xb:
          case 0xc:
          case 0xe:
          case 0xf:
          case 0x10:
          case 0x11:
          case 0x12:
          case 0x13:
          case 0x14:
          case 0x15:
          case 0x16:
          case 0x17:
          case 0x18:
          case 0x19:
          case 0x1a:
          case 0x1b:
          case 0x1c:
          case 0x1d:
          case 0x1e:
          case 0x1f:
          case 0x20:
          case 0x21:
          case 0x23:
          case 0x24:
          case 0x25:
          case 0x26:
          case 0x27:
          case 0x28:
          case 0x29:
          case 0x2a:
          case 0x2b:
            goto switchD_009649b8_caseD_b;
          case 0x22:
            if (bVar1 != 0x22) goto LAB_00964dbc;
            break;
          case 0x2c:
            if (bVar1 == 0x22) goto switchD_009649b8_caseD_b;
            break;
          default:
            if ((bVar2 != 0x5c) || (bVar1 != 0x22)) goto switchD_009649b8_caseD_b;
            bVar5 = true;
            goto LAB_009649fc;
          }
          iVar6 = 0;
          bVar5 = false;
        }
LAB_009649fc:
        param_1 = param_1 + 1;
        bVar2 = *param_1;
      } while ((iVar6 != 0) && (iVar6 = iVar6 - (uint)(bVar2 != 0), bVar2 != 0));
      if (bVar5) goto LAB_00964dbc;
    }
    *pbVar10 = 0;
    iVar6 = curl_strequal(local_170,"nonce");
    if (iVar6 != 0) {
      (*(code *)PTR_free_00cc4678)(*param_2);
      lVar11 = (*(code *)PTR_strdup_00cc4688)(local_570);
      *param_2 = lVar11;
      goto joined_r0x00964cb8;
    }
    iVar6 = curl_strequal(local_170,"stale");
    if (iVar6 != 0) {
      iVar6 = curl_strequal(local_570,&DAT_002b8dd9);
      if (iVar6 != 0) {
        *(byte *)((long)param_2 + 0x35) = *(byte *)((long)param_2 + 0x35) | 1;
        *(undefined4 *)(param_2 + 6) = 1;
      }
      goto LAB_00964d98;
    }
    iVar6 = curl_strequal(local_170,"realm");
    if (iVar6 == 0) {
      iVar6 = curl_strequal(local_170,"opaque");
      if (iVar6 != 0) {
        (*(code *)PTR_free_00cc4678)(param_2[3]);
        lVar11 = (*(code *)PTR_strdup_00cc4688)(local_570);
        param_2[3] = lVar11;
        goto joined_r0x00964cb8;
      }
      iVar6 = curl_strequal(local_170,&DAT_002d92b5);
      if (iVar6 != 0) {
        local_578 = (char *)0x0;
        pcVar7 = (char *)(*(code *)PTR_strdup_00cc4688)(local_570);
        pcVar8 = pcVar7;
        if (pcVar7 != (char *)0x0) {
          while (pcVar8 = strtok_r(pcVar8,",",&local_578), pcVar8 != (char *)0x0) {
            for (; (*pcVar8 == ' ' || (*pcVar8 == '\t')); pcVar8 = pcVar8 + 1) {
            }
            iVar6 = curl_strequal(pcVar8,&DAT_002d1218);
            if (iVar6 == 0) {
              iVar6 = curl_strequal(pcVar8,"auth-int");
              bVar4 = (bool)(bVar4 | iVar6 != 0);
            }
            else {
              bVar13 = true;
            }
            pcVar8 = (char *)0x0;
          }
          (*(code *)PTR_free_00cc4678)(pcVar7);
          if (bVar13) {
            (*(code *)PTR_free_00cc4678)(param_2[4]);
            lVar11 = (*(code *)PTR_strdup_00cc4688)(&DAT_002d1218);
            param_2[4] = lVar11;
          }
          else {
            if (!bVar4) goto LAB_00964d98;
            (*(code *)PTR_free_00cc4678)(param_2[4]);
            lVar11 = (*(code *)PTR_strdup_00cc4688)("auth-int");
            param_2[4] = lVar11;
          }
          goto joined_r0x00964cb8;
        }
LAB_00964e1c:
        uVar9 = 0x1b;
LAB_00964dec:
        if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail(uVar9);
        }
        return;
      }
      iVar6 = curl_strequal(local_170,"algorithm");
      if (iVar6 == 0) {
        iVar6 = curl_strequal(local_170,"userhash");
        if ((iVar6 != 0) && (iVar6 = curl_strequal(local_570,&DAT_002b8dd9), iVar6 != 0)) {
          *(byte *)((long)param_2 + 0x35) = *(byte *)((long)param_2 + 0x35) | 2;
        }
      }
      else {
        (*(code *)PTR_free_00cc4678)(param_2[5]);
        lVar11 = (*(code *)PTR_strdup_00cc4688)(local_570);
        param_2[5] = lVar11;
        if (lVar11 == 0) goto LAB_00964e1c;
        iVar6 = curl_strequal(local_570,"MD5-sess");
        if (iVar6 == 0) {
          iVar6 = curl_strequal(local_570,&DAT_002d53fd);
          if (iVar6 == 0) {
            iVar6 = curl_strequal(local_570,"SHA-256");
            if (iVar6 == 0) {
              iVar6 = curl_strequal(local_570,"SHA-256-SESS");
              if (iVar6 == 0) {
                iVar6 = curl_strequal(local_570,"SHA-512-256");
                if (iVar6 == 0) {
                  iVar6 = curl_strequal(local_570,"SHA-512-256-SESS");
                  if (iVar6 == 0) goto LAB_00964de8;
                  *(undefined1 *)((long)param_2 + 0x34) = 5;
                }
                else {
                  *(undefined1 *)((long)param_2 + 0x34) = 4;
                }
              }
              else {
                *(undefined1 *)((long)param_2 + 0x34) = 3;
              }
            }
            else {
              *(undefined1 *)((long)param_2 + 0x34) = 2;
            }
          }
          else {
            *(undefined1 *)((long)param_2 + 0x34) = 0;
          }
        }
        else {
          *(undefined1 *)((long)param_2 + 0x34) = 1;
        }
      }
    }
    else {
      (*(code *)PTR_free_00cc4678)(param_2[2]);
      lVar11 = (*(code *)PTR_strdup_00cc4688)(local_570);
      param_2[2] = lVar11;
joined_r0x00964cb8:
      if (lVar11 == 0) goto LAB_00964e1c;
    }
LAB_00964d98:
    for (; (bVar1 = *param_1, bVar1 == 9 || (bVar1 == 0x20)); param_1 = param_1 + 1) {
    }
    if (bVar1 == 0x2c) {
      param_1 = param_1 + 1;
    }
  } while( true );
}


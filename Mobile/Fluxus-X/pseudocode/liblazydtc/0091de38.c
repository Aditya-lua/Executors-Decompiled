/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091de38
 */

int FUN_0091de38(long param_1,void *param_2,size_t param_3,long *param_4)

{
  bool bVar1;
  uint *puVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  void *pvVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  long lVar12;
  char cVar13;
  undefined8 *puVar14;
  char *pcVar15;
  long local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if ((*(byte *)(param_1 + 0x1b1) & 1) == 0) {
    iVar6 = 0;
    *param_4 = 0;
  }
  else {
    puVar2 = (uint *)(param_1 + 0x1b1);
    lVar12 = *(long *)(param_1 + 0x20);
    lVar3 = param_1 + 0xc60;
    *param_4 = 0;
    do {
      if ((param_3 == 0) || ((*(byte *)puVar2 & 1) == 0)) goto LAB_0091e090;
      pvVar7 = memchr(param_2,10,param_3);
      if (pvVar7 == (void *)0x0) {
        iVar6 = FUN_009045fc(lVar3,param_2,param_3);
        if (iVar6 == 0) {
          *param_4 = *param_4 + param_3;
          if (*(int *)(param_1 + 0x114) != 0) goto LAB_0091e090;
          uVar8 = FUN_00904974(lVar3);
          uVar9 = FUN_00904984(lVar3);
          if ((*(byte *)(*(long *)(lVar12 + 0x3a8) + 0x8e) >> 2 & 1) == 0) {
            puVar14 = *(undefined8 **)(param_1 + 0x6f8);
            bVar1 = 4 < uVar9;
            goto joined_r0x0091e190;
          }
          if (4 < uVar9) {
            uVar9 = 5;
          }
          iVar6 = curl_strnequal("RTSP/",uVar8,uVar9);
          if (iVar6 == 0) goto LAB_0091e228;
          goto LAB_0091e090;
        }
        break;
      }
      lVar4 = (long)pvVar7 + (1 - (long)param_2);
      local_70 = lVar4;
      iVar6 = FUN_009045fc(lVar3,param_2,lVar4);
      if (iVar6 != 0) break;
      *param_4 = *param_4 + lVar4;
      if (*(int *)(param_1 + 0x114) == 0) {
        uVar8 = FUN_00904974(lVar3);
        uVar9 = FUN_00904984(lVar3);
        if ((*(byte *)(*(long *)(lVar12 + 0x3a8) + 0x8e) >> 2 & 1) == 0) {
          bVar1 = 4 < uVar9;
          for (puVar14 = *(undefined8 **)(param_1 + 0x6f8); puVar14 != (undefined8 *)0x0;
              puVar14 = (undefined8 *)puVar14[1]) {
            pcVar15 = (char *)*puVar14;
            uVar10 = strlen(pcVar15);
            if (uVar9 <= uVar10) {
              uVar10 = uVar9;
            }
            iVar6 = curl_strnequal(pcVar15,uVar8,uVar10);
            if (iVar6 != 0) {
              cVar13 = '\0';
              if (4 < uVar9) goto LAB_0091dff0;
              goto LAB_0091df9c;
            }
          }
          cVar13 = '\x02';
LAB_0091df9c:
          if (4 < uVar9) {
            uVar9 = 5;
          }
          iVar6 = curl_strnequal("HTTP/",uVar8,uVar9);
          if (iVar6 != 0) {
            cVar13 = bVar1;
          }
          if (cVar13 == '\x02') {
LAB_0091e0f8:
            FUN_00908c4c(lVar12,2);
            if (9 < *(byte *)(lVar12 + 0x574)) goto LAB_0091e114;
            if ((*(byte *)(param_1 + 0xa88) >> 4 & 1) == 0) goto LAB_0091e144;
            *puVar2 = *puVar2 & 0xfffffffe;
            goto LAB_0091e0a4;
          }
        }
        else {
          if (4 < uVar9) {
            uVar9 = 5;
          }
          iVar6 = curl_strnequal("RTSP/",uVar8,uVar9);
          if (iVar6 == 0) goto LAB_0091e0f8;
        }
      }
LAB_0091dff0:
      param_3 = param_3 - lVar4;
      param_2 = (void *)((long)param_2 + lVar4);
      uVar8 = FUN_00904974(lVar3);
      uVar11 = FUN_00904984(lVar3);
      iVar6 = FUN_0091d07c(param_1,uVar8,uVar11,&local_70);
      FUN_0090456c(lVar3);
      if (local_70 != 0) {
        param_3 = param_3 - local_70;
        param_2 = (void *)((long)param_2 + local_70);
        *param_4 = *param_4 + local_70;
      }
    } while (iVar6 == 0);
  }
  goto LAB_0091de84;
joined_r0x0091e190:
  if (puVar14 == (undefined8 *)0x0) goto LAB_0091e1c0;
  pcVar15 = (char *)*puVar14;
  uVar10 = strlen(pcVar15);
  if (uVar9 <= uVar10) {
    uVar10 = uVar9;
  }
  iVar6 = curl_strnequal(pcVar15,uVar8,uVar10);
  if (iVar6 != 0) {
    cVar13 = '\0';
    if (uVar9 < 5) goto LAB_0091e1c4;
    goto LAB_0091e090;
  }
  puVar14 = (undefined8 *)puVar14[1];
  goto joined_r0x0091e190;
LAB_0091e1c0:
  cVar13 = '\x02';
LAB_0091e1c4:
  if (4 < uVar9) {
    uVar9 = 5;
  }
  iVar6 = curl_strnequal("HTTP/",uVar8,uVar9);
  if (iVar6 != 0) {
    cVar13 = bVar1;
  }
  if (cVar13 == '\x02') {
LAB_0091e228:
    *puVar2 = *puVar2 & 0xfffffffe;
    FUN_00908c4c(lVar12,2);
    if (9 < *(byte *)(lVar12 + 0x574)) {
LAB_0091e114:
      FUN_00904b80(param_1,"Invalid status line");
      iVar6 = 8;
      goto LAB_0091de84;
    }
    if ((*(byte *)(param_1 + 0xa88) >> 4 & 1) == 0) {
LAB_0091e144:
      FUN_00904b80(param_1,"Received HTTP/0.9 when not allowed");
      iVar6 = 1;
      goto LAB_0091de84;
    }
  }
  else {
LAB_0091e090:
    if ((*(byte *)puVar2 & 1) == 0) {
      FUN_00904534(lVar3);
    }
  }
LAB_0091e0a4:
  iVar6 = 0;
  if ((*puVar2 & 1) == 0) {
    iVar6 = 0;
    if ((*puVar2 >> 0xf & 1) == 0) {
      lVar12 = FUN_00904984(lVar3);
      if (lVar12 == 0) {
        iVar6 = 0;
      }
      else {
        uVar8 = FUN_00904974(lVar3);
        uVar11 = FUN_00904984(lVar3);
        iVar6 = FUN_00934dd0(param_1,1,uVar8,uVar11);
      }
    }
    FUN_00904534(lVar3);
  }
LAB_0091de84:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}


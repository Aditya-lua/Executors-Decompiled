/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091c450
 */

void FUN_0091c450(long param_1,undefined1 *param_2,ulong param_3)

{
  uint *puVar1;
  undefined4 uVar2;
  char cVar3;
  long lVar4;
  bool bVar5;
  undefined4 uVar6;
  int iVar7;
  ulong uVar8;
  time_t tVar9;
  char *pcVar10;
  undefined8 uVar11;
  long lVar12;
  undefined8 uVar13;
  uint uVar14;
  long lVar15;
  long local_60;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  lVar15 = *(long *)(param_1 + 0x20);
  switch(*param_2) {
  case 0x41:
  case 0x61:
    if ((((*(long *)(param_1 + 0xaa0) != 0) && (7 < param_3)) &&
        ((*(uint *)(*(long *)(lVar15 + 0x3a8) + 0x94) & 1) != 0)) &&
       (iVar7 = curl_strnequal("Alt-Svc:",param_2,8), iVar7 != 0)) {
      uVar13 = *(undefined8 *)(param_1 + 0xaa0);
      uVar11 = *(undefined8 *)(lVar15 + 0x50);
      uVar6 = 0x10;
      if (*(char *)(lVar15 + 0x574) != '\x14') {
        uVar6 = 8;
      }
      uVar2 = 0x20;
      if (*(char *)(lVar15 + 0x574) != '\x1e') {
        uVar2 = uVar6;
      }
      uVar6 = FUN_00963a80(0x20,*(undefined4 *)(lVar15 + 0x560));
      uVar13 = FUN_0090387c(param_1,uVar13,param_2 + 8,uVar2,uVar11,uVar6);
      goto LAB_0091cdc8;
    }
    break;
  case 0x43:
  case 99:
    puVar1 = (uint *)(param_1 + 0x1b1);
    uVar14 = *puVar1;
    if ((((uVar14 >> 10 & 1) == 0) && (0xe < param_3)) &&
       ((*(ulong *)(param_1 + 0xa82) >> 0x21 & 1) == 0)) {
      iVar7 = curl_strnequal("Content-Length:",param_2,0xf);
      if (iVar7 == 0) {
        uVar14 = *puVar1;
        goto LAB_0091cabc;
      }
      uVar13 = FUN_00941b6c(param_2 + 0xf,0,10,&local_60);
      if ((int)uVar13 != 1) {
        if ((int)uVar13 == 0) {
          *(long *)(param_1 + 0xd8) = local_60;
          *(long *)(param_1 + 0xe0) = local_60;
        }
        else {
          FUN_00904b80(param_1,"Invalid Content-Length: value");
          uVar13 = 8;
        }
        goto LAB_0091cdc8;
      }
      if (*(long *)(param_1 + 0x708) != 0) {
        FUN_00904b80(param_1,"Maximum file size exceeded");
        uVar13 = 0x3f;
        goto LAB_0091cdc8;
      }
      FUN_00908c4c(lVar15,2);
      uVar13 = 0;
      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0091cdc8;
      if ((*(long *)(param_1 + 0x12a0) != 0) && (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1))
      goto LAB_0091cdc4;
      pcVar10 = "Overflow Content-Length: value";
LAB_0091cd58:
      FUN_00904c98(param_1,pcVar10);
    }
    else {
LAB_0091cabc:
      if ((((uVar14 >> 10 & 1) == 0) && (0x10 < param_3)) && (*(long *)(param_1 + 0x840) != 0)) {
        iVar7 = curl_strnequal("Content-Encoding:",param_2,0x11);
        if (iVar7 != 0) {
          uVar13 = FUN_0091ebb4(param_1,param_2 + 0x11,0);
          goto LAB_0091cdc8;
        }
LAB_0091cb04:
        iVar7 = curl_strnequal("Content-Type:",param_2,0xd);
        if (iVar7 != 0) {
          pcVar10 = (char *)FUN_00919a0c(param_2);
          if (pcVar10 == (char *)0x0) goto LAB_0091cbb0;
          if (*pcVar10 != '\0') {
            (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x1360));
            uVar13 = 0;
            *(char **)(param_1 + 0x1360) = pcVar10;
            goto LAB_0091cdc8;
          }
          goto LAB_0091c860;
        }
      }
      else {
        if (0xc < param_3) goto LAB_0091cb04;
        if (param_3 < 0xb) break;
      }
      iVar7 = curl_strnequal("Connection:",param_2,0xb);
      if (((param_3 < 0x11) || (iVar7 == 0)) ||
         (uVar8 = FUN_0091a870(param_2,"Connection:",0xb,"close",5), (uVar8 & 1) == 0)) {
        if (((*(char *)(lVar15 + 0x574) != '\n') ||
            (iVar7 = curl_strnequal("Connection:",param_2,0xb), param_3 < 0x16)) ||
           ((iVar7 == 0 ||
            (uVar8 = FUN_0091a870(param_2,"Connection:",0xb,"keep-alive",10), (uVar8 & 1) == 0)))) {
          if (((0xd < param_3) && ((*puVar1 >> 10 & 1) == 0)) &&
             (iVar7 = curl_strnequal("Content-Range:",param_2,0xe), iVar7 != 0)) {
            pcVar10 = param_2 + 0xe;
            cVar3 = *pcVar10;
            while (cVar3 != '\0') {
              if ((byte)(cVar3 - 0x30U) < 10) {
                iVar7 = FUN_00941b6c(pcVar10,0,10,param_1 + 0x118);
                if ((iVar7 == 0) && (*(long *)(param_1 + 0x1118) == *(long *)(param_1 + 0x118))) {
                  *puVar1 = *puVar1 | 4;
                }
                goto switchD_0091c4a8_caseD_42;
              }
              if (cVar3 == '*') break;
              pcVar10 = pcVar10 + 1;
              cVar3 = *pcVar10;
            }
            if (*(int *)(param_1 + 0x124) < 300) {
              *(undefined8 *)(param_1 + 0x1118) = 0;
            }
          }
          break;
        }
        FUN_00908c4c(lVar15,0);
        uVar13 = 0;
        if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0091cdc8;
        if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
          pcVar10 = "HTTP/1.0 connection set to keep alive";
          goto LAB_0091cd58;
        }
      }
      else {
        FUN_00908c4c(lVar15,2);
      }
    }
    goto LAB_0091cdc4;
  case 0x4c:
  case 0x6c:
    if ((*(byte *)(param_1 + 0x1b2) >> 2 & 1) == 0) {
      if (*(char *)(param_1 + 0x528) == '\0') {
        if ((0xd < param_3) && (((uint)*(undefined8 *)(param_1 + 0xa82) >> 7 & 1) != 0))
        goto LAB_0091c8f8;
      }
      else if (0xd < param_3) {
LAB_0091c8f8:
        iVar7 = curl_strnequal("Last-Modified:",param_2,0xe);
        if (iVar7 != 0) {
          uVar11 = FUN_009313b8(param_2 + 0xe);
          uVar13 = 0;
          *(undefined8 *)(param_1 + 0x188) = uVar11;
          if (*(char *)(param_1 + 0xa82) < '\0') {
            uVar13 = 0;
            *(undefined8 *)(param_1 + 0x1338) = uVar11;
          }
          goto LAB_0091cdc8;
        }
      }
    }
    if (((299 < *(int *)(param_1 + 0x124)) && (8 < param_3)) &&
       ((*(int *)(param_1 + 0x124) < 400 &&
        ((iVar7 = curl_strnequal("Location:",param_2,9), iVar7 != 0 &&
         (*(long *)(param_1 + 400) == 0)))))) {
      pcVar10 = (char *)FUN_00919a0c(param_2);
      if (pcVar10 == (char *)0x0) {
LAB_0091cbb0:
        uVar13 = 0x1b;
        goto LAB_0091cdc8;
      }
      if (*pcVar10 == '\0') {
        (*(code *)PTR_free_00cc4678)();
      }
      else {
        *(char **)(param_1 + 400) = pcVar10;
        if ((*(byte *)(param_1 + 0xa84) >> 5 & 1) != 0) {
          lVar12 = (*(code *)PTR_strdup_00cc4688)();
          *(long *)(param_1 + 0x198) = lVar12;
          if (lVar12 == 0) goto LAB_0091cbb0;
          FUN_00919e70(param_1,lVar15);
          *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 2;
        }
      }
    }
    break;
  case 0x50:
  case 0x70:
    if (0x10 < param_3) {
      iVar7 = curl_strnequal("Proxy-Connection:",param_2,0x11);
      if (iVar7 != 0) {
        cVar3 = *(char *)(lVar15 + 0x574);
        if (cVar3 == '\n') {
          if ((((*(byte *)(lVar15 + 0x3a0) & 1) != 0) &&
              (iVar7 = curl_strnequal("Proxy-Connection:",param_2,0x11), 0x1b < param_3)) &&
             ((iVar7 != 0 &&
              (uVar8 = FUN_0091a870(param_2,"Proxy-Connection:",0x11,"keep-alive",10),
              (uVar8 & 1) != 0)))) {
            FUN_00908c4c(lVar15,0);
            uVar13 = 0;
            if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0091cdc8;
            if ((*(long *)(param_1 + 0x12a0) == 0) ||
               (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
              pcVar10 = "HTTP/1.0 proxy connection set to keep alive";
              goto LAB_0091cd58;
            }
            goto LAB_0091cdc4;
          }
          cVar3 = *(char *)(lVar15 + 0x574);
        }
        uVar13 = 0;
        if ((cVar3 != '\v') || (uVar13 = 0, (*(byte *)(lVar15 + 0x3a0) & 1) == 0))
        goto LAB_0091cdc8;
        iVar7 = curl_strnequal("Proxy-Connection:",param_2,0x11);
        if (0x16 < param_3) {
          uVar13 = 0;
          if (iVar7 == 0) goto LAB_0091cdc8;
          uVar8 = FUN_0091a870(param_2,"Proxy-Connection:",0x11,"close",5);
          uVar13 = 0;
          if ((uVar8 & 1) == 0) goto LAB_0091cdc8;
          FUN_00908c4c(lVar15,1);
          uVar13 = 0;
          if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) == 0) goto LAB_0091cdc8;
          if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))
          {
            pcVar10 = "HTTP/1.1 proxy connection set close";
            goto LAB_0091cd58;
          }
        }
        goto LAB_0091cdc4;
      }
      if (((0x12 < param_3) && (*(int *)(param_1 + 0x124) == 0x197)) &&
         (iVar7 = curl_strnequal("Proxy-authenticate:",param_2,0x13), iVar7 != 0)) {
        pcVar10 = (char *)FUN_00919a0c(param_2);
        if (pcVar10 != (char *)0x0) {
          uVar13 = 1;
          goto LAB_0091c84c;
        }
        goto LAB_0091cbb0;
      }
    }
    break;
  case 0x52:
  case 0x72:
    if ((0xb < param_3) && (iVar7 = curl_strnequal("Retry-After:",param_2,0xc), iVar7 != 0)) {
      local_60 = 0;
      FUN_00941b6c(param_2 + 0xc,0,10,&local_60);
      if ((local_60 == 0) && (lVar15 = FUN_009313b8(param_2 + 0xc), lVar15 != -1)) {
        tVar9 = time((time_t *)0x0);
        local_60 = lVar15 - tVar9;
      }
      uVar13 = 0;
      *(long *)(param_1 + 0x1370) = local_60;
      goto LAB_0091cdc8;
    }
    break;
  case 0x53:
  case 0x73:
    if ((((*(long *)(param_1 + 0xa90) == 0) || (param_3 < 0xb)) ||
        ((*(uint *)(param_1 + 0x131c) >> 0xb & 1) == 0)) ||
       (iVar7 = curl_strnequal("Set-Cookie:",param_2,0xb), iVar7 == 0)) {
      if (((((*(long *)(param_1 + 0xa98) != 0) && (0x19 < param_3)) &&
           (((*(uint *)(*(long *)(lVar15 + 0x3a8) + 0x94) & 1) != 0 &&
            ((iVar7 = curl_strnequal("Strict-Transport-Security:",param_2,0x1a), iVar7 != 0 &&
             (iVar7 = FUN_00918428(*(undefined8 *)(param_1 + 0xa98),*(undefined8 *)(lVar15 + 0x50),
                                   param_2 + 0x1a), iVar7 != 0)))))) &&
          ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"Illegal STS header skipped");
      }
      break;
    }
    pcVar10 = *(char **)(param_1 + 0x12d8);
    if (pcVar10 == (char *)0x0) {
      pcVar10 = *(char **)(lVar15 + 0x50);
    }
    if ((((*(byte *)(*(long *)(lVar15 + 0x3a8) + 0x8c) >> 1 & 1) == 0) &&
        (iVar7 = curl_strequal("localhost",pcVar10), iVar7 == 0)) &&
       (iVar7 = strcmp(pcVar10,"127.0.0.1"), iVar7 != 0)) {
      iVar7 = strcmp(pcVar10,"::1");
      bVar5 = iVar7 == 0;
    }
    else {
      bVar5 = true;
    }
    FUN_0093f628(param_1,2,2);
    FUN_00912f88(param_1,*(undefined8 *)(param_1 + 0xa90),1,0,param_2 + 0xb,pcVar10,
                 *(undefined8 *)(param_1 + 0x11a8),bVar5);
    FUN_0093f680(param_1,2);
    goto LAB_0091cdc4;
  case 0x54:
  case 0x74:
    if ((((*(byte *)(param_1 + 0x1b2) >> 2 & 1) == 0) && (*(char *)(param_1 + 0x131a) != '\x05')) &&
       ((0x11 < param_3 &&
        ((*(int *)(param_1 + 0x124) != 0x130 &&
         (iVar7 = curl_strnequal("Transfer-Encoding:",param_2,0x12), iVar7 != 0)))))) {
      uVar13 = FUN_0091ebb4(param_1,param_2 + 0x12,1);
      if (((int)uVar13 == 0) &&
         (((*(byte *)(param_1 + 0x1b2) >> 3 & 1) == 0 &&
          (uVar13 = 0, (*(byte *)(param_1 + 0xa84) >> 6 & 1) != 0)))) {
        FUN_00908c4c(lVar15,1);
        uVar13 = 0;
        *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 0x1000;
      }
      goto LAB_0091cdc8;
    }
    break;
  case 0x57:
  case 0x77:
    if (((param_3 < 0x11) || (*(int *)(param_1 + 0x124) != 0x191)) ||
       (iVar7 = curl_strnequal("WWW-Authenticate:",param_2,0x11), iVar7 == 0)) break;
    pcVar10 = (char *)FUN_00919a0c(param_2);
    if (pcVar10 == (char *)0x0) goto LAB_0091cbb0;
    uVar13 = 0;
LAB_0091c84c:
    FUN_0091a54c(param_1,uVar13,pcVar10);
LAB_0091c860:
    (*(code *)PTR_free_00cc4678)(pcVar10);
    goto LAB_0091cdc4;
  }
switchD_0091c4a8_caseD_42:
  if (((*(byte *)(*(long *)(lVar15 + 0x3a8) + 0x8e) >> 2 & 1) == 0) ||
     (uVar13 = FUN_00933c1c(param_1,param_2), (int)uVar13 == 0)) {
LAB_0091cdc4:
    uVar13 = 0;
  }
LAB_0091cdc8:
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar13);
  }
  return;
}


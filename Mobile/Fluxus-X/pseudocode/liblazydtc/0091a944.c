/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091a944
 */

void FUN_0091a944(long param_1,ulong param_2,undefined8 param_3)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  byte *pbVar5;
  size_t sVar6;
  undefined8 uVar7;
  char *pcVar8;
  char cVar9;
  uint uVar10;
  long lVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long lVar15;
  char *__s;
  long local_78 [3];
  
  lVar2 = tpidr_el0;
  local_78[2] = *(long *)(lVar2 + 0x28);
  lVar11 = *(long *)(param_1 + 0x20);
  if ((param_2 & 1) == 0) {
    local_78[0] = *(long *)(param_1 + 0x340);
    if (((*(ulong *)(lVar11 + 0x3a0) & 9) == 1) && ((*(byte *)(param_1 + 0xa82) >> 3 & 1) != 0)) {
      local_78[1] = *(undefined8 *)(param_1 + 0x6c0);
      uVar12 = 2;
      goto LAB_0091a9d8;
    }
  }
  else {
    if ((*(byte *)(param_1 + 0xa82) >> 3 & 1) == 0) {
      local_78[0] = *(long *)(param_1 + 0x340);
    }
    else {
      local_78[0] = *(long *)(param_1 + 0x6c0);
    }
  }
  uVar12 = 1;
LAB_0091a9d8:
  uVar14 = 0;
  do {
    for (puVar13 = (undefined8 *)local_78[uVar14]; puVar13 != (undefined8 *)0x0;
        puVar13 = (undefined8 *)puVar13[1]) {
      __s = (char *)*puVar13;
      pbVar5 = (byte *)strchr(__s,0x3a);
      if (pbVar5 == (byte *)0x0) {
        pbVar5 = (byte *)strchr(__s,0x3b);
        if (pbVar5 != (byte *)0x0) {
          lVar15 = (long)pbVar5 - (long)__s;
          do {
            do {
              do {
                pbVar5 = pbVar5 + 1;
                bVar1 = *pbVar5;
              } while (bVar1 == 9);
            } while (bVar1 == 0x20);
            uVar10 = (uint)bVar1;
            if (uVar10 == 0) goto LAB_0091ab24;
          } while (uVar10 - 10 < 4);
          if (uVar10 == 0) {
LAB_0091ab24:
            sVar6 = 0;
            pbVar5 = &DAT_002ab32c;
            goto joined_r0x0091ab30;
          }
        }
      }
      else {
        lVar15 = (long)pbVar5 - (long)__s;
        do {
          do {
            do {
              pbVar5 = pbVar5 + 1;
              bVar1 = *pbVar5;
            } while (bVar1 == 9);
          } while (bVar1 == 0x20);
          uVar10 = (uint)bVar1;
          if (uVar10 == 0) goto LAB_0091ac1c;
        } while (uVar10 - 10 < 4);
        if (uVar10 != 0) {
          sVar6 = strlen((char *)pbVar5);
joined_r0x0091ab30:
          if (((lVar15 != 5) || (*(long *)(param_1 + 0x12d0) == 0)) ||
             (iVar3 = curl_strnequal(__s,"Host:",5), iVar3 == 0)) {
            cVar9 = *(char *)(param_1 + 0x131a);
            if (cVar9 == '\x02') {
              if (lVar15 == 0xd) {
                iVar3 = curl_strnequal(__s,"Content-Type:",0xd);
                if (iVar3 != 0) goto LAB_0091ac1c;
                cVar9 = *(char *)(param_1 + 0x131a);
                goto LAB_0091ab64;
              }
LAB_0091ab88:
              if ((lVar15 == 0xf) && ((*(uint *)(param_1 + 0x1b1) >> 0x10 & 1) != 0)) {
                uVar7 = 0xf;
                pcVar8 = "Content-Length:";
                goto LAB_0091abf8;
              }
              if ((lVar15 == 0xb) && (*(long *)(param_1 + 0x12e8) != 0)) {
                uVar7 = 0xb;
                pcVar8 = "Connection:";
                goto LAB_0091abf8;
              }
              if ((lVar15 == 0x12) && (0x13 < *(byte *)(lVar11 + 0x574))) {
                uVar7 = 0x12;
                pcVar8 = "Transfer-Encoding:";
                goto LAB_0091abf8;
              }
              if (lVar15 == 7) {
                iVar3 = curl_strnequal(__s,"Cookie:",7);
joined_r0x0091aa44:
                if ((iVar3 != 0) && (uVar4 = FUN_0096795c(param_1), (uVar4 & 1) == 0))
                goto LAB_0091ac1c;
              }
              else if (lVar15 == 0xe) {
                iVar3 = curl_strnequal(__s,"Authorization:",0xe);
                goto joined_r0x0091aa44;
              }
            }
            else {
LAB_0091ab64:
              if ((lVar15 != 0xd) || (cVar9 != '\x03')) goto LAB_0091ab88;
              uVar7 = 0xd;
              pcVar8 = "Content-Type:";
LAB_0091abf8:
              iVar3 = curl_strnequal(__s,pcVar8,uVar7);
              if (iVar3 != 0) goto LAB_0091ac1c;
            }
            uVar7 = FUN_0091fe64(param_3,__s,lVar15,pbVar5,sVar6);
            if ((int)uVar7 != 0) goto LAB_0091ac38;
          }
        }
      }
LAB_0091ac1c:
    }
    uVar14 = uVar14 + 1;
  } while (uVar14 < uVar12);
  uVar7 = 0;
LAB_0091ac38:
  if (*(long *)(lVar2 + 0x28) != local_78[2]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}


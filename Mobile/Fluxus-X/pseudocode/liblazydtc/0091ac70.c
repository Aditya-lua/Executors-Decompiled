/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091ac70
 */

int FUN_0091ac70(long param_1,ulong param_2,undefined8 param_3)

{
  byte bVar1;
  long lVar2;
  int iVar3;
  int iVar4;
  byte *pbVar5;
  ulong uVar6;
  char cVar7;
  long lVar8;
  ulong uVar9;
  byte *pbVar10;
  uint uVar11;
  long *plVar12;
  byte *pbVar13;
  byte *__s;
  ulong uVar14;
  long local_78 [3];
  
  lVar2 = tpidr_el0;
  local_78[2] = *(long *)(lVar2 + 0x28);
  lVar8 = *(long *)(param_1 + 0x20);
  if ((param_2 & 1) == 0) {
    local_78[0] = *(long *)(param_1 + 0x340);
    if (((*(ulong *)(lVar8 + 0x3a0) & 9) == 1) && ((*(byte *)(param_1 + 0xa82) >> 3 & 1) != 0)) {
      local_78[1] = *(undefined8 *)(param_1 + 0x6c0);
      uVar9 = 2;
      goto LAB_0091ad00;
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
  uVar9 = 1;
LAB_0091ad00:
  uVar14 = 0;
  do {
    for (plVar12 = (long *)local_78[uVar14]; plVar12 != (long *)0x0; plVar12 = (long *)plVar12[1]) {
      __s = (byte *)*plVar12;
      pbVar5 = (byte *)strchr((char *)__s,0x3a);
      if (pbVar5 == (byte *)0x0) {
        pbVar5 = (byte *)strchr((char *)__s,0x3b);
        if (pbVar5 != (byte *)0x0) {
          pbVar13 = pbVar5;
          do {
            do {
              do {
                pbVar10 = pbVar13;
                pbVar13 = pbVar10 + 1;
                bVar1 = *pbVar13;
              } while (bVar1 == 9);
            } while (bVar1 == 0x20);
            uVar11 = (uint)bVar1;
            if (uVar11 == 0) goto LAB_0091af34;
          } while (uVar11 - 10 < 4);
          if (uVar11 == 0) {
LAB_0091af34:
            if (*pbVar10 == 0x3b) {
              pbVar13 = (byte *)(*(code *)PTR_strdup_00cc4688)(__s);
              if (pbVar13 == (byte *)0x0) {
                FUN_00904534(param_3);
                iVar4 = 0x1b;
                goto LAB_0091afa8;
              }
              pbVar13[(long)pbVar10 - *plVar12] = 0x3a;
              __s = (byte *)*plVar12;
              pbVar5 = pbVar13 + ((long)pbVar10 - (long)__s);
            }
            else {
              pbVar13 = (byte *)0x0;
            }
            if (pbVar5 != (byte *)0x0) goto LAB_0091ad58;
          }
        }
      }
      else {
        pbVar13 = (byte *)0x0;
LAB_0091ad58:
        if (pbVar5 != __s) {
          do {
            do {
              pbVar5 = pbVar5 + 1;
              bVar1 = *pbVar5;
            } while (bVar1 == 9);
          } while ((bVar1 == 0x20) || ((uVar11 = (uint)bVar1, uVar11 != 0 && (uVar11 - 10 < 4))));
          if ((pbVar13 != (byte *)0x0) || (uVar11 != 0)) {
            pbVar5 = pbVar13;
            if (pbVar13 == (byte *)0x0) {
              pbVar5 = __s;
            }
            if (*(long *)(param_1 + 0x12d0) == 0) {
LAB_0091adc0:
              cVar7 = *(char *)(param_1 + 0x131a);
              if (cVar7 == '\x02') {
                iVar3 = curl_strnequal(pbVar5,"Content-Type:",0xd);
                iVar4 = 0;
                if (iVar3 != 0) goto LAB_0091aedc;
                cVar7 = *(char *)(param_1 + 0x131a);
              }
              if (cVar7 == '\x03') {
                iVar3 = curl_strnequal(pbVar5,"Content-Type:",0xd);
                iVar4 = 0;
                if (iVar3 != 0) goto LAB_0091aedc;
              }
              if ((*(byte *)(param_1 + 0x1b3) & 1) != 0) {
                iVar3 = curl_strnequal(pbVar5,"Content-Length:",0xf);
                iVar4 = 0;
                if (iVar3 != 0) goto LAB_0091aedc;
              }
              if (*(long *)(param_1 + 0x12e8) != 0) {
                iVar3 = curl_strnequal(pbVar5,"Connection:",0xb);
                iVar4 = 0;
                if (iVar3 != 0) goto LAB_0091aedc;
              }
              if (0x13 < *(byte *)(lVar8 + 0x574)) {
                iVar3 = curl_strnequal(pbVar5,"Transfer-Encoding:",0x12);
                iVar4 = 0;
                if (iVar3 != 0) goto LAB_0091aedc;
              }
              iVar4 = curl_strnequal(pbVar5,"Authorization:",0xe);
              if ((iVar4 != 0) || (iVar4 = curl_strnequal(pbVar5,"Cookie:",7), iVar4 != 0)) {
                uVar6 = FUN_0096795c(param_1);
                iVar4 = 0;
                if ((uVar6 & 1) == 0) goto LAB_0091aedc;
              }
              iVar4 = FUN_009048cc(param_3,&DAT_002d0df4,pbVar5);
            }
            else {
              iVar3 = curl_strnequal(pbVar5,"Host:",5);
              iVar4 = 0;
              if (iVar3 == 0) goto LAB_0091adc0;
            }
LAB_0091aedc:
            if (pbVar13 != (byte *)0x0) {
              (*(code *)PTR_free_00cc4678)(pbVar13);
            }
            if (iVar4 != 0) goto LAB_0091afa8;
          }
        }
      }
    }
    uVar14 = uVar14 + 1;
  } while (uVar14 < uVar9);
  iVar4 = 0;
LAB_0091afa8:
  if (*(long *)(lVar2 + 0x28) != local_78[2]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009314dc
 */

int FUN_009314dc(long param_1)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  undefined8 uVar18;
  undefined1 auVar19 [16];
  char local_d8 [16];
  char local_c8 [16];
  char local_b8 [12];
  undefined1 auStack_ac [10];
  undefined1 auStack_a2 [10];
  undefined1 auStack_98 [10];
  undefined1 auStack_8e [10];
  undefined1 auStack_84 [10];
  undefined1 auStack_7a [10];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  auVar19 = FUN_00941cb8();
  uVar4 = FUN_00931ff4(param_1,auVar19._0_8_,auVar19._8_8_);
  iVar2 = 0;
  uVar5 = uVar4;
  if ((*(byte *)(param_1 + 0xadc) >> 4 & 1) != 0) goto LAB_00931bc4;
  if (*(long *)(param_1 + 0x250) == 0) {
    if (*(long *)(param_1 + 0x248) != 0) {
      FUN_0092f198(param_1,1);
      iVar2 = (**(code **)(param_1 + 0x248))
                        ((double)*(long *)(param_1 + 0xab0),(double)*(long *)(param_1 + 0xac0),
                         (double)*(long *)(param_1 + 0xab8),(double)*(long *)(param_1 + 0xac8),
                         *(undefined8 *)(param_1 + 0x2d0));
      goto LAB_009315ac;
    }
  }
  else {
    FUN_0092f198(param_1,1);
    iVar2 = (**(code **)(param_1 + 0x250))
                      (*(undefined8 *)(param_1 + 0x2d0),*(undefined8 *)(param_1 + 0xab0),
                       *(undefined8 *)(param_1 + 0xac0),*(undefined8 *)(param_1 + 0xab8),
                       *(undefined8 *)(param_1 + 0xac8));
LAB_009315ac:
    uVar5 = FUN_0092f198(param_1,0);
    if (iVar2 == 0) goto LAB_00931bc4;
    if (iVar2 != 0x10000001) {
      uVar5 = FUN_00904b80(param_1,"Callback aborted");
      goto LAB_00931bc4;
    }
  }
  iVar2 = 0;
  if ((uVar4 & 1) == 0) goto LAB_00931bc4;
  lVar16 = *(long *)(param_1 + 0xae0);
  uVar3 = *(uint *)(param_1 + 0xadc);
  if ((uVar3 >> 7 & 1) == 0) {
    if (*(long *)(param_1 + 0x1118) != 0) {
      curl_mfprintf(*(undefined8 *)(param_1 + 0x1b8),"** Resuming transfer from byte position %ld\n"
                   );
    }
    curl_mfprintf(*(undefined8 *)(param_1 + 0x1b8),
                  "  %% Total    %% Received %% Xferd  Average Speed   Time    Time     Time  Current\n                                 Dload  Upload   Total   Spent    Left  Speed\n"
                 );
    uVar3 = *(uint *)(param_1 + 0xadc) | 0x80;
    *(uint *)(param_1 + 0xadc) = uVar3;
  }
  uVar5 = 0;
  lVar17 = 0;
  uVar4 = lVar16 / 1000000;
  if ((uVar3 >> 5 & 1) != 0) {
    lVar17 = *(long *)(param_1 + 0xaf0);
    if (lVar17 < 1) {
      uVar5 = 0;
      lVar17 = 0;
    }
    else {
      uVar14 = *(ulong *)(param_1 + 0xab8);
      uVar5 = 0;
      if (lVar17 != 0) {
        uVar5 = (long)uVar14 / lVar17;
      }
      if ((long)uVar14 < 0x2711) {
        if ((long)uVar14 < 1) {
          lVar17 = 0;
          goto LAB_009316b8;
        }
        lVar15 = *(long *)(param_1 + 0xac8) * 100;
      }
      else {
        lVar15 = *(long *)(param_1 + 0xac8);
        uVar14 = uVar14 / 100;
      }
      lVar17 = 0;
      if (uVar14 != 0) {
        lVar17 = lVar15 / (long)uVar14;
      }
    }
  }
LAB_009316b8:
  uVar14 = 0;
  lVar15 = 0;
  if ((uVar3 >> 6 & 1) != 0) {
    lVar15 = *(long *)(param_1 + 0xae8);
    if (lVar15 < 1) {
      uVar14 = 0;
      lVar15 = 0;
    }
    else {
      uVar12 = *(ulong *)(param_1 + 0xab0);
      uVar14 = 0;
      if (lVar15 != 0) {
        uVar14 = (long)uVar12 / lVar15;
      }
      if ((long)uVar12 < 0x2711) {
        if ((long)uVar12 < 1) {
          lVar15 = 0;
          goto LAB_00931730;
        }
        lVar13 = *(long *)(param_1 + 0xac0) * 100;
      }
      else {
        lVar13 = *(long *)(param_1 + 0xac0);
        uVar12 = uVar12 / 100;
      }
      lVar15 = 0;
      if (uVar12 != 0) {
        lVar15 = lVar13 / (long)uVar12;
      }
    }
  }
LAB_00931730:
  if ((long)uVar5 <= (long)uVar14) {
    uVar5 = uVar14;
  }
  uVar14 = uVar5 - uVar4;
  if ((long)uVar5 < 1) {
    uVar14 = 0;
  }
  if ((long)uVar14 < 1) {
    builtin_strncpy(local_b8,"--:--:--",9);
joined_r0x00931810:
    if (0 < (long)uVar5) goto LAB_00931814;
LAB_009317c4:
    builtin_strncpy(local_c8,"--:--:--",9);
joined_r0x009317dc:
    if (999999 < lVar16) goto LAB_0093187c;
LAB_009317e0:
    builtin_strncpy(local_d8,"--:--:--",9);
  }
  else {
    if ((long)uVar14 < 360000) {
      curl_msnprintf(local_b8,9,"%2ld:%02ld:%02ld",uVar14 / 0xe10,(uVar14 % 0xe10) / 0x3c,
                     (uVar14 % 0xe10) % 0x3c);
      goto joined_r0x00931810;
    }
    if ((long)uVar14 < 86400000) {
      curl_msnprintf(local_b8,9,"%3ldd %02ldh",uVar14 / 0x15180,(uVar14 % 0x15180) / 0xe10);
      goto joined_r0x00931810;
    }
    curl_msnprintf(local_b8,9,"%7ldd");
    if ((long)uVar5 < 1) goto LAB_009317c4;
LAB_00931814:
    if ((long)uVar5 < 360000) {
      curl_msnprintf(local_c8,9,"%2ld:%02ld:%02ld",uVar5 / 0xe10,(uVar5 % 0xe10) / 0x3c,
                     (uVar5 % 0xe10) % 0x3c);
      goto joined_r0x009317dc;
    }
    if (86399999 < (long)uVar5) {
      curl_msnprintf(local_c8,9,"%7ldd");
      goto joined_r0x009317dc;
    }
    curl_msnprintf(local_c8,9,"%3ldd %02ldh",uVar5 / 0x15180,(uVar5 % 0x15180) / 0xe10);
    if (lVar16 < 1000000) goto LAB_009317e0;
LAB_0093187c:
    if (lVar16 < 360000000000) {
      curl_msnprintf(local_d8,9,"%2ld:%02ld:%02ld",uVar4 / 0xe10,(uVar4 % 0xe10) / 0x3c,
                     (uVar4 % 0xe10) % 0x3c);
    }
    else if (lVar16 < 86400000000000) {
      curl_msnprintf(local_d8,9,"%3ldd %02ldh",uVar4 / 0x15180,(uVar4 % 0x15180) / 0xe10);
    }
    else {
      curl_msnprintf(local_d8,9,"%7ldd");
    }
  }
  lVar16 = 0xac8;
  if ((*(uint *)(param_1 + 0xadc) & 0x20) != 0) {
    lVar16 = 0xab8;
  }
  lVar13 = 0xac0;
  if ((*(uint *)(param_1 + 0xadc) & 0x40) != 0) {
    lVar13 = 0xab0;
  }
  uVar5 = *(long *)(param_1 + lVar13) + *(long *)(param_1 + lVar16);
  lVar16 = *(long *)(param_1 + 0xac8) + *(long *)(param_1 + 0xac0);
  if ((long)uVar5 < 0x2711) {
    if ((long)uVar5 < 1) {
      lVar13 = 0;
    }
    else {
      lVar13 = 0;
      if (uVar5 != 0) {
        lVar13 = (lVar16 * 100) / (long)uVar5;
      }
    }
  }
  else {
    lVar13 = 0;
    if (uVar5 / 100 != 0) {
      lVar13 = lVar16 / (long)(uVar5 / 100);
    }
  }
  uVar18 = *(undefined8 *)(param_1 + 0x1b8);
  uVar6 = FUN_0093221c(uVar5,auStack_98);
  uVar7 = FUN_0093221c(*(undefined8 *)(param_1 + 0xac0),auStack_ac);
  uVar8 = FUN_0093221c(*(undefined8 *)(param_1 + 0xac8),auStack_a2);
  uVar9 = FUN_0093221c(*(undefined8 *)(param_1 + 0xae8),auStack_8e);
  uVar10 = FUN_0093221c(*(undefined8 *)(param_1 + 0xaf0),auStack_84);
  uVar11 = FUN_0093221c(*(undefined8 *)(param_1 + 0xad0),auStack_7a);
  curl_mfprintf(uVar18,"\r%3ld %s  %3ld %s  %3ld %s  %s  %s %s %s %s %s",lVar13,uVar6,lVar15,uVar7,
                lVar17,uVar8,uVar9,uVar10,local_c8,local_d8,local_b8,uVar11);
  uVar3 = fflush(*(FILE **)(param_1 + 0x1b8));
  uVar5 = (ulong)uVar3;
  iVar2 = 0;
LAB_00931bc4:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return iVar2;
}


/* 7ff70c96bd30 FUN_7ff70c96bd30 */

void FUN_7ff70c96bd30(longlong *param_1,longlong *param_2,longlong *param_3)

{
  ulonglong uVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  char cVar6;
  longlong lVar7;
  
  lVar4 = *param_3;
  lVar7 = param_3[1];
  if (lVar7 == 0) {
LAB_7ff70c96bfcf:
    lVar7 = 0;
  }
  else {
    uVar1 = param_1[1];
    lVar2 = param_1[2];
    lVar5 = lVar2 - *param_1;
    lVar3 = 0;
    do {
      if ((ulonglong)(lVar5 + lVar3) < uVar1) {
        if (*(char *)(lVar2 + lVar3) != *(char *)(lVar4 + lVar3)) {
LAB_7ff70c96bd88:
          lVar4 = param_3[2];
          lVar7 = param_3[3];
          if (lVar7 == 0) goto LAB_7ff70c96bfcf;
          lVar3 = 0;
          goto LAB_7ff70c96bdb4;
        }
      }
      else if (*(char *)(lVar4 + lVar3) != '\0') goto LAB_7ff70c96bd88;
      lVar3 = lVar3 + 1;
    } while (lVar7 != lVar3);
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96bdb4:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      if (*(char *)(lVar2 + lVar3) != *(char *)(lVar4 + lVar3)) {
LAB_7ff70c96bdc8:
        lVar4 = param_3[4];
        lVar7 = param_3[5];
        if (lVar7 == 0) goto LAB_7ff70c96bfcf;
        lVar3 = 0;
        goto LAB_7ff70c96bde0;
      }
    }
    else if (*(char *)(lVar4 + lVar3) != '\0') goto LAB_7ff70c96bdc8;
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96bde0:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[6];
      lVar7 = param_3[7];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96be20;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96be20:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[8];
      lVar7 = param_3[9];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96be58;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96be58:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[10];
      lVar7 = param_3[0xb];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96be90;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96be90:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[0xc];
      lVar7 = param_3[0xd];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96bec8;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96bec8:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[0xe];
      lVar7 = param_3[0xf];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96bf00;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96bf00:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[0x10];
      lVar7 = param_3[0x11];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96bf3e;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96bf3e:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[0x12];
      lVar7 = param_3[0x13];
      if (lVar7 == 0) goto LAB_7ff70c96bfcf;
      lVar3 = 0;
      goto LAB_7ff70c96bf75;
    }
  }
  goto LAB_7ff70c96bfd2;
  while (lVar3 = lVar3 + 1, lVar7 != lVar3) {
LAB_7ff70c96bf75:
    if ((ulonglong)(lVar5 + lVar3) < uVar1) {
      cVar6 = *(char *)(lVar2 + lVar3);
    }
    else {
      cVar6 = '\0';
    }
    if (cVar6 != *(char *)(lVar4 + lVar3)) {
      lVar4 = param_3[0x14];
      lVar7 = param_3[0x15];
      if (lVar7 != 0) {
        lVar3 = 0;
        do {
          if ((ulonglong)(lVar5 + lVar3) < uVar1) {
            cVar6 = *(char *)(lVar2 + lVar3);
          }
          else {
            cVar6 = '\0';
          }
          if (cVar6 != *(char *)(lVar4 + lVar3)) {
            *(undefined1 *)(param_2 + 2) = 0;
            return;
          }
          lVar3 = lVar3 + 1;
        } while (lVar7 != lVar3);
        break;
      }
      goto LAB_7ff70c96bfcf;
    }
  }
LAB_7ff70c96bfd2:
  *param_2 = lVar4;
  param_2[1] = lVar7;
  *(undefined1 *)(param_2 + 2) = 1;
  return;
}



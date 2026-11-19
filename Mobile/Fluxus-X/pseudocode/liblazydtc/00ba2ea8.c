/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2ea8
 */

undefined8 psa_reserve_free_key_slot(uint *param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  void *pvVar6;
  ulong uVar7;
  int *piVar8;
  long lVar9;
  
  if (DAT_00d26190 != '\x01') {
    uVar4 = 0xffffff77;
    goto LAB_00ba2ef4;
  }
  if (param_1 == (uint *)0x0) {
    uVar7 = 0;
    lVar9 = 0;
    lVar5 = DAT_00d260d8;
    do {
      if (*(int *)(lVar5 + 0x18) == 0) goto LAB_00ba2f4c;
      if ((((lVar9 == 0) && (*(int *)(lVar5 + 0x18) == 2)) &&
          (lVar9 = 0, *(long *)(lVar5 + 0x20) == 0)) && (lVar9 = 0, *(char *)(lVar5 + 4) != '\0')) {
        lVar9 = lVar5;
      }
      uVar7 = uVar7 + 1;
      lVar5 = lVar5 + 0x38;
    } while (uVar7 < 0x20);
    lVar5 = 0;
LAB_00ba2f4c:
    if ((lVar9 == 0) || (lVar5 != 0)) {
      if (lVar5 == 0) {
        uVar4 = 0xffffff73;
        goto LAB_00ba2ef4;
      }
      piVar8 = (int *)(lVar5 + 0x18);
      iVar3 = *(int *)(lVar5 + 0x18);
      lVar9 = lVar5;
    }
    else {
      piVar8 = (int *)(lVar9 + 0x18);
      if ((*piVar8 == 2) && (*(long *)(lVar9 + 0x20) != -1)) {
        *(long *)(lVar9 + 0x20) = *(long *)(lVar9 + 0x20) + 1;
      }
      uVar4 = psa_wipe_key_slot(lVar9);
      if ((int)uVar4 != 0) goto LAB_00ba2ef4;
      iVar3 = *(int *)(lVar9 + 0x18);
    }
    if (iVar3 == 0) {
      *piVar8 = 1;
      *(undefined1 *)(lVar9 + 0x1c) = 0x16;
      *param_2 = lVar9;
      return 0;
    }
    uVar4 = 0xffffff69;
LAB_00ba2ef4:
    *param_2 = 0;
    return uVar4;
  }
  if (DAT_00d260e0 == -1) {
    if (DAT_00d260e8 != -1) {
      lVar9 = 1;
      lVar5 = DAT_00d260e8;
      goto LAB_00ba3174;
    }
    if (DAT_00d260f0 != -1) {
      lVar9 = 2;
      lVar5 = DAT_00d260f0;
      goto LAB_00ba3174;
    }
    if (DAT_00d260f8 != -1) {
      lVar9 = 3;
      lVar5 = DAT_00d260f8;
      goto LAB_00ba3174;
    }
    if (DAT_00d26100 != -1) {
      lVar9 = 4;
      lVar5 = DAT_00d26100;
      goto LAB_00ba3174;
    }
    if (DAT_00d26108 != -1) {
      lVar9 = 5;
      lVar5 = DAT_00d26108;
      goto LAB_00ba3174;
    }
    if (DAT_00d26110 != -1) {
      lVar9 = 6;
      lVar5 = DAT_00d26110;
      goto LAB_00ba3174;
    }
    if (DAT_00d26118 != -1) {
      lVar9 = 7;
      lVar5 = DAT_00d26118;
      goto LAB_00ba3174;
    }
    if (DAT_00d26120 != -1) {
      lVar9 = 8;
      lVar5 = DAT_00d26120;
      goto LAB_00ba3174;
    }
    if (DAT_00d26128 != -1) {
      lVar9 = 9;
      lVar5 = DAT_00d26128;
      goto LAB_00ba3174;
    }
    if (DAT_00d26130 != -1) {
      lVar9 = 10;
      lVar5 = DAT_00d26130;
      goto LAB_00ba3174;
    }
    if (DAT_00d26138 != -1) {
      lVar9 = 0xb;
      lVar5 = DAT_00d26138;
      goto LAB_00ba3174;
    }
    if (DAT_00d26140 != -1) {
      lVar9 = 0xc;
      lVar5 = DAT_00d26140;
      goto LAB_00ba3174;
    }
    if (DAT_00d26148 != -1) {
      lVar9 = 0xd;
      lVar5 = DAT_00d26148;
      goto LAB_00ba3174;
    }
    if (DAT_00d26150 != -1) {
      lVar9 = 0xe;
      lVar5 = DAT_00d26150;
      goto LAB_00ba3174;
    }
    if (DAT_00d26158 != -1) {
      lVar9 = 0xf;
      lVar5 = DAT_00d26158;
      goto LAB_00ba3174;
    }
    if (DAT_00d26160 != -1) {
      lVar9 = 0x10;
      lVar5 = DAT_00d26160;
      goto LAB_00ba3174;
    }
    if (DAT_00d26168 != -1) {
      lVar9 = 0x11;
      lVar5 = DAT_00d26168;
      goto LAB_00ba3174;
    }
    if (DAT_00d26170 != -1) {
      lVar9 = 0x12;
      lVar5 = DAT_00d26170;
      goto LAB_00ba3174;
    }
    if (DAT_00d26178 != -1) {
      lVar9 = 0x13;
      lVar5 = DAT_00d26178;
      goto LAB_00ba3174;
    }
    if (DAT_00d26180 != -1) {
      lVar9 = 0x14;
      lVar5 = DAT_00d26180;
      goto LAB_00ba3174;
    }
    if (DAT_00d26188 != -1) {
      lVar9 = 0x15;
      lVar5 = DAT_00d26188;
      goto LAB_00ba3174;
    }
LAB_00ba3214:
    uVar4 = 0xffffff73;
  }
  else {
    lVar9 = 0;
    lVar5 = DAT_00d260e0;
LAB_00ba3174:
    pvVar6 = (void *)(&DAT_00d26028)[lVar9];
    if (pvVar6 == (void *)0x0) {
      pvVar6 = calloc((ulong)(uint)(0x10 << lVar9),0x38);
      (&DAT_00d26028)[lVar9] = pvVar6;
      if (pvVar6 == (void *)0x0) goto LAB_00ba3214;
    }
    *param_1 = (uint)lVar5 | (int)lVar9 << 0x19 | 0x40000000;
    lVar1 = lVar5 + *(int *)((long)pvVar6 + lVar5 * 0x38 + 0x20);
    lVar2 = -1;
    if (lVar1 + 1U < (ulong)(uint)(0x10 << lVar9)) {
      lVar2 = lVar1 + 1;
    }
    (&DAT_00d260e0)[lVar9] = lVar2;
    *(undefined4 *)((long)pvVar6 + lVar5 * 0x38 + 0x20) = 0;
    piVar8 = (int *)((long)pvVar6 + lVar5 * 0x38 + 0x18);
    if (*piVar8 == 0) {
      pvVar6 = (void *)((long)pvVar6 + lVar5 * 0x38);
      uVar4 = 0;
      *piVar8 = 1;
      *param_2 = (long)pvVar6;
      *(char *)((long)pvVar6 + 0x1c) = (char)lVar9;
    }
    else {
      uVar4 = 0xffffff69;
    }
  }
  return uVar4;
}


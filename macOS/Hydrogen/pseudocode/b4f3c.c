
int FUN_000b4f3c(ulong param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  int in_w4;
  int in_w6;
  char *pcVar3;
  undefined8 *puVar4;
  ulong in_x9;
  char *pcVar5;
  char *pcVar6;
  long in_x11;
  ulong uVar7;
  ulong uVar8;
  undefined8 *in_x15;
  ulong unaff_x19;
  int iVar9;
  long unaff_x20;
  char *pcVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  char *unaff_x27;
  long unaff_x29;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  long in_stack_00000080;
  long in_stack_000000a0;
  int *in_stack_000000f0;
  undefined2 in_stack_00000118;
  int in_stack_00000160;
  undefined8 in_stack_00000168;
  
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_1;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x9;
  lVar13 = unaff_x19 + (SUB168(auVar1 * auVar2,8) >> 7);
  if (unaff_x27 + lVar13 + 1 <= (char *)(in_x11 + -8)) {
    uVar12 = ((in_x11 + -8) - (long)(unaff_x27 + lVar13 + 1)) * 0xff + 0x12;
    iVar9 = (int)uVar12;
    if ((ulong)(long)in_w4 <= uVar12) {
      iVar9 = in_w4;
    }
    lVar11 = (long)iVar9;
    if (0xb < (long)(~(ulong)(unaff_x27 + lVar13 + 3) + in_x11 + lVar11)) {
      pcVar10 = unaff_x27 + 1;
      uVar12 = unaff_x19 - 0xf;
      if (unaff_x19 < 0xf) {
        *unaff_x27 = (char)((int)unaff_x19 << 4);
      }
      else {
        *unaff_x27 = -0x10;
        pcVar3 = pcVar10;
        if (0xfe < uVar12) {
          uVar12 = (unaff_x19 - 0x10e) / 0xff;
          _memset(pcVar10,0xff,uVar12 + 1);
          pcVar3 = unaff_x27 + uVar12 + 2;
          uVar12 = (unaff_x19 - 0x10e) % 0xff;
          in_w6 = in_stack_00000168._4_4_;
        }
        pcVar10 = pcVar3 + 1;
        *pcVar3 = (char)uVar12;
      }
      pcVar3 = pcVar10 + unaff_x19;
      pcVar6 = pcVar10 + (unaff_x20 - (long)in_x15);
      if (pcVar10 + (unaff_x20 - (long)in_x15) <= pcVar10 + 8) {
        pcVar6 = pcVar10 + 8;
      }
      puVar4 = in_x15;
      pcVar5 = pcVar10;
      if ((pcVar6 + ~(ulong)pcVar10 < &segment_command_00000020.vmaddr) ||
         ((ulong)((long)pcVar10 - (long)in_x15) < 0x40)) {
LAB_000b508c:
        do {
          pcVar6 = pcVar5 + 8;
          *(undefined8 *)pcVar5 = *puVar4;
          puVar4 = puVar4 + 1;
          pcVar5 = pcVar6;
        } while (pcVar6 < pcVar3);
      }
      else {
        uVar12 = ((ulong)(pcVar6 + ~(ulong)pcVar10) >> 3) + 1;
        uVar7 = uVar12 & 0x3ffffffffffffff8;
        puVar4 = in_x15 + 4;
        pcVar6 = pcVar10 + 0x20;
        uVar8 = uVar7;
        do {
          uVar14 = puVar4[-4];
          uVar16 = puVar4[-1];
          uVar15 = puVar4[-2];
          uVar18 = puVar4[1];
          uVar17 = *puVar4;
          uVar20 = puVar4[3];
          uVar19 = puVar4[2];
          *(undefined8 *)(pcVar6 + -0x18) = puVar4[-3];
          *(undefined8 *)(pcVar6 + -0x20) = uVar14;
          *(undefined8 *)(pcVar6 + -8) = uVar16;
          *(undefined8 *)(pcVar6 + -0x10) = uVar15;
          *(undefined8 *)(pcVar6 + 8) = uVar18;
          *(undefined8 *)pcVar6 = uVar17;
          *(undefined8 *)(pcVar6 + 0x18) = uVar20;
          *(undefined8 *)(pcVar6 + 0x10) = uVar19;
          uVar8 = uVar8 - 8;
          puVar4 = puVar4 + 8;
          pcVar6 = pcVar6 + 0x40;
        } while (uVar8 != 0);
        puVar4 = in_x15 + uVar7;
        pcVar5 = pcVar10 + uVar7 * 8;
        if (uVar12 != uVar7) goto LAB_000b508c;
      }
      pcVar6 = pcVar3 + 2;
      *(undefined2 *)pcVar3 = in_stack_00000118;
      if (lVar11 - 4U < 0xf) {
        *unaff_x27 = *unaff_x27 + (char)(lVar11 - 4U);
      }
      else {
        *unaff_x27 = *unaff_x27 + '\x0f';
        uVar12 = lVar11 - 0x13;
        if (0x1fd < uVar12) {
          lVar13 = ((lVar11 - 0x211U) / 0x1fe) * 2;
          _memset(pcVar6,0xff,lVar13 + 2);
          pcVar6 = pcVar10 + ((lVar13 + unaff_x20) - (long)in_x15) + 4;
          uVar12 = (lVar11 - 0x211U) % 0x1fe;
          in_w6 = in_stack_00000168._4_4_;
        }
        pcVar10 = pcVar6;
        if (0xfe < uVar12) {
          pcVar10 = pcVar6 + 1;
          *pcVar6 = -1;
          uVar12 = uVar12 - 0xff;
        }
        pcVar6 = pcVar10 + 1;
        *pcVar10 = (char)uVar12;
      }
      in_x15 = (undefined8 *)(unaff_x20 + lVar11);
      unaff_x27 = pcVar6;
    }
  }
  pcVar10 = (char *)(in_stack_00000080 - (long)in_x15);
  lVar13 = 5;
  if (in_w6 != 2) {
    lVar13 = 0;
  }
  if ((in_w6 != 0) &&
     (pcVar3 = (char *)(in_stack_000000a0 + lVar13),
     pcVar3 < unaff_x27 + (long)(pcVar10 + (ulong)(pcVar10 + 0xf0) / 0xff + 1))) {
    if (in_w6 == 1) {
      iVar9 = 0;
      goto code_r0x000b4c80;
    }
    pcVar10 = pcVar3 + (~(ulong)unaff_x27 - ((ulong)(pcVar3 + ~(ulong)unaff_x27 + 0xf1) >> 8));
  }
  iVar9 = (int)pcVar10;
  pcVar3 = pcVar10 + -0xf;
  if (pcVar10 < "") {
    *unaff_x27 = (char)(iVar9 << 4);
  }
  else {
    pcVar6 = unaff_x27 + 1;
    *unaff_x27 = -0x10;
    if ("" < pcVar3) {
      uVar12 = (ulong)(pcVar10 + -0x10e) / 0xff;
      _memset(pcVar6,0xff,uVar12 + 1);
      pcVar3 = (char *)((ulong)(pcVar10 + -0x10e) % 0xff);
      pcVar6 = unaff_x27 + uVar12 + 2;
    }
    *pcVar6 = (char)pcVar3;
    unaff_x27 = pcVar6;
  }
  _memcpy(unaff_x27 + 1,in_x15,pcVar10);
  *in_stack_000000f0 = ((int)in_x15 + iVar9) - in_stack_00000160;
  iVar9 = ((int)(unaff_x27 + 1) + iVar9) - (int)*(undefined8 *)(unaff_x29 + -0x100);
  if (0 < iVar9) {
    return iVar9;
  }
code_r0x000b4c80:
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar9;
}



void FUN_000dcafc(long param_1,undefined4 param_2)

{
  int *piVar1;
  uint *puVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  char *pcVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  int unaff_w20;
  int unaff_w21;
  long unaff_x23;
  long unaff_x24;
  long lVar11;
  uint uVar12;
  undefined1 uStack0000000000000008;
  
  *(undefined4 *)(param_1 + 0x114) = param_2;
  *(undefined8 *)(param_1 + 0x138) = *(undefined8 *)(param_1 + 0x140);
  *(undefined4 *)(param_1 + 0x148) = *(undefined4 *)(param_1 + 0x14c);
  *(undefined1 *)(param_1 + 0x150) = 1;
  _uStack0000000000000008 = 0;
  iVar5 = func_0x0010beb0("Log To Clipboard",&uStack0000000000000008);
  lVar11 = *(long *)(unaff_x23 + 0x4c0);
  piVar1 = (int *)(&UNK_00004ab0 + lVar11);
  puVar2 = (uint *)(&UNK_0000497c + lVar11);
  lVar9 = *(long *)(lVar11 + 0x4000);
  if (*(char *)(lVar9 + 0xc3) == '\0') {
    *(float *)(lVar9 + 0x110) = *(float *)(&UNK_00003934 + lVar11) + *(float *)(lVar9 + 0x118);
    *(undefined4 *)(lVar9 + 0x114) = *(undefined4 *)(lVar9 + 0x11c);
    *(undefined8 *)(lVar9 + 0x138) = *(undefined8 *)(lVar9 + 0x140);
    *(undefined4 *)(lVar9 + 0x148) = *(undefined4 *)(lVar9 + 0x14c);
    *(undefined1 *)(lVar9 + 0x150) = 1;
    uVar12 = *puVar2 | 1;
    *puVar2 = uVar12;
    iVar7 = *piVar1;
    if (iVar7 != *(int *)(&UNK_00004ab4 + lVar11)) goto code_r0x000dcb98;
  }
  else {
    uVar12 = *puVar2 | 1;
    *puVar2 = uVar12;
    iVar7 = *piVar1;
    if (iVar7 != *(int *)(&UNK_00004ab4 + lVar11)) goto code_r0x000dcb98;
  }
  iVar3 = iVar7;
  if (iVar7 < 0) {
    iVar3 = iVar7 + 1;
  }
  iVar4 = 8;
  if (iVar7 != 0) {
    iVar4 = iVar7 + (iVar3 >> 1);
  }
  if (iVar4 <= iVar7 + 1) {
    iVar4 = iVar7 + 1;
  }
  func_0x000eb9f0(piVar1,iVar4);
  iVar7 = *piVar1;
code_r0x000dcb98:
  *(uint *)(*(long *)(&UNK_00004ab8 + lVar11) + (long)iVar7 * 4) = uVar12;
  *piVar1 = *piVar1 + 1;
  lVar9 = *(long *)(unaff_x23 + 0x4c0);
  *(uint *)(&UNK_00004988 + lVar9) = *(uint *)(&UNK_00004988 + lVar9) | 1;
  *(undefined4 *)(&UNK_00004998 + lVar9) = 0x42a00000;
  func_0x00119300("Default Depth",&UNK_00006038 + unaff_x24,0,9,0,0);
  lVar11 = *(long *)(unaff_x23 + 0x4c0);
  iVar7 = *(int *)(&UNK_00004ab0 + lVar11);
  *(int *)(&UNK_00004ab0 + lVar11) = iVar7 + -1;
  pcVar6 = &UNK_00005ff8 + lVar11;
  *(undefined4 *)(&UNK_0000497c + lVar11) =
       *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar11) + (long)(iVar7 + -2) * 4);
  lVar9 = *(long *)(lVar11 + 0x4000);
  *(int *)(lVar9 + 0x100) = *(int *)(lVar9 + 0x100) + -1;
  if ((unaff_w20 != 0) && (*pcVar6 == '\0')) {
    *pcVar6 = '\x01';
    *(undefined8 *)(&UNK_00006020 + lVar11) = 0;
    *(undefined8 *)(&UNK_00006018 + lVar11) = 0;
    *(undefined4 *)(&UNK_00005ffc + lVar11) = 1;
    *(undefined4 *)(&UNK_00006030 + lVar11) = *(undefined4 *)(lVar9 + 0x198);
    *(undefined4 *)(&UNK_00006034 + lVar11) = *(undefined4 *)(&UNK_00006038 + lVar11);
    *(undefined4 *)(&UNK_00006028 + lVar11) = 0x7f7fffff;
    (&UNK_0000602c)[lVar11] = 1;
    *(undefined8 *)(lVar11 + 0x6000) = *(undefined8 *)PTR____stdoutp_009b0200;
  }
  if ((((unaff_w21 != 0) && (*pcVar6 == '\0')) &&
      (pcVar6 = *(char **)(lVar11 + 0x28), pcVar6 != (char *)0x0)) &&
     ((*pcVar6 != '\0' && (lVar9 = _fopen(pcVar6,"ab"), lVar9 != 0)))) {
    lVar8 = *(long *)(unaff_x23 + 0x4c0);
    lVar10 = *(long *)(lVar8 + 0x4000);
    (&UNK_00005ff8)[lVar8] = 1;
    *(undefined4 *)(&UNK_00005ffc + lVar8) = 2;
    *(undefined8 *)(&UNK_00006020 + lVar8) = 0;
    *(undefined8 *)(&UNK_00006018 + lVar8) = 0;
    *(undefined4 *)(&UNK_00006030 + lVar8) = *(undefined4 *)(lVar10 + 0x198);
    *(undefined4 *)(&UNK_00006034 + lVar8) = *(undefined4 *)(&UNK_00006038 + lVar8);
    *(undefined4 *)(&UNK_00006028 + lVar8) = 0x7f7fffff;
    (&UNK_0000602c)[lVar8] = 1;
    *(long *)(lVar11 + 0x6000) = lVar9;
  }
  if (iVar5 != 0) {
    lVar9 = *(long *)(unaff_x23 + 0x4c0);
    if ((&UNK_00005ff8)[lVar9] == '\0') {
      lVar11 = *(long *)(lVar9 + 0x4000);
      (&UNK_00005ff8)[lVar9] = '\x01';
      *(undefined4 *)(&UNK_00005ffc + lVar9) = 4;
      *(undefined8 *)(&UNK_00006020 + lVar9) = 0;
      *(undefined8 *)(&UNK_00006018 + lVar9) = 0;
      *(undefined4 *)(&UNK_00006030 + lVar9) = *(undefined4 *)(lVar11 + 0x198);
      *(undefined4 *)(&UNK_00006034 + lVar9) = *(undefined4 *)(&UNK_00006038 + lVar9);
      *(undefined4 *)(&UNK_00006028 + lVar9) = 0x7f7fffff;
      (&UNK_0000602c)[lVar9] = 1;
    }
  }
  return;
}


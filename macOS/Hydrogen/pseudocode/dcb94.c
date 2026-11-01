
void FUN_000dcb94(void)

{
  int iVar1;
  char *pcVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  int unaff_w19;
  int unaff_w20;
  int unaff_w21;
  int *unaff_x22;
  long lVar6;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined4 unaff_w26;
  
  *(undefined4 *)(*(long *)(&UNK_00004ab8 + unaff_x25) + (long)*unaff_x22 * 4) = unaff_w26;
  *unaff_x22 = *unaff_x22 + 1;
  lVar3 = *(long *)(unaff_x23 + 0x4c0);
  *(uint *)(&UNK_00004988 + lVar3) = *(uint *)(&UNK_00004988 + lVar3) | 1;
  *(undefined4 *)(&UNK_00004998 + lVar3) = 0x42a00000;
  func_0x00119300("Default Depth",&UNK_00006038 + unaff_x24,0,9,0,0);
  lVar6 = *(long *)(unaff_x23 + 0x4c0);
  iVar1 = *(int *)(&UNK_00004ab0 + lVar6);
  *(int *)(&UNK_00004ab0 + lVar6) = iVar1 + -1;
  pcVar2 = &UNK_00005ff8 + lVar6;
  *(undefined4 *)(&UNK_0000497c + lVar6) =
       *(undefined4 *)(*(long *)(&UNK_00004ab8 + lVar6) + (long)(iVar1 + -2) * 4);
  lVar3 = *(long *)(lVar6 + 0x4000);
  *(int *)(lVar3 + 0x100) = *(int *)(lVar3 + 0x100) + -1;
  if ((unaff_w20 != 0) && (*pcVar2 == '\0')) {
    *pcVar2 = '\x01';
    *(undefined8 *)(&UNK_00006020 + lVar6) = 0;
    *(undefined8 *)(&UNK_00006018 + lVar6) = 0;
    *(undefined4 *)(&UNK_00005ffc + lVar6) = 1;
    *(undefined4 *)(&UNK_00006030 + lVar6) = *(undefined4 *)(lVar3 + 0x198);
    *(undefined4 *)(&UNK_00006034 + lVar6) = *(undefined4 *)(&UNK_00006038 + lVar6);
    *(undefined4 *)(&UNK_00006028 + lVar6) = 0x7f7fffff;
    (&UNK_0000602c)[lVar6] = 1;
    *(undefined8 *)(lVar6 + 0x6000) = *(undefined8 *)PTR____stdoutp_009b0200;
  }
  if ((((unaff_w21 != 0) && (*pcVar2 == '\0')) &&
      (pcVar2 = *(char **)(lVar6 + 0x28), pcVar2 != (char *)0x0)) &&
     ((*pcVar2 != '\0' && (lVar3 = _fopen(pcVar2,"ab"), lVar3 != 0)))) {
    lVar4 = *(long *)(unaff_x23 + 0x4c0);
    lVar5 = *(long *)(lVar4 + 0x4000);
    (&UNK_00005ff8)[lVar4] = 1;
    *(undefined4 *)(&UNK_00005ffc + lVar4) = 2;
    *(undefined8 *)(&UNK_00006020 + lVar4) = 0;
    *(undefined8 *)(&UNK_00006018 + lVar4) = 0;
    *(undefined4 *)(&UNK_00006030 + lVar4) = *(undefined4 *)(lVar5 + 0x198);
    *(undefined4 *)(&UNK_00006034 + lVar4) = *(undefined4 *)(&UNK_00006038 + lVar4);
    *(undefined4 *)(&UNK_00006028 + lVar4) = 0x7f7fffff;
    (&UNK_0000602c)[lVar4] = 1;
    *(long *)(lVar6 + 0x6000) = lVar3;
  }
  if (unaff_w19 != 0) {
    lVar3 = *(long *)(unaff_x23 + 0x4c0);
    if ((&UNK_00005ff8)[lVar3] == '\0') {
      lVar6 = *(long *)(lVar3 + 0x4000);
      (&UNK_00005ff8)[lVar3] = '\x01';
      *(undefined4 *)(&UNK_00005ffc + lVar3) = 4;
      *(undefined8 *)(&UNK_00006020 + lVar3) = 0;
      *(undefined8 *)(&UNK_00006018 + lVar3) = 0;
      *(undefined4 *)(&UNK_00006030 + lVar3) = *(undefined4 *)(lVar6 + 0x198);
      *(undefined4 *)(&UNK_00006034 + lVar3) = *(undefined4 *)(&UNK_00006038 + lVar3);
      *(undefined4 *)(&UNK_00006028 + lVar3) = 0x7f7fffff;
      (&UNK_0000602c)[lVar3] = 1;
    }
  }
  return;
}


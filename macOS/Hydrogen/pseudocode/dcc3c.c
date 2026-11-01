
void FUN_000dcc3c(char *param_1)

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  int unaff_w19;
  int unaff_w21;
  long unaff_x22;
  long unaff_x23;
  
  if ((((unaff_w21 != 0) && (*param_1 == '\0')) &&
      (pcVar1 = *(char **)(unaff_x22 + 0x28), pcVar1 != (char *)0x0)) &&
     ((*pcVar1 != '\0' && (lVar2 = _fopen(pcVar1,"ab"), lVar2 != 0)))) {
    lVar3 = *(long *)(unaff_x23 + 0x4c0);
    lVar4 = *(long *)(lVar3 + 0x4000);
    (&UNK_00005ff8)[lVar3] = 1;
    *(undefined4 *)(&UNK_00005ffc + lVar3) = 2;
    *(undefined8 *)(&UNK_00006020 + lVar3) = 0;
    *(undefined8 *)(&UNK_00006018 + lVar3) = 0;
    *(undefined4 *)(&UNK_00006030 + lVar3) = *(undefined4 *)(lVar4 + 0x198);
    *(undefined4 *)(&UNK_00006034 + lVar3) = *(undefined4 *)(&UNK_00006038 + lVar3);
    *(undefined4 *)(&UNK_00006028 + lVar3) = 0x7f7fffff;
    (&UNK_0000602c)[lVar3] = 1;
    *(long *)(unaff_x22 + 0x6000) = lVar2;
  }
  if (unaff_w19 != 0) {
    lVar2 = *(long *)(unaff_x23 + 0x4c0);
    if ((&UNK_00005ff8)[lVar2] == '\0') {
      lVar3 = *(long *)(lVar2 + 0x4000);
      (&UNK_00005ff8)[lVar2] = '\x01';
      *(undefined4 *)(&UNK_00005ffc + lVar2) = 4;
      *(undefined8 *)(&UNK_00006020 + lVar2) = 0;
      *(undefined8 *)(&UNK_00006018 + lVar2) = 0;
      *(undefined4 *)(&UNK_00006030 + lVar2) = *(undefined4 *)(lVar3 + 0x198);
      *(undefined4 *)(&UNK_00006034 + lVar2) = *(undefined4 *)(&UNK_00006038 + lVar2);
      *(undefined4 *)(&UNK_00006028 + lVar2) = 0x7f7fffff;
      (&UNK_0000602c)[lVar2] = 1;
    }
  }
  return;
}


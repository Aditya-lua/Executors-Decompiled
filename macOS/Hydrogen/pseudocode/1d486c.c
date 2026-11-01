
bool FUN_001d486c(void)

{
  undefined8 uVar1;
  long lVar2;
  int iVar3;
  undefined2 *puVar4;
  long in_x9;
  long lVar5;
  undefined8 *in_x10;
  code *pcVar6;
  
  uVar1 = *in_x10;
  pcVar6 = *(code **)(in_x10[1] + 0x48);
  puVar4 = *(undefined2 **)(in_x9 + 8);
  lVar2 = *(long *)(in_x9 + 0x10) << 2;
  do {
    lVar5 = lVar2;
    if (lVar5 == 0) break;
    iVar3 = (*pcVar6)(uVar1,*puVar4,puVar4[1]);
    puVar4 = puVar4 + 2;
    lVar2 = lVar5 + -4;
  } while (iVar3 == 0);
  return lVar5 != 0;
}


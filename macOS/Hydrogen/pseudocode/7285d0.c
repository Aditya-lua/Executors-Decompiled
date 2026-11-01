
void FUN_007285d0(long param_1,int param_2,long param_3,uint param_4)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  
  lVar3 = func_0x00740a58(param_1 + 8);
  if (lVar3 != 0) {
    do {
      puVar4 = (undefined8 *)func_0x00156654(lVar3);
      lVar5 = func_0x006f4058(lVar3);
      if ((*(int *)((long)puVar4 + 0xc) == param_2) && (*(ushort *)(puVar4 + 1) == param_4)) {
        uVar8 = *puVar4;
        lVar6 = _strlen(param_3);
        lVar7 = _strlen(uVar8);
        if (lVar6 == 0) {
          if (lVar7 == 0) goto LAB_0072868c;
        }
        else {
          lVar1 = lVar6 + -1;
          if (*(char *)(param_3 + lVar6 + -1) != '.') {
            lVar1 = lVar6;
          }
          if (lVar1 == lVar7) {
LAB_0072868c:
            iVar2 = func_0x0077e76c(param_3,uVar8);
            if (iVar2 != 0) {
              func_0x0075e5fc(lVar3);
              (*pcRam0000000000a2b5f0)(*puVar4);
              (*pcRam0000000000a2b5f0)(puVar4[2]);
              (*pcRam0000000000a2b5f0)(puVar4);
            }
          }
        }
      }
      lVar3 = lVar5;
    } while (lVar5 != 0);
  }
  return;
}



void FUN_0007a11c(undefined8 param_1,long param_2,ulong param_3)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long lVar4;
  long *unaff_x19;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  
  if (param_3 != 0) {
    if (0xaaaaaaaaaaaaaaa < param_3) {
      func_0x00017f90();
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x7a1c8);
      (*pcVar3)();
    }
    lVar5 = param_3 * 0x18;
    lVar4 = __Znwm(lVar5);
    lVar6 = 0;
    *unaff_x19 = lVar4;
    unaff_x19[1] = lVar4;
    unaff_x19[2] = lVar4 + lVar5;
    do {
      puVar1 = (undefined8 *)(lVar4 + lVar6);
      puVar2 = (undefined8 *)(param_2 + lVar6);
      if (*(char *)((long)puVar2 + 0x17) < '\0') {
        func_0x00017634(puVar1,*puVar2,puVar2[1]);
      }
      else {
        uVar8 = puVar2[1];
        uVar7 = *puVar2;
        puVar1[2] = puVar2[2];
        puVar1[1] = uVar8;
        *puVar1 = uVar7;
      }
      lVar6 = lVar6 + 0x18;
    } while (lVar5 != lVar6);
    unaff_x19[1] = lVar4 + lVar6;
  }
  return;
}



void FUN_00147c2c(long param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  byte bVar3;
  undefined8 *puVar4;
  long in_x9;
  long in_x10;
  long *unaff_x19;
  long *plVar5;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long *plVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uStack0000000000000008;
  
  while( true ) {
    *(undefined8 *)(in_x10 + in_x9 * 8) = 0;
    in_x9 = in_x9 + 1;
    if (param_1 == in_x9) break;
    in_x10 = *unaff_x19;
  }
  plVar6 = (long *)unaff_x19[2];
  unaff_x19[2] = 0;
  unaff_x19[3] = 0;
  while( true ) {
    if (plVar6 == (long *)0x0) {
      for (; unaff_x21 != unaff_x20; unaff_x21 = (long *)*unaff_x21) {
        func_0x00148540(&uStack0000000000000008);
        func_0x00147d84();
      }
      return;
    }
    if (unaff_x21 == unaff_x20) break;
    if (plVar6 != unaff_x21) {
      puVar1 = plVar6 + 2;
      bVar3 = *(byte *)((long)unaff_x21 + 0x27);
      if (*(char *)((long)plVar6 + 0x27) < '\0') {
        uVar2 = unaff_x21[3];
        puVar4 = (undefined8 *)unaff_x21[2];
        if (-1 < (char)bVar3) {
          uVar2 = (ulong)bVar3;
          puVar4 = unaff_x21 + 2;
        }
        func_0x00017784(puVar1,puVar4,uVar2);
      }
      else if ((char)bVar3 < '\0') {
        func_0x000176c0(puVar1,unaff_x21[2],unaff_x21[3]);
      }
      else {
        uVar8 = unaff_x21[3];
        uVar7 = unaff_x21[2];
        plVar6[4] = unaff_x21[4];
        plVar6[3] = uVar8;
        *puVar1 = uVar7;
      }
    }
    plVar6 = (long *)*plVar6;
    func_0x00147d84();
    unaff_x21 = (long *)*unaff_x21;
  }
  do {
    plVar5 = (long *)*plVar6;
    if (*(char *)((long)plVar6 + 0x27) < '\0') {
      __ZdlPv(plVar6[2]);
    }
    __ZdlPv(plVar6);
    plVar6 = plVar5;
  } while (plVar5 != (long *)0x0);
  return;
}


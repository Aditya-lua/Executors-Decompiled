
long FUN_0003addc(undefined8 param_1,undefined8 param_2,char *param_3)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 in_x9;
  long lVar7;
  long unaff_x19;
  long unaff_x21;
  undefined8 uVar8;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  char in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000038;
  
  *(undefined8 *)(unaff_x21 + 0x30) = 0;
  *(undefined8 *)(unaff_x21 + 0x38) = in_x9;
  *(long *)(unaff_x21 + 0x40) = unaff_x21 + 0x40;
  if (-1 < *(int *)(unaff_x19 + 0x90)) {
    lVar2 = func_0x006f3708();
    if (0 < *(int *)(unaff_x19 + 0x90)) {
      lVar5 = 0;
      lVar7 = 0;
      do {
        puVar6 = (undefined8 *)(*(long *)(unaff_x19 + 0x48) + unaff_x19 + 0x48 + lVar5);
        puVar1 = (undefined8 *)(lVar2 + lVar5);
        uVar8 = puVar6[1];
        uVar3 = *puVar6;
        puVar1[2] = puVar6[2];
        puVar1[1] = uVar8;
        *puVar1 = uVar3;
        lVar7 = lVar7 + 1;
        lVar5 = lVar5 + 0x18;
      } while (lVar7 < *(int *)(unaff_x19 + 0x90));
    }
    *(long *)(unaff_x21 + 0x48) = lVar2 - (unaff_x21 + 0x48);
    lVar2 = func_0x006f3708();
    *(long *)(unaff_x21 + 0x50) = (unaff_x21 + 0x50) - lVar2;
    lVar2 = *(long *)(unaff_x19 + 0x58) - (unaff_x19 + 0x58);
    if (lVar2 == 0) {
      lVar2 = 0;
    }
    else {
      _strlen(lVar2 + 0x18);
      lVar2 = func_0x006f6ef8();
    }
    *(long *)(unaff_x21 + 0x58) = lVar2 + unaff_x21 + 0x58;
    lVar2 = *(long *)(unaff_x19 + 0x60) + unaff_x19 + 0x60;
    if (lVar2 == 0) {
      lVar2 = 0;
    }
    else {
      _strlen(lVar2 + 0x18);
      lVar2 = func_0x006f6ef8();
    }
    *(long *)(unaff_x21 + 0x60) = lVar2 - (unaff_x21 + 0x60);
    *(long *)(unaff_x21 + 0x68) = unaff_x21 + 0x68;
    *(long *)(unaff_x21 + 0x70) = unaff_x21 + 0x70;
    *(long *)(unaff_x21 + 0x78) =
         ((unaff_x21 + 0x78) - (unaff_x19 + 0x78)) + *(long *)(unaff_x19 + 0x78);
    *(undefined8 *)(unaff_x21 + 0x80) = *(undefined8 *)(unaff_x19 + 0x80);
    *(undefined8 *)(unaff_x21 + 0x88) = *(undefined8 *)(unaff_x19 + 0x88);
    *(undefined4 *)(unaff_x21 + 0x90) = *(undefined4 *)(unaff_x19 + 0x90);
    *(undefined4 *)(unaff_x21 + 0x94) = 0;
    uVar3 = *(undefined8 *)(unaff_x19 + 0x98);
    *(undefined8 *)(unaff_x21 + 0xa0) = *(undefined8 *)(unaff_x19 + 0xa0);
    *(undefined8 *)(unaff_x21 + 0x98) = uVar3;
    *(undefined4 *)(unaff_x21 + 0xa8) = *(undefined4 *)(unaff_x19 + 0xa8);
    *(undefined4 *)(unaff_x21 + 0xac) = 0;
    return unaff_x21;
  }
  uVar3 = func_0x006f36f4();
  if ((in_stack_00000020 != '\0') && (in_stack_00000018 < 0)) {
    __ZdlPv(in_stack_00000008);
  }
  if (in_stack_00000038._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000028);
    uVar3 = __Unwind_Resume(uVar3);
    __ZNSt3__16localeD1Ev(&uStack0000000000000028);
  }
  plVar4 = (long *)__Unwind_Resume(uVar3);
  if ((((param_3 != (char *)0x0) &&
       ((param_3[1] & 0xbU) != ((*(byte *)(*(long *)(*plVar4 + 0x18) + 0x20) ^ 0xff) & 3))) &&
      (*param_3 == '\a')) && ((param_3[3] == '\0' && (plVar4[1] == *(long *)(param_3 + 0x18))))) {
    func_0x006e17a8(*plVar4,1);
    puVar6 = *(undefined8 **)(*plVar4 + 8);
    *puVar6 = param_3;
    *(undefined4 *)((long)puVar6 + 0xc) = 7;
    lVar2 = *plVar4;
    *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + 0x10;
    *(int *)(plVar4 + 5) = (int)plVar4[5] + 1;
    func_0x006e4860(lVar2,0xfffffffe);
  }
  return 0;
}


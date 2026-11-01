
undefined8 FUN_0002877c(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined7 uStack0000000000000008;
  char cStack000000000000000f;
  undefined1 uStack0000000000000013;
  char cStack000000000000001f;
  
  uVar3 = func_0x00086db4(param_1,param_2,3);
  uVar3 = func_0x00086db4(uVar3,"/Users/x0rch/hydrogen-m/src/lua/libs/newclosure.h",0x31);
  uVar3 = func_0x00086db4(uVar3,":",1);
  plVar4 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar3,0x9f);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000008,(long)plVar4 + *(long *)(*plVar4 + -0x18));
  plVar5 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000008,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar3 = (**(code **)(*plVar5 + 0x38))(plVar5,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar4,uVar3);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar4);
  func_0x006e69bc();
  cStack000000000000001f = '\v';
  uStack0000000000000008 = s_LocalScript_008cf9ef._0_7_;
  cStack000000000000000f = s_LocalScript_008cf9ef[7];
  _cStack000000000000000f = CONCAT31(0x747069,cStack000000000000000f);
  uStack0000000000000013 = 0;
  iVar1 = func_0x006e1e34();
  if ((iVar1 == 2) && (iVar1 = func_0x006e21f8(), iVar1 == 5)) {
    uVar3 = func_0x006e2ce4();
    func_0x0002a730(&uStack0000000000000008,uVar3);
  }
  func_0x006e3af8();
  uVar2 = func_0x006e1c18();
  uVar6 = func_0x006e3790();
  puVar8 = puRam0000000000a33378;
  if (puRam0000000000a33378 == (undefined8 *)0x0) {
    puVar9 = (undefined8 *)0xa33378;
    puVar10 = (undefined8 *)0xa33378;
  }
  else {
    do {
      while (puVar9 = puVar8, uVar6 < (ulong)puVar9[4]) {
        puVar8 = (undefined8 *)*puVar9;
        puVar10 = puVar9;
        if ((undefined8 *)*puVar9 == (undefined8 *)0x0) goto code_r0x00028918;
      }
      if (uVar6 <= (ulong)puVar9[4]) {
        *(undefined4 *)(puVar9 + 5) = uVar2;
        if (-1 < cStack000000000000001f) {
          return 1;
        }
        goto code_r0x00028974;
      }
      puVar8 = (undefined8 *)puVar9[1];
    } while ((undefined8 *)puVar9[1] != (undefined8 *)0x0);
    puVar10 = puVar9 + 1;
  }
code_r0x00028918:
  puVar7 = (undefined8 *)__Znwm(0x30);
  puVar7[4] = uVar6;
  *(undefined4 *)(puVar7 + 5) = 0;
  *puVar7 = 0;
  puVar7[1] = 0;
  puVar7[2] = puVar9;
  *puVar10 = puVar7;
  puVar8 = puVar7;
  if ((long *)*plRam0000000000a33370 != (long *)0x0) {
    puVar8 = (undefined8 *)*puVar10;
    plRam0000000000a33370 = (long *)*plRam0000000000a33370;
  }
  func_0x0003767c(puRam0000000000a33378,puVar8);
  lRam0000000000a33380 = lRam0000000000a33380 + 1;
  *(undefined4 *)(puVar7 + 5) = uVar2;
  if (cStack000000000000001f < '\0') {
code_r0x00028974:
    __ZdlPv(CONCAT17(cStack000000000000000f,uStack0000000000000008));
  }
  return 1;
}


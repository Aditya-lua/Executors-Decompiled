
void FUN_0004f2ec(undefined1 param_1 [16],long param_2)

{
  undefined1 uVar1;
  int iVar2;
  long lVar3;
  long *unaff_x19;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 uStack0000000000000008;
  
  uVar5 = param_1._8_8_;
  uVar4 = param_1._0_8_;
  *(undefined8 *)(param_2 + 0x148) = uVar5;
  *(undefined8 *)(param_2 + 0x140) = uVar4;
  *(undefined8 *)(param_2 + 0x158) = uVar5;
  *(undefined8 *)(param_2 + 0x150) = uVar4;
  *(undefined8 *)(param_2 + 0x178) = uVar5;
  *(undefined8 *)(param_2 + 0x170) = uVar4;
  *(undefined8 *)(param_2 + 0x188) = uVar5;
  *(undefined8 *)(param_2 + 0x180) = uVar4;
  *(undefined4 *)(param_2 + 399) = 0;
  *(undefined8 *)(param_2 + 0x168) = uVar5;
  *(undefined8 *)(param_2 + 0x160) = uVar4;
  __ZNSt3__16localeC1ERKS0_(&uStack0000000000000008,param_2 + 8);
  iVar2 = __ZNKSt3__16locale9has_facetERNS0_2idE
                    (&uStack0000000000000008,PTR___ZNSt3__17codecvtIcc11__mbstate_tE2idE_009b0098);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  if (iVar2 != 0) {
    __ZNSt3__16localeC1ERKS0_(&uStack0000000000000008,param_2 + 8);
    lVar3 = __ZNKSt3__16locale9use_facetERNS0_2idE
                      (&uStack0000000000000008,PTR___ZNSt3__17codecvtIcc11__mbstate_tE2idE_009b0098)
    ;
    unaff_x19[0x10] = lVar3;
    __ZNSt3__16localeD1Ev(&uStack0000000000000008);
    uVar1 = (**(code **)(*(long *)unaff_x19[0x10] + 0x38))();
    *(undefined1 *)((long)unaff_x19 + 0x192) = uVar1;
  }
  (**(code **)(*unaff_x19 + 0x18))();
  return;
}


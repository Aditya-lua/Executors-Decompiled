
long * FUN_00086dd4(long *param_1,long param_2)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  long lVar5;
  long unaff_x21;
  undefined8 uVar6;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000018;
  
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryC1ERS3_(&uStack0000000000000008,param_1);
  if (uStack0000000000000008 != '\0') {
    lVar5 = (long)param_1 + *(long *)(*param_1 + -0x18);
    uVar6 = *(undefined8 *)(lVar5 + 0x28);
    uVar2 = *(uint *)(lVar5 + 8);
    iVar3 = *(int *)(lVar5 + 0x90);
    if (iVar3 == -1) {
      __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000018,lVar5);
      plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                                 (&uStack0000000000000018,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
      iVar3 = (**(code **)(*plVar4 + 0x38))(plVar4,0x20);
      __ZNSt3__16localeD1Ev(&uStack0000000000000018);
      *(int *)(lVar5 + 0x90) = iVar3;
    }
    lVar1 = param_2 + unaff_x21;
    if ((uVar2 & 0xb0) != 0x20) {
      lVar1 = param_2;
    }
    lVar5 = func_0x00086f18(uVar6,param_2,lVar1,param_2 + unaff_x21,lVar5,(int)(char)iVar3);
    if (lVar5 == 0) {
      lVar5 = (long)param_1 + *(long *)(*param_1 + -0x18);
      __ZNSt3__18ios_base5clearEj(lVar5,*(uint *)(lVar5 + 0x20) | 5);
    }
  }
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE6sentryD1Ev(&uStack0000000000000008);
  return param_1;
}


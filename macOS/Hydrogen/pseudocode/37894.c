
undefined8 FUN_00037894(undefined8 param_1,long param_2)

{
  long *plVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  ulong unaff_x19;
  undefined1 uStack0000000000000008;
  
  uVar2 = func_0x00086db4(param_1,param_2 + 0xe6b,1);
  plVar3 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar2,0x1b);
  __ZNKSt3__18ios_base6getlocEv(&uStack0000000000000008,(long)plVar3 + *(long *)(*plVar3 + -0x18));
  plVar4 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (&uStack0000000000000008,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar2 = (**(code **)(*plVar4 + 0x38))(plVar4,10);
  __ZNSt3__16localeD1Ev(&uStack0000000000000008);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar3,uVar2);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar3);
  if ((*(char *)(unaff_x19 + 3) != '\0') && (plRam0000000000a33378 != (long *)0x0)) {
    plVar3 = (long *)0xa33378;
    plVar4 = plRam0000000000a33378;
    do {
      plVar1 = plVar4 + 1;
      if (unaff_x19 <= (ulong)plVar4[4]) {
        plVar3 = plVar4;
        plVar1 = plVar4;
      }
      plVar4 = (long *)*plVar1;
    } while (plVar4 != (long *)0x0);
    if ((plVar3 != (long *)0xa33378) && ((ulong)plVar3[4] <= unaff_x19)) {
      return 1;
    }
  }
  return 0;
}


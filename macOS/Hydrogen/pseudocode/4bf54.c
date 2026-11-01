
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0004bf54(void)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  ulong uVar8;
  undefined8 ***pppuVar9;
  undefined8 unaff_x19;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 ***pppuStack_110;
  ulong uStack_108;
  undefined8 uStack_100;
  undefined8 ***pppuStack_f8;
  ulong uStack_f0;
  byte bStack_e1;
  undefined8 auStack_e0 [2];
  char cStack_c9;
  undefined8 ***pppuStack_c8;
  ulong uStack_c0;
  undefined8 uStack_b8;
  undefined2 auStack_b0 [4];
  undefined1 uStack_a8;
  undefined7 uStack_a7;
  long lStack_80;
  long lStack_78;
  char cStack_60;
  undefined2 uStack_58;
  
  __ZdlPv();
  if (in_stack_00000038 < 0) {
    __ZdlPv(in_stack_00000028);
    unaff_x19 = __Unwind_Resume();
  }
  uVar4 = __Unwind_Resume(unaff_x19);
  uVar5 = func_0x00086db4(PTR___ZNSt3__14coutE_009b0080,"[LOG] ",6);
  uVar5 = func_0x00086db4(uVar5,"loadfile",8);
  uVar5 = func_0x00086db4(uVar5," @ ",3);
  uVar5 = func_0x00086db4(uVar5,"/Users/x0rch/hydrogen-m/src/lua/libs/filesystem.h",0x31);
  uVar5 = func_0x00086db4(uVar5,":",1);
  plVar6 = (long *)__ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEElsEi(uVar5,0xc4);
  __ZNKSt3__18ios_base6getlocEv(auStack_b0,(long)plVar6 + *(long *)(*plVar6 + -0x18));
  plVar7 = (long *)__ZNKSt3__16locale9use_facetERNS0_2idE
                             (auStack_b0,PTR___ZNSt3__15ctypeIcE2idE_009b0088);
  uVar5 = (**(code **)(*plVar7 + 0x38))(plVar7,10);
  __ZNSt3__16localeD1Ev(auStack_b0);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE3putEc(plVar6,uVar5);
  __ZNSt3__113basic_ostreamIcNS_11char_traitsIcEEE5flushEv(plVar6);
  uVar5 = func_0x006e67c8(uVar4,1,0);
  uVar8 = _strlen();
  if (0x7ffffffffffffff7 < uVar8) {
    func_0x0001748c(&pppuStack_c8);
    goto code_r0x0004c2f0;
  }
  if (uVar8 < 0x17) {
    uStack_b8 = CONCAT17((char)uVar8,(undefined7)uStack_b8);
    pppuVar9 = &pppuStack_c8;
    if (uVar8 != 0) goto code_r0x0004c0c8;
  }
  else {
    uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
    if ((uVar8 | 7) != 0x17) {
      uVar1 = uVar8 | 7;
    }
    pppuVar9 = (undefined8 ***)__Znwm(uVar1 + 1);
    uStack_b8 = uVar1 + 1 | 0x8000000000000000;
    pppuStack_c8 = pppuVar9;
    uStack_c0 = uVar8;
code_r0x0004c0c8:
    _memmove(pppuVar9,uVar5,uVar8);
  }
  *(undefined1 *)((long)pppuVar9 + uVar8) = 0;
  func_0x0004dd60(auStack_e0,uVar4,&pppuStack_c8,0);
  func_0x006e3d18(uVar4,0xffffd8ee,"readfile");
  pppuVar9 = pppuStack_c8;
  if (-1 < (long)uStack_b8) {
    pppuVar9 = &pppuStack_c8;
  }
  func_0x006e3964(uVar4,pppuVar9);
  func_0x006e4c80(uVar4,1,1);
  uVar5 = func_0x006e2ce4(uVar4,0xffffffff,0);
  uVar8 = _strlen();
  if (0x7ffffffffffffff7 < uVar8) {
code_r0x0004c2f0:
    func_0x0001748c(&pppuStack_110);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x4c2fc);
    (*pcVar2)();
  }
  if (uVar8 < 0x17) {
    uStack_100 = CONCAT17((char)uVar8,(undefined7)uStack_100);
    pppuVar9 = &pppuStack_110;
    if (uVar8 == 0) goto code_r0x0004c1ac;
  }
  else {
    uVar1 = (uVar8 & 0xfffffffffffffff8) + 8;
    if ((uVar8 | 7) != 0x17) {
      uVar1 = uVar8 | 7;
    }
    pppuVar9 = (undefined8 ***)__Znwm(uVar1 + 1);
    uStack_100 = uVar1 + 1 | 0x8000000000000000;
    pppuStack_110 = pppuVar9;
    uStack_108 = uVar8;
  }
  _memmove(pppuVar9,uVar5,uVar8);
code_r0x0004c1ac:
  *(undefined1 *)((long)pppuVar9 + uVar8) = 0;
  uStack_168 = _UNK_007fc000;
  uStack_158 = 0;
  uStack_160 = 0;
  uStack_148 = 0;
  uStack_150 = 0;
  uStack_138 = 0;
  uStack_140 = 0;
  uStack_128 = 0;
  uStack_130 = 0;
  uStack_118 = 0;
  uStack_120 = 0;
  auStack_b0[0] = 0;
  uStack_a8 = 0;
  cStack_60 = '\0';
  uStack_58 = 0;
  func_0x006bd97c(&pppuStack_f8,&pppuStack_110,&uStack_168,auStack_b0,0xa27db8);
  if (cStack_60 != '\0') {
    if (lStack_80 != 0) {
      lStack_78 = lStack_80;
      __ZdlPv();
    }
    if (CONCAT71(uStack_a7,uStack_a8) != 0) {
      __ZdlPv();
    }
  }
  if ((long)uStack_100 < 0) {
    __ZdlPv(pppuStack_110);
  }
  pppuVar9 = pppuStack_f8;
  if (-1 < (char)bStack_e1) {
    uStack_f0 = (ulong)bStack_e1;
    pppuVar9 = &pppuStack_f8;
  }
  iVar3 = func_0x00700e1c(uVar4,"=LocalScript",pppuVar9,uStack_f0,0);
  if (iVar3 == 0) {
    uVar4 = 1;
  }
  else {
    func_0x006e383c(uVar4);
    func_0x006e1ee0(uVar4,0xfffffffe);
    uVar4 = 2;
  }
  if ((char)bStack_e1 < '\0') {
    __ZdlPv(pppuStack_f8);
  }
  if (cStack_c9 < '\0') {
    __ZdlPv(auStack_e0[0]);
  }
  if ((long)uStack_b8 < 0) {
    __ZdlPv(pppuStack_c8);
  }
  return uVar4;
}


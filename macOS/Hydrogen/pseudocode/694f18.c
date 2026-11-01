
undefined8 * FUN_00694f18(void)

{
  ulong uVar1;
  long *plVar2;
  ulong uVar3;
  char cVar4;
  uint uVar5;
  undefined1 *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined4 *puVar9;
  undefined8 *puVar10;
  long *plVar11;
  int in_w8;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  undefined8 unaff_x26;
  undefined1 *unaff_x29;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  
code_r0x00694f18:
  puVar8 = (undefined8 *)register0x00000008;
  if (-1 < in_w8) goto LAB_00694ed4;
  while( true ) {
    __ZdlPv(*(undefined8 *)((long)register0x00000008 + 0x18));
    auVar14 = __Unwind_Resume(unaff_x20);
    plVar11 = auVar14._8_8_;
    puVar10 = auVar14._0_8_;
    puVar8 = (undefined8 *)((long)register0x00000008 + -0xa0);
    *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
    *(ulong *)((long)register0x00000008 + -0x48) = unaff_x25;
    *(ulong *)((long)register0x00000008 + -0x40) = unaff_x24;
    *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
    *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
    *(undefined8 *)((long)register0x00000008 + -0x28) = unaff_x21;
    *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x20;
    *(undefined8 *)((long)register0x00000008 + -0x18) = unaff_x19;
    *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
    *(undefined8 *)((long)register0x00000008 + -8) = 0x694f2c;
    unaff_x29 = (undefined1 *)((long)register0x00000008 + -0x10);
    uVar5 = (uint)(char)*(byte *)((long)plVar11 + 0x17);
    unaff_x24 = (ulong)uVar5;
    uVar3 = plVar11[1];
    if (-1 < (int)uVar5) {
      uVar3 = (ulong)*(byte *)((long)plVar11 + 0x17);
    }
    unaff_x25 = uVar3 + 8;
    if (unaff_x25 < 0x7ffffffffffffff8) break;
    unaff_x20 = func_0x0001748c((undefined1 *)((long)register0x00000008 + -0x88));
    __ZNSt9exceptionD2Ev();
    __ZdlPv();
    if (*(char *)((long)register0x00000008 + -0x89) < '\0') goto code_r0x00694edc;
    cVar4 = *(char *)((long)register0x00000008 + -0x59);
    register0x00000008 = (BADSPACEBASE *)((long)register0x00000008 + -0xa0);
    while( true ) {
      if (cVar4 < '\0') {
        __ZdlPv(*(undefined8 *)((long)register0x00000008 + 0x30));
        in_w8 = (int)*(char *)((long)register0x00000008 + 0x2f);
        goto code_r0x00694f18;
      }
      puVar8 = (undefined8 *)register0x00000008;
      if (*(char *)((long)register0x00000008 + 0x2f) < '\0') break;
LAB_00694ed4:
      __Unwind_Resume(unaff_x20);
code_r0x00694edc:
      __ZdlPv(*puVar8);
      cVar4 = *(char *)((long)puVar8 + 0x47);
      register0x00000008 = (BADSPACEBASE *)puVar8;
    }
  }
  if (unaff_x25 < 0x17) {
    puVar8 = (undefined8 *)((long)register0x00000008 + -0x80);
    *puVar8 = 0;
    *(undefined8 *)((long)register0x00000008 + -0x78) = 0;
    *(char *)((long)register0x00000008 + -0x71) = (char)unaff_x25;
    *(undefined8 *)((long)register0x00000008 + -0x88) = 0x203a676e525f534f;
    if (uVar3 == 0) goto code_r0x00694d58;
  }
  else {
    uVar1 = (unaff_x25 & 0xfffffffffffffff8) + 8;
    if ((unaff_x25 | 7) != 0x17) {
      uVar1 = unaff_x25 | 7;
    }
    puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
    puVar8 = puVar7 + 1;
    *puVar7 = 0x203a676e525f534f;
    *(ulong *)((long)register0x00000008 + -0x80) = unaff_x25;
    *(ulong *)((long)register0x00000008 + -0x78) = uVar1 + 1 | 0x8000000000000000;
    *(undefined8 **)((long)register0x00000008 + -0x88) = puVar7;
  }
  plVar2 = (long *)*plVar11;
  if (-1 < (int)uVar5) {
    plVar2 = plVar11;
  }
  _memmove(puVar8,plVar2,uVar3);
code_r0x00694d58:
  *(undefined1 *)((long)puVar8 + uVar3) = 0;
  puVar8 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     ((undefined1 *)((long)register0x00000008 + -0x88),
                      " operation failed with error ",0x1d);
  uVar13 = puVar8[1];
  uVar12 = *puVar8;
  *(undefined8 *)((long)register0x00000008 + -0x60) = puVar8[2];
  *(undefined8 *)((long)register0x00000008 + -0x68) = uVar13;
  *(undefined8 *)((long)register0x00000008 + -0x70) = uVar12;
  puVar8[1] = 0;
  puVar8[2] = 0;
  *puVar8 = 0;
  puVar9 = (undefined4 *)___error();
  func_0x00049b30((undefined1 *)((long)register0x00000008 + -0xa0),*puVar9,10);
  uVar3 = *(ulong *)((long)register0x00000008 + -0x98);
  puVar6 = *(undefined1 **)((long)register0x00000008 + -0xa0);
  if (-1 < (char)*(byte *)((long)register0x00000008 + -0x89)) {
    uVar3 = (ulong)*(byte *)((long)register0x00000008 + -0x89);
    puVar6 = (undefined1 *)((long)register0x00000008 + -0xa0);
  }
  puVar8 = (undefined8 *)
           __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                     ((undefined1 *)((long)register0x00000008 + -0x70),puVar6,uVar3);
  uVar12 = *puVar8;
  uVar13 = puVar8[1];
  *(undefined4 *)((long)register0x00000008 + -0x58) = *(undefined4 *)(puVar8 + 2);
  *(undefined4 *)((long)register0x00000008 + -0x55) = *(undefined4 *)((long)puVar8 + 0x13);
  cVar4 = *(char *)((long)puVar8 + 0x17);
  puVar8[1] = 0;
  puVar8[2] = 0;
  *puVar8 = 0;
  *puVar10 = &UNK_009b2ec8;
  *(undefined4 *)(puVar10 + 1) = 6;
  if (cVar4 < '\0') {
    func_0x00017634(puVar10 + 2,uVar12);
    __ZdlPv(uVar12);
    cVar4 = *(char *)((long)register0x00000008 + -0x89);
  }
  else {
    puVar10[2] = uVar12;
    puVar10[3] = uVar13;
    *(undefined4 *)(puVar10 + 4) = *(undefined4 *)((long)register0x00000008 + -0x58);
    *(undefined4 *)((long)puVar10 + 0x23) = *(undefined4 *)((long)register0x00000008 + -0x55);
    *(char *)((long)puVar10 + 0x27) = cVar4;
    cVar4 = *(char *)((long)register0x00000008 + -0x89);
  }
  if (cVar4 < '\0') {
    __ZdlPv(*(undefined8 *)((long)register0x00000008 + -0xa0));
  }
  if (*(char *)((long)register0x00000008 + -0x59) < '\0') {
    __ZdlPv(*(undefined8 *)((long)register0x00000008 + -0x70));
    cVar4 = *(char *)((long)register0x00000008 + -0x71);
  }
  else {
    cVar4 = *(char *)((long)register0x00000008 + -0x71);
  }
  if (cVar4 < '\0') {
    __ZdlPv(*(undefined8 *)((long)register0x00000008 + -0x88));
  }
  *puVar10 = &UNK_00a14198;
  return puVar10;
}


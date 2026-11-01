
void FUN_00697664(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 ulong param_5,undefined8 param_6,undefined8 param_7)

{
  int iVar1;
  code *pcVar2;
  int iVar3;
  undefined8 uVar4;
  long *plVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  long *plVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  long *plVar13;
  long unaff_x29;
  undefined1 auVar14 [16];
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000040;
  undefined *puStack_160;
  undefined8 uStack_158;
  ulong uStack_150;
  ulong uStack_148;
  long lStack_140;
  undefined1 auStack_130 [8];
  undefined8 uStack_128;
  long lStack_120;
  long lStack_118;
  undefined8 ***pppuStack_110;
  ulong uStack_108;
  byte bStack_f9;
  undefined8 ***pppuStack_f8;
  ulong uStack_f0;
  byte bStack_e1;
  undefined1 auStack_e0 [24];
  undefined1 auStack_c8 [24];
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined *apuStack_98 [2];
  ulong uStack_88;
  ulong uStack_80;
  long lStack_78;
  
  *(long *)(unaff_x29 + -0x88) = param_1 + 0xd60;
  lVar7 = *(long *)(unaff_x29 + -0x68);
  uVar6 = *(ulong *)(unaff_x29 + -0x78);
  if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
    uVar6 = *(ulong *)(unaff_x29 + -0x70);
  }
  if (lVar7 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lVar7 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  __Unwind_Resume();
  uVar4 = func_0x0001753c();
  func_0x00087574(&uStack0000000000000010);
  func_0x0003e9ec(&uStack0000000000000040);
  auVar14 = __Unwind_Resume(uVar4);
  plVar5 = auVar14._0_8_;
  uVar6 = (**(code **)(*plVar5 + 0x30))();
  if (uVar6 < param_5) {
    lVar7 = (**(code **)(*plVar5 + 0x30))(plVar5);
    uVar4 = ___cxa_allocate_exception(0x28);
    if (lVar7 == 0) {
      (**(code **)(plVar5[1] + 0x18))(&puStack_160,plVar5 + 1);
      func_0x0003a638(apuStack_98,&puStack_160,": this key is too short to encrypt any messages");
      func_0x0002703c(uVar4,apuStack_98);
      ___cxa_throw(uVar4,&DAT_009b2ee0,&DAT_000270bc);
    }
    else {
      (**(code **)(plVar5[1] + 0x18))(auStack_e0);
      func_0x0003a638(auStack_c8,auStack_e0,": message length of ");
      func_0x0060de44(&pppuStack_f8,param_5,10);
      if (-1 < (char)bStack_e1) {
        uStack_f0 = (ulong)bStack_e1;
        pppuStack_f8 = &pppuStack_f8;
      }
      puVar11 = (undefined8 *)
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                          (auStack_c8,pppuStack_f8,uStack_f0);
      uStack_a8 = puVar11[1];
      uStack_b0 = *puVar11;
      uStack_a0 = puVar11[2];
      puVar11[1] = 0;
      puVar11[2] = 0;
      *puVar11 = 0;
      func_0x0003a638(auStack_130,&uStack_b0," exceeds the maximum of ");
      uVar12 = (**(code **)(*plVar5 + 0x30))(plVar5);
      func_0x0060de44(&pppuStack_110,uVar12,10);
      if (-1 < (char)bStack_f9) {
        uStack_108 = (ulong)bStack_f9;
        pppuStack_110 = &pppuStack_110;
      }
      puVar11 = (undefined8 *)
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                          (auStack_130,pppuStack_110,uStack_108);
      uStack_158 = puVar11[1];
      puStack_160 = (undefined *)*puVar11;
      uStack_150 = puVar11[2];
      puVar11[1] = 0;
      puVar11[2] = 0;
      *puVar11 = 0;
      func_0x0003a638(apuStack_98,&puStack_160," for this public key");
      func_0x0002703c(uVar4,apuStack_98);
      ___cxa_throw(uVar4,&DAT_009b2ee0,&DAT_000270bc);
    }
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x697aa8);
    (*pcVar2)();
  }
  lVar7 = func_0x00697cdc(plVar5);
  uStack_128 = 0xffffffffffffffff;
  lStack_120 = lVar7;
  if (lVar7 == 0) {
    lVar8 = 0;
  }
  else {
    lVar8 = func_0x006115d0(lVar7);
  }
  plVar13 = plVar5 + 2;
  lStack_118 = lVar8;
  plVar9 = (long *)(**(code **)(*plVar13 + 0x20))(plVar13);
  plVar10 = (long *)(**(code **)(*plVar13 + 0x10))(plVar13);
  (**(code **)(*plVar10 + 0x10))(apuStack_98);
  iVar3 = func_0x00602288(apuStack_98);
  apuStack_98[0] = &UNK_009f5d60;
  uVar6 = uStack_88;
  if (uStack_80 <= uStack_88) {
    uVar6 = uStack_80;
  }
  if (lStack_78 != 0) {
    if (uVar6 != 0) {
      do {
        *(undefined8 *)(lStack_78 + -8 + uVar6 * 8) = 0;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    func_0x00611644();
  }
  iVar1 = 0;
  if (iVar3 != 0) {
    iVar1 = iVar3 + -1;
  }
  (**(code **)(*plVar9 + 0x20))(plVar9,auVar14._8_8_,param_4,param_5,lVar8,iVar1,param_7);
  plVar9 = (long *)(**(code **)(*plVar13 + 0x18))(plVar13);
  func_0x005fef78(&puStack_160,lVar8,lVar7,0,1);
  (**(code **)(*plVar9 + 0x30))(apuStack_98,plVar9,auVar14._8_8_,&puStack_160);
  uVar4 = (**(code **)(*plVar5 + 0x28))(plVar5);
  func_0x00602560(apuStack_98,param_6,uVar4,0);
  apuStack_98[0] = &UNK_009f5d60;
  if (uStack_80 <= uStack_88) {
    uStack_88 = uStack_80;
  }
  if (lStack_78 != 0) {
    if (uStack_88 != 0) {
      do {
        *(undefined8 *)(lStack_78 + -8 + uStack_88 * 8) = 0;
        uStack_88 = uStack_88 - 1;
      } while (uStack_88 != 0);
    }
    func_0x00611644();
  }
  puStack_160 = &UNK_009f5d60;
  if (uStack_148 <= uStack_150) {
    uStack_150 = uStack_148;
  }
  if (lStack_140 != 0) {
    if (uStack_150 != 0) {
      do {
        *(undefined8 *)(lStack_140 + -8 + uStack_150 * 8) = 0;
        uStack_150 = uStack_150 - 1;
      } while (uStack_150 != 0);
    }
    func_0x00611644();
  }
  if (lVar8 != 0) {
    if (lVar7 != 0) {
      do {
        *(undefined1 *)(lVar8 + -1 + lVar7) = 0;
        lVar7 = lVar7 + -1;
      } while (lVar7 != 0);
    }
    func_0x00611644(lVar8);
  }
  return;
}


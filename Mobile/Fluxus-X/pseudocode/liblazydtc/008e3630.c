/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3630
 */

void FUN_008e3630(uint *param_1,ulong *param_2,undefined8 *param_3)

{
  uint *puVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  void *pvVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined ***pppuVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  undefined **local_208;
  undefined4 local_200;
  undefined8 local_1fc;
  undefined **local_1f0;
  undefined4 local_1e8;
  undefined8 local_1e4;
  undefined **local_1d8;
  undefined4 local_1d0;
  undefined8 local_1cc;
  undefined **local_1c0;
  undefined4 local_1b8;
  undefined8 local_1b4;
  undefined **local_1a8;
  undefined4 local_1a0;
  undefined8 local_19c;
  undefined **local_190;
  undefined4 local_188;
  undefined8 local_184;
  undefined **local_178;
  undefined4 local_170;
  undefined8 local_16c;
  undefined **local_160;
  undefined4 local_158;
  undefined8 local_154;
  undefined **local_148;
  undefined4 local_140;
  undefined8 local_13c;
  undefined **local_130;
  uint local_128;
  undefined8 local_124;
  undefined **local_118;
  undefined4 local_110;
  undefined8 local_10c;
  undefined **local_100;
  undefined8 local_f8;
  undefined4 local_f0;
  undefined8 local_e8;
  undefined8 local_e0;
  undefined8 uStack_d8;
  undefined **local_d0;
  uint local_c8;
  undefined8 local_c4;
  undefined **local_b8;
  undefined4 local_b0;
  undefined8 local_ac;
  undefined *apuStack_a0 [4];
  
  FUN_008e3a68(apuStack_a0,0);
  uVar10 = *param_2;
  puVar1 = (uint *)((long)(int)param_2[1] + (long)param_1);
  do {
    if (puVar1 <= param_1) {
      local_118 = apuStack_a0;
      FUN_008e47d8(&local_118,uVar10);
      FUN_008e3ca4(apuStack_a0);
      puVar7 = (undefined8 *)FUN_008e44d8(apuStack_a0);
      iVar3 = *(int *)(puVar7 + 1);
      *param_3 = *puVar7;
      param_3[1] = (long)iVar3;
      operator_delete(puVar7);
      FUN_008e3d18(apuStack_a0);
      return;
    }
    uVar2 = *param_1;
    uVar11 = (ulong)uVar2;
    plVar4 = (long *)FUN_008e47b0(apuStack_a0);
    (**(code **)(*plVar4 + 0x20))();
    if ((uVar2 & 0x3b000000) == 0x18000000) {
      local_b0 = 0x11;
      local_b8 = &PTR_LAB_00c4e320;
      local_ac = 0x4000000001;
      FUN_008e3a8c(apuStack_a0,&local_b8,
                   uVar10 + ((long)((ulong)(uVar2 >> 3 & 0x1ffffc) << 0x2b) >> 0x2b));
      if (uVar2 >> 0x1e == 1) {
        local_c4 = 0x4000000001;
      }
      else {
        if (uVar2 >> 0x1e != 0) {
          log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","ARM64InstructionRelocation.cc",0x99,
                            "GenRelocateCodeAndBranch");
          log_internal_impl(0xffffffff,"[!] %s\n\n","unimplemented code!!!");
                    /* WARNING: Subroutine does not return */
          abort();
        }
        local_c4 = 0x2000000000;
      }
      local_d0 = &PTR_LAB_00c4e320;
      local_110 = 0x11;
      local_118 = &PTR_LAB_00c4e320;
      local_10c = 0x4000000001;
      local_100 = &PTR_LAB_00c4e320;
      local_f8 = 0x900000000;
      local_f0 = 0;
      local_e8 = 0;
      uStack_d8 = 0;
      local_e0 = 0xffffffffffffffff;
      local_c8 = uVar2 & 0x1f;
      FUN_008e3b00(apuStack_a0,&local_d0,&local_118);
    }
    else if ((uVar2 & 0x1f000000) == 0x10000000) {
      local_128 = uVar2 & 0x1f;
      lVar9 = ((ulong)(uVar2 >> 3) & 0x1ffffc | (ulong)(uVar2 >> 0x1d) & 3) << 0x2b;
      if ((uVar2 & 0x9f000000) == 0x10000000) {
        lVar9 = uVar10 + (lVar9 >> 0x2b);
      }
      else {
        lVar9 = (uVar10 & 0xfffffffffffff000) + (lVar9 >> 0x1f);
      }
      local_130 = &PTR_LAB_00c4e320;
      local_124 = 0x4000000001;
      FUN_008e3a8c(apuStack_a0,&local_130,lVar9);
    }
    else if ((uVar2 & 0x7c000000) == 0x14000000) {
      pvVar5 = operator_new(0x38);
      FUN_008e42b8(pvVar5,uVar10 + ((long)(uVar11 << 0x26) >> 0x24));
      FUN_008e42ac();
      local_140 = 0x11;
      local_148 = &PTR_LAB_00c4e320;
      local_13c = 0x4000000001;
      FUN_008e3bb4(apuStack_a0,&local_148,0x3b000000);
      if (uVar2 >> 0x1a == 0x25) {
        local_158 = 0x11;
        local_160 = &PTR_LAB_00c4e320;
        local_154 = 0x4000000001;
        FUN_008e3c84(apuStack_a0,&local_160);
      }
      else {
        local_170 = 0x11;
        local_178 = &PTR_LAB_00c4e320;
        local_16c = 0x4000000001;
        FUN_008e3c94(apuStack_a0,&local_178);
      }
    }
    else {
      if ((uVar2 & 0x7e000000) == 0x34000000) {
        FUN_008e42d8();
        uVar6 = FUN_008e42cc(0x1000060);
        FUN_008e42b8(uVar6,uVar11);
        FUN_008e42ac();
        FUN_008e42c0();
        local_1b8 = 0x11;
        local_1c0 = &PTR_LAB_00c4e320;
        local_1b4 = 0x4000000001;
        FUN_008e42ec(apuStack_a0,&local_1c0,0x3b000000);
        pppuVar8 = &local_1d8;
        local_1d0 = 0x11;
        local_1d8 = &PTR_LAB_00c4e320;
        local_1cc = 0x4000000001;
      }
      else if ((uVar2 & 0x7e000000) == 0x36000000) {
        pvVar5 = operator_new(0x38);
        FUN_008e42b8(pvVar5,uVar10 + (long)(short)((ushort)(uVar2 >> 3) & 0xfffc));
        FUN_008e42ac();
        FUN_008e4874(apuStack_a0,uVar2 & 0xfff8001f ^ 0x1000060);
        local_188 = 0x11;
        local_190 = &PTR_LAB_00c4e320;
        local_184 = 0x4000000001;
        FUN_008e42ec(apuStack_a0,&local_190,0x3b000000);
        pppuVar8 = &local_1a8;
        local_1a0 = 0x11;
        local_1a8 = &PTR_LAB_00c4e320;
        local_19c = 0x4000000001;
      }
      else {
        if (uVar2 >> 0x19 != 0x2a) {
          FUN_008e4874(apuStack_a0,uVar11);
          goto LAB_008e399c;
        }
        FUN_008e42d8();
        uVar6 = FUN_008e42cc(0x61);
        FUN_008e42b8(uVar6,uVar11);
        FUN_008e42ac();
        FUN_008e42c0();
        local_1e8 = 0x11;
        local_1f0 = &PTR_LAB_00c4e320;
        local_1e4 = 0x4000000001;
        FUN_008e42ec(apuStack_a0,&local_1f0,0x3b000000);
        pppuVar8 = &local_208;
        local_200 = 0x11;
        local_208 = &PTR_LAB_00c4e320;
        local_1fc = 0x4000000001;
      }
      FUN_008e3c94(apuStack_a0,pppuVar8);
    }
LAB_008e399c:
    uVar10 = uVar10 + 4;
    param_1 = param_1 + 1;
    thunk_FUN_008e47c8(apuStack_a0);
  } while( true );
}



undefined *
FUN_002b3eec(ulong param_1,undefined8 param_2,undefined8 param_3,code *param_4,int param_5)

{
  byte bVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  undefined *puVar5;
  undefined *puVar6;
  ulong in_x9;
  undefined *puVar7;
  ulong in_x10;
  ulong *unaff_x19;
  undefined8 *unaff_x20;
  byte *unaff_x22;
  undefined8 unaff_x23;
  undefined1 auVar8 [16];
  long in_stack_00000028;
  ulong uStack_58;
  ulong uStack_50;
  ulong uStack_48;
  ulong uStack_40;
  long lStack_38;
  
  *unaff_x19 = in_x10 ^ param_1;
  unaff_x19[1] = in_x9;
  unaff_x19[0x20] = (ulong)&_aws_lc_0_24_0_gcm_gmult_nohw;
  unaff_x19[0x21] = (ulong)&_aws_lc_0_24_0_gcm_ghash_nohw;
  *(byte *)(unaff_x19 + 0x23) = (byte)unaff_x19[0x23] & 0xfe | *unaff_x22 >> 5 & 1;
  if (unaff_x20 != (undefined8 *)0x0) {
    *unaff_x20 = unaff_x23;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000028) {
    return &DAT_00378c40;
  }
  ___stack_chk_fail(&DAT_00378c40);
  auVar8 = func_0x0079e398();
  puVar4 = auVar8._0_8_;
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  puVar4[0x21] = 0;
  puVar4[0x20] = 0;
  puVar4[0x23] = 0;
  puVar4[0x22] = 0;
  puVar4[0x1d] = 0;
  puVar4[0x1c] = 0;
  puVar4[0x1f] = 0;
  puVar4[0x1e] = 0;
  puVar4[0x19] = 0;
  puVar4[0x18] = 0;
  puVar4[0x1b] = 0;
  puVar4[0x1a] = 0;
  puVar4[0x15] = 0;
  puVar4[0x14] = 0;
  puVar4[0x17] = 0;
  puVar4[0x16] = 0;
  puVar4[0x11] = 0;
  puVar4[0x10] = 0;
  puVar4[0x13] = 0;
  puVar4[0x12] = 0;
  puVar4[0xd] = 0;
  puVar4[0xc] = 0;
  puVar4[0xf] = 0;
  puVar4[0xe] = 0;
  puVar4[9] = 0;
  puVar4[8] = 0;
  puVar4[0xb] = 0;
  puVar4[10] = 0;
  puVar4[5] = 0;
  puVar4[4] = 0;
  puVar4[7] = 0;
  puVar4[6] = 0;
  puVar4[1] = 0;
  *puVar4 = 0;
  puVar4[3] = 0;
  puVar4[2] = 0;
  puVar4[0x22] = (ulong)param_4;
  uStack_58 = 0;
  uStack_50 = 0;
  puVar5 = (undefined *)(*param_4)(&uStack_58,&uStack_58,auVar8._8_8_);
  uVar2 = (uStack_58 & 0xff00ff00ff00ff00) >> 8 | (uStack_58 & 0xff00ff00ff00ff) << 8;
  uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
  uStack_48 = uVar2 >> 0x20 | uVar2 << 0x20;
  uVar3 = (uStack_50 & 0xff00ff00ff00ff00) >> 8 | (uStack_50 & 0xff00ff00ff00ff) << 8;
  uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
  uStack_40 = uVar3 >> 0x20 | uVar3 << 0x20;
  if ((uRam0000000000a334f8 >> 5 & 1) == 0) {
    if ((uRam0000000000a334f8 & 1) == 0) {
      *puVar4 = ((uVar3 & 0xffffffff) >> 0x1f | uStack_48 << 1) ^
                (long)uStack_48 >> 0x3f & 0xc200000000000000U;
      puVar4[1] = (uVar2 & 0xffffffff) >> 0x1f | uStack_40 << 1;
      puVar6 = &_aws_lc_0_24_0_gcm_ghash_nohw;
      puVar7 = &_aws_lc_0_24_0_gcm_gmult_nohw;
    }
    else {
      puVar5 = (undefined *)func_0x00382d10(puVar4,&uStack_48);
      puVar6 = &DAT_00382d90;
      puVar7 = &DAT_00382d60;
    }
  }
  else {
    puVar5 = (undefined *)func_0x00383020(puVar4,&uStack_48);
    puVar6 = &DAT_003832f0;
    puVar7 = &DAT_00383280;
  }
  puVar4[0x20] = (ulong)puVar7;
  puVar4[0x21] = (ulong)puVar6;
  bVar1 = 0;
  if (param_5 != 0) {
    bVar1 = (byte)(uRam0000000000a334f8 >> 5) & 1;
  }
  *(byte *)(puVar4 + 0x23) = (byte)puVar4[0x23] & 0xfe | bVar1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return puVar5;
  }
  ___stack_chk_fail();
  func_0x00373e9c(0xa29668,&DAT_002b4228);
  return (undefined *)0xa3a880;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00959eb8
 */

undefined8 FUN_00959eb8(undefined1 *param_1,void *param_2,undefined8 param_3)

{
  long lVar1;
  undefined1 uVar2;
  uint uVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  size_t sVar7;
  undefined4 local_f0;
  undefined4 local_ec;
  undefined8 local_e8;
  undefined8 uStack_e0;
  undefined1 auStack_d8 [56];
  undefined1 local_a0;
  undefined1 local_9f;
  undefined1 local_9e;
  undefined1 local_9d;
  undefined1 local_9c;
  undefined1 local_9b;
  undefined1 local_9a;
  undefined1 local_99;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uStack_e0 = 0x1032547698badcfe;
  local_e8 = 0xefcdab8967452301;
  uVar4 = FUN_00963a64(param_3);
  sVar7 = uVar4 & 0xffffffff;
  uVar3 = (uint)uVar4;
  local_f0 = uVar3 & 0x1fffffff;
  local_ec = uVar3 >> 0x1d;
  if (0x3f < uVar3) {
    param_2 = (void *)FUN_0095a12c(&local_f0,param_2,uVar4 & 0xffffffc0);
    sVar7 = uVar4 & 0x3f;
  }
  uVar3 = local_f0;
  memcpy(auStack_d8,param_2,sVar7);
  uVar6 = (ulong)(uVar3 & 0x3f);
  uVar4 = uVar6 ^ 0x3f;
  lVar5 = uVar6 + 1;
  sVar7 = uVar4 - 8;
  auStack_d8[uVar6] = 0x80;
  if (uVar4 < 8) {
    memset(auStack_d8 + uVar6 + 1,0,uVar4);
    FUN_0095a12c(&local_f0,auStack_d8,0x40);
    lVar5 = 0;
    sVar7 = 0x38;
    uVar3 = local_f0;
  }
  memset(auStack_d8 + lVar5,0,sVar7);
  local_f0 = uVar3 << 3;
  local_a0 = FUN_00963a58(local_f0 & 0xf8);
  local_9f = FUN_00963a58(local_f0 >> 8 & 0xff);
  local_9e = FUN_00963a58(local_f0._2_1_);
  local_9d = FUN_00963a58(local_f0._3_1_);
  local_9c = FUN_00963a58((undefined1)local_ec);
  local_9b = FUN_00963a58(local_ec >> 8 & 0xff);
  local_9a = FUN_00963a58(local_ec._2_1_);
  local_99 = FUN_00963a58(local_ec._3_1_);
  FUN_0095a12c(&local_f0,auStack_d8,0x40);
  uVar2 = FUN_00963a58(local_e8 & 0xff);
  *param_1 = uVar2;
  uVar2 = FUN_00963a58((uint)local_e8 >> 8 & 0xff);
  param_1[1] = uVar2;
  uVar2 = FUN_00963a58(local_e8._2_1_);
  param_1[2] = uVar2;
  uVar2 = FUN_00963a58(local_e8._3_1_);
  param_1[3] = uVar2;
  uVar2 = FUN_00963a58(local_e8._4_1_);
  param_1[4] = uVar2;
  uVar2 = FUN_00963a58(local_e8._4_4_ >> 8 & 0xff);
  param_1[5] = uVar2;
  uVar2 = FUN_00963a58(local_e8._6_1_);
  param_1[6] = uVar2;
  uVar2 = FUN_00963a58(local_e8._7_1_);
  param_1[7] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0 & 0xff);
  param_1[8] = uVar2;
  uVar2 = FUN_00963a58((uint)uStack_e0 >> 8 & 0xff);
  param_1[9] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0._2_1_);
  param_1[10] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0._3_1_);
  param_1[0xb] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0._4_1_);
  param_1[0xc] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0._4_4_ >> 8 & 0xff);
  param_1[0xd] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0._6_1_);
  param_1[0xe] = uVar2;
  uVar2 = FUN_00963a58(uStack_e0._7_1_);
  param_1[0xf] = uVar2;
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}


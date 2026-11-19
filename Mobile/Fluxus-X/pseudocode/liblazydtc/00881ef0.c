/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00881ef0
 */

void FUN_00881ef0(undefined8 *param_1,byte *param_2,undefined8 param_3,undefined2 *param_4,
                 undefined8 param_5)

{
  ulong uVar1;
  byte *pbVar2;
  int iVar3;
  char cVar4;
  long lVar5;
  int *piVar6;
  undefined8 uVar7;
  undefined1 auStack_4d8 [16];
  byte local_4c8;
  undefined7 uStack_4c7;
  void *local_4b8;
  byte local_220;
  undefined7 uStack_21f;
  undefined8 uStack_218;
  undefined8 local_210;
  undefined2 local_1a8 [4];
  void *local_1a0;
  undefined8 local_198;
  undefined8 local_190;
  void *local_188;
  undefined8 local_180;
  undefined1 local_170;
  void *local_168;
  void *local_160;
  long local_158;
  char local_148;
  undefined2 local_140;
  undefined1 auStack_138 [40];
  long *local_110;
  long *plStack_108;
  void *local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  void *local_90;
  undefined8 local_88;
  undefined1 local_78;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  FUN_0084e8dc(auStack_4d8);
                    /* try { // try from 00881f38 to 00881f43 has its CatchHandler @ 00882240 */
  FUN_00852e10(&local_a8,auStack_4d8);
  uVar1 = *(ulong *)(param_2 + 8);
  pbVar2 = *(byte **)(param_2 + 0x10);
  cVar4 = *(char *)(param_4 + 0x30);
  local_1a8[0] = *param_4;
  local_1a0 = (void *)((ulong)local_1a0 & 0xffffffffffffff00);
  if ((*param_2 & 1) == 0) {
    pbVar2 = param_2 + 1;
    uVar1 = (ulong)(*param_2 >> 1);
  }
  local_148 = 0;
  if (cVar4 == '\x01') {
                    /* try { // try from 00881f7c to 00881f87 has its CatchHandler @ 00882164 */
    FUN_0086f524(&local_1a0,param_4 + 4);
  }
  local_140 = param_4[0x34];
                    /* try { // try from 00881f98 to 00881fb3 has its CatchHandler @ 00882230 */
  local_148 = cVar4 == '\x01';
  FUN_00857b2c(auStack_138,pbVar2,uVar1,&local_a8,auStack_4d8,local_1a8);
  if (local_148 == '\x01') {
    if (local_168 != (void *)0x0) {
      local_160 = local_168;
      operator_delete(local_168,local_158 - (long)local_168);
    }
    if (local_1a0 != (void *)0x0) {
      operator_delete(local_1a0);
      local_1a0 = (void *)0x0;
      operator_delete(local_188);
      local_190 = 0;
      local_198 = 0;
      local_188 = (void *)0x0;
      operator_delete((void *)0x0);
      local_180 = 0;
      local_170 = 0x40;
    }
    operator_delete(local_188);
  }
  if (local_110 == plStack_108) {
                    /* try { // try from 00882080 to 0088208b has its CatchHandler @ 00882158 */
    FUN_00873458(&local_4c8,param_5);
                    /* try { // try from 0088208c to 008820d3 has its CatchHandler @ 00882168 */
    FUN_0087fe44(&local_4c8,auStack_138,&local_a8,param_3);
    if ((local_220 & 1) == 0) {
      param_1[1] = uStack_218;
      *param_1 = CONCAT71(uStack_21f,local_220);
      param_1[2] = local_210;
    }
    else {
      FUN_007ff40c(param_1,local_210,uStack_218);
    }
    FUN_008792e0(&local_4c8);
  }
  else {
                    /* try { // try from 00882024 to 0088202b has its CatchHandler @ 00882248 */
    piVar6 = (int *)FUN_008578f0(local_110);
    iVar3 = *piVar6;
    uVar7 = (**(code **)(*local_110 + 0x10))(local_110);
                    /* try { // try from 00882044 to 00882057 has its CatchHandler @ 00882248 */
    FUN_008aa02c(&local_4c8,":%d: %s",iVar3 + 1,uVar7);
                    /* try { // try from 00882058 to 00882063 has its CatchHandler @ 00882210 */
    FUN_00878760(param_1,&local_4c8);
    if ((local_4c8 & 1) != 0) {
      operator_delete(local_4b8,CONCAT71(uStack_4c7,local_4c8) & 0xfffffffffffffffe);
    }
  }
  FUN_00872ca4(auStack_138);
  if (local_a8 != (void *)0x0) {
    operator_delete(local_a8);
    local_a8 = (void *)0x0;
    operator_delete(local_90);
    local_a0 = 0;
    uStack_98 = 0;
    local_90 = (void *)0x0;
    operator_delete((void *)0x0);
    local_88 = 0;
    local_78 = 0x40;
  }
  operator_delete(local_90);
  FUN_0084e908(auStack_4d8);
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


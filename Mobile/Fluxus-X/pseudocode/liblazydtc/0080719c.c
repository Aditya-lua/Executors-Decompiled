/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0080719c
 */

void FUN_0080719c(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  ulong uVar1;
  char *pcVar2;
  long lVar3;
  bool bVar4;
  byte local_120;
  undefined7 uStack_11f;
  ulong uStack_118;
  char *local_110;
  undefined8 local_108;
  undefined8 local_100;
  undefined8 uStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  undefined4 local_e0;
  undefined **local_d8;
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined2 local_a8 [4];
  void *local_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  void *local_88;
  undefined8 local_80;
  undefined1 local_70;
  void *local_68;
  void *local_60;
  long local_58;
  char local_48;
  undefined2 local_40;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  uStack_f8 = 0;
  local_100 = 0;
  uStack_e8 = 0;
  uStack_f0 = 0;
  uStack_c8 = 0;
  local_d0 = 0;
  uStack_b8 = 0;
  uStack_c0 = 0;
  local_e0 = 0;
  local_b0 = 0;
  local_108 = 0x200000001;
  local_d8 = &PTR_DAT_00cc4448;
  local_a8[0] = 0;
  local_a0 = (void *)((ulong)local_a0 & 0xffffffffffffff00);
  local_48 = '\0';
  local_40 = 0;
                    /* try { // try from 00807208 to 0080721b has its CatchHandler @ 00807324 */
  FUN_00881ef0(&local_120,param_3,&local_108,local_a8,param_2);
  if (local_48 == '\x01') {
    if (local_68 != (void *)0x0) {
      local_60 = local_68;
      operator_delete(local_68,local_58 - (long)local_68);
    }
    if (local_a0 != (void *)0x0) {
      operator_delete(local_a0);
      local_a0 = (void *)0x0;
      operator_delete(local_88);
      local_98 = 0;
      uStack_90 = 0;
      local_88 = (void *)0x0;
      operator_delete((void *)0x0);
      local_80 = 0;
      local_70 = 0x40;
    }
    operator_delete(local_88);
  }
  bVar4 = (local_120 & 1) != 0;
  uVar1 = (ulong)(local_120 >> 1);
  if (bVar4) {
    uVar1 = uStack_118;
  }
  if (uVar1 != 0) {
    pcVar2 = local_110;
    if (!bVar4) {
      pcVar2 = (char *)&uStack_11f;
    }
    if (*pcVar2 != '\0') {
                    /* try { // try from 008072a8 to 008072b3 has its CatchHandler @ 00807304 */
      FUN_00806e50(param_1,&local_120);
      if ((local_120 & 1) != 0) {
        operator_delete(local_110,CONCAT71(uStack_11f,local_120) & 0xfffffffffffffffe);
      }
      goto LAB_008072e0;
    }
  }
  param_1[1] = uStack_118;
  *param_1 = CONCAT71(uStack_11f,local_120);
  param_1[2] = local_110;
LAB_008072e0:
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


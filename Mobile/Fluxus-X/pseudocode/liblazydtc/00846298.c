/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00846298
 */

void FUN_00846298(undefined8 *param_1,locale *param_2,undefined8 param_3,undefined1 param_4,
                 undefined1 param_5,undefined1 param_6)

{
  ulong uVar1;
  char *pcVar2;
  long lVar3;
  bool bVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  locale alStack_78 [8];
  byte local_70;
  undefined7 uStack_6f;
  ulong local_68;
  char *local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  *param_1 = &PTR_FUN_00c48ec0;
  param_1[1] = param_3;
  std::__ndk1::locale::locale((locale *)(param_1 + 2),param_2);
  uVar6 = *(undefined8 *)(param_2 + 0x10);
  uVar5 = *(undefined8 *)(param_2 + 8);
  param_1[0xc] = 0;
  param_1[0xb] = 0;
  param_1[4] = uVar6;
  param_1[3] = uVar5;
  param_1[8] = 0;
  param_1[7] = 0;
  param_1[10] = 0;
  param_1[9] = 0;
  param_1[6] = 0;
  param_1[5] = 0;
  param_1[0xe] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0xf] = 0;
  param_1[0x12] = 0;
  param_1[0x11] = 0;
  *(undefined8 *)((long)param_1 + 0x9c) = 0;
  *(undefined8 *)((long)param_1 + 0x94) = 0;
  *(undefined1 *)((long)param_1 + 0xa4) = param_4;
  *(undefined1 *)((long)param_1 + 0xa5) = param_5;
  *(undefined1 *)((long)param_1 + 0xa6) = param_6;
  std::__ndk1::locale::locale(alStack_78,(locale *)(param_1 + 2));
                    /* try { // try from 0084632c to 00846337 has its CatchHandler @ 008463c8 */
  std::__ndk1::locale::name();
  uVar1 = (ulong)(local_70 >> 1);
  if ((local_70 & 1) != 0) {
    uVar1 = local_68;
  }
  if (uVar1 == 1) {
    pcVar2 = local_60;
    if ((local_70 & 1) == 0) {
      pcVar2 = (char *)&uStack_6f;
    }
    bVar4 = *pcVar2 != 'C';
  }
  else {
    bVar4 = true;
  }
  if ((local_70 & 1) != 0) {
    operator_delete(local_60,CONCAT71(uStack_6f,local_70) & 0xfffffffffffffffe);
  }
  std::__ndk1::locale::~locale(alStack_78);
  *(bool *)((long)param_1 + 0xa7) = bVar4;
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00847470
 */

void FUN_00847470(byte *param_1,long param_2,void *param_3,void *param_4)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  byte *pbVar4;
  ulong uVar5;
  void *pvVar6;
  undefined8 local_70;
  ulong local_68;
  void *local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  uVar5 = (long)param_4 - (long)param_3;
  local_58 = *(long *)(lVar3 + 0x28);
  if (uVar5 < 0xfffffffffffffff8) {
    if (uVar5 < 0x17) {
      pvVar6 = (void *)((ulong)&local_70 | 1);
      local_70 = CONCAT71(local_70._1_7_,(char)((int)uVar5 << 1));
    }
    else {
      uVar1 = 0x1a;
      if ((uVar5 | 7) != 0x17) {
        uVar1 = (uVar5 | 7) + 1;
      }
      pvVar6 = operator_new(uVar1);
      local_70 = uVar1 | 1;
      local_68 = uVar5;
      local_60 = pvVar6;
    }
    if (param_4 != param_3) {
      memcpy(pvVar6,param_3,uVar5);
    }
    *(undefined1 *)((long)pvVar6 + uVar5) = 0;
    if ((local_70 & 1) == 0) {
      uVar5 = local_70 >> 1 & 0x7f;
      pvVar6 = (void *)((long)&local_70 + 1);
    }
    else {
      uVar5 = local_68;
      pvVar6 = local_60;
    }
                    /* try { // try from 00847544 to 0084754f has its CatchHandler @ 0084760c */
    (**(code **)(**(long **)(param_2 + 0x10) + 0x20))
              (param_1,*(long **)(param_2 + 0x10),pvVar6,(long)pvVar6 + uVar5);
    bVar2 = *param_1;
    uVar5 = (ulong)(bVar2 >> 1);
    if ((bVar2 & 1) != 0) {
      uVar5 = *(ulong *)(param_1 + 8);
    }
    if (uVar5 != 1) {
      if (uVar5 == 0xc) {
        pbVar4 = *(byte **)(param_1 + 0x10);
        if ((bVar2 & 1) == 0) {
          pbVar4 = param_1 + 1;
        }
        pbVar4[0xb] = pbVar4[3];
      }
      else if ((bVar2 & 1) == 0) {
        param_1[0] = 0;
        param_1[1] = 0;
      }
      else {
        **(undefined1 **)(param_1 + 0x10) = 0;
        param_1[8] = 0;
        param_1[9] = 0;
        param_1[10] = 0;
        param_1[0xb] = 0;
        param_1[0xc] = 0;
        param_1[0xd] = 0;
        param_1[0xe] = 0;
        param_1[0xf] = 0;
      }
    }
    if ((local_70 & 1) != 0) {
      operator_delete(local_60,local_70 & 0xfffffffffffffffe);
    }
    if (*(long *)(lVar3 + 0x28) == local_58) {
      return;
    }
  }
  else if (*(long *)(lVar3 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


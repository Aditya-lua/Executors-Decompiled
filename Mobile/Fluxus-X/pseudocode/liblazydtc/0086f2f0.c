/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086f2f0
 */

void FUN_0086f2f0(undefined8 *param_1,long param_2,long param_3,ulong param_4)

{
  long lVar1;
  undefined8 *puVar2;
  byte bVar3;
  long lVar4;
  void *pvVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  undefined8 *local_68;
  undefined1 local_60;
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  local_60 = 0;
  local_68 = param_1;
  if (param_4 != 0) {
    if (0x555555555555555 < param_4) {
      if (*(long *)(lVar4 + 0x28) == local_58) {
                    /* try { // try from 0086f414 to 0086f417 has its CatchHandler @ 0086f418 */
        uVar6 = FUN_0086f2dc();
                    /* catch() { ... } // from try @ 0086f350 with catch @ 0086f418
                       catch() { ... } // from try @ 0086f414 with catch @ 0086f418 */
        FUN_0086f480(&local_68);
        if (*(long *)(lVar4 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
          FUN_00c2c090(uVar6);
        }
      }
      goto LAB_0086f47c;
    }
                    /* try { // try from 0086f350 to 0086f353 has its CatchHandler @ 0086f418 */
    pvVar5 = operator_new(param_4 * 0x30);
    *param_1 = pvVar5;
    param_1[1] = pvVar5;
    param_1[2] = (void *)((long)pvVar5 + param_4 * 0x30);
    if (param_2 != param_3) {
      lVar7 = 0;
      do {
        lVar1 = param_2 + lVar7;
        puVar2 = (undefined8 *)((long)pvVar5 + lVar7);
        *puVar2 = &PTR_LAB_00c4a5f8;
        bVar3 = *(byte *)(lVar1 + 0x18);
        uVar6 = *(undefined8 *)(lVar1 + 8);
        puVar2[2] = *(undefined8 *)(lVar1 + 0x10);
        puVar2[1] = uVar6;
        if ((bVar3 & 1) == 0) {
          uVar8 = *(undefined8 *)(lVar1 + 0x18);
          uVar6 = *(undefined8 *)(lVar1 + 0x28);
          puVar2[4] = *(undefined8 *)(lVar1 + 0x20);
          puVar2[3] = uVar8;
          puVar2[5] = uVar6;
        }
        else {
                    /* try { // try from 0086f3c4 to 0086f3cb has its CatchHandler @ 0086f420 */
          FUN_007ff40c(puVar2 + 3,*(undefined8 *)(lVar1 + 0x28),*(undefined8 *)(lVar1 + 0x20));
        }
        lVar7 = lVar7 + 0x30;
      } while (param_2 + lVar7 != param_3);
      pvVar5 = (void *)((long)pvVar5 + lVar7);
    }
    param_1[1] = pvVar5;
  }
  if (*(long *)(lVar4 + 0x28) == local_58) {
    return;
  }
LAB_0086f47c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


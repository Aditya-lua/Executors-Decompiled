/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00842d60
 */

byte * FUN_00842d60(locale *param_1,byte *param_2,byte *param_3)

{
  byte bVar1;
  long lVar2;
  undefined8 *puVar3;
  long lVar4;
  uint uVar5;
  undefined *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined1 auStack_88 [24];
  undefined4 local_70;
  int local_6c;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (param_2 != param_3) {
    bVar1 = *param_2;
    if (bVar1 < 0x5c) {
      if (bVar1 == 0x24) {
        puVar3 = operator_new(0x18);
        lVar4 = *(long *)(param_1 + 0x38);
        uVar5 = *(uint *)(param_1 + 0x18);
        puVar6 = &std::__ndk1::__r_anchor_multiline<char>::vtable;
LAB_00842eb8:
        uVar7 = *(undefined8 *)(lVar4 + 8);
        param_2 = param_2 + 1;
        *puVar3 = puVar6 + 0x10;
        puVar3[1] = uVar7;
        *(bool *)(puVar3 + 2) = (uVar5 & 0x5f0) == 0x400;
        *(undefined8 **)(lVar4 + 8) = puVar3;
        *(undefined8 **)(param_1 + 0x38) = puVar3;
      }
      else if ((((bVar1 == 0x28) && (param_2 + 1 != param_3)) && (param_2[1] == 0x3f)) &&
              (param_2 + 2 != param_3)) {
        bVar1 = param_2[2];
        if (bVar1 == 0x21) {
          FUN_00843684(auStack_88);
          local_70 = *(undefined4 *)(param_1 + 0x18);
                    /* try { // try from 00842ff4 to 00843007 has its CatchHandler @ 0084306c */
          param_2 = (byte *)FUN_00841f98(auStack_88,param_2 + 3,param_3);
                    /* try { // try from 00843018 to 0084306b has its CatchHandler @ 00843074 */
          FUN_008436f0(param_1,auStack_88,1,*(undefined4 *)(param_1 + 0x1c));
          *(int *)(param_1 + 0x1c) = *(int *)(param_1 + 0x1c) + local_6c;
          if ((param_2 == param_3) || (*param_2 != 0x29)) {
            if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
              FUN_008437a0();
            }
            goto LAB_0084309c;
          }
        }
        else {
          if (bVar1 != 0x3d) goto LAB_00842ee4;
          FUN_00843684(auStack_88);
          local_70 = *(undefined4 *)(param_1 + 0x18);
                    /* try { // try from 00842e00 to 00842e13 has its CatchHandler @ 00843070 */
          param_2 = (byte *)FUN_00841f98(auStack_88,param_2 + 3,param_3);
                    /* try { // try from 00842e24 to 00842e63 has its CatchHandler @ 00843078 */
          FUN_008436f0(param_1,auStack_88,0,*(undefined4 *)(param_1 + 0x1c));
          *(int *)(param_1 + 0x1c) = *(int *)(param_1 + 0x1c) + local_6c;
          if ((param_2 == param_3) || (*param_2 != 0x29)) {
            if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
              FUN_008437a0();
            }
            goto LAB_0084309c;
          }
        }
        param_2 = param_2 + 1;
        FUN_00841150(auStack_88);
      }
    }
    else if (bVar1 == 0x5c) {
      if (param_2 + 1 != param_3) {
        bVar1 = param_2[1];
        if (bVar1 == 0x42) {
          puVar3 = operator_new(0x30);
          uVar7 = *(undefined8 *)(*(long *)(param_1 + 0x38) + 8);
          *puVar3 = &PTR_LAB_00c48c38;
          puVar3[1] = uVar7;
          std::__ndk1::locale::locale((locale *)(puVar3 + 2),param_1);
          uVar8 = *(undefined8 *)(param_1 + 0x10);
          uVar7 = *(undefined8 *)(param_1 + 8);
          lVar4 = *(long *)(param_1 + 0x38);
          *(undefined1 *)(puVar3 + 5) = 1;
          puVar3[4] = uVar8;
          puVar3[3] = uVar7;
          *(undefined8 **)(lVar4 + 8) = puVar3;
        }
        else {
          if (bVar1 != 0x62) goto LAB_00842ee4;
          puVar3 = operator_new(0x30);
          uVar7 = *(undefined8 *)(*(long *)(param_1 + 0x38) + 8);
          *puVar3 = &PTR_LAB_00c48c38;
          puVar3[1] = uVar7;
          std::__ndk1::locale::locale((locale *)(puVar3 + 2),param_1);
          uVar8 = *(undefined8 *)(param_1 + 0x10);
          uVar7 = *(undefined8 *)(param_1 + 8);
          lVar4 = *(long *)(param_1 + 0x38);
          *(undefined1 *)(puVar3 + 5) = 0;
          puVar3[4] = uVar8;
          puVar3[3] = uVar7;
          *(undefined8 **)(lVar4 + 8) = puVar3;
        }
        param_2 = param_2 + 2;
        *(undefined8 **)(param_1 + 0x38) = puVar3;
      }
    }
    else if (bVar1 == 0x5e) {
      puVar3 = operator_new(0x18);
      lVar4 = *(long *)(param_1 + 0x38);
      uVar5 = *(uint *)(param_1 + 0x18);
      puVar6 = &std::__ndk1::__l_anchor_multiline<char>::vtable;
      goto LAB_00842eb8;
    }
  }
LAB_00842ee4:
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return param_2;
  }
LAB_0084309c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


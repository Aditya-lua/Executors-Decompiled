/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8785c
 */

void FUN_00b8785c(undefined8 *param_1,long *param_2,undefined8 *param_3)

{
  undefined4 *puVar1;
  uint uVar2;
  char cVar3;
  long lVar4;
  int iVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  undefined4 local_4c;
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  *param_3 = 0;
  uVar2 = *(uint *)((long)param_1 + 4);
  iVar5 = *(int *)((long)param_1 + 0x14);
  uVar6 = psa_validate_key_location(uVar2,param_3);
  if (((int)uVar6 != 0) || (uVar6 = psa_validate_key_persistence(uVar2), (int)uVar6 != 0))
  goto LAB_00b878e4;
  if ((uVar2 & 0xff) == 0) {
    if (iVar5 == 0) goto LAB_00b878d0;
  }
  else {
    iVar5 = psa_is_valid_key_id(*(undefined4 *)((long)param_1 + 0x14),0);
    if (iVar5 != 0) {
LAB_00b878d0:
      if ((*(uint *)(param_1 + 1) & 0xffff00fc) == 0) {
        if (*(ushort *)((long)param_1 + 2) < 0xfff9) {
          cVar3 = *(char *)((long)param_1 + 4);
          puVar1 = &local_4c;
          if (cVar3 != '\0') {
            puVar1 = (undefined4 *)0x0;
          }
          uVar6 = psa_reserve_free_key_slot(puVar1,param_2);
          if ((int)uVar6 == 0) {
            puVar7 = (undefined8 *)*param_2;
            puVar7[2] = param_1[2];
            uVar8 = *param_1;
            puVar7[1] = param_1[1];
            *puVar7 = uVar8;
            if (cVar3 == '\0') {
              uVar6 = 0;
              *(undefined4 *)((long)puVar7 + 0x14) = local_4c;
            }
          }
        }
        else {
          uVar6 = 0xffffff7a;
        }
        goto LAB_00b878e4;
      }
    }
  }
  uVar6 = 0xffffff79;
LAB_00b878e4:
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar6);
  }
  return;
}


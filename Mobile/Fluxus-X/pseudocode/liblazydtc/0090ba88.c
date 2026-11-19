/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ba88
 */

int FUN_0090ba88(long param_1,long param_2,undefined4 param_3,undefined8 param_4)

{
  uint uVar1;
  long lVar2;
  bool bVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  undefined4 *puVar8;
  byte bVar9;
  long local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  iVar4 = 0;
  if ((*(byte *)(param_2 + 0x3a3) & 1) != 0) {
    if (*(byte *)(param_1 + 0x1318) == 0x1f) {
      iVar4 = FUN_00971a84(param_1,param_2);
      if (iVar4 != 0) goto LAB_0090bc58;
      bVar9 = 0;
      bVar3 = true;
    }
    else {
      if (*(byte *)(param_1 + 0x1318) < 0x1e) {
        bVar3 = false;
      }
      else {
        iVar4 = FUN_00971a84(param_1,param_2);
        bVar3 = iVar4 == 0;
      }
      bVar9 = 1;
    }
    local_60 = 0;
    lVar5 = (*(code *)PTR_calloc_00cc4690)(1,0x90);
    if (lVar5 == 0) {
      lVar6 = 0;
      iVar4 = 0x1b;
    }
    else {
      *(undefined8 *)(lVar5 + 8) = param_4;
      *(byte *)(lVar5 + 0x54) = *(byte *)(lVar5 + 0x54) & 0xfe | bVar3;
      *(byte *)(lVar5 + 0x84) = *(byte *)(lVar5 + 0x84) & 0xfe | bVar9;
      iVar4 = FUN_00907328(&local_60,&PTR_s_HTTPS_CONNECT_00cc48a8,lVar5);
      if (iVar4 == 0) {
        puVar8 = *(undefined4 **)(local_60 + 0x10);
        if (puVar8 == (undefined4 *)0x0) {
          iVar4 = 0;
          lVar5 = 0;
          lVar6 = local_60;
        }
        else {
          plVar7 = (long *)(puVar8 + 0xc);
          if (*plVar7 != 0) {
            FUN_009074b4(*plVar7,param_1);
            FUN_00906ef0(plVar7,param_1);
            *plVar7 = 0;
          }
          plVar7 = (long *)(puVar8 + 0x18);
          puVar8[0xe] = 0;
          puVar8[0x14] = 0xffffffff;
          if (*plVar7 != 0) {
            FUN_009074b4(*plVar7,param_1);
            FUN_00906ef0(plVar7,param_1);
            *plVar7 = 0;
          }
          puVar8[0x1a] = 0;
          puVar8[0x20] = 0xffffffff;
          *puVar8 = 0;
          puVar8[8] = 0;
          uVar1 = *(uint *)(param_1 + 0x2e8);
          iVar4 = 0;
          puVar8[0x22] = uVar1 >> 1;
          puVar8[0x23] = uVar1;
          lVar5 = 0;
          lVar6 = local_60;
        }
      }
      else {
        lVar6 = 0;
      }
    }
    (*(code *)PTR_free_00cc4678)(lVar5);
    if (iVar4 == 0) {
      FUN_0090738c(param_1,param_2,param_3,lVar6);
    }
  }
LAB_0090bc58:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}


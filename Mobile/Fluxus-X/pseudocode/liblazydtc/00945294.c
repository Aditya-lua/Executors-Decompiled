/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00945294
 */

void FUN_00945294(long param_1,long param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  long local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  local_50 = 0;
  if (*(long *)(param_1 + 0x20) == 0) {
    uVar3 = 0x37;
  }
  else {
    lVar1 = param_2 + 0x40;
    FUN_0090456c(lVar1);
    uStack_58 = param_4[3];
    local_60 = param_4[2];
    uStack_68 = param_4[1];
    local_70 = *param_4;
    uVar3 = FUN_0090485c(lVar1,param_3,&local_70);
    if (((int)uVar3 == 0) && (uVar3 = FUN_009045fc(lVar1,&DAT_002b917a,2), (int)uVar3 == 0)) {
      *(undefined1 *)(param_2 + 8) = 1;
      lVar4 = FUN_00904984(lVar1);
      uVar5 = FUN_00904974(lVar1);
      uVar3 = FUN_009083b8(param_1,0,uVar5,lVar4,&local_50);
      if ((int)uVar3 == 0x51) {
        local_50 = 0;
      }
      else if ((int)uVar3 != 0) goto LAB_0094536c;
      FUN_00904a98(param_1,2,uVar5,local_50);
      if (lVar4 - local_50 == 0) {
        *(undefined8 *)(param_2 + 0x10) = 0;
        *(undefined8 *)(param_2 + 0x18) = 0;
        *(undefined8 *)(param_2 + 0x20) = 0;
        auVar6 = FUN_00941cb8();
        uVar3 = 0;
        *(undefined1 (*) [16])(param_2 + 0x28) = auVar6;
      }
      else {
        uVar3 = 0;
        *(long *)(param_2 + 0x18) = lVar4 - local_50;
        *(long *)(param_2 + 0x20) = lVar4;
        *(undefined8 *)(param_2 + 0x10) = uVar5;
      }
    }
  }
LAB_0094536c:
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}


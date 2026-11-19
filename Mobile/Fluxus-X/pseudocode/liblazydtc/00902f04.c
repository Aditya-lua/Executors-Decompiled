/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902f04
 */

void FUN_00902f04(long param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  undefined8 local_a0;
  _union_1457 local_98 [2];
  undefined8 local_88;
  undefined8 uStack_80;
  byte local_78;
  _union_1457 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_a0 = 0;
  *param_4 = 0;
  if (param_1 == 0) {
    iVar2 = 0x2b;
  }
  else {
    if (*(char *)(param_1 + 0xa81) == '\0') {
      pcVar3 = "CONNECT_ONLY is required";
    }
    else {
      iVar2 = FUN_00908b60(param_1,&local_a0);
      if (iVar2 != -1) {
        if (*(long *)(param_1 + 0x20) == 0) {
          FUN_0092bb60(param_1,local_a0);
        }
        local_78 = (byte)((uint)*(int *)(param_1 + 0xa82) >> 0x1f);
        if (-1 < *(int *)(param_1 + 0xa82)) {
          sigaction(0xd,(sigaction *)0x0,(sigaction *)local_98);
          local_70.sa_handler = local_98[0].sa_handler;
          uStack_58 = uStack_80;
          uStack_60 = local_88;
          uStack_68 = 1;
          sigaction(0xd,(sigaction *)&local_70,(sigaction *)0x0);
        }
        iVar2 = FUN_009083b8(param_1,0,param_2,param_3,param_4);
        if (local_78 == 0) {
          sigaction(0xd,(sigaction *)local_98,(sigaction *)0x0);
        }
        iVar4 = 0;
        if (iVar2 != 0) {
          iVar4 = 0x37;
        }
        if (iVar2 != 0x51) {
          iVar2 = iVar4;
        }
        goto LAB_00903030;
      }
      pcVar3 = "Failed to get recent socket";
    }
    FUN_00904b80(param_1,pcVar3);
    iVar2 = 1;
  }
LAB_00903030:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2);
  }
  return;
}


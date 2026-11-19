/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086d048
 */

undefined8 FUN_0086d048(long param_1)

{
  int iVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined4 unaff_w20;
  uint unaff_w21;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined1 auStack_60 [16];
  char local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  iVar1 = *(int *)(param_1 + 0x90);
  uStack_68 = *(undefined8 *)(param_1 + 0x9c);
  local_70 = *(undefined8 *)(param_1 + 0x94);
  if (*(char *)(param_1 + 0x68) == '\x01') {
    if (iVar1 == 0x116) {
      unaff_w20 = FUN_00853390();
      unaff_w21 = 2;
    }
    else if (iVar1 == 0x117) {
      iVar3 = FUN_008533bc();
      unaff_w20 = 0;
      unaff_w21 = (uint)(iVar3 == 1);
    }
    else {
      unaff_w20 = 0;
      unaff_w21 = 3;
    }
    puVar6 = &local_80;
    if ((*(byte *)(param_1 + 0x68) & 1) == 0) {
      puVar6 = (undefined8 *)0x0;
    }
  }
  else {
    puVar6 = (undefined8 *)0x0;
  }
  local_80 = 0;
  uStack_78 = 0;
  FUN_00865548(auStack_60,param_1,puVar6);
  if (local_50 == '\x01') {
    uVar4 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
    FUN_0084ec94(uVar4,&local_70,auStack_60,(ulong)(iVar1 == 0x116) << 1);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      uVar5 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x20);
      FUN_00851dd8(uVar5,local_80,uStack_78,unaff_w21,unaff_w20);
      local_90 = uVar4;
      puVar6 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_90);
      *puVar6 = uVar5;
    }
  }
  else {
    local_90 = 0;
    uStack_88 = 0;
    uVar4 = FUN_008659e8(param_1,&local_70,&local_90,
                         "String literal contains malformed escape sequence");
  }
  if (*(long *)(lVar2 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}


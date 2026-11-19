/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00927700
 */

void FUN_00927700(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 *local_80;
  undefined1 **ppuStack_78;
  undefined8 *puStack_70;
  undefined8 uStack_68;
  
  lVar1 = tpidr_el0;
  lVar5 = *(long *)(lVar1 + 0x28);
  puStack_70 = &local_b0;
  ppuStack_78 = &local_80;
  uStack_68 = 0xffffff80ffffffd0;
  local_b0 = param_3;
  uStack_a8 = param_4;
  local_a0 = param_5;
  uStack_98 = param_6;
  local_90 = param_7;
  uStack_88 = param_8;
  local_80 = (undefined1 *)register0x00000008;
  lVar2 = curl_mvaprintf(param_2,&local_80);
  if (lVar2 != 0) {
    lVar3 = FUN_0093f6d8(*param_1,lVar2);
    if (lVar3 != 0) {
      uVar4 = 0;
      *param_1 = lVar3;
      goto LAB_009277c0;
    }
    (*(code *)PTR_free_00cc4678)(lVar2);
  }
  uVar4 = 0x1b;
LAB_009277c0:
  if (*(long *)(lVar1 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00910f40
 */

void FUN_00910f40(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 *puVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  undefined8 *puVar8;
  undefined1 auVar9 [16];
  char local_7c [4];
  undefined1 local_78 [16];
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  puVar6 = *(undefined8 **)(param_1 + 0x58);
  if (puVar6 != (undefined8 *)0x0) {
    uVar4 = *(undefined8 *)(param_1 + 0x80);
    puVar5 = (undefined1 *)0x0;
    *(byte *)(param_1 + 0x78) = *(byte *)(param_1 + 0x78) | 1;
    lVar3 = 0;
    do {
      while( true ) {
        uVar7 = *puVar6;
        puVar8 = (undefined8 *)puVar6[2];
        FUN_0092bb60(uVar4,uVar7);
        FUN_009111d8(uVar4,uVar7,local_7c);
        FUN_0092bab8(uVar4);
        if (local_7c[0] == '\0') break;
        FUN_00925d80((long *)(param_1 + 0x58),puVar6,0);
        FUN_009103b0(0,uVar7,param_1,0);
        puVar6 = puVar8;
        if (puVar8 == (undefined8 *)0x0) goto LAB_00911028;
      }
      auVar9 = local_78;
      if (puVar5 == (undefined1 *)0x0) {
        auVar9 = FUN_00941cb8();
        puVar5 = local_78;
      }
      local_78 = auVar9;
      lVar2 = FUN_009088e4(uVar7,puVar5);
      if (lVar3 <= lVar2 || lVar2 == 0) {
        lVar2 = lVar3;
      }
      lVar3 = lVar2;
      puVar6 = puVar8;
    } while (puVar8 != (undefined8 *)0x0);
LAB_00911028:
    *(byte *)(param_1 + 0x78) = *(byte *)(param_1 + 0x78) & 0xfe;
    if (lVar3 != 0) {
      FUN_0092aff8(uVar4,lVar3,8);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}


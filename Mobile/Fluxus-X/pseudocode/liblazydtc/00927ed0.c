/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00927ed0
 */

void FUN_00927ed0(long param_1,char *param_2,int param_3)

{
  long lVar1;
  int iVar2;
  char *pcVar3;
  undefined **ppuVar4;
  undefined **ppuVar5;
  undefined1 auStack_58 [32];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((param_3 == 0) || ((param_1 != 0 && ((*(byte *)(param_1 + 0xa82) & 1) != 0)))) {
    ppuVar5 = &PTR_DAT_00c4f868;
  }
  else {
    ppuVar5 = &PTR_DAT_00c4f880;
  }
  FUN_00904528(auStack_58,&fde_table_entry_007a1200);
  iVar2 = FUN_009045fc(auStack_58,&DAT_002ab32c,0);
joined_r0x00927f3c:
  do {
    if ((iVar2 != 0) || (*param_2 == '\0')) {
      FUN_00904974(auStack_58);
      if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
    pcVar3 = *ppuVar5;
    ppuVar4 = ppuVar5;
    while (pcVar3 != (char *)0x0) {
      ppuVar4 = ppuVar4 + 1;
      if (*pcVar3 == *param_2) {
        iVar2 = FUN_00904728(auStack_58,pcVar3 + 1);
        param_2 = param_2 + 1;
        goto joined_r0x00927f3c;
      }
      pcVar3 = *ppuVar4;
    }
    iVar2 = FUN_009045fc(auStack_58,param_2,1);
    param_2 = param_2 + 1;
  } while( true );
}


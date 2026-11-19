/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4100
 */

void FUN_008e4100(long param_1,long param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  ulong uVar4;
  int *piVar5;
  undefined8 uVar6;
  ulong uVar7;
  
  if (param_2 == 0) {
    uVar6 = 0x4a;
  }
  else {
    uVar7 = 0;
    while( true ) {
      uVar4 = FUN_008e524c(param_1 + 8);
      if ((uVar4 & 0xffffffff) <= uVar7) {
        return;
      }
      piVar5 = (int *)FUN_008e51d8(param_1 + 8,uVar7 & 0xffffffff);
      iVar2 = FUN_008e475c(param_1);
      iVar1 = *piVar5;
      uVar3 = FUN_008e42f4(param_2,iVar1);
      if (piVar5[1] != 0) break;
      FUN_008e4300(param_2,*piVar5,
                   uVar3 & 0xff000000 | uVar3 & 0x1f | ((uint)(iVar2 - iVar1) >> 2 & 0x7ffff) << 5);
      uVar7 = uVar7 + 1;
    }
    uVar6 = 0x5a;
  }
  log_internal_impl(0xffffffff,"[!] [%s:%d:%s]: \n","assembler-arm64.h",uVar6,
                    "link_confused_instructions");
  log_internal_impl(0xffffffff,"[!] %s\n\n","unreachable code!!!");
                    /* WARNING: Subroutine does not return */
  abort();
}


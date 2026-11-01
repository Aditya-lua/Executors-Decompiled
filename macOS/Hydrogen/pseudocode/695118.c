
void FUN_00695118(long param_1,long param_2,long param_3)

{
  code *pcVar1;
  long lVar2;
  int *piVar3;
  undefined8 uVar4;
  undefined1 uStack0000000000000008;
  
  if (param_3 != 0) {
    do {
      lVar2 = _read(*(undefined4 *)(param_1 + 8),param_2,param_3);
      if (lVar2 < 0) {
        piVar3 = (int *)___error();
        if ((*piVar3 != 4) && (piVar3 = (int *)___error(), *piVar3 != 0x23)) {
          uVar4 = ___cxa_allocate_exception(0x28);
          func_0x0000a968(&uStack0000000000000008,"read /dev/urandom");
          func_0x00694c90(uVar4,&uStack0000000000000008);
          ___cxa_throw(uVar4,&UNK_00a14228,&DAT_00695014);
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x6951c0);
          (*pcVar1)();
        }
      }
      else {
        param_2 = param_2 + lVar2;
        param_3 = param_3 - lVar2;
      }
    } while (param_3 != 0);
  }
  return;
}


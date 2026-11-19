/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ec74
 */

undefined4 FUN_0090ec74(long param_1,undefined8 *param_2)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  ulong uVar4;
  uint uVar5;
  long lVar6;
  undefined1 auVar7 [16];
  
  lVar6 = *(long *)(param_1 + 0xda0);
  *param_2 = 0;
  if (lVar6 == 0) {
    uVar3 = 6;
  }
  else {
    pthread_mutex_lock(*(pthread_mutex_t **)(lVar6 + 0x18));
    iVar1 = *(int *)(lVar6 + 0x20);
    iVar2 = pthread_mutex_unlock(*(pthread_mutex_t **)(lVar6 + 0x18));
    if (iVar1 == 0) {
      auVar7 = FUN_00941cb8(iVar2);
      uVar4 = FUN_00941d54(auVar7._0_8_,auVar7._8_8_,*(undefined8 *)(param_1 + 0xb40),
                           *(undefined8 *)(param_1 + 0xb48));
      uVar5 = *(uint *)(lVar6 + 8);
      uVar4 = uVar4 & ((long)uVar4 >> 0x3f ^ 0xffffffffffffffffU);
      if (uVar5 == 0) {
        uVar5 = 1;
        *(undefined4 *)(lVar6 + 8) = 1;
      }
      else {
        if (*(long *)(lVar6 + 0x10) <= (long)uVar4) {
          uVar5 = uVar5 << 1;
          *(uint *)(lVar6 + 8) = uVar5;
        }
        if (0xfa < uVar5) {
          uVar5 = 0xfa;
          *(undefined4 *)(lVar6 + 8) = 0xfa;
        }
      }
      *(ulong *)(lVar6 + 0x10) = uVar4 + uVar5;
      FUN_0092aff8(param_1,(ulong)uVar5,1);
      uVar3 = 0;
    }
    else {
      lVar6 = *(long *)(param_1 + 0xda0);
      FUN_00916af4(param_1,*(undefined4 *)(lVar6 + 0x40),*(undefined8 *)(lVar6 + 0x48));
      *(undefined8 *)(lVar6 + 0x48) = 0;
      if (*(long *)(param_1 + 0xd98) == 0) {
        uVar3 = FUN_0091829c(param_1);
        FUN_0090ea5c(param_1 + 0xd90);
      }
      else {
        FUN_0090ea5c(param_1 + 0xd90);
        uVar3 = 0;
        *param_2 = *(undefined8 *)(param_1 + 0xd98);
      }
    }
  }
  return uVar3;
}


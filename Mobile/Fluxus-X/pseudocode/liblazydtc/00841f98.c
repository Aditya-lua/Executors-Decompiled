/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00841f98
 */

char * FUN_00841f98(long param_1,char *param_2,char *param_3)

{
  char *pcVar1;
  uint uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long lVar5;
  char *pcVar6;
  undefined8 uVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  __shared_weak_count *this;
  
  puVar3 = operator_new(8);
  *puVar3 = &PTR_LAB_00c48a58;
                    /* try { // try from 00841fdc to 00841fe3 has its CatchHandler @ 0084228c */
  puVar4 = operator_new(0x10);
  *puVar4 = &PTR_LAB_00c48b00;
  puVar4[1] = puVar3;
                    /* try { // try from 00841ff8 to 00841fff has its CatchHandler @ 00842278 */
  puVar3 = operator_new(0x20);
  this = *(__shared_weak_count **)(param_1 + 0x30);
  puVar3[2] = 0;
  puVar3[3] = puVar4;
  *(undefined8 **)(param_1 + 0x28) = puVar4;
  *(undefined8 **)(param_1 + 0x30) = puVar3;
  *puVar3 = &PTR____shared_weak_count_00c48ab0;
  puVar3[1] = 0;
  if ((this != (__shared_weak_count *)0x0) &&
     (lVar5 = FUN_00c2bd10(0xffffffffffffffff,this + 8), lVar5 == 0)) {
    (**(code **)(*(long *)this + 0x10))(this);
    std::__ndk1::__shared_weak_count::__release_weak(this);
  }
  lVar5 = *(long *)(param_1 + 0x28);
  uVar2 = *(uint *)(param_1 + 0x18) & 0x1f0;
  *(long *)(param_1 + 0x38) = lVar5;
  if (uVar2 < 0x40) {
    if (uVar2 == 0) {
      pcVar6 = (char *)FUN_00842c2c(param_1,param_2,param_3);
      if (pcVar6 == param_2) {
        puVar3 = operator_new(0x10);
        lVar8 = *(long *)(param_1 + 0x38);
        *(undefined8 **)(param_1 + 0x38) = puVar3;
        uVar7 = *(undefined8 *)(lVar8 + 8);
        *puVar3 = &PTR_LAB_00c48b00;
        puVar3[1] = uVar7;
        *(undefined8 **)(lVar8 + 8) = puVar3;
      }
      while ((pcVar6 != param_3 && (*pcVar6 == '|'))) {
        pcVar1 = pcVar6 + 1;
        lVar8 = *(long *)(param_1 + 0x38);
        pcVar6 = (char *)FUN_00842c2c(param_1,pcVar1,param_3);
        if (pcVar6 == pcVar1) {
          puVar3 = operator_new(0x10);
          lVar9 = *(long *)(param_1 + 0x38);
          *puVar3 = &PTR_LAB_00c48b00;
          *(undefined8 **)(param_1 + 0x38) = puVar3;
          puVar3[1] = *(undefined8 *)(lVar9 + 8);
          *(undefined8 **)(lVar9 + 8) = puVar3;
        }
        else {
          puVar3 = *(undefined8 **)(param_1 + 0x38);
        }
        puVar4 = operator_new(0x18);
        uVar7 = *(undefined8 *)(lVar8 + 8);
        uVar10 = *(undefined8 *)(lVar5 + 8);
        *puVar4 = &PTR_LAB_00c49070;
        puVar4[1] = uVar10;
        puVar4[2] = uVar7;
        *(undefined8 **)(lVar5 + 8) = puVar4;
        *(undefined8 *)(lVar8 + 8) = 0;
        puVar4 = operator_new(0x10);
        uVar7 = puVar3[1];
        *puVar4 = &PTR_LAB_00c48b00;
        puVar4[1] = uVar7;
        *(undefined8 **)(lVar8 + 8) = puVar4;
        puVar3[1] = 0;
        puVar4 = operator_new(0x10);
        uVar7 = *(undefined8 *)(lVar8 + 8);
        *puVar4 = &PTR_LAB_00c490b8;
        puVar4[1] = uVar7;
        puVar3[1] = puVar4;
        *(undefined8 *)(param_1 + 0x38) = *(undefined8 *)(lVar8 + 8);
      }
      return pcVar6;
    }
    if (uVar2 == 0x10) {
      pcVar6 = (char *)FUN_008424a8(param_1,param_2,param_3);
      return pcVar6;
    }
    if (uVar2 == 0x20) {
LAB_008420b8:
      pcVar6 = (char *)FUN_00842620(param_1,param_2,param_3);
      return pcVar6;
    }
  }
  else {
    if (uVar2 == 0x40) goto LAB_008420b8;
    if (uVar2 == 0x80) {
      pcVar6 = (char *)FUN_00842784(param_1,param_2,param_3);
      return pcVar6;
    }
    if (uVar2 == 0x100) {
      pcVar6 = (char *)FUN_0084291c(param_1,param_2,param_3);
      return pcVar6;
    }
  }
  uVar7 = FUN_00842ab4();
                    /* catch() { ... } // from try @ 00841ff8 with catch @ 00842278 */
  FUN_00842b80(lVar5);
  (**(code **)(*(long *)this + 8))(this);
                    /* WARNING: Subroutine does not return */
  FUN_00c2c090(uVar7);
}


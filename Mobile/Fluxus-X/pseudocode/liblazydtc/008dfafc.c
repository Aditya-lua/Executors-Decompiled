/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dfafc
 */

void FUN_008dfafc(long param_1,undefined8 param_2,ulong param_3)

{
  long lVar1;
  undefined1 auVar2 [16];
  ulong uVar3;
  undefined8 uVar4;
  runtime_error *this;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 local_88 [16];
  undefined8 local_78;
  undefined8 uStack_70;
  long local_68;
  
  auVar2._8_8_ = param_3;
  auVar2._0_8_ = param_2;
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (param_3 >> 0x20 == 0) {
    lVar5 = *(long *)(param_1 + 0x878);
    local_78 = 0;
    uStack_70 = 0;
    if (lVar5 != *(long *)(param_1 + 0x870)) {
      puVar6 = (undefined8 *)(lVar5 + -0x610);
      do {
        lVar5 = lVar5 + -0x1408;
        auVar9 = FUN_008df008(param_1,local_78,uStack_70);
        auVar9 = FUN_008dd964(param_2,param_3,auVar9._0_8_,auVar9._8_8_);
        auVar9 = FUN_008dd9cc(lVar5,auVar9._0_8_,auVar9._8_8_);
        lVar8 = 0x60;
        puVar7 = puVar6;
        do {
          local_88 = auVar9;
          uVar3 = FUN_008dd8dc(local_88,(int)lVar8 + -1);
          auVar9 = local_88;
          if ((uVar3 & 1) != 0) {
            FUN_008dd950(local_88,*puVar7,puVar7[1]);
            FUN_008dd950(&local_78,puVar7[0xc0],puVar7[0xc1]);
            auVar9 = local_88;
          }
          lVar8 = lVar8 + -1;
          puVar7 = puVar7 + -2;
        } while (lVar8 != 0);
        local_88 = auVar9;
        uVar3 = FUN_008dd93c(local_88);
        if ((uVar3 & 1) == 0) {
          this = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008dfc64 to 008dfc6f has its CatchHandler @ 008dfcfc */
          auVar9 = std::runtime_error::runtime_error(this,"target is outside the layer image");
          goto LAB_008dfc70;
        }
        puVar6 = puVar6 + -0x281;
      } while (lVar5 != *(long *)(param_1 + 0x870));
    }
    auVar10 = FUN_008decbc(param_1,local_78,uStack_70);
    auVar9._8_8_ = uStack_70;
    auVar9._0_8_ = local_78;
    if (auVar10 == auVar2) {
      if (*(long *)(lVar1 + 0x28) == local_68) {
        return;
      }
    }
    else {
      this = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008dfce4 to 008dfcef has its CatchHandler @ 008dfcf4 */
      auVar9 = std::runtime_error::runtime_error(this,"signature preimage verification failed");
LAB_008dfc70:
      if (*(long *)(lVar1 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        __cxa_throw(this,&std::runtime_error::typeinfo,std::underflow_error::~underflow_error);
      }
    }
  }
  else {
    uVar4 = __cxa_allocate_exception(0x10);
                    /* try { // try from 008dfca4 to 008dfcaf has its CatchHandler @ 008dfcf8 */
    auVar9 = FUN_008de29c(uVar4,"target exceeds 96 bits");
    if (*(long *)(lVar1 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      __cxa_throw(uVar4,&std::invalid_argument::typeinfo,std::domain_error::~domain_error);
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail(auVar9._0_8_,auVar9._8_8_);
}


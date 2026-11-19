/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008df0fc
 */

void FUN_008df0fc(undefined8 *param_1)

{
  undefined8 *puVar1;
  undefined1 (*pauVar2) [16];
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  int iVar6;
  void *__s;
  ulong uVar7;
  runtime_error *prVar8;
  ulong uVar9;
  long lVar10;
  void *pvVar11;
  long lVar12;
  uint uVar13;
  void *pvVar14;
  undefined8 *puVar15;
  undefined1 auVar16 [16];
  undefined1 local_2cd0 [16];
  undefined8 local_2cc0;
  undefined8 uStack_2cb8;
  undefined8 *local_2ca8;
  undefined8 *local_2ca0;
  long local_2c98;
  undefined8 local_2c90;
  undefined8 uStack_2c88;
  undefined8 auStack_2488 [192];
  undefined8 auStack_1e88 [192];
  undefined1 auStack_1888 [2048];
  int local_1088;
  undefined1 auStack_1080 [2056];
  undefined1 auStack_878 [2048];
  int local_78;
  long local_70;
  
  lVar4 = tpidr_el0;
  local_70 = *(long *)(lVar4 + 0x28);
  memset(auStack_878,0,0x804);
  uVar13 = 0;
  do {
    uVar3 = param_1[0x10c] - param_1[0x10b];
    if (uVar3 == 0) {
      lVar10 = 0;
      __s = (void *)0x0;
    }
    else {
      if ((long)uVar3 < 0) {
        if (*(long *)(lVar4 + 0x28) != local_70) goto LAB_008df56c;
        FUN_008ddc5c();
        goto LAB_008df488;
      }
      __s = operator_new(uVar3);
      lVar10 = (long)__s + uVar3;
      memset(__s,0,uVar3);
    }
    uVar3 = lVar10 - (long)__s;
    if (uVar3 != 0) {
      lVar10 = 0;
      uVar9 = (long)uVar3 >> 4;
      if (uVar9 < 2) {
        uVar9 = 1;
      }
      do {
                    /* try { // try from 008df1c0 to 008df1cb has its CatchHandler @ 008df500 */
        auVar16 = FUN_008dd9cc(auStack_878,*(undefined8 *)(param_1[0x10b] + lVar10),
                               ((undefined8 *)(param_1[0x10b] + lVar10))[1]);
        pauVar2 = (undefined1 (*) [16])((long)__s + lVar10);
        uVar9 = uVar9 - 1;
        lVar10 = lVar10 + 0x10;
        *pauVar2 = auVar16;
      } while (uVar9 != 0);
    }
    memset(auStack_1080,0,0x804);
    iVar6 = 0;
    do {
      lVar10 = 0;
      pvVar11 = __s;
      do {
        uVar9 = 0;
        local_2c90 = 0;
        uStack_2c88 = 0;
        pvVar14 = pvVar11;
        do {
                    /* try { // try from 008df224 to 008df23f has its CatchHandler @ 008df53c */
          uVar7 = FUN_008dd8dc(pvVar14,iVar6);
          if ((uVar7 & 1) != 0) {
            FUN_008dd8f4(&local_2c90,uVar9 & 0xffffffff);
          }
          uVar9 = uVar9 + 1;
          pvVar14 = (void *)((long)pvVar14 + 0x10);
        } while (uVar9 != 0x80);
                    /* try { // try from 008df248 to 008df253 has its CatchHandler @ 008df510 */
        FUN_008dd970(auStack_1080,local_2c90,uStack_2c88);
        lVar10 = lVar10 + 1;
        pvVar11 = (void *)((long)pvVar11 + 0x800);
      } while (lVar10 != 0x80);
      iVar6 = iVar6 + 1;
    } while (iVar6 != 0x60);
                    /* try { // try from 008df270 to 008df27f has its CatchHandler @ 008df4fc */
    FUN_008dda14(&local_2ca8,auStack_1080);
    memcpy(auStack_1888,auStack_878,0x808);
    memset(auStack_2488,0,0xc00);
    memcpy(&local_2c90,auStack_878,0x804);
    puVar5 = local_2ca0;
    for (puVar15 = local_2ca8; puVar15 != puVar5; puVar15 = puVar15 + 2) {
      uStack_2cb8 = puVar15[1];
      local_2cc0 = *puVar15;
                    /* try { // try from 008df2e8 to 008df313 has its CatchHandler @ 008df508 */
      auVar16 = FUN_008df008(param_1,local_2cc0,uStack_2cb8);
      auVar16 = FUN_008dd964(auVar16._0_8_,auVar16._8_8_,*param_1,param_1[1]);
      local_2cd0 = auVar16;
      FUN_008dd970(auStack_1888,auVar16._0_8_,auVar16._8_8_);
                    /* try { // try from 008df318 to 008df323 has its CatchHandler @ 008df504 */
      auVar16 = FUN_008dd9cc(auStack_878,local_2cd0._0_8_,local_2cd0._8_8_);
      local_2cd0 = auVar16;
      while( true ) {
                    /* try { // try from 008df328 to 008df32f has its CatchHandler @ 008df50c */
        uVar9 = FUN_008dd93c(local_2cd0);
        if ((uVar9 & 1) != 0) break;
                    /* try { // try from 008df334 to 008df36f has its CatchHandler @ 008df514 */
        iVar6 = FUN_008dd914(local_2cd0);
        lVar10 = (long)iVar6;
        puVar1 = auStack_2488 + lVar10 * 2;
        uVar9 = FUN_008dd93c(puVar1);
        lVar12 = (long)iVar6;
        if ((uVar9 & 1) != 0) {
          auStack_1e88[lVar12 * 2 + 1] = uStack_2cb8;
          auStack_1e88[lVar12 * 2] = local_2cc0;
          auStack_2488[lVar10 * 2 + 1] = local_2cd0._8_8_;
          *puVar1 = local_2cd0._0_8_;
          break;
        }
        FUN_008dd950(local_2cd0,*puVar1,auStack_2488[lVar10 * 2 + 1]);
        FUN_008dd950(&local_2cc0,auStack_1e88[lVar12 * 2],auStack_1e88[lVar12 * 2 + 1]);
      }
    }
    if (local_1088 <= local_78) {
      prVar8 = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008df438 to 008df443 has its CatchHandler @ 008df4e4 */
      std::runtime_error::runtime_error
                (prVar8,"table structure does not admit the expected inversion");
      if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* try { // try from 008df458 to 008df46f has its CatchHandler @ 008df4e0 */
                    /* WARNING: Subroutine does not return */
        __cxa_throw(prVar8,&std::runtime_error::typeinfo,std::underflow_error::~underflow_error);
      }
      goto LAB_008df56c;
    }
                    /* try { // try from 008df384 to 008df38f has its CatchHandler @ 008df4f8 */
    FUN_008df9c0(param_1 + 0x10e,&local_2c90);
    memcpy(auStack_878,auStack_1888,0x804);
    if (local_2ca8 != (undefined8 *)0x0) {
      local_2ca0 = local_2ca8;
      operator_delete(local_2ca8,local_2c98 - (long)local_2ca8);
    }
    if (__s != (void *)0x0) {
      operator_delete(__s,uVar3);
    }
  } while ((uVar13 < 0xf) && (uVar13 = uVar13 + 1, local_78 < 0x60));
  if (local_78 == 0x60) {
    if (*(long *)(lVar4 + 0x28) == local_70) {
      return;
    }
  }
  else {
LAB_008df488:
    prVar8 = (runtime_error *)__cxa_allocate_exception(0x10);
                    /* try { // try from 008df494 to 008df49f has its CatchHandler @ 008df4cc */
    std::runtime_error::runtime_error(prVar8,"incomplete signature image");
    if (*(long *)(lVar4 + 0x28) == local_70) {
                    /* WARNING: Subroutine does not return */
      __cxa_throw(prVar8,&std::runtime_error::typeinfo,std::underflow_error::~underflow_error);
    }
  }
LAB_008df56c:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


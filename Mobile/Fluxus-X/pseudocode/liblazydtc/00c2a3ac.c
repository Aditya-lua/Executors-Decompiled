/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2a3ac
 */

void __cxa_call_unexpected(long param_1)

{
  byte bVar1;
  ulong uVar2;
  byte bVar3;
  ulong uVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined8 *puVar7;
  byte *extraout_x9;
  undefined8 uVar8;
  long unaff_x22;
  undefined *unaff_x24;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  byte *pbVar13;
  byte *pbVar12;
  long lVar14;
  undefined **local_70;
  byte *local_68;
  
  if (param_1 == 0) {
    __cxa_begin_catch();
                    /* WARNING: Subroutine does not return */
    std::terminate();
  }
  __cxa_begin_catch();
  uVar4 = FUN_00c29308(param_1);
  if ((uVar4 & 1) == 0) {
    uVar5 = std::get_terminate();
    uVar10 = std::get_unexpected();
    uVar8 = 0;
    lVar9 = 0;
  }
  else {
    uVar10 = *(undefined8 *)(param_1 + -0x40);
    uVar5 = *(undefined8 *)(param_1 + -0x38);
    lVar9 = param_1 + -0x60;
    unaff_x24 = *(undefined **)(param_1 + -0x18);
    uVar8 = *(undefined8 *)(param_1 + -0x10);
    unaff_x22 = (long)*(int *)(param_1 + -0x24);
  }
                    /* try { // try from 00c2a41c to 00c2a41f has its CatchHandler @ 00c2a420 */
  FUN_00c0d728(uVar10);
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c2a41c with catch @ 00c2a420
                        */
  __cxa_begin_catch();
  if ((uVar4 & 1) != 0) {
    local_68 = unaff_x24 + 1;
    FUN_00c2a5f8(&local_68,*unaff_x24,uVar8);
    bVar1 = *local_68;
    if (bVar1 != 0xff) goto LAB_00c2a454;
    do {
      FUN_00c0d774(uVar5);
      local_68 = extraout_x9;
LAB_00c2a454:
      uVar4 = 0;
      uVar11 = 0;
      pbVar13 = local_68 + 1;
      do {
        pbVar12 = pbVar13 + 1;
        bVar3 = *pbVar13;
        uVar2 = uVar4 & 0x3f;
        uVar4 = uVar4 + 7;
        uVar11 = ((ulong)bVar3 & 0x7f) << uVar2 | uVar11;
        pbVar13 = pbVar12;
      } while ((char)bVar3 < '\0');
      local_68 = pbVar12;
                    /* try { // try from 00c2a47c to 00c2a47f has its CatchHandler @ 00c2a5b4 */
      plVar6 = (long *)__cxa_get_globals_fast();
      lVar14 = *plVar6;
    } while (lVar14 == 0);
                    /* try { // try from 00c2a48c to 00c2a493 has its CatchHandler @ 00c2a5b0 */
    bVar3 = FUN_00c29308(lVar14 + 0x60);
    if ((bVar3 & lVar14 != lVar9) == 1) {
      uVar10 = *(undefined8 *)(lVar14 + 0x10);
                    /* try { // try from 00c2a4ac to 00c2a4f3 has its CatchHandler @ 00c2a5ac */
      lVar9 = FUN_00c292fc(lVar14 + 0x60);
      if (lVar9 == 0x434c4e47432b2b01) {
        lVar9 = *(long *)(lVar14 + 8);
      }
      else {
        lVar9 = lVar14 + 0x80;
      }
      uVar4 = FUN_00c2a7a0(unaff_x22,pbVar12 + uVar11,bVar1,uVar10,lVar9,param_1,uVar8);
      if ((uVar4 & 1) == 0) {
        lVar9 = plVar6[1];
        *(int *)(lVar14 + 0x38) = -*(int *)(lVar14 + 0x38);
        *(int *)(plVar6 + 1) = (int)lVar9 + 1;
                    /* try { // try from 00c2a588 to 00c2a59b has its CatchHandler @ 00c2a5ac */
        __cxa_end_catch();
        __cxa_end_catch();
        __cxa_begin_catch(lVar14 + 0x60);
        uVar10 = __cxa_rethrow();
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00c2a508 with catch @ 00c2a59c
                       catch(type#1 @ 00000000) { ... } // from try @ 00c2a544 with catch @ 00c2a59c
                       catch(type#1 @ 00000000) { ... } // from try @ 00c2a558 with catch @ 00c2a59c
                        */
        std::bad_exception::~bad_exception((bad_exception *)&local_70);
                    /* try { // try from 00c2a5b8 to 00c2a5bb has its CatchHandler @ 00c2a5c4 */
        __cxa_end_catch();
                    /* WARNING: Subroutine does not return */
        FUN_00c2c090(uVar10);
      }
    }
    unaff_x24 = &std::bad_exception::vtable;
    local_70 = &PTR__bad_exception_00cb04d8;
                    /* try { // try from 00c2a508 to 00c2a52b has its CatchHandler @ 00c2a59c */
    uVar4 = FUN_00c2a7a0(unaff_x22,pbVar12 + uVar11,bVar1,&std::bad_exception::typeinfo,&local_70,
                         param_1,uVar8);
    if ((uVar4 & 1) == 0) goto LAB_00c2a544;
    std::bad_exception::~bad_exception((bad_exception *)&local_70);
  }
  __cxa_end_catch();
  FUN_00c0d774(uVar5);
LAB_00c2a544:
                    /* try { // try from 00c2a544 to 00c2a547 has its CatchHandler @ 00c2a59c */
  __cxa_end_catch();
  puVar7 = (undefined8 *)__cxa_allocate_exception(8);
  *puVar7 = unaff_x24 + 0x10;
                    /* try { // try from 00c2a558 to 00c2a56b has its CatchHandler @ 00c2a59c */
                    /* WARNING: Subroutine does not return */
  __cxa_throw(puVar7,&std::bad_exception::typeinfo,std::bad_exception::~bad_exception);
}


/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4e00
 */

undefined8
log_internal_impl(uint param_1,char *param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  long lVar2;
  undefined8 local_490;
  undefined8 uStack_488;
  undefined8 local_480;
  undefined8 uStack_478;
  undefined8 local_470;
  undefined8 uStack_468;
  undefined1 *local_460;
  undefined1 **ppuStack_458;
  undefined8 *puStack_450;
  undefined8 uStack_448;
  undefined1 *local_40;
  undefined1 **ppuStack_38;
  undefined8 *local_30;
  undefined8 uStack_28;
  
  if (DAT_00cc4660 <= param_1) {
    local_490 = param_3;
    uStack_488 = param_4;
    local_480 = param_5;
    uStack_478 = param_6;
    local_470 = param_7;
    uStack_468 = param_8;
    if (DAT_00d1fee4 == 1) {
      iVar1 = FUN_008e4f54();
      if (iVar1 == 0) {
        uStack_448 = 0xffffff80ffffffd0;
        local_460 = (undefined1 *)register0x00000008;
        ppuStack_458 = &local_460;
        puStack_450 = &local_490;
        vprintf(param_2,&local_460);
      }
      else {
        memset(&local_460,0,0x400);
        uStack_28 = 0xffffff80ffffffd0;
        local_40 = (undefined1 *)register0x00000008;
        ppuStack_38 = &local_460;
        local_30 = &local_490;
        iVar1 = vsnprintf((char *)&local_460,0x3ff,param_2,&local_40);
        FUN_008e4fac(iVar1);
        lVar2 = FUN_008e4f98();
        if (lVar2 == -1) {
          DAT_00d1fef0 = (FILE *)0x0;
          iVar1 = FUN_008e4f54();
          if (iVar1 != 0) {
            FUN_008e4fac();
            FUN_008e4f98();
          }
        }
        fflush(DAT_00d1fef0);
      }
    }
    if (((DAT_00d1fee0 & 1) == 0) && ((DAT_00d1fee4 & 1) == 0)) {
      uStack_448 = 0xffffff80ffffffd0;
      local_460 = (undefined1 *)register0x00000008;
      ppuStack_458 = &local_460;
      puStack_450 = &local_490;
      __android_log_vprint(4,"Dobby",param_2,&local_460);
    }
  }
  return 0;
}


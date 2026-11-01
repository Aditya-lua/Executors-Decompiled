
/* WARNING: Possible PIC construction at 0x0002e5c0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0002e5c4) */

undefined8 *
FUN_0002e2c0(ulong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 *param_5)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 uVar5;
  long unaff_x19;
  undefined1 auVar6 [16];
  
  auVar6._8_8_ = param_3;
  auVar6._0_8_ = param_2;
  if ((param_1 & 0x500) == 0) {
    if (param_5 != (undefined8 *)0x0) {
      if (*(char *)((long)param_5 + 0x17) < '\0') {
        param_5[1] = 1;
        param_5 = (undefined8 *)*param_5;
      }
      else {
        *(undefined1 *)((long)param_5 + 0x17) = 1;
      }
      *(char *)param_5 = (char)param_3;
      *(undefined1 *)((long)param_5 + 1) = 0;
      return (undefined8 *)(unaff_x19 + 1);
    }
  }
  else {
    auVar6 = func_0x0002dfa0();
  }
  lVar1 = auVar6._0_8_;
  if ((*(uint *)(lVar1 + 0x18) & 1) == 0) {
    if ((*(uint *)(lVar1 + 0x18) >> 3 & 1) == 0) {
      puVar2 = (undefined8 *)__Znwm(0x18);
      lVar4 = *(long *)(lVar1 + 0x38);
      uVar5 = *(undefined8 *)(lVar4 + 8);
      *puVar2 = &UNK_009b3278;
      puVar2[1] = uVar5;
      *(char *)(puVar2 + 2) = auVar6[8];
      *(undefined8 **)(lVar4 + 8) = puVar2;
      goto LAB_0002e800;
    }
    puVar3 = (undefined8 *)__Znwm(0x30);
    uVar5 = *(undefined8 *)(*(long *)(lVar1 + 0x38) + 8);
    *puVar3 = &UNK_009b3230;
    puVar3[1] = uVar5;
    puVar2 = (undefined8 *)__ZNSt3__16localeC1ERKS0_(puVar3 + 2,lVar1);
    uVar5 = *(undefined8 *)(lVar1 + 8);
    puVar3[4] = *(undefined8 *)(lVar1 + 0x10);
    puVar3[3] = uVar5;
    *(char *)(puVar3 + 5) = auVar6[8];
  }
  else {
    puVar3 = (undefined8 *)__Znwm(0x30);
    uVar5 = *(undefined8 *)(*(long *)(lVar1 + 0x38) + 8);
    *puVar3 = &UNK_009b31e8;
    puVar3[1] = uVar5;
    __ZNSt3__16localeC1ERKS0_(puVar3 + 2,lVar1);
    uVar5 = *(undefined8 *)(lVar1 + 8);
    puVar3[4] = *(undefined8 *)(lVar1 + 0x10);
    puVar3[3] = uVar5;
    puVar2 = (undefined8 *)
             (**(code **)(**(long **)(lVar1 + 8) + 0x28))(*(long **)(lVar1 + 8),auVar6._8_8_);
    *(char *)(puVar3 + 5) = (char)puVar2;
  }
  *(undefined8 **)(*(long *)(lVar1 + 0x38) + 8) = puVar3;
LAB_0002e800:
  *(undefined8 *)(lVar1 + 0x38) = *(undefined8 *)(*(long *)(lVar1 + 0x38) + 8);
  return puVar2;
}


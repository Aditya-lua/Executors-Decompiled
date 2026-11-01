
void FUN_000fddb8(undefined1 param_1 [16],undefined4 param_2,undefined8 param_3,int param_4,
                 long param_5)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  undefined4 extraout_w1;
  undefined4 extraout_var;
  undefined4 extraout_s0;
  undefined1 uStack00000000000001c0;
  undefined1 uStack00000000000001d0;
  undefined1 uStack00000000000001e0;
  undefined1 uStack00000000000001f0;
  
  if (param_4 != 0) {
    param_3 = func_0x0001753c(param_3);
    func_0x00107f38(&uStack00000000000001c0);
    func_0x000fe6a4(&uStack00000000000001d0);
    func_0x00107f68(&uStack00000000000001e0);
    func_0x00107f98(&uStack00000000000001f0);
  }
  uVar2 = __Unwind_Resume(param_3);
  if (*(char *)(param_5 + 0x48) != '\0') {
    return;
  }
  puVar1 = (undefined8 *)CONCAT44(extraout_var,extraout_w1);
  *(undefined8 *)(CONCAT44(extraout_var,extraout_w1) + 0x10) = 0;
  if (*(long *)(CONCAT44(extraout_var,extraout_w1) + 0x30) != 0) {
    puVar1[5] = 0;
    func_0x000b83d4();
    puVar1[6] = 0;
  }
  if (puVar1[1] != 0) {
    *puVar1 = 0;
    func_0x000b83d4();
    puVar1[1] = 0;
  }
  if (puVar1[4] != 0) {
    puVar1[3] = 0;
    func_0x000b83d4();
    puVar1[4] = 0;
  }
  puVar1[7] = 0;
  puVar1[8] = 0;
  *(undefined1 *)(puVar1 + 0xc) = 1;
  *(undefined4 *)(puVar1 + 0xe) = 0;
  *(undefined4 *)((long)puVar1 + 0x14) = *(undefined4 *)(param_5 + 0x14);
  puVar1[8] = uVar2;
  *(undefined4 *)(puVar1 + 0xd) = extraout_s0;
  *(undefined4 *)((long)puVar1 + 0x6c) = param_2;
  return;
}


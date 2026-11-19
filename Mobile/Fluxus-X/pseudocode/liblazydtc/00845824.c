/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00845824
 */

void FUN_00845824(locale *param_1,undefined4 param_2)

{
  undefined1 uVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  if ((*(uint *)(param_1 + 0x18) & 1) == 0) {
    if ((*(uint *)(param_1 + 0x18) >> 3 & 1) == 0) {
      puVar2 = operator_new(0x18);
      lVar4 = *(long *)(param_1 + 0x38);
      *(char *)(puVar2 + 2) = (char)param_2;
      uVar5 = *(undefined8 *)(lVar4 + 8);
      *puVar2 = &PTR_LAB_00c48da0;
      puVar2[1] = uVar5;
      *(undefined8 **)(lVar4 + 8) = puVar2;
      goto LAB_0084590c;
    }
    puVar2 = operator_new(0x30);
    uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x38) + 8);
    *puVar2 = &PTR_LAB_00c48d58;
    puVar2[1] = uVar5;
    std::__ndk1::locale::locale((locale *)(puVar2 + 2),param_1);
    uVar6 = *(undefined8 *)(param_1 + 0x10);
    uVar5 = *(undefined8 *)(param_1 + 8);
    lVar4 = *(long *)(param_1 + 0x38);
    *(char *)(puVar2 + 5) = (char)param_2;
    puVar2[4] = uVar6;
    puVar2[3] = uVar5;
  }
  else {
    puVar2 = operator_new(0x30);
    uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x38) + 8);
    *puVar2 = &PTR_FUN_00c48d10;
    puVar2[1] = uVar5;
    std::__ndk1::locale::locale((locale *)(puVar2 + 2),param_1);
    uVar5 = *(undefined8 *)(param_1 + 8);
    plVar3 = *(long **)(param_1 + 8);
    puVar2[4] = *(undefined8 *)(param_1 + 0x10);
    puVar2[3] = uVar5;
                    /* try { // try from 008458b8 to 008458bf has its CatchHandler @ 00845920 */
    uVar1 = (**(code **)(*plVar3 + 0x28))(plVar3,param_2);
    lVar4 = *(long *)(param_1 + 0x38);
    *(undefined1 *)(puVar2 + 5) = uVar1;
  }
  *(undefined8 **)(lVar4 + 8) = puVar2;
LAB_0084590c:
  *(undefined8 **)(param_1 + 0x38) = puVar2;
  return;
}


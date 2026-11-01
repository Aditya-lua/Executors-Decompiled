
ulong thunk_FUN_0066e310(undefined8 param_1,long param_2)

{
  long *plVar1;
  long lVar2;
  ulong uVar3;
  long *unaff_x19;
  
  unaff_x19[0xd] = param_2;
  (**(code **)(*(long *)unaff_x19[0xb] + 0x80))
            ((long *)unaff_x19[0xb],param_2,*(undefined4 *)((long)unaff_x19 + 100));
  plVar1 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  lVar2 = (**(code **)(*plVar1 + 0x130))();
  *(uint *)(unaff_x19 + 5) = (uint)(lVar2 != 0) << 1;
  if (lVar2 == 0) {
    return 0;
  }
  uVar3 = (ulong)*(uint *)((long)unaff_x19 + 100) - unaff_x19[4];
  if (uVar3 < 2) {
    uVar3 = 1;
  }
  return uVar3;
}


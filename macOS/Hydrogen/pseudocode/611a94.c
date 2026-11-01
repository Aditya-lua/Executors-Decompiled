
undefined * FUN_00611a94(long param_1)

{
  undefined *puVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  int in_w8;
  undefined1 auVar5 [16];
  long in_stack_00000000;
  undefined1 uStack_31;
  
  if (((param_1 == 0 || in_w8 != 5) || (puVar1 = (undefined *)func_0x006118e8(), (int)puVar1 == 0))
     || (in_stack_00000000 != 0)) {
    puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar2 + 1) = 1;
    puVar2[2] = 0x6f63656420524542;
    puVar2[3] = 0x726f727265206564;
    *(undefined1 *)(puVar2 + 4) = 0;
    *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
    *puVar2 = &UNK_009f60b8;
    puVar1 = &DAT_0060f08c;
    auVar5 = ___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
    plVar3 = auVar5._0_8_;
    uStack_31 = 4;
    (**(code **)(*plVar3 + 0x38))(plVar3,&uStack_31,1,0,1);
    lVar4 = func_0x00611648(plVar3,puVar1);
    (**(code **)(*plVar3 + 0x38))(plVar3,auVar5._8_8_,puVar1,0,1);
    return puVar1 + lVar4 + 1;
  }
  return puVar1;
}


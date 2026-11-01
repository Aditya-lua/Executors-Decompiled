
/* WARNING: Possible PIC construction at 0x0060ef08: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0060ef0c) */

undefined8 * FUN_0060eee0(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  char *pcVar5;
  
  ___cxa_free_exception();
  __Unwind_Resume();
  puVar4 = (undefined8 *)___cxa_allocate_exception(0x28);
  pcVar5 = (char *)__Znwm(0x38);
  uVar3 = s_BufferedTransformation__this_obj_008d0709._24_8_;
  uVar2 = s_BufferedTransformation__this_obj_008d0709._16_8_;
  uVar1 = s_BufferedTransformation__this_obj_008d0709._0_8_;
  *(undefined8 *)(pcVar5 + 8) = s_BufferedTransformation__this_obj_008d0709._8_8_;
  *(undefined8 *)pcVar5 = uVar1;
  *(undefined8 *)(pcVar5 + 0x18) = uVar3;
  *(undefined8 *)(pcVar5 + 0x10) = uVar2;
  uVar1 = s_BufferedTransformation__this_obj_008d0709._32_8_;
  *(ulong *)(pcVar5 + 0x28) =
       CONCAT17(s_BufferedTransformation__this_obj_008d0709[0x2f],
                s_BufferedTransformation__this_obj_008d0709._40_7_);
  *(undefined8 *)(pcVar5 + 0x20) = uVar1;
  *(ulong *)(pcVar5 + 0x2f) =
       CONCAT71(s_BufferedTransformation__this_obj_008d0709._48_7_,
                s_BufferedTransformation__this_obj_008d0709[0x2f]);
  pcVar5[0x37] = '\0';
  *puVar4 = &UNK_009b2ec8;
  *(undefined4 *)(puVar4 + 1) = 0;
  func_0x00017634(puVar4 + 2,pcVar5,0x37);
  *puVar4 = &UNK_009b2ea0;
  __ZdlPv(pcVar5);
  *puVar4 = &UNK_009f6078;
  return puVar4;
}


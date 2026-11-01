
void thunk_FUN_00036b94(void)

{
  uint unaff_w20;
  long unaff_x24;
  long unaff_x25;
  long in_stack_00000020;
  
  if ((unaff_w20 >> 9 & 1) == 0) {
    for (; unaff_x24 != unaff_x25; unaff_x24 = unaff_x24 + 1) {
      __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
    }
  }
  if (in_stack_00000020 != 0) {
    __ZdlPv();
  }
  return;
}


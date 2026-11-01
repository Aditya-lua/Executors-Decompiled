
bool FUN_00428af8(void)

{
  undefined8 *unaff_x19;
  ulong unaff_x24;
  ulong unaff_x25;
  
  *(undefined1 *)(unaff_x19 + 1) = 1;
  _pthread_mutex_unlock(*unaff_x19);
  return unaff_x25 <= unaff_x24;
}


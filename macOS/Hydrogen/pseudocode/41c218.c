
undefined8 FUN_0041c218(undefined8 param_1)

{
  int in_w8;
  undefined8 *unaff_x19;
  
  *(int *)(unaff_x19 + 2) = in_w8 + -1;
  if (in_w8 + -1 == 0) {
    unaff_x19[1] = 0;
    _pthread_mutex_unlock(*unaff_x19);
  }
  return param_1;
}


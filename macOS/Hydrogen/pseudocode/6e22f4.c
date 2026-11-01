
bool FUN_006e22f4(void)

{
  long lVar1;
  
  lVar1 = __dyld_get_image_header();
  if (*(int *)(lVar1 + 0x4e8dd14) == 7) {
    return *(char *)(*(long *)(lVar1 + 0x4e8dd08) + 3) != '\0';
  }
  return false;
}


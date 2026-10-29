/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a504..0x4a564 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_e677f0;

int sub_4a504(unsigned long long *a0)
{
    unsigned long long *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *a0 = &g_e677f0;
    sub_a070(a0 + 16);
    v0 = a0 + 12;
    sub_2a764(&v0);
    v0 = a0 + 8;
    sub_49f80(&v0);
    return operatordelete(a0);
}

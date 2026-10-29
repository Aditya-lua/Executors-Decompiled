/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc1491c..0xc1498c (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c1491c_0 {
    unsigned long long field_0;
} st_c1491c_0;


void sub_c1491c(unsigned long a0, st_c1491c_0 **a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a1)
    {
        (*a1)();
    }
    else if (a1[1])
    {
        _free();
        return;
    }
    else
    {
        return;
    }
}

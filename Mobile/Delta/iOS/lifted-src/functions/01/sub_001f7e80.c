/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7e80..0x1f7f40 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7e80_0 {
    char field_0;
} st_1f7e80_0;


double sub_1f7e80(void* a0, unsigned int a1)
{
    unsigned long v4;  // x20
    st_1f7e80_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1f7e80_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)&a0[8] = 0;
    *(unsigned long long *)&a0[80] = 20;
    *(unsigned long long *)&a0[104] = 6;
    *(unsigned long long *)&a0[32] = 0;
    *(unsigned long long *)&a0[56] = 0;
    memset((long long)a0[120], 0, 0x100);
    *(unsigned long long *)&a0[128] = 0x200000;
    *(double *)&a0[0x88] = 5e-324;
    *(unsigned int *)&a0[144] = 0;
    *(unsigned int *)&a0[148] = a1;
    *(unsigned long long *)&a0[160] = 0;
    *(unsigned long long *)&a0[184] = 0;
    v4 = (long long)a0[200];
    if (v4)
    {
        sub_1eccac(v4 + 48);
        sub_1eccac(v4 + 24);
        operatordelete(sub_1eccac(v4));
    }
    *(unsigned long long *)&a0[200] = 0;
    return 5e-324;
}

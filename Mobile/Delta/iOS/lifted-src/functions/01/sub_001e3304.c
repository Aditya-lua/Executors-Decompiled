/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e3304..0x1e33b8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e3304_1 {
    char padding_0[2];
    char field_2;
    char padding_3[85];
    struct st_1e3304_0 *field_58;
} st_1e3304_1;

typedef struct st_1e3304_0 {
    char field_0;
} st_1e3304_0;

extern unsigned long long g_e72fe0;
extern unsigned long long g_e73000;

int sub_1e3304(st_1e3304_1 *a0)
{
    char v4;  // x0
    char *v5;  // x8
    st_1e3304_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1e3304_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!(a0->field_2 >> 4 & 1))
    {
        *(unsigned int *)&a0->field_58[12] = 0;
        a0->field_58 = a0->field_58 + 16;
        return 1;
    }
    v4 = sub_1d8fd4(a0);
    if (v4)
    {
        v5 = a0->field_58;
        *(unsigned long long *)v5 = v4;
        *(unsigned int *)&v5[12] = 8;
        a0->field_58 = a0->field_58 + 16;
        goto *((void *)(g_e72fe0));
    }
    else
    {
        goto *((void *)(g_e73000));
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40e7c4..0x40e974 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40e7c4_0 {
    char field_0;
} st_40e7c4_0;

extern unsigned long long g_e801b0;
extern unsigned long long g_e80fd8;

int sub_40e7c4(st_40e7c4_0 **a0, st_40e7c4_0 **a1)
{
    char *v4;  // x8
    unsigned int v5;  // w8
    unsigned long long v6;  // x9
    unsigned long long v7;  // x8
    st_40e7c4_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_40e7c4_0 *v1;  // [bp-0x50]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = *a0;
    if (v4 != *a1)
    {
        (g_e801b0 - 0xf42bd800)();
    }
    else if (v4)
    {
        v5 = *v4;
        v6 = 64;
        if (v5 == 1)
            v6 = 8;
        v7 = 80;
        if (v5 == 2)
            v6 = v7;
        goto *((void *)(*(long long *)((char *)&g_e80fd8 + v6)));
    }
    else
    {
        return 1;
    }
}

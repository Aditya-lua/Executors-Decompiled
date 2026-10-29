/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d6cb4..0x9d733c (1672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d6cb4_0 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned short field_4;
    unsigned short field_6;
} st_9d6cb4_0;

extern st_9d6cb4_0 g_d2d978;
extern char g_10002b0;

unsigned long long sub_9d6cb4(unsigned long a0, unsigned int a1)
{
    unsigned long long v5;  // x0
    unsigned int v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xbc]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = 128;
    v1 = 0;
    if (97 >= a1 - 8)
    {
        goto *((void *)(sub_9d6d0c + *(short *)((char *)&(&g_d2d978.field_0)[a1] - 16) * 4));
    }
    else
    {
        v5 = 0;
        if (*(long long *)&g_10002b0 == v2)
            return v5;
        ___stack_chk_fail();
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f3dd4..0x1f3eac (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f3dd4_0 {
    char field_0;
} st_1f3dd4_0;

extern unsigned long long g_e789a8;
extern unsigned long long g_e789e8;

unsigned long long sub_1f3dd4(unsigned long long *a0, unsigned int a1, unsigned int a2, unsigned long long *a3)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x23
    st_1f3dd4_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1f3dd4_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a2;
    if (a3[1] != v4)
    {
        return 0;
    }
    else if (a2)
    {
        v5 = 0;
        while (1)
        {
            if (sub_1f1298(*a0 + a1 * 8, *a3 + v5) & 1)
            {
                a1 += 1;
                v5 += 8;
                if (v4 * 8 == v5)
                    goto *((void *)(g_e789a8));
            }
            else
            {
                goto *((void *)(g_e789e8));
            }
        }
    }
    else
    {
        goto *((void *)(g_e789a8));
    }
}

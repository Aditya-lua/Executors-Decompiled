/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d144..0x3d3a4 (608 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d144_0 {
    char field_0;
} st_3d144_0;

extern unsigned long long g_e66c58;
extern unsigned long long g_e66ca8;

long long sub_3d144(long long a0, long long *a1, unsigned long a2, unsigned long a3)
{
    unsigned long long v4;  // x0
    unsigned int v5;  // w23
    long long *v6;  // x24
    unsigned long long *v7;  // x24
    long long *v8;  // x25
    st_3d144_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_3d144_0 *v1;  // [bp-0x78]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_4663c())
        return sub_47e48(a0);
    v4 = sub_42480(a0, a1[4]);
    if (!(v4 >> 31 & 1))
    {
        v5 = v4;
        v6 = a1;
        v7 = v6 + 6;
        if (v5 != sub_42480(a0, v6[6]) || (v8 = a1, sub_42480(a0, v8[8]) >> 31 & 1 && !(sub_4663c(a0, v8[8]) & 1)))
        {
            if (v5 != sub_42480(a0, a1[8]))
            {
                goto *((void *)(g_e66ca8));
            }
            else if (sub_42480(a0, *v7) >> 31 & 1 && !sub_4663c(a0, *v7))
            {
                goto *((void *)(g_e66ca8));
            }
        }
        sub_3b1fc(a0);
        goto *((void *)(g_e66c58));
    }
    else
    {
        goto *((void *)(g_e66ca8));
    }
}

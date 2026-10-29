/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67f4..0x6878 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_67f4_1 {
    char padding_0[28];
    unsigned int field_1c;
} st_67f4_1;

typedef struct st_67f4_0 {
    char field_0;
} st_67f4_0;

extern unsigned long long g_e61418;
extern unsigned long long g_e61440;

void sub_67f4(st_67f4_1 **a0, unsigned long a1, unsigned int a2)
{
    unsigned long long v2;  // x11
    unsigned long long v3;  // x11
    st_67f4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_67f4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1)
    {
        v2 = a1 * 8;
        while (1)
        {
            v3 = v2;
            if (*a0->field_1c != a2)
            {
                a0 += 1;
                v2 = v3 - 8;
                if (v3 == 8)
                    goto *((void *)(g_e61440));
            }
            else
            {
                goto *((void *)(g_e61418));
            }
        }
    }
    else
    {
        goto *((void *)(g_e61440));
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6ec4..0x6f50 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6ec4_1 {
    char padding_0[28];
    unsigned int field_1c;
} st_6ec4_1;

typedef struct st_6ec4_2 {
    char padding_0[32];
    struct st_6ec4_3 *field_20;
    unsigned long long field_28;
} st_6ec4_2;

typedef struct st_6ec4_3 {
    struct st_6ec4_1 *field_0;
} st_6ec4_3;

typedef struct st_6ec4_0 {
    char field_0;
} st_6ec4_0;

extern unsigned long long g_e613c0;
extern unsigned long long g_e613e8;

long long sub_6ec4(st_6ec4_2 *a0)
{
    st_6ec4_1 **v2;  // x9
    unsigned long long v3;  // x11
    unsigned long long v4;  // x11
    st_6ec4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_6ec4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_28)
    {
        v2 = a0->field_20;
        v3 = a0->field_28 * 8;
        while (1)
        {
            v4 = v3;
            if (*v2->field_1c != 1)
            {
                v2 += 1;
                v3 = v4 - 8;
                if (v4 == 8)
                    goto *((void *)(g_e613e8));
            }
            else
            {
                goto *((void *)(g_e613c0));
            }
        }
    }
    else
    {
        goto *((void *)(g_e613e8));
    }
}

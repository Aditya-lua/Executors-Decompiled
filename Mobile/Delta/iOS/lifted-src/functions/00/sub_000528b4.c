/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x528b4..0x52940 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_528b4_2 {
    struct st_528b4_3 *field_0;
    unsigned long long field_8;
} st_528b4_2;

typedef struct st_528b4_1 {
    char padding_0[32];
    unsigned long long field_20;
} st_528b4_1;

typedef struct st_528b4_3 {
    struct st_528b4_1 *field_0;
} st_528b4_3;

typedef struct st_528b4_0 {
    char field_0;
} st_528b4_0;

extern unsigned long long g_e68e80;
extern unsigned long long g_e68ea8;

long long sub_528b4(unsigned long a0, st_528b4_2 *a1)
{
    st_528b4_1 **v2;  // x9
    unsigned long long v3;  // x11
    unsigned long long v4;  // x11
    st_528b4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_528b4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_8)
    {
        v2 = a1->field_0;
        v3 = a1->field_8 * 8;
        while (1)
        {
            v4 = v3;
            if (*v2->field_20 != a0)
            {
                v2 += 1;
                v3 = v4 - 8;
                if (v4 == 8)
                    goto *((void *)(g_e68ea8));
            }
            else
            {
                goto *((void *)(g_e68e80));
            }
        }
    }
    else
    {
        goto *((void *)(g_e68ea8));
    }
}

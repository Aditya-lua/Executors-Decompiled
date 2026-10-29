/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f12c4..0x1f1368 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f12c4_1 {
    struct st_1f12c4_0 *field_0;
    unsigned long long field_8;
} st_1f12c4_1;

typedef struct st_1f12c4_0 {
    char field_0;
} st_1f12c4_0;

extern unsigned long long g_e777e8;
extern unsigned long long g_e77818;

long long sub_1f12c4(st_1f12c4_1 *a0, unsigned long long a1, st_1f12c4_1 *a2)
{
    unsigned long long v2;  // x9
    char *v3;  // x10
    unsigned long long v4;  // x12
    unsigned long long v5;  // x9
    st_1f12c4_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f12c4_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a2->field_8;
    if (a2->field_8)
    {
        v3 = a2->field_0;
        if (a0->field_8 < a1)
            v4 = 0;
        else
            v4 = a0->field_8 - a1;
        while (1)
        {
            v5 = v2;
            if (!v4 || *(char *)&a0->field_0[a1] != *v3)
                break;
            a1 += 1;
            v4 -= 1;
            v3 += 1;
            v2 = v5 - 1;
            if (v5 == 1)
                goto *((void *)(g_e777e8));
        }
        goto *((void *)(g_e77818));
    }
    else
    {
        goto *((void *)(g_e777e8));
    }
}

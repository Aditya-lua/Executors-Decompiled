/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x527b4..0x528b4 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_527b4_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[28];
    char field_28;
} st_527b4_1;

typedef struct st_527b4_0 {
    char field_0;
} st_527b4_0;

extern unsigned long long g_e68be8;
extern unsigned long long g_e68c00;
extern unsigned long long g_e68c10;
extern unsigned long long g_e68c28;
extern unsigned int g_f00d70;

void sub_527b4(long long a0, st_527b4_1 *a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    char v10;  // x0
    st_527b4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_527b4_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        goto *((void *)(g_e68c10));
    }
    else if (a1->field_8 != g_f00d70)
    {
        goto *((void *)(g_e68c10));
    }
    else if (a1->field_28 & 1)
    {
        goto *((void *)(g_e68c00));
    }
    else
    {
        v10 = sub_10160(a0 + 88, &a1[1].padding_c[27]);
        if (v10 && *(long long *)(v10 + 8))
            goto *((void *)(g_e68c28));
        goto *((void *)(g_e68be8));
    }
}

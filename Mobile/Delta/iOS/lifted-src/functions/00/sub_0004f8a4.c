/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f8a4..0x4f984 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f8a4_5 {
    char padding_0[32];
    long long field_20;
    unsigned long long field_28;
    struct st_4f8a4_2 *field_30;
} st_4f8a4_5;

typedef struct st_4f8a4_4 {
    char padding_0[16];
    long long field_10;
    char padding_18[40];
    unsigned long long field_40;
    struct st_4f8a4_2 *field_48;
} st_4f8a4_4;

typedef struct st_4f8a4_1 {
    unsigned long long field_0;
} st_4f8a4_1;

typedef struct st_4f8a4_3 {
    struct st_4f8a4_1 *field_0;
} st_4f8a4_3;

typedef struct st_4f8a4_0 {
    char field_0;
} st_4f8a4_0;

typedef struct st_4f8a4_2 {
    struct st_4f8a4_3 *field_0;
    unsigned int field_8;
} st_4f8a4_2;

extern unsigned int g_f00c30;

unsigned long long sub_4f8a4(st_4f8a4_4 *a0, st_4f8a4_5 *a1)
{
    st_4f8a4_2 *v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // x8
    st_4f8a4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_4f8a4_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (sub_39b14(a0->field_10, a1->field_20))
    {
        v4 = a1->field_30;
        if (!a1->field_30)
            return NULL;
    }
    else if (sub_46a30(a0->field_10, a1->field_20))
    {
        v4 = a1->field_28;
    }
    else
    {
        if (a1->field_30)
        {
            v5 = 1;
            if (a1->field_30->field_8 != g_f00c30)
                v5 = 2;
        }
        else
        {
            v5 = 1;
        }
        v6 = a0->field_40 + v5;
        a0->field_40 = (v6 & 0x8080808080808080) - ((v6 & 0x8080808080808080) >> 7) | v6 & 0x7f7f7f7f7f7f7f7f;
        a0->field_48 = 0;
        return 1;
    }
    (*(long long *)v4->field_0)();
}

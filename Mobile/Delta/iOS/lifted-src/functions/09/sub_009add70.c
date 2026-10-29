/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9add70..0x9ade9c (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9add70_1 {
    char padding_0[248];
    long long field_f8;
    char padding_100[496];
    unsigned long long field_2f0;
    unsigned int field_2f8;
    char padding_2fc[500];
    struct st_9add70_0 *field_4f0;
    char padding_4f8[1232];
    unsigned long long field_9c8;
} st_9add70_1;

typedef struct st_9add70_2 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    unsigned short field_10;
    char padding_12[6];
    unsigned long long field_18;
    unsigned long long field_20;
} st_9add70_2;

typedef struct st_9add70_0 {
    char padding_0[376];
    char field_178;
    char padding_179[7];
    unsigned long long field_180;
    unsigned short field_188;
    char padding_18a[6];
    long long field_190;
} st_9add70_0;


long long sub_9add70(st_9add70_1 *a0, st_9add70_2 *a1)
{
    st_9add70_1 *v2;  // x19
    unsigned long long v3;  // x20
    unsigned long long v4;  // x8
    long long v5;  // x1
    st_9add70_0 *v6;  // x8
    unsigned int v7;  // w9
    long long v8;  // x1
    long long v9;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    v3 = a1->field_8;
    if (v3 >= a1->field_20 + a1->field_18)
    {
        v4 = v2->field_9c8;
        if (17740 >= v2->field_9c8)
            v4 = 17740;
        if (v3 > v4)
            goto LABEL_9addb0;
        if (v2->field_4f0->field_190)
        {
            if (v3 == v2->field_4f0->field_180)
                return 1;
            sub_a368c8();
            v5 = 489;
LABEL_9addc8:
            sub_a369bc("ssl/statem/statem_dtls.c", v5, "dtls1_preprocess_fragment");
            v8 = 47;
            v9 = 152;
        }
        else
        {
            if (sub_9ebee0(v2->field_f8, v3 + 12))
            {
                v2->field_2f0 = v3;
                v6 = v2->field_4f0;
                v6->field_180 = v3;
                v7 = a1->field_0;
                v2->field_2f8 = v7;
                v6->field_178 = v7;
                v6->field_188 = a1->field_10;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_dtls.c", 475, "dtls1_preprocess_fragment");
            v8 = 80;
            v9 = 524295;
        }
        sub_9a58a4(v2, v8, v9, 0);
        return 0;
    }
LABEL_9addb0:
    sub_a368c8();
    v5 = 465;
    goto LABEL_9addc8;
}

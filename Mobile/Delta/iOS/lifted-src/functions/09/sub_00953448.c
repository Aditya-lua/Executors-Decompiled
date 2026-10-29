/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953448..0x953538 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953448_2 {
    struct st_953448_2 *field_0;
    char padding_8[16];
    struct st_953448_0 *field_18;
    char padding_20[88];
    struct st_953448_2 *field_78;
    char padding_80[128];
    unsigned long long field_100;
    char padding_108[16];
    struct st_953448_2 *field_118;
    struct st_953448_2 *field_120;
    struct st_953448_2 *field_128;
    struct st_953448_2 *field_130;
    char padding_138[952];
    struct st_953448_2 *field_4f0;
} st_953448_2;

typedef struct st_953448_0 {
    char padding_0[48];
    struct st_953448_1 *field_30;
} st_953448_0;

typedef struct st_953448_1 {
    unsigned long long field_0;
} st_953448_1;


st_953448_2 * sub_953448(st_953448_2 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    st_953448_2 *v17;  // x0
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_953448_2 *v12;  // x0
    st_953448_2 *v13;  // x0
    st_953448_2 *v14;  // x0
    st_953448_2 *v15;  // x19
    st_953448_2 *v16;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
    {
        return a0;
    }
    else if ((int)a0->field_0)
    {
        return 0;
    }
    else
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = sub_991b64(&a0[2].padding_138[304]);
        if (!(unsigned int)v12)
            return v12;
        v13 = sub_954824(a0);
        if (!(unsigned int)v13)
            return v13;
        v14 = sub_a6bffc(472, "ssl/d1_lib.c", 79);
        if (v14)
        {
            v15 = v14;
            v16 = sub_954274();
            v15->field_118 = v16;
            v17 = sub_954274(v16);
            v15->field_120 = v17;
            if ((int)a0->field_78)
                v15->field_100 = 0xff;
            v15->field_128 = 0;
            v15->field_130 = 0;
            if (v16 && v17)
            {
                a0->field_4f0 = v15;
                a0->field_18->field_30();
            }
            sub_954288(v16);
            sub_954288(v15->field_120);
            sub_a6c2e4(v15, "ssl/d1_lib.c", 97);
        }
        sub_954884(a0);
        return 0;
    }
}

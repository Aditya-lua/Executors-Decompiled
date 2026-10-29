/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97df60..0x97e058 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97df60_1 {
    unsigned int field_0;
    char padding_4[84];
    long long field_58;
    char padding_60[24];
    struct st_97df60_1 *field_78;
    char padding_80[32];
    long long field_a0;
    char padding_a8[8];
    struct st_97df60_0 *field_b0;
} st_97df60_1;

typedef struct st_97df60_0 {
    char padding_0[184];
    unsigned int field_b8;
} st_97df60_0;


st_97df60_1 * sub_97df60(st_97df60_1 *a0)
{
    unsigned int v2;  // w8
    st_97df60_0 *v3;  // x22
    st_97df60_1 *v13;  // x0
    st_97df60_1 *v4;  // w20
    st_97df60_1 *v5;  // x21
    st_97df60_1 *v6;  // x21
    st_97df60_1 *v9;  // w0
    unsigned long v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_97c738();
        return 1;
    }
    v2 = a0->field_0;
    if (v2 - 130 < 2)
        return 1;
    if (v2 == 129)
    {
        v4 = (st_97df60_1 *)0;
        v5 = a0->field_78;
        v3 = a0;
    }
    else if (v2 == 128)
    {
        v3 = a0->field_b0;
        v4 = (st_97df60_1 *)1;
        v5 = a0;
    }
    else
    {
        sub_97c738();
        return 1;
    }
    v6 = v5;
    sub_ad9384(sub_c4ba8(a0->field_58));
    v9 = (st_97df60_1 *)(unsigned int)sub_9796d4(v6->field_a0);
    v10 = &v3->field_b8;
    if (v4)
        v10 = &v6[2].padding_4[4];
    sub_ad93b4(sub_c4ba8());
    if (!v9)
        v13 = *(int *)v10;
    else
        v13 = 5;
    return v13;
}

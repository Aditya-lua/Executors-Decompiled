/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaddbd8..0xaddcf0 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_addbd8_0 {
    struct st_addbd8_0 *field_0;
    struct st_addbd8_0 *field_8;
    struct st_addbd8_0 *field_10;
    struct st_addbd8_0 *field_18;
} st_addbd8_0;


st_addbd8_0 * sub_addbd8(st_addbd8_0 *a0, st_addbd8_0 *a1, st_addbd8_0 *a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_addbd8_0 *v12;  // x0
    st_addbd8_0 *v13;  // x0
    st_addbd8_0 *v14;  // x8
    st_addbd8_0 *v15;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0 && !a1)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a1)
    {
        v12 = sub_a9ad24(a1);
        if (!v12)
            return v12;
    }
    else
    {
        v12 = 0;
    }
    v13 = sub_a6bffc(32, "crypto/x509/pcy_data.c", 52);
    if (!v13)
    {
        sub_9c3580(v12);
        return 0;
    }
    v14 = sub_ad61b4();
    v15 = v13;
    v15->field_18 = v14;
    if (!v14)
    {
        sub_a6c2e4(v15, "crypto/x509/pcy_data.c", 59);
        sub_a368c8(sub_9c3580(v12));
        sub_a369bc("crypto/x509/pcy_data.c", 61, "ossl_policy_data_new");
        sub_a36abc(0x22, 0x8000f, 0);
        return 0;
    }
    if (a2)
        *(unsigned int *)&v15->field_0 = 16;
    if (v12)
    {
        v15->field_8 = v12;
        if (!a0)
            return v15;
    }
    else
    {
        v15->field_8 = a0->field_0;
        a0->field_0 = 0;
    }
    v15->field_10 = a0->field_8;
    a0->field_8 = 0;
    return v15;
}

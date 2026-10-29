/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c0c38..0x9c0de8 (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c0c38_0 {
    char padding_0[24];
    struct st_9c0c38_1 *field_18;
} st_9c0c38_0;

typedef struct st_9c0c38_2 {
    char field_0;
    char padding_1[31];
    struct st_9c0c38_0 *field_20;
} st_9c0c38_2;

typedef struct st_9c0c38_1 {
    unsigned long long field_0;
} st_9c0c38_1;


unsigned long long sub_9c0c38(st_9c0c38_2 *a0, long long a1)
{
    unsigned int v8;  // w9
    unsigned int v9;  // w9
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long long *v18;  // x21
    unsigned long long v19;  // x0
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    long long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = a1;
    v4 = 0;
    v0 = 0;
    v1 = 0;
    if (!a1)
        return 0;
    v8 = a0->field_0;
    v9 = 1 << ((char)v8 & 31) & 70;
    if (v8 <= 6)
    {
        v10 = arm64g_calculate_condition(v16 | 144, v17, v12, v13);
        v11 = arm64g_calculate_condition(3, (v10 & 1 ? v9 : 0x40000000), 0, 0);
LABEL_9c0ce8:
        v18 = 0;
    }
    else
    {
        v14 = arm64g_calculate_condition(v16 | 144, v17, v12, v13);
        v15 = arm64g_calculate_condition(0, (v14 & 1 ? v9 : 0x40000000), 0, 0);
        if (v15 & 1 || !a0->field_20)
            goto LABEL_9c0ce8;
        v18 = a0->field_20->field_18;
        if (v18)
            v18();
    }
    v19 = sub_9ccc7c(a1, &v4, a0);
    if (!(v19 >> 31 & 1) && v4)
    {
        v3 = v4;
        v2 = sub_9cad7c(0, &v3, v19 & 0xffffffff, a0, v1, v0);
        sub_a6c2e4(v4, "crypto/asn1/a_dup.c", 84);
        return v2;
    }
    sub_a368c8();
    sub_a369bc("crypto/asn1/a_dup.c", 79, "ASN1_item_dup");
    sub_a36abc(13, 0x8000d, 0);
    return 0;
}

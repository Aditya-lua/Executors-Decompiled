/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb27108..0xb2722c (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b27108_0 {
    unsigned long long field_0;
    char padding_8[6];
    unsigned long long field_e;
} st_b27108_0;

typedef struct st_b27108_2 {
    struct st_b27108_0 *field_0;
} st_b27108_2;

typedef struct st_b27108_1 {
    struct st_b27108_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b27108_1;

extern st_b27108_1 g_ee1d60;

unsigned long long * sub_b27108(st_b27108_0 *a0, int a1, unsigned long long a2, long long a3, long long a4)
{
    long long v3;  // x0
    unsigned long long *v4;  // x0
    unsigned long v13;  // cc_dep2
    unsigned long long v14;  // 4110
    unsigned long v15;  // 4110
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long *v21;  // x0
    unsigned int v5;  // w8
    unsigned long v6;  // x9
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    st_b27108_0 *v9;  // x8
    unsigned long v10;  // 4110
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9f2aec(a3);
    v4 = sub_a80fd4(a2);
    if (!v4)
        return v4;
    v5 = (unsigned int)a2 - 1457;
    if (2 < v5 || !(v6 = v4[9] + 22, v7 = v6, v8 = a1, v6 == a1))
        return 0;
    v9 = *(long long *)(&g_ee1d60.field_0)[v5];
    if (a0->field_0 == v9->field_0)
    {
        v10 = arm64g_calculate_condition(4, v7, v8, 0);
        v11 = 4;
        v12 = (v10 & 1 ? *(long long *)a0->padding_8 : 0);
        v13 = (v10 & 1 ? *(long long *)v9->padding_8 : 0);
        v14 = arm64g_calculate_condition(4, v12, v13, 0);
        if (!(v14 & 1))
            goto LABEL_b2718e;
LABEL_b2718d:
        v17 = arm64g_calculate_condition(v11, v12, v13, 0);
        v18 = arm64g_calculate_condition(4, (v17 & 1 ? *(long long *)(a0->padding_8)[1] : 0), (v17 & 1 ? *(long long *)(v9->padding_8)[1] : 0), 0);
        if (v18 & 1)
            goto LABEL_b271b0;
    }
    else
    {
        v15 = arm64g_calculate_condition(4, v7, v8, 0);
        v11 = 0;
        v12 = (v15 & 1 ? *(long long *)a0->padding_8 : 0);
        v13 = (v15 & 1 ? *(long long *)v9->padding_8 : 0);
        v16 = arm64g_calculate_condition(0, v12, v13, 0);
        if (v16 & 1)
            goto LABEL_b2718d;
LABEL_b2718e:
        v19 = arm64g_calculate_condition(v11, v12, v13, 0);
        v20 = arm64g_calculate_condition(0, (v19 & 1 ? *(long long *)(a0->padding_8)[1] : 0), (v19 & 1 ? *(long long *)(v9->padding_8)[1] : 0), 0);
        if (v20 & 1)
        {
LABEL_b271b0:
            v21 = sub_a7f9e4(v3, a4, a2);
            if (!v21)
                return v21;
            if (sub_a7de4c())
                return v21;
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", 131, "ossl_ml_dsa_d2i_PUBKEY");
            v0 = *v4;
            sub_a36abc(57, 141, "error parsing %s public key from input SPKI");
            sub_a7fabc(v21);
        }
    }
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4fccc..0xb4fe18 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4fccc_0 {
    struct st_b4fccc_0 *field_0;
    char padding_8[8];
    char field_10;
    char padding_11[255];
    struct st_b4fccc_0 *field_110;
    char field_118;
    char padding_119[31];
    struct st_b4fccc_0 *field_138;
} st_b4fccc_0;

typedef struct st_b4fccc_1 {
    char padding_0[32];
    struct st_b4fccc_0 *field_20;
} st_b4fccc_1;


st_b4fccc_0 * sub_b4fccc(st_b4fccc_0 *a0, st_b4fccc_0 *a1)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    st_b4fccc_0 *v9;  // x0
    st_b4fccc_0 **v0;  // [bp-0x28], Other Possible Types: st_b4fccc_1 *
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (a0)
    {
        v1 = v6;
        v2 = v7;
        v3 = &v5;
        v4 = v8;
        if (!a1 || !a1->field_0)
        {
LABEL_b4fdc4:
            v9 = 1;
        }
        else if (sub_a6fbc4(a1, "context-string") && (v0 = &a0->field_10, v9 = sub_a71440(), !(unsigned int)v9))
        {
            a0->field_110 = 0;
        }
        else if (sub_a6fbc4(a1, "test-entropy"))
        {
            v0 = &a0->field_118;
            a0->field_138 = 0;
            if (sub_a71440())
            {
                if (a0->field_138 == 32)
                    goto LABEL_b4fd64;
                a0->field_138 = 0;
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/ml_dsa_sig.c", 268, "ml_dsa_set_ctx_params");
                sub_a36abc(57, 154, 0);
            }
            v9 = 0;
        }
        else
        {
LABEL_b4fd64:
            if ((!sub_a6fbc4(a1, "deterministic") || (v9 = sub_a6fc2c(), (unsigned int)v9)) && (!sub_a6fbc4(a1, "message-encoding") || (v9 = sub_a6fc2c(), (unsigned int)v9)) && (!sub_a6fbc4(a1, "mu") || (v9 = sub_a6fc2c(), (unsigned int)v9)))
                goto LABEL_b4fdc4;
        }
        a0 = v9;
    }
    return (unsigned int)a0;
}

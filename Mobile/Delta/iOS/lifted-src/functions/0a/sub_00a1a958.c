/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1a958..0xa1aa94 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1a958_1 {
    struct st_a1a958_0 *field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
    char padding_20[32];
    long long field_40;
    char padding_48[96];
    long long field_a8;
} st_a1a958_1;

typedef struct st_a1a958_0 {
    char padding_0[4];
    unsigned int field_4;
} st_a1a958_0;


long long sub_a1a958(st_a1a958_1 *a0)
{
    unsigned int v2;  // w0
    long long v3;  // x0
    long long v4;  // x19
    long long v5;  // x0
    long long v6;  // x21
    long long v7;  // x0
    long long v8;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e46a8(a0->field_10);
    if ((int)v2 <= (int)((sub_9e46a8(a0->field_40) + 1) / 2 + 3))
    {
        sub_9e5b4c(a0->field_18);
        return 1;
    }
    v3 = sub_9dddcc(a0->field_a8);
    if (!v3)
        return v3;
    v4 = v3;
    sub_9de064();
    v5 = sub_9de208(v4);
    if (v5)
    {
        v6 = v5;
        if (a0->field_0->field_4 == 407)
        {
            sub_9e5b4c(v6);
            if (sub_9e55d4(v6, sub_9e46a8(a0->field_40) - 1))
                goto LABEL_a1aa10;
        }
        else if (sub_9e4c34(v6, a0->field_40))
        {
LABEL_a1aa10:
            if (sub_9ea50c(a0->field_18, a0->field_10) && sub_9db29c(a0->field_18, a0->field_18, v6))
            {
                v7 = sub_9e4624();
                if (sub_9db29c(a0->field_18, a0->field_18, v7))
                {
                    v8 = sub_9de520(a0->field_18, 0, a0->field_18, a0->field_10, v4) != 0;
                    sub_9de17c(v4);
                    sub_9dded4(v4);
                    return v8;
                }
            }
        }
    }
    sub_9de17c(v4);
    sub_9dded4(v4);
    return 0;
}

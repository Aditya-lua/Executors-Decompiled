/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f8100..0x9f82d0 (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f8100_0 {
    unsigned long long field_0;
    char padding_8[16];
    long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[24];
    long long field_48;
    long long field_50;
    unsigned int field_58;
} st_9f8100_0;

typedef struct st_9f8100_1 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[40];
    unsigned long long field_48;
    long long field_50;
    long long field_58;
} st_9f8100_1;


long long sub_9f8100(st_9f8100_1 *a0, st_9f8100_0 *a1)
{
    unsigned long long v2;  // 4118
    long long v3;  // x1
    unsigned long long v4;  // x0
    long long v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_9f7850(a1) || !a0->field_0 || (v2 = arm64g_calculate_condition(1, a1->field_58, 1, 0), v2 & 1 || a1->field_58 == 1 && !a0->field_18))
    {
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_vfy.c", 0x66, "SCT_CTX_verify");
        v3 = 106;
    }
    else if ((int)a1->field_0)
    {
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_vfy.c", 106, "SCT_CTX_verify");
        v3 = 115;
    }
    else if (a1->field_20 != a0->field_10 || _memcmp(a1->field_18, a0->field_8))
    {
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_vfy.c", 110, "SCT_CTX_verify");
        v3 = 114;
    }
    else if (a1->field_28 > a0->field_48)
    {
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_vfy.c", 114, "SCT_CTX_verify");
        v3 = 116;
    }
    else
    {
        v4 = sub_a3f728();
        v5 = v4;
        if (v4)
        {
            v4 = sub_a56e98(v5, 0, "SHA2-256", a0->field_50, a0->field_58, a0->field_0, 0);
            if ((unsigned int)v4)
            {
                v4 = sub_9f82d0(v5, a0, a1);
                if ((unsigned int)v4)
                {
                    v4 = sub_a578ec(v5, a1->field_48, a1->field_50);
                    if (!(unsigned int)v4)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ct/ct_vfy.c", 133, "SCT_CTX_verify");
                        sub_a36abc(50, 107, 0);
                        v4 = 0;
                    }
                }
            }
        }
        sub_a3f73c(v5);
        return v4;
    }
    sub_a36abc(50, v3, 0);
    return 0;
}

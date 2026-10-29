/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5cc38..0xb5cf28 (752 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5cc38_2 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    char padding_10[32];
    char field_30;
    char padding_31[95];
    struct st_b5cc38_0 *field_90;
} st_b5cc38_2;

typedef struct st_b5cc38_0 {
    char padding_0[40];
    struct st_b5cc38_1 *field_28;
} st_b5cc38_0;

typedef struct st_b5cc38_1 {
    unsigned long long field_0;
} st_b5cc38_1;


unsigned int sub_b5cc38(st_b5cc38_2 *a0, long long a1)
{
    long long v2;  // x1
    unsigned int v3;  // x0
    unsigned int v5;  // x0
    unsigned int v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "ivlen") && !sub_a70efc())
    {
        sub_a368c8();
        v2 = 154;
    }
    else if (!sub_a6fbc4(a1, "taglen") || sub_a70efc())
    {
        v3 = sub_a6fbc4(a1, "iv");
        if (v3)
        {
            if (15 - a0->field_8 > (unsigned long long)*(long long *)(v3 + 24))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 171, "ossl_ccm_get_ctx_params");
                sub_a36abc(57, 109, 0);
                return 0;
            }
            if (sub_a715c0() || sub_a71800(v3, &a0->field_30, *(long long *)(v3 + 24)))
                goto LABEL_b5cd20;
            sub_a368c8();
            v2 = 176;
        }
        else
        {
LABEL_b5cd20:
            v5 = sub_a6fbc4(a1, "updated-iv");
            if (v5)
            {
                if (15 - a0->field_8 > (unsigned long long)*(long long *)(v5 + 24))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 184, "ossl_ccm_get_ctx_params");
                    sub_a36abc(57, 109, 0);
                    return 0;
                }
                if (sub_a715c0() || sub_a71800(v5, &a0->field_30, *(long long *)(v5 + 24)))
                    goto LABEL_b5cdb4;
                sub_a368c8();
                v2 = 189;
            }
            else
            {
LABEL_b5cdb4:
                if (sub_a6fbc4(a1, "keylen") && !sub_a70efc())
                {
                    sub_a368c8();
                    v2 = 196;
                }
                else if (!sub_a6fbc4(a1, "tlsaadpad") || sub_a70efc())
                {
                    v7 = sub_a6fbc4(a1, "tag");
                    if (!v7)
                    {
                        return 1;
                    }
                    else if (~a0->field_0 & 9)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", 209, "ossl_ccm_get_ctx_params");
                        sub_a36abc(57, 0x77, 0);
                        return 0;
                    }
                    else if (*(int *)(v7 + 8) == 5)
                    {
                        a0->field_90->field_28();
                    }
                    else
                    {
                        sub_a368c8();
                        v2 = 213;
                    }
                }
                else
                {
                    sub_a368c8();
                    v2 = 202;
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        v2 = 163;
    }
    sub_a369bc("providers/implementations/ciphers/ciphercommon_ccm.c", v2, "ossl_ccm_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}

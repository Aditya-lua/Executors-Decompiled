/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2cb00..0xa2cf18 (1048 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2cb00_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_a2cb00_3;

typedef struct st_a2cb00_0 {
    char padding_0[1];
    char field_1;
    char padding_2[14];
    struct st_a2cb00_0 *field_10;
    struct st_a2cb00_0 *field_18;
} st_a2cb00_0;

typedef struct st_a2cb00_1 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    struct st_a2cb00_2 *field_30;
} st_a2cb00_1;

typedef struct st_a2cb00_2 {
    unsigned long long field_0;
} st_a2cb00_2;

extern long long g_a2cf18;
extern long long g_a2cf60;
extern char g_10002b0;

st_a2cb00_0 * sub_a2cb00(st_a2cb00_0 *a0, long long a1, st_a2cb00_0 *a2)
{
    st_a2cb00_0 *v13;  // x25
    st_a2cb00_0 *v14;  // x0
    st_a2cb00_0 *v23;  // x24
    st_a2cb00_0 *v24;  // x0
    st_a2cb00_0 *v25;  // x8
    st_a2cb00_0 *v26;  // x25
    st_a2cb00_1 *v28;  // x27
    long long v29;  // x0
    st_a2cb00_0 *v30;  // x28
    st_a2cb00_3 **v31;  // x0
    unsigned long v32;  // cc_dep1
    st_a2cb00_0 *v15;  // x20
    st_a2cb00_0 *v33;  // x9
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4105
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4105
    st_a2cb00_0 *v38;  // w0
    st_a2cb00_0 *v16;  // x22
    st_a2cb00_0 *i;  // w24
    long long v18;  // x0
    st_a2cb00_0 *v19;  // x23
    st_a2cb00_0 *v20;  // x9
    st_a2cb00_0 *k;  // x8
    st_a2cb00_0 *j;  // w9
    st_a2cb00_0 *v0;  // [bp-0x108]
    st_a2cb00_0 *v1;  // [bp-0x100]
    st_a2cb00_0 *v2;  // [bp-0xf8]
    st_a2cb00_0 *v3;  // [bp-0xf0]
    st_a2cb00_0 *v4;  // [bp-0xe8]
    st_a2cb00_0 *v5;  // [bp-0xe4]
    st_a2cb00_0 *v6;  // [bp-0xe0]
    st_a2cb00_0 *v7;  // [bp-0xd8]
    st_a2cb00_0 *v8;  // [bp-0xd0]
    st_a2cb00_0 *v9;  // [bp-0xc8]
    unsigned long v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    if (!a0)
    {
        sub_c66ab0();
        goto LABEL_a2ced0;
    }
    v13 = a0;
    if (a0->field_18)
    {
        v14 = sub_ad61b4();
        if (v14)
        {
            v15 = v14;
            sub_a2d804(a1, &g_a2cf18, v15);
            v16 = sub_ad69e4(v15);
            if (a2 || sub_aa5178(a1, 0))
            {
                i = (st_a2cb00_0 *)(unsigned int)sub_ad69e4(v13->field_18);
                v18 = sub_ad5f30(v13->field_18, &g_a2cf60);
                if (i >= 1)
                {
                    v19 = 0;
                    do
                    {
                        *(unsigned int *)(sub_ad69f8(v13->field_18, v19) + 36) = (unsigned int)v19;
                        v19 = (unsigned int)v19 + 1;
                    } while (i != (unsigned int)v19);
                }
                sub_ad6ae4(v13->field_18);
                sub_ad5f30(v13->field_18, v18);
            }
            v2 = v13;
            v3 = 0;
            v4 = 0;
            v6 = 0;
            v20 = 0;
            k = sub_ad69e4(v13->field_18);
            v7 = k;
            v1 = v13;
            while (1)
            {
                v0 = v20;
                j = (st_a2cb00_0 *)0;
                v8 = k;
                v9 = k;
                v5 = (st_a2cb00_0 *)0;
                do
                {
                    v23 = v6;
                    if (v23 < k)
                    {
                        do
                        {
                            v24 = sub_ad69f8(v13->field_18, v23);
                            if (v24)
                                v25 = v24->field_10;
                            else
                                v25 = 0;
                            v3 = v25;
                            v4 = (st_a2cb00_0 *)0;
                            if ((unsigned int)v16)
                            {
                                v26 = 0;
                                do
                                {
                                    v28 = sub_ad69f8(v15, v26);
                                    v29 = sub_a2d6cc(v28, v26);
                                    sub_a77638(v29);
                                    if (sub_a2d780(v28, v3, &v4))
                                    {
                                        v30 = v6;
                                        while (1)
                                        {
                                            if (v9 <= v30)
                                                v28->field_30();
                                            v31 = sub_ad69f8(v2->field_18, v30);
                                            if (v28->field_18 == *v31->field_18)
                                                break;
                                            v30 = &v30->field_1;
                                        }
                                    }
                                } while ((v26 = &v26->field_1, v26 != v16));
                            }
                            v23 = &v23->field_1;
                            k = v7;
                            v13 = v1;
                        } while (k > v23);
                        j = v5;
                    }
                    j = &j->field_1;
                    v5 = j;
                    v32 = j;
                } while (2 > j);
                k = v9;
                v6 = v8;
                v7 = k;
                v33 = v0;
                if (k != v8)
                {
                    v34 = arm64g_calculate_condition(19, v32, 2, 0);
                    v20 = &v33->field_1;
                    v35 = arm64g_calculate_condition(36, (v34 & 1 ? v33 : 0x20000000), (v34 & 1 ? 10 : 0), 0);
                    if (v35 & 1)
                        break;
                }
                else
                {
                    v36 = arm64g_calculate_condition(19, v32, 2, 0);
                    v20 = &v33->field_1;
                    v37 = arm64g_calculate_condition(32, (v36 & 1 ? v33 : 0x20000000), (v36 & 1 ? 10 : 0), 0);
                    if (v37 & 1)
                        break;
                }
            }
            sub_ad6958(v15, sub_a2d06c);
            goto LABEL_a2ce98;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/decoder_lib.c", 609, "OSSL_DECODER_CTX_add_extra");
            sub_a36abc(60, 0x8000f, 0);
LABEL_a2ced0:
            v38 = (st_a2cb00_0 *)0;
        }
    }
    else
    {
LABEL_a2ce98:
        v38 = (st_a2cb00_0 *)1;
    }
    if (*(long long *)&g_10002b0 == v10)
        return v38;
    ___stack_chk_fail();
}

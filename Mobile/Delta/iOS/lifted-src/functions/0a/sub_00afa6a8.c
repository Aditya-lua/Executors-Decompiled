/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafa6a8..0xafa8bc (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afa6a8_0 {
    char padding_0[8];
    long long field_8;
} st_afa6a8_0;

typedef struct st_afa6a8_2 {
    char padding_0[16];
    struct st_afa6a8_1 *field_10;
} st_afa6a8_2;

typedef struct st_afa6a8_1 {
    long long field_0;
    char field_1;
    char padding_2[14];
    struct st_afa6a8_0 *field_10;
    unsigned long long field_18;
} st_afa6a8_1;

extern long long g_afa344;
extern long long g_afaf90;
extern long long g_afaf94;
extern long long g_eba9c0;

st_afa6a8_1 * sub_afa6a8(st_afa6a8_1 **a0, unsigned long long *a1, long long a2)
{
    st_afa6a8_1 *v5;  // x0
    st_afa6a8_1 *v6;  // x21
    st_afa6a8_1 *v7;  // x22
    st_afa6a8_1 *v8;  // x1
    long long v9;  // x23
    st_afa6a8_1 *v10;  // x24
    st_afa6a8_2 *v11;  // x0
    st_afa6a8_1 *v0;  // [bp-0x58]
    st_afa6a8_1 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = *a1;
    v0 = 0;
    v5 = sub_9cace4();
    if ((int)(unsigned int)v5 < 1)
        return v5;
    v6 = *a0;
    if (v6)
    {
        sub_9ebcf4(*(long long *)&v6->padding_2[7]);
        sub_ad6958(v6->field_0, &g_afa344);
        sub_a6c2e4(v6->field_10, "crypto/x509/x_name.c", 126);
        sub_a6c2e4(v6, "crypto/x509/x_name.c", 127);
        *a0 = 0;
    }
    if (sub_afa568(&v0))
    {
        if (!sub_9ebd68(*(long long *)&v0->padding_2[7], v2 - v2))
            goto LABEL_afa850;
        _memcpy(*(long long *)(*(long long *)&v0->padding_2[7] + 8), v2, v2 - v2);
        if ((int)sub_ad69e4(v1) >= 1)
        {
            v7 = 0;
            do
            {
                v8 = v7;
                v9 = sub_ad69f8(v1, v8);
                if ((int)sub_ad69e4(v9, v8) >= 1)
                {
                    v10 = 0;
                    do
                    {
                        v11 = sub_ad69f8(v9, v10);
                        *(unsigned int *)&v11->field_10 = (unsigned int)v7;
                        if (!sub_ad68a0(v0->field_0, v11))
                            goto LABEL_afa850;
                    } while ((sub_ad6a28(v9, v10, 0), v10 = (unsigned int)v10 + 1, (int)(unsigned int)v10 < (int)sub_ad69e4(v9)));
                }
            } while ((v7 = (unsigned int)v7 + 1, (int)sub_ad69e4(v1) > (int)(unsigned int)v7));
        }
        if (sub_afaaf4(v0))
        {
            sub_ad6958(v1, &g_afaf90);
            *(unsigned int *)&v0->field_1 = 0;
            *a0 = v0;
            *a1 = v2;
            return 1;
        }
    }
    if (!v0)
        goto LABEL_afa860;
LABEL_afa850:
    sub_9cd960(v0, &g_eba9c0);
LABEL_afa860:
    sub_a368c8(sub_ad6958(v1, &g_afaf94), &g_afaf94);
    sub_a369bc("crypto/x509/x_name.c", 210, "x509_name_ex_d2i");
    sub_a36abc(13, 0x8010a, 0);
    return 0;
}

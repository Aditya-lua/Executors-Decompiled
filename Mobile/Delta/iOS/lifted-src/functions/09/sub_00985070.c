/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x985070..0x98524c (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_985070_0 {
    char padding_0[40];
    long long field_28;
    char padding_30[16];
    long long field_40;
    long long field_48;
    unsigned int field_50;
    char padding_54[12];
    unsigned int field_60;
    char padding_64[4];
    struct st_985070_0 *field_68;
    char padding_70[26];
    char field_8a;
    char padding_8b[533];
    struct st_985070_0 *field_2a0;
    char padding_2a8[24];
    unsigned int field_2c0;
    char padding_2c4[20];
    struct st_985070_0 *field_2d8;
} st_985070_0;

extern char g_10002b0;

st_985070_0 * sub_985070(st_985070_0 *a0, st_985070_0 *a1)
{
    st_985070_0 *v5;  // x21
    st_985070_0 *v6;  // w8
    unsigned long idx;  // x20
    st_985070_0 **v8;  // x22
    unsigned long long n;  // x20
    st_985070_0 *v10;  // x0
    unsigned long index;  // x20
    st_985070_0 **v12;  // x21
    long long v13;  // x1
    long long v0;  // [bp-0x80]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x38]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if (4 <= a1 || !a0 || a1 != 3)
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_record_shared.c", 450, "ossl_qrl_enc_level_set_key_cooldown_done");
        v13 = 524550;
        goto LABEL_9851dc;
    }
    v5 = &a0->padding_0[a1 * 208];
    v6 = (st_985070_0 *)(char)v5->field_68;
    if (v6 == 2)
    {
        idx = ~a0->field_2c0 & 1;
        v8 = &a0->field_2a0;
        if (v8[idx])
        {
            sub_a4bca0(v8[idx]);
            v8[idx] = 0;
        }
        sub_a66ec0(&a0->padding_0[16 * idx + 730], 16);
        *(char *)&a0->field_2d8 = 3;
        v6 = (st_985070_0 *)(char)v5->field_68;
    }
    if (v6 == 3)
    {
        n = sub_985d10(v5->field_60) & 0xffffffff;
        v10 = sub_984a84(a0, 3, ~v5->field_50 & 1, &v5->field_8a, n);
        if ((unsigned int)v10)
        {
            *(unsigned int *)&v0 = 1;
            if (sub_96eae0(v5->field_40, v5->field_48, v5->field_28, &v5->field_8a, "quic kuquic ivquic key", 7, 0, 0, &v1, n, v0))
            {
                _memcpy(&v5->field_8a, &v1, n);
                v10 = 1;
                *(char *)&v5->field_68 = 1;
            }
            else
            {
                index = ~v5->field_50 & 1;
                v12 = &a0->field_2a0;
                if (v12[index])
                {
                    sub_a4bca0(v12[index]);
                    v12[index] = 0;
                }
                sub_a66ec0(&a0->padding_0[16 * index + 730], 16);
LABEL_9851e4:
                v10 = 0;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_record_shared.c", 461, "ossl_qrl_enc_level_set_key_cooldown_done");
        v13 = 786691;
LABEL_9851dc:
        sub_a36abc(20, v13, 0);
        goto LABEL_9851e4;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v10;
    ___stack_chk_fail();
}

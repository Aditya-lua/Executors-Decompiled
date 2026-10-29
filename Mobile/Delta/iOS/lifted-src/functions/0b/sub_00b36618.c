/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36618..0xb36864 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b36618_1 {
    char padding_0[32];
    unsigned long long field_20;
    long long field_28;
} st_b36618_1;

typedef struct st_b36618_2 {
    struct st_b36618_0 *field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    unsigned int field_20;
    char padding_24[28];
    struct st_b36618_1 *field_40;
} st_b36618_2;

typedef struct st_b36618_0 {
    char padding_0[16];
    char field_10;
    char field_11;
    char padding_12[78];
    unsigned int field_60;
} st_b36618_0;

extern char g_10002b0;

char sub_b36618(st_b36618_2 *a0, char a1, unsigned long long *a2, long long a3, long long a4)
{
    st_b36618_1 *v9;  // x22
    long long v10;  // x2
    long long v11;  // x1
    st_b36618_0 *v12;  // x24
    char v14;  // x0
    char v15;  // x19
    char v16;  // x20
    char v17;  // x0
    uint128_t v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb0]
    uint128_t v3;  // [bp-0x80]
    uint128_t v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x60]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (a0->field_20 == 1)
    {
        v9 = a0->field_40;
        if (!a1)
        {
            *a2 = v9->field_20;
            v17 = 1;
        }
        else if (v9->field_20 > *a2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ecx_kem.c", 629, "dhkem_decap");
            v10 = "*secretlen too small";
            v11 = 142;
            goto LABEL_b367d4;
        }
        else if (v9->field_28 == a4)
        {
            v12 = a0->field_0;
            sub_a71bbc(sub_a71670("pub", a3, a4), a3, a4);
            v3 = v0;
            v4 = v1;
            v5 = v2;
            v14 = sub_a2a7c8(a0->field_10, a0->field_0->field_60, 1, a0->field_18);
            if (v14)
            {
                v15 = v14;
                if ((int)sub_a2a1c0() > 0)
                {
                    if (!v12 || !(v12->field_10 & 1))
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kem/ecx_kem.c", 152, "ecx_pubkey");
                        sub_a36abc(57, 220, 0);
LABEL_b3679c:
                        v16 = 0;
                    }
                    else
                    {
                        if (!sub_b36aec(a0, a1, a0->field_0, v15, a0->field_0, a0->field_8, a3, &v12->field_11))
                            goto LABEL_b3679c;
                        *a2 = v9->field_20;
                        v16 = 1;
                    }
                    goto LABEL_b367f0;
                }
                else
                {
                    sub_a2a8a4(v15);
                }
            }
            v15 = 0;
            v16 = 0;
LABEL_b367f0:
            sub_a2a8a4(v15);
            v17 = v16;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/ecx_kem.c", 633, "dhkem_decap");
            v10 = "Invalid enc public key";
            v11 = 158;
LABEL_b367d4:
            sub_a36abc(57, v11, v10);
            v17 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ecx_kem.c", 682, "ecxkem_decapsulate");
        sub_a36abc(57, 125, 0);
        v17 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v17;
    ___stack_chk_fail();
}

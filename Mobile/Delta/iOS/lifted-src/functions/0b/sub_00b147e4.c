/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb147e4..0xb14a64 (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b147e4_1 {
    long long field_0;
    char field_8;
    char padding_9[255];
    struct st_b147e4_0 *field_108;
} st_b147e4_1;

typedef struct st_b147e4_0 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_b147e4_0;

extern long long g_ed8398;

long long sub_b147e4(unsigned long long *a0, long long a1, st_b147e4_1 *a2)
{
    long long v7;  // x0
    char v8;  // x0
    long long v9;  // x19
    long long v10;  // x23
    long long v11;  // x0
    long long v12;  // x1
    unsigned long v0;  // [bp-0x70], Other Possible Types: unsigned long long
    long long v1;  // [bp-0x68]
    long long v2;  // [bp-0x60]
    unsigned long v3;  // [bp-0x50]
    char v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_9f2aec(a2->field_0);
    v3 = *a0;
    v4 = 0;
    v8 = sub_ac3874(v7, &a2->field_8, a2->field_108->field_0);
    if (!v8)
        return v8;
    v9 = v8;
    v10 = sub_ac4014() + 18;
    if (v10 == a1)
    {
        v4 = sub_a6bffc(16, "providers/implementations/encode_decode/decode_der2key.c", 716);
        if (!v4)
        {
            sub_ac39b4(v9);
            return 0;
        }
        if (!sub_9cad7c(&v4, &v3, a1, &g_ed8398, 0, 0))
        {
            sub_a368c8();
            v12 = 723;
            goto LABEL_b14914;
        }
        else if (*(char *)(*(long long *)(v4 + 8) + 16) & 7 || v3 != *a0 + a1)
        {
            sub_a368c8();
            v12 = 731;
LABEL_b14914:
            sub_a369bc("providers/implementations/encode_decode/decode_der2key.c", v12, "slh_dsa_d2i_PUBKEY");
            v0 = sub_ac404c(v9);
        }
        else
        {
            v11 = sub_a99624(a2->field_108->field_18);
            if (sub_a9ae30(v11, *(long long *)v4))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/decode_der2key.c", 737, "slh_dsa_d2i_PUBKEY");
                v0 = sub_ac404c(v9);
            }
            else
            {
                if (sub_ac40bc(v9, *(long long *)(*(long long *)(v4 + 8) + 8), *(int *)*(long long *)(v4 + 8)))
                {
                    if (!v4)
                        return v9;
                    sub_9c3580(*(long long *)v4);
                    sub_9cf0f4(*(long long *)(v4 + 8));
                    sub_a6c2e4(v4, "providers/implementations/encode_decode/decode_der2key.c", 754);
                    return v9;
                }
                sub_a368c8();
                sub_a369bc("providers/implementations/encode_decode/decode_der2key.c", 744, "slh_dsa_d2i_PUBKEY");
                v0 = sub_ac404c(v9);
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/decode_der2key.c", 709, "slh_dsa_d2i_PUBKEY");
        v1 = a1;
        v2 = v10;
        v0 = a2->field_108->field_0;
    }
    sub_a36abc(57, 141);
    if (!v4)
    {
        sub_ac39b4(v9);
        return 0;
    }
    sub_9c3580(*(long long *)v4);
    sub_9cf0f4(*(long long *)(v4 + 8));
    sub_a6c2e4(v4, "providers/implementations/encode_decode/decode_der2key.c", 754);
    sub_ac39b4(v9);
    return 0;
}

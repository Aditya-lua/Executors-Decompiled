/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa833b0..0xa8351c (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a833b0_2 {
    uint128_t field_0;
    uint128_t field_10;
} st_a833b0_2;

typedef struct st_a833b0_1 {
    struct st_a833b0_0 *field_0;
    char padding_8[40];
    struct st_a833b0_2 *field_30;
    long long field_38;
    unsigned long long field_40;
} st_a833b0_1;

typedef struct st_a833b0_0 {
    unsigned long long field_0;
    char padding_8[40];
    unsigned long long field_30;
    char padding_38[16];
    int field_48;
} st_a833b0_0;


unsigned long long sub_a833b0(char *a0, long long a1, st_a833b0_1 *a2)
{
    st_a833b0_0 *v3;  // x21
    int v4;  // w8
    unsigned int v13;  // w16
    unsigned int v14;  // w14
    uint128_t *v18;  // x8
    uint128_t *v19;  // x9
    uint128_t v20;  // q1
    unsigned long long v5;  // x9
    char *v6;  // x10
    int i;  // w8
    unsigned long long v8;  // x12
    char *iter;  // x13
    unsigned short *v10;  // x15
    unsigned int v11;  // w14
    unsigned int v12;  // w17
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a2->field_0;
    v4 = v3->field_48;
    if (v4 >= 1)
    {
        v5 = a2->field_40;
        v6 = a0;
        do
        {
            i = v4;
            v8 = 0;
            iter = v6;
            do
            {
                v10 = v5 + v8;
                v11 = iter[1];
                v12 = iter[2];
                v13 = (*iter | (v11 * 0x100 | v11 >> 24) & 0xf00) & 0xfff;
                *v10 = v13;
                v14 = v11 >> 4 | v12 * 16;
                v10[1] = v14;
                if (0xd00 < v13 || 0xd00 < v14)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ml_kem/ml_kem.c", 1632, "parse_pubkey");
                    v0 = v3->field_0;
                    sub_a36abc(57, 158, "%s invalid public 't' vector");
                    return 0;
                }
            } while ((iter += 3, v8 += 4, (unsigned int)v8 != 0x200));
            v5 += 0x200;
            v6 += 384;
            v4 = i - 1;
        } while (1 < i);
    }
    v18 = &a2->field_30->field_0;
    v19 = &a0[v3->field_30];
    v20 = v19[1];
    *v18 = *v19;
    v18[1] = v20;
    if (sub_a85848(a2->field_38) && sub_a85900(a1, a2))
        return 1;
    sub_a368c8();
    sub_a369bc("crypto/ml_kem/ml_kem.c", 1645, "parse_pubkey");
    v0 = v3->field_0;
    sub_a36abc(15, 0xc0103, "internal error while parsing %s public key");
    return 0;
}

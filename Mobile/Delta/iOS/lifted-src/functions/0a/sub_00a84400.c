/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa84400..0xa84550 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a84400_2 {
    uint128_t field_0;
    uint128_t field_10;
} st_a84400_2;

typedef struct st_a84400_0 {
    struct st_a84400_1 *field_0;
    char padding_8[48];
    struct st_a84400_2 *field_38;
} st_a84400_0;

typedef struct st_a84400_1 {
    unsigned long long field_0;
} st_a84400_1;

extern char g_10002b0;

long long sub_a84400(long long a0, uint128_t *a1, uint128_t *a2, long long a3, long long a4, st_a84400_0 *a5)
{
    unsigned int v11;  // w0
    long long v12;  // x0
    unsigned long v13;  // x19
    unsigned long v0;  // [bp-0xf0]
    uint128_t v1;  // [bp-0xe0]
    uint128_t v2;  // [bp-0xd0]
    char v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xa0]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    uint128_t v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x58]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v4 = *a2;
    v5 = a2[1];
    v6 = a5->field_38->field_0;
    v7 = a5->field_38->field_10;
    if (sub_a86280(&v1, &v4, 64, a4, a5))
    {
        v11 = sub_a8673c(a0, a2, &v3, a3, a4, a5);
        v12 = sub_a66ec0(&v4, 64);
        if (!v11)
            goto LABEL_a844c4;
        *a1 = v1;
        a1[1] = v2;
        v13 = 1;
    }
    else
    {
        v12 = sub_a66ec0(&v4, 64);
LABEL_a844c4:
        sub_a368c8(v12, 64);
        sub_a369bc("crypto/ml_kem/ml_kem.c", 1809, "encap");
        v0 = *(long long *)a5->field_0;
        sub_a36abc(15, 0xc0103, "internal error while performing %s encapsulation");
        v13 = 0;
    }
    sub_a66ec0(&v1, 64);
    if (*(long long *)&g_10002b0 == v8)
        return v13;
    ___stack_chk_fail();
}

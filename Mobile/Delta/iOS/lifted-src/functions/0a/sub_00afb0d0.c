/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb0d0..0xafb1e4 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afb0d0_4 {
    char padding_0[8];
    struct st_afb0d0_2 *field_8;
} st_afb0d0_4;

typedef struct st_afb0d0_2 {
    char padding_0[32];
    struct st_afb0d0_3 *field_20;
} st_afb0d0_2;

typedef struct st_afb0d0_0 {
    struct st_afb0d0_1 *field_0;
    char padding_8[32];
    char field_28;
} st_afb0d0_0;

typedef struct st_afb0d0_1 {
    long long field_0;
} st_afb0d0_1;

typedef struct st_afb0d0_3 {
    char field_0;
} st_afb0d0_3;


unsigned long long sub_afb0d0(unsigned long a0, st_afb0d0_0 *a1)
{
    long long v2;  // x0
    char v3;  // x0
    char v4;  // x0
    st_afb0d0_4 *v5;  // x19
    long long v6;  // x20
    long long v7;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99eac(*(long long *)a1->field_0);
    if (!(a1->field_28 & 1))
    {
        v3 = sub_a3547c(v2);
        if (!v3)
            return v3;
        sub_a32e7c();
    }
    v4 = sub_a5ba1c();
    if (!v4)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x_pubkey.c", 427, "x509_pubkey_decode");
        sub_a36abc(11, 0x80006, 0);
        return 0xffffffff;
    }
    v5 = (st_afb0d0_4 *)v4;
    if (!sub_a5a05c())
    {
        v6 = 111;
        v7 = 432;
    }
    else if (v5->field_8->field_20)
    {
        v5->field_8->field_20();
    }
    else
    {
        v6 = 124;
        v7 = 445;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x_pubkey.c", v7, "x509_pubkey_decode");
    sub_a36abc(11, v6, 0);
    sub_a5a4c8(v5);
    return 0;
}

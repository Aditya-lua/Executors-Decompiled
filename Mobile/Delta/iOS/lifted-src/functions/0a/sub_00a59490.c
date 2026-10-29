/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59490..0xa59708 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a59490_0 {
    struct st_a59490_1 *field_0;
    struct st_a59490_2 *field_8;
} st_a59490_0;

typedef struct st_a59490_2 {
    long long field_0;
    long long field_8;
} st_a59490_2;

typedef struct st_a59490_1 {
    long long field_0;
} st_a59490_1;

extern char g_10002b0;

st_a59490_0 * sub_a59490(long long a0, unsigned long a1, unsigned long a2, long long a3, unsigned long a4, unsigned long a5, long long a6, long long a7)
{
    st_a59490_0 *v6;  // x19
    long long v7;  // x25
    st_a59490_0 *v8;  // x0
    st_a59490_0 *v9;  // x26
    long long v11;  // x1
    long long v12;  // x1
    long long v0;  // [bp-0xd0]
    unsigned long long *v1;  // [bp-0xc0], Other Possible Types: char
    char v2;  // [bp-0xb8]
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = sub_9c5520(sub_9c9ec4(), a3);
    if (!v6)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p5_crpt2.c", 128, "PKCS5_v2_PBE_keyivgen_ex");
        v12 = 114;
    }
    else if (sub_a51314(2, sub_a99eac(*(long long *)v6->field_0), 0, 0, 0, &v1))
    {
        if ((int)sub_a99b48(&v2, 80, v6->field_8->field_0, 0) <= 0)
        {
            sub_a368c8();
            v11 = 143;
            goto LABEL_a59648;
        }
        v7 = v5;
        sub_a36c8c();
        v8 = sub_a4e104(a7, &v2, v7);
        v9 = v8;
        if (v9 || (v9 = sub_a58c5c(&v2), v9))
        {
            sub_a36cd4();
            if (sub_a4c694(a0, v9, 0, 0, 0, a6))
            {
                if ((int)sub_a4f9f0(a0, v6->field_8->field_8) > 0)
                {
                    v0 = v7;
                    v1();
                }
                sub_a368c8();
                sub_a369bc("crypto/evp/p5_crpt2.c", 164, "PKCS5_v2_PBE_keyivgen_ex");
                sub_a36abc(6, 122, 0);
            }
            goto LABEL_a5969c;
        }
        else
        {
            sub_a368c8(sub_a36e70());
            v11 = 155;
LABEL_a59648:
            sub_a369bc("crypto/evp/p5_crpt2.c", v11, "PKCS5_v2_PBE_keyivgen_ex");
            v12 = 107;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p5_crpt2.c", 135, "PKCS5_v2_PBE_keyivgen_ex");
        v12 = 124;
    }
    sub_a36abc(6, v12, 0);
    v8 = 0;
LABEL_a5969c:
    sub_a4bbe4(v8);
    sub_9c9ed0(v6);
    if (*(long long *)&g_10002b0 == v3)
        return 0;
    ___stack_chk_fail();
}

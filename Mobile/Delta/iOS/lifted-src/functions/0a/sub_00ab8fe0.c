/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8fe0..0xab915c (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8fe0_2 {
    char padding_0[24];
    struct st_ab8fe0_1 *field_18;
} st_ab8fe0_2;

typedef struct st_ab8fe0_0 {
    struct st_ab8fe0_0 *field_0;
} st_ab8fe0_0;

typedef struct st_ab8fe0_1 {
    char padding_0[88];
    struct st_ab8fe0_0 *field_58;
} st_ab8fe0_1;


st_ab8fe0_0 ** sub_ab8fe0(unsigned long long a0, st_ab8fe0_0 **a1, st_ab8fe0_0 **a2, long long a3, st_ab8fe0_0 **a4, st_ab8fe0_2 *a5)
{
    st_ab8fe0_0 **v4;  // x19
    st_ab8fe0_0 **v5;  // x20
    st_ab8fe0_0 **v6;  // w0
    st_ab8fe0_0 **v0;  // [bp-0x60]
    st_ab8fe0_0 **v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (a5->field_18->field_58)
        a5->field_18->field_58();
    if ((unsigned int)a0 != 114)
    {
        v4 = v0;
        v5 = v1;
        if (!sub_ab915c(&v0, &v1, a0, a1, a2))
        {
            sub_a6c4e8(v4, v5, "crypto/rsa/rsa_sign.c", 331);
            return 0;
        }
        a1 = v4;
    }
    else if (a2 == 36)
    {
        v4 = 0;
        v5 = 36;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sign.c", 307, "RSA_sign");
        sub_a36abc(4, 131, 0);
        return 0;
    }
    if ((char *)&v5[1] + 3 > sub_aafbcc(a5))
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sign.c", 319, "RSA_sign");
        sub_a36abc(4, 112, 0);
        sub_a6c4e8(v4, v5, "crypto/rsa/rsa_sign.c", 331);
        return 0;
    }
    v6 = (st_ab8fe0_0 **)(unsigned int)sub_aafc00(v5, a1, a3, a5, 1);
    if (v6 < 1)
    {
        sub_a6c4e8(v4, v5, "crypto/rsa/rsa_sign.c", 331);
        return 0;
    }
    *(unsigned int *)a4 = (unsigned int)v6;
    sub_a6c4e8(v4, v5, "crypto/rsa/rsa_sign.c", 331);
    return 1;
}

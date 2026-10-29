/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab71a0..0xab7388 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab71a0_2 {
    char padding_0[136];
    long long field_88;
    char padding_90[8];
    struct st_ab71a0_0 *field_98;
} st_ab71a0_2;

typedef struct st_ab71a0_0 {
    char padding_0[28];
    struct st_ab71a0_1 *field_1c;
    struct st_ab71a0_1 *field_20;
    char padding_28[16];
    struct st_ab71a0_1 *field_38;
} st_ab71a0_0;

typedef struct st_ab71a0_1 {
    char field_0;
} st_ab71a0_1;


char * sub_ab71a0(st_ab71a0_2 *a0, char *a1, unsigned long long *a2, long long a3, long long a4)
{
    st_ab71a0_0 *v3;  // x25
    long long v4;  // x23
    char *v5;  // x0
    char *v6;  // w0
    char *n;  // x21
    unsigned int v8;  // w0
    char v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_98;
    v4 = sub_a59af4(a0->field_88);
    if (!v3->field_1c)
    {
        n = sub_aafc18(a4, a3, a1, v4, *(int *)&(v3->padding_0)[1]);
LABEL_ab72b4:
        if ((int)(unsigned int)n < 1)
            return n;
    }
    else if (*(int *)&(v3->padding_0)[1] != 1)
    {
        if (*(int *)&(v3->padding_0)[1] != 5)
            return 0xffffffff;
        if (!*(long long *)&v3->padding_28[8])
        {
            v5 = sub_a6bf4c(sub_aafbcc(sub_a59af4(a0->field_88)), "crypto/rsa/rsa_pmeth.c", 118);
            *(char **)&v3->padding_28[8] = v5;
            if (!v5)
                return 0xffffffff;
        }
        v6 = (char *)(unsigned int)sub_aafc18(a4, a3);
        n = v6 - 1;
        if (v6 < 1)
            return 0;
        v8 = sub_aba5a8(sub_9c7b68(v3->field_1c));
        if (v8 != n[*(long long *)&v3->padding_28[8]])
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pmeth.c", 234, "pkey_rsa_verifyrecover");
            sub_a36abc(4, 100, 0);
            return 0;
        }
        if ((unsigned int)n != sub_a50ac8(v3->field_1c))
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pmeth.c", 0xee, "pkey_rsa_verifyrecover");
            sub_a36abc(4, 143, 0);
            return 0;
        }
        if (!a1)
            goto LABEL_ab72b4;
        _memcpy(a1, *(long long *)&v3->padding_28[8], n);
        if (1 > (int)(unsigned int)n)
            return n;
    }
    else if ((int)sub_ab93d0(sub_9c7b68(), 0, 0, a1, &v0, a3, a4, v4) > 0)
    {
        n = v0;
        if (1 > (int)(unsigned int)n)
            return n;
    }
    else
    {
        return 0;
    }
    *a2 = n & 0xffffffff;
    return 1;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad64b4..0xad65b4 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad64b4_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ad64b4_1 *field_8;
} st_ad64b4_0;

typedef struct st_ad64b4_1 {
    unsigned long long field_0;
} st_ad64b4_1;


unsigned long long sub_ad64b4(st_ad64b4_0 *a0, unsigned long a1, unsigned long long a2)
{
    long long v2;  // x1
    unsigned long long v3;  // w0
    st_ad64b4_0 *v4;  // x8
    unsigned long v5;  // x9
    unsigned long long *v6;  // x10
    unsigned long long v7;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/stack/stack.c", 262, "OPENSSL_sk_insert");
        v2 = 786690;
    }
    else if (a0->field_0 == 0x7fffffff)
    {
        sub_a368c8();
        sub_a369bc("crypto/stack/stack.c", 266, "OPENSSL_sk_insert");
        v2 = 114;
    }
    else
    {
        v3 = (unsigned int)sub_ad62a8();
        if (!v3)
            return v3;
        v4 = a0;
        v5 = a0->field_0;
        v6 = a0->field_8;
        if (!(a2 >> 31 & 1) && (int)v5 > (int)a2)
        {
            v7 = (a2 * 8 | a2 >> 61) & 0x7fffffff8 & 0x7ffffffff;
            _memmove((char *)v6 + v7 + 8, (char *)v6 + v7, (long long)((v5 - a2) * 0x100000000) >> 63 & 0xfffffff800000000 | __ROL__(v5 - a2, 3) & 0x7fffffff8 & 0x7ffffffff);
            v4 = a0;
            *(unsigned long *)((char *)a0->field_8 + v7) = a1;
            v5 = a0->field_0;
        }
        else
        {
            v6[(unsigned int)v5] = a1;
        }
        v4->field_0 = (unsigned int)v5 + 1;
        v4[1].field_0 = 0;
        return (unsigned int)v5 + 1;
    }
    sub_a36abc(15, v2, 0);
    return 0;
}

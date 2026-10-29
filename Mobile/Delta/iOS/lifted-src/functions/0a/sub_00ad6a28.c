/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad6a28..0xad6ae4 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad6a28_0 {
    int field_0;
    char padding_4[4];
    struct st_ad6a28_1 *field_8;
} st_ad6a28_0;

typedef struct st_ad6a28_1 {
    unsigned long long field_0;
} st_ad6a28_1;


unsigned long long sub_ad6a28(st_ad6a28_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v3;  // x2
    long long v4;  // x1
    unsigned long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0)
    {
        if (!(a1 >> 31 & 1) && a0->field_0 > (int)a1)
        {
            *(unsigned long long *)&a0->field_8[a1 & 0xffffffff] = a2;
            a0[1].field_0 = 0;
            return *(long long *)&a0->field_8[a1 & 0xffffffff];
        }
        sub_a368c8();
        sub_a369bc("crypto/stack/stack.c", 471, "OPENSSL_sk_set");
        v0 = a1;
        v3 = "i=%d";
        v4 = 524550;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/stack/stack.c", 467, "OPENSSL_sk_set");
        v4 = 786690;
        v3 = 0;
    }
    sub_a36abc(15, v4, v3);
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ccbb8..0x9ccc7c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ccbb8_0 {
    struct st_9ccbb8_0 *field_0;
} st_9ccbb8_0;


unsigned long long sub_9ccbb8(unsigned long a0, st_9ccbb8_0 **a1, long long a2, long long a3)
{
    unsigned long long v4;  // x0
    st_9ccbb8_0 **v5;  // x0
    st_9ccbb8_0 **v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = a0;
    if (a1 && !*a1)
    {
        v4 = sub_9ccc84(&v1, 0);
        if ((int)v4 < 1)
            return v4;
        v5 = sub_a6bf4c(v4 & 0xffffffff, "crypto/asn1/tasn_enc.c", 65);
        if (!v5)
            return 0xffffffff;
        v0 = v5;
        sub_9ccc84(&v1, &v0, a2, 0xffffffff, a3);
        *a1 = v5;
        return v4;
    }
    return sub_9ccc84(&v1);
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d792c..0x9d7a2c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d792c_1 {
    char padding_0[64];
    struct st_9d792c_0 *field_40;
} st_9d792c_1;

typedef struct st_9d792c_0 {
    char padding_0[80];
    long long field_50;
} st_9d792c_0;


unsigned long long sub_9d792c(st_9d792c_1 *a0, long long a1, unsigned long long a2)
{
    long long v2;  // x1
    unsigned long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram_pair.c", 0x500, "dgram_pair_write");
        v2 = 125;
    }
    else if (!sub_a7c198(a0->field_40->field_50))
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram_pair.c", 0x505, "dgram_pair_write");
        v2 = 786704;
    }
    else
    {
        v3 = sub_c65f2c(a0, a1, a2 & 0xffffffff, 0, 0, 0);
        if ((long long)v3 < 0)
        {
            sub_a368c8();
            sub_a369bc("crypto/bio/bss_dgram_pair.c", 1291, "dgram_pair_write");
            sub_a36abc(32, -(unsigned int)v3, 0);
            v3 = 0xffffffff;
        }
        sub_a7c1b4(a0->field_40->field_50);
        return v3;
    }
    sub_a36abc(32, v2, 0);
    return 0xffffffff;
}

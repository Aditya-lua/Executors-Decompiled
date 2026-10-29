/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d7a2c..0x9d7b54 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d7a2c_1 {
    char padding_0[64];
    struct st_9d7a2c_0 *field_40;
} st_9d7a2c_1;

typedef struct st_9d7a2c_0 {
    char padding_0[80];
    long long field_50;
} st_9d7a2c_0;


unsigned long long sub_9d7a2c(st_9d7a2c_1 *a0, long long *a1, unsigned long a2, unsigned long long a3, unsigned long a4, unsigned long long *a5)
{
    st_9d7a2c_0 *v2;  // x24
    unsigned long long v3;  // x25
    unsigned long long *iter;  // x23
    unsigned long long v5;  // x0
    unsigned long long v6;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a3)
    {
        *a5 = 0;
        return 1;
    }
    v2 = a0->field_40;
    if (!sub_a7c198(v2->field_50))
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram_pair.c", 1317, "dgram_pair_sendmmsg");
        sub_a36abc(32, 0xc0110, 0);
        *a5 = 0;
        return 0;
    }
    v3 = 0;
    iter = a1 + 2;
    while (1)
    {
        v5 = sub_c65f2c(a0, *(long long *)((char *)iter - 16), *(long long *)((char *)iter - 8), iter[1], *iter, 1);
        if ((long long)v5 < 0)
            break;
        iter[2] = 0;
        v3 += 1;
        iter = (char *)iter + a2;
        if (a3 == v3)
        {
            *a5 = a3;
            goto LABEL_9d7aa4;
        }
    }
    *a5 = v3;
    if (v3)
    {
LABEL_9d7aa4:
        v6 = 1;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bio/bss_dgram_pair.c", 1331, "dgram_pair_sendmmsg");
        sub_a36abc(32, -(unsigned int)v5, 0);
        v6 = 0;
    }
    sub_a7c1b4(v2->field_50);
    return v6;
}

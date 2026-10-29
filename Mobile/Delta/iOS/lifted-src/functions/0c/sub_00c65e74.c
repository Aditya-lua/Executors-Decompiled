/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc65e74..0xc65f2c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c65e74_0 {
    struct st_c65e74_0 *field_0;
    long long field_8;
    char padding_10[24];
    struct st_c65e74_0 *field_28;
    char padding_30[16];
    struct st_c65e74_0 *field_40;
    long long field_48;
    long long field_50;
} st_c65e74_0;


int sub_c65e74(st_c65e74_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_c65e74_0 *v12;  // x19
    st_c65e74_0 *v13;  // x21
    st_c65e74_0 *v14;  // x22
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        v12 = a0->field_40;
        if (v12)
        {
            sub_9d810c(v12->field_8, "crypto/bio/bss_dgram_pair.c");
            memset(&v12->field_8, 0, 24);
            *(unsigned int *)&a0->field_28 = 0;
            sub_9d34a4(v12->field_48);
            v13 = v12->field_0;
            if (v13)
            {
                v14 = v13->field_40;
                if (v14->field_0 == a0)
                {
                    sub_9d810c(v14->field_8, "crypto/bio/bss_dgram_pair.c");
                    memset(&v14->field_8, 0, 24);
                    *(unsigned int *)&v13->field_28 = 0;
                    v12->field_0 = 0;
                    v14->field_0 = 0;
                }
            }
            sub_a7c1d0(v12->field_50);
            sub_a6c2e4(v12, "crypto/bio/bss_dgram_pair.c", 334);
            a0 = 1;
        }
        else
        {
            a0 = 0;
        }
    }
    return (unsigned int)a0;
}

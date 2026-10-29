/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d802c..0x9d80e4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d802c_0 {
    char padding_0[8];
    struct st_9d802c_0 *field_8;
    long long field_10;
    char field_18;
    char padding_19[23];
    uint128_t field_30;
    char padding_40[16];
    struct st_9d802c_0 *field_50;
    char field_58;
} st_9d802c_0;


int sub_9d802c(st_9d802c_0 **a0)
{
    st_9d802c_0 *v2;  // x0
    st_9d802c_0 *v3;  // x20
    st_9d802c_0 *v4;  // x0
    st_9d802c_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(96, "crypto/bio/bss_dgram_pair.c", 279);
    if (v2)
    {
        v3 = v2;
        v2->field_30 = 0x5c00000000000003ba0;
        v4 = sub_a7c11c();
        v3->field_50 = v4;
        if (v4)
        {
            a0[8] = v3;
            v5 = sub_a6bf4c(0x3ba0, "crypto/bio/bss_dgram_pair.c", 37);
            v3->field_8 = v5;
            if (v5)
            {
                v3->field_10 = 15264;
                memset(&v3->field_18, 0, 24);
                v3->field_58 = v3->field_58 | 8;
                v2 = 1;
                *(unsigned int *)&a0[5] = 1;
            }
            else
            {
                sub_c66768(a0);
LABEL_9d80c8:
                v2 = 0;
            }
        }
        else
        {
            sub_a6c2e4(v3, "crypto/bio/bss_dgram_pair.c", 290);
            goto LABEL_9d80c8;
        }
    }
    return (unsigned int)v2;
}

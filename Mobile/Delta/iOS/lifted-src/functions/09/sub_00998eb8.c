/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998eb8..0x998fb4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998eb8_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
    char padding_20[12];
    unsigned int field_2c;
} st_998eb8_0;


long long sub_998eb8(long long a0, char *a1, long long a2, unsigned long a3, long long a4, st_998eb8_0 *a5, unsigned long long *a6)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    long long v21;  // x22
    char *v22;  // x23
    unsigned long long *iter;  // x25
    long long v24;  // x22
    char *v25;  // x23
    unsigned long v26;  // x1
    long long v27;  // x24
    long long v28;  // x20
    unsigned long long v13;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    long long v20;  // x21
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a2)
        return 1;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a4;
    v21 = a2;
    v22 = a1;
    iter = &a5->field_18;
    while (1)
    {
        v24 = v21;
        v25 = v22 + 24;
        *(unsigned int *)((char *)&iter[2] + 4) = *v22;
        v26 = *(long long *)((char *)iter - 24);
        v27 = v26 & 7 ^ 3;
        *iter = v27;
        if (sub_c68800(v20, v26, *(long long *)((char *)iter - 8), 0))
        {
            *a6 = *a6 + 1;
            if (sub_a6e830(v20, v27, 0))
            {
                iter += 6;
                v20 += 56;
                v21 = v24 - 1;
                v22 = v25;
                if (v24 == 1)
                    return 1;
            }
            else
            {
                v28 = 1605;
                break;
            }
        }
        else
        {
            v28 = 1600;
            break;
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/record/methods/tls_common.c", v28, "tls_initialise_write_packets_default");
    sub_996e84(a0, 80, 0xc0103, 0);
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7dca0..0xa7de4c (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7dca0_1 {
    char padding_0[8];
    struct st_a7dca0_0 *field_8;
    char padding_10[16];
    char field_20;
    char padding_21[127];
    unsigned long long field_a0;
    char padding_a8[24];
    unsigned long long field_c0;
    unsigned long long field_c8;
} st_a7dca0_1;

typedef struct st_a7dca0_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_a7dca0_0;


long long sub_a7dca0(st_a7dca0_1 *a0)
{
    unsigned long v7;  // x22
    unsigned long v8;  // x21
    unsigned int v17;  // w11
    unsigned int v18;  // w13
    unsigned int v19;  // w9
    unsigned long v9;  // x0
    unsigned long v10;  // x20
    unsigned long i;  // x23
    unsigned long v12;  // x24
    unsigned long v13;  // x8
    unsigned long j;  // x8
    unsigned int *v15;  // x9
    unsigned int v16;  // w10
    char v0;  // [bp-0x88]
    unsigned long v1;  // [bp-0x50]
    char *v2;  // [bp-0x48]
    char *v3;  // [bp-0x48]
    char *v4;  // [bp-0x48]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = 0;
    v7 = a0->field_c8;
    v8 = a0->field_8->field_48;
    v9 = sub_a6bf4c(v8, "crypto/ml_dsa/ml_dsa_encoders.c", 629);
    if (!v9)
        return v9;
    v10 = v9;
    if (sub_c68800(&v0, v10, v8, 0) && sub_a6ebd4(&v0, &a0->field_20, 32))
    {
        if (v7)
        {
            i = 0;
            v12 = a0->field_c0 + 8;
            do
            {
                if (!sub_a6e830(&v0, 320, &v2))
                {
                    sub_a6eaf8(&v0);
                    sub_a6c2e4(v10, "crypto/ml_dsa/ml_dsa_encoders.c", 650);
                    return 0;
                }
                v13 = 0;
                do
                {
                    j = v13;
                    v15 = v12 + j;
                    v16 = *(int *)((char *)v15 - 8);
                    v17 = *(int *)((char *)v15 - 4);
                    v18 = *v15;
                    v19 = v15[1];
                    v3 = v2 + 1;
                    *v2 = v16;
                    v2 = v3 + 1;
                    *v3 = (char)v17 * 4 | (char)(v16 >> 8);
                    v3 = v2 + 1;
                    *v2 = (char)v18 * 16 | (char)(v17 >> 6);
                    v4 = v3 + 1;
                    *v3 = (char)v19 * 64 | (char)(v18 >> 4);
                    v2 = v4 + 1;
                    *v4 = v19 >> 2;
                    v13 = j + 16;
                } while (j < 1008);
                i += 1;
                v12 += 0x400;
            } while (i != v7);
        }
        if (sub_c68eb8(&v0, &v1) && v1 == v8)
        {
            sub_a6c2e4(a0->field_a0, "crypto/ml_dsa/ml_dsa_encoders.c", 644);
            a0->field_a0 = v10;
            sub_a6eaf8(&v0);
            return 1;
        }
    }
    sub_a6eaf8(&v0);
    sub_a6c2e4(v10, "crypto/ml_dsa/ml_dsa_encoders.c", 650);
    return 0;
}

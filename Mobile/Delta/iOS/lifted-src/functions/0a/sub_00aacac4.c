/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaacac4..0xaacb8c (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aacac4_0 {
    char padding_0[8];
    struct st_aacac4_1 *field_8;
} st_aacac4_0;

typedef struct st_aacac4_1 {
    unsigned int field_0;
} st_aacac4_1;


unsigned long long sub_aacac4(st_aacac4_0 *a0, long long a1)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x20
    char v0;  // [bp-0x38]
    char v1;  // [bp-0x2c]
    char v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_afbf08(0, &v2, &v1, &v0, a1);
    if ((unsigned int)v5)
    {
        v5 = sub_aadf5c(0, &v2, v1);
        if (v5)
        {
            v6 = v5;
            if (sub_aaf0d0())
            {
                sub_ab1ca0(v6, 0xf000);
                if (*(int *)a0->field_8 != 6 && *(int *)a0->field_8 != 912)
                    goto LABEL_aacb50;
                sub_ab1cbc(v6);
LABEL_aacb50:
                if (!sub_a5ab14(a0, *(int *)a0->field_8, v6))
                    goto LABEL_aacb70;
                v5 = 1;
            }
            else
            {
LABEL_aacb70:
                sub_ab1360(v6);
                v5 = 0;
            }
        }
    }
    return (unsigned int)v5;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bc104..0x1bc1cc (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bc104_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_1bc104_0;

typedef struct st_1bc104_1 {
    unsigned long long field_0;
} st_1bc104_1;

typedef struct st_1bc104_2 {
    struct st_1bc104_3 *field_0;
} st_1bc104_2;

typedef struct st_1bc104_3 {
    struct st_1bc104_2 *field_0;
} st_1bc104_3;


unsigned long long * sub_1bc104(st_1bc104_0 *a0, st_1bc104_1 **a1, long long a2)
{
    unsigned long long v6;  // x8
    unsigned long long *v7;  // x20
    unsigned long v8;  // x0
    unsigned long long v9;  // x0
    long long v10;  // x0
    unsigned long long *v11;  // x0
    st_1bc104_3 **v0;  // [bp-0x70]
    st_1bc104_3 **v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *(long long *)&a0->padding_0[8];
    v7 = &a0->padding_0[8];
    if (*(long long *)&a0->padding_0[8])
    {
        while (1)
        {
            v7 = v6;
            v8 = sub_a0c8(a2);
            v9 = sub_6b08(a2);
            v10 = sub_a0c8(v7 + 4);
            v0 = &v1;
            v1 = &v0;
            v2 = v8;
            v3 = v9;
            if (sub_2a304(&v2, v10, sub_6b08(v7 + 4)) >> 31 & 1)
            {
                v6 = *v7;
                v11 = v7;
                if (!*v11)
                    break;
            }
            else
            {
                v6 = v7[1];
                if (!v7[1])
                {
                    v11 = v7 + 1;
                    break;
                }
            }
        }
    }
    else
    {
        v11 = v7;
    }
    *a1 = v7;
    return v11;
}

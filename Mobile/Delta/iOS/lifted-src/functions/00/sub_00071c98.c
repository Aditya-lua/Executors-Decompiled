/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x71c98..0x71db4 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_71c98_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_71c98_0;

typedef struct st_71c98_1 {
    struct st_71c98_2 *field_0;
} st_71c98_1;

typedef struct st_71c98_2 {
    struct st_71c98_1 *field_0;
} st_71c98_2;


unsigned long long * sub_71c98(st_71c98_0 *a0, unsigned long long *a1, long long a2)
{
    unsigned long v6;  // x8
    unsigned long long *v7;  // x20
    unsigned long v8;  // x25
    unsigned long v9;  // x0
    unsigned long long v10;  // x0
    long long v11;  // x0
    unsigned long v12;  // x0
    unsigned long long v13;  // x0
    long long v14;  // x0
    unsigned long v15;  // x20
    st_71c98_2 **v0;  // [bp-0x80]
    st_71c98_2 **v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0->field_8;
    v7 = &a0->field_8;
    if (a0->field_8)
    {
        while (1)
        {
            v8 = v6;
            v9 = sub_a0c8(a2);
            v10 = sub_6b08(a2);
            v11 = sub_a0c8(v8 + 32);
            v0 = &v1;
            v1 = &v0;
            v2 = v9;
            v3 = v10;
            if (sub_2a304(&v2, v11, sub_6b08(v8 + 32)) >> 31 & 1)
            {
                v6 = *(long long *)v8;
                v7 = v8;
                if (!*(long long *)v8)
                    break;
            }
            else
            {
                v12 = sub_a0c8(v8 + 32);
                v13 = sub_6b08(v8 + 32);
                v14 = sub_a0c8(a2);
                v0 = &v1;
                v1 = &v0;
                v2 = v12;
                v3 = v13;
                if (!(sub_2a304(&v2, v14, sub_6b08(a2)) >> 31 & 1) || !(v15 = v8, v6 = *(long long *)(v15 + 8), v7 = v15 + 8, *(long long *)(v15 + 8)))
                    break;
            }
        }
    }
    else
    {
        v8 = v7;
    }
    *a1 = v8;
    return v7;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa4dc0..0xaa4e98 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa4dc0_0 {
    char padding_0[208];
    char field_d0;
    char padding_d1[15];
    unsigned long long field_e0;
    struct st_aa4dc0_1 *field_e8;
} st_aa4dc0_0;

typedef struct st_aa4dc0_2 {
    char padding_0[16];
    unsigned long long field_10;
    struct st_aa4dc0_1 *field_18;
} st_aa4dc0_2;

typedef struct st_aa4dc0_1 {
    unsigned long long field_0;
} st_aa4dc0_1;


st_aa4dc0_0 * sub_aa4dc0(st_aa4dc0_0 *a0, long long ptr, long long a2)
{
    unsigned long v2;  // x25
    long long n;  // x21
    st_aa4dc0_2 *v4;  // x22
    st_aa4dc0_0 *dst;  // x0
    unsigned long v6;  // x21
    st_aa4dc0_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_e0;
    if (v2)
    {
        n = 16 - v2;
        v4 = &a0->field_d0;
        if ((unsigned long long)n <= (unsigned long long)a2)
        {
            _memcpy(&v4->padding_0[v2], ptr, n);
            a0->field_e8();
        }
        dst = _memcpy(&v4->padding_0[v2], ptr);
        v6 = v2 + a2;
    }
    else
    {
        v6 = a2 & 15;
        if ((unsigned long long)a2 >= 16)
            a0->field_e8();
        dst = a0;
        if (v6)
            dst = _memcpy(&a0->field_d0, ptr, v6);
    }
    v7 = dst;
    a0->field_e0 = v6;
    return v7;
}

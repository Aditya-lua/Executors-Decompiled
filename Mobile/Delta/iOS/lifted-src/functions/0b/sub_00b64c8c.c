/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb64c8c..0xb64f30 (676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b64c8c_1 {
    char padding_0[56];
    struct st_b64c8c_0 *field_38;
    struct st_b64c8c_2 *field_40;
} st_b64c8c_1;

typedef struct st_b64c8c_2 {
    unsigned long long field_0;
} st_b64c8c_2;

typedef struct st_b64c8c_0 {
    char padding_0[56];
    unsigned int field_38;
    long long field_3c;
    long long field_40;
    long long field_44;
    long long field_48;
} st_b64c8c_0;


long long sub_b64c8c(st_b64c8c_1 *a0, unsigned long a1, long long a2)
{
    long long v0;  // [bp-0x3c]
    st_b64c8c_0 *v1;  // [bp-0x38]
    long long v2;  // [bp-0x2c]
    long long v3;  // [bp-0x14]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v2 = a2;
    v1 = a0->field_38;
    if (!v1->field_40)
        a0->field_40();
    if (!(&v1->field_38)[1])
    {
        (&v1->field_38)[1] = 1 << ((char)v1->field_38 & 31);
        *(unsigned int *)((char *)&v1->field_3c + 4) = 0;
        *(unsigned int *)&v1->field_3c = 0;
    }
    if ((&v1->field_38)[1] <= v2)
    {
        ___memcpy_chk(v1->field_40, a1 - (&v1->field_38)[1], (&v1->field_38)[1], -0x1);
        *(unsigned int *)((char *)&v1->field_3c + 4) = 0;
        *(unsigned int *)&v1->field_3c = (&v1->field_38)[1];
        v3 = 0;
        return v3;
    }
    v0 = (&v1->field_38)[1] - *(int *)((char *)&v1->field_3c + 4);
    if (v2 < v0)
        v0 = v2;
    ___memcpy_chk(v1->field_40 + *(int *)((char *)&v1->field_3c + 4), a1 - v2, v0, -0x1);
    v2 -= v0;
    if (v2)
    {
        ___memcpy_chk(v1->field_40, a1 - v2, v2, -0x1);
        *(int *)((char *)&v1->field_3c + 4) = v2;
        *(unsigned int *)&v1->field_3c = (&v1->field_38)[1];
    }
    else
    {
        *(int *)((char *)&v1->field_3c + 4) = *(int *)((char *)&v1->field_3c + 4) + v0;
        if (*(int *)((char *)&v1->field_3c + 4) == (&v1->field_38)[1])
            *(unsigned int *)((char *)&v1->field_3c + 4) = 0;
        if ((unsigned int)v1->field_3c < (&v1->field_38)[1])
            *(int *)&v1->field_3c = (int)v1->field_3c + v0;
    }
    v3 = 0;
    return v3;
}

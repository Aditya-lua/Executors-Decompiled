/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c12b0..0x9c13d0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c12b0_0 {
    struct st_9c12b0_0 *field_0;
    unsigned int field_4;
    long long field_8;
} st_9c12b0_0;


st_9c12b0_0 * sub_9c12b0(st_9c12b0_0 *a0, long long *a1, long long a2)
{
    st_9c12b0_0 *v3;  // x0
    st_9c12b0_0 *v4;  // x20
    st_9c12b0_0 *v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c13d0(0, 0, *a1, a2);
    if (!v3)
        return 0;
    if (!a0 || (v4 = a0->field_0, !v4))
    {
        v4 = sub_9cf11c();
        if (!v4)
            return v4;
        *(unsigned int *)((char *)&v4->field_0 + 4) = 2;
    }
    if (sub_9c7770(v4, 0, v3))
    {
        sub_9c13d0(*(long long *)&v4->field_4, &v0, *a1, a2);
        *(unsigned int *)((char *)&v4->field_0 + 4) = *(int *)((char *)&v4->field_0 + 4) & 0xfffffe00 | (*(int *)((char *)&v4->field_0 + 4) & 0xfffffeff | ((v0 != 0) * 0x100 | (char)(v0 != 0) >> 24) & 0x100) & 0x1ff;
        *a1 = *a1 + a2;
        if (!a0)
            return v4;
        a0->field_0 = v4;
        return v4;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/a_int.c", 311, "ossl_c2i_ASN1_INTEGER");
        sub_a36abc(13, 0x8000d, 0);
        if (!a0 || a0->field_0 != v4)
            sub_9cf124(v4);
    }
    return 0;
}

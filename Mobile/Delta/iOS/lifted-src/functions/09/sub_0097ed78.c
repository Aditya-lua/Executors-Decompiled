/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ed78..0x97eeb8 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ed78_2 {
    char padding_0[112];
    struct st_97ed78_1 *field_70;
    struct st_97ed78_1 *field_78;
} st_97ed78_2;

typedef struct st_97ed78_1 {
    char padding_0[120];
    struct st_97ed78_0 *field_78;
    struct st_97ed78_2 *field_80;
    char padding_88[32];
    unsigned int field_a8;
    char padding_ac[4];
    unsigned long long field_b0;
    struct st_97ed78_1 *field_b8;
} st_97ed78_1;

typedef struct st_97ed78_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[312];
    unsigned long long field_148;
    char padding_150[8];
    unsigned int field_158;
    char padding_15c[4];
    unsigned long long field_160;
} st_97ed78_0;


st_97ed78_1 * sub_97ed78(st_97ed78_0 *a0, st_97ed78_1 **a1)
{
    st_97ed78_1 **v2;  // x20
    st_97ed78_1 *v3;  // x19
    unsigned long long v4;  // x8
    long long v5;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = sub_a6bffc(192, "ssl/quic/quic_impl.c", 2220);
    if (v3 && sub_c61f30(v3, a0->field_8, 129, a0, 0, 0) && sub_95efac(a0))
    {
        v3->field_a8 = a0->field_158;
        v4 = a0->field_160;
        v3->field_b0 = v4 & 3725568391;
        *(unsigned int *)&v3->field_b8 = 0;
        v3->field_78 = a0;
        v3->field_80 = v2;
        a0->field_148 = a0->field_148 + 1;
        v5 = __ROL__((unsigned int)v4, 31) & 0x80000001 & 1;
        if (v2[15])
        {
            sub_986440(v2[15], v5);
            v2 = v3->field_80;
        }
        if (!v2[14])
            return v3;
        sub_989124(v2[14], v5);
        return v3;
    }
    sub_97c738();
    sub_a6c2e4(v3, "ssl/quic/quic_impl.c", 2250);
    return 0;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3aee0..0x3b024 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3aee0_4 {
    char padding_0[8];
    long long field_8;
    char field_10;
    char field_11;
} st_3aee0_4;

typedef struct st_3aee0_2 {
    long long field_0;
    char padding_8[216];
    char field_e0;
    char padding_e1[1647];
    struct st_3aee0_3 *field_750;
    struct st_3aee0_3 *field_758;
    char padding_760[8];
    unsigned int field_768;
} st_3aee0_2;

typedef struct st_3aee0_1 {
    long long field_0;
} st_3aee0_1;

typedef struct st_3aee0_3 {
    struct st_3aee0_1 *field_0;
} st_3aee0_3;

typedef struct st_3aee0_0 {
    char field_0;
} st_3aee0_0;


st_3aee0_2 * sub_3aee0(st_3aee0_2 *a0)
{
    st_3aee0_1 **v8;  // x24
    st_3aee0_1 **i;  // x20
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // w26
    unsigned long long v19;  // x0
    st_3aee0_4 *v20;  // x21
    long long len;  // x0
    st_3aee0_2 *v22;  // x0
    st_3aee0_2 *v23;  // x0
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    st_3aee0_0 **v0;  // [bp-0x180], Other Possible Types: char
    st_3aee0_0 *v1;  // [bp-0x178]
    char v2;  // [bp-0x170]
    char v3;  // [bp-0xf0]
    unsigned long long v4;  // [bp-0x70]
    char v5;  // [bp-0x6c], Other Possible Types: unsigned long long
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v4 = 0;
    v5 = 0;
    v8 = a0->field_758;
    i = a0->field_750;
    if (v8 - i <= 248)
    {
        v10 = arm64g_calculate_condition(v16 | 144, v17, v12, v13);
        v11 = arm64g_calculate_condition(20, (v10 & 1 ? i : 0x40000000), (v10 & 1 ? v8 : 0), 0);
        if (!(v11 & 1))
            return a0;
    }
    else
    {
        v14 = arm64g_calculate_condition(v16 | 144, v17, v12, v13);
        v15 = arm64g_calculate_condition(16, (v14 & 1 ? i : 0x40000000), (v14 & 1 ? v8 : 0), 0);
        if (!(v15 & 1))
            return a0;
    }
    v18 = 0;
    do
    {
        v19 = sub_34930(&a0->field_e0, i);
        if (!v19)
            sub_45808(*i + 1, "Local does not have corresponding variable");
        v20 = v19;
        len = _strlen(*(long long *)*i);
        v22 = sub_2df40(a0->field_0, *(long long *)*i, len);
        if (v22 >> 31 & 1)
            return v22;
        *(unsigned int *)&(&v2)[4 * v18] = (unsigned int)v22;
        *(unsigned int *)&(&v3)[4 * v18] = 0xffffffff;
        if (v20->field_11 == 1 && !(v20->field_10 & 1))
        {
            v22 = sub_45e80(a0, v20->field_8);
            if (v22 >> 31 & 1)
                return v22;
            *(unsigned int *)&(&v3)[4 * v18] = (unsigned int)v22;
            v5 = 1;
        }
        v18 = v4 + 1;
        v4 = v18;
        i += 1;
    } while (i != v8);
    if (v18)
    {
        v23 = sub_30898(a0->field_0, &v2);
        a0->field_768 = (unsigned int)v23;
        return v23;
    }
    return v22;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9e50..0xb9f30 (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9e50_0 {
    char field_0;
} st_b9e50_0;

typedef struct st_b9e50_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_b9e50_1;


double sub_b9e50(void* a0, unsigned int a1, unsigned int a2)
{
    st_b9e50_1 *v4;  // x8
    unsigned long long v5;  // x9
    unsigned int v14;  // w8
    unsigned int v15;  // w12
    unsigned int v16;  // w13
    unsigned long long v17;  // d0
    unsigned long long v6;  // x11
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned int v9;  // w9
    unsigned long long v10;  // 4108
    unsigned long long v11;  // 4108
    unsigned int v12;  // w10
    unsigned int v13;  // w11
    st_b9e50_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_b9e50_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[24] && (unsigned long long)(long long)a0[24] > (unsigned long long)(long long)a0[8])
    {
        v4 = *(long long *)a0 + 12 * (long long)a0[8];
        v5 = v4->field_4;
        v6 = (long long)a0[16];
        v7 = v6;
        v8 = v5;
        if (v6 < v5)
        {
            v9 = v5 - v6;
            v10 = arm64g_calculate_condition(52, v7, v8, 0);
            if (!(v10 & 1))
                goto LABEL_b9eaa;
LABEL_b9ea9:
            v12 = v4->field_8;
        }
        else
        {
            v9 = 0;
            v11 = arm64g_calculate_condition(52, v7, v8, 0);
            if (v11 & 1)
                goto LABEL_b9ea9;
LABEL_b9eaa:
            v12 = v4->field_8 + v5 - v6;
        }
        if (a2 <= v9)
        {
            *(unsigned long *)&a0[40] = 0xffffffffffffffff;
            sub_b6ab0();
            return 0xffffffffffffffff;
        }
        v13 = a2 + a1;
        v14 = v4->field_0;
        v15 = v9 + a1;
        v16 = v15 + v12;
        *(unsigned int *)&a0[40] = v15;
        *(unsigned int *)&a0[44] = v16;
        *(unsigned int *)&a0[48] = v14;
        if (v16 <= v13)
        {
            sub_b6ab0();
            return v17;
        }
        *(unsigned int *)&a0[44] = v13;
        sub_b6ab0();
        return v17;
    }
    *(unsigned long *)&a0[40] = 0xffffffffffffffff;
    return 0xffffffffffffffff;
}

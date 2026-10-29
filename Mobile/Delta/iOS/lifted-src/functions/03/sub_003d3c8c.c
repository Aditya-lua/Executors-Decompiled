/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3c8c..0x3d3f44 (696 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3c8c_1 {
    struct st_3d3c8c_0 *field_0;
    char padding_8[16];
    long long field_18;
} st_3d3c8c_1;

typedef struct st_3d3c8c_2 {
    char field_0;
} st_3d3c8c_2;

typedef struct st_3d3c8c_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
} st_3d3c8c_0;

typedef struct st_3d3c8c_4 {
    unsigned long long field_0;
} st_3d3c8c_4;

typedef struct st_3d3c8c_3 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_3d3c8c_3;

extern unsigned int g_d0d90c[4];
extern st_3d3c8c_3 g_d0d928;
extern st_3d3c8c_3 g_d0d944;
extern st_3d3c8c_3 g_d0d960;
extern st_3d3c8c_4 *g_f0b120;

unsigned long long sub_3d3c8c(st_3d3c8c_1 *a0, unsigned long long a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned int a5, unsigned long long a6)
{
    st_3d3c8c_1 *v16;  // x28
    unsigned long long v17;  // x23
    unsigned long long v26;  // x20
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // cc_ndep
    unsigned long long v32;  // 4112
    unsigned long long v33;  // x11
    unsigned long long v34;  // 4106
    unsigned long long node;  // x12
    unsigned long long v35;  // 4112
    unsigned long long v36;  // 4106
    unsigned long long i;  // x20
    unsigned long n;  // x27
    unsigned long v38;  // x8
    unsigned long long v39;  // x10
    unsigned long v40;  // x24
    unsigned long long v41;  // x25
    unsigned long long j;  // x26
    long long iter;  // x19
    st_3d3c8c_0 *v20;  // x8
    unsigned int v44;  // w19
    unsigned long v21;  // x19
    unsigned long long v22;  // x9
    unsigned long v23;  // x25
    unsigned long long v24;  // x10
    unsigned long long v25;  // x28
    unsigned long long v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xb8]
    unsigned long long v2;  // [bp-0xb0]
    unsigned int v3;  // [bp-0xac]
    unsigned int v4;  // [bp-0xa4]
    st_3d3c8c_1 *v5;  // [bp-0xa0]
    unsigned int v6;  // [bp-0x98]
    unsigned int v7;  // [bp-0x94]
    unsigned long long v8;  // [bp-0x90]
    unsigned long long v9;  // [bp-0x88]
    unsigned int v10;  // [bp-0x7c]
    unsigned long long v11;  // [bp-0x78]
    st_3d3c8c_2 **v12;  // [bp-0x70], Other Possible Types: char
    st_3d3c8c_2 *v13;  // [bp-0x68]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a0;
    v13 = &v12;
    v12 = &v13;
    if (!a6)
        return sub_3cc13c(v16);
    v17 = a3 << (a4 == 16);
    v1 = sub_3d6ef0(a0->field_0->field_0, a0->field_0->field_4, v17, 0);
    if (!v1)
        g_f0b120();
    node = 0;
    v0 = v17;
    n = (int)v17;
    v2 = 7;
    v3 = a3;
    v4 = a5;
    v5 = v16;
    while (1)
    {
        v20 = v16->field_0;
        v21 = (&g_d0d944.field_0)[node];
        v22 = v20->field_0 + ~g_d0d90c[node] + v21;
        if ((unsigned int)v22 >= (unsigned int)v21 && !(v23 = (&g_d0d960.field_0)[node], v24 = v20->field_4 + ~(&g_d0d928.field_0)[node] + v23, (unsigned int)v24 < (unsigned int)v23))
            break;
LABEL_3d3d8c:
        node += 1;
        if (node == 7)
        {
            v16->field_18 = v1;
            return 1;
        }
    }
    v10 = (&g_d0d928.field_0)[node];
    v8 = node;
    v9 = a1;
    v25 = v22 / v21;
    v7 = v20->field_8;
    v26 = v24 / v23;
    if (!sub_3cc13c(v16))
    {
        _free(v1);
        return 0;
    }
    v6 = a2;
    if (1 <= (int)v26)
    {
        v32 = arm64g_calculate_condition(v28 | 160, v29, v30, v31);
        v33 = v26;
        v34 = arm64g_calculate_condition(179, (v32 & 1 ? v25 & 0xffffffff : 0x80000000), v32 & 1, 0);
        if (!(v34 & 1))
            goto LABEL_3d3e3c;
    }
    else
    {
        v35 = arm64g_calculate_condition(v28 | 160, v29, v30, v31);
        v33 = v26;
        v36 = arm64g_calculate_condition(176, (v35 & 1 ? v25 & 0xffffffff : 0x80000000), v35 & 1, 0);
        if (!(v36 & 1))
        {
LABEL_3d3e3c:
            i = 0;
            v38 = v5->field_0->field_0;
            v39 = v0;
            v11 = v1 + (unsigned int)n * g_d0d90c[node];
            v40 = v38 * v10 * v39;
            v10 = (unsigned int)v38 * (unsigned int)v23 * (unsigned int)v39;
            do
            {
                v41 = v33;
                j = 0;
                iter = v11 + (v40 & 0xffffffff);
                do
                {
                    _memcpy(iter, v5->field_18 + n * (j + v25 * i), n);
                    j += 1;
                    iter += (unsigned int)n * (unsigned int)v21;
                } while (j < v25);
                i += 1;
                v40 += v10;
                v33 = v41;
            } while (i < v41);
        }
    }
    v44 = (unsigned int)v33 + ((long long)(v2 + v7 * a4 * (unsigned int)v25) >> 3) * (unsigned int)v33;
    v16 = v5;
    _free(v16->field_18);
    a1 = v9 + v44;
    a2 = v6 - v44;
    node = v8;
    goto LABEL_3d3d8c;
}

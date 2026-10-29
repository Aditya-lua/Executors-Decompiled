/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d27f8..0x3d2db8 (1472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d27f8_1 {
    unsigned int field_0;
} st_3d27f8_1;

typedef struct st_3d27f8_0 {
    char field_0;
} st_3d27f8_0;

typedef struct st_3d27f8_2 {
    unsigned long long field_0;
} st_3d27f8_2;

extern unsigned long long g_e7d968;
extern unsigned long long g_e7d970;
extern unsigned long long g_e7e8d8;
extern st_3d27f8_2 *g_f0b120;

unsigned int * sub_3d27f8(long long a0, void* a1, unsigned long a2, unsigned long a3, unsigned int *a4)
{
    unsigned int v7;  // w9
    unsigned int *v8;  // x8
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4109
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep1
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned int *v22;  // x9
    unsigned int *v23;  // x9
    st_3d27f8_1 **v24;  // x0
    unsigned long v25;  // x1
    unsigned long v26;  // x8
    unsigned int *v27;  // x21
    unsigned long v28;  // x22
    unsigned int v29;  // w24
    long long v30;  // x21
    unsigned int *ptr;  // x22
    unsigned int *ptr1;  // x23
    unsigned long v33;  // x25
    st_3d27f8_1 **ptr2;  // x0
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v9;  // 4110
    st_3d27f8_1 **v39;  // x24
    unsigned int v40;  // w0
    unsigned long long v41;  // x8
    unsigned long long v10;  // 4109
    unsigned long v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x90]
    unsigned long v2;  // [bp-0x88]
    st_3d27f8_0 **v3;  // [bp-0x80], Other Possible Types: char
    st_3d27f8_0 *v4;  // [bp-0x78]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = &v3;
    v3 = &v4;
    if ((long long)a1[8])
    {
        v7 = ((int)a1[48] * 0x40000000 | (unsigned int)((int)a1[48]) >> 2) & 0xc0000007 & 7;
        v8 = *(int *)a1 * (int)a1[4];
        if (v7 == 3)
        {
            v9 = arm64g_calculate_condition(v15, v16, v11, v12);
            v10 = arm64g_calculate_condition(4, (v9 & 1 ? a4 : 0), 0, 0);
            if (!(v10 & 1))
                goto LABEL_3d2856;
LABEL_3d2855:
            v7 = 2;
        }
        else
        {
            v13 = arm64g_calculate_condition(v15, v16, v11, v12);
            v14 = arm64g_calculate_condition(0, (v13 & 1 ? a4 : 0), 0, 0);
            if (v14 & 1)
                goto LABEL_3d2855;
LABEL_3d2856:
        }
        v17 = v7;
        if (v7 != 3)
        {
            if (v7 == 2)
            {
                v18 = arm64g_calculate_condition(3, v17, 3, 0);
                v19 = arm64g_calculate_condition(179, (v18 & 1 ? v8 & 0xffffffff : 0x80000000), v18 & 1, 0);
                if (!(v19 & 1))
                    goto LABEL_3d286c;
            }
            else
            {
                v20 = arm64g_calculate_condition(3, v17, 3, 0);
                v21 = arm64g_calculate_condition(176, (v20 & 1 ? v8 & 0xffffffff : 0x80000000), v20 & 1, 0);
                if (!(v21 & 1))
                {
LABEL_3d286c:
                    v22 = 0;
                    do
                    {
                        if (*(a1[24] + (char *)v22))
                            *(int *)((long long)a1[8] + v22 * 4) = *(int *)((long long)a1[16] + v22 * 4);
                    } while ((v22 = (char *)v22 + 1, v8 != v22));
                }
            }
        }
        else
        {
            if ((int)(unsigned int)v8 >= 1)
            {
                v23 = 0;
                do
                {
                    if (*(a1[24] + (char *)v23))
                        *(int *)((long long)a1[8] + v23 * 4) = *(int *)((char *)a4 + 0x4 * v23);
                } while ((v23 = (char *)v23 + 1, v8 != v23));
            }
        }
        _memcpy((long long)a1[16], (long long)a1[8], *(int *)a1 * (int)a1[4] * 4);
        v24 = (long long)a1[24];
        v25 = (int)a1[4] * *(int *)a1;
        v26 = g_e7d970;
        goto LABEL_3d2984;
    }
    else
    {
        if (!sub_3d12cc(a0, a1))
            return 0;
        v27 = *(int *)a1;
        v28 = (int)a1[4];
        if (!sub_3cfce4(4, v27, v28, 0))
        {
LABEL_3d2cbc:
            g_f0b120();
        }
        v29 = (unsigned int)v27 * (unsigned int)v28;
        v30 = v29 * 4;
        ptr = _malloc(v30);
        *(unsigned int **)&a1[8] = ptr;
        ptr1 = _malloc(v30);
        *(unsigned int **)&a1[16] = ptr1;
        v33 = v29;
        ptr2 = _malloc(v33);
        *(st_3d27f8_1 ***)&a1[24] = ptr2;
        if (ptr)
        {
            if (ptr1)
            {
                v35 = arm64g_calculate_condition(v15 | 16, v16, v11, v12);
                v36 = arm64g_calculate_condition(20, (v35 & 1 ? ptr2 : 0x40000000), 0, 0);
                if (v36 & 1)
                    goto LABEL_3d2d7c;
            }
            else
            {
                v37 = arm64g_calculate_condition(v15 | 16, v16, v11, v12);
                v38 = arm64g_calculate_condition(16, (v37 & 1 ? ptr2 : 0x40000000), 0, 0);
                if (v38 & 1)
                {
LABEL_3d2d7c:
                    v39 = ptr2;
                    _bzero(ptr, v30);
                    _bzero(ptr1, v30);
                    _bzero(v39, v33);
                    v24 = v39;
                    v25 = v33;
                    v26 = g_e7d968;
LABEL_3d2984:
                    v1 = v26;
                    _bzero(v24, v25);
                    v2 = a1 + 52;
                    v0 = a1 + 1076;
                    v40 = sub_3d706c(a0);
                    if (v40 == 44)
                        v41 = 304;
                    else
                        v41 = 56;
                    if (v40 == 33)
                        v41 = 312;
                    if (v40 == 59)
                        v41 = 192;
                    goto *((void *)(*(long long *)((char *)&g_e7e8d8 + v41)));
                }
            }
        }
        goto LABEL_3d2cbc;
    }
}

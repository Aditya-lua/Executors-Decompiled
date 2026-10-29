/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacd30..0xacfd0 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_acd30_2 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_acd30_2;

typedef struct st_acd30_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned long long field_1c;
    char padding_24[92];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
} st_acd30_1;

typedef struct st_acd30_0 {
    char field_0;
} st_acd30_0;

extern unsigned long long g_e6c2c8;
extern unsigned long long g_e6c2d8;

void sub_acd30(st_acd30_1 *a0, unsigned int a1, char *a2, unsigned long long a3, unsigned long long a4, unsigned int a5)
{
    unsigned long v16;  // x27
    unsigned int v17;  // w8
    unsigned int v26;  // w11
    unsigned long long v27;  // x20
    unsigned long v28;  // x25
    unsigned long v29;  // x8
    char *v30;  // x26
    unsigned long long v31;  // x8
    char *v32;  // x10
    unsigned long long v33;  // x9
    unsigned long v18;  // x9
    unsigned long v19;  // x11
    unsigned long v20;  // x14
    unsigned long long v21;  // w10
    char *v22;  // x11
    unsigned long long v23;  // 4117
    st_acd30_2 *v24;  // x11
    unsigned long long v25;  // w19
    unsigned int v0;  // [bp-0xcc]
    unsigned long v1;  // [bp-0xc8]
    char *v2;  // [bp-0xc0]
    unsigned long v3;  // [bp-0xb8]
    unsigned int v4;  // [bp-0xb0]
    char *v5;  // [bp-0xa8], Other Possible Types: unsigned int *, unsigned long long
    char *v6;  // [bp-0xa0], Other Possible Types: st_acd30_2 *, unsigned long long
    unsigned long long v7;  // [bp-0x94]
    unsigned long v8;  // [bp-0x90]
    unsigned long v9;  // [bp-0x88]
    unsigned long long v10;  // [bp-0x80]
    st_acd30_0 **v11;  // [bp-0x78], Other Possible Types: char
    st_acd30_0 *v12;  // [bp-0x70]
    char v13;  // [bp-0x64]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v12 = &v11;
    v11 = &v12;
    v16 = *(long long *)&a0->padding_24[88];
    v17 = 0xffffffff << ((char)(*(int *)&a0->padding_88[116] - 1) & 31);
    v18 = a0->field_8;
    v19 = a0->field_10;
    v20 = a0->field_18;
    v21 = (&a0->field_18)[1];
    v9 = a0->field_8;
    if (a1 < (unsigned int)v20)
        v18 = v19;
    v3 = v19;
    v22 = v19 + v20;
    v2 = v22;
    v23 = arm64g_calculate_condition(131, v20 & 0xffffffff, a1, 0);
    if (v23 & 1)
        a2 = v22;
    v24 = v16 + (a1 & ~v17) * 2 * 4;
    v6 = v24;
    v25 = (int)v24->field_0;
    v5 = (char *)&v24->field_0 + 4;
    v26 = 1 << ((char)*(int *)&a0->padding_88[112] & 31);
    if (v26 < a1 - (&a0->field_18)[1])
        v21 = a1 - v26;
    if (a3 && v25 > v21)
    {
        v7 = v21;
        v10 = 0;
        v4 = ~v17;
        v27 = v18 + a1;
        v8 = v20;
        v1 = v16;
        v0 = a1;
        if (0 < v10)
            v10 = 0;
        v28 = v25;
        if (a5 == 1)
        {
            v29 = v10 + v28;
            if (a1 >= (unsigned int)v20 && v20 > v29)
            {
                v30 = v3 + v28;
                v31 = sub_84f30(v27 + v10, &v30[v10], a2, v2, v9 + v20) + v10;
                if (v31 + v28 >= v8)
                    v30 = v9 + v28;
                v32 = v27 + v31;
                v16 = v1;
                if (v32 == a2)
                    goto *((void *)(g_e6c2c8));
            }
            else
            {
                if (v29 < v20)
                    v9 = v3;
LABEL_acf18:
                v30 = v9 + v28;
                v31 = sub_7cdfc(v27 + v10, &v30[v10], a2) + v10;
                v32 = v27 + v31;
                if (v32 == a2)
                    goto *((void *)(g_e6c2c8));
            }
            v33 = v16 + (v25 & v4) * 2 * 4;
            if (*v32 > v30[v31])
            {
                *(unsigned int *)&v6->field_0 = v25;
                if (v25 > a4)
                {
                    v6 = v33 + 4;
                }
                else
                {
                    v6 = &v13;
                    goto *((void *)(g_e6c2c8));
                }
            }
            else
            {
                *v5 = v25;
                if (v25 > a4)
                {
                    v10 = v31;
                    v5 = v33;
                }
                else
                {
                    v5 = &v13;
                    v10 = v31;
                    goto *((void *)(g_e6c2c8));
                }
            }
            goto *((void *)(g_e6c2d8));
        }
        else
        {
            goto LABEL_acf18;
        }
    }
    *v5 = 0;
    *(unsigned int *)&v6->field_0 = 0;
    return;
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc2b994..0xc2bb54 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c2b994_2 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c2b994_2;

typedef struct st_c2b994_0 {
    char padding_0[8];
    struct st_c2b994_1 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c2b994_0;

typedef struct st_c2b994_1 {
    unsigned int field_0;
} st_c2b994_1;

extern unsigned long long g_bef1c8;
extern long long g_cb9f36;
extern long long g_efc830;

void sub_c2b994(unsigned long long *a0, unsigned int a1, unsigned long long *a2, st_c2b994_0 *a3, st_c2b994_0 *a4, unsigned long long *a5)
{
    unsigned long v10;  // x25
    unsigned long v11;  // x8
    unsigned long long idx;  // x11
    unsigned int v13;  // w9
    unsigned int v14;  // w12
    st_c2b994_2 *v15;  // x8
    unsigned long long i;  // x28
    unsigned int *v17;  // x8
    unsigned long v18;  // x1
    unsigned long long v19;  // x8
    unsigned int v0;  // [bp-0x9c]
    unsigned long long index;  // [bp-0x98]
    unsigned long v2;  // [bp-0x90]
    unsigned long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x78]
    unsigned long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a1;
    v3 = v10;
    v11 = &a3->field_18;
    if (a3->field_18 > v10)
    {
        idx = v10 >> 5;
        v13 = *(int *)&a3->field_8[idx];
        v14 = 1 << ((char)a1 & 31);
        *(unsigned int *)&a3->field_8[idx] = v13 | v14;
        if (v13 & v14)
            return;
        *a5 = *a5 + 1;
        index = idx;
        v2 = *a2;
        v0 = v14;
        if (a0[2] <= v10 || (v15 = a0[1] + v10 * 32, v15->field_0 == 0x8000000000000000))
            i = 0xffffffff;
        else
            i = v15->field_18;
        while (a0[5] > i)
        {
            v17 = a0[4] + 48 * i;
            i = v17[8];
            v18 = v17[11];
            v19 = v18 >> 5;
            if (a3->field_10 <= v19 || !((unsigned int)(*(int *)&a3->field_8[v19]) >> ((char)v18 & 31) & 1))
            {
                sub_c2b994(a0, v18, a2, a3, a4, a5);
            }
            else if (a4->field_10 <= v19 || !((unsigned int)(*(int *)&a4->field_8[v19]) >> ((char)v18 & 31) & 1))
            {
                sub_baf968(v2);
            }
        }
        v3 = v10;
        v11 = &a4->field_18;
        if (a4->field_18 > v10)
        {
            *(unsigned int *)&a4->field_8[index] = *(int *)&a4->field_8[index] | v0;
            *a5 = *a5 + 1;
            return;
        }
    }
    v4 = &v3;
    v5 = &g_bef1c8;
    v6 = v11;
    v7 = &g_bef1c8;
    sub_c73b38(&g_cb9f36, &v4, &g_efc830);
}

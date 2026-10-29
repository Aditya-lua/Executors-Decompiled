/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98fc0..0x99298 (728 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98fc0_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[216];
    struct st_98fc0_1 *field_f8;
} st_98fc0_3;

typedef struct st_98fc0_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[80];
    struct st_98fc0_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_98fc0_1;

typedef struct st_98fc0_2 {
    unsigned int field_0;
} st_98fc0_2;

typedef struct st_98fc0_0 {
    char field_0;
} st_98fc0_0;

extern unsigned long long g_e6c390;
extern unsigned long long g_e6c428;

unsigned long long sub_98fc0(st_98fc0_3 *a0, void* a1, unsigned long a2, void* a3, unsigned long long a4, unsigned long long a5, int a6)
{
    st_98fc0_1 *v16;  // x8
    unsigned long v17;  // x10
    unsigned long long v26;  // x8
    char *v27;  // x9
    unsigned int v28;  // w10
    unsigned int v29;  // w12
    unsigned int v30;  // w12
    unsigned int v31;  // w13
    unsigned int v32;  // w13
    unsigned long long v18;  // x11
    unsigned long long idx;  // x9
    unsigned long long v20;  // x10
    unsigned int v21;  // w13
    unsigned int v22;  // w11
    unsigned int v23;  // w25
    unsigned long v24;  // x9
    unsigned long v25;  // x19
    unsigned int v0;  // [bp-0xd4]
    unsigned long v1;  // [bp-0xd0]
    unsigned int v2;  // [bp-0xc0]
    unsigned int v3;  // [bp-0xbc]
    unsigned long long v4;  // [bp-0xb8]
    unsigned long long v5;  // [bp-0xb0]
    unsigned long v6;  // [bp-0xa8]
    unsigned long v7;  // [bp-0xa0]
    unsigned long v8;  // [bp-0x98]
    unsigned int v9;  // [bp-0x8c]
    unsigned long v10;  // [bp-0x88]
    unsigned long v11;  // [bp-0x80]
    st_98fc0_0 **v12;  // [bp-0x70], Other Possible Types: char
    st_98fc0_0 *v13;  // [bp-0x68]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = &v12;
    v12 = &v13;
    v16 = a0->field_f8;
    if (6 >= a6)
    {
        if (a6 != 5)
        {
            if (a6 != 6)
                goto LABEL_99050;
            v17 = *(long long *)a1;
            v18 = 0xbf9b0000;
        }
        else
        {
            v17 = *(long long *)a1;
            v18 = 0xbb000000;
        }
    }
    else
    {
        if (a6 == 7)
        {
            v17 = *(long long *)a1;
            v18 = 0xbfa56300;
        }
        else if (a6 == 8)
        {
            v17 = *(long long *)a1;
            v18 = 3081069667;
        }
        else
        {
LABEL_99050:
            idx = 2654435761 * *(int *)a1 >> ((char)-v16->field_108 & 31);
            goto LABEL_99098;
        }
    }
    idx = ((v18 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464) * v17 >> ((char)-v16->field_108 & 63);
LABEL_99098:
    v10 = v16->field_0;
    v11 = v16->field_8;
    v20 = v16->field_0 - v16->field_8;
    v21 = v16->field_1c;
    v9 = ~(0xffffffff << ((char)(v16->field_104 - 1) & 31));
    if (v9 < (unsigned int)(v20 - v21))
        v22 = v20 - v9;
    else
        v22 = v21;
    v2 = v22;
    if (!a5)
        return a4;
    v23 = *(int *)&v16->field_70[idx];
    if (v23 <= v21)
        return a4;
    v3 = v21;
    v24 = a0->field_8;
    v6 = a0->field_18;
    v7 = v16->field_80;
    v0 = (unsigned int)(a1 - v24);
    v8 = v24;
    v1 = a0->field_1c - v20;
    v4 = v24 + v1;
    v5 = v20 & 0xffffffff;
    v25 = v23;
    v26 = sub_84f30();
    if (v26 + v25 < v5)
        v27 = v11 + v25;
    else
        v27 = v4 + v25;
    if (v26 > a4)
    {
        v28 = v0 - (v1 + v23);
        v29 = v28 + 1;
        if (!(v29 * 0x100000000))
            v30 = 32;
        else
            v30 = Clz(v29 * 0x100000000);
        v31 = *(int *)a3 + 1;
        if (!(v31 * 0x100000000))
            v32 = 32;
        else
            v32 = Clz(v31 * 0x100000000);
        if ((int)((unsigned int)(v26 - a4) * 4) > (int)(v32 - v30))
            *(unsigned long long *)a3 = v28 + 3;
        if (a1 + v26 == a2)
            goto *((void *)(g_e6c390));
    }
    if (*((char *)a1 + v26) > v27[v26])
    {
        if (v23 <= v2)
            goto *((void *)(g_e6c390));
    }
    else
    {
        if (v23 <= v2)
            goto *((void *)(g_e6c390));
    }
    goto *((void *)(g_e6c428));
}

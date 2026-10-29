/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb46a80..0xb46cc4 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b46a80_0 {
    struct st_b46a80_0 *field_0;
    unsigned long long field_8;
    struct st_b46a80_0 *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned int field_70;
    char padding_74[28];
    unsigned long long field_90;
    char padding_98[8];
    uint128_t field_a0;
    unsigned long long field_b0;
    unsigned int field_b8;
    char padding_bc[20];
    unsigned int field_d0;
} st_b46a80_0;


st_b46a80_0 * sub_b46a80(unsigned long a0, unsigned long a1, st_b46a80_0 *a2, unsigned long long *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    st_b46a80_0 *v2;  // x20
    st_b46a80_0 *v3;  // w8
    unsigned long iter;  // x9
    st_b46a80_0 *v13;  // w10
    unsigned long node;  // x9
    st_b46a80_0 *v15;  // w10
    unsigned long iter1;  // x9
    unsigned long iter2;  // x9
    st_b46a80_0 *v5;  // w10
    unsigned long v6;  // x9
    st_b46a80_0 *v7;  // w10
    unsigned long v8;  // x9
    st_b46a80_0 *v9;  // w10
    unsigned long v10;  // x9
    st_b46a80_0 *v11;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0], Other Possible Types: unsigned long

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(288, "providers/implementations/rands/drbg.c", 800);
    if (!v2)
        return v2;
    v2->field_8 = a0;
    v2->field_10 = a5;
    v2->field_18 = a6;
    v2->field_20 = a7;
    v2->field_28 = v1;
    v2->field_70 = sub_a7c2bc();
    v2->field_30 = a1;
    if (a2)
    {
        v3 = (st_b46a80_0 *)(int)a2->field_0;
        if (v3)
        {
            iter2 = &a2->field_10;
            v5 = v3;
            do
            {
                if (v5 == 8)
                {
                    v2->field_38 = *(long long *)(iter2 - 8);
                    break;
                }
            } while ((v5 = (st_b46a80_0 *)*(int *)iter2, iter2 += 16, v5));
            v6 = &a2->field_10;
            v7 = v3;
            do
            {
                if (v7 == 9)
                {
                    v2->field_40 = *(long long *)(v6 - 8);
                    break;
                }
            } while ((v7 = (st_b46a80_0 *)*(int *)v6, v6 += 16, v7));
            v8 = &a2->field_10;
            v9 = v3;
            do
            {
                if (v9 == 10)
                {
                    v2->field_48 = *(long long *)(v8 - 8);
                    break;
                }
            } while ((v9 = (st_b46a80_0 *)*(int *)v8, v8 += 16, v9));
            v10 = &a2->field_10;
            v11 = v3;
            do
            {
                if (v11 == 15)
                {
                    v2->field_50 = *(long long *)(v10 - 8);
                    break;
                }
            } while ((v11 = (st_b46a80_0 *)*(int *)v10, v10 += 16, v11));
            iter = &a2->field_10;
            v13 = v3;
            do
            {
                if (v13 == 7)
                {
                    v2->field_58 = *(long long *)(iter - 8);
                    break;
                }
            } while ((v13 = (st_b46a80_0 *)*(int *)iter, iter += 16, v13));
            node = &a2->field_10;
            v15 = v3;
            do
            {
                if (v15 == 18)
                {
                    v2->field_60 = *(long long *)(node - 8);
                    break;
                }
            } while ((v15 = (st_b46a80_0 *)*(int *)node, node += 16, v15));
            iter1 = &a2->field_10;
            do
            {
                if (v3 == 19)
                {
                    v2->field_68 = *(long long *)(iter1 - 8);
                    break;
                }
            } while ((v3 = (st_b46a80_0 *)*(int *)iter1, iter1 += 16, v3));
        }
    }
    v2->field_90 = 0x7fffffff;
    v2->field_a0 = CONCAT(0x7fffffff, 0x7fffffff);
    v2->field_b0 = 0x7fffffff;
    v2->field_b8 = 1;
    /* unsupported instruction */;
    v2->field_d0 = 1;
    *(unsigned int *)&v2->padding_bc[0] = 0x100;
    *(unsigned long long *)&v2->padding_bc[12] = 3600;
    a3();
}

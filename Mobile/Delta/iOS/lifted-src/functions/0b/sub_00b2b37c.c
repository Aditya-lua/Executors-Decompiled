/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2b37c..0xb2b8e8 (1388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2b37c_0 {
    unsigned long long field_0;
    char field_1;
    char padding_2[6];
    unsigned int field_8;
    char padding_c[4];
    struct st_b2b37c_0 *field_10;
    struct st_b2b37c_0 *field_18;
    struct st_b2b37c_0 *field_20;
    unsigned int field_28;
    char padding_2c[4];
    struct st_b2b37c_0 *field_30;
    struct st_b2b37c_0 *field_38;
    struct st_b2b37c_0 *field_40;
    unsigned int field_48;
    unsigned int field_4c;
    unsigned int field_50;
    struct st_b2b37c_0 *field_54;
    unsigned int field_5c;
    struct st_b2b37c_0 *field_60;
    struct st_b2b37c_0 *field_64;
    struct st_b2b37c_0 *field_68;
    char padding_70[4];
    unsigned int field_74;
    char padding_78[4];
    unsigned int field_7c;
    char padding_80[8];
    long long field_88;
} st_b2b37c_0;

extern char g_10002b0;

st_b2b37c_0 * sub_b2b37c(st_b2b37c_0 *a0)
{
    unsigned long long v11;  // x0
    st_b2b37c_0 *v12;  // x0
    st_b2b37c_0 *v21;  // x20
    st_b2b37c_0 *v22;  // x20
    uint128_t *v23;  // x22
    st_b2b37c_0 *v24;  // x9
    st_b2b37c_0 *v25;  // x10
    st_b2b37c_0 *i;  // x8
    uint128_t *iter;  // x8
    long long j;  // x9
    uint128_t *iter1;  // x10
    long long v30;  // x9
    st_b2b37c_0 *v13;  // x0
    uint128_t v31;  // q1
    st_b2b37c_0 *v33;  // x9
    unsigned long v34;  // x10
    st_b2b37c_0 *k;  // x8
    uint128_t *node;  // x8
    long long l;  // x9
    uint128_t *iter2;  // x10
    long long v39;  // x9
    uint128_t v40;  // q1
    unsigned int v14;  // w25
    st_b2b37c_0 *v15;  // w27
    unsigned int v16;  // w26
    unsigned int v17;  // w24
    unsigned int v18;  // w23
    st_b2b37c_0 *v19;  // w22
    st_b2b37c_0 *v20;  // w21
    st_b2b37c_0 *v0;  // [bp-0x4b4], Other Possible Types: long long, unsigned int
    char v1;  // [bp-0x4b0]
    st_b2b37c_0 *v2;  // [bp-0x470], Other Possible Types: char
    char v3;  // [bp-0x46c]
    char v4;  // [bp-0x46b]
    char v5;  // [bp-0x46a]
    char v6;  // [bp-0x469]
    uint512_t v7;  // [bp-0x468]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    if (a0)
    {
        v11 = *(int *)((char *)&a0->field_60 + 4) * 0x400;
        if (*(int *)((char *)&a0->field_54 + 4))
        {
            v12 = sub_a6ce80(v11, "providers/implementations/kdfs/argon2.c", 731);
            *(st_b2b37c_0 **)&a0->field_5c = v12;
            if (!v12)
                goto LABEL_b2b878;
LABEL_b2b3dc:
            v14 = a0->field_48;
            v15 = (st_b2b37c_0 *)a0->field_4c;
            v16 = *(int *)&a0->field_1;
            v17 = *(int *)((char *)&a0->field_40 + 4);
            v18 = (&a0->field_50)[1];
            v19 = (st_b2b37c_0 *)*(int *)((char *)&a0->field_54 + 4);
            v20 = (st_b2b37c_0 *)(int)a0->field_10;
            v21 = sub_a3f728();
            if (v21 && sub_a3fe04(v21, *(long long *)a0->padding_70, 0) == 1)
            {
                v0 = (st_b2b37c_0 *)0;
                *(char *)&v7 = (char)v15;
                *((char *)&v7 + 1) = v15 >> 8;
                *((char *)&v7 + 2) = v15 >> 16;
                *((char *)&v7 + 3) = v15 >> 24;
                if (sub_a3fe10(v21, &v7, 4) == 1)
                {
                    v0 = (st_b2b37c_0 *)1;
                    *(char *)&v7 = v16;
                    *((char *)&v7 + 1) = v16 >> 8;
                    *((char *)&v7 + 2) = v16 >> 16;
                    *((char *)&v7 + 3) = v16 >> 24;
                    if (sub_a3fe10(v21, &v7, 4) == 1)
                    {
                        v0 = 2;
                        *(char *)&v7 = v14;
                        *((char *)&v7 + 1) = v14 >> 8;
                        *((char *)&v7 + 2) = v14 >> 16;
                        *((char *)&v7 + 3) = v14 >> 24;
                        if (sub_a3fe10(v21, &v7, 4) == 1)
                        {
                            v0 = 3;
                            *(char *)&v7 = v17;
                            *((char *)&v7 + 1) = v17 >> 8;
                            *((char *)&v7 + 2) = v17 >> 16;
                            *((char *)&v7 + 3) = v17 >> 24;
                            if (sub_a3fe10(v21, &v7, 4) == 1)
                            {
                                v0 = 4;
                                *(char *)&v7 = v18;
                                *((char *)&v7 + 1) = v18 >> 8;
                                *((char *)&v7 + 2) = v18 >> 16;
                                *((char *)&v7 + 3) = v18 >> 24;
                                if (sub_a3fe10(v21, &v7, 4) == 1)
                                {
                                    v0 = 5;
                                    *(char *)&v7 = (char)v19;
                                    *((char *)&v7 + 1) = v19 >> 8;
                                    *((char *)&v7 + 2) = v19 >> 16;
                                    *((char *)&v7 + 3) = v19 >> 24;
                                    if (sub_a3fe10(v21, &v7, 4) == 1)
                                    {
                                        v0 = 6;
                                        *(char *)&v7 = (char)v20;
                                        *((char *)&v7 + 1) = v20 >> 8;
                                        *((char *)&v7 + 2) = v20 >> 16;
                                        *((char *)&v7 + 3) = v20 >> 24;
                                        if (sub_a3fe10(v21, &v7, 4) == 1)
                                        {
                                            v0 = 7;
                                            if (*(long long *)&a0->field_8)
                                            {
                                                if (sub_a3fe10(v21) != 1)
                                                    goto LABEL_b2b6d8;
                                                if ((int)a0->field_54)
                                                {
                                                    sub_a66ec0(*(long long *)&a0->field_8, (int)a0->field_10);
                                                    *(unsigned int *)&a0->field_10 = 0;
                                                }
                                            }
                                            *(int *)&v7 = (int)a0->field_20;
                                            if (sub_a3fe10(v21, &v7, 4) == 1 && (!a0->field_18 || sub_a3fe10(v21) == 1))
                                            {
                                                *(int *)&v7 = (int)a0->field_30;
                                                if (sub_a3fe10(v21, &v7, 4) == 1)
                                                {
                                                    if (*(long long *)&a0->field_28)
                                                    {
                                                        if (sub_a3fe10(v21) != 1)
                                                            goto LABEL_b2b6d8;
                                                        if ((int)a0->field_54)
                                                        {
                                                            sub_a66ec0(*(long long *)&a0->field_28, (int)a0->field_30);
                                                            *(unsigned int *)&a0->field_30 = 0;
                                                        }
                                                    }
                                                    *(int *)&v7 = (int)a0->field_40;
                                                    if (sub_a3fe10(v21, &v7, 4) == 1 && (!a0->field_38 || sub_a3fe10(v21) == 1))
                                                    {
                                                        v0 = 64;
                                                        sub_a3ff7c(v21, &v1, &v0);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
LABEL_b2b6d8:
            sub_a3f73c(v21);
            sub_a66ec0(&v2, 8);
            if (a0->field_4c)
            {
                v22 = 0;
                v23 = (char *)&v7 + 16;
                do
                {
                    v2 = (st_b2b37c_0 *)0;
                    v3 = (char)v22;
                    v4 = (unsigned int)v22 >> 8;
                    v5 = (unsigned int)v22 >> 16;
                    v6 = (unsigned int)v22 >> 24;
                    sub_b2bdc8(*(long long *)a0->padding_70, &v7, 0x400, &v1, 72);
                    v24 = *(long long *)&a0->field_5c;
                    v25 = v22 * *(int *)((char *)&a0->field_64 + 4);
                    if (32 > v24 - &v7 + v25 * 0x400)
                    {
                        i = 0;
                        do
                        {
                            *(long long *)((char *)v24 + 0x400 * v25 + i) = *(long long *)(&v7 + i);
                            i = &i->field_1;
                        } while (i != 0x400);
                    }
                    else
                    {
                        iter = (char *)v24 + 0x400 * v25 + 16;
                        j = 128;
                        iter1 = v23;
                        do
                        {
                            v30 = j;
                            v31 = *iter1;
                            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter1 - 16);
                            *iter = v31;
                            iter1 += 2;
                            iter += 2;
                            j = v30 - 4;
                        } while (j);
                    }
                    v2 = (st_b2b37c_0 *)1;
                    sub_b2bdc8(*(long long *)a0->padding_70, &v7, 0x400, &v1, 72);
                    v33 = *(long long *)&a0->field_5c;
                    v34 = 1 + (unsigned int)v22 * *(int *)((char *)&a0->field_64 + 4);
                    if (32 > v33 - &v7 + v34 * 0x400)
                    {
                        k = 0;
                        do
                        {
                            *(long long *)((char *)v33 + 0x400 * v34 + k) = *(long long *)(&v7 + k);
                            k = &k->field_1;
                        } while (k != 0x400);
                    }
                    else
                    {
                        node = (char *)v33 + 0x400 * v34 + 16;
                        l = 128;
                        iter2 = v23;
                        do
                        {
                            v39 = l;
                            v40 = *iter2;
                            *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)iter2 - 16);
                            *node = v40;
                            iter2 += 2;
                            node += 2;
                            l = v39 - 4;
                        } while (l);
                    }
                    v22 = (unsigned int)v22 + 1;
                } while (a0->field_4c > (unsigned int)v22);
            }
            sub_a66ec0(&v7, 0x400);
            sub_a66ec0(&v1, 72);
            a0 = 1;
        }
        else
        {
            v13 = sub_a6bffc(v11, "providers/implementations/kdfs/argon2.c", 733);
            *(st_b2b37c_0 **)&a0->field_5c = v13;
            if (v13)
                goto LABEL_b2b3dc;
LABEL_b2b878:
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/argon2.c", 736, "initialize");
            sub_a36abc(57, 235, "cannot allocate required memory");
            a0 = 0;
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return (unsigned int)a0;
    ___stack_chk_fail();
}

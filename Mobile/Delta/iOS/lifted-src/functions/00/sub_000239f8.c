/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x239f8..0x23c78 (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_239f8_3 {
    char padding_0[96];
    char field_60;
    char padding_61[31];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[4];
    struct st_239f8_1 *field_98;
} st_239f8_3;

typedef struct st_239f8_4 {
    long long field_0;
    char padding_8[8];
    struct st_239f8_1 *field_10;
} st_239f8_4;

typedef struct st_239f8_1 {
    struct st_239f8_2 *field_0;
    char field_1;
    char padding_2[14];
    struct st_239f8_1 *field_10;
} st_239f8_1;

typedef struct st_239f8_2 {
    struct st_239f8_1 *field_0;
} st_239f8_2;

typedef struct st_239f8_0 {
    char field_0;
} st_239f8_0;


st_239f8_1 * sub_239f8(st_239f8_3 *a0, st_239f8_4 *a1, st_239f8_4 *a2, st_239f8_1 *a3, st_239f8_1 *a4)
{
    st_239f8_1 *v10;  // x8
    st_239f8_1 *i;  // x9
    st_239f8_1 *j;  // x8
    st_239f8_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_239f8_0 *v1;  // [bp-0x98]
    st_239f8_1 *v2;  // [bp-0x90]
    st_239f8_1 *v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x88]
    st_239f8_1 *v5;  // [bp-0x78], Other Possible Types: char
    st_239f8_2 **v6;  // [bp-0x70], Other Possible Types: st_239f8_1 *, unsigned long
    st_239f8_2 **v7;  // [bp-0x68], Other Possible Types: st_239f8_1 **
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    while (1)
    {
        if (sub_19920(&a0->field_60))
            return sub_223d4(a0);
        if (a0->field_80 == 281 && !(sub_b1a4(&a0->field_60), (unsigned int)v2 != 58))
        {
            v10 = a1->field_10;
            if (v10 > a2->field_10)
            {
                do
                {
                    v3 = (st_239f8_1 *)0;
                    v5 = (st_239f8_1 *)0;
                    v6 = &v7;
                    v7 = &v6;
                    sub_22564(a2->field_0, &v3);
                    i = (char *)&a2->field_10->field_0 + 1;
                    a2->field_10 = i;
                    v10 = a1->field_10;
                } while (i < v10);
            }
            if (a4 && v10 > (unsigned long long)*(long long *)&a4->padding_2[7])
            {
                do
                {
                    v6 = 0xffffffffffffffff;
                    v7 = &v2;
                    v2 = &v7;
                    sub_f2b8(a4->field_0, &v6);
                    j = *(long long *)&a4->padding_2[7] + 1;
                    *(st_239f8_1 **)&a4->padding_2[7] = j;
                } while (j < a1->field_10);
            }
            v4 = *(int128_t *)&(&a0->field_80)[1];
            v2 = *(long long *)((char *)&a0->field_84 + 8);
            v5 = 1;
            v6 = &v7;
            v7 = &v6;
            sub_22564(a2->field_0, &v2);
            a2->field_10 = (char *)&a2->field_10->field_0 + 1;
            sub_f8d0(a0);
            if (a4)
            {
                v2 = &v7;
                v7 = &v2;
                sub_f2b8(a4->field_0, &(&a0->field_80)[1]);
                *(long long *)&a4->padding_2[7] = *(long long *)&a4->padding_2[7] + 1;
            }
            sub_1f3d4(a0, 58, 0);
        }
        else if (a2->field_10)
        {
            v2 = (st_239f8_1 *)0;
            v5 = (st_239f8_1 *)0;
            v6 = &v7;
            v7 = &v6;
            sub_22564(a2->field_0, &v2);
            a2->field_10 = (char *)&a2->field_10->field_0 + 1;
            if (a4)
            {
                v6 = 0xffffffffffffffff;
                v7 = &v2;
                v2 = &v7;
                sub_f2b8(a4->field_0, &v6);
                *(long long *)&a4->padding_2[7] = *(long long *)&a4->padding_2[7] + 1;
            }
        }
        v6 = sub_12740(a0, 0);
        v7 = &v2;
        v2 = &v7;
        sub_103a8(a1->field_0, &v6);
        a1->field_10 = (char *)&a1->field_10->field_0 + 1;
        if (a0->field_80 != 44)
            break;
        if (a3)
        {
            v2 = &v7;
            v7 = &v2;
            sub_f2b8(a3->field_0, &(&a0->field_80)[1]);
            *(long long *)&a3->padding_2[7] = *(long long *)&a3->padding_2[7] + 1;
        }
        sub_f8d0(a0);
        if (a0->field_80 == 41)
        {
            sub_1db64(a0, &(&a0->field_80)[1], "Expected type after ',' but got ')' instead");
            break;
        }
    }
    return 0;
}

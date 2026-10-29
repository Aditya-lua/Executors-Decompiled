/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x199b8..0x19df4 (1084 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_199b8_2 {
    unsigned long long field_0;
    struct st_199b8_3 *field_8;
} st_199b8_2;

typedef struct st_199b8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_199b8_1;

typedef struct st_199b8_5 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_199b8_5;

typedef struct st_199b8_4 {
    char field_0;
    char padding_1[3];
    uint128_t field_4;
    char padding_14[4];
    unsigned long long field_18;
} st_199b8_4;

typedef struct st_199b8_3 {
    struct st_199b8_1 *field_0;
} st_199b8_3;

typedef struct st_199b8_0 {
    char field_0;
} st_199b8_0;


long long sub_199b8(void* a0, st_199b8_5 *a1, unsigned long a2, unsigned long long a3, unsigned long long a4, unsigned long long *a5, long long a6)
{
    void* v10;  // x27
    unsigned long long *v11;  // x28
    st_199b8_4 *v18;  // x8
    void* v12;  // x25
    unsigned long long v13;  // x22
    st_199b8_2 *v14;  // x8
    st_199b8_4 *v15;  // x9
    st_199b8_2 *v16;  // x8
    unsigned long long idx;  // x8
    st_199b8_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_199b8_0 *v1;  // [bp-0xc8]
    st_199b8_3 **v2;  // [bp-0xc0]
    st_199b8_1 *v3;  // [bp-0x88]
    long long v4;  // [bp-0x80]
    unsigned long long iter;  // [bp-0x78]
    st_199b8_3 **v6;  // [bp-0x70]
    st_199b8_3 **v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v3 = a0 + 1088;
    v4 = (long long)a0[1096] - (long long)a0[1088] >> 3;
    iter = 0;
    if (a3 && a4)
    {
        v2 = &v7;
        v7 = &v2;
        sub_f2b8();
        v10 = a0 + 128;
        iter += 1;
        v11 = &a1->field_10;
        v12 = a0 + 132;
        if (!(a2 & 1))
            goto LABEL_19af8;
LABEL_19a60:
        while (*(int *)v10 != 262)
        {
            sub_12548(a0, a6);
            v6 = &v7;
            v7 = &v6;
            sub_1da44(a1->field_0, &v2);
            *v11 = *v11 + 1;
            if (*(int *)v10 != 44)
                goto LABEL_19c04;
            v2 = &v7;
            v7 = &v2;
            sub_f2b8(v3, v12);
            iter += 1;
            sub_f8d0(a0);
        }
        goto LABEL_19c38;
    }
    v10 = a0 + 128;
    v11 = &a1->field_10;
    v12 = a0 + 132;
    if (a3)
    {
        if (a2 & 1)
            goto LABEL_19a60;
LABEL_19af8:
        while (1)
        {
            sub_12548(a0, a6);
            v6 = &v7;
            v7 = &v6;
            sub_1da44(a1->field_0, &v2);
            *v11 = *v11 + 1;
            if (*(int *)v10 != 44)
                break;
            v2 = &v7;
            v7 = &v2;
            sub_f2b8(v3, v12);
            iter += 1;
            sub_f8d0(a0);
        }
        goto LABEL_19c04;
    }
    else if (a2 & 1)
    {
        while (*(int *)v10 != 262)
        {
            sub_12548(a0, a6);
            v6 = &v7;
            v7 = &v6;
            sub_1da44(a1->field_0, &v2);
            *v11 = *v11 + 1;
            if (*(int *)v10 != 44)
                goto LABEL_19c04;
            sub_f8d0(a0);
        }
LABEL_19c38:
        v2 = (st_199b8_3 **)*(int128_t *)v12;
        sub_f8d0(a0);
        if (*(int *)v10 == 58)
        {
            if (a5)
                *a5 = *(long long *)v12;
            sub_f8d0(a0);
            v13 = sub_101e4(a0);
            if (a3)
                goto LABEL_19c90;
        }
        else
        {
            v13 = 0;
            if (a3)
            {
LABEL_19c90:
                v14 = a3;
                v14->field_0 = sub_ef54(a0, &v3);
                v14->field_8 = &v3;
            }
        }
        v15 = v18;
        v15->field_0 = 1;
        *(uint128_t *)(v15->padding_1)[1] = (uint128_t)v2;
        *(unsigned long long *)((char *)&v15->field_4 + 8) = v13;
    }
    else
    {
        while (1)
        {
            sub_12548(a0, a6);
            v6 = &v7;
            v7 = &v6;
            sub_1da44(a1->field_0, &v2);
            *v11 = *v11 + 1;
            if (*(int *)v10 != 44)
                break;
            sub_f8d0(a0);
        }
LABEL_19c04:
        if (a3)
        {
            v16 = a3;
            v16->field_0 = sub_ef54(a0, &v3);
            v16->field_8 = &v3;
        }
        idx = v18;
        *(unsigned long long *)(idx + 12) = 0;
        *(unsigned long long *)(idx + 4) = 0;
        *(char *)idx = 0;
        *(unsigned long long *)(idx + 24) = 0;
    }
    return sub_dd88(v3, v3->field_0 + v4 * 8, v3->field_8);
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53f84..0xb5412c (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53f84_1 {
    struct st_b53f84_0 *field_0;
    struct st_b53f84_0 *field_8;
    char padding_10[320];
    struct st_b53f84_0 *field_150;
    struct st_b53f84_0 *field_158;
    char padding_160[8];
    struct st_b53f84_0 *field_168;
    unsigned long long field_170;
} st_b53f84_1;

typedef struct st_b53f84_0 {
    char padding_0[8];
    struct st_b53f84_0 *field_8;
    struct st_b53f84_0 *field_10;
    char padding_18[320];
    struct st_b53f84_0 *field_158;
    struct st_b53f84_0 *field_160;
    char padding_168[8];
    struct st_b53f84_0 *field_170;
    unsigned long long field_178;
} st_b53f84_0;


st_b53f84_0 * sub_b53f84(st_b53f84_0 *ptr)
{
    st_b53f84_0 *ptr1;  // x19
    st_b53f84_0 *v3;  // x22
    st_b53f84_1 *v4;  // x22
    st_b53f84_0 *v5;  // x8
    st_b53f84_0 *v6;  // x0
    st_b53f84_0 *v7;  // x8
    st_b53f84_0 *v8;  // x8
    st_b53f84_0 *v9;  // x1
    long long n;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr1 = sub_a6bffc(384, "providers/implementations/signature/sm2_sig.c", 356);
    if (!ptr1)
        return ptr1;
    _memcpy(ptr1, ptr, 384);
    v3 = ptr1;
    v3->field_8 = 0;
    v4 = &v3->field_8;
    v4->field_168 = 0;
    v4->field_8 = 0;
    v4->field_150 = 0;
    v4->field_158 = 0;
    if (ptr->field_10)
    {
        if (!sub_a18cf0(ptr->field_10))
            goto LABEL_b54030;
        v5 = ptr->field_10;
    }
    else
    {
        v5 = 0;
    }
    ptr1->field_10 = v5;
    if (!ptr->field_8 || !(v6 = sub_a6d9b4(ptr->field_8, "providers/implementations/signature/sm2_sig.c", 372), v4->field_0 = v6, !v6))
    {
        if (!ptr->field_158)
        {
            v7 = 0;
            goto LABEL_b5403c;
        }
        else if (sub_a40a98(ptr->field_158))
        {
            v7 = ptr->field_158;
LABEL_b5403c:
            v4->field_150 = v7;
            if (ptr->field_160)
            {
                v6 = sub_a3f728();
                ptr1->field_160 = v6;
                if (v6 && (v6 = v6, sub_a40520()))
                {
                    if (!ptr->field_170)
                        return ptr1;
                    goto LABEL_b54084;
                }
            }
            else
            {
                v6 = 0;
                if (!ptr->field_170)
                    return ptr1;
LABEL_b54084:
                v8 = sub_a6bf4c(ptr->field_178, "providers/implementations/signature/sm2_sig.c", 389);
                ptr1->field_170 = v8;
                if (v8)
                {
                    v9 = ptr->field_170;
                    n = ptr->field_178;
                    ptr1->field_178 = n;
                    _memcpy(v8, v9, n);
                    return ptr1;
                }
            }
        }
        else
        {
LABEL_b54030:
            v6 = 0;
        }
    }
    sub_a3f73c(v6);
    sub_a3f52c(ptr1->field_158);
    v4->field_150 = 0;
    v4->field_158 = 0;
    sub_a18c08(ptr1->field_10);
    sub_a6c2e4(ptr1->field_8, "providers/implementations/signature/sm2_sig.c", 346);
    sub_a6c2e4(ptr1->field_170, "providers/implementations/signature/sm2_sig.c", 347);
    sub_a6c2e4(ptr1, "providers/implementations/signature/sm2_sig.c", 348);
    return 0;
}

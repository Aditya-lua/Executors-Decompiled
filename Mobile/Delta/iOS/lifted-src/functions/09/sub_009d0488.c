/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0488..0x9d079c (788 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0488_0 {
    unsigned long long field_0;
    struct st_9d0488_0 *field_8;
    struct st_9d0488_0 *field_10;
    unsigned int field_18;
    struct st_9d0488_0 *field_1c;
    struct st_9d0488_0 *field_20;
    long long field_28;
} st_9d0488_0;

extern long long g_f127a8;
extern long long g_f127b0;

st_9d0488_0 * sub_9d0488(st_9d0488_0 **a0, st_9d0488_0 *a1, unsigned int *a2, st_9d0488_0 *a3, st_9d0488_0 *a4, st_9d0488_0 *n)
{
    st_9d0488_0 *v2;  // w0
    st_9d0488_0 *v3;  // x19
    st_9d0488_0 *v12;  // x0
    st_9d0488_0 *v13;  // x0
    st_9d0488_0 *v14;  // x8
    st_9d0488_0 *v15;  // x0
    st_9d0488_0 *v4;  // w0
    st_9d0488_0 *v5;  // x0
    st_9d0488_0 *v6;  // w8
    long long v7;  // x1
    st_9d0488_0 *v8;  // x8
    unsigned long long v9;  // x0
    long long v10;  // x21
    long long v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_9d0488_0 *)(unsigned int)sub_a6afb8(0x100, 0);
    if (!v2)
        return v2;
    v3 = sub_a7bbe0(&g_f127a8);
    if (!v3)
    {
        v4 = (st_9d0488_0 *)(unsigned int)sub_a6bce8();
        if (!v4)
            return v4;
        v3 = sub_a6bf4c(24, "crypto/async/async.c", 42);
        if (!v3 || !(v3->field_8 = 0, *(unsigned int *)&v3->field_10 = 0, sub_a7bbe8(&g_f127a8, v3)))
        {
            sub_a6c2e4(v3, "crypto/async/async.c", 54);
            return 0;
        }
    }
    v5 = *a0;
    if (v5)
    {
        v3->field_8 = v5;
LABEL_9d055c:
        v6 = (st_9d0488_0 *)(&v5->field_18)[1];
        if (v6 == 1)
        {
            *a0 = v5;
            (&v3->field_8->field_18)[1] = 2;
            v3->field_8 = 0;
            return 2;
        }
        if (v6 != 2)
        {
            if (v6 == 3)
            {
                *a2 = v5->field_18;
                v5->field_1c = 0;
                sub_9d079c();
                v3->field_8 = 0;
                *a0 = 0;
                return 3;
            }
            sub_a368c8();
            sub_a369bc("crypto/async/async.c", 243, "ASYNC_start_job");
            v7 = 786691;
        }
        else
        {
            v8 = *a0;
            if (!v8)
                return 0;
            v3->field_8 = v8;
            if (sub_a68148(v8->field_20))
            {
                v9 = sub_a68148();
                v3->field_8->field_20 = v9;
                v10 = 0x66;
                v11 = 230;
            }
            else
            {
                v10 = 786691;
                v11 = 223;
            }
LABEL_9d0734:
            sub_a368c8();
            sub_a369bc("crypto/async/async.c", v11, "ASYNC_start_job");
            v7 = v10;
        }
        sub_a36abc(0x33, v7, 0);
        sub_9d079c(v3->field_8);
        v3->field_8 = 0;
        *a0 = 0;
        return 0;
    }
    v5 = v3->field_8;
    if (v5)
        goto LABEL_9d055c;
    v12 = sub_a7bbe0(&g_f127b0);
    if (!v12)
    {
        if (sub_9d089c())
        {
            v12 = sub_a7bbe0(&g_f127b0);
        }
        else
        {
            v3->field_8 = 0;
            return 1;
        }
    }
    v13 = sub_ad692c(v12->field_0);
    if (v13)
    {
        v3->field_8 = v13;
        if (a4 && n)
        {
            v14 = sub_a6bf4c(n, "crypto/async/async.c", 0x100);
            v13 = v3->field_8;
            v13->field_10 = v14;
            if (!v14)
            {
                sub_9d079c(v13);
                v3->field_8 = 0;
                return 0;
            }
            _memcpy(v14, a4, n);
        }
        else
        {
            v13->field_10 = 0;
        }
        v13->field_8 = a3;
        v13->field_1c = a1;
        sub_a67ad8(0);
        v10 = 0x66;
        v11 = 272;
        goto LABEL_9d0734;
    }
    else
    {
        if (!v12->field_10 || v12->field_10 > v12->field_8)
        {
            v15 = sub_a6bffc(48, "crypto/async/async.c", 82);
            if (v15)
            {
                (&v15->field_18)[1] = 0;
                sub_a6c2e4(v15->field_10, "crypto/async/async.c", 94);
                sub_a6c2e4(v15, "crypto/async/async.c", 96);
            }
        }
        v3->field_8 = 0;
        return 1;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48c84..0xa49054 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a48c84_1 {
    char padding_0[384];
    struct st_a48c84_2 *field_180;
} st_a48c84_1;

typedef struct st_a48c84_0 {
    char padding_0[40];
    unsigned long long field_28;
} st_a48c84_0;

typedef struct st_a48c84_2 {
    unsigned long long field_0;
} st_a48c84_2;

extern char g_10002b0;

unsigned long long sub_a48c84(st_a48c84_0 *a0, unsigned long long ptr, unsigned long long a2, unsigned long long n)
{
    unsigned long long v6;  // x23
    unsigned long long *v7;  // x21
    unsigned long long v16;  // 4112
    st_a48c84_1 *v8;  // x0
    unsigned long long v10;  // x8
    unsigned long long v11;  // x22
    st_a48c84_1 *v12;  // x0
    st_a48c84_1 *v14;  // x0
    unsigned long v0;  // [bp-0x70]
    char v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (n & 0xffffffffc0000007)
    {
LABEL_a48cb4:
        v6 = 0xffffffff;
    }
    else if (sub_a4d068(ptr, a2, n))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/e_des3.c", 397, "des_ede3_wrap_cipher");
        sub_a36abc(6, 162, 0);
        v6 = 0;
    }
    else if (!sub_a50720(a0))
    {
        if (n < 24)
            goto LABEL_a48cb4;
        if (ptr)
        {
            a0->field_28 = 369832251558649162;
            v7 = &a0->field_28;
            v8 = sub_9ffdd8(a0);
            if (v8->field_180)
                v8->field_180();
            sub_9fb9ac(a2, &v2, 8, v8, &v8->padding_0[128], &v8->padding_0[0x100], v7, sub_a50720(a0));
            if (ptr != a2)
            {
                v10 = a2;
            }
            else
            {
                _memmove(ptr, ptr + 8, n - 8);
                v10 = a2 - 8;
            }
            v11 = n - 16;
            sub_a48558(a0, ptr, v10 + 8, v11);
            v12 = sub_9ffdd8(a0);
            if (v12->field_180)
                v12->field_180();
            sub_9fb9ac(v10 + n - 8, &v1, 8, v12, &v12->padding_0[128], &v12->padding_0[0x100], v7, sub_a50720(a0));
            sub_9ec040(&v2, 0, 8);
            sub_9ec040(ptr, 0, v11);
            sub_9ec040(v7, &v1, 8);
            sub_a48558(a0, ptr, ptr, v11);
            v14 = sub_9ffdd8(a0);
            if (v14->field_180)
                v14->field_180();
            sub_9fb9ac(&v2, &v2, 8, v14, &v14->padding_0[128], &v14->padding_0[0x100], v7, sub_a50720(a0));
            if (sub_abe2cc(ptr, v11, &v0))
            {
                if (!sub_a66f20(&v0, &v2, 8))
                    v6 = v11 & 0xffffffff;
                else
                    v6 = 0xffffffff;
            }
            else
            {
                v6 = 0xffffffff;
            }
            sub_a66ec0(&v2, 8);
            sub_a66ec0(&v0, 20);
            sub_a66ec0(&v1, 8);
            sub_a66ec0(v7, 8);
            v16 = arm64g_calculate_condition(0x11, v6 & 0xffffffff, 1, 0);
            if (!(v16 & 1))
            {
                sub_a66ec0(ptr, v11);
                goto LABEL_a48cb4;
            }
        }
        else
        {
            v6 = (unsigned int)n - 16;
        }
    }
    else if (ptr)
    {
        _memmove(ptr + 8, a2, n);
        if (!sub_abe2cc(a2, n, &v0) || (*(unsigned long *)(ptr + n + 8) = v0, sub_a66ec0(&v0, 20), (int)sub_aa8830(&a0->field_28, 8) < 1))
            goto LABEL_a48cb4;
        *(unsigned long long *)ptr = a0->field_28;
        sub_a48558(a0, ptr + 8, ptr + 8, n + 8);
        v6 = n + 16;
        sub_9ec040(ptr, 0, v6);
        a0->field_28 = 369832251558649162;
        sub_a48558(a0, ptr, ptr, v6);
    }
    else
    {
        v6 = (unsigned int)n + 16;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}

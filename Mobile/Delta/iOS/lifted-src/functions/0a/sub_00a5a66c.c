/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5a66c..0xa5a8d8 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5a66c_0 {
    unsigned long long field_0;
    struct st_a5a66c_0 *field_8;
    char padding_10[232];
    struct st_a5a66c_0 *field_f8;
    struct st_a5a66c_0 *field_100;
} st_a5a66c_0;

extern char g_10002b0;

st_a5a66c_0 * sub_a5a66c(long long a0, st_a5a66c_0 *a1, unsigned long a2, unsigned long long a3, st_a5a66c_0 *a4, unsigned long a5, unsigned long a6, st_a5a66c_0 *a7)
{
    st_a5a66c_0 *v9;  // x0
    st_a5a66c_0 *v10;  // x19
    st_a5a66c_0 *v11;  // x8
    st_a5a66c_0 *v0;  // [bp-0xc8]
    st_a5a66c_0 *v1;  // [bp-0xc0]
    st_a5a66c_0 *v2;  // [bp-0xb0]
    st_a5a66c_0 *v3;  // [bp-0xa0]
    st_a5a66c_0 *v4;  // [bp-0x90]
    st_a5a66c_0 *v5;  // [bp-0x80]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v0 = 0;
    if (!a4)
    {
        v1 = 0;
        if (a1)
        {
            v9 = sub_9c5edc(&v1, a1, 0xffffffff);
            goto LABEL_a5a6f0;
        }
        else if ((unsigned int)a3)
        {
            v9 = sub_9c5df4(&v1, a3);
LABEL_a5a6f0:
        }
        else
        {
            v9 = 0;
        }
        sub_a32e7c(v1);
        if (v1 && v9)
            goto LABEL_a5a708;
        if (!a1)
            sub_a9976c(a3);
        v10 = sub_a5d168(a0);
        if (v10)
        {
            sub_a36c8c();
            if (sub_a5cf34(v10) == 1)
            {
                v4 = (st_a5a66c_0 *)0;
                v5 = (st_a5a66c_0 *)0;
                v2 = (st_a5a66c_0 *)0;
                v3 = (st_a5a66c_0 *)0;
                v1 = (st_a5a66c_0 *)0;
                sub_a36e70();
                sub_a71670();
                if (sub_a5cfb0(v10, &v0, 135, &v1) != 1)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/p_lib.c", 466, "new_raw_key_int");
                    sub_a36abc(6, 180, 0);
                }
                else
                {
                    sub_a5d6b0(v10);
                    if (*(long long *)&g_10002b0 == v6)
                        return v0;
                    ___stack_chk_fail(v0);
                }
            }
            else
            {
                sub_a36cd4();
LABEL_a5a70c:
                v0 = sub_a5ba1c();
                if (!v0)
                {
                    sub_c67dc4();
                }
                else if (sub_a5a8d8(v0, a4, a3, a1, 0xffffffff, 0))
                {
                    v11 = v0->field_8;
                    if (v11)
                    {
                        if (a7)
                        {
                            if (v11->field_f8)
                                v11->field_f8();
                            sub_c67e00();
                        }
                        else
                        {
                            if (v11->field_100)
                                v11->field_100();
                            sub_c67e70();
                        }
                    }
                }
            }
        }
        else
        {
            v0 = 0;
        }
        sub_a5a4c8(v0);
        v0 = 0;
        sub_a5d6b0(v10);
        if (*(long long *)&g_10002b0 == v6)
            return v0;
        ___stack_chk_fail(v0);
    }
    else
    {
LABEL_a5a708:
        v10 = 0;
        goto LABEL_a5a70c;
    }
}

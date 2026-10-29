/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a26b0..0x1a2804 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a26b0_1 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[12];
    long long field_20;
    struct st_1a26b0_1 *field_28;
} st_1a26b0_1;

typedef struct st_1a26b0_2 {
    struct st_1a26b0_0 *field_0;
} st_1a26b0_2;

typedef struct st_1a26b0_0 {
    char field_0;
} st_1a26b0_0;

extern char g_10002b0;

st_1a26b0_1 * sub_1a26b0(long long a0, long long a1)
{
    st_1a26b0_1 *v15;  // x0
    st_1a26b0_1 *v16;  // x20
    st_1a26b0_1 *v17;  // x20
    st_1a26b0_1 *v18;  // w0
    long long v19;  // x0
    st_1a26b0_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_1a26b0_0 *v1;  // [bp-0xd0]
    char v2;  // [bp-0xc8]
    st_1a26b0_1 *v3;  // [bp-0xc0]
    unsigned int v4;  // [bp-0xb8]
    st_1a26b0_1 *v5;  // [bp-0xb0]
    st_1a26b0_1 *v6;  // [bp-0xa0]
    st_1a26b0_0 **v7;  // [bp-0x90], Other Possible Types: char
    st_1a26b0_0 *v8;  // [bp-0x88], Other Possible Types: st_1a26b0_2 **
    char v9;  // [bp-0x80]
    char v10;  // [bp-0x60]
    unsigned int v11;  // [bp-0x40]
    unsigned long v12;  // [bp-0x38]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = (st_1a26b0_1 *)0;
    v5 = (st_1a26b0_1 *)0;
    v6 = (st_1a26b0_1 *)0;
    v4 = 1;
    if (_getaddrinfo(sub_a0c8(a1), "0", &v3, &v2))
    {
        v15 = 0;
        if (*(long long *)&g_10002b0 == v12)
            return 0;
    }
    else
    {
        v8 = &v2;
        sub_1a93cc(&v9, &v8, &v7);
        v7 = &v8;
        v8 = &v7;
        sub_159d9c(&v10, &v9);
        v11 = 1;
        sub_181a8(&v9);
        v16 = (st_1a26b0_1 *)v2;
        if (v16)
        {
            do
            {
                v17 = v16;
                v18 = (st_1a26b0_1 *)(unsigned int)_bind(a0, v17->field_20, v17->field_10);
                if (!v18)
                {
                    v15 = !v18;
                    goto LABEL_1a27c4;
                }
            } while ((v16 = v17->field_28, v17->field_28));
        }
        v15 = 0;
LABEL_1a27c4:
        sub_1b3f74(&v10);
        if (*(long long *)&g_10002b0 == v12)
            return v15;
    }
    v19 = __Unwind_Resume(___stack_chk_fail(v15));
    sub_1b3f74(&v10);
    __Unwind_Resume(v19);
}

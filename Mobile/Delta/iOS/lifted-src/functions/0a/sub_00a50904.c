/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50904..0xa509dc (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50904_0 {
    char padding_0[120];
    struct st_a50904_0 *field_78;
} st_a50904_0;

typedef struct st_a50904_1 {
    struct st_a50904_0 *field_0;
    char padding_8[96];
    struct st_a50904_0 *field_68;
    char padding_70[64];
    long long field_b0;
} st_a50904_1;

typedef struct st_a50904_2 {
    struct st_a50904_0 *field_0;
    char padding_8[64];
    unsigned long long field_48;
} st_a50904_2;

extern char g_10002b0;

st_a50904_0 * sub_a50904(st_a50904_1 *a0)
{
    st_a50904_0 *v9;  // x0
    st_a50904_2 *v10;  // x19
    char v0;  // [bp-0x88]
    st_a50904_0 *v1;  // [bp-0x80]
    st_a50904_0 *v2;  // [bp-0x70]
    st_a50904_0 *v3;  // [bp-0x60]
    st_a50904_0 *v4;  // [bp-0x50]
    st_a50904_0 *v5;  // [bp-0x40]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (a0->field_0)
    {
        v9 = (int)a0->field_68;
        v10 = &a0->field_68;
        if (0 >= (int)(unsigned int)v9 && a0->field_0->field_78)
        {
            v4 = (st_a50904_0 *)0;
            v5 = (st_a50904_0 *)0;
            v2 = (st_a50904_0 *)0;
            v3 = (st_a50904_0 *)0;
            v1 = (st_a50904_0 *)0;
            sub_a70ed8("keylen", &v0);
            if ((int)sub_a5262c(a0->field_0, a0->field_b0, &v1) >= 1 && sub_a6fc2c(&v1, v10))
            {
                v9 = v0;
                *(unsigned int *)&v10->field_0 = (unsigned int)v9;
            }
            else
            {
                v9 = 0xffffffff;
            }
        }
    }
    else
    {
        v9 = 0;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}

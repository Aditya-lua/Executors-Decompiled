/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3b8dc..0xa3ba94 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3b8dc_0 {
    struct st_a3b8dc_0 *field_0;
    char padding_8[8];
    unsigned int field_10;
    char padding_14[36];
    struct st_a3b8dc_0 *field_38;
} st_a3b8dc_0;

typedef struct st_a3b8dc_1 {
    struct st_a3b8dc_0 *field_0;
    char padding_8[108];
    unsigned int field_74;
} st_a3b8dc_1;

extern st_a3b8dc_0 g_a3aef4;
extern long long g_e91408;
extern char g_10002b0;

int sub_a3b8dc(st_a3b8dc_1 *a0, unsigned int a1, st_a3b8dc_0 *a2)
{
    st_a3b8dc_0 *v20;  // w8
    st_a3b8dc_0 *v21;  // x26
    st_a3b8dc_0 *v22;  // x28
    unsigned int v0;  // [bp-0x13c]
    unsigned int v1;  // [bp-0x138]
    st_a3b8dc_0 *v2;  // [bp-0x134]
    st_a3b8dc_0 *v3;  // [bp-0x130]
    st_a3b8dc_0 *v4;  // [bp-0x120]
    st_a3b8dc_0 *v5;  // [bp-0x118]
    st_a3b8dc_0 *v6;  // [bp-0x110]
    st_a3b8dc_0 *v7;  // [bp-0x100], Other Possible Types: st_a3b8dc_1 *
    unsigned int v8;  // [bp-0xf4]
    st_a3b8dc_0 *v9;  // [bp-0xf0]
    st_a3b8dc_0 *v10;  // [bp-0xe0]
    st_a3b8dc_0 *v11;  // [bp-0xd0]
    st_a3b8dc_0 *v12;  // [bp-0xc0]
    st_a3b8dc_0 *v13;  // [bp-0xb0]
    st_a3b8dc_0 *v14;  // [bp-0xa0]
    st_a3b8dc_0 *v15;  // [bp-0x90]
    st_a3b8dc_0 *v16;  // [bp-0x80]
    unsigned long v17;  // [bp-0x70]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v20 = (st_a3b8dc_0 *)(int)a0->field_0;
    if (!(int)a0->field_0)
        v20 = 0xffffffff;
    if (a2 && a2->field_0)
    {
        v15 = (st_a3b8dc_0 *)0;
        v16 = (st_a3b8dc_0 *)0;
        v13 = (st_a3b8dc_0 *)0;
        v14 = (st_a3b8dc_0 *)0;
        v11 = (st_a3b8dc_0 *)0;
        v12 = (st_a3b8dc_0 *)0;
        v9 = (st_a3b8dc_0 *)0;
        v10 = (st_a3b8dc_0 *)0;
        v7 = (st_a3b8dc_0 *)0;
        v4 = (st_a3b8dc_0 *)0;
        v6 = (st_a3b8dc_0 *)0;
        v3 = (st_a3b8dc_0 *)0;
        v0 = a0->field_74;
        v1 = a0->field_74;
        v2 = v20;
        v5 = a2->field_0;
        v21 = sub_a3bce0(&/* unsupported instruction */, &g_e91408, 86);
        if (v21)
        {
            if (!v21->field_38)
                v22 = &g_a3aef4.field_0;
            else
                v22 = v21->field_38;
            v8 = v21->field_10;
        }
        else
        {
            v22 = &g_a3aef4.field_0;
        }
        v7 = a0;
        v11 = a2;
        v22();
    }
    if (*(long long *)&g_10002b0 == v17)
        return 1;
    ___stack_chk_fail();
}

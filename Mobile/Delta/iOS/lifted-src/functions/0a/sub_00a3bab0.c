/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3bab0..0xa3bbe8 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3bab0_0 {
    struct st_a3bab0_0 *field_0;
    char padding_8[48];
    struct st_a3bab0_0 *field_38;
} st_a3bab0_0;

extern long long g_e92ab8;
extern char g_10002b0;

long long sub_a3bab0(unsigned long long a0, st_a3bab0_0 *a1)
{
    unsigned long v18;  // x19
    st_a3bab0_0 *v19;  // x0
    st_a3bab0_0 *v0;  // [bp-0x130], Other Possible Types: unsigned int
    st_a3bab0_0 *v1;  // [bp-0x120]
    st_a3bab0_0 *v2;  // [bp-0x110]
    st_a3bab0_0 *v3;  // [bp-0x108]
    st_a3bab0_0 *v4;  // [bp-0x100]
    st_a3bab0_0 *v5;  // [bp-0xf0]
    unsigned int v6;  // [bp-0xe8]
    st_a3bab0_0 *v7;  // [bp-0xe0]
    st_a3bab0_0 *v8;  // [bp-0xd0], Other Possible Types: unsigned long long
    st_a3bab0_0 *v9;  // [bp-0xc0]
    st_a3bab0_0 *v10;  // [bp-0xb0]
    st_a3bab0_0 *v11;  // [bp-0xa0]
    st_a3bab0_0 *v12;  // [bp-0x90]
    st_a3bab0_0 *v13;  // [bp-0x80]
    st_a3bab0_0 *v14;  // [bp-0x70]
    unsigned long v15;  // [bp-0x58]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    if (a1)
    {
        v18 = 1;
        if (a1->field_0)
        {
            v13 = (st_a3bab0_0 *)0;
            v14 = (st_a3bab0_0 *)0;
            v11 = (st_a3bab0_0 *)0;
            v12 = (st_a3bab0_0 *)0;
            v9 = (st_a3bab0_0 *)0;
            v10 = (st_a3bab0_0 *)0;
            v7 = (st_a3bab0_0 *)0;
            v8 = (st_a3bab0_0 *)0;
            v4 = (st_a3bab0_0 *)0;
            v5 = (st_a3bab0_0 *)0;
            v1 = (st_a3bab0_0 *)0;
            v2 = (st_a3bab0_0 *)0;
            v0 = (st_a3bab0_0 *)0;
            v0 = 1;
            v3 = a1->field_0;
            v19 = sub_a3bce0(&v0, &g_e92ab8, 41);
            if (v19)
            {
                v6 = (int)v19->field_0;
                v8 = a0;
                v9 = a1;
                if ((int)v19->field_0 == 1 && v19->field_38)
                    v19->field_38();
            }
            v18 = 0xfffffffe;
        }
    }
    else
    {
        v18 = 1;
    }
    if (*(long long *)&g_10002b0 == v15)
        return v18;
    ___stack_chk_fail();
}

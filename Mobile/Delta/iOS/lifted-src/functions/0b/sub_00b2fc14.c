/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2fc14..0xb2fd10 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2fc14_0 {
    char padding_0[72];
    struct st_b2fc14_0 *field_48;
} st_b2fc14_0;

extern char g_10002b0;

st_b2fc14_0 * sub_b2fc14(long long a0)
{
    st_b2fc14_0 *v8;  // x0
    st_b2fc14_0 *v9;  // x21
    long long *v10;  // x19
    unsigned long v11;  // x19
    long long v12;  // x0
    st_b2fc14_0 *v0;  // [bp-0x90]
    st_b2fc14_0 *v1;  // [bp-0x80]
    st_b2fc14_0 *v2;  // [bp-0x70]
    st_b2fc14_0 *v3;  // [bp-0x60]
    st_b2fc14_0 *v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    if (sub_a2f9e0())
    {
        v8 = sub_a6bffc(80, "providers/implementations/kdfs/pbkdf2.c", 76);
        if (v8)
        {
            v9 = v8;
            v10 = v8;
            *v10 = a0;
            v11 = v10 + 6;
            v3 = (st_b2fc14_0 *)0;
            v4 = (st_b2fc14_0 *)0;
            v1 = (st_b2fc14_0 *)0;
            v2 = (st_b2fc14_0 *)0;
            v0 = (st_b2fc14_0 *)0;
            v12 = sub_9f2aec(a0);
            sub_a71618("digest", "SHA1", 0);
            if (!sub_afe114(v11, &v0, v12))
                sub_afe028(v11);
            v8 = v9;
            *(unsigned long long *)&v9->padding_0[40] = 0x800;
            *(unsigned int *)&v9->field_48 = 0;
        }
    }
    else
    {
        v8 = 0;
    }
    if (*(long long *)&g_10002b0 == v5)
        return v8;
    ___stack_chk_fail();
}

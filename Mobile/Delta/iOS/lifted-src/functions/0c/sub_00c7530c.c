/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc7530c..0xc75418 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c7530c_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    struct st_c7530c_0 *field_a0;
} st_c7530c_0;

extern long long g_c14a18;
extern long long g_efbb18;

st_c7530c_0 * sub_c7530c(st_c7530c_0 *a0)
{
    st_c7530c_0 *v22;  // w8
    st_c7530c_0 *v23;  // w8
    char v0;  // [bp-0x170]
    uint128_t v1;  // [bp-0x160]
    uint128_t v2;  // [bp-0x150]
    uint128_t v3;  // [bp-0x140]
    uint128_t v4;  // [bp-0x130]
    uint128_t v5;  // [bp-0x120]
    uint128_t v6;  // [bp-0x110]
    uint128_t v7;  // [bp-0x100]
    uint128_t v8;  // [bp-0xf0]
    uint128_t v9;  // [bp-0xe0]
    uint128_t v10;  // [bp-0xd0]
    uint128_t v11;  // [bp-0xc0]
    uint128_t v12;  // [bp-0xb0]
    uint128_t v13;  // [bp-0xa0]
    uint128_t v14;  // [bp-0x90]
    uint128_t v15;  // [bp-0x80]
    uint128_t v16;  // [bp-0x70]
    uint128_t v17;  // [bp-0x60]
    uint128_t v18;  // [bp-0x50]
    uint128_t v19;  // [bp-0x40]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v22 = (st_c7530c_0 *)(char)a0->field_a0;
    if (v22)
    {
        if (v22 != 1)
            a0 = 0;
        return a0;
    }
    else
    {
        sub_c14af4(&v0);
        v23 = (st_c7530c_0 *)(char)a0->field_a0;
        v16 = a0->field_60;
        v17 = a0->field_70;
        v18 = a0->field_80;
        v19 = a0->field_90;
        v12 = a0->field_20;
        v13 = a0->field_30;
        v14 = a0->field_40;
        v15 = a0->field_50;
        v10 = a0->field_0;
        v11 = a0->field_10;
        a0->field_60 = v6;
        a0->field_70 = v7;
        a0->field_80 = v8;
        a0->field_90 = v9;
        a0->field_20 = v2;
        a0->field_30 = v3;
        a0->field_40 = v4;
        a0->field_50 = v5;
        a0->field_0 = v0;
        a0->field_10 = v1;
        *(char *)&a0->field_a0 = 1;
        if (v23 == 1)
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            _pthread_mutex_destroy(&v10);
            _pthread_cond_destroy(&v14);
        }
        else if (!v23)
        {
            sub_c5e690(a0, &g_c14a18);
        }
        else
        {
            sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_efbb18);
        }
        return a0;
    }
}

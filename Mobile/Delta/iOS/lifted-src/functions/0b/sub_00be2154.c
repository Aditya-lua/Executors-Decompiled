/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe2154..0xbe245c (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be2154_3 {
    struct st_be2154_1 *field_0;
    struct st_be2154_2 *field_8;
    struct st_be2154_4 *field_10;
} st_be2154_3;

typedef struct st_be2154_5 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_be2154_5;

typedef struct st_be2154_2 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38;
} st_be2154_2;

typedef struct st_be2154_0 {
    unsigned long long field_0;
} st_be2154_0;

typedef struct st_be2154_1 {
    struct st_be2154_0 *field_0;
} st_be2154_1;

typedef struct st_be2154_4 {
    char field_0;
} st_be2154_4;

extern unsigned long long g_1c;
extern char g_be21bc;
extern char g_e0680e;
extern long long g_efa5f8;
extern long long g_efa610;
extern long long g_efa628;

int sub_be2154(st_be2154_3 *a0, unsigned long a1, void* a2)
{
    unsigned long long v6;  // x9
    void* v7;  // x19
    st_be2154_2 *v8;  // x8
    unsigned long long v9;  // x20
    long long v10;  // x0
    st_be2154_5 *v11;  // x19
    long long v12;  // x0
    unsigned long long *v13;  // x21
    uint128_t v0;  // [bp-0x70]
    uint128_t v1;  // [bp-0x60]
    uint128_t v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *(long long *)a2;
    if (a1 & 1)
    {
        if (!v6)
        {
            v7 = a2 + 8;
            if ((long long)a2[8] == *(long long *)*(long long *)a0->field_0)
            {
                v8 = a0->field_8;
                v9 = v8->field_0;
                v8->field_0 = 12;
                if (v9 != 12)
                {
                    v0 = *(int128_t *)&(&v8->field_0)[1];
                    v1 = *(int128_t *)((char *)&v8->field_8 + 8);
                    v2 = *(int128_t *)((char *)&v8->field_18 + 8);
                    v3 = *(long long *)((char *)&v8->field_28 + 8);
                    sub_be245c(a2);
                    *(unsigned long long *)a2 = v9;
                    *(uint128_t *)v7 = v0;
                    *(uint128_t *)&v7[16] = v1;
                    *(uint128_t *)&v7[32] = v2;
                    *(unsigned long *)&v7[48] = v3;
                    return 1;
                }
                sub_c73c64(&g_efa628);
                sub_c73c64(&g_efa5f8);
                v10 = sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_efa610);
                g_1c = v7;
                v11 = __Unwind_Resume(v10, 40, &g_efa610);
                sub_be245c(&v0);
                v12 = sub_c73e0c(__Unwind_Resume(v11));
                *v13 = 12;
                v11->field_0 = v0;
                v11->field_10 = v1;
                v11->field_20 = v2;
                v11->field_30 = v3;
                __Unwind_Resume(v12);
            }
        }
        if (*(char *)a0->field_10 & 1)
            goto *((void *)(&(&g_be21bc)[4 * (&g_e0680e)[v6]]));
    }
    else if (v6 == 9 && 5 >= (char)a2[24] - 7)
    {
        goto *((void *)(sub_be2200 + *(char *)(*(long long *)(long long)a2[8] + 14706690) * 4));
    }
    return 2;
}

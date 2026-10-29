/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f63a4..0x9f6488 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f63a4_0 {
    unsigned long long field_0;
    struct st_9f63a4_0 *field_8;
    struct st_9f63a4_0 *field_10;
} st_9f63a4_0;

extern long long g_9f64e4;

st_9f63a4_0 * sub_9f63a4(unsigned long a0, st_9f63a4_0 *a1)
{
    st_9f63a4_0 *v2;  // x19
    st_9f63a4_0 *v3;  // x0
    st_9f63a4_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "crypto/ct/ct_log.c", 0x66);
    if (!v2)
        return v2;
    v2->field_0 = a0;
    if (!a1 || (v3 = sub_a6d9b4(a1, "crypto/ct/ct_log.c", 109), v2->field_8 = v3, v3))
    {
        v4 = sub_ad61b4();
        v2->field_10 = v4;
        if (v4)
            return v2;
        sub_a368c8();
        sub_a369bc("crypto/ct/ct_log.c", 116, "CTLOG_STORE_new_ex");
        sub_a36abc(50, 0x8000f, 0);
    }
    sub_a6c2e4();
    sub_ad6958(v2->field_10, &g_9f64e4);
    sub_a6c2e4(v2, "crypto/ct/ct_log.c", 0x88);
    return 0;
}

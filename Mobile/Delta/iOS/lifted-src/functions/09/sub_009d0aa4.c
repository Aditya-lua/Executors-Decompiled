/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d0aa4..0x9d0b98 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d0aa4_0 {
    struct st_9d0aa4_0 *field_0;
    char padding_8[8];
    long long field_10;
} st_9d0aa4_0;

extern long long g_f127a8;
extern long long g_f127b0;

unsigned long long sub_9d0aa4(void)
{
    st_9d0aa4_0 *v2;  // x0
    st_9d0aa4_0 *v3;  // x19
    st_9d0aa4_0 *i;  // x0
    unsigned long long v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a7bbe0(&g_f127b0);
    if (v2)
    {
        v3 = v2;
        if (v2->field_0)
        {
            i = sub_ad692c(v2->field_0);
            if (i)
            {
                do
                {
                    sub_a6c2e4(i->field_10, "crypto/async/async.c", 94);
                    sub_a6c2e4(i, "crypto/async/async.c", 96);
                    i = sub_ad692c(v3->field_0);
                } while (i);
            }
        }
        sub_ad6020(v3->field_0);
        sub_a6c2e4(v3, "crypto/async/async.c", 417);
        sub_a7bbe8(&g_f127b0, 0);
    }
    sub_c044();
    sub_a7bbe0(&g_f127a8);
    v5 = sub_a7bbe8(&g_f127a8, 0);
    if (!(unsigned int)v5)
        return v5;
    return sub_a6c2e4();
}

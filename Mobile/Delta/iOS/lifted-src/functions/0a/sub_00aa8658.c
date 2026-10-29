/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa8658..0xaa8778 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa8658_0 {
    char padding_0[8];
    struct st_aa8658_0 *field_8;
    char padding_10[8];
    struct st_aa8658_0 *field_18;
} st_aa8658_0;


st_aa8658_0 * sub_aa8658(long long a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    st_aa8658_0 *v2;  // x0
    st_aa8658_0 *v3;  // x23
    st_aa8658_0 *v4;  // x0
    st_aa8658_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_aa8344();
    if (v2)
    {
        v3 = v2;
        if (v3 != sub_aa96c8())
        {
            if (v3->field_8)
            {
                goto *((void *)(v3->field_8));
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/rand/rand_lib.c", 489, "RAND_bytes_ex");
                sub_a36abc(36, 101, 0);
                return 0xffffffff;
            }
        }
    }
    v4 = sub_a6820c(a0, 5);
    if (!v4)
    {
        return v4;
    }
    else if (!v4->field_18)
    {
        v5 = sub_aa8778(a0);
        if (!v5)
            return v5;
    }
}

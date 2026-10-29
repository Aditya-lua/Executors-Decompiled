/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b564..0x98b5e0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b564_1 {
    char padding_0[192];
    long long field_c0;
} st_98b564_1;

typedef struct st_98b564_0 {
    char padding_0[256];
    unsigned long long field_100;
} st_98b564_0;


st_98b564_0 * sub_98b564(st_98b564_0 *a0, unsigned long a1, unsigned long a2, st_98b564_1 *a3)
{
    st_98b564_0 *v2;  // x0
    st_98b564_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == 4)
    {
        v3 = sub_98952c(a3->field_c0);
        if (!v3)
            return v3;
        sub_989a10(a3->field_c0, v3);
    }
    else if (a0 == 5)
    {
        v2 = sub_98952c(a3->field_c0);
        if (!v2)
            return v2;
        v2->field_100 = v2->field_100 | 0x1000000000;
    }
    else
    {
        return a0;
    }
}

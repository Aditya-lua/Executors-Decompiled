/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7a600..0xa7a6c0 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7a600_0 {
    char padding_0[24];
    struct st_a7a600_1 *field_18;
} st_a7a600_0;

typedef struct st_a7a600_1 {
    unsigned long long field_0;
} st_a7a600_1;


long long * sub_a7a600(unsigned long a0, unsigned long a1)
{
    long long *v2;  // x0
    long long *v3;  // x20
    long long *v4;  // x0
    st_a7a600_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        return 0;
    }
    v3 = v2;
    v4 = sub_a7c17c(v2[4]);
    if (!(unsigned int)v4)
    {
        return v4;
    }
    else if ((int)sub_ad69e4(v3[2]) >= 1)
    {
        v5 = sub_ad69f8(v3[2], 0);
        v5->field_18();
    }
    else
    {
        sub_a7c1b4(v3[4]);
        return 1;
    }
}

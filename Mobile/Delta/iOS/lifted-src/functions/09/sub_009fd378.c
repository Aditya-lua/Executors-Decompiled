/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd378..0x9fd45c (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd378_0 {
    char padding_0[8];
    long long field_8;
} st_9fd378_0;


long long sub_9fd378(long long a0, st_9fd378_0 *a1, unsigned long long a2)
{
    long long v2;  // x0
    long long v3;  // x0
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a5ed4c(a1);
    v3 = sub_9ffb30(a1->field_8);
    if (v3)
    {
        v4 = v3;
        sub_9ffde8();
        sub_9ffe04(v4, ((unsigned int)a2 != 28) * 0x1000);
        if (sub_9fd724(v4, a0) && sub_9fd798(v4, a0, 1) && sub_a5ab14(v2, a2, v4))
            return 1;
        sub_9ffb3c(v4);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/dh/dh_ameth.c", 517, "dh_pkey_import_from_type");
        sub_a36abc(5, "\n", 0);
    }
    return 0;
}

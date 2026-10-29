/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d880..0x99d918 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99d880_0 {
    char padding_0[2920];
    long long field_b68;
} st_99d880_0;


long long sub_99d880(st_99d880_0 *a0, long long a1, unsigned long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        return 2;
    }
    else if (a0->field_b68)
    {
        if (sub_c68d5c(a1, 18, 2) && sub_c68d5c(a1, 0, 2))
            return 1;
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_clnt.c", 546, "tls_construct_ctos_sct");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    else
    {
        return 2;
    }
}

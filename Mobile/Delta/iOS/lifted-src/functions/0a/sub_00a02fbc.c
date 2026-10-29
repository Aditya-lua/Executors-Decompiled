/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02fbc..0xa03050 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02fbc_0 {
    char padding_0[136];
    long long field_88;
} st_a02fbc_0;


long long sub_a02fbc(st_a02fbc_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0->field_88)
    {
        sub_a368c8();
        sub_a369bc("crypto/dsa/dsa_pmeth.c", 245, "pkey_dsa_keygen");
        sub_a36abc(10, 107, 0);
        return 0;
    }
    v2 = sub_a01fc8();
    if (!v2)
        return 0;
    sub_a5ab14(a1, 116, v2);
    if (!sub_a59d8c(a1, a0->field_88))
        return 0;
    sub_a5ace4(a1);
}

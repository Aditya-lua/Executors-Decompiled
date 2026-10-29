/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3e7ac..0xb3e860 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3e7ac_0 {
    long long field_0;
    long long field_8;
    char padding_10[32];
    unsigned long long field_30;
} st_b3e7ac_0;


long long sub_b3e7ac(st_b3e7ac_0 *a0, long long a1)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_b3dc30(a0->field_0, a0->field_8, a1);
    if (!v2)
        return v2;
    if (!a0->field_30 || (v2 = v2, sub_a7f888()))
    {
        if (sub_a80554())
            return v2;
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ml_dsa_kmgmt.c", 481, "ml_dsa_gen");
        sub_a36abc(57, 121, 0);
    }
    sub_a7fabc(v2);
    return 0;
}

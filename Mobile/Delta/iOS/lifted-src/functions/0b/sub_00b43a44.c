/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43a44..0xb43ac4 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43a44_0 {
    char padding_0[8];
    long long field_8;
} st_b43a44_0;


st_b43a44_0 * sub_b43a44(long long *a0)
{
    st_b43a44_0 *v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a2f9e0())
    {
        v2 = sub_b439bc(*a0);
        if (!v2)
            return v2;
        if (sub_a4de68(v2->field_8, a0[1]) && sub_afde10(v2 + 1, a0 + 2))
            return v2;
        sub_a4bca0(v2->field_8);
        sub_afdddc(v2 + 1);
        sub_a6c2e4(v2, "providers/implementations/macs/gmac_prov.c", 54);
    }
    return 0;
}

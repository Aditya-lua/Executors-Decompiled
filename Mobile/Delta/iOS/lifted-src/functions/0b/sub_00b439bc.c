/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb439bc..0xb43a44 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b439bc_0 {
    unsigned long long field_0;
    struct st_b439bc_0 *field_8;
} st_b439bc_0;


st_b439bc_0 * sub_b439bc(unsigned long a0)
{
    st_b439bc_0 *v2;  // x0
    st_b439bc_0 *v3;  // x8
    st_b439bc_0 *v4;  // x0
    st_b439bc_0 *v5;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(40, "providers/implementations/macs/gmac_prov.c", 65);
    if (!v2)
        return v2;
    v3 = sub_a4bc70();
    v4 = v2;
    v4->field_8 = v3;
    if (v3)
    {
        v4->field_0 = a0;
        return v4;
    }
    v5 = v4;
    sub_a4bca0(0);
    sub_afdddc(v5 + 1);
    sub_a6c2e4(v5, "providers/implementations/macs/gmac_prov.c", 54);
    return 0;
}

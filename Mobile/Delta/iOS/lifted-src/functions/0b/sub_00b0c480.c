/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb0c480..0xb0c51c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b0c480_0 {
    char padding_0[120];
    unsigned long long field_78;
} st_b0c480_0;


int sub_b0c480(st_b0c480_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned int v2;  // w0
    unsigned long v3;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!v2)
        return v2;
    v3 = a0->field_78;
    *a2 = v3;
    if (!a3)
    {
        return 1;
    }
    else if (v3 > a3)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/digests/blake2_prov.c", 197, "blake2s256_internal_final");
        sub_a36abc(57, 218, 0);
        return 0;
    }
}

/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31dec..0xb31e48 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b31dec_0 {
    char padding_0[8];
    long long field_8;
} st_b31dec_0;


long long sub_b31dec(st_b31dec_0 *a0, long long a1)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a6c2e4(a0->field_8, "providers/implementations/kdfs/scrypt.c", 175);
    a0->field_8 = 0;
    if (a1)
    {
        v2 = sub_a6d9b4(a1, "providers/implementations/kdfs/scrypt.c", 178);
        a0->field_8 = v2;
        if (!v2)
            return v2;
    }
    return 1;
}

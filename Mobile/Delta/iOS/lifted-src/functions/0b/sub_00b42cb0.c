/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb42cb0..0xb42d68 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b42cb0_0 {
    char padding_0[241];
    char field_f1;
} st_b42cb0_0;


int sub_b42cb0(st_b42cb0_0 *a0, unsigned long a1, long long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
        return 0;
    }
    else if (!sub_b42e48(a0, a3))
    {
        return 0;
    }
    else if (a1)
    {
        if (!sub_b42fc4(a0, a1, a2))
            return 0;
    }
    else
    {
        if (!a0->field_f1)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/macs/blake2_mac_impl.c", 117, "blake2_mac_init");
            sub_a36abc(57, 114, 0);
            return 0;
        }
    }
}
